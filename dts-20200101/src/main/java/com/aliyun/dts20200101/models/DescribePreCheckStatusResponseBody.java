// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribePreCheckStatusResponseBody extends TeaModel {
    @NameInMap("AnalysisJobProgress")
    public java.util.List<DescribePreCheckStatusResponseBodyAnalysisJobProgress> analysisJobProgress;

    /**
     * <p>The task code that indicates the subtask type. Valid values:</p>
     * <br>
     * <p>*   **01**: precheck</p>
     * <p>*   **02**: schema migration or initial schema synchronization</p>
     * <p>*   **03**: full data migration or initial full data synchronization</p>
     * <p>*   **04**: incremental data migration or synchronization</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorAnalysisItem")
    public Integer errorAnalysisItem;

    /**
     * <p>The total number of subtask failures.</p>
     */
    @NameInMap("ErrorItem")
    public Integer errorItem;

    @NameInMap("FullNetCheckJobStatus")
    public java.util.List<DescribePreCheckStatusResponseBodyFullNetCheckJobStatus> fullNetCheckJobStatus;

    /**
     * <p>The HTTP status code.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The ID of the data migration or synchronization task.</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The name of the subtask.</p>
     */
    @NameInMap("JobName")
    public String jobName;

    /**
     * <p>The list of subtasks and the progress of each subtask.</p>
     */
    @NameInMap("JobProgress")
    public java.util.List<DescribePreCheckStatusResponseBodyJobProgress> jobProgress;

    @NameInMap("NetworkDiagnosisResult")
    public DescribePreCheckStatusResponseBodyNetworkDiagnosisResult networkDiagnosisResult;

    /**
     * <p>The number of the page returned. The value is an integer that is greater than **0** and does not exceed the maximum value of the Integer data type. Default value: **1**.</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageRecordCount")
    public Long pageRecordCount;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the subtask. Valid values:</p>
     * <br>
     * <p>*   **NotStarted**: The subtask is not started.</p>
     * <p>*   **Suspending**: The subtask is paused.</p>
     * <p>*   **Checking**: The subtask is being checked.</p>
     * <p>*   **Migrating**: The subtask is in progress. Data is being migrated.</p>
     * <p>*   **Failed**: The subtask failed.</p>
     * <p>*   **Catched**: The subtask is in progress. Incremental data is being migrated or synchronized.</p>
     * <p>*   **Finished**: The subtask is complete.</p>
     */
    @NameInMap("State")
    public String state;

    /**
     * <p>The state of the distributed subtask.</p>
     */
    @NameInMap("SubDistributedJobStatus")
    public java.util.List<DescribePreCheckStatusResponseBodySubDistributedJobStatus> subDistributedJobStatus;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of subtasks.</p>
     */
    @NameInMap("Total")
    public Integer total;

    /**
     * <p>The total number of returned records.</p>
     */
    @NameInMap("TotalRecordCount")
    public Long totalRecordCount;

    public static DescribePreCheckStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePreCheckStatusResponseBody self = new DescribePreCheckStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePreCheckStatusResponseBody setAnalysisJobProgress(java.util.List<DescribePreCheckStatusResponseBodyAnalysisJobProgress> analysisJobProgress) {
        this.analysisJobProgress = analysisJobProgress;
        return this;
    }
    public java.util.List<DescribePreCheckStatusResponseBodyAnalysisJobProgress> getAnalysisJobProgress() {
        return this.analysisJobProgress;
    }

    public DescribePreCheckStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribePreCheckStatusResponseBody setErrorAnalysisItem(Integer errorAnalysisItem) {
        this.errorAnalysisItem = errorAnalysisItem;
        return this;
    }
    public Integer getErrorAnalysisItem() {
        return this.errorAnalysisItem;
    }

    public DescribePreCheckStatusResponseBody setErrorItem(Integer errorItem) {
        this.errorItem = errorItem;
        return this;
    }
    public Integer getErrorItem() {
        return this.errorItem;
    }

    public DescribePreCheckStatusResponseBody setFullNetCheckJobStatus(java.util.List<DescribePreCheckStatusResponseBodyFullNetCheckJobStatus> fullNetCheckJobStatus) {
        this.fullNetCheckJobStatus = fullNetCheckJobStatus;
        return this;
    }
    public java.util.List<DescribePreCheckStatusResponseBodyFullNetCheckJobStatus> getFullNetCheckJobStatus() {
        return this.fullNetCheckJobStatus;
    }

    public DescribePreCheckStatusResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribePreCheckStatusResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public DescribePreCheckStatusResponseBody setJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }
    public String getJobName() {
        return this.jobName;
    }

    public DescribePreCheckStatusResponseBody setJobProgress(java.util.List<DescribePreCheckStatusResponseBodyJobProgress> jobProgress) {
        this.jobProgress = jobProgress;
        return this;
    }
    public java.util.List<DescribePreCheckStatusResponseBodyJobProgress> getJobProgress() {
        return this.jobProgress;
    }

    public DescribePreCheckStatusResponseBody setNetworkDiagnosisResult(DescribePreCheckStatusResponseBodyNetworkDiagnosisResult networkDiagnosisResult) {
        this.networkDiagnosisResult = networkDiagnosisResult;
        return this;
    }
    public DescribePreCheckStatusResponseBodyNetworkDiagnosisResult getNetworkDiagnosisResult() {
        return this.networkDiagnosisResult;
    }

    public DescribePreCheckStatusResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribePreCheckStatusResponseBody setPageRecordCount(Long pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Long getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribePreCheckStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePreCheckStatusResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public DescribePreCheckStatusResponseBody setSubDistributedJobStatus(java.util.List<DescribePreCheckStatusResponseBodySubDistributedJobStatus> subDistributedJobStatus) {
        this.subDistributedJobStatus = subDistributedJobStatus;
        return this;
    }
    public java.util.List<DescribePreCheckStatusResponseBodySubDistributedJobStatus> getSubDistributedJobStatus() {
        return this.subDistributedJobStatus;
    }

    public DescribePreCheckStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribePreCheckStatusResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public DescribePreCheckStatusResponseBody setTotalRecordCount(Long totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Long getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribePreCheckStatusResponseBodyAnalysisJobProgressLogs extends TeaModel {
        @NameInMap("ErrData")
        public String errData;

        @NameInMap("ErrMsg")
        public String errMsg;

        @NameInMap("ErrType")
        public String errType;

        @NameInMap("LogLevel")
        public String logLevel;

        public static DescribePreCheckStatusResponseBodyAnalysisJobProgressLogs build(java.util.Map<String, ?> map) throws Exception {
            DescribePreCheckStatusResponseBodyAnalysisJobProgressLogs self = new DescribePreCheckStatusResponseBodyAnalysisJobProgressLogs();
            return TeaModel.build(map, self);
        }

        public DescribePreCheckStatusResponseBodyAnalysisJobProgressLogs setErrData(String errData) {
            this.errData = errData;
            return this;
        }
        public String getErrData() {
            return this.errData;
        }

        public DescribePreCheckStatusResponseBodyAnalysisJobProgressLogs setErrMsg(String errMsg) {
            this.errMsg = errMsg;
            return this;
        }
        public String getErrMsg() {
            return this.errMsg;
        }

        public DescribePreCheckStatusResponseBodyAnalysisJobProgressLogs setErrType(String errType) {
            this.errType = errType;
            return this;
        }
        public String getErrType() {
            return this.errType;
        }

        public DescribePreCheckStatusResponseBodyAnalysisJobProgressLogs setLogLevel(String logLevel) {
            this.logLevel = logLevel;
            return this;
        }
        public String getLogLevel() {
            return this.logLevel;
        }

    }

    public static class DescribePreCheckStatusResponseBodyAnalysisJobProgress extends TeaModel {
        @NameInMap("BootTime")
        public String bootTime;

        @NameInMap("CanSkip")
        public Boolean canSkip;

        @NameInMap("Current")
        public String current;

        @NameInMap("DdlSql")
        public String ddlSql;

        @NameInMap("DelaySeconds")
        public Integer delaySeconds;

        @NameInMap("DestSchema")
        public String destSchema;

        @NameInMap("DiffRow")
        public Long diffRow;

        @NameInMap("ErrDetail")
        public String errDetail;

        @NameInMap("ErrMsg")
        public String errMsg;

        @NameInMap("FinishTime")
        public String finishTime;

        @NameInMap("Id")
        public String id;

        @NameInMap("IgnoreFlag")
        public String ignoreFlag;

        @NameInMap("Item")
        public String item;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("Logs")
        public java.util.List<DescribePreCheckStatusResponseBodyAnalysisJobProgressLogs> logs;

        @NameInMap("Names")
        public String names;

        @NameInMap("OrderNum")
        public Integer orderNum;

        @NameInMap("ParentObj")
        public String parentObj;

        @NameInMap("RepairMethod")
        public String repairMethod;

        @NameInMap("Skip")
        public Boolean skip;

        @NameInMap("SourceSchema")
        public String sourceSchema;

        @NameInMap("State")
        public String state;

        @NameInMap("Sub")
        public String sub;

        @NameInMap("TargetNames")
        public String targetNames;

        @NameInMap("Total")
        public Integer total;

        public static DescribePreCheckStatusResponseBodyAnalysisJobProgress build(java.util.Map<String, ?> map) throws Exception {
            DescribePreCheckStatusResponseBodyAnalysisJobProgress self = new DescribePreCheckStatusResponseBodyAnalysisJobProgress();
            return TeaModel.build(map, self);
        }

        public DescribePreCheckStatusResponseBodyAnalysisJobProgress setBootTime(String bootTime) {
            this.bootTime = bootTime;
            return this;
        }
        public String getBootTime() {
            return this.bootTime;
        }

        public DescribePreCheckStatusResponseBodyAnalysisJobProgress setCanSkip(Boolean canSkip) {
            this.canSkip = canSkip;
            return this;
        }
        public Boolean getCanSkip() {
            return this.canSkip;
        }

        public DescribePreCheckStatusResponseBodyAnalysisJobProgress setCurrent(String current) {
            this.current = current;
            return this;
        }
        public String getCurrent() {
            return this.current;
        }

        public DescribePreCheckStatusResponseBodyAnalysisJobProgress setDdlSql(String ddlSql) {
            this.ddlSql = ddlSql;
            return this;
        }
        public String getDdlSql() {
            return this.ddlSql;
        }

        public DescribePreCheckStatusResponseBodyAnalysisJobProgress setDelaySeconds(Integer delaySeconds) {
            this.delaySeconds = delaySeconds;
            return this;
        }
        public Integer getDelaySeconds() {
            return this.delaySeconds;
        }

        public DescribePreCheckStatusResponseBodyAnalysisJobProgress setDestSchema(String destSchema) {
            this.destSchema = destSchema;
            return this;
        }
        public String getDestSchema() {
            return this.destSchema;
        }

        public DescribePreCheckStatusResponseBodyAnalysisJobProgress setDiffRow(Long diffRow) {
            this.diffRow = diffRow;
            return this;
        }
        public Long getDiffRow() {
            return this.diffRow;
        }

        public DescribePreCheckStatusResponseBodyAnalysisJobProgress setErrDetail(String errDetail) {
            this.errDetail = errDetail;
            return this;
        }
        public String getErrDetail() {
            return this.errDetail;
        }

        public DescribePreCheckStatusResponseBodyAnalysisJobProgress setErrMsg(String errMsg) {
            this.errMsg = errMsg;
            return this;
        }
        public String getErrMsg() {
            return this.errMsg;
        }

        public DescribePreCheckStatusResponseBodyAnalysisJobProgress setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public DescribePreCheckStatusResponseBodyAnalysisJobProgress setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribePreCheckStatusResponseBodyAnalysisJobProgress setIgnoreFlag(String ignoreFlag) {
            this.ignoreFlag = ignoreFlag;
            return this;
        }
        public String getIgnoreFlag() {
            return this.ignoreFlag;
        }

        public DescribePreCheckStatusResponseBodyAnalysisJobProgress setItem(String item) {
            this.item = item;
            return this;
        }
        public String getItem() {
            return this.item;
        }

        public DescribePreCheckStatusResponseBodyAnalysisJobProgress setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public DescribePreCheckStatusResponseBodyAnalysisJobProgress setLogs(java.util.List<DescribePreCheckStatusResponseBodyAnalysisJobProgressLogs> logs) {
            this.logs = logs;
            return this;
        }
        public java.util.List<DescribePreCheckStatusResponseBodyAnalysisJobProgressLogs> getLogs() {
            return this.logs;
        }

        public DescribePreCheckStatusResponseBodyAnalysisJobProgress setNames(String names) {
            this.names = names;
            return this;
        }
        public String getNames() {
            return this.names;
        }

        public DescribePreCheckStatusResponseBodyAnalysisJobProgress setOrderNum(Integer orderNum) {
            this.orderNum = orderNum;
            return this;
        }
        public Integer getOrderNum() {
            return this.orderNum;
        }

        public DescribePreCheckStatusResponseBodyAnalysisJobProgress setParentObj(String parentObj) {
            this.parentObj = parentObj;
            return this;
        }
        public String getParentObj() {
            return this.parentObj;
        }

        public DescribePreCheckStatusResponseBodyAnalysisJobProgress setRepairMethod(String repairMethod) {
            this.repairMethod = repairMethod;
            return this;
        }
        public String getRepairMethod() {
            return this.repairMethod;
        }

        public DescribePreCheckStatusResponseBodyAnalysisJobProgress setSkip(Boolean skip) {
            this.skip = skip;
            return this;
        }
        public Boolean getSkip() {
            return this.skip;
        }

        public DescribePreCheckStatusResponseBodyAnalysisJobProgress setSourceSchema(String sourceSchema) {
            this.sourceSchema = sourceSchema;
            return this;
        }
        public String getSourceSchema() {
            return this.sourceSchema;
        }

        public DescribePreCheckStatusResponseBodyAnalysisJobProgress setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribePreCheckStatusResponseBodyAnalysisJobProgress setSub(String sub) {
            this.sub = sub;
            return this;
        }
        public String getSub() {
            return this.sub;
        }

        public DescribePreCheckStatusResponseBodyAnalysisJobProgress setTargetNames(String targetNames) {
            this.targetNames = targetNames;
            return this;
        }
        public String getTargetNames() {
            return this.targetNames;
        }

        public DescribePreCheckStatusResponseBodyAnalysisJobProgress setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

    public static class DescribePreCheckStatusResponseBodyFullNetCheckJobStatusJobProgressLogs extends TeaModel {
        @NameInMap("ErrData")
        public String errData;

        @NameInMap("ErrMsg")
        public String errMsg;

        @NameInMap("ErrType")
        public String errType;

        @NameInMap("LogLevel")
        public String logLevel;

        public static DescribePreCheckStatusResponseBodyFullNetCheckJobStatusJobProgressLogs build(java.util.Map<String, ?> map) throws Exception {
            DescribePreCheckStatusResponseBodyFullNetCheckJobStatusJobProgressLogs self = new DescribePreCheckStatusResponseBodyFullNetCheckJobStatusJobProgressLogs();
            return TeaModel.build(map, self);
        }

        public DescribePreCheckStatusResponseBodyFullNetCheckJobStatusJobProgressLogs setErrData(String errData) {
            this.errData = errData;
            return this;
        }
        public String getErrData() {
            return this.errData;
        }

        public DescribePreCheckStatusResponseBodyFullNetCheckJobStatusJobProgressLogs setErrMsg(String errMsg) {
            this.errMsg = errMsg;
            return this;
        }
        public String getErrMsg() {
            return this.errMsg;
        }

        public DescribePreCheckStatusResponseBodyFullNetCheckJobStatusJobProgressLogs setErrType(String errType) {
            this.errType = errType;
            return this;
        }
        public String getErrType() {
            return this.errType;
        }

        public DescribePreCheckStatusResponseBodyFullNetCheckJobStatusJobProgressLogs setLogLevel(String logLevel) {
            this.logLevel = logLevel;
            return this;
        }
        public String getLogLevel() {
            return this.logLevel;
        }

    }

    public static class DescribePreCheckStatusResponseBodyFullNetCheckJobStatusJobProgress extends TeaModel {
        @NameInMap("BootTime")
        public String bootTime;

        @NameInMap("CanSkip")
        public Boolean canSkip;

        @NameInMap("Current")
        public String current;

        @NameInMap("DdlSql")
        public String ddlSql;

        @NameInMap("DelaySeconds")
        public Integer delaySeconds;

        @NameInMap("DestSchema")
        public String destSchema;

        @NameInMap("DiffRow")
        public Long diffRow;

        @NameInMap("ErrDetail")
        public String errDetail;

        @NameInMap("ErrMsg")
        public String errMsg;

        @NameInMap("FinishTime")
        public String finishTime;

        @NameInMap("Id")
        public String id;

        @NameInMap("IgnoreFlag")
        public String ignoreFlag;

        @NameInMap("Item")
        public String item;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("Logs")
        public java.util.List<DescribePreCheckStatusResponseBodyFullNetCheckJobStatusJobProgressLogs> logs;

        @NameInMap("Names")
        public String names;

        @NameInMap("OrderNum")
        public Integer orderNum;

        @NameInMap("ParentObj")
        public String parentObj;

        @NameInMap("RepairMethod")
        public String repairMethod;

        @NameInMap("Skip")
        public Boolean skip;

        @NameInMap("SourceSchema")
        public String sourceSchema;

        @NameInMap("State")
        public String state;

        @NameInMap("Sub")
        public String sub;

        @NameInMap("TargetNames")
        public String targetNames;

        @NameInMap("Total")
        public Integer total;

        public static DescribePreCheckStatusResponseBodyFullNetCheckJobStatusJobProgress build(java.util.Map<String, ?> map) throws Exception {
            DescribePreCheckStatusResponseBodyFullNetCheckJobStatusJobProgress self = new DescribePreCheckStatusResponseBodyFullNetCheckJobStatusJobProgress();
            return TeaModel.build(map, self);
        }

        public DescribePreCheckStatusResponseBodyFullNetCheckJobStatusJobProgress setBootTime(String bootTime) {
            this.bootTime = bootTime;
            return this;
        }
        public String getBootTime() {
            return this.bootTime;
        }

        public DescribePreCheckStatusResponseBodyFullNetCheckJobStatusJobProgress setCanSkip(Boolean canSkip) {
            this.canSkip = canSkip;
            return this;
        }
        public Boolean getCanSkip() {
            return this.canSkip;
        }

        public DescribePreCheckStatusResponseBodyFullNetCheckJobStatusJobProgress setCurrent(String current) {
            this.current = current;
            return this;
        }
        public String getCurrent() {
            return this.current;
        }

        public DescribePreCheckStatusResponseBodyFullNetCheckJobStatusJobProgress setDdlSql(String ddlSql) {
            this.ddlSql = ddlSql;
            return this;
        }
        public String getDdlSql() {
            return this.ddlSql;
        }

        public DescribePreCheckStatusResponseBodyFullNetCheckJobStatusJobProgress setDelaySeconds(Integer delaySeconds) {
            this.delaySeconds = delaySeconds;
            return this;
        }
        public Integer getDelaySeconds() {
            return this.delaySeconds;
        }

        public DescribePreCheckStatusResponseBodyFullNetCheckJobStatusJobProgress setDestSchema(String destSchema) {
            this.destSchema = destSchema;
            return this;
        }
        public String getDestSchema() {
            return this.destSchema;
        }

        public DescribePreCheckStatusResponseBodyFullNetCheckJobStatusJobProgress setDiffRow(Long diffRow) {
            this.diffRow = diffRow;
            return this;
        }
        public Long getDiffRow() {
            return this.diffRow;
        }

        public DescribePreCheckStatusResponseBodyFullNetCheckJobStatusJobProgress setErrDetail(String errDetail) {
            this.errDetail = errDetail;
            return this;
        }
        public String getErrDetail() {
            return this.errDetail;
        }

        public DescribePreCheckStatusResponseBodyFullNetCheckJobStatusJobProgress setErrMsg(String errMsg) {
            this.errMsg = errMsg;
            return this;
        }
        public String getErrMsg() {
            return this.errMsg;
        }

        public DescribePreCheckStatusResponseBodyFullNetCheckJobStatusJobProgress setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public DescribePreCheckStatusResponseBodyFullNetCheckJobStatusJobProgress setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribePreCheckStatusResponseBodyFullNetCheckJobStatusJobProgress setIgnoreFlag(String ignoreFlag) {
            this.ignoreFlag = ignoreFlag;
            return this;
        }
        public String getIgnoreFlag() {
            return this.ignoreFlag;
        }

        public DescribePreCheckStatusResponseBodyFullNetCheckJobStatusJobProgress setItem(String item) {
            this.item = item;
            return this;
        }
        public String getItem() {
            return this.item;
        }

        public DescribePreCheckStatusResponseBodyFullNetCheckJobStatusJobProgress setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public DescribePreCheckStatusResponseBodyFullNetCheckJobStatusJobProgress setLogs(java.util.List<DescribePreCheckStatusResponseBodyFullNetCheckJobStatusJobProgressLogs> logs) {
            this.logs = logs;
            return this;
        }
        public java.util.List<DescribePreCheckStatusResponseBodyFullNetCheckJobStatusJobProgressLogs> getLogs() {
            return this.logs;
        }

        public DescribePreCheckStatusResponseBodyFullNetCheckJobStatusJobProgress setNames(String names) {
            this.names = names;
            return this;
        }
        public String getNames() {
            return this.names;
        }

        public DescribePreCheckStatusResponseBodyFullNetCheckJobStatusJobProgress setOrderNum(Integer orderNum) {
            this.orderNum = orderNum;
            return this;
        }
        public Integer getOrderNum() {
            return this.orderNum;
        }

        public DescribePreCheckStatusResponseBodyFullNetCheckJobStatusJobProgress setParentObj(String parentObj) {
            this.parentObj = parentObj;
            return this;
        }
        public String getParentObj() {
            return this.parentObj;
        }

        public DescribePreCheckStatusResponseBodyFullNetCheckJobStatusJobProgress setRepairMethod(String repairMethod) {
            this.repairMethod = repairMethod;
            return this;
        }
        public String getRepairMethod() {
            return this.repairMethod;
        }

        public DescribePreCheckStatusResponseBodyFullNetCheckJobStatusJobProgress setSkip(Boolean skip) {
            this.skip = skip;
            return this;
        }
        public Boolean getSkip() {
            return this.skip;
        }

        public DescribePreCheckStatusResponseBodyFullNetCheckJobStatusJobProgress setSourceSchema(String sourceSchema) {
            this.sourceSchema = sourceSchema;
            return this;
        }
        public String getSourceSchema() {
            return this.sourceSchema;
        }

        public DescribePreCheckStatusResponseBodyFullNetCheckJobStatusJobProgress setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribePreCheckStatusResponseBodyFullNetCheckJobStatusJobProgress setSub(String sub) {
            this.sub = sub;
            return this;
        }
        public String getSub() {
            return this.sub;
        }

        public DescribePreCheckStatusResponseBodyFullNetCheckJobStatusJobProgress setTargetNames(String targetNames) {
            this.targetNames = targetNames;
            return this;
        }
        public String getTargetNames() {
            return this.targetNames;
        }

        public DescribePreCheckStatusResponseBodyFullNetCheckJobStatusJobProgress setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

    public static class DescribePreCheckStatusResponseBodyFullNetCheckJobStatus extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("DestRegion")
        public String destRegion;

        @NameInMap("DestRegionCidr")
        public String destRegionCidr;

        @NameInMap("DestinationEndpointType")
        public String destinationEndpointType;

        @NameInMap("ErrorItem")
        public Integer errorItem;

        @NameInMap("HostRegion")
        public String hostRegion;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("JobName")
        public String jobName;

        @NameInMap("JobProgress")
        public java.util.List<DescribePreCheckStatusResponseBodyFullNetCheckJobStatusJobProgress> jobProgress;

        @NameInMap("SourceEndpointType")
        public String sourceEndpointType;

        @NameInMap("SrcRegion")
        public String srcRegion;

        @NameInMap("SrcRegionCidr")
        public String srcRegionCidr;

        @NameInMap("State")
        public String state;

        @NameInMap("Total")
        public Integer total;

        public static DescribePreCheckStatusResponseBodyFullNetCheckJobStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribePreCheckStatusResponseBodyFullNetCheckJobStatus self = new DescribePreCheckStatusResponseBodyFullNetCheckJobStatus();
            return TeaModel.build(map, self);
        }

        public DescribePreCheckStatusResponseBodyFullNetCheckJobStatus setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribePreCheckStatusResponseBodyFullNetCheckJobStatus setDestRegion(String destRegion) {
            this.destRegion = destRegion;
            return this;
        }
        public String getDestRegion() {
            return this.destRegion;
        }

        public DescribePreCheckStatusResponseBodyFullNetCheckJobStatus setDestRegionCidr(String destRegionCidr) {
            this.destRegionCidr = destRegionCidr;
            return this;
        }
        public String getDestRegionCidr() {
            return this.destRegionCidr;
        }

        public DescribePreCheckStatusResponseBodyFullNetCheckJobStatus setDestinationEndpointType(String destinationEndpointType) {
            this.destinationEndpointType = destinationEndpointType;
            return this;
        }
        public String getDestinationEndpointType() {
            return this.destinationEndpointType;
        }

        public DescribePreCheckStatusResponseBodyFullNetCheckJobStatus setErrorItem(Integer errorItem) {
            this.errorItem = errorItem;
            return this;
        }
        public Integer getErrorItem() {
            return this.errorItem;
        }

        public DescribePreCheckStatusResponseBodyFullNetCheckJobStatus setHostRegion(String hostRegion) {
            this.hostRegion = hostRegion;
            return this;
        }
        public String getHostRegion() {
            return this.hostRegion;
        }

        public DescribePreCheckStatusResponseBodyFullNetCheckJobStatus setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public DescribePreCheckStatusResponseBodyFullNetCheckJobStatus setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public DescribePreCheckStatusResponseBodyFullNetCheckJobStatus setJobProgress(java.util.List<DescribePreCheckStatusResponseBodyFullNetCheckJobStatusJobProgress> jobProgress) {
            this.jobProgress = jobProgress;
            return this;
        }
        public java.util.List<DescribePreCheckStatusResponseBodyFullNetCheckJobStatusJobProgress> getJobProgress() {
            return this.jobProgress;
        }

        public DescribePreCheckStatusResponseBodyFullNetCheckJobStatus setSourceEndpointType(String sourceEndpointType) {
            this.sourceEndpointType = sourceEndpointType;
            return this;
        }
        public String getSourceEndpointType() {
            return this.sourceEndpointType;
        }

        public DescribePreCheckStatusResponseBodyFullNetCheckJobStatus setSrcRegion(String srcRegion) {
            this.srcRegion = srcRegion;
            return this;
        }
        public String getSrcRegion() {
            return this.srcRegion;
        }

        public DescribePreCheckStatusResponseBodyFullNetCheckJobStatus setSrcRegionCidr(String srcRegionCidr) {
            this.srcRegionCidr = srcRegionCidr;
            return this;
        }
        public String getSrcRegionCidr() {
            return this.srcRegionCidr;
        }

        public DescribePreCheckStatusResponseBodyFullNetCheckJobStatus setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribePreCheckStatusResponseBodyFullNetCheckJobStatus setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

    public static class DescribePreCheckStatusResponseBodyJobProgressLogs extends TeaModel {
        /**
         * <p>The error message.</p>
         */
        @NameInMap("ErrData")
        public String errData;

        /**
         * <p>The error message returned when an error occurs on the subtask.</p>
         */
        @NameInMap("ErrMsg")
        public String errMsg;

        /**
         * <p>The error type.</p>
         */
        @NameInMap("ErrType")
        public String errType;

        /**
         * <p>The level of logs.</p>
         */
        @NameInMap("LogLevel")
        public String logLevel;

        public static DescribePreCheckStatusResponseBodyJobProgressLogs build(java.util.Map<String, ?> map) throws Exception {
            DescribePreCheckStatusResponseBodyJobProgressLogs self = new DescribePreCheckStatusResponseBodyJobProgressLogs();
            return TeaModel.build(map, self);
        }

        public DescribePreCheckStatusResponseBodyJobProgressLogs setErrData(String errData) {
            this.errData = errData;
            return this;
        }
        public String getErrData() {
            return this.errData;
        }

        public DescribePreCheckStatusResponseBodyJobProgressLogs setErrMsg(String errMsg) {
            this.errMsg = errMsg;
            return this;
        }
        public String getErrMsg() {
            return this.errMsg;
        }

        public DescribePreCheckStatusResponseBodyJobProgressLogs setErrType(String errType) {
            this.errType = errType;
            return this;
        }
        public String getErrType() {
            return this.errType;
        }

        public DescribePreCheckStatusResponseBodyJobProgressLogs setLogLevel(String logLevel) {
            this.logLevel = logLevel;
            return this;
        }
        public String getLogLevel() {
            return this.logLevel;
        }

    }

    public static class DescribePreCheckStatusResponseBodyJobProgress extends TeaModel {
        /**
         * <p>The time when the subtask was started. The time is displayed in the yyyy-MM-ddTHH:mm:ssZ format in UTC.</p>
         */
        @NameInMap("BootTime")
        public String bootTime;

        /**
         * <p>Indicates whether the subtask can be ignored if it fails.</p>
         */
        @NameInMap("CanSkip")
        public Boolean canSkip;

        /**
         * <p>The number of the subtasks that are running.</p>
         */
        @NameInMap("Current")
        public String current;

        /**
         * <p>The DDL statements.</p>
         */
        @NameInMap("DdlSql")
        public String ddlSql;

        /**
         * <p>The latency of incremental data migration or synchronization.</p>
         * <br>
         * <p>>  For data migration tasks, the unit of this parameter is milliseconds. For data synchronization tasks, the unit of this parameter is seconds.</p>
         */
        @NameInMap("DelaySeconds")
        public Integer delaySeconds;

        /**
         * <p>The name of the database to which the object in the destination instance belongs.</p>
         */
        @NameInMap("DestSchema")
        public String destSchema;

        /**
         * <p>This parameter will be removed in the future.</p>
         */
        @NameInMap("DiffRow")
        public Long diffRow;

        /**
         * <p>The error details of the subtask failure.</p>
         */
        @NameInMap("ErrDetail")
        public String errDetail;

        /**
         * <p>The error message of the subtask failure.</p>
         */
        @NameInMap("ErrMsg")
        public String errMsg;

        /**
         * <p>The time when the subtask was complete. The time is displayed in the yyyy-MM-ddTHH:mm:ssZ format in UTC.</p>
         */
        @NameInMap("FinishTime")
        public String finishTime;

        /**
         * <p>The ID recorded in the metadatabase.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>Indicates whether DTS ignores the subtask and proceeds with the next subtask. Valid values:</p>
         * <br>
         * <p>*   **N**: no</p>
         * <p>*   **Y**: yes</p>
         */
        @NameInMap("IgnoreFlag")
        public String ignoreFlag;

        /**
         * <p>The shortened name of the subtask.</p>
         */
        @NameInMap("Item")
        public String item;

        /**
         * <p>The ID of the subtask.</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The logs of subtask failures.</p>
         */
        @NameInMap("Logs")
        public java.util.List<DescribePreCheckStatusResponseBodyJobProgressLogs> logs;

        /**
         * <p>The name of the subtask.</p>
         */
        @NameInMap("Names")
        public String names;

        /**
         * <p>The serial number of the subtask.</p>
         */
        @NameInMap("OrderNum")
        public Integer orderNum;

        /**
         * <p>This parameter will be removed in the future.</p>
         */
        @NameInMap("ParentObj")
        public String parentObj;

        /**
         * <p>The method to fix the subtask failure.</p>
         */
        @NameInMap("RepairMethod")
        public String repairMethod;

        /**
         * <p>Indicates whether the subtask is ignored if it fails. Valid values:</p>
         * <br>
         * <p>*   **true**: yes</p>
         * <p>*   **false**: no</p>
         */
        @NameInMap("Skip")
        public Boolean skip;

        /**
         * <p>The name of the database to which the object in the source instance belongs.</p>
         */
        @NameInMap("SourceSchema")
        public String sourceSchema;

        /**
         * <p>The status of the subtask. Valid values:</p>
         * <br>
         * <p>*   **NotStarted**: The subtask is not started.</p>
         * <p>*   **Checking**: The subtask is being checked.</p>
         * <p>*   **Migrating**: The subtask is in progress. Data is being migrated.</p>
         * <p>*   **Failed**: The subtask failed.</p>
         * <p>*   **Warning**: The subtask encounters an exception.</p>
         * <p>*   **Success**: The subtask is complete.</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The sub-item progress of the subtask.</p>
         * <br>
         * <p>>  If **[]** is returned, the subtask has no sub-items.</p>
         */
        @NameInMap("Sub")
        public String sub;

        /**
         * <p>The names of the objects that are migrated or synchronized.</p>
         */
        @NameInMap("TargetNames")
        public String targetNames;

        /**
         * <p>The total number of subtasks.</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static DescribePreCheckStatusResponseBodyJobProgress build(java.util.Map<String, ?> map) throws Exception {
            DescribePreCheckStatusResponseBodyJobProgress self = new DescribePreCheckStatusResponseBodyJobProgress();
            return TeaModel.build(map, self);
        }

        public DescribePreCheckStatusResponseBodyJobProgress setBootTime(String bootTime) {
            this.bootTime = bootTime;
            return this;
        }
        public String getBootTime() {
            return this.bootTime;
        }

        public DescribePreCheckStatusResponseBodyJobProgress setCanSkip(Boolean canSkip) {
            this.canSkip = canSkip;
            return this;
        }
        public Boolean getCanSkip() {
            return this.canSkip;
        }

        public DescribePreCheckStatusResponseBodyJobProgress setCurrent(String current) {
            this.current = current;
            return this;
        }
        public String getCurrent() {
            return this.current;
        }

        public DescribePreCheckStatusResponseBodyJobProgress setDdlSql(String ddlSql) {
            this.ddlSql = ddlSql;
            return this;
        }
        public String getDdlSql() {
            return this.ddlSql;
        }

        public DescribePreCheckStatusResponseBodyJobProgress setDelaySeconds(Integer delaySeconds) {
            this.delaySeconds = delaySeconds;
            return this;
        }
        public Integer getDelaySeconds() {
            return this.delaySeconds;
        }

        public DescribePreCheckStatusResponseBodyJobProgress setDestSchema(String destSchema) {
            this.destSchema = destSchema;
            return this;
        }
        public String getDestSchema() {
            return this.destSchema;
        }

        public DescribePreCheckStatusResponseBodyJobProgress setDiffRow(Long diffRow) {
            this.diffRow = diffRow;
            return this;
        }
        public Long getDiffRow() {
            return this.diffRow;
        }

        public DescribePreCheckStatusResponseBodyJobProgress setErrDetail(String errDetail) {
            this.errDetail = errDetail;
            return this;
        }
        public String getErrDetail() {
            return this.errDetail;
        }

        public DescribePreCheckStatusResponseBodyJobProgress setErrMsg(String errMsg) {
            this.errMsg = errMsg;
            return this;
        }
        public String getErrMsg() {
            return this.errMsg;
        }

        public DescribePreCheckStatusResponseBodyJobProgress setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public DescribePreCheckStatusResponseBodyJobProgress setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribePreCheckStatusResponseBodyJobProgress setIgnoreFlag(String ignoreFlag) {
            this.ignoreFlag = ignoreFlag;
            return this;
        }
        public String getIgnoreFlag() {
            return this.ignoreFlag;
        }

        public DescribePreCheckStatusResponseBodyJobProgress setItem(String item) {
            this.item = item;
            return this;
        }
        public String getItem() {
            return this.item;
        }

        public DescribePreCheckStatusResponseBodyJobProgress setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public DescribePreCheckStatusResponseBodyJobProgress setLogs(java.util.List<DescribePreCheckStatusResponseBodyJobProgressLogs> logs) {
            this.logs = logs;
            return this;
        }
        public java.util.List<DescribePreCheckStatusResponseBodyJobProgressLogs> getLogs() {
            return this.logs;
        }

        public DescribePreCheckStatusResponseBodyJobProgress setNames(String names) {
            this.names = names;
            return this;
        }
        public String getNames() {
            return this.names;
        }

        public DescribePreCheckStatusResponseBodyJobProgress setOrderNum(Integer orderNum) {
            this.orderNum = orderNum;
            return this;
        }
        public Integer getOrderNum() {
            return this.orderNum;
        }

        public DescribePreCheckStatusResponseBodyJobProgress setParentObj(String parentObj) {
            this.parentObj = parentObj;
            return this;
        }
        public String getParentObj() {
            return this.parentObj;
        }

        public DescribePreCheckStatusResponseBodyJobProgress setRepairMethod(String repairMethod) {
            this.repairMethod = repairMethod;
            return this;
        }
        public String getRepairMethod() {
            return this.repairMethod;
        }

        public DescribePreCheckStatusResponseBodyJobProgress setSkip(Boolean skip) {
            this.skip = skip;
            return this;
        }
        public Boolean getSkip() {
            return this.skip;
        }

        public DescribePreCheckStatusResponseBodyJobProgress setSourceSchema(String sourceSchema) {
            this.sourceSchema = sourceSchema;
            return this;
        }
        public String getSourceSchema() {
            return this.sourceSchema;
        }

        public DescribePreCheckStatusResponseBodyJobProgress setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribePreCheckStatusResponseBodyJobProgress setSub(String sub) {
            this.sub = sub;
            return this;
        }
        public String getSub() {
            return this.sub;
        }

        public DescribePreCheckStatusResponseBodyJobProgress setTargetNames(String targetNames) {
            this.targetNames = targetNames;
            return this;
        }
        public String getTargetNames() {
            return this.targetNames;
        }

        public DescribePreCheckStatusResponseBodyJobProgress setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

    public static class DescribePreCheckStatusResponseBodyNetworkDiagnosisResultDiagnosis extends TeaModel {
        @NameInMap("CnDocUrl")
        public String cnDocUrl;

        @NameInMap("Code")
        public String code;

        @NameInMap("EndpointType")
        public String endpointType;

        @NameInMap("InternationalDocUrl")
        public String internationalDocUrl;

        @NameInMap("Result")
        public String result;

        public static DescribePreCheckStatusResponseBodyNetworkDiagnosisResultDiagnosis build(java.util.Map<String, ?> map) throws Exception {
            DescribePreCheckStatusResponseBodyNetworkDiagnosisResultDiagnosis self = new DescribePreCheckStatusResponseBodyNetworkDiagnosisResultDiagnosis();
            return TeaModel.build(map, self);
        }

        public DescribePreCheckStatusResponseBodyNetworkDiagnosisResultDiagnosis setCnDocUrl(String cnDocUrl) {
            this.cnDocUrl = cnDocUrl;
            return this;
        }
        public String getCnDocUrl() {
            return this.cnDocUrl;
        }

        public DescribePreCheckStatusResponseBodyNetworkDiagnosisResultDiagnosis setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribePreCheckStatusResponseBodyNetworkDiagnosisResultDiagnosis setEndpointType(String endpointType) {
            this.endpointType = endpointType;
            return this;
        }
        public String getEndpointType() {
            return this.endpointType;
        }

        public DescribePreCheckStatusResponseBodyNetworkDiagnosisResultDiagnosis setInternationalDocUrl(String internationalDocUrl) {
            this.internationalDocUrl = internationalDocUrl;
            return this;
        }
        public String getInternationalDocUrl() {
            return this.internationalDocUrl;
        }

        public DescribePreCheckStatusResponseBodyNetworkDiagnosisResultDiagnosis setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

    }

    public static class DescribePreCheckStatusResponseBodyNetworkDiagnosisResult extends TeaModel {
        @NameInMap("Diagnosis")
        public java.util.List<DescribePreCheckStatusResponseBodyNetworkDiagnosisResultDiagnosis> diagnosis;

        @NameInMap("ModelVersion")
        public String modelVersion;

        public static DescribePreCheckStatusResponseBodyNetworkDiagnosisResult build(java.util.Map<String, ?> map) throws Exception {
            DescribePreCheckStatusResponseBodyNetworkDiagnosisResult self = new DescribePreCheckStatusResponseBodyNetworkDiagnosisResult();
            return TeaModel.build(map, self);
        }

        public DescribePreCheckStatusResponseBodyNetworkDiagnosisResult setDiagnosis(java.util.List<DescribePreCheckStatusResponseBodyNetworkDiagnosisResultDiagnosis> diagnosis) {
            this.diagnosis = diagnosis;
            return this;
        }
        public java.util.List<DescribePreCheckStatusResponseBodyNetworkDiagnosisResultDiagnosis> getDiagnosis() {
            return this.diagnosis;
        }

        public DescribePreCheckStatusResponseBodyNetworkDiagnosisResult setModelVersion(String modelVersion) {
            this.modelVersion = modelVersion;
            return this;
        }
        public String getModelVersion() {
            return this.modelVersion;
        }

    }

    public static class DescribePreCheckStatusResponseBodySubDistributedJobStatusJobProgressLogs extends TeaModel {
        /**
         * <p>The record of errors.</p>
         */
        @NameInMap("ErrData")
        public String errData;

        /**
         * <p>The error message.</p>
         */
        @NameInMap("ErrMsg")
        public String errMsg;

        /**
         * <p>The error type.</p>
         */
        @NameInMap("ErrType")
        public String errType;

        /**
         * <p>The level of logs.</p>
         */
        @NameInMap("LogLevel")
        public String logLevel;

        public static DescribePreCheckStatusResponseBodySubDistributedJobStatusJobProgressLogs build(java.util.Map<String, ?> map) throws Exception {
            DescribePreCheckStatusResponseBodySubDistributedJobStatusJobProgressLogs self = new DescribePreCheckStatusResponseBodySubDistributedJobStatusJobProgressLogs();
            return TeaModel.build(map, self);
        }

        public DescribePreCheckStatusResponseBodySubDistributedJobStatusJobProgressLogs setErrData(String errData) {
            this.errData = errData;
            return this;
        }
        public String getErrData() {
            return this.errData;
        }

        public DescribePreCheckStatusResponseBodySubDistributedJobStatusJobProgressLogs setErrMsg(String errMsg) {
            this.errMsg = errMsg;
            return this;
        }
        public String getErrMsg() {
            return this.errMsg;
        }

        public DescribePreCheckStatusResponseBodySubDistributedJobStatusJobProgressLogs setErrType(String errType) {
            this.errType = errType;
            return this;
        }
        public String getErrType() {
            return this.errType;
        }

        public DescribePreCheckStatusResponseBodySubDistributedJobStatusJobProgressLogs setLogLevel(String logLevel) {
            this.logLevel = logLevel;
            return this;
        }
        public String getLogLevel() {
            return this.logLevel;
        }

    }

    public static class DescribePreCheckStatusResponseBodySubDistributedJobStatusJobProgress extends TeaModel {
        /**
         * <p>The time when the subtask was started. The time is displayed in the *yyyy-MM-dd*T*HH:mm:ss*Z format in UTC.</p>
         */
        @NameInMap("BootTime")
        public String bootTime;

        /**
         * <p>Indicates whether the subtask can be ignored if it fails. Valid values:</p>
         * <br>
         * <p>*   **true**: yes</p>
         * <p>*   **false**: no</p>
         */
        @NameInMap("CanSkip")
        public Boolean canSkip;

        /**
         * <p>The number of the subtasks that are running.</p>
         */
        @NameInMap("Current")
        public String current;

        /**
         * <p>The DDL statements.</p>
         */
        @NameInMap("DdlSql")
        public String ddlSql;

        /**
         * <p>The latency of incremental data migration or synchronization.</p>
         */
        @NameInMap("DelaySeconds")
        public Integer delaySeconds;

        /**
         * <p>The name of the database to which the object in the destination instance belongs.</p>
         */
        @NameInMap("DestSchema")
        public String destSchema;

        /**
         * <p>This parameter will be removed in the future.</p>
         */
        @NameInMap("DiffRow")
        public Long diffRow;

        /**
         * <p>The error details of the subtask failure.</p>
         */
        @NameInMap("ErrDetail")
        public String errDetail;

        /**
         * <p>The error message of the subtask failure.</p>
         */
        @NameInMap("ErrMsg")
        public String errMsg;

        /**
         * <p>The time when the instance was created. The time is displayed in the *yyyy-MM-dd*T*HH:mm:ss*Z format in UTC.</p>
         */
        @NameInMap("FinishTime")
        public String finishTime;

        /**
         * <p>The ID of the entry in the metadatabase.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>Indicates whether DTS ignores the subtask and proceeds with the next subtask. Valid values:</p>
         * <br>
         * <p>*   **N**: no</p>
         * <p>*   **Y**: yes</p>
         */
        @NameInMap("IgnoreFlag")
        public String ignoreFlag;

        /**
         * <p>The name of the subtask.</p>
         */
        @NameInMap("Item")
        public String item;

        /**
         * <p>The ID of the subtask.</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The operations logs of errors.</p>
         */
        @NameInMap("Logs")
        public java.util.List<DescribePreCheckStatusResponseBodySubDistributedJobStatusJobProgressLogs> logs;

        /**
         * <p>The name of the subtask.</p>
         */
        @NameInMap("Names")
        public String names;

        /**
         * <p>The serial number of the subtask.</p>
         */
        @NameInMap("OrderNum")
        public Integer orderNum;

        /**
         * <p>This parameter will be removed in the future.</p>
         */
        @NameInMap("ParentObj")
        public String parentObj;

        /**
         * <p>The method used to fix a precheck failure.</p>
         */
        @NameInMap("RepairMethod")
        public String repairMethod;

        /**
         * <p>Indicates whether the subtask was skipped. Valid values:</p>
         * <br>
         * <p>*   **true**: yes</p>
         * <p>*   **false**: no</p>
         */
        @NameInMap("Skip")
        public Boolean skip;

        /**
         * <p>The name of the database to which the object in the source instance belongs.</p>
         */
        @NameInMap("SourceSchema")
        public String sourceSchema;

        /**
         * <p>The status of the subtask. Valid values:</p>
         * <br>
         * <p>*   **NotStarted**: The subtask is not started.</p>
         * <p>*   **Suspending**: The subtask is paused.</p>
         * <p>*   **Checking**: The subtask is being checked.</p>
         * <p>*   **Migrating**: The subtask is in progress. Data is being migrated.</p>
         * <p>*   **Failed**: The subtask failed.</p>
         * <p>*   **Catched**: The subtask is in progress. Incremental data is being migrated or synchronized.</p>
         * <p>*   **Finished**: The subtask is complete.</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The sub-item progress of the subtask.</p>
         * <br>
         * <p>>  If **[]** is returned, the subtask has no sub-items.</p>
         */
        @NameInMap("Sub")
        public String sub;

        /**
         * <p>The names of the objects that are migrated or synchronized.</p>
         */
        @NameInMap("TargetNames")
        public String targetNames;

        /**
         * <p>The total number of subtasks.</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static DescribePreCheckStatusResponseBodySubDistributedJobStatusJobProgress build(java.util.Map<String, ?> map) throws Exception {
            DescribePreCheckStatusResponseBodySubDistributedJobStatusJobProgress self = new DescribePreCheckStatusResponseBodySubDistributedJobStatusJobProgress();
            return TeaModel.build(map, self);
        }

        public DescribePreCheckStatusResponseBodySubDistributedJobStatusJobProgress setBootTime(String bootTime) {
            this.bootTime = bootTime;
            return this;
        }
        public String getBootTime() {
            return this.bootTime;
        }

        public DescribePreCheckStatusResponseBodySubDistributedJobStatusJobProgress setCanSkip(Boolean canSkip) {
            this.canSkip = canSkip;
            return this;
        }
        public Boolean getCanSkip() {
            return this.canSkip;
        }

        public DescribePreCheckStatusResponseBodySubDistributedJobStatusJobProgress setCurrent(String current) {
            this.current = current;
            return this;
        }
        public String getCurrent() {
            return this.current;
        }

        public DescribePreCheckStatusResponseBodySubDistributedJobStatusJobProgress setDdlSql(String ddlSql) {
            this.ddlSql = ddlSql;
            return this;
        }
        public String getDdlSql() {
            return this.ddlSql;
        }

        public DescribePreCheckStatusResponseBodySubDistributedJobStatusJobProgress setDelaySeconds(Integer delaySeconds) {
            this.delaySeconds = delaySeconds;
            return this;
        }
        public Integer getDelaySeconds() {
            return this.delaySeconds;
        }

        public DescribePreCheckStatusResponseBodySubDistributedJobStatusJobProgress setDestSchema(String destSchema) {
            this.destSchema = destSchema;
            return this;
        }
        public String getDestSchema() {
            return this.destSchema;
        }

        public DescribePreCheckStatusResponseBodySubDistributedJobStatusJobProgress setDiffRow(Long diffRow) {
            this.diffRow = diffRow;
            return this;
        }
        public Long getDiffRow() {
            return this.diffRow;
        }

        public DescribePreCheckStatusResponseBodySubDistributedJobStatusJobProgress setErrDetail(String errDetail) {
            this.errDetail = errDetail;
            return this;
        }
        public String getErrDetail() {
            return this.errDetail;
        }

        public DescribePreCheckStatusResponseBodySubDistributedJobStatusJobProgress setErrMsg(String errMsg) {
            this.errMsg = errMsg;
            return this;
        }
        public String getErrMsg() {
            return this.errMsg;
        }

        public DescribePreCheckStatusResponseBodySubDistributedJobStatusJobProgress setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public DescribePreCheckStatusResponseBodySubDistributedJobStatusJobProgress setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribePreCheckStatusResponseBodySubDistributedJobStatusJobProgress setIgnoreFlag(String ignoreFlag) {
            this.ignoreFlag = ignoreFlag;
            return this;
        }
        public String getIgnoreFlag() {
            return this.ignoreFlag;
        }

        public DescribePreCheckStatusResponseBodySubDistributedJobStatusJobProgress setItem(String item) {
            this.item = item;
            return this;
        }
        public String getItem() {
            return this.item;
        }

        public DescribePreCheckStatusResponseBodySubDistributedJobStatusJobProgress setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public DescribePreCheckStatusResponseBodySubDistributedJobStatusJobProgress setLogs(java.util.List<DescribePreCheckStatusResponseBodySubDistributedJobStatusJobProgressLogs> logs) {
            this.logs = logs;
            return this;
        }
        public java.util.List<DescribePreCheckStatusResponseBodySubDistributedJobStatusJobProgressLogs> getLogs() {
            return this.logs;
        }

        public DescribePreCheckStatusResponseBodySubDistributedJobStatusJobProgress setNames(String names) {
            this.names = names;
            return this;
        }
        public String getNames() {
            return this.names;
        }

        public DescribePreCheckStatusResponseBodySubDistributedJobStatusJobProgress setOrderNum(Integer orderNum) {
            this.orderNum = orderNum;
            return this;
        }
        public Integer getOrderNum() {
            return this.orderNum;
        }

        public DescribePreCheckStatusResponseBodySubDistributedJobStatusJobProgress setParentObj(String parentObj) {
            this.parentObj = parentObj;
            return this;
        }
        public String getParentObj() {
            return this.parentObj;
        }

        public DescribePreCheckStatusResponseBodySubDistributedJobStatusJobProgress setRepairMethod(String repairMethod) {
            this.repairMethod = repairMethod;
            return this;
        }
        public String getRepairMethod() {
            return this.repairMethod;
        }

        public DescribePreCheckStatusResponseBodySubDistributedJobStatusJobProgress setSkip(Boolean skip) {
            this.skip = skip;
            return this;
        }
        public Boolean getSkip() {
            return this.skip;
        }

        public DescribePreCheckStatusResponseBodySubDistributedJobStatusJobProgress setSourceSchema(String sourceSchema) {
            this.sourceSchema = sourceSchema;
            return this;
        }
        public String getSourceSchema() {
            return this.sourceSchema;
        }

        public DescribePreCheckStatusResponseBodySubDistributedJobStatusJobProgress setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribePreCheckStatusResponseBodySubDistributedJobStatusJobProgress setSub(String sub) {
            this.sub = sub;
            return this;
        }
        public String getSub() {
            return this.sub;
        }

        public DescribePreCheckStatusResponseBodySubDistributedJobStatusJobProgress setTargetNames(String targetNames) {
            this.targetNames = targetNames;
            return this;
        }
        public String getTargetNames() {
            return this.targetNames;
        }

        public DescribePreCheckStatusResponseBodySubDistributedJobStatusJobProgress setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

    public static class DescribePreCheckStatusResponseBodySubDistributedJobStatus extends TeaModel {
        /**
         * <p>The task code that indicates the subtask type. Valid values:</p>
         * <br>
         * <p>*   **01**: precheck</p>
         * <p>*   **02**: schema migration or initial schema synchronization</p>
         * <p>*   **03**: full data migration or initial full data synchronization</p>
         * <p>*   **04**: incremental data migration or synchronization</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The number of subtasks that failed.</p>
         */
        @NameInMap("ErrorItem")
        public Integer errorItem;

        /**
         * <p>The ID of the subtask.</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The name of distributed subtasks associated with the subtask.</p>
         */
        @NameInMap("JobName")
        public String jobName;

        /**
         * <p>The list of subtasks and the progress of each subtask.</p>
         */
        @NameInMap("JobProgress")
        public java.util.List<DescribePreCheckStatusResponseBodySubDistributedJobStatusJobProgress> jobProgress;

        /**
         * <p>The status of the subtask. Valid values:</p>
         * <br>
         * <p>*   **NotStarted**: The subtask is not started.</p>
         * <p>*   **Suspending**: The subtask is paused.</p>
         * <p>*   **Checking**: The subtask is being checked.</p>
         * <p>*   **Migrating**: The subtask is in progress. Data is being migrated.</p>
         * <p>*   **Failed**: The subtask failed.</p>
         * <p>*   **Catched**: The subtask is in progress. Incremental data is being migrated or synchronized.</p>
         * <p>*   **Finished**: The subtask is complete.</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The total number of returned entries.</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static DescribePreCheckStatusResponseBodySubDistributedJobStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribePreCheckStatusResponseBodySubDistributedJobStatus self = new DescribePreCheckStatusResponseBodySubDistributedJobStatus();
            return TeaModel.build(map, self);
        }

        public DescribePreCheckStatusResponseBodySubDistributedJobStatus setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribePreCheckStatusResponseBodySubDistributedJobStatus setErrorItem(Integer errorItem) {
            this.errorItem = errorItem;
            return this;
        }
        public Integer getErrorItem() {
            return this.errorItem;
        }

        public DescribePreCheckStatusResponseBodySubDistributedJobStatus setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public DescribePreCheckStatusResponseBodySubDistributedJobStatus setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public DescribePreCheckStatusResponseBodySubDistributedJobStatus setJobProgress(java.util.List<DescribePreCheckStatusResponseBodySubDistributedJobStatusJobProgress> jobProgress) {
            this.jobProgress = jobProgress;
            return this;
        }
        public java.util.List<DescribePreCheckStatusResponseBodySubDistributedJobStatusJobProgress> getJobProgress() {
            return this.jobProgress;
        }

        public DescribePreCheckStatusResponseBodySubDistributedJobStatus setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribePreCheckStatusResponseBodySubDistributedJobStatus setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
