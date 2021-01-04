// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class DescribeClusterResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Cluster")
    public DescribeClusterResponseBodyCluster cluster;

    public static DescribeClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterResponseBody self = new DescribeClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeClusterResponseBody setCluster(DescribeClusterResponseBodyCluster cluster) {
        this.cluster = cluster;
        return this;
    }
    public DescribeClusterResponseBodyCluster getCluster() {
        return this.cluster;
    }

    public static class DescribeClusterResponseBodyClusterTagsTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeClusterResponseBodyClusterTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterResponseBodyClusterTagsTag self = new DescribeClusterResponseBodyClusterTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeClusterResponseBodyClusterTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeClusterResponseBodyClusterTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeClusterResponseBodyClusterTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeClusterResponseBodyClusterTagsTag> tag;

        public static DescribeClusterResponseBodyClusterTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterResponseBodyClusterTags self = new DescribeClusterResponseBodyClusterTags();
            return TeaModel.build(map, self);
        }

        public DescribeClusterResponseBodyClusterTags setTag(java.util.List<DescribeClusterResponseBodyClusterTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeClusterResponseBodyClusterTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeClusterResponseBodyCluster extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("MaintainStartTime")
        public String maintainStartTime;

        @NameInMap("PayType")
        public String payType;

        @NameInMap("MaintainEndTime")
        public String maintainEndTime;

        @NameInMap("Tags")
        public DescribeClusterResponseBodyClusterTags tags;

        @NameInMap("LockMode")
        public String lockMode;

        @NameInMap("MinorVersion")
        public String minorVersion;

        @NameInMap("AutoRenewPeriod")
        public Integer autoRenewPeriod;

        @NameInMap("IsLatestVersion")
        public Boolean isLatestVersion;

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

        public static DescribeClusterResponseBodyCluster build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterResponseBodyCluster self = new DescribeClusterResponseBodyCluster();
            return TeaModel.build(map, self);
        }

        public DescribeClusterResponseBodyCluster setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeClusterResponseBodyCluster setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeClusterResponseBodyCluster setMaintainStartTime(String maintainStartTime) {
            this.maintainStartTime = maintainStartTime;
            return this;
        }
        public String getMaintainStartTime() {
            return this.maintainStartTime;
        }

        public DescribeClusterResponseBodyCluster setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeClusterResponseBodyCluster setMaintainEndTime(String maintainEndTime) {
            this.maintainEndTime = maintainEndTime;
            return this;
        }
        public String getMaintainEndTime() {
            return this.maintainEndTime;
        }

        public DescribeClusterResponseBodyCluster setTags(DescribeClusterResponseBodyClusterTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeClusterResponseBodyClusterTags getTags() {
            return this.tags;
        }

        public DescribeClusterResponseBodyCluster setLockMode(String lockMode) {
            this.lockMode = lockMode;
            return this;
        }
        public String getLockMode() {
            return this.lockMode;
        }

        public DescribeClusterResponseBodyCluster setMinorVersion(String minorVersion) {
            this.minorVersion = minorVersion;
            return this;
        }
        public String getMinorVersion() {
            return this.minorVersion;
        }

        public DescribeClusterResponseBodyCluster setAutoRenewPeriod(Integer autoRenewPeriod) {
            this.autoRenewPeriod = autoRenewPeriod;
            return this;
        }
        public Integer getAutoRenewPeriod() {
            return this.autoRenewPeriod;
        }

        public DescribeClusterResponseBodyCluster setIsLatestVersion(Boolean isLatestVersion) {
            this.isLatestVersion = isLatestVersion;
            return this;
        }
        public Boolean getIsLatestVersion() {
            return this.isLatestVersion;
        }

        public DescribeClusterResponseBodyCluster setDataCenterCount(Integer dataCenterCount) {
            this.dataCenterCount = dataCenterCount;
            return this;
        }
        public Integer getDataCenterCount() {
            return this.dataCenterCount;
        }

        public DescribeClusterResponseBodyCluster setAutoRenewal(Boolean autoRenewal) {
            this.autoRenewal = autoRenewal;
            return this;
        }
        public Boolean getAutoRenewal() {
            return this.autoRenewal;
        }

        public DescribeClusterResponseBodyCluster setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeClusterResponseBodyCluster setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public DescribeClusterResponseBodyCluster setMajorVersion(String majorVersion) {
            this.majorVersion = majorVersion;
            return this;
        }
        public String getMajorVersion() {
            return this.majorVersion;
        }

        public DescribeClusterResponseBodyCluster setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public DescribeClusterResponseBodyCluster setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

    }

}
