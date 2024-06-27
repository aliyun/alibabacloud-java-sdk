// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeSQLLogCountRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query the information about all AnalyticDB for PostgreSQL instances within a region, including instance IDs.</p>
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
     * <p>testdb</p>
     */
    @NameInMap("Database")
    public String database;

    /**
     * <p>The end of the time range to query. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm</em>Z format. The time must be in UTC.</p>
     * <blockquote>
     * <p>The end time must be later than the start time. The maximum time range that can be specified is seven days.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-12-14T11:22Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The execution duration of the SQL statement. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("ExecuteCost")
    public String executeCost;

    /**
     * <p>The execution state of the SQL statement. Valid values:</p>
     * <ul>
     * <li><strong>success</strong></li>
     * <li><strong>fail</strong></li>
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
     * <p>10</p>
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
     * <p>The keywords that are used to query audit logs.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("QueryKeywords")
    public String queryKeywords;

    /**
     * <p>The source IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>10.<strong>.</strong>.13</p>
     */
    @NameInMap("SourceIP")
    public String sourceIP;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm</em>Z format. The time must be in UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-12-12T11:22Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The name of the database account that is used to connect to the database.</p>
     * 
     * <strong>example:</strong>
     * <p>adbpgadmin</p>
     */
    @NameInMap("User")
    public String user;

    public static DescribeSQLLogCountRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLLogCountRequest self = new DescribeSQLLogCountRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSQLLogCountRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeSQLLogCountRequest setDatabase(String database) {
        this.database = database;
        return this;
    }
    public String getDatabase() {
        return this.database;
    }

    public DescribeSQLLogCountRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeSQLLogCountRequest setExecuteCost(String executeCost) {
        this.executeCost = executeCost;
        return this;
    }
    public String getExecuteCost() {
        return this.executeCost;
    }

    public DescribeSQLLogCountRequest setExecuteState(String executeState) {
        this.executeState = executeState;
        return this;
    }
    public String getExecuteState() {
        return this.executeState;
    }

    public DescribeSQLLogCountRequest setMaxExecuteCost(String maxExecuteCost) {
        this.maxExecuteCost = maxExecuteCost;
        return this;
    }
    public String getMaxExecuteCost() {
        return this.maxExecuteCost;
    }

    public DescribeSQLLogCountRequest setMinExecuteCost(String minExecuteCost) {
        this.minExecuteCost = minExecuteCost;
        return this;
    }
    public String getMinExecuteCost() {
        return this.minExecuteCost;
    }

    public DescribeSQLLogCountRequest setOperationClass(String operationClass) {
        this.operationClass = operationClass;
        return this;
    }
    public String getOperationClass() {
        return this.operationClass;
    }

    public DescribeSQLLogCountRequest setOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }
    public String getOperationType() {
        return this.operationType;
    }

    public DescribeSQLLogCountRequest setQueryKeywords(String queryKeywords) {
        this.queryKeywords = queryKeywords;
        return this;
    }
    public String getQueryKeywords() {
        return this.queryKeywords;
    }

    public DescribeSQLLogCountRequest setSourceIP(String sourceIP) {
        this.sourceIP = sourceIP;
        return this;
    }
    public String getSourceIP() {
        return this.sourceIP;
    }

    public DescribeSQLLogCountRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeSQLLogCountRequest setUser(String user) {
        this.user = user;
        return this;
    }
    public String getUser() {
        return this.user;
    }

}
