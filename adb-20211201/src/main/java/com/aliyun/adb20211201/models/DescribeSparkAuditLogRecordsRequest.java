// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeSparkAuditLogRecordsRequest extends TeaModel {
    /**
     * <p>The source IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.XX.XX</p>
     */
    @NameInMap("ClientIp")
    public String clientIp;

    /**
     * <p>The cluster ID.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/454250.html">DescribeDBClusters</a> operation to query cluster IDs.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-bp1j7******78j8i</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>Query end time. The end time must be later than the start time, and the interval between them must be less than 1 day. Format: yyyy-MM-ddTHH:mmZ (UTC time).</p>
     * 
     * <strong>example:</strong>
     * <p>2025-09-25T01:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>Sort the SQL statements based on specified fields. The format is a JSON array that preserves order, and composite sorting is performed according to the sequence of objects in the array. Each object contains two fields: <code>Field</code> and <code>Type</code>. For example:<code>[{&quot;Field&quot;:&quot;CreateTime&quot;, &quot;Type&quot;: &quot;desc&quot; }]</code>. Where:</p>
     * <ul>
     * <li><p><code>Field</code> specifies the field that is used to sort the SQL statements. Valid values:</p>
     * <ul>
     * <li><code>ResourceGroupName</code>: The name of the resource group.</li>
     * <li><code>Status</code> :SQL execution status.</li>
     * <li><code>User</code>: The username that is used to execute the SQL statement.</li>
     * <li><code>ExecuteTime</code>: The start time of SQL execution.</li>
     * <li><code>TotalTime</code>: The amount of time consumed to execute the SQL statement.</li>
     * <li><code>ProcessId</code>: Query ID.</li>
     * <li><code>ClientIp</code>: The source IP address.</li>
     * <li><code>StatementSource</code>: The source from which the query was initiated.</li>
     * </ul>
     * </li>
     * <li><p><code>Type</code> specifies the sorting order. Valid values (case-insensitive):</p>
     * <ul>
     * <li><code>Desc</code>: Descending order.</li>
     * <li><code>Asc</code>: Ascending order.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;Field\&quot;:\&quot;ExecuteTime\&quot;,\&quot;Type\&quot;:\&quot;Desc\&quot;}]</p>
     */
    @NameInMap("Order")
    public String order;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The query ID.</p>
     * 
     * <strong>example:</strong>
     * <p>999f2439-6b10-xxxx-a5d3-daf3b35c****</p>
     */
    @NameInMap("ProcessId")
    public String processId;

    /**
     * <p>This parameter is deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>user</p>
     */
    @NameInMap("ProxyUser")
    public String proxyUser;

    /**
     * <p>The region ID.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/612293.html">DescribeRegions</a> operation to query the available regions and zones, including region ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group name.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/612410.html">DescribeDBResourceGroup</a> operation to query the resource group ID within a cluster.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>test_job</p>
     */
    @NameInMap("ResourceGroupName")
    public String resourceGroupName;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The keyword in the SQL statement.</p>
     * 
     * <strong>example:</strong>
     * <p>test_table_name</p>
     */
    @NameInMap("SQLText")
    public String SQLText;

    /**
     * <p>Query start time. Format: <em>yyyy-MM-ddTHH:mmZ</em> (UTC time).</p>
     * <blockquote>
     * <p> We recommend that you set the query start time to any point in time within 30 days.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2025-09-25T00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The ID of the statement.</p>
     * 
     * <strong>example:</strong>
     * <p>fbd22066-1c03-xxxx-aa16-6ae28288****</p>
     */
    @NameInMap("StatementId")
    public String statementId;

    /**
     * <p>The source from which the query was initiated.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>SQL_EDITOR: SQL_EDITOR.</li>
     * <li>JDBC: JDBC.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SQL_EDITOR</p>
     */
    @NameInMap("StatementSource")
    public String statementSource;

    /**
     * <p>The execution status of the SQL statement.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>cancel: The task is canceled .</li>
     * <li>finished: The execution succeeds .</li>
     * <li>error:The execution fails .</li>
     * <li>timeout: The execution timed out .</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>finish</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The duration of the SQL statement. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>3000</p>
     */
    @NameInMap("TotalTime")
    public String totalTime;

    /**
     * <p>The username that is used to execute SQL statements.</p>
     * 
     * <strong>example:</strong>
     * <p>test_user</p>
     */
    @NameInMap("User")
    public String user;

    public static DescribeSparkAuditLogRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSparkAuditLogRecordsRequest self = new DescribeSparkAuditLogRecordsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSparkAuditLogRecordsRequest setClientIp(String clientIp) {
        this.clientIp = clientIp;
        return this;
    }
    public String getClientIp() {
        return this.clientIp;
    }

    public DescribeSparkAuditLogRecordsRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeSparkAuditLogRecordsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeSparkAuditLogRecordsRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public DescribeSparkAuditLogRecordsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeSparkAuditLogRecordsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeSparkAuditLogRecordsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSparkAuditLogRecordsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSparkAuditLogRecordsRequest setProcessId(String processId) {
        this.processId = processId;
        return this;
    }
    public String getProcessId() {
        return this.processId;
    }

    public DescribeSparkAuditLogRecordsRequest setProxyUser(String proxyUser) {
        this.proxyUser = proxyUser;
        return this;
    }
    public String getProxyUser() {
        return this.proxyUser;
    }

    public DescribeSparkAuditLogRecordsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeSparkAuditLogRecordsRequest setResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }
    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public DescribeSparkAuditLogRecordsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeSparkAuditLogRecordsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeSparkAuditLogRecordsRequest setSQLText(String SQLText) {
        this.SQLText = SQLText;
        return this;
    }
    public String getSQLText() {
        return this.SQLText;
    }

    public DescribeSparkAuditLogRecordsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeSparkAuditLogRecordsRequest setStatementId(String statementId) {
        this.statementId = statementId;
        return this;
    }
    public String getStatementId() {
        return this.statementId;
    }

    public DescribeSparkAuditLogRecordsRequest setStatementSource(String statementSource) {
        this.statementSource = statementSource;
        return this;
    }
    public String getStatementSource() {
        return this.statementSource;
    }

    public DescribeSparkAuditLogRecordsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeSparkAuditLogRecordsRequest setTotalTime(String totalTime) {
        this.totalTime = totalTime;
        return this;
    }
    public String getTotalTime() {
        return this.totalTime;
    }

    public DescribeSparkAuditLogRecordsRequest setUser(String user) {
        this.user = user;
        return this;
    }
    public String getUser() {
        return this.user;
    }

}
