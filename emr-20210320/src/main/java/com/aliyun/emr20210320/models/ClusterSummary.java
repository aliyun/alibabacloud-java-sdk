// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ClusterSummary extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("ClusterName")
    public String clusterName;

    @NameInMap("ClusterState")
    public String clusterState;

    @NameInMap("ClusterType")
    public String clusterType;

    @NameInMap("CreateTime")
    public Long createTime;

    @NameInMap("EmrDefaultRole")
    public String emrDefaultRole;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("ExpireTime")
    public Long expireTime;

    @NameInMap("PaymentType")
    public String paymentType;

    @NameInMap("ReadyTime")
    public Long readyTime;

    @NameInMap("ReleaseVersion")
    public String releaseVersion;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("StateChangeReason")
    public ClusterStateChangeReason stateChangeReason;

    @NameInMap("Tags")
    public java.util.List<Tag> tags;

    public static ClusterSummary build(java.util.Map<String, ?> map) throws Exception {
        ClusterSummary self = new ClusterSummary();
        return TeaModel.build(map, self);
    }

    public ClusterSummary setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ClusterSummary setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public ClusterSummary setClusterState(String clusterState) {
        this.clusterState = clusterState;
        return this;
    }
    public String getClusterState() {
        return this.clusterState;
    }

    public ClusterSummary setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }
    public String getClusterType() {
        return this.clusterType;
    }

    public ClusterSummary setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public ClusterSummary setEmrDefaultRole(String emrDefaultRole) {
        this.emrDefaultRole = emrDefaultRole;
        return this;
    }
    public String getEmrDefaultRole() {
        return this.emrDefaultRole;
    }

    public ClusterSummary setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ClusterSummary setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public Long getExpireTime() {
        return this.expireTime;
    }

    public ClusterSummary setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public String getPaymentType() {
        return this.paymentType;
    }

    public ClusterSummary setReadyTime(Long readyTime) {
        this.readyTime = readyTime;
        return this;
    }
    public Long getReadyTime() {
        return this.readyTime;
    }

    public ClusterSummary setReleaseVersion(String releaseVersion) {
        this.releaseVersion = releaseVersion;
        return this;
    }
    public String getReleaseVersion() {
        return this.releaseVersion;
    }

    public ClusterSummary setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ClusterSummary setStateChangeReason(ClusterStateChangeReason stateChangeReason) {
        this.stateChangeReason = stateChangeReason;
        return this;
    }
    public ClusterStateChangeReason getStateChangeReason() {
        return this.stateChangeReason;
    }

    public ClusterSummary setTags(java.util.List<Tag> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<Tag> getTags() {
        return this.tags;
    }

}
