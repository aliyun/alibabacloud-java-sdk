// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class DescribeClusterListResponseBody extends TeaModel {
    @NameInMap("ClusterList")
    public DescribeClusterListResponseBodyClusterList clusterList;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static DescribeClusterListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterListResponseBody self = new DescribeClusterListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClusterListResponseBody setClusterList(DescribeClusterListResponseBodyClusterList clusterList) {
        this.clusterList = clusterList;
        return this;
    }
    public DescribeClusterListResponseBodyClusterList getClusterList() {
        return this.clusterList;
    }

    public DescribeClusterListResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeClusterListResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeClusterListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeClusterListResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeClusterListResponseBodyClusterListClusterTagsTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeClusterListResponseBodyClusterListClusterTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterListResponseBodyClusterListClusterTagsTag self = new DescribeClusterListResponseBodyClusterListClusterTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeClusterListResponseBodyClusterListClusterTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeClusterListResponseBodyClusterListClusterTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeClusterListResponseBodyClusterListClusterTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeClusterListResponseBodyClusterListClusterTagsTag> tag;

        public static DescribeClusterListResponseBodyClusterListClusterTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterListResponseBodyClusterListClusterTags self = new DescribeClusterListResponseBodyClusterListClusterTags();
            return TeaModel.build(map, self);
        }

        public DescribeClusterListResponseBodyClusterListClusterTags setTag(java.util.List<DescribeClusterListResponseBodyClusterListClusterTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeClusterListResponseBodyClusterListClusterTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeClusterListResponseBodyClusterListCluster extends TeaModel {
        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("ClusterName")
        public String clusterName;

        @NameInMap("ClusterType")
        public String clusterType;

        @NameInMap("CoreDiskSize")
        public String coreDiskSize;

        @NameInMap("CoreDiskType")
        public String coreDiskType;

        @NameInMap("CoreInstanceQuantity")
        public Integer coreInstanceQuantity;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DbType")
        public String dbType;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("LockMode")
        public String lockMode;

        @NameInMap("MainVersion")
        public String mainVersion;

        @NameInMap("NetType")
        public String netType;

        @NameInMap("PayType")
        public String payType;

        @NameInMap("Reason")
        public String reason;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Status")
        public String status;

        @NameInMap("Tags")
        public DescribeClusterListResponseBodyClusterListClusterTags tags;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeClusterListResponseBodyClusterListCluster build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterListResponseBodyClusterListCluster self = new DescribeClusterListResponseBodyClusterListCluster();
            return TeaModel.build(map, self);
        }

        public DescribeClusterListResponseBodyClusterListCluster setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribeClusterListResponseBodyClusterListCluster setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public DescribeClusterListResponseBodyClusterListCluster setClusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public String getClusterType() {
            return this.clusterType;
        }

        public DescribeClusterListResponseBodyClusterListCluster setCoreDiskSize(String coreDiskSize) {
            this.coreDiskSize = coreDiskSize;
            return this;
        }
        public String getCoreDiskSize() {
            return this.coreDiskSize;
        }

        public DescribeClusterListResponseBodyClusterListCluster setCoreDiskType(String coreDiskType) {
            this.coreDiskType = coreDiskType;
            return this;
        }
        public String getCoreDiskType() {
            return this.coreDiskType;
        }

        public DescribeClusterListResponseBodyClusterListCluster setCoreInstanceQuantity(Integer coreInstanceQuantity) {
            this.coreInstanceQuantity = coreInstanceQuantity;
            return this;
        }
        public Integer getCoreInstanceQuantity() {
            return this.coreInstanceQuantity;
        }

        public DescribeClusterListResponseBodyClusterListCluster setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeClusterListResponseBodyClusterListCluster setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public DescribeClusterListResponseBodyClusterListCluster setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeClusterListResponseBodyClusterListCluster setLockMode(String lockMode) {
            this.lockMode = lockMode;
            return this;
        }
        public String getLockMode() {
            return this.lockMode;
        }

        public DescribeClusterListResponseBodyClusterListCluster setMainVersion(String mainVersion) {
            this.mainVersion = mainVersion;
            return this;
        }
        public String getMainVersion() {
            return this.mainVersion;
        }

        public DescribeClusterListResponseBodyClusterListCluster setNetType(String netType) {
            this.netType = netType;
            return this;
        }
        public String getNetType() {
            return this.netType;
        }

        public DescribeClusterListResponseBodyClusterListCluster setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeClusterListResponseBodyClusterListCluster setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public DescribeClusterListResponseBodyClusterListCluster setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeClusterListResponseBodyClusterListCluster setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeClusterListResponseBodyClusterListCluster setTags(DescribeClusterListResponseBodyClusterListClusterTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeClusterListResponseBodyClusterListClusterTags getTags() {
            return this.tags;
        }

        public DescribeClusterListResponseBodyClusterListCluster setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public DescribeClusterListResponseBodyClusterListCluster setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeClusterListResponseBodyClusterListCluster setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeClusterListResponseBodyClusterList extends TeaModel {
        @NameInMap("Cluster")
        public java.util.List<DescribeClusterListResponseBodyClusterListCluster> cluster;

        public static DescribeClusterListResponseBodyClusterList build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterListResponseBodyClusterList self = new DescribeClusterListResponseBodyClusterList();
            return TeaModel.build(map, self);
        }

        public DescribeClusterListResponseBodyClusterList setCluster(java.util.List<DescribeClusterListResponseBodyClusterListCluster> cluster) {
            this.cluster = cluster;
            return this;
        }
        public java.util.List<DescribeClusterListResponseBodyClusterListCluster> getCluster() {
            return this.cluster;
        }

    }

}
