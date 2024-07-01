// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeAuditLogRecordsRequest extends TeaModel {
    /**
     * <p>The ID of the AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/454250.html">DescribeDBClusters</a> operation to query the IDs of all AnalyticDB for MySQL Data Lakehouse Edition (V3.0) clusters within a region.</p>
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
     * <p>The end of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mmZ format. The time must be in UTC.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>The end time must be later than the start time.</p>
     * </li>
     * <li><p>The maximum time range that can be specified is 24 hours.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2022-08-12T17:08Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The IP address and port number of the client that is used to execute the SQL statement.</p>
     * 
     * <strong>example:</strong>
     * <p>100.104.XX.XX:43908</p>
     */
    @NameInMap("HostAddress")
    public String hostAddress;

    /**
     * <p>The order in which to sort the retrieved entries by field. Specify this parameter in the JSON format. The value is an ordered array that uses the order of the input array and contains <code>Field</code> and <code>Type</code>. Example: <code>[{&quot;Field&quot;:&quot;ExecutionStartTime&quot;,&quot;Type&quot;:&quot;Desc&quot;},{&quot;Field&quot;:&quot;ScanRows&quot;,&quot;Type&quot;:&quot;Asc&quot;}]</code>. Fields:</p>
     * <ul>
     * <li><p><code>Field</code>: the field that is used to sort the retrieved entries. Valid values:</p>
     * <ul>
     * <li><strong>HostAddress</strong>: the IP address of the client that is used to connect to the database.</li>
     * <li><strong>UserName</strong>: the username.</li>
     * <li><strong>ExecutionStartTime</strong>: the start time of the query execution.</li>
     * <li><strong>QueryTime</strong>: the amount of time consumed to execute the SQL statement.</li>
     * <li><strong>PeakMemoryUsage</strong>: the maximum memory usage when the SQL statement is executed.</li>
     * <li><strong>ScanRows</strong>: the number of rows to be scanned from a data source in the task.</li>
     * <li><strong>ScanSize</strong>: the amount of data to be scanned.</li>
     * <li><strong>ScanTime</strong>: the total amount of time consumed to scan data.</li>
     * <li><strong>PlanningTime</strong>: the amount of time consumed to generate execution plans.</li>
     * <li><strong>WallTime</strong>: the accumulated CPU Time values of all operators in the query on each node.</li>
     * <li><strong>ProcessID</strong>: the process ID.</li>
     * </ul>
     * </li>
     * <li><p><code>Type</code>: the sorting type of the retrieved entries. Valid values:</p>
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
     * <p>The sorting order of the retrieved entries. Valid values:</p>
     * <ul>
     * <li><strong>asc</strong>: sorts the retrieved entries by time in ascending order.</li>
     * <li><strong>desc</strong>: sorts the retrieved entries by time in descending order.</li>
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
     * <p>The page number. Pages start from page 1. Default value: <strong>1</strong>.</p>
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
     * <p>none</p>
     */
    @NameInMap("ProxyUser")
    public String proxyUser;

    /**
     * <p>The keyword based on which audit logs are queried. You can set this parameter to a value of the STRING type.</p>
     * 
     * <strong>example:</strong>
     * <p>adb</p>
     */
    @NameInMap("QueryKeyword")
    public String queryKeyword;

    /**
     * <p>The region ID of the cluster.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/454314.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
     * <p> You can query only a single type of SQL statements at a time. If you leave this parameter empty, the <strong>SELECT</strong> statements are queried.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>SELECT</p>
     */
    @NameInMap("SqlType")
    public String sqlType;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mmZ format. The time must be in UTC.</p>
     * <blockquote>
     * <p>SQL audit logs can be queried only when SQL audit is enabled. Only SQL audit logs within the last 30 days can be queried. If SQL audit was disabled and re-enabled, only SQL audit logs from the time when SQL audit was re-enabled can be queried.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2022-08-12T04:17Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>Specifies whether the execution of the SQL statement succeeds. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Succeed")
    public String succeed;

    /**
     * <p>The username that is used to execute the SQL statement.</p>
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
