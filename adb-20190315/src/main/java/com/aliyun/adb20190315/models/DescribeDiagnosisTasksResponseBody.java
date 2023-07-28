// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeDiagnosisTasksResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The queried tasks.</p>
     */
    @NameInMap("TaskList")
    public java.util.List<DescribeDiagnosisTasksResponseBodyTaskList> taskList;

    /**
     * <p>The total number of tasks in the stage.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeDiagnosisTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiagnosisTasksResponseBody self = new DescribeDiagnosisTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDiagnosisTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDiagnosisTasksResponseBody setTaskList(java.util.List<DescribeDiagnosisTasksResponseBodyTaskList> taskList) {
        this.taskList = taskList;
        return this;
    }
    public java.util.List<DescribeDiagnosisTasksResponseBodyTaskList> getTaskList() {
        return this.taskList;
    }

    public DescribeDiagnosisTasksResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDiagnosisTasksResponseBodyTaskList extends TeaModel {
        /**
         * <p>The compute time ratio, which can be used to determine whether the task is really time-consuming. This parameter can be calculated by using the following formula: OperatorCost/Drivers/ElapsedTime. A greater value indicates that the task was executed for computing for most of the task time. A less value indicates that the task was waiting for scheduling or blocked due to other reasons for most of the task time.</p>
         */
        @NameInMap("ComputeTimeRatio")
        public String computeTimeRatio;

        /**
         * <p>The number of tasks that can be executed concurrently.</p>
         */
        @NameInMap("Drivers")
        public String drivers;

        /**
         * <p>The amount of time that elapsed from when the task was created to when the task was completed. Unit: milliseconds.</p>
         */
        @NameInMap("ElapsedTime")
        public Long elapsedTime;

        /**
         * <p>The amount of input data in the task. Unit: bytes.</p>
         */
        @NameInMap("InputDataSize")
        public Long inputDataSize;

        /**
         * <p>The number of input rows in the task.</p>
         */
        @NameInMap("InputRows")
        public Long inputRows;

        /**
         * <p>The total amount of time that is consumed by all operators in the task on a node. This parameter can be used to determine whether long tails occur in computing. Unit: milliseconds.</p>
         */
        @NameInMap("OperatorCost")
        public Long operatorCost;

        /**
         * <p>The amount of output data in the task. Unit: bytes.</p>
         */
        @NameInMap("OutputDataSize")
        public Long outputDataSize;

        /**
         * <p>The number of output rows in the task.</p>
         */
        @NameInMap("OutputRows")
        public Long outputRows;

        /**
         * <p>The peak memory of the task. Unit: bytes.</p>
         */
        @NameInMap("PeakMemory")
        public Long peakMemory;

        /**
         * <p>The queuing duration of the task. Unit: milliseconds.</p>
         */
        @NameInMap("QueuedTime")
        public String queuedTime;

        /**
         * <p>The amount of time that is consumed to scan data from a data source in the task. Unit: milliseconds.</p>
         */
        @NameInMap("ScanCost")
        public Long scanCost;

        /**
         * <p>The amount of scanned data in the task. Unit: bytes.</p>
         */
        @NameInMap("ScanDataSize")
        public Long scanDataSize;

        /**
         * <p>The number of rows that are scanned from a data source in the task.</p>
         */
        @NameInMap("ScanRows")
        public Long scanRows;

        /**
         * <p>The final execution state of the task. Valid values:</p>
         * <br>
         * <p>*   FINISHED</p>
         * <p>*   CANCELED</p>
         * <p>*   ABORTED</p>
         * <p>*   FAILED</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The timestamp when the task was created.</p>
         */
        @NameInMap("TaskCreateTime")
        public Long taskCreateTime;

        /**
         * <p>The timestamp when the task ends.</p>
         */
        @NameInMap("TaskEndTime")
        public Long taskEndTime;

        /**
         * <p>The IP address of the host where the task was executed.</p>
         */
        @NameInMap("TaskHost")
        public String taskHost;

        /**
         * <p>The task ID.</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static DescribeDiagnosisTasksResponseBodyTaskList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDiagnosisTasksResponseBodyTaskList self = new DescribeDiagnosisTasksResponseBodyTaskList();
            return TeaModel.build(map, self);
        }

        public DescribeDiagnosisTasksResponseBodyTaskList setComputeTimeRatio(String computeTimeRatio) {
            this.computeTimeRatio = computeTimeRatio;
            return this;
        }
        public String getComputeTimeRatio() {
            return this.computeTimeRatio;
        }

        public DescribeDiagnosisTasksResponseBodyTaskList setDrivers(String drivers) {
            this.drivers = drivers;
            return this;
        }
        public String getDrivers() {
            return this.drivers;
        }

        public DescribeDiagnosisTasksResponseBodyTaskList setElapsedTime(Long elapsedTime) {
            this.elapsedTime = elapsedTime;
            return this;
        }
        public Long getElapsedTime() {
            return this.elapsedTime;
        }

        public DescribeDiagnosisTasksResponseBodyTaskList setInputDataSize(Long inputDataSize) {
            this.inputDataSize = inputDataSize;
            return this;
        }
        public Long getInputDataSize() {
            return this.inputDataSize;
        }

        public DescribeDiagnosisTasksResponseBodyTaskList setInputRows(Long inputRows) {
            this.inputRows = inputRows;
            return this;
        }
        public Long getInputRows() {
            return this.inputRows;
        }

        public DescribeDiagnosisTasksResponseBodyTaskList setOperatorCost(Long operatorCost) {
            this.operatorCost = operatorCost;
            return this;
        }
        public Long getOperatorCost() {
            return this.operatorCost;
        }

        public DescribeDiagnosisTasksResponseBodyTaskList setOutputDataSize(Long outputDataSize) {
            this.outputDataSize = outputDataSize;
            return this;
        }
        public Long getOutputDataSize() {
            return this.outputDataSize;
        }

        public DescribeDiagnosisTasksResponseBodyTaskList setOutputRows(Long outputRows) {
            this.outputRows = outputRows;
            return this;
        }
        public Long getOutputRows() {
            return this.outputRows;
        }

        public DescribeDiagnosisTasksResponseBodyTaskList setPeakMemory(Long peakMemory) {
            this.peakMemory = peakMemory;
            return this;
        }
        public Long getPeakMemory() {
            return this.peakMemory;
        }

        public DescribeDiagnosisTasksResponseBodyTaskList setQueuedTime(String queuedTime) {
            this.queuedTime = queuedTime;
            return this;
        }
        public String getQueuedTime() {
            return this.queuedTime;
        }

        public DescribeDiagnosisTasksResponseBodyTaskList setScanCost(Long scanCost) {
            this.scanCost = scanCost;
            return this;
        }
        public Long getScanCost() {
            return this.scanCost;
        }

        public DescribeDiagnosisTasksResponseBodyTaskList setScanDataSize(Long scanDataSize) {
            this.scanDataSize = scanDataSize;
            return this;
        }
        public Long getScanDataSize() {
            return this.scanDataSize;
        }

        public DescribeDiagnosisTasksResponseBodyTaskList setScanRows(Long scanRows) {
            this.scanRows = scanRows;
            return this;
        }
        public Long getScanRows() {
            return this.scanRows;
        }

        public DescribeDiagnosisTasksResponseBodyTaskList setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeDiagnosisTasksResponseBodyTaskList setTaskCreateTime(Long taskCreateTime) {
            this.taskCreateTime = taskCreateTime;
            return this;
        }
        public Long getTaskCreateTime() {
            return this.taskCreateTime;
        }

        public DescribeDiagnosisTasksResponseBodyTaskList setTaskEndTime(Long taskEndTime) {
            this.taskEndTime = taskEndTime;
            return this;
        }
        public Long getTaskEndTime() {
            return this.taskEndTime;
        }

        public DescribeDiagnosisTasksResponseBodyTaskList setTaskHost(String taskHost) {
            this.taskHost = taskHost;
            return this;
        }
        public String getTaskHost() {
            return this.taskHost;
        }

        public DescribeDiagnosisTasksResponseBodyTaskList setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
