// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GetQueryResultResponseBody extends TeaModel {
    /**
     * <p>up time in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>8000</p>
     */
    @NameInMap("Duration")
    public Long duration;

    /**
     * <p>The time when the query was completed.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-05-09 16:19:09</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The error message of the query.</p>
     * 
     * <strong>example:</strong>
     * <p>Table or view not found:</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The time when the query was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-05-09 16:18:09</p>
     */
    @NameInMap("GmtCreate")
    public String gmtCreate;

    /**
     * <p>The time when the query result was updated.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-05-09 16:19:09</p>
     */
    @NameInMap("GmtModified")
    public String gmtModified;

    /**
     * <p>The query ID.</p>
     * 
     * <strong>example:</strong>
     * <p>Q-41676378709440CE</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>Whether the query has been completed. false indicates that you need to continue polling this interface.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("JobCompleted")
    public Boolean jobCompleted;

    /**
     * <p>Run logs.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;this is log&quot;]</p>
     */
    @NameInMap("Logs")
    public String logs;

    /**
     * <p>The uid of the primary account of the creator.</p>
     * 
     * <strong>example:</strong>
     * <p>229167306180609***</p>
     */
    @NameInMap("Owner")
    public Long owner;

    /**
     * <p>The progress of the query. The value ranges from 0 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>99</p>
     */
    @NameInMap("Progress")
    public Integer progress;

    /**
     * <p>The region ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1D2BCFBA-7639-59A9-817B-944EC1339279</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The result temporary library is not available.</p>
     * 
     * <strong>example:</strong>
     * <p>db</p>
     */
    @NameInMap("ResultTmpDb")
    public String resultTmpDb;

    /**
     * <p>The result temporary table, which is not available.</p>
     * 
     * <strong>example:</strong>
     * <p>table</p>
     */
    @NameInMap("ResultTmpTable")
    public String resultTmpTable;

    /**
     * <p>The total number of rows in the result. This parameter is returned only when the status is AVAILABLE.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("RowCount")
    public Integer rowCount;

    /**
     * <p>Whether the total number of rows in the result exceeds the maximum value.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("RowCountOverLimit")
    public Boolean rowCountOverLimit;

    /**
     * <p>The returned result. This value is returned only when the status is AVAILABLE. The content is represented as a two-dimensional JSON array.</p>
     * 
     * <strong>example:</strong>
     * <p>[[10,&quot;Tom&quot;],[11,&quot;Jerry&quot;]]</p>
     */
    @NameInMap("Rows")
    public String rows;

    /**
     * <p>The header field and type of the query result. This parameter is returned only when the status is AVAILABLE.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;name&quot;:&quot;id&quot;,&quot;type&quot;:&quot;INT&quot;},{&quot;name&quot;:&quot;student_name&quot;,&quot;type&quot;:&quot;VARCHAR&quot;}]</p>
     */
    @NameInMap("Schema")
    public String schema;

    /**
     * <p>The original SQL statement.</p>
     * 
     * <strong>example:</strong>
     * <p>select * from db.student</p>
     */
    @NameInMap("Sql")
    public String sql;

    /**
     * <p>The point in time when the query was initiated.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-05-09 16:18:09</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The query status.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>AVAILABLE</li>
     * <li>CANCELLED: The has canceled the.</li>
     * <li></li>
     * <li>CANCELLING: The is being canceled.</li>
     * <li>WAITING: The is waiting for.</li>
     * <li>ERROR</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AVAILABLE</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total amount of data scanned. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("TotalBytesProcessed")
    public Long totalBytesProcessed;

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

    public GetQueryResultResponseBody setTotalBytesProcessed(Long totalBytesProcessed) {
        this.totalBytesProcessed = totalBytesProcessed;
        return this;
    }
    public Long getTotalBytesProcessed() {
        return this.totalBytesProcessed;
    }

}
