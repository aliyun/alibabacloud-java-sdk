// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeSQLLogsV2Request extends TeaModel {
    /**
     * <p>The ID of instance.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query details of all AnalyticDB for PostgreSQL instances in a specific region, including instance IDs.</p>
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
     * <p> The end time must be later than the start time. The interval cannot be more than 24 hours.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2022-03-17T06:30Z</p>
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
     * <p>The maximum amount of time consumed by a slow query. Minimum value: 0. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("MaxExecuteCost")
    public String maxExecuteCost;

    /**
     * <p>The minimum amount of time consumed by a slow query. Minimum value: 0. Unit: seconds.</p>
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
     * <ul>
     * <li>If the <strong>OperationClass</strong> parameter is specified, the <strong>OperationType</strong> value must belong to the corresponding query language. For example, if the <strong>OperationClass</strong> value is <strong>DQL</strong>, the <strong>OperationType</strong> value must be a <strong>DQL</strong> SQL statement such as <strong>SELECT</strong>.</li>
     * <li>If the <strong>OperationClass</strong> parameter is not specified, the <strong>OperationType</strong> value can be an SQL statement of all query languages.</li>
     * <li>If neither of the <strong>OperationClass</strong> and <strong>OperationType</strong> parameters is specified, all types of SQL statements are returned.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>SELECT</p>
     */
    @NameInMap("OperationType")
    public String operationType;

    /**
     * <p>The number of entries to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of the page to return. The maximum value is 200.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The keywords of the SQL statement.</p>
     * 
     * <strong>example:</strong>
     * <p>select 1</p>
     */
    @NameInMap("QueryKeywords")
    public String queryKeywords;

    /**
     * <p>The region ID of the instance.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/86912.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-bp67acfmxazb4p****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The source IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>100.XX.XX.90</p>
     */
    @NameInMap("SourceIP")
    public String sourceIP;

    /**
     * <p>The beginning of the time range. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-ddTHH:mmZ</em> format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-03-10T06:30Z</p>
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

    public static DescribeSQLLogsV2Request build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLLogsV2Request self = new DescribeSQLLogsV2Request();
        return TeaModel.build(map, self);
    }

    public DescribeSQLLogsV2Request setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeSQLLogsV2Request setDatabase(String database) {
        this.database = database;
        return this;
    }
    public String getDatabase() {
        return this.database;
    }

    public DescribeSQLLogsV2Request setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeSQLLogsV2Request setExecuteCost(String executeCost) {
        this.executeCost = executeCost;
        return this;
    }
    public String getExecuteCost() {
        return this.executeCost;
    }

    public DescribeSQLLogsV2Request setExecuteState(String executeState) {
        this.executeState = executeState;
        return this;
    }
    public String getExecuteState() {
        return this.executeState;
    }

    public DescribeSQLLogsV2Request setMaxExecuteCost(String maxExecuteCost) {
        this.maxExecuteCost = maxExecuteCost;
        return this;
    }
    public String getMaxExecuteCost() {
        return this.maxExecuteCost;
    }

    public DescribeSQLLogsV2Request setMinExecuteCost(String minExecuteCost) {
        this.minExecuteCost = minExecuteCost;
        return this;
    }
    public String getMinExecuteCost() {
        return this.minExecuteCost;
    }

    public DescribeSQLLogsV2Request setOperationClass(String operationClass) {
        this.operationClass = operationClass;
        return this;
    }
    public String getOperationClass() {
        return this.operationClass;
    }

    public DescribeSQLLogsV2Request setOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }
    public String getOperationType() {
        return this.operationType;
    }

    public DescribeSQLLogsV2Request setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSQLLogsV2Request setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeSQLLogsV2Request setQueryKeywords(String queryKeywords) {
        this.queryKeywords = queryKeywords;
        return this;
    }
    public String getQueryKeywords() {
        return this.queryKeywords;
    }

    public DescribeSQLLogsV2Request setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeSQLLogsV2Request setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeSQLLogsV2Request setSourceIP(String sourceIP) {
        this.sourceIP = sourceIP;
        return this;
    }
    public String getSourceIP() {
        return this.sourceIP;
    }

    public DescribeSQLLogsV2Request setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeSQLLogsV2Request setUser(String user) {
        this.user = user;
        return this;
    }
    public String getUser() {
        return this.user;
    }

}
