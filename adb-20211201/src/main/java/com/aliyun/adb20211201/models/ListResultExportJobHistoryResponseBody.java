// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ListResultExportJobHistoryResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>InvalidInput</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response code. The status code 200 indicates that the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The queried result set export jobs.</p>
     */
    @NameInMap("Items")
    public java.util.List<ListResultExportJobHistoryResponseBodyItems> items;

    /**
     * <p>The returned message. Valid values:</p>
     * <ul>
     * <li>If the request was successful, an <strong>OK</strong> message is returned.</li>
     * <li>If the request failed, an error message is returned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>174</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListResultExportJobHistoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListResultExportJobHistoryResponseBody self = new ListResultExportJobHistoryResponseBody();
        return TeaModel.build(map, self);
    }

    public ListResultExportJobHistoryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListResultExportJobHistoryResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListResultExportJobHistoryResponseBody setItems(java.util.List<ListResultExportJobHistoryResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListResultExportJobHistoryResponseBodyItems> getItems() {
        return this.items;
    }

    public ListResultExportJobHistoryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListResultExportJobHistoryResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListResultExportJobHistoryResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListResultExportJobHistoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListResultExportJobHistoryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListResultExportJobHistoryResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListResultExportJobHistoryResponseBodyItems extends TeaModel {
        /**
         * <p>The RAM user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>120010511678****</p>
         */
        @NameInMap("AliUid")
        public String aliUid;

        /**
         * <p>The time when the result set export job was created. The time follows the ISO 8601 standard in the <em>yyyy-mm-ddThh:mm:ssZ</em> format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-04-01T09:50:18Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The ID of the AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>amv-7xv5ty5m9o4v****</p>
         */
        @NameInMap("DBClusterId")
        public String DBClusterId;

        /**
         * <p>The name of the database account that is associated with the RAM user.</p>
         * 
         * <strong>example:</strong>
         * <p>ram_user</p>
         */
        @NameInMap("DatabaseUser")
        public String databaseUser;

        /**
         * <p>The end time of the result set export job. The time follows the ISO 8601 standard in the <em>yyyy-MM-ddTHH:mm:ssZ</em> format. The time is displayed in UTC.</p>
         * <blockquote>
         * <p> The end time must be later than the start time.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2023-06-15T02:13:00Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The engine that is used to execute the result set export job. Only XIHE is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>XIHE</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <p>The unique identifier of the result set export job.</p>
         * 
         * <strong>example:</strong>
         * <p>export_2024051319271219802100800401300****</p>
         */
        @NameInMap("ExportJobId")
        public String exportJobId;

        /**
         * <p>The complete URL of the path to store the exported result set.</p>
         */
        @NameInMap("ExportPath")
        public String exportPath;

        /**
         * <p>The number of exported rows. This parameter is returned only when the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("ExportRows")
        public String exportRows;

        /**
         * <p>The type of the result set export job.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("ExportType")
        public String exportType;

        /**
         * <p>Indicates whether the result set export job has expired. Valid values:</p>
         * <ul>
         * <li><strong>false</strong></li>
         * <li><strong>true</strong></li>
         * </ul>
         */
        @NameInMap("IsExpired")
        public Boolean isExpired;

        /**
         * <p>The returned message. This parameter is returned only when the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>Failed to execute SQL</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The query ID that can be used for diagnostics.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/612337.html">DescribeDiagnosisSQLInfo</a> operation to query the execution information about a query.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>202306121421111720161451770345339****</p>
         */
        @NameInMap("ProcessId")
        public String processId;

        /**
         * <p>The progress of the result set export job. Unit: %. Valid values: 0 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>The name of the resource group that runs the result set export job.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ResourceGroup")
        public String resourceGroup;

        /**
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>lake_db</p>
         */
        @NameInMap("Schema")
        public String schema;

        /**
         * <p>The SQL statement that is used in the result set export job.</p>
         * 
         * <strong>example:</strong>
         * <p>SELECT * FROM <code>ADB_SampleData_TPCH</code>.<code>supplier</code> LIMIT 20</p>
         */
        @NameInMap("Sql")
        public String sql;

        /**
         * <p>The start time of the result set export job. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-07-03T04:00:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The execution status of the result set export job. Valid values:</p>
         * <ol>
         * <li><strong>SUBMITTED</strong></li>
         * <li><strong>RUNNING</strong></li>
         * <li><strong>SUCCEEDED</strong></li>
         * <li><strong>FAILED</strong></li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The amount of time consumed to export execution records. Unit: milliseconds.</p>
         * <blockquote>
         * <p> The value is the duration between the time when the result set export job starts and the time when the result set export job ends.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>560</p>
         */
        @NameInMap("TimeCost")
        public Long timeCost;

        public static ListResultExportJobHistoryResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListResultExportJobHistoryResponseBodyItems self = new ListResultExportJobHistoryResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListResultExportJobHistoryResponseBodyItems setAliUid(String aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public String getAliUid() {
            return this.aliUid;
        }

        public ListResultExportJobHistoryResponseBodyItems setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListResultExportJobHistoryResponseBodyItems setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public ListResultExportJobHistoryResponseBodyItems setDatabaseUser(String databaseUser) {
            this.databaseUser = databaseUser;
            return this;
        }
        public String getDatabaseUser() {
            return this.databaseUser;
        }

        public ListResultExportJobHistoryResponseBodyItems setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListResultExportJobHistoryResponseBodyItems setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public ListResultExportJobHistoryResponseBodyItems setExportJobId(String exportJobId) {
            this.exportJobId = exportJobId;
            return this;
        }
        public String getExportJobId() {
            return this.exportJobId;
        }

        public ListResultExportJobHistoryResponseBodyItems setExportPath(String exportPath) {
            this.exportPath = exportPath;
            return this;
        }
        public String getExportPath() {
            return this.exportPath;
        }

        public ListResultExportJobHistoryResponseBodyItems setExportRows(String exportRows) {
            this.exportRows = exportRows;
            return this;
        }
        public String getExportRows() {
            return this.exportRows;
        }

        public ListResultExportJobHistoryResponseBodyItems setExportType(String exportType) {
            this.exportType = exportType;
            return this;
        }
        public String getExportType() {
            return this.exportType;
        }

        public ListResultExportJobHistoryResponseBodyItems setIsExpired(Boolean isExpired) {
            this.isExpired = isExpired;
            return this;
        }
        public Boolean getIsExpired() {
            return this.isExpired;
        }

        public ListResultExportJobHistoryResponseBodyItems setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListResultExportJobHistoryResponseBodyItems setProcessId(String processId) {
            this.processId = processId;
            return this;
        }
        public String getProcessId() {
            return this.processId;
        }

        public ListResultExportJobHistoryResponseBodyItems setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public ListResultExportJobHistoryResponseBodyItems setResourceGroup(String resourceGroup) {
            this.resourceGroup = resourceGroup;
            return this;
        }
        public String getResourceGroup() {
            return this.resourceGroup;
        }

        public ListResultExportJobHistoryResponseBodyItems setSchema(String schema) {
            this.schema = schema;
            return this;
        }
        public String getSchema() {
            return this.schema;
        }

        public ListResultExportJobHistoryResponseBodyItems setSql(String sql) {
            this.sql = sql;
            return this;
        }
        public String getSql() {
            return this.sql;
        }

        public ListResultExportJobHistoryResponseBodyItems setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListResultExportJobHistoryResponseBodyItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListResultExportJobHistoryResponseBodyItems setTimeCost(Long timeCost) {
            this.timeCost = timeCost;
            return this;
        }
        public Long getTimeCost() {
            return this.timeCost;
        }

    }

}
