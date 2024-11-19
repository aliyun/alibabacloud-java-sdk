// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class ModifyLindormV2InstanceRequest extends TeaModel {
    @NameInMap("CloudStorageSize")
    public Long cloudStorageSize;

    @NameInMap("CloudStorageType")
    public String cloudStorageType;

    @NameInMap("EngineType")
    public String engineType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("NodeGroupList")
    public java.util.List<ModifyLindormV2InstanceRequestNodeGroupList> nodeGroupList;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("UpgradeType")
    public String upgradeType;

    public static ModifyLindormV2InstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyLindormV2InstanceRequest self = new ModifyLindormV2InstanceRequest();
        return TeaModel.build(map, self);
    }

    public ModifyLindormV2InstanceRequest setCloudStorageSize(Long cloudStorageSize) {
        this.cloudStorageSize = cloudStorageSize;
        return this;
    }
    public Long getCloudStorageSize() {
        return this.cloudStorageSize;
    }

    public ModifyLindormV2InstanceRequest setCloudStorageType(String cloudStorageType) {
        this.cloudStorageType = cloudStorageType;
        return this;
    }
    public String getCloudStorageType() {
        return this.cloudStorageType;
    }

    public ModifyLindormV2InstanceRequest setEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }
    public String getEngineType() {
        return this.engineType;
    }

    public ModifyLindormV2InstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyLindormV2InstanceRequest setNodeGroupList(java.util.List<ModifyLindormV2InstanceRequestNodeGroupList> nodeGroupList) {
        this.nodeGroupList = nodeGroupList;
        return this;
    }
    public java.util.List<ModifyLindormV2InstanceRequestNodeGroupList> getNodeGroupList() {
        return this.nodeGroupList;
    }

    public ModifyLindormV2InstanceRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyLindormV2InstanceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyLindormV2InstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyLindormV2InstanceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyLindormV2InstanceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyLindormV2InstanceRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public ModifyLindormV2InstanceRequest setUpgradeType(String upgradeType) {
        this.upgradeType = upgradeType;
        return this;
    }
    public String getUpgradeType() {
        return this.upgradeType;
    }

    public static class ModifyLindormV2InstanceRequestNodeGroupList extends TeaModel {
        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("NodeCount")
        public String nodeCount;

        @NameInMap("NodeDiskSize")
        public Long nodeDiskSize;

        @NameInMap("NodeDiskType")
        public String nodeDiskType;

        @NameInMap("NodeSpec")
        public String nodeSpec;

        @NameInMap("ResourceGroupName")
        public String resourceGroupName;

        public static ModifyLindormV2InstanceRequestNodeGroupList build(java.util.Map<String, ?> map) throws Exception {
            ModifyLindormV2InstanceRequestNodeGroupList self = new ModifyLindormV2InstanceRequestNodeGroupList();
            return TeaModel.build(map, self);
        }

        public ModifyLindormV2InstanceRequestNodeGroupList setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public ModifyLindormV2InstanceRequestNodeGroupList setNodeCount(String nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }
        public String getNodeCount() {
            return this.nodeCount;
        }

        public ModifyLindormV2InstanceRequestNodeGroupList setNodeDiskSize(Long nodeDiskSize) {
            this.nodeDiskSize = nodeDiskSize;
            return this;
        }
        public Long getNodeDiskSize() {
            return this.nodeDiskSize;
        }

        public ModifyLindormV2InstanceRequestNodeGroupList setNodeDiskType(String nodeDiskType) {
            this.nodeDiskType = nodeDiskType;
            return this;
        }
        public String getNodeDiskType() {
            return this.nodeDiskType;
        }

        public ModifyLindormV2InstanceRequestNodeGroupList setNodeSpec(String nodeSpec) {
            this.nodeSpec = nodeSpec;
            return this;
        }
        public String getNodeSpec() {
            return this.nodeSpec;
        }

        public ModifyLindormV2InstanceRequestNodeGroupList setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = resourceGroupName;
            return this;
        }
        public String getResourceGroupName() {
            return this.resourceGroupName;
        }

    }

}
