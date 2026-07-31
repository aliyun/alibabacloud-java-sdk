// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeAuditLogRecordsRequest extends TeaModel {
    /**
     * <p>&lt;props=&quot;china&quot;&gt;The ID of the Enterprise Edition, Basic Edition, or Data Lakehouse Edition cluster.
     * &lt;props=&quot;intl&quot;&gt;The ID of the Data Lakehouse Edition cluster.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/454250.html">DescribeDBClusters</a> operation to query the IDs of all clusters in a region.</p>
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
     * <p>The end of the time range to query. The time must be in UTC and in the <code>yyyy-MM-ddTHH:mmZ</code> format.</p>
     * <blockquote>
     * <ul>
     * <li><p>The end time must be later than the start time.</p>
     * </li>
     * <li><p>The time range cannot exceed 24 hours.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2022-08-12T17:08Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The client IP address and port number.</p>
     * 
     * <strong>example:</strong>
     * <p>100.104.XX.XX:43908</p>
     */
    @NameInMap("HostAddress")
    public String hostAddress;

    /**
     * <p>Specifies the fields for sorting the results. The value is a JSON string that is an array of objects. The order of objects in the array defines the sort priority. Each object contains the<code>Field</code> and<code>Type</code> parameters. Example: <code>[{&quot;Field&quot;:&quot;ExecutionStartTime&quot;,&quot;Type&quot;:&quot;Desc&quot;},{&quot;Field&quot;:&quot;ScanRows&quot;,&quot;Type&quot;:&quot;Asc&quot;}]</code>.</p>
     * <ul>
     * <li><p><code>Field</code>: the field by which to sort the results. Valid values:</p>
     * <ul>
     * <li><p><strong>HostAddress</strong>: the client IP address.</p>
     * </li>
     * <li><p><strong>UserName</strong>: the username.</p>
     * </li>
     * <li><p><strong>ExecutionStartTime</strong>: the execution start time of the SQL statement.</p>
     * </li>
     * <li><p><strong>QueryTime</strong>: the execution duration.</p>
     * </li>
     * <li><p><strong>PeakMemoryUsage</strong>: the peak memory usage of the SQL statement.</p>
     * </li>
     * <li><p><strong>ScanRows</strong>: the number of rows scanned by a task that involves a data source.</p>
     * </li>
     * <li><p><strong>ScanSize</strong>: the amount of data scanned.</p>
     * </li>
     * <li><p><strong>ScanTime</strong>: the time taken for the data scan.</p>
     * </li>
     * <li><p><strong>PlanningTime</strong>: the time taken to generate the execution plan.</p>
     * </li>
     * <li><p><strong>WallTime</strong>: the total CPU time of all operators on all nodes.</p>
     * </li>
     * <li><p><strong>ProcessID</strong>: the process ID.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p><code>Type</code>: the sort order. Valid values:</p>
     * <ul>
     * <li><p><strong>Desc</strong>: descending order.</p>
     * </li>
     * <li><p><strong>Asc</strong>: ascending order.</p>
     * </li>
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
     * <p>The sort order for the results based on execution time. Valid values:</p>
     * <ul>
     * <li><p><strong>asc</strong>: ascending order.</p>
     * </li>
     * <li><p><strong>desc</strong>: descending order.</p>
     * </li>
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
     * <p>The page number. The value must be an integer that is greater than 0. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The page size. Valid values:</p>
     * <ul>
     * <li><p><strong>10</strong> (default)</p>
     * </li>
     * <li><p><strong>30</strong></p>
     * </li>
     * <li><p><strong>50</strong></p>
     * </li>
     * <li><p><strong>100</strong></p>
     * </li>
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
     * <p>无</p>
     */
    @NameInMap("ProxyUser")
    public String proxyUser;

    /**
     * <p>A keyword used to perform a fuzzy search on the returned results.</p>
     * 
     * <strong>example:</strong>
     * <p>adb</p>
     */
    @NameInMap("QueryKeyword")
    public String queryKeyword;

    /**
     * <p>The region ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/454314.html">DescribeRegions</a> operation to query available regions.</p>
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
     * <li><p><strong>DELETE</strong></p>
     * </li>
     * <li><p><strong>SELECT</strong></p>
     * </li>
     * <li><p><strong>UPDATE</strong></p>
     * </li>
     * <li><p><strong>INSERT INTO SELECT</strong></p>
     * </li>
     * <li><p><strong>ALTER</strong></p>
     * </li>
     * <li><p><strong>DROP</strong></p>
     * </li>
     * <li><p><strong>CREATE</strong></p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>You can specify only one type per request. If this parameter is not specified, all types are queried by default.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>SELECT</p>
     */
    @NameInMap("SqlType")
    public String sqlType;

    /**
     * <p>The start of the time range to query. The time must be in UTC and in the <code>yyyy-MM-ddTHH:mmZ</code> format.</p>
     * <blockquote>
     * <p>You can query SQL audit logs only when this feature is enabled. Logs are available for the last 30 days. If you disable and then re-enable SQL audit, only logs generated after the feature was re-enabled are returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2022-08-12T04:17Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>Indicates whether the SQL statement was successfully executed. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The SQL statement succeeded.</p>
     * </li>
     * <li><p><strong>false</strong>: The SQL statement failed.</p>
     * </li>
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
