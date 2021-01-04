// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class DescribeDeletedClustersResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Clusters")
    public DescribeDeletedClustersResponseBodyClusters clusters;

    public static DescribeDeletedClustersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeletedClustersResponseBody self = new DescribeDeletedClustersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDeletedClustersResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public DescribeDeletedClustersResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDeletedClustersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDeletedClustersResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDeletedClustersResponseBody setClusters(DescribeDeletedClustersResponseBodyClusters clusters) {
        this.clusters = clusters;
        return this;
    }
    public DescribeDeletedClustersResponseBodyClusters getClusters() {
        return this.clusters;
    }

    public static class DescribeDeletedClustersResponseBodyClustersCluster extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("DataCenterCount")
        public Integer dataCenterCount;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("PayType")
        public String payType;

        @NameInMap("ClusterName")
        public String clusterName;

        @NameInMap("MajorVersion")
        public String majorVersion;

        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("MinorVersion")
        public String minorVersion;

        @NameInMap("ClusterId")
        public String clusterId;

        public static DescribeDeletedClustersResponseBodyClustersCluster build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeletedClustersResponseBodyClustersCluster self = new DescribeDeletedClustersResponseBodyClustersCluster();
            return TeaModel.build(map, self);
        }

        public DescribeDeletedClustersResponseBodyClustersCluster setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDeletedClustersResponseBodyClustersCluster setDataCenterCount(Integer dataCenterCount) {
            this.dataCenterCount = dataCenterCount;
            return this;
        }
        public Integer getDataCenterCount() {
            return this.dataCenterCount;
        }

        public DescribeDeletedClustersResponseBodyClustersCluster setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeDeletedClustersResponseBodyClustersCluster setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeDeletedClustersResponseBodyClustersCluster setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public DescribeDeletedClustersResponseBodyClustersCluster setMajorVersion(String majorVersion) {
            this.majorVersion = majorVersion;
            return this;
        }
        public String getMajorVersion() {
            return this.majorVersion;
        }

        public DescribeDeletedClustersResponseBodyClustersCluster setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public DescribeDeletedClustersResponseBodyClustersCluster setMinorVersion(String minorVersion) {
            this.minorVersion = minorVersion;
            return this;
        }
        public String getMinorVersion() {
            return this.minorVersion;
        }

        public DescribeDeletedClustersResponseBodyClustersCluster setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

    }

    public static class DescribeDeletedClustersResponseBodyClusters extends TeaModel {
        @NameInMap("Cluster")
        public java.util.List<DescribeDeletedClustersResponseBodyClustersCluster> cluster;

        public static DescribeDeletedClustersResponseBodyClusters build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeletedClustersResponseBodyClusters self = new DescribeDeletedClustersResponseBodyClusters();
            return TeaModel.build(map, self);
        }

        public DescribeDeletedClustersResponseBodyClusters setCluster(java.util.List<DescribeDeletedClustersResponseBodyClustersCluster> cluster) {
            this.cluster = cluster;
            return this;
        }
        public java.util.List<DescribeDeletedClustersResponseBodyClustersCluster> getCluster() {
            return this.cluster;
        }

    }

}
