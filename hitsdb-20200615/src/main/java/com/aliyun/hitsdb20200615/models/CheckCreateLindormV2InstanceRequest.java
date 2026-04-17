// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class CheckCreateLindormV2InstanceRequest extends TeaModel {
    @NameInMap("ArbiterVSwitchId")
    public String arbiterVSwitchId;

    @NameInMap("ArbiterZoneId")
    public String arbiterZoneId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ArchVersion")
    public String archVersion;

    @NameInMap("CloudStorageSize")
    public Integer cloudStorageSize;

    @NameInMap("CloudStorageType")
    public String cloudStorageType;

    @NameInMap("ClusterPattern")
    public String clusterPattern;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("EngineList")
    public java.util.List<CheckCreateLindormV2InstanceRequestEngineList> engineList;

    @NameInMap("InstanceAlias")
    public String instanceAlias;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

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

    public static CheckCreateLindormV2InstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckCreateLindormV2InstanceRequest self = new CheckCreateLindormV2InstanceRequest();
        return TeaModel.build(map, self);
    }

    public CheckCreateLindormV2InstanceRequest setArbiterVSwitchId(String arbiterVSwitchId) {
        this.arbiterVSwitchId = arbiterVSwitchId;
        return this;
    }
    public String getArbiterVSwitchId() {
        return this.arbiterVSwitchId;
    }

    public CheckCreateLindormV2InstanceRequest setArbiterZoneId(String arbiterZoneId) {
        this.arbiterZoneId = arbiterZoneId;
        return this;
    }
    public String getArbiterZoneId() {
        return this.arbiterZoneId;
    }

    public CheckCreateLindormV2InstanceRequest setArchVersion(String archVersion) {
        this.archVersion = archVersion;
        return this;
    }
    public String getArchVersion() {
        return this.archVersion;
    }

    public CheckCreateLindormV2InstanceRequest setCloudStorageSize(Integer cloudStorageSize) {
        this.cloudStorageSize = cloudStorageSize;
        return this;
    }
    public Integer getCloudStorageSize() {
        return this.cloudStorageSize;
    }

    public CheckCreateLindormV2InstanceRequest setCloudStorageType(String cloudStorageType) {
        this.cloudStorageType = cloudStorageType;
        return this;
    }
    public String getCloudStorageType() {
        return this.cloudStorageType;
    }

    public CheckCreateLindormV2InstanceRequest setClusterPattern(String clusterPattern) {
        this.clusterPattern = clusterPattern;
        return this;
    }
    public String getClusterPattern() {
        return this.clusterPattern;
    }

    public CheckCreateLindormV2InstanceRequest setEngineList(java.util.List<CheckCreateLindormV2InstanceRequestEngineList> engineList) {
        this.engineList = engineList;
        return this;
    }
    public java.util.List<CheckCreateLindormV2InstanceRequestEngineList> getEngineList() {
        return this.engineList;
    }

    public CheckCreateLindormV2InstanceRequest setInstanceAlias(String instanceAlias) {
        this.instanceAlias = instanceAlias;
        return this;
    }
    public String getInstanceAlias() {
        return this.instanceAlias;
    }

    public CheckCreateLindormV2InstanceRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CheckCreateLindormV2InstanceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CheckCreateLindormV2InstanceRequest setPrimaryVSwitchId(String primaryVSwitchId) {
        this.primaryVSwitchId = primaryVSwitchId;
        return this;
    }
    public String getPrimaryVSwitchId() {
        return this.primaryVSwitchId;
    }

    public CheckCreateLindormV2InstanceRequest setPrimaryZoneId(String primaryZoneId) {
        this.primaryZoneId = primaryZoneId;
        return this;
    }
    public String getPrimaryZoneId() {
        return this.primaryZoneId;
    }

    public CheckCreateLindormV2InstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CheckCreateLindormV2InstanceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CheckCreateLindormV2InstanceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CheckCreateLindormV2InstanceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CheckCreateLindormV2InstanceRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public CheckCreateLindormV2InstanceRequest setStandbyVSwitchId(String standbyVSwitchId) {
        this.standbyVSwitchId = standbyVSwitchId;
        return this;
    }
    public String getStandbyVSwitchId() {
        return this.standbyVSwitchId;
    }

    public CheckCreateLindormV2InstanceRequest setStandbyZoneId(String standbyZoneId) {
        this.standbyZoneId = standbyZoneId;
        return this;
    }
    public String getStandbyZoneId() {
        return this.standbyZoneId;
    }

    public CheckCreateLindormV2InstanceRequest setVPCId(String VPCId) {
        this.VPCId = VPCId;
        return this;
    }
    public String getVPCId() {
        return this.VPCId;
    }

    public CheckCreateLindormV2InstanceRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CheckCreateLindormV2InstanceRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class CheckCreateLindormV2InstanceRequestEngineListNodeGroupList extends TeaModel {
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

        public static CheckCreateLindormV2InstanceRequestEngineListNodeGroupList build(java.util.Map<String, ?> map) throws Exception {
            CheckCreateLindormV2InstanceRequestEngineListNodeGroupList self = new CheckCreateLindormV2InstanceRequestEngineListNodeGroupList();
            return TeaModel.build(map, self);
        }

        public CheckCreateLindormV2InstanceRequestEngineListNodeGroupList setNodeCount(Integer nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }
        public Integer getNodeCount() {
            return this.nodeCount;
        }

        public CheckCreateLindormV2InstanceRequestEngineListNodeGroupList setNodeDiskSize(Integer nodeDiskSize) {
            this.nodeDiskSize = nodeDiskSize;
            return this;
        }
        public Integer getNodeDiskSize() {
            return this.nodeDiskSize;
        }

        public CheckCreateLindormV2InstanceRequestEngineListNodeGroupList setNodeDiskType(String nodeDiskType) {
            this.nodeDiskType = nodeDiskType;
            return this;
        }
        public String getNodeDiskType() {
            return this.nodeDiskType;
        }

        public CheckCreateLindormV2InstanceRequestEngineListNodeGroupList setNodeSpec(String nodeSpec) {
            this.nodeSpec = nodeSpec;
            return this;
        }
        public String getNodeSpec() {
            return this.nodeSpec;
        }

        public CheckCreateLindormV2InstanceRequestEngineListNodeGroupList setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = resourceGroupName;
            return this;
        }
        public String getResourceGroupName() {
            return this.resourceGroupName;
        }

    }

    public static class CheckCreateLindormV2InstanceRequestEngineList extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("EngineType")
        public String engineType;

        @NameInMap("NodeGroupList")
        public java.util.List<CheckCreateLindormV2InstanceRequestEngineListNodeGroupList> nodeGroupList;

        public static CheckCreateLindormV2InstanceRequestEngineList build(java.util.Map<String, ?> map) throws Exception {
            CheckCreateLindormV2InstanceRequestEngineList self = new CheckCreateLindormV2InstanceRequestEngineList();
            return TeaModel.build(map, self);
        }

        public CheckCreateLindormV2InstanceRequestEngineList setEngineType(String engineType) {
            this.engineType = engineType;
            return this;
        }
        public String getEngineType() {
            return this.engineType;
        }

        public CheckCreateLindormV2InstanceRequestEngineList setNodeGroupList(java.util.List<CheckCreateLindormV2InstanceRequestEngineListNodeGroupList> nodeGroupList) {
            this.nodeGroupList = nodeGroupList;
            return this;
        }
        public java.util.List<CheckCreateLindormV2InstanceRequestEngineListNodeGroupList> getNodeGroupList() {
            return this.nodeGroupList;
        }

    }

}
