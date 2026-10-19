// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeErrorLogRecordsRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <blockquote>
     * <p>If you specify a sharded cluster instance ID for this parameter, you must also specify the <strong>NodeId</strong> parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dds-bp12c5b040dc****</p>
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
     * <p>The end time of the query. The end time must be later than the start time, and the interval between the end time and the start time cannot exceed one day. Specify the time in the <i>yyyy-MM-dd</i>T<i>HH:mm</i>Z format. The time must be in UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-01-02T12:10Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The logical operator for keyword search. Default value: and.</p>
     * 
     * <strong>example:</strong>
     * <p>and</p>
     */
    @NameInMap("LogicalOperator")
    public String logicalOperator;

    /**
     * <p>The ID of a mongos node or shard node in the sharded cluster instance.</p>
     * <blockquote>
     * <p>This parameter is available only when the <strong>DBInstanceId</strong> parameter is set to a sharded cluster instance ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>d-bp128a003436****</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

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
     * <p>The number of entries per page. Valid values: <strong>30</strong> to <strong>100</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The keywords to search for. Separate multiple keywords with spaces. You can specify a maximum of 10 keywords.</p>
     * 
     * <strong>example:</strong>
     * <p>test test1</p>
     */
    @NameInMap("QueryKeywords")
    public String queryKeywords;

    /**
     * <p>The resource group ID. For more information about resource groups, see <a href="https://help.aliyun.com/document_detail/151181.html">View basic information of a resource group</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmyiu4ekp****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The role of the node in the instance. Valid values:</p>
     * <ul>
     * <li><strong>primary</strong>: primary node.</li>
     * <li><strong>secondary</strong>: secondary node.</li>
     * <li><strong>search</strong>: search node.</li>
     * </ul>
     * <blockquote>
     * <p>If the <strong>NodeId</strong> parameter is set to a mongos node ID, this parameter can only be set to <strong>primary</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>primary</p>
     */
    @NameInMap("RoleType")
    public String roleType;

    /**
     * <p>The start time of the query. Specify the time in the <i>yyyy-MM-dd</i>T<i>HH:mm</i>Z format. The time must be in UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-01-01T12:10Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeErrorLogRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeErrorLogRecordsRequest self = new DescribeErrorLogRecordsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeErrorLogRecordsRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeErrorLogRecordsRequest setDBName(String DBName) {
        this.DBName = DBName;
        return this;
    }
    public String getDBName() {
        return this.DBName;
    }

    public DescribeErrorLogRecordsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeErrorLogRecordsRequest setLogicalOperator(String logicalOperator) {
        this.logicalOperator = logicalOperator;
        return this;
    }
    public String getLogicalOperator() {
        return this.logicalOperator;
    }

    public DescribeErrorLogRecordsRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public DescribeErrorLogRecordsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeErrorLogRecordsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeErrorLogRecordsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeErrorLogRecordsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeErrorLogRecordsRequest setQueryKeywords(String queryKeywords) {
        this.queryKeywords = queryKeywords;
        return this;
    }
    public String getQueryKeywords() {
        return this.queryKeywords;
    }

    public DescribeErrorLogRecordsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeErrorLogRecordsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeErrorLogRecordsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeErrorLogRecordsRequest setRoleType(String roleType) {
        this.roleType = roleType;
        return this;
    }
    public String getRoleType() {
        return this.roleType;
    }

    public DescribeErrorLogRecordsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
