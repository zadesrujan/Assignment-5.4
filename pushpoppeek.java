package stackoperations;
//*here we cretaed pacakage as stackoperations which that organizes a set of related classes and interfaces
public class pushpoppeek {
//*public : members which can access as public
//*class : is a context of java that are used to create objects and to define object data types and methods.
//*declares a class called pushpoppeek.
		// TODO Auto-generated method stub
		private Node top=null;//top equal to null or empty
		private int length=0;//length equal to zero
		
		/**we use stack to show push pop and peek
		 * pop is used to remove the object at the top of the stack
		 * push is used to put an object o the top of the stack
		 * You can pop/push (enqueue/dequeue) and peek from either side but cannot access 
		 * Method : PUSH(int data)
		 * @param args
		 */
		
		public void push(int item){
			//public : it can be called from anywhere.
			//void : returns to no value.
			//push will first move the top element and then replace new element to the most
			//initializing item
			Node node=new Node(item);//we are taking an array of node to implement push
			if(top== null){//to get the length of the size of an array to push the elements
				top=node;//top equal to node
			}else{
				node.next=top;//node equal to top
				top=node;//top equals to node
			}
			length++;//increment
		}

		public int pop(){//to implement pop
			int result = -1;
			if(top!=null){//here to decreasing the length of array size to pop the elements
				result=top.data;//result equals to top data
				top=top.next;//top equals to next value or data
				length--;//decrement
			}
			return result;//returning result
		}
		
		public int peek(){//to implement peek 
			
			if(top==null){//top equals to null or empty
				return -1;//it shows element of which we want from by asking the size of an element
			}else{
				return top.data;//returing top most data
			}
		}
		
		/** Print all the elements of this Stack using toString() method**/
		@Override
		public String toString() {
			StringBuilder result = new StringBuilder();///
			Node temp=null;//temp equal to null or empty
			result.append("[");
			if(top!=null){//top not equals to null or empty
				for(temp=top;temp !=null;temp=temp.next){
					result.append(temp.data+" ");
				}
			}
			result.append("]");
			return result.toString();//returing result
		}
		
		public int size(){//initializing size
			return length;//returning lenghth
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			 //Here public is a access modifier which defines who can access this method
			   //Here static a keyword which identifies class related thing
			  //void is used to define return type of the method,void means method wont return any value
			  //main is name of method
			  //declares method String[]
			 //String[]args means arguments will be passed into main method and says that main() as parameter
			
			
			 pushpoppeek stack = new pushpoppeek();//initializing new class stack 
			System.out.println("Current Length Is ::"+stack.size());
			//system is used to return code
			   //Println is used to print text,adds input  and gives output
			stack.push(9);//initializing push value
			stack.push(8);//initializing push value
			stack.push(7);//initializing push value
			stack.push(6);//initializing push value
			System.out.println(stack);// this will call the toString() method
			System.out.println("Peek :: "+stack.peek());
			System.out.println("POP ::"+stack.pop());
			System.out.println("Current Length Is ::"+stack.size());
			System.out.println(stack);
			//success
			//system is used to return code
			   //Println is used to print text,adds input  and gives output
		}
		
		
		private class Node{//creating new private class Node
			private Node next=null;
			private int data = 2;//inserting data
			
			private Node(int value){//initializing value
				this.data=value;//data equal to value
			}
		}
	


	}


