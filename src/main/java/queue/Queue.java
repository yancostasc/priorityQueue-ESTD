package queue;

public class Queue {

	public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.enqueueWithPriority(12,4);
        priorityQueue.enqueueWithPriority(1,1);
        priorityQueue.enqueueWithPriority(2,2);
        priorityQueue.enqueueWithPriority(3,3);
        priorityQueue.enqueueWithPriority(4,4);
        priorityQueue.enqueueWithPriority(5,5);

        //Array to string
        priorityQueue.a();

        System.out.println();
        System.out.println("Fila prioritária: " + priorityQueue);
        priorityQueue.dequeue();
        priorityQueue.dequeue();
        priorityQueue.dequeue();
        System.out.println();

        System.out.println("Fila prioritária: " + priorityQueue);
	}

}
