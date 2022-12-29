// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeDBInstancesRequest extends TeaModel {
    // The billing method of the instance. Valid values:
    // 
    // *   **PrePaid**: subscription
    // *   **PostPaid**: pay-as-you-go
    @NameInMap("ChargeType")
    public String chargeType;

    // The endpoint of the node. You can call the [DescribeDBInstanceAttribute](~~62010~~) operation to query the endpoint of the node.
    @NameInMap("ConnectionDomain")
    public String connectionDomain;

    // The instance type. For more information about valid values, see [Instance types](~~57141~~).
    @NameInMap("DBInstanceClass")
    public String DBInstanceClass;

    // The name of the instance. Valid values:
    // 
    // *   The name must start with a letter.
    // *   The name can contain digits, letters, underscores (\_), and hyphens (-).
    // *   The name must be 2 to 256 characters in length.
    @NameInMap("DBInstanceDescription")
    public String DBInstanceDescription;

    // The ID of the instance.
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    // The state of the instance. For more information about valid values, see [Instance states](~~63870~~).
    @NameInMap("DBInstanceStatus")
    public String DBInstanceStatus;

    // The architecture of the instance. Default value: replicate. Valid values:
    // 
    // *   **sharding**: sharded cluster instance
    // *   **replicate**: replica set or standalone instance
    @NameInMap("DBInstanceType")
    public String DBInstanceType;

    // Used to filter standard instances or test instances
    // 
    // 1. Single node instance and dbfs instance: customized
    // 2. Standard instance (replicaset and shard cluster): standard
    // 3. Default (showing all instances): default
    @NameInMap("DBNodeType")
    public String DBNodeType;

    // The database engine of the instance. Set the value to **MongoDB**.
    @NameInMap("Engine")
    public String engine;

    // The database engine version of the instance. Valid values:
    // 
    // * **5.0**
    // * **4.4**
    // * **4.2**
    // * **4.0**
    // * **3.4**
    @NameInMap("EngineVersion")
    public String engineVersion;

    // The time when the instance expires.
    @NameInMap("ExpireTime")
    public String expireTime;

    // Specifies whether the instance has expired. Valid values:
    // 
    // *   **true**: The instance has expired.
    // *   **false**: The instance has not expired.
    @NameInMap("Expired")
    public String expired;

    // The network type of the instance. Valid values:
    // 
    // *   **Classic**: classic network
    // *   **VPC**: Virtual Private Cloud (VPC)
    @NameInMap("NetworkType")
    public String networkType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The number of the page to return. The value of this parameter must be an integer that is greater than 0. Default value: **1**.
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // The number of entries to return on each page. Default value: 30. Valid values:
    // 
    // *   **30**
    // *   **50**
    // *   **100**
    @NameInMap("PageSize")
    public Integer pageSize;

    // The region ID of the instance. You can call the [DescribeRegions](~~61933~~) operation to query the most recent region list.
    @NameInMap("RegionId")
    public String regionId;

    // The number of nodes in the replica set instance. Valid values:
    // 
    // *   **3**
    // *   **5**
    // *   **7**
    @NameInMap("ReplicationFactor")
    public String replicationFactor;

    // The ID of the resource group.
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    // The tags of instances.
    @NameInMap("Tag")
    public java.util.List<DescribeDBInstancesRequestTag> tag;

    // The ID of the vSwitch.
    @NameInMap("VSwitchId")
    public String vSwitchId;

    // The ID of the VPC.
    @NameInMap("VpcId")
    public String vpcId;

    // The zone ID of the instance. You can call the [DescribeRegions](~~61933~~) operation to query the most recent zone list.
    @NameInMap("ZoneId")
    public String zoneId;

    public static DescribeDBInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstancesRequest self = new DescribeDBInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstancesRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public DescribeDBInstancesRequest setConnectionDomain(String connectionDomain) {
        this.connectionDomain = connectionDomain;
        return this;
    }
    public String getConnectionDomain() {
        return this.connectionDomain;
    }

    public DescribeDBInstancesRequest setDBInstanceClass(String DBInstanceClass) {
        this.DBInstanceClass = DBInstanceClass;
        return this;
    }
    public String getDBInstanceClass() {
        return this.DBInstanceClass;
    }

    public DescribeDBInstancesRequest setDBInstanceDescription(String DBInstanceDescription) {
        this.DBInstanceDescription = DBInstanceDescription;
        return this;
    }
    public String getDBInstanceDescription() {
        return this.DBInstanceDescription;
    }

    public DescribeDBInstancesRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeDBInstancesRequest setDBInstanceStatus(String DBInstanceStatus) {
        this.DBInstanceStatus = DBInstanceStatus;
        return this;
    }
    public String getDBInstanceStatus() {
        return this.DBInstanceStatus;
    }

    public DescribeDBInstancesRequest setDBInstanceType(String DBInstanceType) {
        this.DBInstanceType = DBInstanceType;
        return this;
    }
    public String getDBInstanceType() {
        return this.DBInstanceType;
    }

    public DescribeDBInstancesRequest setDBNodeType(String DBNodeType) {
        this.DBNodeType = DBNodeType;
        return this;
    }
    public String getDBNodeType() {
        return this.DBNodeType;
    }

    public DescribeDBInstancesRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public DescribeDBInstancesRequest setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public DescribeDBInstancesRequest setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public DescribeDBInstancesRequest setExpired(String expired) {
        this.expired = expired;
        return this;
    }
    public String getExpired() {
        return this.expired;
    }

    public DescribeDBInstancesRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public DescribeDBInstancesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeDBInstancesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeDBInstancesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDBInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDBInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDBInstancesRequest setReplicationFactor(String replicationFactor) {
        this.replicationFactor = replicationFactor;
        return this;
    }
    public String getReplicationFactor() {
        return this.replicationFactor;
    }

    public DescribeDBInstancesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeDBInstancesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeDBInstancesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeDBInstancesRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeDBInstancesRequest setTag(java.util.List<DescribeDBInstancesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeDBInstancesRequestTag> getTag() {
        return this.tag;
    }

    public DescribeDBInstancesRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public DescribeDBInstancesRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public DescribeDBInstancesRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class DescribeDBInstancesRequestTag extends TeaModel {
        // The key of tag N of the instance. Valid values of N: **1** to **20**.
        // 
        // *   The key cannot start with `aliyun`, `acs:`, `http://`, or `https://`.
        // *   The key can be up to 64 characters in length.
        // *   The key cannot be an empty string.
        @NameInMap("Key")
        public String key;

        // The value of tag N of the instance. Valid values of N: **1** to **20**.
        // 
        // *   The value cannot start with `aliyun`, `acs:`, `http://`, or `https://`.
        // *   The value can be up to 128 characters in length.
        // *   The value can be an empty string.
        @NameInMap("Value")
        public String value;

        public static DescribeDBInstancesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancesRequestTag self = new DescribeDBInstancesRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstancesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDBInstancesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
