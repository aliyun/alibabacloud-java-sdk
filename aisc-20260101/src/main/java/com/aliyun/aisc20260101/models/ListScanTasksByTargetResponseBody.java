// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisc20260101.models;

import com.aliyun.tea.*;

public class ListScanTasksByTargetResponseBody extends TeaModel {
    /**
     * <p>The list of scan tasks on the current page.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListScanTasksByTargetResponseBodyData> data;

    /**
     * <p>The normalized page number that actually takes effect. This value may differ from the input parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The normalized number of entries per page that actually takes effect. This value may differ from the input parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The unique identifier of the request, used for troubleshooting and log tracing.</p>
     * 
     * <strong>example:</strong>
     * <p>1EBD0C05-6C1F-4C95-9C63-B7AB7B5A9C8E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of scan tasks that match the filter conditions within the last 366-day window.</p>
     * 
     * <strong>example:</strong>
     * <p>42</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListScanTasksByTargetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListScanTasksByTargetResponseBody self = new ListScanTasksByTargetResponseBody();
        return TeaModel.build(map, self);
    }

    public ListScanTasksByTargetResponseBody setData(java.util.List<ListScanTasksByTargetResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListScanTasksByTargetResponseBodyData> getData() {
        return this.data;
    }

    public ListScanTasksByTargetResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListScanTasksByTargetResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListScanTasksByTargetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListScanTasksByTargetResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListScanTasksByTargetResponseBodyData extends TeaModel {
        /**
         * <p>The task creation time, in milliseconds (Unix epoch milliseconds).</p>
         * 
         * <strong>example:</strong>
         * <p>1735689600000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The task end time, in milliseconds (Unix epoch milliseconds). This value is null if the task has not ended.</p>
         * 
         * <strong>example:</strong>
         * <p>1735689600000</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The number of samples that the task has executed.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("ExecuteCaseCount")
        public Long executeCaseCount;

        /**
         * <p>The risk level of the task result. This value is null if the task is not completed or no risk assessment has been generated.</p>
         * 
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("RiskLevel")
        public String riskLevel;

        /**
         * <p>The detection intensity of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("SampleLevel")
        public Long sampleLevel;

        /**
         * <p>The scan type of the task. Historical tasks without a recorded scan type are normalized to attack.</p>
         * 
         * <strong>example:</strong>
         * <p>attack</p>
         */
        @NameInMap("ScanType")
        public String scanType;

        /**
         * <p>The unique identifier of the scan task. You can use this ID for result download and status tracking.</p>
         * 
         * <strong>example:</strong>
         * <p>task-abc123def4567</p>
         */
        @NameInMap("ScannerTaskId")
        public String scannerTaskId;

        /**
         * <p>The task message. This value contains the failure reason if the task failed, or is empty if the task succeeded or no message is available.</p>
         * 
         * <strong>example:</strong>
         * <p>Execution timed out</p>
         */
        @NameInMap("ScannerTaskMessage")
        public String scannerTaskMessage;

        /**
         * <p>The current status of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>completed</p>
         */
        @NameInMap("ScannerTaskStatus")
        public String scannerTaskStatus;

        /**
         * <p>The task start time, in milliseconds (Unix epoch milliseconds). This value is null if the task has not started.</p>
         * 
         * <strong>example:</strong>
         * <p>1735689600000</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The task name. If no name is specified during creation, the default value is &quot;Target Scan - target name&quot;.</p>
         * 
         * <strong>example:</strong>
         * <p>Target Scan - My Bailian Target</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        /**
         * <p>The total number of samples that the task plans to execute.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("TotalCaseCount")
        public Long totalCaseCount;

        public static ListScanTasksByTargetResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListScanTasksByTargetResponseBodyData self = new ListScanTasksByTargetResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListScanTasksByTargetResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListScanTasksByTargetResponseBodyData setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ListScanTasksByTargetResponseBodyData setExecuteCaseCount(Long executeCaseCount) {
            this.executeCaseCount = executeCaseCount;
            return this;
        }
        public Long getExecuteCaseCount() {
            return this.executeCaseCount;
        }

        public ListScanTasksByTargetResponseBodyData setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public ListScanTasksByTargetResponseBodyData setSampleLevel(Long sampleLevel) {
            this.sampleLevel = sampleLevel;
            return this;
        }
        public Long getSampleLevel() {
            return this.sampleLevel;
        }

        public ListScanTasksByTargetResponseBodyData setScanType(String scanType) {
            this.scanType = scanType;
            return this;
        }
        public String getScanType() {
            return this.scanType;
        }

        public ListScanTasksByTargetResponseBodyData setScannerTaskId(String scannerTaskId) {
            this.scannerTaskId = scannerTaskId;
            return this;
        }
        public String getScannerTaskId() {
            return this.scannerTaskId;
        }

        public ListScanTasksByTargetResponseBodyData setScannerTaskMessage(String scannerTaskMessage) {
            this.scannerTaskMessage = scannerTaskMessage;
            return this;
        }
        public String getScannerTaskMessage() {
            return this.scannerTaskMessage;
        }

        public ListScanTasksByTargetResponseBodyData setScannerTaskStatus(String scannerTaskStatus) {
            this.scannerTaskStatus = scannerTaskStatus;
            return this;
        }
        public String getScannerTaskStatus() {
            return this.scannerTaskStatus;
        }

        public ListScanTasksByTargetResponseBodyData setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ListScanTasksByTargetResponseBodyData setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public ListScanTasksByTargetResponseBodyData setTotalCaseCount(Long totalCaseCount) {
            this.totalCaseCount = totalCaseCount;
            return this;
        }
        public Long getTotalCaseCount() {
            return this.totalCaseCount;
        }

    }

}
