// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeRunningLogRecordsRequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     * <blockquote>
     * <p> If you set this parameter to the ID of a sharded cluster instance, you must also specify the <strong>NodeId</strong> parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dds-bpxxxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The name of the database.</p>
     * 
     * <strong>example:</strong>
     * <p>mongodbtest</p>
     */
    @NameInMap("DBName")
    public String DBName;

    /**
     * <p>The end of the time range to query. Specify the time in the <em>yyyy-MM-dd</em>T<em>HH:mm</em>Z format. The time must be in UTC.</p>
     * <blockquote>
     * <p> The end time must be later than the start time and within 24 hours from the start time. Otherwise, the query fails.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-01-01T13:10Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The logical relationship among multiple keywords.</p>
     * <ul>
     * <li><strong>or</strong></li>
     * <li><strong>and</strong> (default value)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>and</p>
     */
    @NameInMap("LogicalOperator")
    public String logicalOperator;

    /**
     * <p>The ID of the mongos node or shard node whose operational logs you want to query in the instance. If the instance is a sharded cluster instance, you must specify this parameter.</p>
     * <blockquote>
     * <p> This parameter is valid only when <strong>DBInstanceId</strong> is set to the ID of a sharded cluster instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>d-bpxxxxxxxx</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>The order of time in which the operational log entries to return are sorted. Valid values:</p>
     * <ul>
     * <li>asc: The log entries are sorted by time in ascending order.</li>
     * <li>desc: The log entries are sorted by time in descending order.</li>
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
     * <p>The number of the page to return. The value must be an integer that is greater than 0. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Valid values: <strong>30</strong> to <strong>100</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The keywords used for query. You can enter up to 10 keywords at a time. If you enter multiple keywords, separate the keywords with spaces.</p>
     * 
     * <strong>example:</strong>
     * <p>test test2</p>
     */
    @NameInMap("QueryKeywords")
    public String queryKeywords;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-bpxxxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The role ID of the node. You can call the <a href="https://help.aliyun.com/document_detail/62134.html">DescribeReplicaSetRole</a> operation to query the role ID.</p>
     * 
     * <strong>example:</strong>
     * <p>651xxxxx</p>
     */
    @NameInMap("RoleId")
    public String roleId;

    /**
     * <p>The role of the node whose error logs you want to query in the instance. Valid values:</p>
     * <ul>
     * <li><strong>primary</strong></li>
     * <li><strong>secondary</strong></li>
     * </ul>
     * <blockquote>
     * <p> If you set the <strong>NodeId</strong> parameter to the ID of a mongos node, the <strong>RoleType</strong> parameter must be set to <strong>primary</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>primary</p>
     */
    @NameInMap("RoleType")
    public String roleType;

    /**
     * <p>The beginning of the time range to query. Specify the time in the <em>yyyy-MM-dd</em>T<em>HH:mm</em>Z format. The time must be in UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-01-01T12:10Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeRunningLogRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRunningLogRecordsRequest self = new DescribeRunningLogRecordsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRunningLogRecordsRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeRunningLogRecordsRequest setDBName(String DBName) {
        this.DBName = DBName;
        return this;
    }
    public String getDBName() {
        return this.DBName;
    }

    public DescribeRunningLogRecordsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeRunningLogRecordsRequest setLogicalOperator(String logicalOperator) {
        this.logicalOperator = logicalOperator;
        return this;
    }
    public String getLogicalOperator() {
        return this.logicalOperator;
    }

    public DescribeRunningLogRecordsRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public DescribeRunningLogRecordsRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public DescribeRunningLogRecordsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeRunningLogRecordsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeRunningLogRecordsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeRunningLogRecordsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeRunningLogRecordsRequest setQueryKeywords(String queryKeywords) {
        this.queryKeywords = queryKeywords;
        return this;
    }
    public String getQueryKeywords() {
        return this.queryKeywords;
    }

    public DescribeRunningLogRecordsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeRunningLogRecordsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeRunningLogRecordsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeRunningLogRecordsRequest setRoleId(String roleId) {
        this.roleId = roleId;
        return this;
    }
    public String getRoleId() {
        return this.roleId;
    }

    public DescribeRunningLogRecordsRequest setRoleType(String roleType) {
        this.roleType = roleType;
        return this;
    }
    public String getRoleType() {
        return this.roleType;
    }

    public DescribeRunningLogRecordsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
