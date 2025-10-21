// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceAttributeResponseBody extends TeaModel {
    /**
     * <p>The result returned.</p>
     */
    @NameInMap("Data")
    public DescribeDBInstanceAttributeResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2FED790E-FB61-4721-8C1C-07C627FA5A19</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDBInstanceAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceAttributeResponseBody self = new DescribeDBInstanceAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceAttributeResponseBody setData(DescribeDBInstanceAttributeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeDBInstanceAttributeResponseBodyData getData() {
        return this.data;
    }

    public DescribeDBInstanceAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDBInstanceAttributeResponseBodyDataMultiZones extends TeaModel {
        /**
         * <p>The vSwitch IDs.</p>
         */
        @NameInMap("VSwitchIds")
        public java.util.List<String> vSwitchIds;

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeDBInstanceAttributeResponseBodyDataMultiZones build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceAttributeResponseBodyDataMultiZones self = new DescribeDBInstanceAttributeResponseBodyDataMultiZones();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceAttributeResponseBodyDataMultiZones setVSwitchIds(java.util.List<String> vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        public DescribeDBInstanceAttributeResponseBodyDataMultiZones setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeDBInstanceAttributeResponseBodyDataNodes extends TeaModel {
        /**
         * <p>The node status.</p>
         * 
         * <strong>example:</strong>
         * <p>active</p>
         */
        @NameInMap("NodeStatus")
        public String nodeStatus;

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeDBInstanceAttributeResponseBodyDataNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceAttributeResponseBodyDataNodes self = new DescribeDBInstanceAttributeResponseBodyDataNodes();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceAttributeResponseBodyDataNodes setNodeStatus(String nodeStatus) {
            this.nodeStatus = nodeStatus;
            return this;
        }
        public String getNodeStatus() {
            return this.nodeStatus;
        }

        public DescribeDBInstanceAttributeResponseBodyDataNodes setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeDBInstanceAttributeResponseBodyDataTags extends TeaModel {
        /**
         * <p>The key of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>id</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>ck</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeDBInstanceAttributeResponseBodyDataTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceAttributeResponseBodyDataTags self = new DescribeDBInstanceAttributeResponseBodyDataTags();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceAttributeResponseBodyDataTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDBInstanceAttributeResponseBodyDataTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDBInstanceAttributeResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>140692647406****</p>
         */
        @NameInMap("AliUid")
        public Long aliUid;

        /**
         * <p>The channel ID.</p>
         * 
         * <strong>example:</strong>
         * <p>PD39050615820269****</p>
         */
        @NameInMap("Bid")
        public String bid;

        /**
         * <strong>example:</strong>
         * <p>enterprise</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The billing method. Enterprise Edition clusters use the pay-as-you-go billing method.</p>
         * 
         * <strong>example:</strong>
         * <p>PrePaid</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <strong>example:</strong>
         * <p>activation</p>
         */
        @NameInMap("ClickObserveServiceStatus")
        public String clickObserveServiceStatus;

        /**
         * <p>The time when the cluster was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-09-14T08:14:48Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cc-bp100p4q1g9z3****</p>
         */
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        /**
         * <p>Indicates whether the release protection feature is enabled for the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>0/1</p>
         */
        @NameInMap("DeletionProtection")
        public Boolean deletionProtection;

        /**
         * <p>The deployment mode of the cluster. Valid values: single_az and multi_az.</p>
         * <ul>
         * <li>single_az: indicates that the server nodes are deployed in the primary zone. The ID of the primary zone is specified by the ZoneID parameter.</li>
         * <li>multi_az: indicates that the server nodes are deployed in multiple zones. The information about the zones is specified by the MultiZones parameter.</li>
         * </ul>
         * <p>The keeper nodes are deployed in multiple zones.</p>
         * 
         * <strong>example:</strong>
         * <p>single_az</p>
         */
        @NameInMap("DeploySchema")
        public String deploySchema;

        /**
         * <p>The cluster description.</p>
         * 
         * <strong>example:</strong>
         * <p>Used for test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The disabled database ports. Multiple database ports are separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>9001,8123</p>
         */
        @NameInMap("DisabledPorts")
        public String disabledPorts;

        /**
         * <p>The engine type.</p>
         * 
         * <strong>example:</strong>
         * <p>clickhouse</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <p>The minor engine version of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>23.8.1.41495_6</p>
         */
        @NameInMap("EngineMinorVersion")
        public String engineMinorVersion;

        /**
         * <p>The engine version.</p>
         * 
         * <strong>example:</strong>
         * <p>23.8</p>
         */
        @NameInMap("EngineVersion")
        public String engineVersion;

        /**
         * <p>The time when the cluster expires. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format.</p>
         * <blockquote>
         * <p> Pay-as-you-go clusters never expire. If the cluster is a pay-as-you-go cluster, an empty string is returned for this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2024-04-17T08:14:48Z</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>The latest minor engine version.</p>
         * 
         * <strong>example:</strong>
         * <p>23.8.1.41495_6</p>
         */
        @NameInMap("LatestEngineMinorVersion")
        public String latestEngineMinorVersion;

        /**
         * <p>The lock mode of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("LockMode")
        public String lockMode;

        /**
         * <p>The reason why the cluster was locked.</p>
         * 
         * <strong>example:</strong>
         * <p>nolock</p>
         */
        @NameInMap("LockReason")
        public String lockReason;

        /**
         * <p>The end time of the maintenance window.</p>
         * 
         * <strong>example:</strong>
         * <p>21:00</p>
         */
        @NameInMap("MaintainEndTime")
        public String maintainEndTime;

        /**
         * <p>The start time of the maintenance window.</p>
         * 
         * <strong>example:</strong>
         * <p>12:00</p>
         */
        @NameInMap("MaintainStartTime")
        public String maintainStartTime;

        /**
         * <p>The information about the zones.</p>
         */
        @NameInMap("MultiZones")
        public java.util.List<DescribeDBInstanceAttributeResponseBodyDataMultiZones> multiZones;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("NodeCount")
        public String nodeCount;

        /**
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("NodeScaleMax")
        public String nodeScaleMax;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("NodeScaleMin")
        public String nodeScaleMin;

        /**
         * <p>The nodes.</p>
         */
        @NameInMap("Nodes")
        public java.util.List<DescribeDBInstanceAttributeResponseBodyDataNodes> nodes;

        /**
         * <p>The size of the object storage space.</p>
         * 
         * <strong>example:</strong>
         * <p>13</p>
         */
        @NameInMap("ObjectStoreSize")
        public String objectStoreSize;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmzygvt54****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The maximum capacity for elastic scaling.</p>
         * 
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("ScaleMax")
        public Integer scaleMax;

        /**
         * <p>The minimum capacity for elastic scaling.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("ScaleMin")
        public Integer scaleMin;

        /**
         * <p>The cluster status.</p>
         * 
         * <strong>example:</strong>
         * <p>active</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("StorageQuota")
        public String storageQuota;

        /**
         * <p>The size of the storage space. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("StorageSize")
        public Integer storageSize;

        /**
         * <p>The storage type.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("StorageType")
        public String storageType;

        /**
         * <p>The details of the tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<DescribeDBInstanceAttributeResponseBodyDataTags> tags;

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-uf67ij56zm9x4uc6hmilg</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The virtual private cloud (VPC) ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-wz9duj8xd6r1gzhsg*****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeDBInstanceAttributeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceAttributeResponseBodyData self = new DescribeDBInstanceAttributeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceAttributeResponseBodyData setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public DescribeDBInstanceAttributeResponseBodyData setBid(String bid) {
            this.bid = bid;
            return this;
        }
        public String getBid() {
            return this.bid;
        }

        public DescribeDBInstanceAttributeResponseBodyData setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeDBInstanceAttributeResponseBodyData setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public DescribeDBInstanceAttributeResponseBodyData setClickObserveServiceStatus(String clickObserveServiceStatus) {
            this.clickObserveServiceStatus = clickObserveServiceStatus;
            return this;
        }
        public String getClickObserveServiceStatus() {
            return this.clickObserveServiceStatus;
        }

        public DescribeDBInstanceAttributeResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeDBInstanceAttributeResponseBodyData setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribeDBInstanceAttributeResponseBodyData setDeletionProtection(Boolean deletionProtection) {
            this.deletionProtection = deletionProtection;
            return this;
        }
        public Boolean getDeletionProtection() {
            return this.deletionProtection;
        }

        public DescribeDBInstanceAttributeResponseBodyData setDeploySchema(String deploySchema) {
            this.deploySchema = deploySchema;
            return this;
        }
        public String getDeploySchema() {
            return this.deploySchema;
        }

        public DescribeDBInstanceAttributeResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDBInstanceAttributeResponseBodyData setDisabledPorts(String disabledPorts) {
            this.disabledPorts = disabledPorts;
            return this;
        }
        public String getDisabledPorts() {
            return this.disabledPorts;
        }

        public DescribeDBInstanceAttributeResponseBodyData setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeDBInstanceAttributeResponseBodyData setEngineMinorVersion(String engineMinorVersion) {
            this.engineMinorVersion = engineMinorVersion;
            return this;
        }
        public String getEngineMinorVersion() {
            return this.engineMinorVersion;
        }

        public DescribeDBInstanceAttributeResponseBodyData setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public DescribeDBInstanceAttributeResponseBodyData setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeDBInstanceAttributeResponseBodyData setLatestEngineMinorVersion(String latestEngineMinorVersion) {
            this.latestEngineMinorVersion = latestEngineMinorVersion;
            return this;
        }
        public String getLatestEngineMinorVersion() {
            return this.latestEngineMinorVersion;
        }

        public DescribeDBInstanceAttributeResponseBodyData setLockMode(String lockMode) {
            this.lockMode = lockMode;
            return this;
        }
        public String getLockMode() {
            return this.lockMode;
        }

        public DescribeDBInstanceAttributeResponseBodyData setLockReason(String lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public String getLockReason() {
            return this.lockReason;
        }

        public DescribeDBInstanceAttributeResponseBodyData setMaintainEndTime(String maintainEndTime) {
            this.maintainEndTime = maintainEndTime;
            return this;
        }
        public String getMaintainEndTime() {
            return this.maintainEndTime;
        }

        public DescribeDBInstanceAttributeResponseBodyData setMaintainStartTime(String maintainStartTime) {
            this.maintainStartTime = maintainStartTime;
            return this;
        }
        public String getMaintainStartTime() {
            return this.maintainStartTime;
        }

        public DescribeDBInstanceAttributeResponseBodyData setMultiZones(java.util.List<DescribeDBInstanceAttributeResponseBodyDataMultiZones> multiZones) {
            this.multiZones = multiZones;
            return this;
        }
        public java.util.List<DescribeDBInstanceAttributeResponseBodyDataMultiZones> getMultiZones() {
            return this.multiZones;
        }

        public DescribeDBInstanceAttributeResponseBodyData setNodeCount(String nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }
        public String getNodeCount() {
            return this.nodeCount;
        }

        public DescribeDBInstanceAttributeResponseBodyData setNodeScaleMax(String nodeScaleMax) {
            this.nodeScaleMax = nodeScaleMax;
            return this;
        }
        public String getNodeScaleMax() {
            return this.nodeScaleMax;
        }

        public DescribeDBInstanceAttributeResponseBodyData setNodeScaleMin(String nodeScaleMin) {
            this.nodeScaleMin = nodeScaleMin;
            return this;
        }
        public String getNodeScaleMin() {
            return this.nodeScaleMin;
        }

        public DescribeDBInstanceAttributeResponseBodyData setNodes(java.util.List<DescribeDBInstanceAttributeResponseBodyDataNodes> nodes) {
            this.nodes = nodes;
            return this;
        }
        public java.util.List<DescribeDBInstanceAttributeResponseBodyDataNodes> getNodes() {
            return this.nodes;
        }

        public DescribeDBInstanceAttributeResponseBodyData setObjectStoreSize(String objectStoreSize) {
            this.objectStoreSize = objectStoreSize;
            return this;
        }
        public String getObjectStoreSize() {
            return this.objectStoreSize;
        }

        public DescribeDBInstanceAttributeResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDBInstanceAttributeResponseBodyData setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeDBInstanceAttributeResponseBodyData setScaleMax(Integer scaleMax) {
            this.scaleMax = scaleMax;
            return this;
        }
        public Integer getScaleMax() {
            return this.scaleMax;
        }

        public DescribeDBInstanceAttributeResponseBodyData setScaleMin(Integer scaleMin) {
            this.scaleMin = scaleMin;
            return this;
        }
        public Integer getScaleMin() {
            return this.scaleMin;
        }

        public DescribeDBInstanceAttributeResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDBInstanceAttributeResponseBodyData setStorageQuota(String storageQuota) {
            this.storageQuota = storageQuota;
            return this;
        }
        public String getStorageQuota() {
            return this.storageQuota;
        }

        public DescribeDBInstanceAttributeResponseBodyData setStorageSize(Integer storageSize) {
            this.storageSize = storageSize;
            return this;
        }
        public Integer getStorageSize() {
            return this.storageSize;
        }

        public DescribeDBInstanceAttributeResponseBodyData setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

        public DescribeDBInstanceAttributeResponseBodyData setTags(java.util.List<DescribeDBInstanceAttributeResponseBodyDataTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeDBInstanceAttributeResponseBodyDataTags> getTags() {
            return this.tags;
        }

        public DescribeDBInstanceAttributeResponseBodyData setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeDBInstanceAttributeResponseBodyData setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeDBInstanceAttributeResponseBodyData setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
