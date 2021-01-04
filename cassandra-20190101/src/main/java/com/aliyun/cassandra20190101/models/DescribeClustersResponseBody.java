// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class DescribeClustersResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Clusters")
    public DescribeClustersResponseBodyClusters clusters;

    public static DescribeClustersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClustersResponseBody self = new DescribeClustersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClustersResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public DescribeClustersResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeClustersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeClustersResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeClustersResponseBody setClusters(DescribeClustersResponseBodyClusters clusters) {
        this.clusters = clusters;
        return this;
    }
    public DescribeClustersResponseBodyClusters getClusters() {
        return this.clusters;
    }

    public static class DescribeClustersResponseBodyClustersClusterTagsTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeClustersResponseBodyClustersClusterTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeClustersResponseBodyClustersClusterTagsTag self = new DescribeClustersResponseBodyClustersClusterTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeClustersResponseBodyClustersClusterTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeClustersResponseBodyClustersClusterTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeClustersResponseBodyClustersClusterTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeClustersResponseBodyClustersClusterTagsTag> tag;

        public static DescribeClustersResponseBodyClustersClusterTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeClustersResponseBodyClustersClusterTags self = new DescribeClustersResponseBodyClustersClusterTags();
            return TeaModel.build(map, self);
        }

        public DescribeClustersResponseBodyClustersClusterTags setTag(java.util.List<DescribeClustersResponseBodyClustersClusterTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeClustersResponseBodyClustersClusterTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeClustersResponseBodyClustersCluster extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("PayType")
        public String payType;

        @NameInMap("Tags")
        public DescribeClustersResponseBodyClustersClusterTags tags;

        @NameInMap("LockMode")
        public String lockMode;

        @NameInMap("AutoRenewPeriod")
        public Integer autoRenewPeriod;

        @NameInMap("MinorVersion")
        public String minorVersion;

        @NameInMap("DataCenterCount")
        public Integer dataCenterCount;

        @NameInMap("AutoRenewal")
        public Boolean autoRenewal;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("ClusterName")
        public String clusterName;

        @NameInMap("MajorVersion")
        public String majorVersion;

        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("ClusterId")
        public String clusterId;

        public static DescribeClustersResponseBodyClustersCluster build(java.util.Map<String, ?> map) throws Exception {
            DescribeClustersResponseBodyClustersCluster self = new DescribeClustersResponseBodyClustersCluster();
            return TeaModel.build(map, self);
        }

        public DescribeClustersResponseBodyClustersCluster setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeClustersResponseBodyClustersCluster setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeClustersResponseBodyClustersCluster setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeClustersResponseBodyClustersCluster setTags(DescribeClustersResponseBodyClustersClusterTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeClustersResponseBodyClustersClusterTags getTags() {
            return this.tags;
        }

        public DescribeClustersResponseBodyClustersCluster setLockMode(String lockMode) {
            this.lockMode = lockMode;
            return this;
        }
        public String getLockMode() {
            return this.lockMode;
        }

        public DescribeClustersResponseBodyClustersCluster setAutoRenewPeriod(Integer autoRenewPeriod) {
            this.autoRenewPeriod = autoRenewPeriod;
            return this;
        }
        public Integer getAutoRenewPeriod() {
            return this.autoRenewPeriod;
        }

        public DescribeClustersResponseBodyClustersCluster setMinorVersion(String minorVersion) {
            this.minorVersion = minorVersion;
            return this;
        }
        public String getMinorVersion() {
            return this.minorVersion;
        }

        public DescribeClustersResponseBodyClustersCluster setDataCenterCount(Integer dataCenterCount) {
            this.dataCenterCount = dataCenterCount;
            return this;
        }
        public Integer getDataCenterCount() {
            return this.dataCenterCount;
        }

        public DescribeClustersResponseBodyClustersCluster setAutoRenewal(Boolean autoRenewal) {
            this.autoRenewal = autoRenewal;
            return this;
        }
        public Boolean getAutoRenewal() {
            return this.autoRenewal;
        }

        public DescribeClustersResponseBodyClustersCluster setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeClustersResponseBodyClustersCluster setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public DescribeClustersResponseBodyClustersCluster setMajorVersion(String majorVersion) {
            this.majorVersion = majorVersion;
            return this;
        }
        public String getMajorVersion() {
            return this.majorVersion;
        }

        public DescribeClustersResponseBodyClustersCluster setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public DescribeClustersResponseBodyClustersCluster setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

    }

    public static class DescribeClustersResponseBodyClusters extends TeaModel {
        @NameInMap("Cluster")
        public java.util.List<DescribeClustersResponseBodyClustersCluster> cluster;

        public static DescribeClustersResponseBodyClusters build(java.util.Map<String, ?> map) throws Exception {
            DescribeClustersResponseBodyClusters self = new DescribeClustersResponseBodyClusters();
            return TeaModel.build(map, self);
        }

        public DescribeClustersResponseBodyClusters setCluster(java.util.List<DescribeClustersResponseBodyClustersCluster> cluster) {
            this.cluster = cluster;
            return this;
        }
        public java.util.List<DescribeClustersResponseBodyClustersCluster> getCluster() {
            return this.cluster;
        }

    }

}
