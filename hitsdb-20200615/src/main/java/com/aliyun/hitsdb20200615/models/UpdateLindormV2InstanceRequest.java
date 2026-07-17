// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class UpdateLindormV2InstanceRequest extends TeaModel {
    /**
     * <p>The capacity of the storage-optimized storage.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("CapacityStorageSize")
    public Integer capacityStorageSize;

    /**
     * <p>The cloud storage capacity. Unit: GB.</p>
     * 
     * <strong>example:</strong>
     * <p>480</p>
     */
    @NameInMap("CloudStorageSize")
    public Integer cloudStorageSize;

    /**
     * <p>The cloud storage class.</p>
     * <ul>
     * <li><p><strong>PerformanceStorage</strong>: performance cloud storage.</p>
     * </li>
     * <li><p><strong>StandardStorage</strong>: standard cloud storage.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PerformanceStorage</p>
     */
    @NameInMap("CloudStorageType")
    public String cloudStorageType;

    /**
     * <p>Specifies whether to enable storage-optimized storage.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableCapacityStorage")
    public Boolean enableCapacityStorage;

    /**
     * <p>A list of engine types.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("EngineList")
    public java.util.List<UpdateLindormV2InstanceRequestEngineList> engineList;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ld-bp1o3y0yme2i2****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region where the instance is located. To query the latest region list, call the <a href="https://help.aliyun.com/document_detail/426062.html">DescribeRegions</a> operation.</p>
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

    @NameInMap("SecurityToken")
    public String securityToken;

    public static UpdateLindormV2InstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLindormV2InstanceRequest self = new UpdateLindormV2InstanceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLindormV2InstanceRequest setCapacityStorageSize(Integer capacityStorageSize) {
        this.capacityStorageSize = capacityStorageSize;
        return this;
    }
    public Integer getCapacityStorageSize() {
        return this.capacityStorageSize;
    }

    public UpdateLindormV2InstanceRequest setCloudStorageSize(Integer cloudStorageSize) {
        this.cloudStorageSize = cloudStorageSize;
        return this;
    }
    public Integer getCloudStorageSize() {
        return this.cloudStorageSize;
    }

    public UpdateLindormV2InstanceRequest setCloudStorageType(String cloudStorageType) {
        this.cloudStorageType = cloudStorageType;
        return this;
    }
    public String getCloudStorageType() {
        return this.cloudStorageType;
    }

    public UpdateLindormV2InstanceRequest setEnableCapacityStorage(Boolean enableCapacityStorage) {
        this.enableCapacityStorage = enableCapacityStorage;
        return this;
    }
    public Boolean getEnableCapacityStorage() {
        return this.enableCapacityStorage;
    }

    public UpdateLindormV2InstanceRequest setEngineList(java.util.List<UpdateLindormV2InstanceRequestEngineList> engineList) {
        this.engineList = engineList;
        return this;
    }
    public java.util.List<UpdateLindormV2InstanceRequestEngineList> getEngineList() {
        return this.engineList;
    }

    public UpdateLindormV2InstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateLindormV2InstanceRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public UpdateLindormV2InstanceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateLindormV2InstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateLindormV2InstanceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdateLindormV2InstanceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UpdateLindormV2InstanceRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static class UpdateLindormV2InstanceRequestEngineListNodeGroupList extends TeaModel {
        /**
         * <p>The ID of the node group.</p>
         * 
         * <strong>example:</strong>
         * <p>ix90Yes</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The number of nodes.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("NodeCount")
        public Integer nodeCount;

        /**
         * <p>The disk size of a single node. This parameter is not required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("NodeDiskSize")
        public Integer nodeDiskSize;

        /**
         * <p>The disk type of the node. This parameter is not required. <strong>This parameter is available only for specific scenarios and is accessible to users on a whitelist.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>cloud_essd</p>
         */
        @NameInMap("NodeDiskType")
        public String nodeDiskType;

        /**
         * <p>The node specifications of the engine.</p>
         * <ul>
         * <li><p><strong>lindorm.c.2xlarge</strong>: 8 cores and 16 GB of memory.</p>
         * </li>
         * <li><p><strong>lindorm.g.2xlarge</strong>: 8 cores and 32 GB of memory.</p>
         * </li>
         * <li><p><strong>lindorm.c.4xlarge</strong>: 16 cores and 32 GB of memory.</p>
         * </li>
         * <li><p><strong>lindorm.g.4xlarge</strong>: 16 cores and 64 GB of memory.</p>
         * </li>
         * <li><p><strong>lindorm.c.8xlarge</strong>: 32 cores and 64 GB of memory.</p>
         * </li>
         * <li><p><strong>lindorm.g.8xlarge</strong>: 32 cores and 128 GB of memory.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>lindorm.g.2xlarge</p>
         */
        @NameInMap("NodeSpec")
        public String nodeSpec;

        /**
         * <p>The name of the node group. <strong>This parameter is required.</strong> You can obtain the name by calling the GetLindormV2Instance operation.</p>
         * 
         * <strong>example:</strong>
         * <p>groupName</p>
         */
        @NameInMap("ResourceGroupName")
        public String resourceGroupName;

        public static UpdateLindormV2InstanceRequestEngineListNodeGroupList build(java.util.Map<String, ?> map) throws Exception {
            UpdateLindormV2InstanceRequestEngineListNodeGroupList self = new UpdateLindormV2InstanceRequestEngineListNodeGroupList();
            return TeaModel.build(map, self);
        }

        public UpdateLindormV2InstanceRequestEngineListNodeGroupList setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public UpdateLindormV2InstanceRequestEngineListNodeGroupList setNodeCount(Integer nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }
        public Integer getNodeCount() {
            return this.nodeCount;
        }

        public UpdateLindormV2InstanceRequestEngineListNodeGroupList setNodeDiskSize(Integer nodeDiskSize) {
            this.nodeDiskSize = nodeDiskSize;
            return this;
        }
        public Integer getNodeDiskSize() {
            return this.nodeDiskSize;
        }

        public UpdateLindormV2InstanceRequestEngineListNodeGroupList setNodeDiskType(String nodeDiskType) {
            this.nodeDiskType = nodeDiskType;
            return this;
        }
        public String getNodeDiskType() {
            return this.nodeDiskType;
        }

        public UpdateLindormV2InstanceRequestEngineListNodeGroupList setNodeSpec(String nodeSpec) {
            this.nodeSpec = nodeSpec;
            return this;
        }
        public String getNodeSpec() {
            return this.nodeSpec;
        }

        public UpdateLindormV2InstanceRequestEngineListNodeGroupList setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = resourceGroupName;
            return this;
        }
        public String getResourceGroupName() {
            return this.resourceGroupName;
        }

    }

    public static class UpdateLindormV2InstanceRequestEngineList extends TeaModel {
        /**
         * <p>The engine type. Valid values:</p>
         * <ul>
         * <li><p>TABLE: LindormTable.</p>
         * </li>
         * <li><p>TSDB: LindormTSDB.</p>
         * </li>
         * <li><p>LSEARCH: search engine.</p>
         * </li>
         * <li><p>LTS: LTS engine.</p>
         * </li>
         * <li><p>LVECTOR: vector engine.</p>
         * </li>
         * <li><p>LCOLUMN: column store.</p>
         * </li>
         * <li><p>LAI: AI engine.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TABLE</p>
         */
        @NameInMap("EngineType")
        public String engineType;

        /**
         * <p>A list of engine node groups.</p>
         */
        @NameInMap("NodeGroupList")
        public java.util.List<UpdateLindormV2InstanceRequestEngineListNodeGroupList> nodeGroupList;

        public static UpdateLindormV2InstanceRequestEngineList build(java.util.Map<String, ?> map) throws Exception {
            UpdateLindormV2InstanceRequestEngineList self = new UpdateLindormV2InstanceRequestEngineList();
            return TeaModel.build(map, self);
        }

        public UpdateLindormV2InstanceRequestEngineList setEngineType(String engineType) {
            this.engineType = engineType;
            return this;
        }
        public String getEngineType() {
            return this.engineType;
        }

        public UpdateLindormV2InstanceRequestEngineList setNodeGroupList(java.util.List<UpdateLindormV2InstanceRequestEngineListNodeGroupList> nodeGroupList) {
            this.nodeGroupList = nodeGroupList;
            return this;
        }
        public java.util.List<UpdateLindormV2InstanceRequestEngineListNodeGroupList> getNodeGroupList() {
            return this.nodeGroupList;
        }

    }

}
