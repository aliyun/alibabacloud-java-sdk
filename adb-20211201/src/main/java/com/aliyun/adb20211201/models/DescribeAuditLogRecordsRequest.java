// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeAuditLogRecordsRequest extends TeaModel {
    /**
     * <p>&lt;props=&quot;china&quot;&gt;The cluster ID of the Enterprise Edition, Basic Edition, or Data Lakehouse Edition cluster.
     * &lt;props=&quot;intl&quot;&gt;The ID of the Data Lakehouse Edition cluster.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/454250.html">DescribeDBClusters</a> operation to query the cluster IDs of all clusters in a region.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-t4nj8619bz2w3****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The name of the database on which the SQL statement was executed.</p>
     * 
     * <strong>example:</strong>
     * <p>adb_demo</p>
     */
    @NameInMap("DBName")
    public String DBName;

    /**
     * <p>The end of the time range to query. Specify the time in UTC in the yyyy-MM-ddTHH:mmZ format.</p>
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

    @NameInMap("EngineType")
    public String engineType;

    /**
     * <p>The IP address and port number of the client that executed the SQL statement.</p>
     * 
     * <strong>example:</strong>
     * <p>100.104.XX.XX:43908</p>
     */
    @NameInMap("HostAddress")
    public String hostAddress;

    /**
     * <p>The sorting order based on specified fields. The value is in JSON format and is an ordered JSON array. Compound sorting is performed in the order of the input array. The array contains the <code>Field</code> and <code>Type</code> fields. Example: <code>[{&quot;Field&quot;:&quot;ExecutionStartTime&quot;,&quot;Type&quot;:&quot;Desc&quot;},{&quot;Field&quot;:&quot;ScanRows&quot;,&quot;Type&quot;:&quot;Asc&quot;}]</code>.</p>
     * <ul>
     * <li><p><code>Field</code> specifies the field name for sorting. Valid values:</p>
     * <ul>
     * <li><strong>HostAddress</strong>: the address of the client that connects to the database.</li>
     * <li><strong>UserName</strong>: the username.</li>
     * <li><strong>ExecutionStartTime</strong>: the execution start time of the SQL statement.</li>
     * <li><strong>QueryTime</strong>: the execution duration of the SQL statement.</li>
     * <li><strong>PeakMemoryUsage</strong>: the peak memory usage during the execution of the SQL statement.</li>
     * <li><strong>ScanRows</strong>: the number of rows scanned by the task with a data source.</li>
     * <li><strong>ScanSize</strong>: the amount of scanned data.</li>
     * <li><strong>ScanTime</strong>: the total time consumed for scanning data.</li>
     * <li><strong>PlanningTime</strong>: the time consumed for generating the execution plan.</li>
     * <li><strong>WallTime</strong>: the cumulative CPU time of all operators across all nodes in the query.</li>
     * <li><strong>ProcessID</strong>: the process ID.</li>
     * </ul>
     * </li>
     * <li><p><code>Type</code> specifies the sorting type. Valid values:</p>
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
     * <p>The order in which the results are sorted by SQL execution time. Valid values:</p>
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
     * <p>The page number. The value must be a positive integer that does not exceed the maximum value of the Integer data type. Default value: <strong>1</strong>.</p>
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
     * <p>A reserved parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("ProxyUser")
    public String proxyUser;

    /**
     * <p>The keyword used to filter the returned results.</p>
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
     * <p>The type of the SQL statement. Valid values:</p>
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
     * <p>Only one type can be specified per request. If this parameter is left empty, all types are queried by default.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>SELECT</p>
     */
    @NameInMap("SqlType")
    public String sqlType;

    /**
     * <p>The beginning of the time range to query. Specify the time in UTC in the yyyy-MM-ddTHH:mmZ format.</p>
     * <blockquote>
     * <p>SQL Audit Log entries can be queried only when SQL audit is enabled, and only entries from the last 30 days are supported. If SQL audit is disabled and then re-enabled, only entries recorded after re-enabling are available.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2022-08-12T04:17Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>Specifies whether the SQL statement was executed successfully. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The SQL statement was executed successfully.</li>
     * <li><strong>false</strong>: The SQL statement failed to be executed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Succeed")
    public String succeed;

    /**
     * <p>The username that executed the SQL statement.</p>
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
