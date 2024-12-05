// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribePreCheckStatusResponseBody extends TeaModel {
    /**
     * <p>Display list of evaluation tasks</p>
     */
    @NameInMap("AnalysisJobProgress")
    public java.util.List<DescribePreCheckStatusResponseBodyAnalysisJobProgress> analysisJobProgress;

    /**
     * <p>The task code that indicates the type of the subtask. Valid values:</p>
     * <ul>
     * <li><strong>01</strong>: precheck.</li>
     * <li><strong>02</strong>: schema migration or initial schema synchronization.</li>
     * <li><strong>03</strong>: full data migration or initial full data synchronization.</li>
     * <li><strong>04</strong>: incremental data migration or synchronization.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>01</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Number of failed evaluation items</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ErrorAnalysisItem")
    public Integer errorAnalysisItem;

    /**
     * <p>The total number of subtask failures.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ErrorItem")
    public Integer errorItem;

    /**
     * <p>Network-wide inspection results.</p>
     */
    @NameInMap("FullNetCheckJobStatus")
    public java.util.List<DescribePreCheckStatusResponseBodyFullNetCheckJobStatus> fullNetCheckJobStatus;

    /**
     * <p>The status code that is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The ID of the data migration or synchronization task.</p>
     * 
     * <strong>example:</strong>
     * <p>b4my3zg929a****</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The name of the subtask.</p>
     * 
     * <strong>example:</strong>
     * <p>dtstest</p>
     */
    @NameInMap("JobName")
    public String jobName;

    /**
     * <p>The subtasks and the progress of each subtask.</p>
     */
    @NameInMap("JobProgress")
    public java.util.List<DescribePreCheckStatusResponseBodyJobProgress> jobProgress;

    /**
     * <p>Network diagnosis result</p>
     */
    @NameInMap("NetworkDiagnosisResult")
    public DescribePreCheckStatusResponseBodyNetworkDiagnosisResult networkDiagnosisResult;

    /**
     * <p>The page number. Pages start from page 1. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageRecordCount")
    public Long pageRecordCount;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C096FA97-B6BA-4575-899D-61E12B59****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the subtask. Valid values:</p>
     * <ul>
     * <li><strong>NotStarted</strong>: The subtask is not started.</li>
     * <li><strong>Suspending</strong>: The subtask is paused.</li>
     * <li><strong>Checking</strong>: The subtask is being checked.</li>
     * <li><strong>Migrating</strong>: The subtask is in progress. Data is being migrated.</li>
     * <li><strong>Failed</strong>: The subtask failed.</li>
     * <li><strong>Catched</strong>: The subtask is in progress. Incremental data is being migrated or synchronized.</li>
     * <li><strong>Finished</strong>: The subtask is complete.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Finished</p>
     */
    @NameInMap("State")
    public String state;

    /**
     * <p>The information about the distributed subtasks.</p>
     */
    @NameInMap("SubDistributedJobStatus")
    public java.util.List<DescribePreCheckStatusResponseBodySubDistributedJobStatus> subDistributedJobStatus;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of subtasks.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Total")
    public Integer total;

    /**
     * <p>The total number of entries that are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
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
        /**
         * <p>Error message</p>
         * 
         * <strong>example:</strong>
         * <p>Please modify this object</p>
         */
        @NameInMap("ErrData")
        public String errData;

        /**
         * <p>Error message from DTS when a specific project encounters an error.</p>
         * 
         * <strong>example:</strong>
         * <p>DTS-1020042 Execute sql error sql: Table \&quot;customer\&quot; already exists</p>
         */
        @NameInMap("ErrMsg")
        public String errMsg;

        /**
         * <p>Error type.</p>
         * 
         * <strong>example:</strong>
         * <p>ForeignKey</p>
         */
        @NameInMap("ErrType")
        public String errType;

        /**
         * <p>The level of the log.</p>
         * 
         * <strong>example:</strong>
         * <p>ERROR</p>
         */
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
        /**
         * <p>The specific project start time, formatted as <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z (UTC time).</p>
         * 
         * <strong>example:</strong>
         * <p>2022-03-16T08:01:31.000+00:00</p>
         */
        @NameInMap("BootTime")
        public String bootTime;

        /**
         * <p>Whether to support skipping this sub-item.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CanSkip")
        public Boolean canSkip;

        /**
         * <p>The number of currently running subtasks.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Current")
        public String current;

        /**
         * <p>The DDL operation to be executed.</p>
         * 
         * <strong>example:</strong>
         * <p>CREATE TABLE ****</p>
         */
        @NameInMap("DdlSql")
        public String ddlSql;

        /**
         * <p>Task delay time</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DelaySeconds")
        public Integer delaySeconds;

        /**
         * <p>Name of the database to which the migration objects in the target instance belong.</p>
         * 
         * <strong>example:</strong>
         * <p>dest</p>
         */
        @NameInMap("DestSchema")
        public String destSchema;

        /**
         * <p>This parameter will be deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DiffRow")
        public Long diffRow;

        /**
         * <p>Error details when the project encounters an error.</p>
         * 
         * <strong>example:</strong>
         * <p>ANALYSIS_MYSQL</p>
         */
        @NameInMap("ErrDetail")
        public String errDetail;

        /**
         * <p>Specific error message.</p>
         * 
         * <strong>example:</strong>
         * <p>ANALYSIS_</p>
         */
        @NameInMap("ErrMsg")
        public String errMsg;

        /**
         * <p>The end time of the evaluation task, formatted as <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z (UTC time).</p>
         * 
         * <strong>example:</strong>
         * <p>2022-03-16T08:01:31.000+00:00</p>
         */
        @NameInMap("FinishTime")
        public String finishTime;

        /**
         * <p>The ID of this evaluation item in the database.</p>
         * 
         * <strong>example:</strong>
         * <p>123123</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>Whether to directly ignore this specific item and move to the next one. Return values:</p>
         * <ul>
         * <li><strong>N</strong>: No. - <strong>Y</strong>: Yes.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>N</p>
         */
        @NameInMap("IgnoreFlag")
        public String ignoreFlag;

        /**
         * <p>Name of the evaluation item</p>
         * 
         * <strong>example:</strong>
         * <p>ANALYSIS_MYSQL_4_ITEM</p>
         */
        @NameInMap("Item")
        public String item;

        /**
         * <p>The ID of the evaluation task.</p>
         * 
         * <strong>example:</strong>
         * <p>11234234xc</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>Sub-assessment item.</p>
         */
        @NameInMap("Logs")
        public java.util.List<DescribePreCheckStatusResponseBodyAnalysisJobProgressLogs> logs;

        /**
         * <p>Name of the evaluation item</p>
         * 
         * <strong>example:</strong>
         * <p>ANALYSIS_MYSQL_4_DETAIL</p>
         */
        @NameInMap("Names")
        public String names;

        /**
         * <p>The number of the evaluation item.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("OrderNum")
        public Integer orderNum;

        /**
         * <p>This parameter will be deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("ParentObj")
        public String parentObj;

        /**
         * <p>Remediation method for the evaluation item.</p>
         * 
         * <strong>example:</strong>
         * <p>ANALYSIS_</p>
         */
        @NameInMap("RepairMethod")
        public String repairMethod;

        /**
         * <p>If this evaluation item fails, whether you set to skip this item. Return values: * <strong>true</strong>: Yes * <strong>false</strong>: No</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Skip")
        public Boolean skip;

        /**
         * <p>Name of the database to which the migration objects in the source instance belong.</p>
         * 
         * <strong>example:</strong>
         * <p>dtstestdata</p>
         */
        @NameInMap("SourceSchema")
        public String sourceSchema;

        /**
         * <p>The result of the evaluation, with return values being: - <strong>Failed</strong>: Failure. - <strong>Success</strong>: Success.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>Progress of sub-projects under a specific project. &gt; If it returns <b>[]</b>, it indicates there are no sub-projects.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("Sub")
        public String sub;

        /**
         * <p>Name of the target object</p>
         * 
         * <strong>example:</strong>
         * <p>testTable</p>
         */
        @NameInMap("TargetNames")
        public String targetNames;

        /**
         * <p>The total number of specific items in the sub-task.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
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
        /**
         * <p>Error record.</p>
         * 
         * <strong>example:</strong>
         * <p>CREATE TABLE <code>dtstestdata</code>.<code>customer</code> ****</p>
         */
        @NameInMap("ErrData")
        public String errData;

        /**
         * <p>Specific error message.</p>
         * 
         * <strong>example:</strong>
         * <p>get metric list fail</p>
         */
        @NameInMap("ErrMsg")
        public String errMsg;

        /**
         * <p>Type of error.</p>
         * 
         * <strong>example:</strong>
         * <p>ForeignKey</p>
         */
        @NameInMap("ErrType")
        public String errType;

        /**
         * <p>The level of the log.</p>
         * 
         * <strong>example:</strong>
         * <p>INFO</p>
         */
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
        /**
         * <p>The specific project start time, formatted as <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z (UTC time).</p>
         * 
         * <strong>example:</strong>
         * <p>2022-03-30T03:36:11.000+00:00</p>
         */
        @NameInMap("BootTime")
        public String bootTime;

        /**
         * <p>Whether DTS supports skipping a project after it fails. Return values: * <strong>true</strong>: Yes * <strong>false</strong>: No</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("CanSkip")
        public Boolean canSkip;

        /**
         * <p>The number of currently running tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Current")
        public String current;

        /**
         * <p>The DDL operation to be executed.</p>
         * 
         * <strong>example:</strong>
         * <p>CREATE TABLE ****</p>
         */
        @NameInMap("DdlSql")
        public String ddlSql;

        /**
         * <p>Task delay time</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DelaySeconds")
        public Integer delaySeconds;

        /**
         * <p>Name of the database to which the migration objects in the target instance belong.</p>
         * 
         * <strong>example:</strong>
         * <p>dest</p>
         */
        @NameInMap("DestSchema")
        public String destSchema;

        /**
         * <p>This parameter will be deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DiffRow")
        public Long diffRow;

        /**
         * <p>Details of the error when a specific project fails.</p>
         * 
         * <strong>example:</strong>
         * <p>CHECK__ERROR_SAME_OBJ_DETAIL</p>
         */
        @NameInMap("ErrDetail")
        public String errDetail;

        /**
         * <p>Error message prompt when a specific project encounters an error.</p>
         * 
         * <strong>example:</strong>
         * <p>ODPS project does not exist odps.`huijin</p>
         */
        @NameInMap("ErrMsg")
        public String errMsg;

        /**
         * <p>Task completion time, formatted as yyyy-MM-ddTHH:mm:ssZ (UTC time).</p>
         * 
         * <strong>example:</strong>
         * <p>2022-03-31T03:36:11.000+00:00</p>
         */
        @NameInMap("FinishTime")
        public String finishTime;

        /**
         * <p>The ID of the record in the metadata database.</p>
         * 
         * <strong>example:</strong>
         * <p>922305811766881****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>Whether to directly ignore this specific item and move to the next one. Return values:</p>
         * <ul>
         * <li><strong>N</strong>: No. - <strong>Y</strong>: Yes.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>N</p>
         */
        @NameInMap("IgnoreFlag")
        public String ignoreFlag;

        /**
         * <p>Specific project name.</p>
         * 
         * <strong>example:</strong>
         * <p>CHECK_CONN_SRC</p>
         */
        @NameInMap("Item")
        public String item;

        /**
         * <p>Task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>l3m1213ye7l****</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>Error execution log information.</p>
         */
        @NameInMap("Logs")
        public java.util.List<DescribePreCheckStatusResponseBodyFullNetCheckJobStatusJobProgressLogs> logs;

        /**
         * <p>Specific project name.</p>
         * 
         * <strong>example:</strong>
         * <p>CHECK_CONN_SRC_DETAIL</p>
         */
        @NameInMap("Names")
        public String names;

        /**
         * <p>Project number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("OrderNum")
        public Integer orderNum;

        /**
         * <p>This parameter will be deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("ParentObj")
        public String parentObj;

        /**
         * <p>The corresponding remediation method when the pre-check fails.</p>
         * 
         * <strong>example:</strong>
         * <p>CHECK__ERROR_SAME_OBJ_REPAIR</p>
         */
        @NameInMap("RepairMethod")
        public String repairMethod;

        /**
         * <p>After this specific item fails, do you set to skip this item. Return values: * <strong>true</strong>: Yes * <strong>false</strong>: No</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Skip")
        public Boolean skip;

        /**
         * <p>Name of the database to which the migration objects in the source instance belong.</p>
         * 
         * <strong>example:</strong>
         * <p>dtstestdata</p>
         */
        @NameInMap("SourceSchema")
        public String sourceSchema;

        /**
         * <p>Check result, the return value is: - <strong>Failed</strong>: Failure. - <strong>Success</strong>: Completed.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>Progress of sub-projects under a specific project. &gt; If it returns <b>[]</b>, it indicates there are no sub-projects.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("Sub")
        public String sub;

        /**
         * <p>Name of the target object</p>
         * 
         * <strong>example:</strong>
         * <p>order</p>
         */
        @NameInMap("TargetNames")
        public String targetNames;

        /**
         * <p>The total number of projects.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
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
        /**
         * <p>Task code, <strong>01</strong> represents pre-check.</p>
         * 
         * <strong>example:</strong>
         * <p>01</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>ID of the region to which the target network segment belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("DestRegion")
        public String destRegion;

        /**
         * <p>Destination network segment.</p>
         * 
         * <strong>example:</strong>
         * <p>100.104.XX.XXX/XX</p>
         */
        @NameInMap("DestRegionCidr")
        public String destRegionCidr;

        /**
         * <p>The access method of the target instance, with return values as follows: - <strong>ALIYUN</strong>: Access method is <strong>cloud instance</strong>. - <strong>OTHER</strong>: Access method is <strong>public IP</strong>. - <strong>ECS</strong>: Access method is <strong>ECS self-built database</strong>. - <strong>EXPRESS</strong>: Access method is <strong>Express Connect / VPN Gateway / Smart Gateway</strong>. - <strong>CEN</strong>: Access method is <strong>Cloud Enterprise Network (CEN)</strong>. - <strong>DG</strong>: Access method is <strong>Database Gateway (DG)</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>CEN</p>
         */
        @NameInMap("DestinationEndpointType")
        public String destinationEndpointType;

        /**
         * <p>Number of pre-check failed items</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ErrorItem")
        public Integer errorItem;

        /**
         * <p>The region ID of the instance\&quot;s running node.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("HostRegion")
        public String hostRegion;

        /**
         * <p>Task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>l3m1213ye7l****</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>Task name.</p>
         * 
         * <strong>example:</strong>
         * <p>dts.step.fullnetcheck</p>
         */
        @NameInMap("JobName")
        public String jobName;

        /**
         * <p>A list of specific items for the task and their execution progress.</p>
         */
        @NameInMap("JobProgress")
        public java.util.List<DescribePreCheckStatusResponseBodyFullNetCheckJobStatusJobProgress> jobProgress;

        /**
         * <p>The access method of the source instance, with return values as follows: - <strong>ALIYUN</strong>: Access method is <strong>cloud instance</strong>. - <strong>OTHER</strong>: Access method is <strong>public IP</strong>. - <strong>ECS</strong>: Access method is <strong>ECS self-built database</strong>. - <strong>EXPRESS</strong>: Access method is <strong>dedicated line/VPN gateway/smart gateway</strong>. - <strong>CEN</strong>: Access method is <strong>Cloud Enterprise Network CEN</strong>. - <strong>DG</strong>: Access method is <strong>Database Gateway DG</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>CEN</p>
         */
        @NameInMap("SourceEndpointType")
        public String sourceEndpointType;

        /**
         * <p>ID of the region to which the source network segment belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("SrcRegion")
        public String srcRegion;

        /**
         * <p>Source network segment.</p>
         * 
         * <strong>example:</strong>
         * <p>100.104.XX.XXX/XX</p>
         */
        @NameInMap("SrcRegionCidr")
        public String srcRegionCidr;

        /**
         * <p>Check result, the return value is: - <strong>Failed</strong>: Failure. - <strong>Success</strong>: Completed.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>Total number of items in the project.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
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
         * 
         * <strong>example:</strong>
         * <p>CREATE TABLE <code>dtstestdata</code>.<code>customer</code> (\n<code>runoob_id</code>  int(10) unsigned   auto_increment  COMMENT \&quot;\&quot;   NOT NULL   , \n<code>runoob_title</code>  varchar(100)  CHARSET <code>utf8</code> COLLATE <code>utf8_general_ci</code>    COMMENT \&quot;\&quot;   NOT NULL   , \n<code>runoob_author1216</code>  varchar(40)  CHARSET <code>utf8</code> COLLATE <code>utf8_general_ci</code>    COMMENT \&quot;\&quot;   NOT NULL   , \n<code>submission_date1216</code>  date     COMMENT \&quot;\&quot;   NULL   \n, PRIMARY KEY (<code>runoob_id</code>)) engine=InnoDB AUTO_INCREMENT=200001 DEFAULT CHARSET=<code>utf8</code> DEFAULT COLLATE <code>utf8_general_ci</code> ROW_FORMAT= Dynamic comment = \&quot;\&quot; ;\n</p>
         */
        @NameInMap("ErrData")
        public String errData;

        /**
         * <p>The error message that is returned when an error occurs on the subtask.</p>
         * 
         * <strong>example:</strong>
         * <p>DTS-1020042 Execute sql error sql: Table \&quot;customer\&quot; already exists</p>
         */
        @NameInMap("ErrMsg")
        public String errMsg;

        /**
         * <p>The error type.</p>
         * 
         * <strong>example:</strong>
         * <p>ForeignKey</p>
         */
        @NameInMap("ErrType")
        public String errType;

        /**
         * <p>The level of logs.</p>
         * 
         * <strong>example:</strong>
         * <p>ERROR</p>
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
         * 
         * <strong>example:</strong>
         * <p>2021-03-16T08:01:31.000+00:00</p>
         */
        @NameInMap("BootTime")
        public String bootTime;

        /**
         * <p>Indicates whether the subtask can be ignored if it fails.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CanSkip")
        public Boolean canSkip;

        /**
         * <p>The number of the subtasks that are running.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Current")
        public String current;

        /**
         * <p>The DDL statements.</p>
         * 
         * <strong>example:</strong>
         * <p>CREATE TABLE <code>dtstestdata</code>.<code>order</code> (\n<code>orderid</code>  int(11)     COMMENT \&quot;\&quot;   NOT NULL   , \n<code>username</code>  char(32)  CHARSET <code>utf8</code> COLLATE <code>utf8_general_ci</code>    COMMENT \&quot;\&quot;   NULL   , \n<code>ordertime</code>  datetime     COMMENT \&quot;\&quot;   NULL   , \n<code>commodity</code>  varchar(32)  CHARSET <code>utf8</code> COLLATE <code>utf8_general_ci</code>    COMMENT \&quot;\&quot;   NULL   , \n<code>phonenumber</code>  int(11)     COMMENT \&quot;\&quot;   NULL   , \n<code>address</code>  text  CHARSET <code>utf8mb4</code> COLLATE <code>utf8mb4_general_ci</code>    COMMENT \&quot;\&quot;   NULL   \n, PRIMARY KEY (<code>orderid</code>)) engine=InnoDB DEFAULT CHARSET=<code>gbk</code> DEFAULT COLLATE <code>gbk_chinese_ci</code> ROW_FORMAT= Dynamic comment = \&quot;\&quot; ;\n</p>
         */
        @NameInMap("DdlSql")
        public String ddlSql;

        /**
         * <p>The latency of incremental data migration or synchronization.</p>
         * <blockquote>
         * <p>If you query data migration tasks, the unit of this parameter is milliseconds. If you query data synchronization tasks, the unit of this parameter is seconds.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DelaySeconds")
        public Integer delaySeconds;

        /**
         * <p>The name of the database to which the object in the destination instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>dtstestdata_new</p>
         */
        @NameInMap("DestSchema")
        public String destSchema;

        /**
         * <p>This parameter will be removed in the future.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DiffRow")
        public Long diffRow;

        /**
         * <p>The error details of the subtask failure.</p>
         * 
         * <strong>example:</strong>
         * <p>CHECK__ERROR_SAME_OBJ_DETAIL</p>
         */
        @NameInMap("ErrDetail")
        public String errDetail;

        /**
         * <p>The error message of the subtask failure.</p>
         * 
         * <strong>example:</strong>
         * <p>CHECK__ERROR_SAME_OBJ</p>
         */
        @NameInMap("ErrMsg")
        public String errMsg;

        /**
         * <p>The time when the subtask was complete. The time is displayed in the yyyy-MM-ddTHH:mm:ssZ format in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-03-16T08:01:34.000+00:00</p>
         */
        @NameInMap("FinishTime")
        public String finishTime;

        /**
         * <p>The ID of the entry in the metadatabase.</p>
         * 
         * <strong>example:</strong>
         * <p>5632</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>Indicates whether DTS ignores the subtask and proceeds with the next subtask. Valid values:</p>
         * <ul>
         * <li><strong>N</strong>: no.</li>
         * <li><strong>Y</strong>: yes.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>N</p>
         */
        @NameInMap("IgnoreFlag")
        public String ignoreFlag;

        /**
         * <p>The shortened name of the subtask.</p>
         * 
         * <strong>example:</strong>
         * <p>CHECK_CONN_DEST</p>
         */
        @NameInMap("Item")
        public String item;

        /**
         * <p>The subtask ID.</p>
         * 
         * <strong>example:</strong>
         * <p>fj1c33ro168****</p>
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
         * 
         * <strong>example:</strong>
         * <p>CHECK_CONN_DEST_DETAIL</p>
         */
        @NameInMap("Names")
        public String names;

        /**
         * <p>The serial number of the subtask.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("OrderNum")
        public Integer orderNum;

        /**
         * <p>This parameter will be removed in the future.</p>
         * 
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("ParentObj")
        public String parentObj;

        /**
         * <p>The method to fix the subtask failure.</p>
         * 
         * <strong>example:</strong>
         * <p>CHECK__ERROR_SAME_OBJ_REPAIR</p>
         */
        @NameInMap("RepairMethod")
        public String repairMethod;

        /**
         * <p>Indicates whether the subtask is ignored if it fails. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Skip")
        public Boolean skip;

        /**
         * <p>The name of the database to which the object in the source instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>dtstestdata</p>
         */
        @NameInMap("SourceSchema")
        public String sourceSchema;

        /**
         * <p>The status of the subtask. Valid values:</p>
         * <ul>
         * <li><strong>NotStarted</strong>: The subtask is not started.</li>
         * <li><strong>Checking</strong>: The subtask is being checked.</li>
         * <li><strong>Migrating</strong>: The subtask is in progress. Data is being migrated.</li>
         * <li><strong>Failed</strong>: The subtask failed.</li>
         * <li><strong>Warning</strong>: The subtask encounters an exception.</li>
         * <li><strong>Success</strong>: The subtask is complete.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The sub-item progress of the subtask.</p>
         * <blockquote>
         * <p>If \<em>\</em>[]\<em>\</em> is returned, the subtask has no sub-items.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("Sub")
        public String sub;

        /**
         * <p>The names of the objects that are migrated or synchronized.</p>
         * 
         * <strong>example:</strong>
         * <p>order</p>
         */
        @NameInMap("TargetNames")
        public String targetNames;

        /**
         * <p>The total number of sub-items of the subtask.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
        /**
         * <p>Document address for China region.</p>
         * 
         * <strong>example:</strong>
         * <p>https://<em><strong>.ali</strong></em>.com/document_detail/470447.html</p>
         */
        @NameInMap("CnDocUrl")
        public String cnDocUrl;

        /**
         * <p>Diagnostic code.</p>
         * 
         * <strong>example:</strong>
         * <p>dts.kunlun.diagnosis.network.express_doc</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>Access point, the return values are: - <strong>source</strong>: source end. - <strong>destination</strong>: destination end. - <strong>unknown</strong>: unknown.</p>
         * 
         * <strong>example:</strong>
         * <p>source</p>
         */
        @NameInMap("EndpointType")
        public String endpointType;

        /**
         * <p>Overseas region document address.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.ali***.com/help/en/data-transmission-service/latest/how-to-solve-an-error-when-accessing-a-database-instance-to-dts-using-vpn">https://www.ali***.com/help/en/data-transmission-service/latest/how-to-solve-an-error-when-accessing-a-database-instance-to-dts-using-vpn</a></p>
         */
        @NameInMap("InternationalDocUrl")
        public String internationalDocUrl;

        /**
         * <p>Reserved field for diagnostic results, default is empty.</p>
         * 
         * <strong>example:</strong>
         * <p>none</p>
         */
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
        /**
         * <p>Network diagnostic report</p>
         */
        @NameInMap("Diagnosis")
        public java.util.List<DescribePreCheckStatusResponseBodyNetworkDiagnosisResultDiagnosis> diagnosis;

        /**
         * <p>Diagnose model version.</p>
         * 
         * <strong>example:</strong>
         * <p>network-v0.2</p>
         */
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
         * 
         * <strong>example:</strong>
         * <p>CREATE TABLE <code>dtstestdata</code>.<code>customer</code> (\n<code>runoob_id</code> int(10) unsigned auto_increment COMMENT \&quot;\&quot; NOT NULL , \n<code>runoob_title</code> varchar(100) CHARSET <code>utf8</code> COLLATE <code>utf8_general_ci</code> COMMENT \&quot;\&quot; NOT NULL , \n<code>runoob_author1216</code> varchar(40) CHARSET <code>utf8</code> COLLATE <code>utf8_general_ci</code> COMMENT \&quot;\&quot; NOT NULL , \n<code>submission_date1216</code> date COMMENT \&quot;\&quot; NULL \n, PRIMARY KEY (<code>runoob_id</code>)) engine=InnoDB AUTO_INCREMENT=200001 DEFAULT CHARSET=<code>utf8</code> DEFAULT COLLATE <code>utf8_general_ci</code> ROW_FORMAT= Dynamic comment = \&quot;\&quot; ;\n</p>
         */
        @NameInMap("ErrData")
        public String errData;

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>get metric list fail</p>
         */
        @NameInMap("ErrMsg")
        public String errMsg;

        /**
         * <p>The error type.</p>
         * 
         * <strong>example:</strong>
         * <p>ForeignKey</p>
         */
        @NameInMap("ErrType")
        public String errType;

        /**
         * <p>The level of logs.</p>
         * 
         * <strong>example:</strong>
         * <p>INFO</p>
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
         * <p>The time when the subtask was started. The time is displayed in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-03-30T03:36:11.000+00:00</p>
         */
        @NameInMap("BootTime")
        public String bootTime;

        /**
         * <p>Indicates whether the subtask can be ignored if it fails. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("CanSkip")
        public Boolean canSkip;

        /**
         * <p>The number of the subtasks that are running.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Current")
        public String current;

        /**
         * <p>The DDL statements.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("DdlSql")
        public String ddlSql;

        /**
         * <p>The latency of incremental data migration or synchronization.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DelaySeconds")
        public Integer delaySeconds;

        /**
         * <p>The name of the database to which the object in the destination instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>databasetest</p>
         */
        @NameInMap("DestSchema")
        public String destSchema;

        /**
         * <p>This parameter will be removed in the future.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("DiffRow")
        public Long diffRow;

        /**
         * <p>The error details of the subtask failure.</p>
         * 
         * <strong>example:</strong>
         * <p>CHECK__ERROR_SAME_OBJ_DETAIL</p>
         */
        @NameInMap("ErrDetail")
        public String errDetail;

        /**
         * <p>The error message of the subtask failure.</p>
         * 
         * <strong>example:</strong>
         * <p>ODPS project does not exist odps.`huijin</p>
         */
        @NameInMap("ErrMsg")
        public String errMsg;

        /**
         * <p>The time when the subtask was complete. The time is displayed in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-03-31T03:36:11.000+00:00</p>
         */
        @NameInMap("FinishTime")
        public String finishTime;

        /**
         * <p>The ID of the entry in the metadatabase.</p>
         * 
         * <strong>example:</strong>
         * <p>3890</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>Indicates whether DTS ignores the subtask and proceeds with the next subtask. Valid values:</p>
         * <ul>
         * <li><strong>N</strong>: no.</li>
         * <li><strong>Y</strong>: yes.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>N</p>
         */
        @NameInMap("IgnoreFlag")
        public String ignoreFlag;

        /**
         * <p>The name of the subtask.</p>
         * 
         * <strong>example:</strong>
         * <p>login_common_time</p>
         */
        @NameInMap("Item")
        public String item;

        /**
         * <p>The subtask ID.</p>
         * 
         * <strong>example:</strong>
         * <p>l3m1213ye7l****</p>
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
         * 
         * <strong>example:</strong>
         * <p>metricRuleTargets-20180308houe</p>
         */
        @NameInMap("Names")
        public String names;

        /**
         * <p>The serial number of the subtask.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("OrderNum")
        public Integer orderNum;

        /**
         * <p>This parameter will be removed in the future.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("ParentObj")
        public String parentObj;

        /**
         * <p>The method to fix a precheck failure.</p>
         * 
         * <strong>example:</strong>
         * <p>CHECK__ERROR_SAME_OBJ_REPAIR</p>
         */
        @NameInMap("RepairMethod")
        public String repairMethod;

        /**
         * <p>Indicates whether the subtask was ignored. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("Skip")
        public Boolean skip;

        /**
         * <p>The name of the database to which the object in the source instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>databasetest</p>
         */
        @NameInMap("SourceSchema")
        public String sourceSchema;

        /**
         * <p>The status of the subtask. Valid values:</p>
         * <ul>
         * <li><strong>NotStarted</strong>: The subtask is not started.</li>
         * <li><strong>Suspending</strong>: The subtask is paused.</li>
         * <li><strong>Checking</strong>: The subtask is being checked.</li>
         * <li><strong>Migrating</strong>: The subtask is in progress. Data is being migrated.</li>
         * <li><strong>Failed</strong>: The subtask failed.</li>
         * <li><strong>Catched</strong>: The subtask is in progress. Incremental data is being migrated or synchronized.</li>
         * <li><strong>Finished</strong>: The subtask is complete.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Finished</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The sub-item progress of the subtask.</p>
         * <blockquote>
         * <p>If \<em>\</em>[]\<em>\</em> is returned, the subtask has no sub-item.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("Sub")
        public String sub;

        /**
         * <p>The names of the objects that are migrated or synchronized.</p>
         * 
         * <strong>example:</strong>
         * <p>order</p>
         */
        @NameInMap("TargetNames")
        public String targetNames;

        /**
         * <p>The total number of subtasks.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
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
         * <p>The task code that indicates the type of the subtask. Valid values:</p>
         * <ul>
         * <li><strong>01</strong>: precheck.</li>
         * <li><strong>02</strong>: schema migration or initial schema synchronization.</li>
         * <li><strong>03</strong>: full data migration or initial full data synchronization.</li>
         * <li><strong>04</strong>: incremental data migration or synchronization.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>02</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The number of subtasks that failed.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ErrorItem")
        public Integer errorItem;

        /**
         * <p>The subtask ID.</p>
         * 
         * <strong>example:</strong>
         * <p>n0gm1682j6563np</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The name of distributed subtasks associated with the subtask.</p>
         * 
         * <strong>example:</strong>
         * <p>dts.step.struct.load</p>
         */
        @NameInMap("JobName")
        public String jobName;

        /**
         * <p>The subtasks and the progress of each subtask.</p>
         */
        @NameInMap("JobProgress")
        public java.util.List<DescribePreCheckStatusResponseBodySubDistributedJobStatusJobProgress> jobProgress;

        /**
         * <p>The status of the subtask. Valid values:</p>
         * <ul>
         * <li><strong>NotStarted</strong>: The subtask is not started.</li>
         * <li><strong>Suspending</strong>: The subtask is paused.</li>
         * <li><strong>Checking</strong>: The subtask is being checked.</li>
         * <li><strong>Migrating</strong>: The subtask is in progress. Data is being migrated.</li>
         * <li><strong>Failed</strong>: The subtask failed.</li>
         * <li><strong>Catched</strong>: The subtask is in progress. Incremental data is being migrated or synchronized.</li>
         * <li><strong>Finished</strong>: The subtask is complete.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Finished</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The total number of entries that are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
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
