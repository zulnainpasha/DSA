class Solution {
    public int[] twoSum(int[] arr, int target) {
        int a[] = new int[2];
        for(int i = 0; i<=arr.length-1; i++){
            for(int j = i+1; j<=arr.length-1; j++){
                if(arr[i] + arr[j] == target){
                    a[0] = i;
                    a[1] = j;
                    return a;
                }
            }
        }
        return a;

        
    }
}