// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DownloadSQLLogsRecordsRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <br>
     * <p>> You can call the [DescribeDBInstances](https://help.aliyun.com/document_detail/86911.html) operation to query the information about all AnalyticDB for PostgreSQL instances within a region, including instance IDs.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The name of the database.</p>
     */
    @NameInMap("Database")
    public String database;

    /**
     * <p>The end of the time range to query. Specify the time in the yyyy-MM-ddTHH:mm:ssZ format. The end time must be later than the start time.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The execution duration of the SQL statement. Unit: seconds.</p>
     */
    @NameInMap("ExecuteCost")
    public String executeCost;

    /**
     * <p>The execution status of the SQL statement.</p>
     * <br>
     * <p>*   **1**: successful.</p>
     * <p>*   **0**: failed.</p>
     */
    @NameInMap("ExecuteState")
    public String executeState;

    /**
     * <p>The language of the file that contains the query diagnostic information. Valid values:</p>
     * <br>
     * <p>*   **zh**: simplified Chinese.</p>
     * <p>*   **en**: English.</p>
     * <p>*   **ja**: Japanese.</p>
     * <p>*   **zh-tw**: traditional Chinese.</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The maximum amount of time consumed by a slow query. Unit: seconds. Minimum value: 0.</p>
     */
    @NameInMap("MaxExecuteCost")
    public String maxExecuteCost;

    /**
     * <p>The minimum amount of time consumed by a slow query. Unit: seconds. Minimum value: 0.</p>
     */
    @NameInMap("MinExecuteCost")
    public String minExecuteCost;

    /**
     * <p>The type of the query language. Example: DQL, DML, or DDL.</p>
     */
    @NameInMap("OperationClass")
    public String operationClass;

    /**
     * <p>The type of the SQL statement. Example: SELECT.</p>
     */
    @NameInMap("OperationType")
    public String operationType;

    /**
     * <p>The page number. Pages start from page 1. Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values:</p>
     * <br>
     * <p>*   **30**</p>
     * <p>*   **50**</p>
     * <p>*   **100**</p>
     * <br>
     * <p>Default value: **30**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The keywords that are used for query.</p>
     */
    @NameInMap("QueryKeywords")
    public String queryKeywords;

    /**
     * <p>The source IP address.</p>
     */
    @NameInMap("SourceIP")
    public String sourceIP;

    /**
     * <p>The beginning of the time range to query. Specify the time in the yyyy-MM-ddTHH:mmZ format. The time must be in UTC.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The name of the database account.</p>
     */
    @NameInMap("User")
    public String user;

    public static DownloadSQLLogsRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        DownloadSQLLogsRecordsRequest self = new DownloadSQLLogsRecordsRequest();
        return TeaModel.build(map, self);
    }

    public DownloadSQLLogsRecordsRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DownloadSQLLogsRecordsRequest setDatabase(String database) {
        this.database = database;
        return this;
    }
    public String getDatabase() {
        return this.database;
    }

    public DownloadSQLLogsRecordsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DownloadSQLLogsRecordsRequest setExecuteCost(String executeCost) {
        this.executeCost = executeCost;
        return this;
    }
    public String getExecuteCost() {
        return this.executeCost;
    }

    public DownloadSQLLogsRecordsRequest setExecuteState(String executeState) {
        this.executeState = executeState;
        return this;
    }
    public String getExecuteState() {
        return this.executeState;
    }

    public DownloadSQLLogsRecordsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DownloadSQLLogsRecordsRequest setMaxExecuteCost(String maxExecuteCost) {
        this.maxExecuteCost = maxExecuteCost;
        return this;
    }
    public String getMaxExecuteCost() {
        return this.maxExecuteCost;
    }

    public DownloadSQLLogsRecordsRequest setMinExecuteCost(String minExecuteCost) {
        this.minExecuteCost = minExecuteCost;
        return this;
    }
    public String getMinExecuteCost() {
        return this.minExecuteCost;
    }

    public DownloadSQLLogsRecordsRequest setOperationClass(String operationClass) {
        this.operationClass = operationClass;
        return this;
    }
    public String getOperationClass() {
        return this.operationClass;
    }

    public DownloadSQLLogsRecordsRequest setOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }
    public String getOperationType() {
        return this.operationType;
    }

    public DownloadSQLLogsRecordsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DownloadSQLLogsRecordsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DownloadSQLLogsRecordsRequest setQueryKeywords(String queryKeywords) {
        this.queryKeywords = queryKeywords;
        return this;
    }
    public String getQueryKeywords() {
        return this.queryKeywords;
    }

    public DownloadSQLLogsRecordsRequest setSourceIP(String sourceIP) {
        this.sourceIP = sourceIP;
        return this;
    }
    public String getSourceIP() {
        return this.sourceIP;
    }

    public DownloadSQLLogsRecordsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DownloadSQLLogsRecordsRequest setUser(String user) {
        this.user = user;
        return this;
    }
    public String getUser() {
        return this.user;
    }

}
