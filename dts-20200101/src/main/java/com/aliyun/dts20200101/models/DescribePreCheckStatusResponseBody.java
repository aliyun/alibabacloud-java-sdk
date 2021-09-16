// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribePreCheckStatusResponseBody extends TeaModel {
    @NameInMap("State")
    public String state;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("PageRecordCount")
    public Long pageRecordCount;

    @NameInMap("Total")
    public Integer total;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("JobName")
    public String jobName;

    @NameInMap("JobId")
    public String jobId;

    @NameInMap("ErrorItem")
    public Integer errorItem;

    @NameInMap("TotalRecordCount")
    public Long totalRecordCount;

    @NameInMap("Code")
    public String code;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("JobProgress")
    public java.util.List<DescribePreCheckStatusResponseBodyJobProgress> jobProgress;

    @NameInMap("SubDistributedJobStatus")
    public java.util.List<DescribePreCheckStatusResponseBodySubDistributedJobStatus> subDistributedJobStatus;

    public static DescribePreCheckStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePreCheckStatusResponseBody self = new DescribePreCheckStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePreCheckStatusResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public DescribePreCheckStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribePreCheckStatusResponseBody setPageRecordCount(Long pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Long getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribePreCheckStatusResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public DescribePreCheckStatusResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribePreCheckStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePreCheckStatusResponseBody setJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }
    public String getJobName() {
        return this.jobName;
    }

    public DescribePreCheckStatusResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public DescribePreCheckStatusResponseBody setErrorItem(Integer errorItem) {
        this.errorItem = errorItem;
        return this;
    }
    public Integer getErrorItem() {
        return this.errorItem;
    }

    public DescribePreCheckStatusResponseBody setTotalRecordCount(Long totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Long getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public DescribePreCheckStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribePreCheckStatusResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribePreCheckStatusResponseBody setJobProgress(java.util.List<DescribePreCheckStatusResponseBodyJobProgress> jobProgress) {
        this.jobProgress = jobProgress;
        return this;
    }
    public java.util.List<DescribePreCheckStatusResponseBodyJobProgress> getJobProgress() {
        return this.jobProgress;
    }

    public DescribePreCheckStatusResponseBody setSubDistributedJobStatus(java.util.List<DescribePreCheckStatusResponseBodySubDistributedJobStatus> subDistributedJobStatus) {
        this.subDistributedJobStatus = subDistributedJobStatus;
        return this;
    }
    public java.util.List<DescribePreCheckStatusResponseBodySubDistributedJobStatus> getSubDistributedJobStatus() {
        return this.subDistributedJobStatus;
    }

    public static class DescribePreCheckStatusResponseBodyJobProgressLogs extends TeaModel {
        @NameInMap("ErrData")
        public String errData;

        @NameInMap("ErrMsg")
        public String errMsg;

        @NameInMap("LogLevel")
        public String logLevel;

        @NameInMap("ErrType")
        public String errType;

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

        public DescribePreCheckStatusResponseBodyJobProgressLogs setLogLevel(String logLevel) {
            this.logLevel = logLevel;
            return this;
        }
        public String getLogLevel() {
            return this.logLevel;
        }

        public DescribePreCheckStatusResponseBodyJobProgressLogs setErrType(String errType) {
            this.errType = errType;
            return this;
        }
        public String getErrType() {
            return this.errType;
        }

    }

    public static class DescribePreCheckStatusResponseBodyJobProgress extends TeaModel {
        @NameInMap("Skip")
        public Boolean skip;

        @NameInMap("FinishTime")
        public String finishTime;

        @NameInMap("IgnoreFlag")
        public String ignoreFlag;

        @NameInMap("DelaySeconds")
        public Integer delaySeconds;

        @NameInMap("DdlSql")
        public String ddlSql;

        @NameInMap("State")
        public String state;

        @NameInMap("BootTime")
        public String bootTime;

        @NameInMap("Item")
        public String item;

        @NameInMap("Sub")
        public String sub;

        @NameInMap("Total")
        public Integer total;

        @NameInMap("TargetNames")
        public String targetNames;

        @NameInMap("CanSkip")
        public Boolean canSkip;

        @NameInMap("Names")
        public String names;

        @NameInMap("ErrDetail")
        public String errDetail;

        @NameInMap("DiffRow")
        public Long diffRow;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("SourceSchema")
        public String sourceSchema;

        @NameInMap("DestSchema")
        public String destSchema;

        @NameInMap("ParentObj")
        public String parentObj;

        @NameInMap("ErrMsg")
        public String errMsg;

        @NameInMap("OrderNum")
        public Integer orderNum;

        @NameInMap("RepairMethod")
        public String repairMethod;

        @NameInMap("Id")
        public String id;

        @NameInMap("Logs")
        public java.util.List<DescribePreCheckStatusResponseBodyJobProgressLogs> logs;

        public static DescribePreCheckStatusResponseBodyJobProgress build(java.util.Map<String, ?> map) throws Exception {
            DescribePreCheckStatusResponseBodyJobProgress self = new DescribePreCheckStatusResponseBodyJobProgress();
            return TeaModel.build(map, self);
        }

        public DescribePreCheckStatusResponseBodyJobProgress setSkip(Boolean skip) {
            this.skip = skip;
            return this;
        }
        public Boolean getSkip() {
            return this.skip;
        }

        public DescribePreCheckStatusResponseBodyJobProgress setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public DescribePreCheckStatusResponseBodyJobProgress setIgnoreFlag(String ignoreFlag) {
            this.ignoreFlag = ignoreFlag;
            return this;
        }
        public String getIgnoreFlag() {
            return this.ignoreFlag;
        }

        public DescribePreCheckStatusResponseBodyJobProgress setDelaySeconds(Integer delaySeconds) {
            this.delaySeconds = delaySeconds;
            return this;
        }
        public Integer getDelaySeconds() {
            return this.delaySeconds;
        }

        public DescribePreCheckStatusResponseBodyJobProgress setDdlSql(String ddlSql) {
            this.ddlSql = ddlSql;
            return this;
        }
        public String getDdlSql() {
            return this.ddlSql;
        }

        public DescribePreCheckStatusResponseBodyJobProgress setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribePreCheckStatusResponseBodyJobProgress setBootTime(String bootTime) {
            this.bootTime = bootTime;
            return this;
        }
        public String getBootTime() {
            return this.bootTime;
        }

        public DescribePreCheckStatusResponseBodyJobProgress setItem(String item) {
            this.item = item;
            return this;
        }
        public String getItem() {
            return this.item;
        }

        public DescribePreCheckStatusResponseBodyJobProgress setSub(String sub) {
            this.sub = sub;
            return this;
        }
        public String getSub() {
            return this.sub;
        }

        public DescribePreCheckStatusResponseBodyJobProgress setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public DescribePreCheckStatusResponseBodyJobProgress setTargetNames(String targetNames) {
            this.targetNames = targetNames;
            return this;
        }
        public String getTargetNames() {
            return this.targetNames;
        }

        public DescribePreCheckStatusResponseBodyJobProgress setCanSkip(Boolean canSkip) {
            this.canSkip = canSkip;
            return this;
        }
        public Boolean getCanSkip() {
            return this.canSkip;
        }

        public DescribePreCheckStatusResponseBodyJobProgress setNames(String names) {
            this.names = names;
            return this;
        }
        public String getNames() {
            return this.names;
        }

        public DescribePreCheckStatusResponseBodyJobProgress setErrDetail(String errDetail) {
            this.errDetail = errDetail;
            return this;
        }
        public String getErrDetail() {
            return this.errDetail;
        }

        public DescribePreCheckStatusResponseBodyJobProgress setDiffRow(Long diffRow) {
            this.diffRow = diffRow;
            return this;
        }
        public Long getDiffRow() {
            return this.diffRow;
        }

        public DescribePreCheckStatusResponseBodyJobProgress setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public DescribePreCheckStatusResponseBodyJobProgress setSourceSchema(String sourceSchema) {
            this.sourceSchema = sourceSchema;
            return this;
        }
        public String getSourceSchema() {
            return this.sourceSchema;
        }

        public DescribePreCheckStatusResponseBodyJobProgress setDestSchema(String destSchema) {
            this.destSchema = destSchema;
            return this;
        }
        public String getDestSchema() {
            return this.destSchema;
        }

        public DescribePreCheckStatusResponseBodyJobProgress setParentObj(String parentObj) {
            this.parentObj = parentObj;
            return this;
        }
        public String getParentObj() {
            return this.parentObj;
        }

        public DescribePreCheckStatusResponseBodyJobProgress setErrMsg(String errMsg) {
            this.errMsg = errMsg;
            return this;
        }
        public String getErrMsg() {
            return this.errMsg;
        }

        public DescribePreCheckStatusResponseBodyJobProgress setOrderNum(Integer orderNum) {
            this.orderNum = orderNum;
            return this;
        }
        public Integer getOrderNum() {
            return this.orderNum;
        }

        public DescribePreCheckStatusResponseBodyJobProgress setRepairMethod(String repairMethod) {
            this.repairMethod = repairMethod;
            return this;
        }
        public String getRepairMethod() {
            return this.repairMethod;
        }

        public DescribePreCheckStatusResponseBodyJobProgress setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribePreCheckStatusResponseBodyJobProgress setLogs(java.util.List<DescribePreCheckStatusResponseBodyJobProgressLogs> logs) {
            this.logs = logs;
            return this;
        }
        public java.util.List<DescribePreCheckStatusResponseBodyJobProgressLogs> getLogs() {
            return this.logs;
        }

    }

    public static class DescribePreCheckStatusResponseBodySubDistributedJobStatusJobProgressLogs extends TeaModel {
        @NameInMap("ErrData")
        public String errData;

        @NameInMap("ErrMsg")
        public String errMsg;

        @NameInMap("LogLevel")
        public String logLevel;

        @NameInMap("ErrType")
        public String errType;

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

        public DescribePreCheckStatusResponseBodySubDistributedJobStatusJobProgressLogs setLogLevel(String logLevel) {
            this.logLevel = logLevel;
            return this;
        }
        public String getLogLevel() {
            return this.logLevel;
        }

        public DescribePreCheckStatusResponseBodySubDistributedJobStatusJobProgressLogs setErrType(String errType) {
            this.errType = errType;
            return this;
        }
        public String getErrType() {
            return this.errType;
        }

    }

    public static class DescribePreCheckStatusResponseBodySubDistributedJobStatusJobProgress extends TeaModel {
        @NameInMap("Skip")
        public Boolean skip;

        @NameInMap("FinishTime")
        public String finishTime;

        @NameInMap("IgnoreFlag")
        public String ignoreFlag;

        @NameInMap("DelaySeconds")
        public Integer delaySeconds;

        @NameInMap("DdlSql")
        public String ddlSql;

        @NameInMap("State")
        public String state;

        @NameInMap("BootTime")
        public String bootTime;

        @NameInMap("Item")
        public String item;

        @NameInMap("Sub")
        public String sub;

        @NameInMap("Total")
        public Integer total;

        @NameInMap("TargetNames")
        public String targetNames;

        @NameInMap("CanSkip")
        public Boolean canSkip;

        @NameInMap("Names")
        public String names;

        @NameInMap("ErrDetail")
        public String errDetail;

        @NameInMap("DiffRow")
        public Long diffRow;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("SourceSchema")
        public String sourceSchema;

        @NameInMap("DestSchema")
        public String destSchema;

        @NameInMap("ParentObj")
        public String parentObj;

        @NameInMap("ErrMsg")
        public String errMsg;

        @NameInMap("OrderNum")
        public Integer orderNum;

        @NameInMap("RepairMethod")
        public String repairMethod;

        @NameInMap("Id")
        public String id;

        @NameInMap("Logs")
        public java.util.List<DescribePreCheckStatusResponseBodySubDistributedJobStatusJobProgressLogs> logs;

        public static DescribePreCheckStatusResponseBodySubDistributedJobStatusJobProgress build(java.util.Map<String, ?> map) throws Exception {
            DescribePreCheckStatusResponseBodySubDistributedJobStatusJobProgress self = new DescribePreCheckStatusResponseBodySubDistributedJobStatusJobProgress();
            return TeaModel.build(map, self);
        }

        public DescribePreCheckStatusResponseBodySubDistributedJobStatusJobProgress setSkip(Boolean skip) {
            this.skip = skip;
            return this;
        }
        public Boolean getSkip() {
            return this.skip;
        }

        public DescribePreCheckStatusResponseBodySubDistributedJobStatusJobProgress setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public DescribePreCheckStatusResponseBodySubDistributedJobStatusJobProgress setIgnoreFlag(String ignoreFlag) {
            this.ignoreFlag = ignoreFlag;
            return this;
        }
        public String getIgnoreFlag() {
            return this.ignoreFlag;
        }

        public DescribePreCheckStatusResponseBodySubDistributedJobStatusJobProgress setDelaySeconds(Integer delaySeconds) {
            this.delaySeconds = delaySeconds;
            return this;
        }
        public Integer getDelaySeconds() {
            return this.delaySeconds;
        }

        public DescribePreCheckStatusResponseBodySubDistributedJobStatusJobProgress setDdlSql(String ddlSql) {
            this.ddlSql = ddlSql;
            return this;
        }
        public String getDdlSql() {
            return this.ddlSql;
        }

        public DescribePreCheckStatusResponseBodySubDistributedJobStatusJobProgress setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribePreCheckStatusResponseBodySubDistributedJobStatusJobProgress setBootTime(String bootTime) {
            this.bootTime = bootTime;
            return this;
        }
        public String getBootTime() {
            return this.bootTime;
        }

        public DescribePreCheckStatusResponseBodySubDistributedJobStatusJobProgress setItem(String item) {
            this.item = item;
            return this;
        }
        public String getItem() {
            return this.item;
        }

        public DescribePreCheckStatusResponseBodySubDistributedJobStatusJobProgress setSub(String sub) {
            this.sub = sub;
            return this;
        }
        public String getSub() {
            return this.sub;
        }

        public DescribePreCheckStatusResponseBodySubDistributedJobStatusJobProgress setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public DescribePreCheckStatusResponseBodySubDistributedJobStatusJobProgress setTargetNames(String targetNames) {
            this.targetNames = targetNames;
            return this;
        }
        public String getTargetNames() {
            return this.targetNames;
        }

        public DescribePreCheckStatusResponseBodySubDistributedJobStatusJobProgress setCanSkip(Boolean canSkip) {
            this.canSkip = canSkip;
            return this;
        }
        public Boolean getCanSkip() {
            return this.canSkip;
        }

        public DescribePreCheckStatusResponseBodySubDistributedJobStatusJobProgress setNames(String names) {
            this.names = names;
            return this;
        }
        public String getNames() {
            return this.names;
        }

        public DescribePreCheckStatusResponseBodySubDistributedJobStatusJobProgress setErrDetail(String errDetail) {
            this.errDetail = errDetail;
            return this;
        }
        public String getErrDetail() {
            return this.errDetail;
        }

        public DescribePreCheckStatusResponseBodySubDistributedJobStatusJobProgress setDiffRow(Long diffRow) {
            this.diffRow = diffRow;
            return this;
        }
        public Long getDiffRow() {
            return this.diffRow;
        }

        public DescribePreCheckStatusResponseBodySubDistributedJobStatusJobProgress setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public DescribePreCheckStatusResponseBodySubDistributedJobStatusJobProgress setSourceSchema(String sourceSchema) {
            this.sourceSchema = sourceSchema;
            return this;
        }
        public String getSourceSchema() {
            return this.sourceSchema;
        }

        public DescribePreCheckStatusResponseBodySubDistributedJobStatusJobProgress setDestSchema(String destSchema) {
            this.destSchema = destSchema;
            return this;
        }
        public String getDestSchema() {
            return this.destSchema;
        }

        public DescribePreCheckStatusResponseBodySubDistributedJobStatusJobProgress setParentObj(String parentObj) {
            this.parentObj = parentObj;
            return this;
        }
        public String getParentObj() {
            return this.parentObj;
        }

        public DescribePreCheckStatusResponseBodySubDistributedJobStatusJobProgress setErrMsg(String errMsg) {
            this.errMsg = errMsg;
            return this;
        }
        public String getErrMsg() {
            return this.errMsg;
        }

        public DescribePreCheckStatusResponseBodySubDistributedJobStatusJobProgress setOrderNum(Integer orderNum) {
            this.orderNum = orderNum;
            return this;
        }
        public Integer getOrderNum() {
            return this.orderNum;
        }

        public DescribePreCheckStatusResponseBodySubDistributedJobStatusJobProgress setRepairMethod(String repairMethod) {
            this.repairMethod = repairMethod;
            return this;
        }
        public String getRepairMethod() {
            return this.repairMethod;
        }

        public DescribePreCheckStatusResponseBodySubDistributedJobStatusJobProgress setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribePreCheckStatusResponseBodySubDistributedJobStatusJobProgress setLogs(java.util.List<DescribePreCheckStatusResponseBodySubDistributedJobStatusJobProgressLogs> logs) {
            this.logs = logs;
            return this;
        }
        public java.util.List<DescribePreCheckStatusResponseBodySubDistributedJobStatusJobProgressLogs> getLogs() {
            return this.logs;
        }

    }

    public static class DescribePreCheckStatusResponseBodySubDistributedJobStatus extends TeaModel {
        @NameInMap("JobName")
        public String jobName;

        @NameInMap("State")
        public String state;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("ErrorItem")
        public Integer errorItem;

        @NameInMap("Code")
        public String code;

        @NameInMap("Total")
        public Integer total;

        @NameInMap("JobProgress")
        public java.util.List<DescribePreCheckStatusResponseBodySubDistributedJobStatusJobProgress> jobProgress;

        public static DescribePreCheckStatusResponseBodySubDistributedJobStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribePreCheckStatusResponseBodySubDistributedJobStatus self = new DescribePreCheckStatusResponseBodySubDistributedJobStatus();
            return TeaModel.build(map, self);
        }

        public DescribePreCheckStatusResponseBodySubDistributedJobStatus setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public DescribePreCheckStatusResponseBodySubDistributedJobStatus setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribePreCheckStatusResponseBodySubDistributedJobStatus setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public DescribePreCheckStatusResponseBodySubDistributedJobStatus setErrorItem(Integer errorItem) {
            this.errorItem = errorItem;
            return this;
        }
        public Integer getErrorItem() {
            return this.errorItem;
        }

        public DescribePreCheckStatusResponseBodySubDistributedJobStatus setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribePreCheckStatusResponseBodySubDistributedJobStatus setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public DescribePreCheckStatusResponseBodySubDistributedJobStatus setJobProgress(java.util.List<DescribePreCheckStatusResponseBodySubDistributedJobStatusJobProgress> jobProgress) {
            this.jobProgress = jobProgress;
            return this;
        }
        public java.util.List<DescribePreCheckStatusResponseBodySubDistributedJobStatusJobProgress> getJobProgress() {
            return this.jobProgress;
        }

    }

}
