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
     * <p>The actual effective page number after normalization. This value may not be equal to the input parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The actual effective number of entries per page after normalization. This value may not be equal to the input parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The unique identifier of the request. It is used for troubleshooting and log tracing.</p>
     * 
     * <strong>example:</strong>
     * <p>1EBD0C05-6C1F-4C95-9C63-B7AB7B5A9C8E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of scan tasks that meet the filter conditions within the last 366 days.</p>
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
         * <p>The creation time of the task. The value is a millisecond timestamp (Unix epoch in milliseconds).</p>
         * 
         * <strong>example:</strong>
         * <p>1735689600000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The end time of the task. The value is a millisecond timestamp (Unix epoch in milliseconds). If the task has not ended, the value is null.</p>
         * 
         * <strong>example:</strong>
         * <p>1735689600000</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The number of samples that have been executed for the task.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("ExecuteCaseCount")
        public Long executeCaseCount;

        /**
         * <p>The report language.</p>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        @NameInMap("ReportLanguage")
        public String reportLanguage;

        /**
         * <p>The risk level of the task result. If the task is not completed or no risk assessment is generated, the value is null.</p>
         * 
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("RiskLevel")
        public String riskLevel;

        /**
         * <p>The sample language.</p>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        @NameInMap("SampleLanguage")
        public String sampleLanguage;

        /**
         * <p>The detection intensity of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("SampleLevel")
        public Long sampleLevel;

        /**
         * <p>The scan mode of the task. For historical tasks that do not have a recorded scan mode, the value is normalized to attack.</p>
         * 
         * <strong>example:</strong>
         * <p>attack</p>
         */
        @NameInMap("ScanType")
        public String scanType;

        /**
         * <p>The unique identifier of the scan task. It can be used to download results and track status.</p>
         * 
         * <strong>example:</strong>
         * <p>task-abc123def4567</p>
         */
        @NameInMap("ScannerTaskId")
        public String scannerTaskId;

        /**
         * <p>The task message. If the task fails, this parameter indicates the cause of the failure. If the task succeeds or no message is available, this parameter is empty.</p>
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
         * <p>The actual execution mode used by the scan task, which is obtained from the scannerType field of the task. classic indicates the sample mode. agent indicates the autonomous multi-round attack mode of the agent. executor is a historical compatibility value, which is equivalent to classic.</p>
         * 
         * <strong>example:</strong>
         * <p>classic</p>
         */
        @NameInMap("ScannerType")
        public String scannerType;

        /**
         * <p>The start time of the task. The value is a millisecond timestamp (Unix epoch in milliseconds). If the task has not started, the value is null.</p>
         * 
         * <strong>example:</strong>
         * <p>1735689600000</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The name of the task. If no name is specified during creation, the default value is Target Scan - target name.</p>
         * 
         * <strong>example:</strong>
         * <p>Target Scan - My Model Studio target</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        /**
         * <p>The total number of samples planned to be executed for the task.</p>
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

        public ListScanTasksByTargetResponseBodyData setReportLanguage(String reportLanguage) {
            this.reportLanguage = reportLanguage;
            return this;
        }
        public String getReportLanguage() {
            return this.reportLanguage;
        }

        public ListScanTasksByTargetResponseBodyData setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public ListScanTasksByTargetResponseBodyData setSampleLanguage(String sampleLanguage) {
            this.sampleLanguage = sampleLanguage;
            return this;
        }
        public String getSampleLanguage() {
            return this.sampleLanguage;
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

        public ListScanTasksByTargetResponseBodyData setScannerType(String scannerType) {
            this.scannerType = scannerType;
            return this;
        }
        public String getScannerType() {
            return this.scannerType;
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
