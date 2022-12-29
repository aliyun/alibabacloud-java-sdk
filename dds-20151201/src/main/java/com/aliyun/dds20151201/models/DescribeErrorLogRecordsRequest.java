// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeErrorLogRecordsRequest extends TeaModel {
    // The ID of the instance.
    // 
    // >  If you set this parameter to the ID of a sharded cluster instance, you must also specify the **NodeId** parameter.
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    // The name of the database.
    @NameInMap("DBName")
    public String DBName;

    // The end of the time range to query. The end time must be later than the start time and within 24 hours from the start time. Specify the time in the *yyyy-MM-dd*T*HH:mm*Z format. The time must be in UTC.
    @NameInMap("EndTime")
    public String endTime;

    // The ID of the mongos node or shard node whose error logs you want to query in the instance. If the instance is a sharded cluster instance, you must specify this parameter.
    // 
    // >  This parameter is valid only when **DBInstanceId** is set to the ID of a sharded cluster instance.
    @NameInMap("NodeId")
    public String nodeId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The number of the page to return. The value must be an integer that is greater than 0. Default value: **1**.
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // The number of entries to return on each page. Valid values: **30** to **100**.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The ID of the resource group. For more information, see [View basic information of a resource group](~~151181~~).
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    // The role of the node whose error logs you want to query in the instance. Valid values:
    // 
    // *   **primary**
    // *   **secondary**
    // 
    // >  If you set the **NodeId** parameter to the ID of a mongos node, the RoleType parameter must be set to **primary**.
    @NameInMap("RoleType")
    public String roleType;

    @NameInMap("SecurityToken")
    public String securityToken;

    // The beginning of the time range to query. Specify the time in the *yyyy-MM-dd*T*HH:mm*Z format. The time must be in UTC.
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

    public DescribeErrorLogRecordsRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeErrorLogRecordsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
