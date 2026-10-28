// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeAuditLogRecordsRequest extends TeaModel {
    /**
     * <p>&lt;props=&quot;china&quot;&gt;The cluster ID of an Enterprise Edition, Basic Edition, or Lakehouse Edition cluster.
     * &lt;props=&quot;intl&quot;&gt;The cluster ID of a Lakehouse Edition cluster.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/454250.html">DescribeDBClusters</a> operation to query the IDs of all clusters in a specified region.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-t4nj8619bz2w3****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The name of the database on which the target SQL statement is executed.</p>
     * 
     * <strong>example:</strong>
     * <p>adb_demo</p>
     */
    @NameInMap("DBName")
    public String DBName;

    /**
     * <p>The end time of the query. The time is displayed in UTC and in the yyyy-MM-ddTHH:mmZ format.</p>
     * <blockquote>
     * <ul>
     * <li>The end time must be later than the start time.</li>
     * <li>The interval between the start time and the end time cannot exceed 24 hours.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2022-08-12T17:08Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The engine type. Valid values:</p>
     * <ul>
     * <li>XIHE: audit logs of the default compute engine.</li>
     * <li>AGENT_SERVERLESS: audit logs of the Serverless analytics feature.</li>
     * </ul>
     * <p>If this parameter is not specified, the default value is XIHE.</p>
     * 
     * <strong>example:</strong>
     * <p>XIHE</p>
     */
    @NameInMap("EngineType")
    public String engineType;

    /**
     * <p>The IP address and port number of the client that executes the target SQL statement.</p>
     * 
     * <strong>example:</strong>
     * <p>100.104.XX.XX:43908</p>
     */
    @NameInMap("HostAddress")
    public String hostAddress;

    /**
     * <p>The sort configuration in JSON format. The value is an ordered JSON array that specifies composite sorting based on the input array order. Each element contains the <code>Field</code> and <code>Type</code> parameters. Example: <code>[{&quot;Field&quot;:&quot;ExecutionStartTime&quot;,&quot;Type&quot;:&quot;Desc&quot;},{&quot;Field&quot;:&quot;ScanRows&quot;,&quot;Type&quot;:&quot;Asc&quot;}]</code>. Details:</p>
     * <ul>
     * <li><p><code>Field</code> specifies the field name for sorting. Valid values:</p>
     * <ul>
     * <li><strong>HostAddress</strong>: the client address used to connect to the database.</li>
     * <li><strong>UserName</strong>: the username.</li>
     * <li><strong>ExecutionStartTime</strong>: the start time of the target SQL statement execution.</li>
     * <li><strong>QueryTime</strong>: the execution duration of the target SQL statement.</li>
     * <li><strong>PeakMemoryUsage</strong>: the peak memory usage during the execution of the target SQL statement.</li>
     * <li><strong>ScanRows</strong>: the number of scanned rows for tasks with a data source.</li>
     * <li><strong>ScanSize</strong>: the volume of scanned data.</li>
     * <li><strong>ScanTime</strong>: the total time consumed by data scanning.</li>
     * <li><strong>PlanningTime</strong>: the time consumed by execution plan generation.</li>
     * <li><strong>WallTime</strong>: the cumulative CPU time of all operators in the query across all nodes.</li>
     * <li><strong>ProcessID</strong>: the process ID.</li>
     * </ul>
     * </li>
     * <li><p><code>Type</code> specifies the sort order. Valid values:</p>
     * <ul>
     * <li><strong>Desc</strong>: descending order.</li>
     * <li><strong>Asc</strong>: ascending order.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;Field&quot;:&quot;ExecuteTime&quot;,&quot;Type&quot;:&quot;Desc&quot;},{&quot;Field&quot;:&quot;HostAddress&quot;,&quot;Type&quot;:&quot;Asc&quot;}]</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The sort order of SQL statements by execution time. Valid values:</p>
     * <ul>
     * <li><strong>asc</strong>: ascending order.</li>
     * <li><strong>desc</strong>: descending order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>asc</p>
     */
    @NameInMap("OrderType")
    public String orderType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number. The value must be a positive integer that does not exceed the maximum value of the INTEGER data type. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values:</p>
     * <ul>
     * <li><strong>10</strong> (default)</li>
     * <li><strong>30</strong></li>
     * <li><strong>50</strong></li>
     * <li><strong>100</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The process ID of the SQL query, used to filter audit logs of a specified process.</p>
     * 
     * <strong>example:</strong>
     * <p>20210608175202172016166249034536****</p>
     */
    @NameInMap("ProcessId")
    public String processId;

    /**
     * <p>Reserved parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("ProxyUser")
    public String proxyUser;

    /**
     * <p>A string value that is used as a keyword to filter the returned results.</p>
     * 
     * <strong>example:</strong>
     * <p>adb</p>
     */
    @NameInMap("QueryKeyword")
    public String queryKeyword;

    /**
     * <p>The region ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/454314.html">DescribeRegions</a> operation to query the region ID of the cluster.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The SQL statement type. Valid values:</p>
     * <ul>
     * <li><strong>DELETE</strong></li>
     * <li><strong>SELECT</strong></li>
     * <li><strong>UPDATE</strong></li>
     * <li><strong>INSERT INTO SELECT</strong></li>
     * <li><strong>ALTER</strong></li>
     * <li><strong>DROP</strong></li>
     * <li><strong>CREATE</strong></li>
     * </ul>
     * <blockquote>
     * <p>Only one type can be specified at a time. If this parameter is left empty, all types are queried by default.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>SELECT</p>
     */
    @NameInMap("SqlType")
    public String sqlType;

    /**
     * <p>The start time of the query. The time is displayed in UTC and in the yyyy-MM-ddTHH:mmZ format.</p>
     * <blockquote>
     * <p>SQL audit logs can be queried only when SQL Audit is enabled. Only SQL audit logs within the last 30 days can be queried. If SQL Audit is disabled and then re-enabled, only SQL audit logs generated after the re-enablement can be queried.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2022-08-12T04:17Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>Indicates whether the target SQL statement is executed successfully. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The SQL statement is executed successfully.</li>
     * <li><strong>false</strong>: The SQL statement fails to be executed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Succeed")
    public String succeed;

    /**
     * <p>The username that executes the target SQL statement.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("User")
    public String user;

    public static DescribeAuditLogRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAuditLogRecordsRequest self = new DescribeAuditLogRecordsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAuditLogRecordsRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeAuditLogRecordsRequest setDBName(String DBName) {
        this.DBName = DBName;
        return this;
    }
    public String getDBName() {
        return this.DBName;
    }

    public DescribeAuditLogRecordsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeAuditLogRecordsRequest setEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }
    public String getEngineType() {
        return this.engineType;
    }

    public DescribeAuditLogRecordsRequest setHostAddress(String hostAddress) {
        this.hostAddress = hostAddress;
        return this;
    }
    public String getHostAddress() {
        return this.hostAddress;
    }

    public DescribeAuditLogRecordsRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public DescribeAuditLogRecordsRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public DescribeAuditLogRecordsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeAuditLogRecordsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeAuditLogRecordsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAuditLogRecordsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAuditLogRecordsRequest setProcessId(String processId) {
        this.processId = processId;
        return this;
    }
    public String getProcessId() {
        return this.processId;
    }

    public DescribeAuditLogRecordsRequest setProxyUser(String proxyUser) {
        this.proxyUser = proxyUser;
        return this;
    }
    public String getProxyUser() {
        return this.proxyUser;
    }

    public DescribeAuditLogRecordsRequest setQueryKeyword(String queryKeyword) {
        this.queryKeyword = queryKeyword;
        return this;
    }
    public String getQueryKeyword() {
        return this.queryKeyword;
    }

    public DescribeAuditLogRecordsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeAuditLogRecordsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeAuditLogRecordsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeAuditLogRecordsRequest setSqlType(String sqlType) {
        this.sqlType = sqlType;
        return this;
    }
    public String getSqlType() {
        return this.sqlType;
    }

    public DescribeAuditLogRecordsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeAuditLogRecordsRequest setSucceed(String succeed) {
        this.succeed = succeed;
        return this;
    }
    public String getSucceed() {
        return this.succeed;
    }

    public DescribeAuditLogRecordsRequest setUser(String user) {
        this.user = user;
        return this;
    }
    public String getUser() {
        return this.user;
    }

}
