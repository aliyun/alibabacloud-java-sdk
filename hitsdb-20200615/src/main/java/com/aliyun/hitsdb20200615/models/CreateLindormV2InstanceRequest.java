// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class CreateLindormV2InstanceRequest extends TeaModel {
    /**
     * <p>The ID of the vSwitch in the arbiter zone for a multi-zone instance. The vSwitch must be in the zone specified by ArbiterZoneId. <strong>This parameter is required if you want to create a multi-zone instance.</strong></p>
     * 
     * <strong>example:</strong>
     * <p>vsw-uf6664pqjawb87k36****</p>
     */
    @NameInMap("ArbiterVSwitchId")
    public String arbiterVSwitchId;

    /**
     * <p>The ID of the arbiter zone for a multi-zone instance. <strong>This parameter is required if you want to create a multi-zone instance.</strong></p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai-g</p>
     */
    @NameInMap("ArbiterZoneId")
    public String arbiterZoneId;

    /**
     * <p>The deployment architecture. Valid values:</p>
     * <ul>
     * <li><p><strong>1.0</strong>: single zone.</p>
     * </li>
     * <li><p><strong>2.0</strong>: multi-zone Basic Edition.</p>
     * </li>
     * <li><p><strong>3.0</strong>: multi-zone High-availability Edition.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2.0</p>
     */
    @NameInMap("ArchVersion")
    public String archVersion;

    /**
     * <p>The auto-renewal duration. Unit: month.</p>
     * <p>Valid values: <strong>1</strong> to <strong>12</strong>.</p>
     * <blockquote>
     * <p>This parameter is valid only when you set <strong>AutoRenewal</strong> to <strong>true</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AutoRenewDuration")
    public String autoRenewDuration;

    /**
     * <p>Specifies whether to enable auto-renewal for the instance. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Enable auto-renewal.</p>
     * </li>
     * <li><p><strong>false</strong>: Disable auto-renewal.</p>
     * </li>
     * </ul>
     * <p>The default value is false.</p>
     * <blockquote>
     * <p>This parameter is valid only when you set <strong>PayType</strong> to <strong>PREPAY</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoRenewal")
    public Boolean autoRenewal;

    /**
     * <p>The size of the storage-optimized storage. Unit: GB.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("CapacityStorageSize")
    public Integer capacityStorageSize;

    /**
     * <p>The size of the cloud storage. Unit: GB.</p>
     * 
     * <strong>example:</strong>
     * <p>320</p>
     */
    @NameInMap("CloudStorageSize")
    public Integer cloudStorageSize;

    /**
     * <p>The storage class. This parameter is not required if you select <strong>Big Data</strong> or <strong>Local SSD</strong>.</p>
     * <ul>
     * <li><p><strong>PerformanceStorage</strong>: performance cloud storage</p>
     * </li>
     * <li><p><strong>StandardStorage</strong>: standard cloud storage</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PerformanceStorage</p>
     */
    @NameInMap("CloudStorageType")
    public String cloudStorageType;

    /**
     * <p>The instance mode. This parameter is not required.</p>
     * <ul>
     * <li><strong>BASIC</strong>: general-purpose mode</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>BASIC</p>
     */
    @NameInMap("ClusterMode")
    public String clusterMode;

    /**
     * <p>The cluster type. Valid value:</p>
     * <ul>
     * <li><strong>basic</strong>: production</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>basic</p>
     */
    @NameInMap("ClusterPattern")
    public String clusterPattern;

    /**
     * <p>The subscription duration of the instance. Valid values:</p>
     * <ul>
     * <li><p>If you set PricingCycle to <strong>Month</strong>, the valid values are <strong>1</strong> to <strong>9</strong>.</p>
     * </li>
     * <li><p>If you set PricingCycle to <strong>Year</strong>, the valid values are <strong>1</strong> to <strong>3</strong>.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required only when you set PayType to <strong>PREPAY</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Duration")
    public Integer duration;

    /**
     * <p>Specifies whether to enable storage-optimized storage.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableCapacityStorage")
    public Boolean enableCapacityStorage;

    /**
     * <p>The list of engine information.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("EngineList")
    public java.util.List<CreateLindormV2InstanceRequestEngineList> engineList;

    /**
     * <p>The name of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>lindorm-test</p>
     */
    @NameInMap("InstanceAlias")
    public String instanceAlias;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The billing method of the instance. Valid values:</p>
     * <ul>
     * <li><p><strong>PREPAY</strong>: subscription.</p>
     * </li>
     * <li><p><strong>POSTPAY</strong>: pay-as-you-go.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PREPAY</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The subscription period of the instance. Valid values:</p>
     * <ul>
     * <li><p><strong>Month</strong>: The unit is month.</p>
     * </li>
     * <li><p><strong>Year</strong>: The unit is year.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required only when you set PayType to <strong>PREPAY</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PricingCycle")
    public String pricingCycle;

    /**
     * <p>The ID of the vSwitch in the primary zone for a multi-zone instance. The vSwitch must be in the zone specified by PrimaryZoneId. <strong>This parameter is required if you want to create a multi-zone instance.</strong></p>
     * 
     * <strong>example:</strong>
     * <p>vsw-uf6fdqa7c0pipnqzq****</p>
     */
    @NameInMap("PrimaryVSwitchId")
    public String primaryVSwitchId;

    /**
     * <p>The ID of the primary zone for a multi-zone instance. <strong>This parameter is required if you want to create a multi-zone instance.</strong></p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai-e</p>
     */
    @NameInMap("PrimaryZoneId")
    public String primaryZoneId;

    /**
     * <p>The ID of the region where you want to create the instance. To query the available regions, call the <a href="https://help.aliyun.com/document_detail/426062.html">DescribeRegions</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aek2i6weeb4nfii</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The ID of the vSwitch in the secondary zone for a multi-zone instance. The vSwitch must be in the zone specified by StandbyZoneId. <strong>This parameter is required if you want to create a multi-zone instance.</strong></p>
     * 
     * <strong>example:</strong>
     * <p>vsw-2zec0kcn08cgdtr6****</p>
     */
    @NameInMap("StandbyVSwitchId")
    public String standbyVSwitchId;

    /**
     * <p>The ID of the secondary zone for a multi-zone instance. <strong>This parameter is required if you want to create a multi-zone instance.</strong></p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai-f</p>
     */
    @NameInMap("StandbyZoneId")
    public String standbyZoneId;

    /**
     * <p>The ID of the virtual private cloud (VPC) for the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-wz9ydz3vg93s1ozsd****</p>
     */
    @NameInMap("VPCId")
    public String VPCId;

    /**
     * <p>The ID of the vSwitch.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1e7clcw529l773d****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the zone for the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai-f</p>
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
         * <p>The number of nodes in the cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("NodeCount")
        public Integer nodeCount;

        /**
         * <p>The disk size of a single node. The default unit is GB.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("NodeDiskSize")
        public Integer nodeDiskSize;

        /**
         * <p>The disk type of the node. This parameter is not required. <strong>This parameter is available only for specific scenarios. To use this parameter, you must be added to the whitelist.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>cloud_essd</p>
         */
        @NameInMap("NodeDiskType")
        public String nodeDiskType;

        /**
         * <p>The node specifications.</p>
         * <p>If you select performance cloud storage or standard cloud storage, set this parameter to one of the following values:</p>
         * <ul>
         * <li><p><strong>lindorm.c.2xlarge</strong>: 8 cores, 16 GB.</p>
         * </li>
         * <li><p><strong>lindorm.g.2xlarge</strong>: 8 cores, 32 GB.</p>
         * </li>
         * <li><p><strong>lindorm.c.4xlarge</strong>: 16 cores, 32 GB.</p>
         * </li>
         * <li><p><strong>lindorm.g.4xlarge</strong>: 16 cores, 64 GB.</p>
         * </li>
         * <li><p><strong>lindorm.c.8xlarge</strong>: 32 cores, 64 GB.</p>
         * </li>
         * <li><p><strong>lindorm.g.8xlarge</strong>: 32 cores, 128 GB.</p>
         * </li>
         * <li><p><strong>lindorm.r.2xlarge</strong>: 8 cores, 64 GB.</p>
         * </li>
         * <li><p><strong>lindorm.r.4xlarge</strong>: 16 cores, 128 GB.</p>
         * </li>
         * <li><p><strong>lindorm.r.8xlarge</strong>: 32 cores, 256 GB.</p>
         * </li>
         * </ul>
         * <p>If you select the local SSD type, set this parameter to one of the following values:</p>
         * <ul>
         * <li><p><strong>lindorm.i4.xlarge</strong>: 4 cores, 32 GB (I4).</p>
         * </li>
         * <li><p><strong>lindorm.i4.2xlarge</strong>: 8 cores, 64 GB (I4).</p>
         * </li>
         * <li><p><strong>lindorm.i4.4xlarge</strong>: 16 cores, 128 GB (I4).</p>
         * </li>
         * <li><p><strong>lindorm.i4.8xlarge</strong>: 32 cores, 256 GB (I4).</p>
         * </li>
         * <li><p><strong>lindorm.i3.xlarge</strong>: 4 cores, 32 GB (I3).</p>
         * </li>
         * <li><p><strong>lindorm.i3.2xlarge</strong>: 8 cores, 64 GB (I3).</p>
         * </li>
         * <li><p><strong>lindorm.i3.4xlarge</strong>: 16 cores, 128 GB (I3).</p>
         * </li>
         * <li><p><strong>lindorm.i3.8xlarge</strong>: 32 cores, 256 GB (I3).</p>
         * </li>
         * <li><p><strong>lindorm.i2.xlarge</strong>: 4 cores, 32 GB (I2).</p>
         * </li>
         * <li><p><strong>lindorm.i2.2xlarge</strong>: 8 cores, 64 GB (I2).</p>
         * </li>
         * <li><p><strong>lindorm.i2.4xlarge</strong>: 16 cores, 128 GB (I2).</p>
         * </li>
         * <li><p><strong>lindorm.i2.8xlarge</strong>: 32 cores, 256 GB (I2).</p>
         * </li>
         * </ul>
         * <p>If you select the big data type, set this parameter to one of the following values:</p>
         * <ul>
         * <li><p><strong>lindorm.sd3c.3xlarge</strong>: 14 cores, 56 GB (D3C PRO).</p>
         * </li>
         * <li><p><strong>lindorm.sd3c.7xlarge</strong>: 28 cores, 112 GB (D3C PRO).</p>
         * </li>
         * <li><p><strong>lindorm.sd3c.14xlarge</strong>: 56 cores, 224 GB (D3C PRO).</p>
         * </li>
         * <li><p><strong>lindorm.d2c.6xlarge</strong>: 24 cores, 88 GB (D2C).</p>
         * </li>
         * <li><p><strong>lindorm.d2c.12xlarge</strong>: 48 cores, 176 GB (D2C).</p>
         * </li>
         * <li><p><strong>lindorm.d2c.24xlarge</strong>: 96 cores, 352 GB (D2C).</p>
         * </li>
         * <li><p><strong>lindorm.d2s.5xlarge</strong>: 20 cores, 88 GB (D2S).</p>
         * </li>
         * <li><p><strong>lindorm.d2s.10xlarge</strong>: 40 cores, 176 GB (D2S).</p>
         * </li>
         * <li><p><strong>lindorm.d1.2xlarge</strong>: 8 cores, 32 GB (D1NE).</p>
         * </li>
         * <li><p><strong>lindorm.d1.4xlarge</strong>: 16 cores, 64 GB (D1NE).</p>
         * </li>
         * <li><p><strong>lindorm.d1.6xlarge</strong>: 24 cores, 96 GB (D1NE).</p>
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
         * <p>The name of the node group. <strong>This parameter is required.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>group_name_01</p>
         */
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
         * <p>The engine type. Valid values:</p>
         * <ul>
         * <li><p><strong>TABLE</strong>: LindormTable.</p>
         * </li>
         * <li><p><strong>TSDB</strong>: LindormTSDB.</p>
         * </li>
         * <li><p><strong>LSEARCH</strong>: search engine.</p>
         * </li>
         * <li><p><strong>LTS</strong>: LTS engine.</p>
         * </li>
         * <li><p><strong>LVECTOR</strong>: vector engine.</p>
         * </li>
         * <li><p><strong>LCOLUMN</strong>: column store engine.</p>
         * </li>
         * <li><p><strong>LAI</strong>: AI engine.</p>
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
         * <p>The list of engine nodes.</p>
         */
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
