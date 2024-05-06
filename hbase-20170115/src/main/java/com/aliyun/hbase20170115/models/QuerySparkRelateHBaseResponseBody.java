// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class QuerySparkRelateHBaseResponseBody extends TeaModel {
    @NameInMap("ClusterList")
    public QuerySparkRelateHBaseResponseBodyClusterList clusterList;

    @NameInMap("RequestId")
    public String requestId;

    public static QuerySparkRelateHBaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySparkRelateHBaseResponseBody self = new QuerySparkRelateHBaseResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySparkRelateHBaseResponseBody setClusterList(QuerySparkRelateHBaseResponseBodyClusterList clusterList) {
        this.clusterList = clusterList;
        return this;
    }
    public QuerySparkRelateHBaseResponseBodyClusterList getClusterList() {
        return this.clusterList;
    }

    public QuerySparkRelateHBaseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QuerySparkRelateHBaseResponseBodyClusterListCluster extends TeaModel {
        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("ClusterName")
        public String clusterName;

        @NameInMap("ClusterType")
        public String clusterType;

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

        @NameInMap("IsRelated")
        public Boolean isRelated;

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

        @NameInMap("UserId")
        public String userId;

        @NameInMap("ZoneId")
        public String zoneId;

        public static QuerySparkRelateHBaseResponseBodyClusterListCluster build(java.util.Map<String, ?> map) throws Exception {
            QuerySparkRelateHBaseResponseBodyClusterListCluster self = new QuerySparkRelateHBaseResponseBodyClusterListCluster();
            return TeaModel.build(map, self);
        }

        public QuerySparkRelateHBaseResponseBodyClusterListCluster setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public QuerySparkRelateHBaseResponseBodyClusterListCluster setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public QuerySparkRelateHBaseResponseBodyClusterListCluster setClusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public String getClusterType() {
            return this.clusterType;
        }

        public QuerySparkRelateHBaseResponseBodyClusterListCluster setCoreDiskType(String coreDiskType) {
            this.coreDiskType = coreDiskType;
            return this;
        }
        public String getCoreDiskType() {
            return this.coreDiskType;
        }

        public QuerySparkRelateHBaseResponseBodyClusterListCluster setCoreInstanceQuantity(Integer coreInstanceQuantity) {
            this.coreInstanceQuantity = coreInstanceQuantity;
            return this;
        }
        public Integer getCoreInstanceQuantity() {
            return this.coreInstanceQuantity;
        }

        public QuerySparkRelateHBaseResponseBodyClusterListCluster setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QuerySparkRelateHBaseResponseBodyClusterListCluster setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public QuerySparkRelateHBaseResponseBodyClusterListCluster setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public QuerySparkRelateHBaseResponseBodyClusterListCluster setIsRelated(Boolean isRelated) {
            this.isRelated = isRelated;
            return this;
        }
        public Boolean getIsRelated() {
            return this.isRelated;
        }

        public QuerySparkRelateHBaseResponseBodyClusterListCluster setLockMode(String lockMode) {
            this.lockMode = lockMode;
            return this;
        }
        public String getLockMode() {
            return this.lockMode;
        }

        public QuerySparkRelateHBaseResponseBodyClusterListCluster setMainVersion(String mainVersion) {
            this.mainVersion = mainVersion;
            return this;
        }
        public String getMainVersion() {
            return this.mainVersion;
        }

        public QuerySparkRelateHBaseResponseBodyClusterListCluster setNetType(String netType) {
            this.netType = netType;
            return this;
        }
        public String getNetType() {
            return this.netType;
        }

        public QuerySparkRelateHBaseResponseBodyClusterListCluster setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public QuerySparkRelateHBaseResponseBodyClusterListCluster setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public QuerySparkRelateHBaseResponseBodyClusterListCluster setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public QuerySparkRelateHBaseResponseBodyClusterListCluster setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QuerySparkRelateHBaseResponseBodyClusterListCluster setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public QuerySparkRelateHBaseResponseBodyClusterListCluster setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class QuerySparkRelateHBaseResponseBodyClusterList extends TeaModel {
        @NameInMap("Cluster")
        public java.util.List<QuerySparkRelateHBaseResponseBodyClusterListCluster> cluster;

        public static QuerySparkRelateHBaseResponseBodyClusterList build(java.util.Map<String, ?> map) throws Exception {
            QuerySparkRelateHBaseResponseBodyClusterList self = new QuerySparkRelateHBaseResponseBodyClusterList();
            return TeaModel.build(map, self);
        }

        public QuerySparkRelateHBaseResponseBodyClusterList setCluster(java.util.List<QuerySparkRelateHBaseResponseBodyClusterListCluster> cluster) {
            this.cluster = cluster;
            return this;
        }
        public java.util.List<QuerySparkRelateHBaseResponseBodyClusterListCluster> getCluster() {
            return this.cluster;
        }

    }

}
