// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeSQLPlanTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("ScanCost")
        public Long scanCost;

        @NameInMap("OutputSize")
        public Long outputSize;

        @NameInMap("InputSize")
        public Long inputSize;

        @NameInMap("State")
        public String state;

        @NameInMap("OperatorCost")
        public Long operatorCost;

        @NameInMap("OutputRows")
        public Long outputRows;

        @NameInMap("ScanSize")
        public Long scanSize;

        @NameInMap("ElapsedTime")
        public Long elapsedTime;

        @NameInMap("ScanRows")
        public Long scanRows;

        @NameInMap("PeakMemory")
        public Long peakMemory;

        @NameInMap("TaskId")
        public Integer taskId;

        @NameInMap("InputRows")
        public Long inputRows;

        public static DescribeSQLPlanTaskResponseBodyTaskList build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLPlanTaskResponseBodyTaskList self = new DescribeSQLPlanTaskResponseBodyTaskList();
            return TeaModel.build(map, self);
        }

        public DescribeSQLPlanTaskResponseBodyTaskList setScanCost(Long scanCost) {
            this.scanCost = scanCost;
            return this;
        }
        public Long getScanCost() {
            return this.scanCost;
        }

        public DescribeSQLPlanTaskResponseBodyTaskList setOutputSize(Long outputSize) {
            this.outputSize = outputSize;
            return this;
        }
        public Long getOutputSize() {
            return this.outputSize;
        }

        public DescribeSQLPlanTaskResponseBodyTaskList setInputSize(Long inputSize) {
            this.inputSize = inputSize;
            return this;
        }
        public Long getInputSize() {
            return this.inputSize;
        }

        public DescribeSQLPlanTaskResponseBodyTaskList setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
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

        public DescribeSQLPlanTaskResponseBodyTaskList setScanSize(Long scanSize) {
            this.scanSize = scanSize;
            return this;
        }
        public Long getScanSize() {
            return this.scanSize;
        }

        public DescribeSQLPlanTaskResponseBodyTaskList setElapsedTime(Long elapsedTime) {
            this.elapsedTime = elapsedTime;
            return this;
        }
        public Long getElapsedTime() {
            return this.elapsedTime;
        }

        public DescribeSQLPlanTaskResponseBodyTaskList setScanRows(Long scanRows) {
            this.scanRows = scanRows;
            return this;
        }
        public Long getScanRows() {
            return this.scanRows;
        }

        public DescribeSQLPlanTaskResponseBodyTaskList setPeakMemory(Long peakMemory) {
            this.peakMemory = peakMemory;
            return this;
        }
        public Long getPeakMemory() {
            return this.peakMemory;
        }

        public DescribeSQLPlanTaskResponseBodyTaskList setTaskId(Integer taskId) {
            this.taskId = taskId;
            return this;
        }
        public Integer getTaskId() {
            return this.taskId;
        }

        public DescribeSQLPlanTaskResponseBodyTaskList setInputRows(Long inputRows) {
            this.inputRows = inputRows;
            return this;
        }
        public Long getInputRows() {
            return this.inputRows;
        }

    }

}
