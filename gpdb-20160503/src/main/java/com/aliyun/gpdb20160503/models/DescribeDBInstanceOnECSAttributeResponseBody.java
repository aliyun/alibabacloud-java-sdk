// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceOnECSAttributeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Items")
    public DescribeDBInstanceOnECSAttributeResponseBodyItems items;

    public static DescribeDBInstanceOnECSAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceOnECSAttributeResponseBody self = new DescribeDBInstanceOnECSAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceOnECSAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBInstanceOnECSAttributeResponseBody setItems(DescribeDBInstanceOnECSAttributeResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeDBInstanceOnECSAttributeResponseBodyItems getItems() {
        return this.items;
    }

    public static class DescribeDBInstanceOnECSAttributeResponseBodyItemsDBInstanceAttributeTagsTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeDBInstanceOnECSAttributeResponseBodyItemsDBInstanceAttributeTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceOnECSAttributeResponseBodyItemsDBInstanceAttributeTagsTag self = new DescribeDBInstanceOnECSAttributeResponseBodyItemsDBInstanceAttributeTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceOnECSAttributeResponseBodyItemsDBInstanceAttributeTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDBInstanceOnECSAttributeResponseBodyItemsDBInstanceAttributeTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDBInstanceOnECSAttributeResponseBodyItemsDBInstanceAttributeTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeDBInstanceOnECSAttributeResponseBodyItemsDBInstanceAttributeTagsTag> tag;

        public static DescribeDBInstanceOnECSAttributeResponseBodyItemsDBInstanceAttributeTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceOnECSAttributeResponseBodyItemsDBInstanceAttributeTags self = new DescribeDBInstanceOnECSAttributeResponseBodyItemsDBInstanceAttributeTags();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceOnECSAttributeResponseBodyItemsDBInstanceAttributeTags setTag(java.util.List<DescribeDBInstanceOnECSAttributeResponseBodyItemsDBInstanceAttributeTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeDBInstanceOnECSAttributeResponseBodyItemsDBInstanceAttributeTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeDBInstanceOnECSAttributeResponseBodyItemsDBInstanceAttribute extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("EncryptionType")
        public String encryptionType;

        @NameInMap("InstanceDeployType")
        public String instanceDeployType;

        @NameInMap("PayType")
        public String payType;

        @NameInMap("Tags")
        public DescribeDBInstanceOnECSAttributeResponseBodyItemsDBInstanceAttributeTags tags;

        @NameInMap("StorageType")
        public String storageType;

        @NameInMap("ConnectionMode")
        public String connectionMode;

        @NameInMap("Port")
        public String port;

        @NameInMap("LockMode")
        public String lockMode;

        @NameInMap("EngineVersion")
        public String engineVersion;

        @NameInMap("MemorySize")
        public Integer memorySize;

        @NameInMap("SegNodeNum")
        public Integer segNodeNum;

        @NameInMap("ConnectionString")
        public String connectionString;

        @NameInMap("InstanceNetworkType")
        public String instanceNetworkType;

        @NameInMap("EncryptionKey")
        public String encryptionKey;

        @NameInMap("DBInstanceDescription")
        public String DBInstanceDescription;

        @NameInMap("CpuCores")
        public Integer cpuCores;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("DBInstanceStatus")
        public String DBInstanceStatus;

        @NameInMap("StorageSize")
        public Integer storageSize;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        @NameInMap("Engine")
        public String engine;

        @NameInMap("DBInstanceClass")
        public String DBInstanceClass;

        @NameInMap("SupportRestore")
        public Boolean supportRestore;

        @NameInMap("MinorVersion")
        public String minorVersion;

        @NameInMap("MasterNodeNum")
        public Integer masterNodeNum;

        public static DescribeDBInstanceOnECSAttributeResponseBodyItemsDBInstanceAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceOnECSAttributeResponseBodyItemsDBInstanceAttribute self = new DescribeDBInstanceOnECSAttributeResponseBodyItemsDBInstanceAttribute();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceOnECSAttributeResponseBodyItemsDBInstanceAttribute setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeDBInstanceOnECSAttributeResponseBodyItemsDBInstanceAttribute setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeDBInstanceOnECSAttributeResponseBodyItemsDBInstanceAttribute setEncryptionType(String encryptionType) {
            this.encryptionType = encryptionType;
            return this;
        }
        public String getEncryptionType() {
            return this.encryptionType;
        }

        public DescribeDBInstanceOnECSAttributeResponseBodyItemsDBInstanceAttribute setInstanceDeployType(String instanceDeployType) {
            this.instanceDeployType = instanceDeployType;
            return this;
        }
        public String getInstanceDeployType() {
            return this.instanceDeployType;
        }

        public DescribeDBInstanceOnECSAttributeResponseBodyItemsDBInstanceAttribute setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeDBInstanceOnECSAttributeResponseBodyItemsDBInstanceAttribute setTags(DescribeDBInstanceOnECSAttributeResponseBodyItemsDBInstanceAttributeTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeDBInstanceOnECSAttributeResponseBodyItemsDBInstanceAttributeTags getTags() {
            return this.tags;
        }

        public DescribeDBInstanceOnECSAttributeResponseBodyItemsDBInstanceAttribute setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

        public DescribeDBInstanceOnECSAttributeResponseBodyItemsDBInstanceAttribute setConnectionMode(String connectionMode) {
            this.connectionMode = connectionMode;
            return this;
        }
        public String getConnectionMode() {
            return this.connectionMode;
        }

        public DescribeDBInstanceOnECSAttributeResponseBodyItemsDBInstanceAttribute setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeDBInstanceOnECSAttributeResponseBodyItemsDBInstanceAttribute setLockMode(String lockMode) {
            this.lockMode = lockMode;
            return this;
        }
        public String getLockMode() {
            return this.lockMode;
        }

        public DescribeDBInstanceOnECSAttributeResponseBodyItemsDBInstanceAttribute setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public DescribeDBInstanceOnECSAttributeResponseBodyItemsDBInstanceAttribute setMemorySize(Integer memorySize) {
            this.memorySize = memorySize;
            return this;
        }
        public Integer getMemorySize() {
            return this.memorySize;
        }

        public DescribeDBInstanceOnECSAttributeResponseBodyItemsDBInstanceAttribute setSegNodeNum(Integer segNodeNum) {
            this.segNodeNum = segNodeNum;
            return this;
        }
        public Integer getSegNodeNum() {
            return this.segNodeNum;
        }

        public DescribeDBInstanceOnECSAttributeResponseBodyItemsDBInstanceAttribute setConnectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public String getConnectionString() {
            return this.connectionString;
        }

        public DescribeDBInstanceOnECSAttributeResponseBodyItemsDBInstanceAttribute setInstanceNetworkType(String instanceNetworkType) {
            this.instanceNetworkType = instanceNetworkType;
            return this;
        }
        public String getInstanceNetworkType() {
            return this.instanceNetworkType;
        }

        public DescribeDBInstanceOnECSAttributeResponseBodyItemsDBInstanceAttribute setEncryptionKey(String encryptionKey) {
            this.encryptionKey = encryptionKey;
            return this;
        }
        public String getEncryptionKey() {
            return this.encryptionKey;
        }

        public DescribeDBInstanceOnECSAttributeResponseBodyItemsDBInstanceAttribute setDBInstanceDescription(String DBInstanceDescription) {
            this.DBInstanceDescription = DBInstanceDescription;
            return this;
        }
        public String getDBInstanceDescription() {
            return this.DBInstanceDescription;
        }

        public DescribeDBInstanceOnECSAttributeResponseBodyItemsDBInstanceAttribute setCpuCores(Integer cpuCores) {
            this.cpuCores = cpuCores;
            return this;
        }
        public Integer getCpuCores() {
            return this.cpuCores;
        }

        public DescribeDBInstanceOnECSAttributeResponseBodyItemsDBInstanceAttribute setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeDBInstanceOnECSAttributeResponseBodyItemsDBInstanceAttribute setDBInstanceStatus(String DBInstanceStatus) {
            this.DBInstanceStatus = DBInstanceStatus;
            return this;
        }
        public String getDBInstanceStatus() {
            return this.DBInstanceStatus;
        }

        public DescribeDBInstanceOnECSAttributeResponseBodyItemsDBInstanceAttribute setStorageSize(Integer storageSize) {
            this.storageSize = storageSize;
            return this;
        }
        public Integer getStorageSize() {
            return this.storageSize;
        }

        public DescribeDBInstanceOnECSAttributeResponseBodyItemsDBInstanceAttribute setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDBInstanceOnECSAttributeResponseBodyItemsDBInstanceAttribute setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeDBInstanceOnECSAttributeResponseBodyItemsDBInstanceAttribute setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeDBInstanceOnECSAttributeResponseBodyItemsDBInstanceAttribute setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribeDBInstanceOnECSAttributeResponseBodyItemsDBInstanceAttribute setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeDBInstanceOnECSAttributeResponseBodyItemsDBInstanceAttribute setDBInstanceClass(String DBInstanceClass) {
            this.DBInstanceClass = DBInstanceClass;
            return this;
        }
        public String getDBInstanceClass() {
            return this.DBInstanceClass;
        }

        public DescribeDBInstanceOnECSAttributeResponseBodyItemsDBInstanceAttribute setSupportRestore(Boolean supportRestore) {
            this.supportRestore = supportRestore;
            return this;
        }
        public Boolean getSupportRestore() {
            return this.supportRestore;
        }

        public DescribeDBInstanceOnECSAttributeResponseBodyItemsDBInstanceAttribute setMinorVersion(String minorVersion) {
            this.minorVersion = minorVersion;
            return this;
        }
        public String getMinorVersion() {
            return this.minorVersion;
        }

        public DescribeDBInstanceOnECSAttributeResponseBodyItemsDBInstanceAttribute setMasterNodeNum(Integer masterNodeNum) {
            this.masterNodeNum = masterNodeNum;
            return this;
        }
        public Integer getMasterNodeNum() {
            return this.masterNodeNum;
        }

    }

    public static class DescribeDBInstanceOnECSAttributeResponseBodyItems extends TeaModel {
        @NameInMap("DBInstanceAttribute")
        public java.util.List<DescribeDBInstanceOnECSAttributeResponseBodyItemsDBInstanceAttribute> DBInstanceAttribute;

        public static DescribeDBInstanceOnECSAttributeResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceOnECSAttributeResponseBodyItems self = new DescribeDBInstanceOnECSAttributeResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceOnECSAttributeResponseBodyItems setDBInstanceAttribute(java.util.List<DescribeDBInstanceOnECSAttributeResponseBodyItemsDBInstanceAttribute> DBInstanceAttribute) {
            this.DBInstanceAttribute = DBInstanceAttribute;
            return this;
        }
        public java.util.List<DescribeDBInstanceOnECSAttributeResponseBodyItemsDBInstanceAttribute> getDBInstanceAttribute() {
            return this.DBInstanceAttribute;
        }

    }

}
