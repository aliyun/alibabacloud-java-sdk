// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeDBClusterAttributeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DBCluster")
    @Validation(required = true)
    public DescribeDBClusterAttributeResponseDBCluster DBCluster;

    public static DescribeDBClusterAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterAttributeResponse self = new DescribeDBClusterAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterAttributeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBClusterAttributeResponse setDBCluster(DescribeDBClusterAttributeResponseDBCluster DBCluster) {
        this.DBCluster = DBCluster;
        return this;
    }
    public DescribeDBClusterAttributeResponseDBCluster getDBCluster() {
        return this.DBCluster;
    }

    public static class DescribeDBClusterAttributeResponseDBClusterTagsTag extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        public String key;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static DescribeDBClusterAttributeResponseDBClusterTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterAttributeResponseDBClusterTagsTag self = new DescribeDBClusterAttributeResponseDBClusterTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterAttributeResponseDBClusterTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDBClusterAttributeResponseDBClusterTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDBClusterAttributeResponseDBClusterTags extends TeaModel {
        @NameInMap("Tag")
        @Validation(required = true)
        public java.util.List<DescribeDBClusterAttributeResponseDBClusterTagsTag> tag;

        public static DescribeDBClusterAttributeResponseDBClusterTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterAttributeResponseDBClusterTags self = new DescribeDBClusterAttributeResponseDBClusterTags();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterAttributeResponseDBClusterTags setTag(java.util.List<DescribeDBClusterAttributeResponseDBClusterTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeDBClusterAttributeResponseDBClusterTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeDBClusterAttributeResponseDBClusterScaleOutStatus extends TeaModel {
        @NameInMap("Progress")
        @Validation(required = true)
        public String progress;

        @NameInMap("Ratio")
        @Validation(required = true)
        public String ratio;

        public static DescribeDBClusterAttributeResponseDBClusterScaleOutStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterAttributeResponseDBClusterScaleOutStatus self = new DescribeDBClusterAttributeResponseDBClusterScaleOutStatus();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterAttributeResponseDBClusterScaleOutStatus setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeDBClusterAttributeResponseDBClusterScaleOutStatus setRatio(String ratio) {
            this.ratio = ratio;
            return this;
        }
        public String getRatio() {
            return this.ratio;
        }

    }

    public static class DescribeDBClusterAttributeResponseDBCluster extends TeaModel {
        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("ZoneId")
        @Validation(required = true)
        public String zoneId;

        @NameInMap("DBClusterId")
        @Validation(required = true)
        public String DBClusterId;

        @NameInMap("DBClusterType")
        @Validation(required = true)
        public String DBClusterType;

        @NameInMap("DBClusterDescription")
        @Validation(required = true)
        public String DBClusterDescription;

        @NameInMap("Category")
        @Validation(required = true)
        public String category;

        @NameInMap("LockMode")
        @Validation(required = true)
        public String lockMode;

        @NameInMap("LockReason")
        @Validation(required = true)
        public String lockReason;

        @NameInMap("PayType")
        @Validation(required = true)
        public String payType;

        @NameInMap("DBClusterStatus")
        @Validation(required = true)
        public String DBClusterStatus;

        @NameInMap("DBNodeStorage")
        @Validation(required = true)
        public Long DBNodeStorage;

        @NameInMap("DBNodeClass")
        @Validation(required = true)
        public String DBNodeClass;

        @NameInMap("DBNodeCount")
        @Validation(required = true)
        public Long DBNodeCount;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("Engine")
        @Validation(required = true)
        public String engine;

        @NameInMap("EngineVersion")
        @Validation(required = true)
        public String engineVersion;

        @NameInMap("ExpireTime")
        @Validation(required = true)
        public String expireTime;

        @NameInMap("IsExpired")
        @Validation(required = true)
        public String isExpired;

        @NameInMap("MaintainTime")
        @Validation(required = true)
        public String maintainTime;

        @NameInMap("VpcId")
        @Validation(required = true)
        public String vpcId;

        @NameInMap("VSwitchId")
        @Validation(required = true)
        public String vSwitchId;

        @NameInMap("VpcCloudInstanceId")
        @Validation(required = true)
        public String vpcCloudInstanceId;

        @NameInMap("CommodityCode")
        @Validation(required = true)
        public String commodityCode;

        @NameInMap("DBClusterNetworkType")
        @Validation(required = true)
        public String DBClusterNetworkType;

        @NameInMap("StorageType")
        @Validation(required = true)
        public String storageType;

        @NameInMap("PublicConnectionString")
        @Validation(required = true)
        public String publicConnectionString;

        @NameInMap("PublicPort")
        @Validation(required = true)
        public String publicPort;

        @NameInMap("ConnectionString")
        @Validation(required = true)
        public String connectionString;

        @NameInMap("Port")
        @Validation(required = true)
        public Integer port;

        @NameInMap("AliUid")
        @Validation(required = true)
        public String aliUid;

        @NameInMap("Bid")
        @Validation(required = true)
        public String bid;

        @NameInMap("Tags")
        @Validation(required = true)
        public DescribeDBClusterAttributeResponseDBClusterTags tags;

        @NameInMap("ScaleOutStatus")
        @Validation(required = true)
        public DescribeDBClusterAttributeResponseDBClusterScaleOutStatus scaleOutStatus;

        public static DescribeDBClusterAttributeResponseDBCluster build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterAttributeResponseDBCluster self = new DescribeDBClusterAttributeResponseDBCluster();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterAttributeResponseDBCluster setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDBClusterAttributeResponseDBCluster setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeDBClusterAttributeResponseDBCluster setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public DescribeDBClusterAttributeResponseDBCluster setDBClusterType(String DBClusterType) {
            this.DBClusterType = DBClusterType;
            return this;
        }
        public String getDBClusterType() {
            return this.DBClusterType;
        }

        public DescribeDBClusterAttributeResponseDBCluster setDBClusterDescription(String DBClusterDescription) {
            this.DBClusterDescription = DBClusterDescription;
            return this;
        }
        public String getDBClusterDescription() {
            return this.DBClusterDescription;
        }

        public DescribeDBClusterAttributeResponseDBCluster setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeDBClusterAttributeResponseDBCluster setLockMode(String lockMode) {
            this.lockMode = lockMode;
            return this;
        }
        public String getLockMode() {
            return this.lockMode;
        }

        public DescribeDBClusterAttributeResponseDBCluster setLockReason(String lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public String getLockReason() {
            return this.lockReason;
        }

        public DescribeDBClusterAttributeResponseDBCluster setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeDBClusterAttributeResponseDBCluster setDBClusterStatus(String DBClusterStatus) {
            this.DBClusterStatus = DBClusterStatus;
            return this;
        }
        public String getDBClusterStatus() {
            return this.DBClusterStatus;
        }

        public DescribeDBClusterAttributeResponseDBCluster setDBNodeStorage(Long DBNodeStorage) {
            this.DBNodeStorage = DBNodeStorage;
            return this;
        }
        public Long getDBNodeStorage() {
            return this.DBNodeStorage;
        }

        public DescribeDBClusterAttributeResponseDBCluster setDBNodeClass(String DBNodeClass) {
            this.DBNodeClass = DBNodeClass;
            return this;
        }
        public String getDBNodeClass() {
            return this.DBNodeClass;
        }

        public DescribeDBClusterAttributeResponseDBCluster setDBNodeCount(Long DBNodeCount) {
            this.DBNodeCount = DBNodeCount;
            return this;
        }
        public Long getDBNodeCount() {
            return this.DBNodeCount;
        }

        public DescribeDBClusterAttributeResponseDBCluster setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeDBClusterAttributeResponseDBCluster setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeDBClusterAttributeResponseDBCluster setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public DescribeDBClusterAttributeResponseDBCluster setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeDBClusterAttributeResponseDBCluster setIsExpired(String isExpired) {
            this.isExpired = isExpired;
            return this;
        }
        public String getIsExpired() {
            return this.isExpired;
        }

        public DescribeDBClusterAttributeResponseDBCluster setMaintainTime(String maintainTime) {
            this.maintainTime = maintainTime;
            return this;
        }
        public String getMaintainTime() {
            return this.maintainTime;
        }

        public DescribeDBClusterAttributeResponseDBCluster setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeDBClusterAttributeResponseDBCluster setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeDBClusterAttributeResponseDBCluster setVpcCloudInstanceId(String vpcCloudInstanceId) {
            this.vpcCloudInstanceId = vpcCloudInstanceId;
            return this;
        }
        public String getVpcCloudInstanceId() {
            return this.vpcCloudInstanceId;
        }

        public DescribeDBClusterAttributeResponseDBCluster setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public DescribeDBClusterAttributeResponseDBCluster setDBClusterNetworkType(String DBClusterNetworkType) {
            this.DBClusterNetworkType = DBClusterNetworkType;
            return this;
        }
        public String getDBClusterNetworkType() {
            return this.DBClusterNetworkType;
        }

        public DescribeDBClusterAttributeResponseDBCluster setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

        public DescribeDBClusterAttributeResponseDBCluster setPublicConnectionString(String publicConnectionString) {
            this.publicConnectionString = publicConnectionString;
            return this;
        }
        public String getPublicConnectionString() {
            return this.publicConnectionString;
        }

        public DescribeDBClusterAttributeResponseDBCluster setPublicPort(String publicPort) {
            this.publicPort = publicPort;
            return this;
        }
        public String getPublicPort() {
            return this.publicPort;
        }

        public DescribeDBClusterAttributeResponseDBCluster setConnectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public String getConnectionString() {
            return this.connectionString;
        }

        public DescribeDBClusterAttributeResponseDBCluster setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeDBClusterAttributeResponseDBCluster setAliUid(String aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public String getAliUid() {
            return this.aliUid;
        }

        public DescribeDBClusterAttributeResponseDBCluster setBid(String bid) {
            this.bid = bid;
            return this;
        }
        public String getBid() {
            return this.bid;
        }

        public DescribeDBClusterAttributeResponseDBCluster setTags(DescribeDBClusterAttributeResponseDBClusterTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeDBClusterAttributeResponseDBClusterTags getTags() {
            return this.tags;
        }

        public DescribeDBClusterAttributeResponseDBCluster setScaleOutStatus(DescribeDBClusterAttributeResponseDBClusterScaleOutStatus scaleOutStatus) {
            this.scaleOutStatus = scaleOutStatus;
            return this;
        }
        public DescribeDBClusterAttributeResponseDBClusterScaleOutStatus getScaleOutStatus() {
            return this.scaleOutStatus;
        }

    }

}
