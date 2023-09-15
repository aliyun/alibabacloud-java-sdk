// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class DescribeDBInstancesResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeDBInstancesResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDBInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstancesResponseBody self = new DescribeDBInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstancesResponseBody setData(DescribeDBInstancesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeDBInstancesResponseBodyData getData() {
        return this.data;
    }

    public DescribeDBInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDBInstancesResponseBodyDataDBInstancesTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeDBInstancesResponseBodyDataDBInstancesTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancesResponseBodyDataDBInstancesTags self = new DescribeDBInstancesResponseBodyDataDBInstancesTags();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstancesResponseBodyDataDBInstancesTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDBInstancesResponseBodyDataDBInstancesTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDBInstancesResponseBodyDataDBInstances extends TeaModel {
        @NameInMap("AliUid")
        public String aliUid;

        @NameInMap("Bid")
        public String bid;

        @NameInMap("ChargeType")
        public String chargeType;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        @NameInMap("DeletionProtection")
        public String deletionProtection;

        @NameInMap("Description")
        public String description;

        @NameInMap("Engine")
        public String engine;

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

        @NameInMap("Tags")
        public java.util.List<DescribeDBInstancesResponseBodyDataDBInstancesTags> tags;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>VPC ID。</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeDBInstancesResponseBodyDataDBInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancesResponseBodyDataDBInstances self = new DescribeDBInstancesResponseBodyDataDBInstances();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstancesResponseBodyDataDBInstances setAliUid(String aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public String getAliUid() {
            return this.aliUid;
        }

        public DescribeDBInstancesResponseBodyDataDBInstances setBid(String bid) {
            this.bid = bid;
            return this;
        }
        public String getBid() {
            return this.bid;
        }

        public DescribeDBInstancesResponseBodyDataDBInstances setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public DescribeDBInstancesResponseBodyDataDBInstances setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeDBInstancesResponseBodyDataDBInstances setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribeDBInstancesResponseBodyDataDBInstances setDeletionProtection(String deletionProtection) {
            this.deletionProtection = deletionProtection;
            return this;
        }
        public String getDeletionProtection() {
            return this.deletionProtection;
        }

        public DescribeDBInstancesResponseBodyDataDBInstances setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDBInstancesResponseBodyDataDBInstances setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeDBInstancesResponseBodyDataDBInstances setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public DescribeDBInstancesResponseBodyDataDBInstances setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeDBInstancesResponseBodyDataDBInstances setLockMode(String lockMode) {
            this.lockMode = lockMode;
            return this;
        }
        public String getLockMode() {
            return this.lockMode;
        }

        public DescribeDBInstancesResponseBodyDataDBInstances setLockReason(String lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public String getLockReason() {
            return this.lockReason;
        }

        public DescribeDBInstancesResponseBodyDataDBInstances setMaintainEndTime(String maintainEndTime) {
            this.maintainEndTime = maintainEndTime;
            return this;
        }
        public String getMaintainEndTime() {
            return this.maintainEndTime;
        }

        public DescribeDBInstancesResponseBodyDataDBInstances setMaintainStartTime(String maintainStartTime) {
            this.maintainStartTime = maintainStartTime;
            return this;
        }
        public String getMaintainStartTime() {
            return this.maintainStartTime;
        }

        public DescribeDBInstancesResponseBodyDataDBInstances setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDBInstancesResponseBodyDataDBInstances setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeDBInstancesResponseBodyDataDBInstances setScaleMax(Integer scaleMax) {
            this.scaleMax = scaleMax;
            return this;
        }
        public Integer getScaleMax() {
            return this.scaleMax;
        }

        public DescribeDBInstancesResponseBodyDataDBInstances setScaleMin(Integer scaleMin) {
            this.scaleMin = scaleMin;
            return this;
        }
        public Integer getScaleMin() {
            return this.scaleMin;
        }

        public DescribeDBInstancesResponseBodyDataDBInstances setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDBInstancesResponseBodyDataDBInstances setTags(java.util.List<DescribeDBInstancesResponseBodyDataDBInstancesTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeDBInstancesResponseBodyDataDBInstancesTags> getTags() {
            return this.tags;
        }

        public DescribeDBInstancesResponseBodyDataDBInstances setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeDBInstancesResponseBodyDataDBInstances setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeDBInstancesResponseBodyDataDBInstances setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeDBInstancesResponseBodyData extends TeaModel {
        @NameInMap("DBInstances")
        public java.util.List<DescribeDBInstancesResponseBodyDataDBInstances> DBInstances;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public String totalCount;

        public static DescribeDBInstancesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancesResponseBodyData self = new DescribeDBInstancesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstancesResponseBodyData setDBInstances(java.util.List<DescribeDBInstancesResponseBodyDataDBInstances> DBInstances) {
            this.DBInstances = DBInstances;
            return this;
        }
        public java.util.List<DescribeDBInstancesResponseBodyDataDBInstances> getDBInstances() {
            return this.DBInstances;
        }

        public DescribeDBInstancesResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public DescribeDBInstancesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeDBInstancesResponseBodyData setTotalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public String getTotalCount() {
            return this.totalCount;
        }

    }

}
