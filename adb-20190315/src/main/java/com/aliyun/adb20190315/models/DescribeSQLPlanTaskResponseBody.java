// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeSQLPlanTaskResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of tasks.</p>
     */
    @NameInMap("TaskList")
    public java.util.List<DescribeSQLPlanTaskResponseBodyTaskList> taskList;

    public static DescribeSQLPlanTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLPlanTaskResponseBody self = new DescribeSQLPlanTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSQLPlanTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSQLPlanTaskResponseBody setTaskList(java.util.List<DescribeSQLPlanTaskResponseBodyTaskList> taskList) {
        this.taskList = taskList;
        return this;
    }
    public java.util.List<DescribeSQLPlanTaskResponseBodyTaskList> getTaskList() {
        return this.taskList;
    }

    public static class DescribeSQLPlanTaskResponseBodyTaskList extends TeaModel {
        /**
         * <p>The time elapsed from when the task was created to when the task was complete. Unit: milliseconds.</p>
         */
        @NameInMap("ElapsedTime")
        public Long elapsedTime;

        /**
         * <p>The number of input rows in the task.</p>
         */
        @NameInMap("InputRows")
        public Long inputRows;

        /**
         * <p>The amount of input data in the task. Unit: bytes.</p>
         */
        @NameInMap("InputSize")
        public Long inputSize;

        /**
         * <p>The total amount of time consumed by operators in the task on a specific node. This parameter can be used to determine whether long tails occur in computing. Unit: milliseconds.</p>
         */
        @NameInMap("OperatorCost")
        public Long operatorCost;

        /**
         * <p>The number of output rows in the task.</p>
         */
        @NameInMap("OutputRows")
        public Long outputRows;

        /**
         * <p>The amount of output data in the task. Unit: bytes.</p>
         */
        @NameInMap("OutputSize")
        public Long outputSize;

        /**
         * <p>The peak memory of the task on a specific node. Unit: bytes.</p>
         */
        @NameInMap("PeakMemory")
        public Long peakMemory;

        /**
         * <p>The time consumed to scan data from a data source in the task. Unit: milliseconds.</p>
         */
        @NameInMap("ScanCost")
        public Long scanCost;

        /**
         * <p>The number of rows scanned from a data source in the task.</p>
         */
        @NameInMap("ScanRows")
        public Long scanRows;

        /**
         * <p>The amount of data scanned from a data source in the task. Unit: bytes.</p>
         */
        @NameInMap("ScanSize")
        public Long scanSize;

        /**
         * <p>The final execution status of the task. Valid values:</p>
         * <br>
         * <p>*   FINISHED</p>
         * <p>*   CANCELED</p>
         * <p>*   ABORTED</p>
         * <p>*   FAILED</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The ID of the task.</p>
         */
        @NameInMap("TaskId")
        public Integer taskId;

        public static DescribeSQLPlanTaskResponseBodyTaskList build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLPlanTaskResponseBodyTaskList self = new DescribeSQLPlanTaskResponseBodyTaskList();
            return TeaModel.build(map, self);
        }

        public DescribeSQLPlanTaskResponseBodyTaskList setElapsedTime(Long elapsedTime) {
            this.elapsedTime = elapsedTime;
            return this;
        }
        public Long getElapsedTime() {
            return this.elapsedTime;
        }

        public DescribeSQLPlanTaskResponseBodyTaskList setInputRows(Long inputRows) {
            this.inputRows = inputRows;
            return this;
        }
        public Long getInputRows() {
            return this.inputRows;
        }

        public DescribeSQLPlanTaskResponseBodyTaskList setInputSize(Long inputSize) {
            this.inputSize = inputSize;
            return this;
        }
        public Long getInputSize() {
            return this.inputSize;
        }

        public DescribeSQLPlanTaskResponseBodyTaskList setOperatorCost(Long operatorCost) {
            this.operatorCost = operatorCost;
            return this;
        }
        public Long getOperatorCost() {
            return this.operatorCost;
        }

        public DescribeSQLPlanTaskResponseBodyTaskList setOutputRows(Long outputRows) {
            this.outputRows = outputRows;
            return this;
        }
        public Long getOutputRows() {
            return this.outputRows;
        }

        public DescribeSQLPlanTaskResponseBodyTaskList setOutputSize(Long outputSize) {
            this.outputSize = outputSize;
            return this;
        }
        public Long getOutputSize() {
            return this.outputSize;
        }

        public DescribeSQLPlanTaskResponseBodyTaskList setPeakMemory(Long peakMemory) {
            this.peakMemory = peakMemory;
            return this;
        }
        public Long getPeakMemory() {
            return this.peakMemory;
        }

        public DescribeSQLPlanTaskResponseBodyTaskList setScanCost(Long scanCost) {
            this.scanCost = scanCost;
            return this;
        }
        public Long getScanCost() {
            return this.scanCost;
        }

        public DescribeSQLPlanTaskResponseBodyTaskList setScanRows(Long scanRows) {
            this.scanRows = scanRows;
            return this;
        }
        public Long getScanRows() {
            return this.scanRows;
        }

        public DescribeSQLPlanTaskResponseBodyTaskList setScanSize(Long scanSize) {
            this.scanSize = scanSize;
            return this;
        }
        public Long getScanSize() {
            return this.scanSize;
        }

        public DescribeSQLPlanTaskResponseBodyTaskList setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeSQLPlanTaskResponseBodyTaskList setTaskId(Integer taskId) {
            this.taskId = taskId;
            return this;
        }
        public Integer getTaskId() {
            return this.taskId;
        }

    }

}
