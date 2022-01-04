// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GetQueryResultResponseBody extends TeaModel {
    @NameInMap("Duration")
    public Long duration;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("GmtCreate")
    public String gmtCreate;

    @NameInMap("GmtModified")
    public String gmtModified;

    @NameInMap("Id")
    public String id;

    @NameInMap("JobCompleted")
    public Boolean jobCompleted;

    @NameInMap("Logs")
    public String logs;

    @NameInMap("Owner")
    public Long owner;

    @NameInMap("Progress")
    public Integer progress;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultTmpDb")
    public String resultTmpDb;

    @NameInMap("ResultTmpTable")
    public String resultTmpTable;

    @NameInMap("RowCount")
    public Integer rowCount;

    @NameInMap("RowCountOverLimit")
    public Boolean rowCountOverLimit;

    @NameInMap("Rows")
    public String rows;

    @NameInMap("Schema")
    public String schema;

    @NameInMap("Sql")
    public String sql;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("Status")
    public String status;

    @NameInMap("Success")
    public Boolean success;

    public static GetQueryResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetQueryResultResponseBody self = new GetQueryResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetQueryResultResponseBody setDuration(Long duration) {
        this.duration = duration;
        return this;
    }
    public Long getDuration() {
        return this.duration;
    }

    public GetQueryResultResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetQueryResultResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetQueryResultResponseBody setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public GetQueryResultResponseBody setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public GetQueryResultResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GetQueryResultResponseBody setJobCompleted(Boolean jobCompleted) {
        this.jobCompleted = jobCompleted;
        return this;
    }
    public Boolean getJobCompleted() {
        return this.jobCompleted;
    }

    public GetQueryResultResponseBody setLogs(String logs) {
        this.logs = logs;
        return this;
    }
    public String getLogs() {
        return this.logs;
    }

    public GetQueryResultResponseBody setOwner(Long owner) {
        this.owner = owner;
        return this;
    }
    public Long getOwner() {
        return this.owner;
    }

    public GetQueryResultResponseBody setProgress(Integer progress) {
        this.progress = progress;
        return this;
    }
    public Integer getProgress() {
        return this.progress;
    }

    public GetQueryResultResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetQueryResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetQueryResultResponseBody setResultTmpDb(String resultTmpDb) {
        this.resultTmpDb = resultTmpDb;
        return this;
    }
    public String getResultTmpDb() {
        return this.resultTmpDb;
    }

    public GetQueryResultResponseBody setResultTmpTable(String resultTmpTable) {
        this.resultTmpTable = resultTmpTable;
        return this;
    }
    public String getResultTmpTable() {
        return this.resultTmpTable;
    }

    public GetQueryResultResponseBody setRowCount(Integer rowCount) {
        this.rowCount = rowCount;
        return this;
    }
    public Integer getRowCount() {
        return this.rowCount;
    }

    public GetQueryResultResponseBody setRowCountOverLimit(Boolean rowCountOverLimit) {
        this.rowCountOverLimit = rowCountOverLimit;
        return this;
    }
    public Boolean getRowCountOverLimit() {
        return this.rowCountOverLimit;
    }

    public GetQueryResultResponseBody setRows(String rows) {
        this.rows = rows;
        return this;
    }
    public String getRows() {
        return this.rows;
    }

    public GetQueryResultResponseBody setSchema(String schema) {
        this.schema = schema;
        return this;
    }
    public String getSchema() {
        return this.schema;
    }

    public GetQueryResultResponseBody setSql(String sql) {
        this.sql = sql;
        return this;
    }
    public String getSql() {
        return this.sql;
    }

    public GetQueryResultResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public GetQueryResultResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetQueryResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
