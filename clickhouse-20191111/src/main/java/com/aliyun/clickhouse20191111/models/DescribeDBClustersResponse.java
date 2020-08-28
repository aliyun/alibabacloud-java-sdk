// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeDBClustersResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("DBClusters")
    @Validation(required = true)
    public DescribeDBClustersResponseDBClusters DBClusters;

    public static DescribeDBClustersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClustersResponse self = new DescribeDBClustersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBClustersResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBClustersResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDBClustersResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeDBClustersResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDBClustersResponse setDBClusters(DescribeDBClustersResponseDBClusters DBClusters) {
        this.DBClusters = DBClusters;
        return this;
    }
    public DescribeDBClustersResponseDBClusters getDBClusters() {
        return this.DBClusters;
    }

    public static class DescribeDBClustersResponseDBClustersDBClusterTagsTag extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        public String key;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static DescribeDBClustersResponseDBClustersDBClusterTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClustersResponseDBClustersDBClusterTagsTag self = new DescribeDBClustersResponseDBClustersDBClusterTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeDBClustersResponseDBClustersDBClusterTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDBClustersResponseDBClustersDBClusterTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDBClustersResponseDBClustersDBClusterTags extends TeaModel {
        @NameInMap("Tag")
        @Validation(required = true)
        public java.util.List<DescribeDBClustersResponseDBClustersDBClusterTagsTag> tag;

        public static DescribeDBClustersResponseDBClustersDBClusterTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClustersResponseDBClustersDBClusterTags self = new DescribeDBClustersResponseDBClustersDBClusterTags();
            return TeaModel.build(map, self);
        }

        public DescribeDBClustersResponseDBClustersDBClusterTags setTag(java.util.List<DescribeDBClustersResponseDBClustersDBClusterTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeDBClustersResponseDBClustersDBClusterTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeDBClustersResponseDBClustersDBClusterScaleOutStatus extends TeaModel {
        @NameInMap("Progress")
        @Validation(required = true)
        public String progress;

        @NameInMap("Ratio")
        @Validation(required = true)
        public String ratio;

        public static DescribeDBClustersResponseDBClustersDBClusterScaleOutStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClustersResponseDBClustersDBClusterScaleOutStatus self = new DescribeDBClustersResponseDBClustersDBClusterScaleOutStatus();
            return TeaModel.build(map, self);
        }

        public DescribeDBClustersResponseDBClustersDBClusterScaleOutStatus setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeDBClustersResponseDBClustersDBClusterScaleOutStatus setRatio(String ratio) {
            this.ratio = ratio;
            return this;
        }
        public String getRatio() {
            return this.ratio;
        }

    }

    public static class DescribeDBClustersResponseDBClustersDBCluster extends TeaModel {
        @NameInMap("DBClusterId")
        @Validation(required = true)
        public String DBClusterId;

        @NameInMap("Category")
        @Validation(required = true)
        public String category;

        @NameInMap("DBClusterDescription")
        @Validation(required = true)
        public String DBClusterDescription;

        @NameInMap("PayType")
        @Validation(required = true)
        public String payType;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("ZoneId")
        @Validation(required = true)
        public String zoneId;

        @NameInMap("ExpireTime")
        @Validation(required = true)
        public String expireTime;

        @NameInMap("IsExpired")
        @Validation(required = true)
        public String isExpired;

        @NameInMap("DBClusterStatus")
        @Validation(required = true)
        public String DBClusterStatus;

        @NameInMap("LockMode")
        @Validation(required = true)
        public String lockMode;

        @NameInMap("LockReason")
        @Validation(required = true)
        public String lockReason;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("DBNodeStorage")
        @Validation(required = true)
        public Long DBNodeStorage;

        @NameInMap("DBNodeClass")
        @Validation(required = true)
        public String DBNodeClass;

        @NameInMap("DBNodeCount")
        @Validation(required = true)
        public Long DBNodeCount;

        @NameInMap("StorageType")
        @Validation(required = true)
        public String storageType;

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

        @NameInMap("DBClusterNetworkType")
        @Validation(required = true)
        public String DBClusterNetworkType;

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

        @NameInMap("Tags")
        @Validation(required = true)
        public DescribeDBClustersResponseDBClustersDBClusterTags tags;

        @NameInMap("ScaleOutStatus")
        @Validation(required = true)
        public DescribeDBClustersResponseDBClustersDBClusterScaleOutStatus scaleOutStatus;

        public static DescribeDBClustersResponseDBClustersDBCluster build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClustersResponseDBClustersDBCluster self = new DescribeDBClustersResponseDBClustersDBCluster();
            return TeaModel.build(map, self);
        }

        public DescribeDBClustersResponseDBClustersDBCluster setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public DescribeDBClustersResponseDBClustersDBCluster setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeDBClustersResponseDBClustersDBCluster setDBClusterDescription(String DBClusterDescription) {
            this.DBClusterDescription = DBClusterDescription;
            return this;
        }
        public String getDBClusterDescription() {
            return this.DBClusterDescription;
        }

        public DescribeDBClustersResponseDBClustersDBCluster setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeDBClustersResponseDBClustersDBCluster setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDBClustersResponseDBClustersDBCluster setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeDBClustersResponseDBClustersDBCluster setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeDBClustersResponseDBClustersDBCluster setIsExpired(String isExpired) {
            this.isExpired = isExpired;
            return this;
        }
        public String getIsExpired() {
            return this.isExpired;
        }

        public DescribeDBClustersResponseDBClustersDBCluster setDBClusterStatus(String DBClusterStatus) {
            this.DBClusterStatus = DBClusterStatus;
            return this;
        }
        public String getDBClusterStatus() {
            return this.DBClusterStatus;
        }

        public DescribeDBClustersResponseDBClustersDBCluster setLockMode(String lockMode) {
            this.lockMode = lockMode;
            return this;
        }
        public String getLockMode() {
            return this.lockMode;
        }

        public DescribeDBClustersResponseDBClustersDBCluster setLockReason(String lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public String getLockReason() {
            return this.lockReason;
        }

        public DescribeDBClustersResponseDBClustersDBCluster setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeDBClustersResponseDBClustersDBCluster setDBNodeStorage(Long DBNodeStorage) {
            this.DBNodeStorage = DBNodeStorage;
            return this;
        }
        public Long getDBNodeStorage() {
            return this.DBNodeStorage;
        }

        public DescribeDBClustersResponseDBClustersDBCluster setDBNodeClass(String DBNodeClass) {
            this.DBNodeClass = DBNodeClass;
            return this;
        }
        public String getDBNodeClass() {
            return this.DBNodeClass;
        }

        public DescribeDBClustersResponseDBClustersDBCluster setDBNodeCount(Long DBNodeCount) {
            this.DBNodeCount = DBNodeCount;
            return this;
        }
        public Long getDBNodeCount() {
            return this.DBNodeCount;
        }

        public DescribeDBClustersResponseDBClustersDBCluster setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

        public DescribeDBClustersResponseDBClustersDBCluster setConnectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public String getConnectionString() {
            return this.connectionString;
        }

        public DescribeDBClustersResponseDBClustersDBCluster setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeDBClustersResponseDBClustersDBCluster setAliUid(String aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public String getAliUid() {
            return this.aliUid;
        }

        public DescribeDBClustersResponseDBClustersDBCluster setBid(String bid) {
            this.bid = bid;
            return this;
        }
        public String getBid() {
            return this.bid;
        }

        public DescribeDBClustersResponseDBClustersDBCluster setDBClusterNetworkType(String DBClusterNetworkType) {
            this.DBClusterNetworkType = DBClusterNetworkType;
            return this;
        }
        public String getDBClusterNetworkType() {
            return this.DBClusterNetworkType;
        }

        public DescribeDBClustersResponseDBClustersDBCluster setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeDBClustersResponseDBClustersDBCluster setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeDBClustersResponseDBClustersDBCluster setVpcCloudInstanceId(String vpcCloudInstanceId) {
            this.vpcCloudInstanceId = vpcCloudInstanceId;
            return this;
        }
        public String getVpcCloudInstanceId() {
            return this.vpcCloudInstanceId;
        }

        public DescribeDBClustersResponseDBClustersDBCluster setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public DescribeDBClustersResponseDBClustersDBCluster setTags(DescribeDBClustersResponseDBClustersDBClusterTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeDBClustersResponseDBClustersDBClusterTags getTags() {
            return this.tags;
        }

        public DescribeDBClustersResponseDBClustersDBCluster setScaleOutStatus(DescribeDBClustersResponseDBClustersDBClusterScaleOutStatus scaleOutStatus) {
            this.scaleOutStatus = scaleOutStatus;
            return this;
        }
        public DescribeDBClustersResponseDBClustersDBClusterScaleOutStatus getScaleOutStatus() {
            return this.scaleOutStatus;
        }

    }

    public static class DescribeDBClustersResponseDBClusters extends TeaModel {
        @NameInMap("DBCluster")
        @Validation(required = true)
        public java.util.List<DescribeDBClustersResponseDBClustersDBCluster> DBCluster;

        public static DescribeDBClustersResponseDBClusters build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClustersResponseDBClusters self = new DescribeDBClustersResponseDBClusters();
            return TeaModel.build(map, self);
        }

        public DescribeDBClustersResponseDBClusters setDBCluster(java.util.List<DescribeDBClustersResponseDBClustersDBCluster> DBCluster) {
            this.DBCluster = DBCluster;
            return this;
        }
        public java.util.List<DescribeDBClustersResponseDBClustersDBCluster> getDBCluster() {
            return this.DBCluster;
        }

    }

}
