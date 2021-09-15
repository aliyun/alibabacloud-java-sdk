// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDBInstancesResponseBody extends TeaModel {
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Items")
    public DescribeDBInstancesResponseBodyItems items;

    public static DescribeDBInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstancesResponseBody self = new DescribeDBInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstancesResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public DescribeDBInstancesResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeDBInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBInstancesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDBInstancesResponseBody setItems(DescribeDBInstancesResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeDBInstancesResponseBodyItems getItems() {
        return this.items;
    }

    public static class DescribeDBInstancesResponseBodyItemsDBInstanceTagsTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeDBInstancesResponseBodyItemsDBInstanceTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancesResponseBodyItemsDBInstanceTagsTag self = new DescribeDBInstancesResponseBodyItemsDBInstanceTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstancesResponseBodyItemsDBInstanceTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstanceTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDBInstancesResponseBodyItemsDBInstanceTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeDBInstancesResponseBodyItemsDBInstanceTagsTag> tag;

        public static DescribeDBInstancesResponseBodyItemsDBInstanceTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancesResponseBodyItemsDBInstanceTags self = new DescribeDBInstancesResponseBodyItemsDBInstanceTags();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstancesResponseBodyItemsDBInstanceTags setTag(java.util.List<DescribeDBInstancesResponseBodyItemsDBInstanceTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeDBInstancesResponseBodyItemsDBInstanceTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeDBInstancesResponseBodyItemsDBInstance extends TeaModel {
        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("DBInstanceNetType")
        public String DBInstanceNetType;

        @NameInMap("InstanceDeployType")
        public String instanceDeployType;

        @NameInMap("StorageType")
        public String storageType;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("PayType")
        public String payType;

        @NameInMap("Tags")
        public DescribeDBInstancesResponseBodyItemsDBInstanceTags tags;

        @NameInMap("LockReason")
        public String lockReason;

        @NameInMap("DBInstanceStatus")
        public String DBInstanceStatus;

        @NameInMap("ConnectionMode")
        public String connectionMode;

        @NameInMap("LockMode")
        public String lockMode;

        @NameInMap("EngineVersion")
        public String engineVersion;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("InstanceNetworkType")
        public String instanceNetworkType;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        @NameInMap("Engine")
        public String engine;

        @NameInMap("DBInstanceDescription")
        public String DBInstanceDescription;

        @NameInMap("SegNodeNum")
        public String segNodeNum;

        @NameInMap("StorageSize")
        public String storageSize;

        @NameInMap("MasterNodeNum")
        public Integer masterNodeNum;

        public static DescribeDBInstancesResponseBodyItemsDBInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancesResponseBodyItemsDBInstance self = new DescribeDBInstancesResponseBodyItemsDBInstance();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setDBInstanceNetType(String DBInstanceNetType) {
            this.DBInstanceNetType = DBInstanceNetType;
            return this;
        }
        public String getDBInstanceNetType() {
            return this.DBInstanceNetType;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setInstanceDeployType(String instanceDeployType) {
            this.instanceDeployType = instanceDeployType;
            return this;
        }
        public String getInstanceDeployType() {
            return this.instanceDeployType;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setTags(DescribeDBInstancesResponseBodyItemsDBInstanceTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeDBInstancesResponseBodyItemsDBInstanceTags getTags() {
            return this.tags;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setLockReason(String lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public String getLockReason() {
            return this.lockReason;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setDBInstanceStatus(String DBInstanceStatus) {
            this.DBInstanceStatus = DBInstanceStatus;
            return this;
        }
        public String getDBInstanceStatus() {
            return this.DBInstanceStatus;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setConnectionMode(String connectionMode) {
            this.connectionMode = connectionMode;
            return this;
        }
        public String getConnectionMode() {
            return this.connectionMode;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setLockMode(String lockMode) {
            this.lockMode = lockMode;
            return this;
        }
        public String getLockMode() {
            return this.lockMode;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setInstanceNetworkType(String instanceNetworkType) {
            this.instanceNetworkType = instanceNetworkType;
            return this;
        }
        public String getInstanceNetworkType() {
            return this.instanceNetworkType;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setDBInstanceDescription(String DBInstanceDescription) {
            this.DBInstanceDescription = DBInstanceDescription;
            return this;
        }
        public String getDBInstanceDescription() {
            return this.DBInstanceDescription;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setSegNodeNum(String segNodeNum) {
            this.segNodeNum = segNodeNum;
            return this;
        }
        public String getSegNodeNum() {
            return this.segNodeNum;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setStorageSize(String storageSize) {
            this.storageSize = storageSize;
            return this;
        }
        public String getStorageSize() {
            return this.storageSize;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setMasterNodeNum(Integer masterNodeNum) {
            this.masterNodeNum = masterNodeNum;
            return this;
        }
        public Integer getMasterNodeNum() {
            return this.masterNodeNum;
        }

    }

    public static class DescribeDBInstancesResponseBodyItems extends TeaModel {
        @NameInMap("DBInstance")
        public java.util.List<DescribeDBInstancesResponseBodyItemsDBInstance> DBInstance;

        public static DescribeDBInstancesResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancesResponseBodyItems self = new DescribeDBInstancesResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstancesResponseBodyItems setDBInstance(java.util.List<DescribeDBInstancesResponseBodyItemsDBInstance> DBInstance) {
            this.DBInstance = DBInstance;
            return this;
        }
        public java.util.List<DescribeDBInstancesResponseBodyItemsDBInstance> getDBInstance() {
            return this.DBInstance;
        }

    }

}
