// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeSQLLogsRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query the IDs of all AnalyticDB for PostgreSQL instances within a region.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-xxxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The name of the database.</p>
     * 
     * <strong>example:</strong>
     * <p>adbpgadmin</p>
     */
    @NameInMap("Database")
    public String database;

    /**
     * <p>The end of the time range to query. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-ddTHH:mmZ</em> format. The time must be in UTC.</p>
     * <blockquote>
     * <p>The end time must be later than the start time. The maximum time range that can be specified is seven days.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-03-17T06:30Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The execution duration of the SQL statement. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ExecuteCost")
    public String executeCost;

    /**
     * <p>The execution status of the SQL statement. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: successful.</li>
     * <li><strong>0</strong>: failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("ExecuteState")
    public String executeState;

    /**
     * <p>The maximum amount of time consumed by a slow query. Unit: seconds. Minimum value: 0.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("MaxExecuteCost")
    public String maxExecuteCost;

    /**
     * <p>The minimum amount of time consumed by a slow query. Unit: seconds. Minimum value: 0.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MinExecuteCost")
    public String minExecuteCost;

    /**
     * <p>The type of the query language. Valid values:</p>
     * <ul>
     * <li><strong>DQL</strong></li>
     * <li><strong>DML</strong></li>
     * <li><strong>DDL</strong></li>
     * <li><strong>DCL</strong></li>
     * <li><strong>TCL</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DQL</p>
     */
    @NameInMap("OperationClass")
    public String operationClass;

    /**
     * <p>The type of the SQL statement.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>If <strong>OperationClass</strong> is specified, the value of <strong>OperationType</strong> must belong to the corresponding query language. For example, if <strong>OperationClass</strong> is set to <strong>DQL</strong>, the value of <strong>OperationType</strong> must be a <strong>DQL</strong> statement such as <strong>SELECT</strong>.</p>
     * </li>
     * <li><p>If <strong>OperationClass</strong> is not specified, the value of <strong>OperationType</strong> can be an SQL statement of any query language.</p>
     * </li>
     * <li><p>If <strong>OperationClass</strong> and <strong>OperationType</strong> are not specified, all types of SQL statements are returned.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SELECT</p>
     */
    @NameInMap("OperationType")
    public String operationType;

    /**
     * <p>The page number. Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values:</p>
     * <ul>
     * <li><strong>30</strong></li>
     * <li><strong>50</strong></li>
     * <li><strong>100</strong></li>
     * </ul>
     * <p>Default value: <strong>30</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The keywords of the SQL statement.</p>
     * 
     * <strong>example:</strong>
     * <p>select 1</p>
     */
    @NameInMap("QueryKeywords")
    public String queryKeywords;

    /**
     * <p>The source IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>100.<strong>.</strong>.90</p>
     */
    @NameInMap("SourceIP")
    public String sourceIP;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-ddTHH:mmZ</em> format. The time must be in UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-03-10T06:30Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The name of the database account.</p>
     * 
     * <strong>example:</strong>
     * <p>testadmin</p>
     */
    @NameInMap("User")
    public String user;

    public static DescribeSQLLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLLogsRequest self = new DescribeSQLLogsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSQLLogsRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeSQLLogsRequest setDatabase(String database) {
        this.database = database;
        return this;
    }
    public String getDatabase() {
        return this.database;
    }

    public DescribeSQLLogsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeSQLLogsRequest setExecuteCost(String executeCost) {
        this.executeCost = executeCost;
        return this;
    }
    public String getExecuteCost() {
        return this.executeCost;
    }

    public DescribeSQLLogsRequest setExecuteState(String executeState) {
        this.executeState = executeState;
        return this;
    }
    public String getExecuteState() {
        return this.executeState;
    }

    public DescribeSQLLogsRequest setMaxExecuteCost(String maxExecuteCost) {
        this.maxExecuteCost = maxExecuteCost;
        return this;
    }
    public String getMaxExecuteCost() {
        return this.maxExecuteCost;
    }

    public DescribeSQLLogsRequest setMinExecuteCost(String minExecuteCost) {
        this.minExecuteCost = minExecuteCost;
        return this;
    }
    public String getMinExecuteCost() {
        return this.minExecuteCost;
    }

    public DescribeSQLLogsRequest setOperationClass(String operationClass) {
        this.operationClass = operationClass;
        return this;
    }
    public String getOperationClass() {
        return this.operationClass;
    }

    public DescribeSQLLogsRequest setOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }
    public String getOperationType() {
        return this.operationType;
    }

    public DescribeSQLLogsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSQLLogsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSQLLogsRequest setQueryKeywords(String queryKeywords) {
        this.queryKeywords = queryKeywords;
        return this;
    }
    public String getQueryKeywords() {
        return this.queryKeywords;
    }

    public DescribeSQLLogsRequest setSourceIP(String sourceIP) {
        this.sourceIP = sourceIP;
        return this;
    }
    public String getSourceIP() {
        return this.sourceIP;
    }

    public DescribeSQLLogsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeSQLLogsRequest setUser(String user) {
        this.user = user;
        return this;
    }
    public String getUser() {
        return this.user;
    }

}
