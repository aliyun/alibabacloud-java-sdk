// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class CreateLindormV2InstanceRequest extends TeaModel {
    @NameInMap("ArbiterVSwitchId")
    public String arbiterVSwitchId;

    @NameInMap("ArbiterZoneId")
    public String arbiterZoneId;

    @NameInMap("ArchVersion")
    public String archVersion;

    @NameInMap("AutoRenewDuration")
    public String autoRenewDuration;

    @NameInMap("AutoRenewal")
    public Boolean autoRenewal;

    @NameInMap("CapacityStorageSize")
    public Integer capacityStorageSize;

    @NameInMap("CloudStorageSize")
    public Integer cloudStorageSize;

    @NameInMap("CloudStorageType")
    public String cloudStorageType;

    @NameInMap("ClusterMode")
    public String clusterMode;

    @NameInMap("ClusterPattern")
    public String clusterPattern;

    @NameInMap("Duration")
    public Integer duration;

    @NameInMap("EnableCapacityStorage")
    public Boolean enableCapacityStorage;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("EngineList")
    public java.util.List<CreateLindormV2InstanceRequestEngineList> engineList;

    @NameInMap("InstanceAlias")
    public String instanceAlias;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PayType")
    public String payType;

    @NameInMap("PricingCycle")
    public String pricingCycle;

    @NameInMap("PrimaryVSwitchId")
    public String primaryVSwitchId;

    @NameInMap("PrimaryZoneId")
    public String primaryZoneId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("StandbyVSwitchId")
    public String standbyVSwitchId;

    @NameInMap("StandbyZoneId")
    public String standbyZoneId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("VPCId")
    public String VPCId;

    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static CreateLindormV2InstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLindormV2InstanceRequest self = new CreateLindormV2InstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateLindormV2InstanceRequest setArbiterVSwitchId(String arbiterVSwitchId) {
        this.arbiterVSwitchId = arbiterVSwitchId;
        return this;
    }
    public String getArbiterVSwitchId() {
        return this.arbiterVSwitchId;
    }

    public CreateLindormV2InstanceRequest setArbiterZoneId(String arbiterZoneId) {
        this.arbiterZoneId = arbiterZoneId;
        return this;
    }
    public String getArbiterZoneId() {
        return this.arbiterZoneId;
    }

    public CreateLindormV2InstanceRequest setArchVersion(String archVersion) {
        this.archVersion = archVersion;
        return this;
    }
    public String getArchVersion() {
        return this.archVersion;
    }

    public CreateLindormV2InstanceRequest setAutoRenewDuration(String autoRenewDuration) {
        this.autoRenewDuration = autoRenewDuration;
        return this;
    }
    public String getAutoRenewDuration() {
        return this.autoRenewDuration;
    }

    public CreateLindormV2InstanceRequest setAutoRenewal(Boolean autoRenewal) {
        this.autoRenewal = autoRenewal;
        return this;
    }
    public Boolean getAutoRenewal() {
        return this.autoRenewal;
    }

    public CreateLindormV2InstanceRequest setCapacityStorageSize(Integer capacityStorageSize) {
        this.capacityStorageSize = capacityStorageSize;
        return this;
    }
    public Integer getCapacityStorageSize() {
        return this.capacityStorageSize;
    }

    public CreateLindormV2InstanceRequest setCloudStorageSize(Integer cloudStorageSize) {
        this.cloudStorageSize = cloudStorageSize;
        return this;
    }
    public Integer getCloudStorageSize() {
        return this.cloudStorageSize;
    }

    public CreateLindormV2InstanceRequest setCloudStorageType(String cloudStorageType) {
        this.cloudStorageType = cloudStorageType;
        return this;
    }
    public String getCloudStorageType() {
        return this.cloudStorageType;
    }

    public CreateLindormV2InstanceRequest setClusterMode(String clusterMode) {
        this.clusterMode = clusterMode;
        return this;
    }
    public String getClusterMode() {
        return this.clusterMode;
    }

    public CreateLindormV2InstanceRequest setClusterPattern(String clusterPattern) {
        this.clusterPattern = clusterPattern;
        return this;
    }
    public String getClusterPattern() {
        return this.clusterPattern;
    }

    public CreateLindormV2InstanceRequest setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public CreateLindormV2InstanceRequest setEnableCapacityStorage(Boolean enableCapacityStorage) {
        this.enableCapacityStorage = enableCapacityStorage;
        return this;
    }
    public Boolean getEnableCapacityStorage() {
        return this.enableCapacityStorage;
    }

    public CreateLindormV2InstanceRequest setEngineList(java.util.List<CreateLindormV2InstanceRequestEngineList> engineList) {
        this.engineList = engineList;
        return this;
    }
    public java.util.List<CreateLindormV2InstanceRequestEngineList> getEngineList() {
        return this.engineList;
    }

    public CreateLindormV2InstanceRequest setInstanceAlias(String instanceAlias) {
        this.instanceAlias = instanceAlias;
        return this;
    }
    public String getInstanceAlias() {
        return this.instanceAlias;
    }

    public CreateLindormV2InstanceRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateLindormV2InstanceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateLindormV2InstanceRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public CreateLindormV2InstanceRequest setPricingCycle(String pricingCycle) {
        this.pricingCycle = pricingCycle;
        return this;
    }
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    public CreateLindormV2InstanceRequest setPrimaryVSwitchId(String primaryVSwitchId) {
        this.primaryVSwitchId = primaryVSwitchId;
        return this;
    }
    public String getPrimaryVSwitchId() {
        return this.primaryVSwitchId;
    }

    public CreateLindormV2InstanceRequest setPrimaryZoneId(String primaryZoneId) {
        this.primaryZoneId = primaryZoneId;
        return this;
    }
    public String getPrimaryZoneId() {
        return this.primaryZoneId;
    }

    public CreateLindormV2InstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateLindormV2InstanceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateLindormV2InstanceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateLindormV2InstanceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateLindormV2InstanceRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public CreateLindormV2InstanceRequest setStandbyVSwitchId(String standbyVSwitchId) {
        this.standbyVSwitchId = standbyVSwitchId;
        return this;
    }
    public String getStandbyVSwitchId() {
        return this.standbyVSwitchId;
    }

    public CreateLindormV2InstanceRequest setStandbyZoneId(String standbyZoneId) {
        this.standbyZoneId = standbyZoneId;
        return this;
    }
    public String getStandbyZoneId() {
        return this.standbyZoneId;
    }

    public CreateLindormV2InstanceRequest setVPCId(String VPCId) {
        this.VPCId = VPCId;
        return this;
    }
    public String getVPCId() {
        return this.VPCId;
    }

    public CreateLindormV2InstanceRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateLindormV2InstanceRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class CreateLindormV2InstanceRequestEngineListNodeGroupList extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("NodeCount")
        public Integer nodeCount;

        @NameInMap("NodeDiskSize")
        public Integer nodeDiskSize;

        @NameInMap("NodeDiskType")
        public String nodeDiskType;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("NodeSpec")
        public String nodeSpec;

        @NameInMap("ResourceGroupName")
        public String resourceGroupName;

        public static CreateLindormV2InstanceRequestEngineListNodeGroupList build(java.util.Map<String, ?> map) throws Exception {
            CreateLindormV2InstanceRequestEngineListNodeGroupList self = new CreateLindormV2InstanceRequestEngineListNodeGroupList();
            return TeaModel.build(map, self);
        }

        public CreateLindormV2InstanceRequestEngineListNodeGroupList setNodeCount(Integer nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }
        public Integer getNodeCount() {
            return this.nodeCount;
        }

        public CreateLindormV2InstanceRequestEngineListNodeGroupList setNodeDiskSize(Integer nodeDiskSize) {
            this.nodeDiskSize = nodeDiskSize;
            return this;
        }
        public Integer getNodeDiskSize() {
            return this.nodeDiskSize;
        }

        public CreateLindormV2InstanceRequestEngineListNodeGroupList setNodeDiskType(String nodeDiskType) {
            this.nodeDiskType = nodeDiskType;
            return this;
        }
        public String getNodeDiskType() {
            return this.nodeDiskType;
        }

        public CreateLindormV2InstanceRequestEngineListNodeGroupList setNodeSpec(String nodeSpec) {
            this.nodeSpec = nodeSpec;
            return this;
        }
        public String getNodeSpec() {
            return this.nodeSpec;
        }

        public CreateLindormV2InstanceRequestEngineListNodeGroupList setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = resourceGroupName;
            return this;
        }
        public String getResourceGroupName() {
            return this.resourceGroupName;
        }

    }

    public static class CreateLindormV2InstanceRequestEngineList extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("EngineType")
        public String engineType;

        @NameInMap("NodeGroupList")
        public java.util.List<CreateLindormV2InstanceRequestEngineListNodeGroupList> nodeGroupList;

        public static CreateLindormV2InstanceRequestEngineList build(java.util.Map<String, ?> map) throws Exception {
            CreateLindormV2InstanceRequestEngineList self = new CreateLindormV2InstanceRequestEngineList();
            return TeaModel.build(map, self);
        }

        public CreateLindormV2InstanceRequestEngineList setEngineType(String engineType) {
            this.engineType = engineType;
            return this;
        }
        public String getEngineType() {
            return this.engineType;
        }

        public CreateLindormV2InstanceRequestEngineList setNodeGroupList(java.util.List<CreateLindormV2InstanceRequestEngineListNodeGroupList> nodeGroupList) {
            this.nodeGroupList = nodeGroupList;
            return this;
        }
        public java.util.List<CreateLindormV2InstanceRequestEngineListNodeGroupList> getNodeGroupList() {
            return this.nodeGroupList;
        }

    }

}
