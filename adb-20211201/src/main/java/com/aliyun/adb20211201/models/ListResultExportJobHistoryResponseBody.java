// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ListResultExportJobHistoryResponseBody extends TeaModel {
    /**
     * <p>The operation status code or POP error code.</p>
     * 
     * <strong>example:</strong>
     * <p>InvalidInput</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code returned. A status code of 200 indicates that the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The list details.</p>
     */
    @NameInMap("Items")
    public java.util.List<ListResultExportJobHistoryResponseBodyItems> items;

    /**
     * <p>The additional information about the call result. Valid values:</p>
     * <ul>
     * <li><strong>Ok</strong>: The request is normal.                                </li>
     * <li>Specific error code: An exception occurred.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The page number, which is the same as the value passed in the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries on the current page.</p>
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
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The call was successful.</li>
     * <li><strong>false</strong>: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of entries.</p>
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
         * <p>The ID of the Resource Access Management (RAM) user.</p>
         * 
         * <strong>example:</strong>
         * <p>120010511678****</p>
         */
        @NameInMap("AliUid")
        public String aliUid;

        /**
         * <p>The time when the result set export task was created. Specify the time in the <i>yyyy-mm-ddThh:mm:ssZ</i> format. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-04-01T09:50:18Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The ID of the AnalyticDB for MySQL Data Lakehouse Edition (3.0) cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>amv-7xv5ty5m9o4v****</p>
         */
        @NameInMap("DBClusterId")
        public String DBClusterId;

        /**
         * <p>The name of the database account associated with the Resource Access Management (RAM) user.</p>
         * 
         * <strong>example:</strong>
         * <p>ram_user</p>
         */
        @NameInMap("DatabaseUser")
        public String databaseUser;

        /**
         * <p>The end time of the query. Specify the time in the <i>yyyy-MM-ddTHH:mm:ssZ</i> format. The time must be in UTC.</p>
         * <blockquote>
         * <p>The end time must be later than the start time.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2023-06-15T02:13:00Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The engine used to execute the task. Only XIHE is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>XIHE</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <p>The unique identifier of the result set export task.</p>
         * 
         * <strong>example:</strong>
         * <p>export_2024051319271219802100800401300****</p>
         */
        @NameInMap("ExportJobId")
        public String exportJobId;

        /**
         * <p>The complete address of the result set.</p>
         */
        @NameInMap("ExportPath")
        public String exportPath;

        /**
         * <p>The number of exported rows. This parameter is returned only when the operation call is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("ExportRows")
        public String exportRows;

        /**
         * <p>The export type.</p>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("ExportType")
        public String exportType;

        /**
         * <p>Indicates whether the task has expired. Valid values:</p>
         * <ul>
         * <li><strong>false</strong>: The task has not expired.</li>
         * <li><strong>true</strong>: The task has expired.</li>
         * </ul>
         */
        @NameInMap("IsExpired")
        public Boolean isExpired;

        /**
         * <p>The error message of the SQL execution for the result set export. This message is returned only when the task fails.</p>
         * 
         * <strong>example:</strong>
         * <p>Failed to execute SQL</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The SQL query ID returned for diagnostics.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/612495.html">DescribeDiagnosisSQLInfo</a> operation to diagnose the query.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>202306121421111720161451770345339****</p>
         */
        @NameInMap("ProcessId")
        public String processId;

        /**
         * <p>The export progress. Unit: percentage (%). Valid values: 0 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>The resource group in which the task is executed.</p>
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
         * <p>The details of the SQL statement used in the result set export task.</p>
         * 
         * <strong>example:</strong>
         * <p>SELECT * FROM <code>ADB_SampleData_TPCH</code>.<code>supplier</code> LIMIT 20</p>
         */
        @NameInMap("Sql")
        public String sql;

        /**
         * <p>The start time of the task. Specify the time in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-07-03T04:00:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The execution status of the export task. Valid values:</p>
         * <ol>
         * <li><strong>SUBMITTED</strong>: The task is submitted.</li>
         * <li><strong>RUNNING</strong>: The task is running.</li>
         * <li><strong>SUCCEEDED</strong>: The task succeeded.</li>
         * <li><strong>FAILED</strong>: The task failed.</li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The time consumed for data export, in milliseconds.</p>
         * <blockquote>
         * <p>The time is calculated from the start of the data export task to the end of the export.</p>
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
