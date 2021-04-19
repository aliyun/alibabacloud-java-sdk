// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeDBClustersResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("DBClusters")
    public DescribeDBClustersResponseBodyDBClusters DBClusters;

    public static DescribeDBClustersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClustersResponseBody self = new DescribeDBClustersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBClustersResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeDBClustersResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDBClustersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBClustersResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDBClustersResponseBody setDBClusters(DescribeDBClustersResponseBodyDBClusters DBClusters) {
        this.DBClusters = DBClusters;
        return this;
    }
    public DescribeDBClustersResponseBodyDBClusters getDBClusters() {
        return this.DBClusters;
    }

    public static class DescribeDBClustersResponseBodyDBClustersDBClusterTagsTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeDBClustersResponseBodyDBClustersDBClusterTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClustersResponseBodyDBClustersDBClusterTagsTag self = new DescribeDBClustersResponseBodyDBClustersDBClusterTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeDBClustersResponseBodyDBClustersDBClusterTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDBClustersResponseBodyDBClustersDBClusterTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDBClustersResponseBodyDBClustersDBClusterTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeDBClustersResponseBodyDBClustersDBClusterTagsTag> tag;

        public static DescribeDBClustersResponseBodyDBClustersDBClusterTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClustersResponseBodyDBClustersDBClusterTags self = new DescribeDBClustersResponseBodyDBClustersDBClusterTags();
            return TeaModel.build(map, self);
        }

        public DescribeDBClustersResponseBodyDBClustersDBClusterTags setTag(java.util.List<DescribeDBClustersResponseBodyDBClustersDBClusterTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeDBClustersResponseBodyDBClustersDBClusterTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeDBClustersResponseBodyDBClustersDBClusterScaleOutStatus extends TeaModel {
        @NameInMap("Progress")
        public String progress;

        @NameInMap("Ratio")
        public String ratio;

        public static DescribeDBClustersResponseBodyDBClustersDBClusterScaleOutStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClustersResponseBodyDBClustersDBClusterScaleOutStatus self = new DescribeDBClustersResponseBodyDBClustersDBClusterScaleOutStatus();
            return TeaModel.build(map, self);
        }

        public DescribeDBClustersResponseBodyDBClustersDBClusterScaleOutStatus setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeDBClustersResponseBodyDBClustersDBClusterScaleOutStatus setRatio(String ratio) {
            this.ratio = ratio;
            return this;
        }
        public String getRatio() {
            return this.ratio;
        }

    }

    public static class DescribeDBClustersResponseBodyDBClustersDBCluster extends TeaModel {
        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("DBNodeCount")
        public Long DBNodeCount;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("PayType")
        public String payType;

        @NameInMap("Tags")
        public DescribeDBClustersResponseBodyDBClustersDBClusterTags tags;

        @NameInMap("StorageType")
        public String storageType;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("LockMode")
        public String lockMode;

        @NameInMap("Bid")
        public String bid;

        @NameInMap("IsExpired")
        public String isExpired;

        @NameInMap("VpcCloudInstanceId")
        public String vpcCloudInstanceId;

        @NameInMap("ScaleOutStatus")
        public DescribeDBClustersResponseBodyDBClustersDBClusterScaleOutStatus scaleOutStatus;

        @NameInMap("DBClusterId")
        public String DBClusterId;

        @NameInMap("ConnectionString")
        public String connectionString;

        @NameInMap("CommodityCode")
        public String commodityCode;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("DBNodeStorage")
        public Long DBNodeStorage;

        @NameInMap("DBNodeClass")
        public String DBNodeClass;

        @NameInMap("AliUid")
        public String aliUid;

        @NameInMap("LockReason")
        public String lockReason;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("DBClusterStatus")
        public String DBClusterStatus;

        @NameInMap("DBClusterDescription")
        public String DBClusterDescription;

        @NameInMap("DBClusterNetworkType")
        public String DBClusterNetworkType;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("Category")
        public String category;

        public static DescribeDBClustersResponseBodyDBClustersDBCluster build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClustersResponseBodyDBClustersDBCluster self = new DescribeDBClustersResponseBodyDBClustersDBCluster();
            return TeaModel.build(map, self);
        }

        public DescribeDBClustersResponseBodyDBClustersDBCluster setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeDBClustersResponseBodyDBClustersDBCluster setDBNodeCount(Long DBNodeCount) {
            this.DBNodeCount = DBNodeCount;
            return this;
        }
        public Long getDBNodeCount() {
            return this.DBNodeCount;
        }

        public DescribeDBClustersResponseBodyDBClustersDBCluster setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeDBClustersResponseBodyDBClustersDBCluster setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeDBClustersResponseBodyDBClustersDBCluster setTags(DescribeDBClustersResponseBodyDBClustersDBClusterTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeDBClustersResponseBodyDBClustersDBClusterTags getTags() {
            return this.tags;
        }

        public DescribeDBClustersResponseBodyDBClustersDBCluster setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

        public DescribeDBClustersResponseBodyDBClustersDBCluster setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeDBClustersResponseBodyDBClustersDBCluster setLockMode(String lockMode) {
            this.lockMode = lockMode;
            return this;
        }
        public String getLockMode() {
            return this.lockMode;
        }

        public DescribeDBClustersResponseBodyDBClustersDBCluster setBid(String bid) {
            this.bid = bid;
            return this;
        }
        public String getBid() {
            return this.bid;
        }

        public DescribeDBClustersResponseBodyDBClustersDBCluster setIsExpired(String isExpired) {
            this.isExpired = isExpired;
            return this;
        }
        public String getIsExpired() {
            return this.isExpired;
        }

        public DescribeDBClustersResponseBodyDBClustersDBCluster setVpcCloudInstanceId(String vpcCloudInstanceId) {
            this.vpcCloudInstanceId = vpcCloudInstanceId;
            return this;
        }
        public String getVpcCloudInstanceId() {
            return this.vpcCloudInstanceId;
        }

        public DescribeDBClustersResponseBodyDBClustersDBCluster setScaleOutStatus(DescribeDBClustersResponseBodyDBClustersDBClusterScaleOutStatus scaleOutStatus) {
            this.scaleOutStatus = scaleOutStatus;
            return this;
        }
        public DescribeDBClustersResponseBodyDBClustersDBClusterScaleOutStatus getScaleOutStatus() {
            return this.scaleOutStatus;
        }

        public DescribeDBClustersResponseBodyDBClustersDBCluster setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public DescribeDBClustersResponseBodyDBClustersDBCluster setConnectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public String getConnectionString() {
            return this.connectionString;
        }

        public DescribeDBClustersResponseBodyDBClustersDBCluster setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public DescribeDBClustersResponseBodyDBClustersDBCluster setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeDBClustersResponseBodyDBClustersDBCluster setDBNodeStorage(Long DBNodeStorage) {
            this.DBNodeStorage = DBNodeStorage;
            return this;
        }
        public Long getDBNodeStorage() {
            return this.DBNodeStorage;
        }

        public DescribeDBClustersResponseBodyDBClustersDBCluster setDBNodeClass(String DBNodeClass) {
            this.DBNodeClass = DBNodeClass;
            return this;
        }
        public String getDBNodeClass() {
            return this.DBNodeClass;
        }

        public DescribeDBClustersResponseBodyDBClustersDBCluster setAliUid(String aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public String getAliUid() {
            return this.aliUid;
        }

        public DescribeDBClustersResponseBodyDBClustersDBCluster setLockReason(String lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public String getLockReason() {
            return this.lockReason;
        }

        public DescribeDBClustersResponseBodyDBClustersDBCluster setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDBClustersResponseBodyDBClustersDBCluster setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeDBClustersResponseBodyDBClustersDBCluster setDBClusterStatus(String DBClusterStatus) {
            this.DBClusterStatus = DBClusterStatus;
            return this;
        }
        public String getDBClusterStatus() {
            return this.DBClusterStatus;
        }

        public DescribeDBClustersResponseBodyDBClustersDBCluster setDBClusterDescription(String DBClusterDescription) {
            this.DBClusterDescription = DBClusterDescription;
            return this;
        }
        public String getDBClusterDescription() {
            return this.DBClusterDescription;
        }

        public DescribeDBClustersResponseBodyDBClustersDBCluster setDBClusterNetworkType(String DBClusterNetworkType) {
            this.DBClusterNetworkType = DBClusterNetworkType;
            return this;
        }
        public String getDBClusterNetworkType() {
            return this.DBClusterNetworkType;
        }

        public DescribeDBClustersResponseBodyDBClustersDBCluster setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeDBClustersResponseBodyDBClustersDBCluster setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

    }

    public static class DescribeDBClustersResponseBodyDBClusters extends TeaModel {
        @NameInMap("DBCluster")
        public java.util.List<DescribeDBClustersResponseBodyDBClustersDBCluster> DBCluster;

        public static DescribeDBClustersResponseBodyDBClusters build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClustersResponseBodyDBClusters self = new DescribeDBClustersResponseBodyDBClusters();
            return TeaModel.build(map, self);
        }

        public DescribeDBClustersResponseBodyDBClusters setDBCluster(java.util.List<DescribeDBClustersResponseBodyDBClustersDBCluster> DBCluster) {
            this.DBCluster = DBCluster;
            return this;
        }
        public java.util.List<DescribeDBClustersResponseBodyDBClustersDBCluster> getDBCluster() {
            return this.DBCluster;
        }

    }

}
