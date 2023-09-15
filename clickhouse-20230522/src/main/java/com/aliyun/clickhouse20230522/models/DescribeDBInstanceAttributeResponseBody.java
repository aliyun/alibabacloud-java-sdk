// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceAttributeResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeDBInstanceAttributeResponseBodyData data;

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

    public static class DescribeDBInstanceAttributeResponseBodyDataNodes extends TeaModel {
        @NameInMap("CCU")
        public Integer CCU;

        @NameInMap("CpuCores")
        public Integer cpuCores;

        @NameInMap("Memory")
        public Integer memory;

        @NameInMap("NodeStatus")
        public String nodeStatus;

        @NameInMap("String")
        public String string;

        public static DescribeDBInstanceAttributeResponseBodyDataNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceAttributeResponseBodyDataNodes self = new DescribeDBInstanceAttributeResponseBodyDataNodes();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceAttributeResponseBodyDataNodes setCCU(Integer CCU) {
            this.CCU = CCU;
            return this;
        }
        public Integer getCCU() {
            return this.CCU;
        }

        public DescribeDBInstanceAttributeResponseBodyDataNodes setCpuCores(Integer cpuCores) {
            this.cpuCores = cpuCores;
            return this;
        }
        public Integer getCpuCores() {
            return this.cpuCores;
        }

        public DescribeDBInstanceAttributeResponseBodyDataNodes setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

        public DescribeDBInstanceAttributeResponseBodyDataNodes setNodeStatus(String nodeStatus) {
            this.nodeStatus = nodeStatus;
            return this;
        }
        public String getNodeStatus() {
            return this.nodeStatus;
        }

        public DescribeDBInstanceAttributeResponseBodyDataNodes setString(String string) {
            this.string = string;
            return this;
        }
        public String getString() {
            return this.string;
        }

    }

    public static class DescribeDBInstanceAttributeResponseBodyDataTags extends TeaModel {
        @NameInMap("Key")
        public String key;

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
        @NameInMap("AliUid")
        public Long aliUid;

        @NameInMap("Bid")
        public String bid;

        @NameInMap("ChargeType")
        public String chargeType;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        @NameInMap("DeletionProtection")
        public Boolean deletionProtection;

        @NameInMap("Description")
        public String description;

        @NameInMap("Engine")
        public String engine;

        @NameInMap("EngineMinorVersion")
        public String engineMinorVersion;

        @NameInMap("EngineVersion")
        public String engineVersion;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("LockMode")
        public String lockMode;

        @NameInMap("LockReason")
        public String lockReason;

        @NameInMap("MaintainEndTime")
        public String maintainEndTime;

        @NameInMap("MaintainStartTime")
        public String maintainStartTime;

        @NameInMap("Nodes")
        public java.util.List<DescribeDBInstanceAttributeResponseBodyDataNodes> nodes;

        @NameInMap("ObjectStoreSize")
        public String objectStoreSize;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("ScaleMax")
        public Integer scaleMax;

        @NameInMap("ScaleMin")
        public Integer scaleMin;

        @NameInMap("Status")
        public String status;

        @NameInMap("StorageSize")
        public Integer storageSize;

        @NameInMap("StorageType")
        public String storageType;

        @NameInMap("Tags")
        public java.util.List<DescribeDBInstanceAttributeResponseBodyDataTags> tags;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>VPC ID。</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

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

        public DescribeDBInstanceAttributeResponseBodyData setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
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

        public DescribeDBInstanceAttributeResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
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
