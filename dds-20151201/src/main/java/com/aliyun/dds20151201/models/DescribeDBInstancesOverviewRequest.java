// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeDBInstancesOverviewRequest extends TeaModel {
    // The billing method of the instance. Valid values:
    // 
    // *   **PrePaid**: subscription
    // *   **PostPaid**: pay-as-you-go
    @NameInMap("ChargeType")
    public String chargeType;

    // The database engine version of the instance. Valid values: **5.0**, **4.4**, **4.2**, **4.0**, and **3.4**.
    @NameInMap("EngineVersion")
    public String engineVersion;

    // The instance type of the instance. The instance type varies based on the instance architecture. For more information about instance types supported by different instance architectures, see the following topics:
    // 
    // *   [Standalone instance types](~~311407~~)
    // *   [Replica set instance types](~~311410~~)
    // *   [Sharded cluster instance types](~~311414~~)
    @NameInMap("InstanceClass")
    public String instanceClass;

    // The ID of the instance for which you want to query the overview information.
    // 
    // > * If you do not specify this parameter, the overview information of all instances under this account is queried.
    // > * Separate the instance IDs with commas (,).
    @NameInMap("InstanceIds")
    public String instanceIds;

    // The state of the instance. For more information about valid values, see [Instance states](~~63870~~).
    @NameInMap("InstanceStatus")
    public String instanceStatus;

    // The category of the instance. Valid values:
    // 
    // - **sharding**: sharded cluster instance
    // - **replicate**: replica set or standalone instance
    // 
    // > * To query the overview information of a sharded cluster instance, you must set the parameter to **sharding**.
    // > * If you do not specify this parameter, the overview information of all instances under this account is queried.
    @NameInMap("InstanceType")
    public String instanceType;

    // The network type of the instance. Valid values:
    // 
    // *   **Classic**
    // *   **VPC**
    @NameInMap("NetworkType")
    public String networkType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The region ID of the instance. You can call the [DescribeRegions](~~61933~~) operation to query the most recent region list.
    @NameInMap("RegionId")
    public String regionId;

    // The ID of the resource group. For more information, see [View basic information of a resource group](~~151181~~).
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    // The ID of the vSwitch.
    @NameInMap("VSwitchId")
    public String vSwitchId;

    // The ID of the virtual private cloud (VPC).
    @NameInMap("VpcId")
    public String vpcId;

    // The ID of the zone.
    @NameInMap("ZoneId")
    public String zoneId;

    public static DescribeDBInstancesOverviewRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstancesOverviewRequest self = new DescribeDBInstancesOverviewRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstancesOverviewRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public DescribeDBInstancesOverviewRequest setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public DescribeDBInstancesOverviewRequest setInstanceClass(String instanceClass) {
        this.instanceClass = instanceClass;
        return this;
    }
    public String getInstanceClass() {
        return this.instanceClass;
    }

    public DescribeDBInstancesOverviewRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

    public DescribeDBInstancesOverviewRequest setInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }
    public String getInstanceStatus() {
        return this.instanceStatus;
    }

    public DescribeDBInstancesOverviewRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public DescribeDBInstancesOverviewRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public DescribeDBInstancesOverviewRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeDBInstancesOverviewRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeDBInstancesOverviewRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDBInstancesOverviewRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeDBInstancesOverviewRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeDBInstancesOverviewRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeDBInstancesOverviewRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeDBInstancesOverviewRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public DescribeDBInstancesOverviewRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public DescribeDBInstancesOverviewRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
