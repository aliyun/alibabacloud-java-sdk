// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeDiagnosisTasksResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskList")
    public java.util.List<DescribeDiagnosisTasksResponseBodyTaskList> taskList;

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
        @NameInMap("ComputeTimeRatio")
        public String computeTimeRatio;

        @NameInMap("Drivers")
        public String drivers;

        @NameInMap("ElapsedTime")
        public Long elapsedTime;

        @NameInMap("InputDataSize")
        public Long inputDataSize;

        @NameInMap("InputRows")
        public Long inputRows;

        @NameInMap("OperatorCost")
        public Long operatorCost;

        @NameInMap("OutputDataSize")
        public Long outputDataSize;

        @NameInMap("OutputRows")
        public Long outputRows;

        @NameInMap("PeakMemory")
        public Long peakMemory;

        @NameInMap("QueuedTime")
        public String queuedTime;

        @NameInMap("ScanCost")
        public Long scanCost;

        @NameInMap("ScanDataSize")
        public Long scanDataSize;

        @NameInMap("ScanRows")
        public Long scanRows;

        @NameInMap("State")
        public String state;

        @NameInMap("TaskCreateTime")
        public Long taskCreateTime;

        @NameInMap("TaskEndTime")
        public Long taskEndTime;

        @NameInMap("TaskHost")
        public String taskHost;

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
