// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gdb20190903.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceAttributeResponseBody extends TeaModel {
    @NameInMap("Items")
    public DescribeDBInstanceAttributeResponseBodyItems items;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDBInstanceAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceAttributeResponseBody self = new DescribeDBInstanceAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceAttributeResponseBody setItems(DescribeDBInstanceAttributeResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeDBInstanceAttributeResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeDBInstanceAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDBInstanceAttributeResponseBodyItemsDBInstanceReadOnlyDBInstanceIdsReadOnlyDBInstanceId extends TeaModel {
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        public static DescribeDBInstanceAttributeResponseBodyItemsDBInstanceReadOnlyDBInstanceIdsReadOnlyDBInstanceId build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceAttributeResponseBodyItemsDBInstanceReadOnlyDBInstanceIdsReadOnlyDBInstanceId self = new DescribeDBInstanceAttributeResponseBodyItemsDBInstanceReadOnlyDBInstanceIdsReadOnlyDBInstanceId();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceReadOnlyDBInstanceIdsReadOnlyDBInstanceId setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

    }

    public static class DescribeDBInstanceAttributeResponseBodyItemsDBInstanceReadOnlyDBInstanceIds extends TeaModel {
        @NameInMap("ReadOnlyDBInstanceId")
        public java.util.List<DescribeDBInstanceAttributeResponseBodyItemsDBInstanceReadOnlyDBInstanceIdsReadOnlyDBInstanceId> readOnlyDBInstanceId;

        public static DescribeDBInstanceAttributeResponseBodyItemsDBInstanceReadOnlyDBInstanceIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceAttributeResponseBodyItemsDBInstanceReadOnlyDBInstanceIds self = new DescribeDBInstanceAttributeResponseBodyItemsDBInstanceReadOnlyDBInstanceIds();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceReadOnlyDBInstanceIds setReadOnlyDBInstanceId(java.util.List<DescribeDBInstanceAttributeResponseBodyItemsDBInstanceReadOnlyDBInstanceIdsReadOnlyDBInstanceId> readOnlyDBInstanceId) {
            this.readOnlyDBInstanceId = readOnlyDBInstanceId;
            return this;
        }
        public java.util.List<DescribeDBInstanceAttributeResponseBodyItemsDBInstanceReadOnlyDBInstanceIdsReadOnlyDBInstanceId> getReadOnlyDBInstanceId() {
            return this.readOnlyDBInstanceId;
        }

    }

    public static class DescribeDBInstanceAttributeResponseBodyItemsDBInstanceTagsTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeDBInstanceAttributeResponseBodyItemsDBInstanceTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceAttributeResponseBodyItemsDBInstanceTagsTag self = new DescribeDBInstanceAttributeResponseBodyItemsDBInstanceTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDBInstanceAttributeResponseBodyItemsDBInstanceTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeDBInstanceAttributeResponseBodyItemsDBInstanceTagsTag> tag;

        public static DescribeDBInstanceAttributeResponseBodyItemsDBInstanceTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceAttributeResponseBodyItemsDBInstanceTags self = new DescribeDBInstanceAttributeResponseBodyItemsDBInstanceTags();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceTags setTag(java.util.List<DescribeDBInstanceAttributeResponseBodyItemsDBInstanceTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeDBInstanceAttributeResponseBodyItemsDBInstanceTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeDBInstanceAttributeResponseBodyItemsDBInstance extends TeaModel {
        @NameInMap("Category")
        public String category;

        @NameInMap("ConnectionString")
        public String connectionString;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("CurrentMinorVersion")
        public String currentMinorVersion;

        @NameInMap("DBInstanceCPU")
        public String DBInstanceCPU;

        @NameInMap("DBInstanceDescription")
        public String DBInstanceDescription;

        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        @NameInMap("DBInstanceMemory")
        public Long DBInstanceMemory;

        @NameInMap("DBInstanceNetworkType")
        public String DBInstanceNetworkType;

        @NameInMap("DBInstanceStatus")
        public String DBInstanceStatus;

        @NameInMap("DBInstanceStorageType")
        public String DBInstanceStorageType;

        @NameInMap("DBInstanceType")
        public String DBInstanceType;

        @NameInMap("DBNodeClass")
        public String DBNodeClass;

        @NameInMap("DBNodeCount")
        public Long DBNodeCount;

        @NameInMap("DBNodeStorage")
        public Long DBNodeStorage;

        @NameInMap("DBVersion")
        public String DBVersion;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("Expired")
        public String expired;

        @NameInMap("LatestMinorVersion")
        public String latestMinorVersion;

        @NameInMap("LockMode")
        public String lockMode;

        @NameInMap("LockReason")
        public String lockReason;

        @NameInMap("MaintainTime")
        public String maintainTime;

        @NameInMap("MasterInstanceId")
        public String masterInstanceId;

        @NameInMap("PayType")
        public String payType;

        @NameInMap("Port")
        public String port;

        @NameInMap("PublicConnectionString")
        public String publicConnectionString;

        @NameInMap("PublicPort")
        public Integer publicPort;

        @NameInMap("ReadOnlyDBInstanceIds")
        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceReadOnlyDBInstanceIds readOnlyDBInstanceIds;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("Tags")
        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceTags tags;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeDBInstanceAttributeResponseBodyItemsDBInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceAttributeResponseBodyItemsDBInstance self = new DescribeDBInstanceAttributeResponseBodyItemsDBInstance();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstance setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstance setConnectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public String getConnectionString() {
            return this.connectionString;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstance setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstance setCurrentMinorVersion(String currentMinorVersion) {
            this.currentMinorVersion = currentMinorVersion;
            return this;
        }
        public String getCurrentMinorVersion() {
            return this.currentMinorVersion;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstance setDBInstanceCPU(String DBInstanceCPU) {
            this.DBInstanceCPU = DBInstanceCPU;
            return this;
        }
        public String getDBInstanceCPU() {
            return this.DBInstanceCPU;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstance setDBInstanceDescription(String DBInstanceDescription) {
            this.DBInstanceDescription = DBInstanceDescription;
            return this;
        }
        public String getDBInstanceDescription() {
            return this.DBInstanceDescription;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstance setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstance setDBInstanceMemory(Long DBInstanceMemory) {
            this.DBInstanceMemory = DBInstanceMemory;
            return this;
        }
        public Long getDBInstanceMemory() {
            return this.DBInstanceMemory;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstance setDBInstanceNetworkType(String DBInstanceNetworkType) {
            this.DBInstanceNetworkType = DBInstanceNetworkType;
            return this;
        }
        public String getDBInstanceNetworkType() {
            return this.DBInstanceNetworkType;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstance setDBInstanceStatus(String DBInstanceStatus) {
            this.DBInstanceStatus = DBInstanceStatus;
            return this;
        }
        public String getDBInstanceStatus() {
            return this.DBInstanceStatus;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstance setDBInstanceStorageType(String DBInstanceStorageType) {
            this.DBInstanceStorageType = DBInstanceStorageType;
            return this;
        }
        public String getDBInstanceStorageType() {
            return this.DBInstanceStorageType;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstance setDBInstanceType(String DBInstanceType) {
            this.DBInstanceType = DBInstanceType;
            return this;
        }
        public String getDBInstanceType() {
            return this.DBInstanceType;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstance setDBNodeClass(String DBNodeClass) {
            this.DBNodeClass = DBNodeClass;
            return this;
        }
        public String getDBNodeClass() {
            return this.DBNodeClass;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstance setDBNodeCount(Long DBNodeCount) {
            this.DBNodeCount = DBNodeCount;
            return this;
        }
        public Long getDBNodeCount() {
            return this.DBNodeCount;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstance setDBNodeStorage(Long DBNodeStorage) {
            this.DBNodeStorage = DBNodeStorage;
            return this;
        }
        public Long getDBNodeStorage() {
            return this.DBNodeStorage;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstance setDBVersion(String DBVersion) {
            this.DBVersion = DBVersion;
            return this;
        }
        public String getDBVersion() {
            return this.DBVersion;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstance setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstance setExpired(String expired) {
            this.expired = expired;
            return this;
        }
        public String getExpired() {
            return this.expired;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstance setLatestMinorVersion(String latestMinorVersion) {
            this.latestMinorVersion = latestMinorVersion;
            return this;
        }
        public String getLatestMinorVersion() {
            return this.latestMinorVersion;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstance setLockMode(String lockMode) {
            this.lockMode = lockMode;
            return this;
        }
        public String getLockMode() {
            return this.lockMode;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstance setLockReason(String lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public String getLockReason() {
            return this.lockReason;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstance setMaintainTime(String maintainTime) {
            this.maintainTime = maintainTime;
            return this;
        }
        public String getMaintainTime() {
            return this.maintainTime;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstance setMasterInstanceId(String masterInstanceId) {
            this.masterInstanceId = masterInstanceId;
            return this;
        }
        public String getMasterInstanceId() {
            return this.masterInstanceId;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstance setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstance setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstance setPublicConnectionString(String publicConnectionString) {
            this.publicConnectionString = publicConnectionString;
            return this;
        }
        public String getPublicConnectionString() {
            return this.publicConnectionString;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstance setPublicPort(Integer publicPort) {
            this.publicPort = publicPort;
            return this;
        }
        public Integer getPublicPort() {
            return this.publicPort;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstance setReadOnlyDBInstanceIds(DescribeDBInstanceAttributeResponseBodyItemsDBInstanceReadOnlyDBInstanceIds readOnlyDBInstanceIds) {
            this.readOnlyDBInstanceIds = readOnlyDBInstanceIds;
            return this;
        }
        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceReadOnlyDBInstanceIds getReadOnlyDBInstanceIds() {
            return this.readOnlyDBInstanceIds;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstance setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstance setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstance setTags(DescribeDBInstanceAttributeResponseBodyItemsDBInstanceTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceTags getTags() {
            return this.tags;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstance setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstance setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstance setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeDBInstanceAttributeResponseBodyItems extends TeaModel {
        @NameInMap("DBInstance")
        public java.util.List<DescribeDBInstanceAttributeResponseBodyItemsDBInstance> DBInstance;

        public static DescribeDBInstanceAttributeResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceAttributeResponseBodyItems self = new DescribeDBInstanceAttributeResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceAttributeResponseBodyItems setDBInstance(java.util.List<DescribeDBInstanceAttributeResponseBodyItemsDBInstance> DBInstance) {
            this.DBInstance = DBInstance;
            return this;
        }
        public java.util.List<DescribeDBInstanceAttributeResponseBodyItemsDBInstance> getDBInstance() {
            return this.DBInstance;
        }

    }

}
