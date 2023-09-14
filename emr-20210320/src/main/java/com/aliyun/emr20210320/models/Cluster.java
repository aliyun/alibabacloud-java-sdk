// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class Cluster extends TeaModel {
    /**
     * <p>集群ID。</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>集群名称。</p>
     */
    @NameInMap("ClusterName")
    public String clusterName;

    /**
     * <p>集群状态。</p>
     */
    @NameInMap("ClusterState")
    public String clusterState;

    /**
     * <p>集群类型。</p>
     */
    @NameInMap("ClusterType")
    public String clusterType;

    /**
     * <p>创建时间。</p>
     */
    @NameInMap("CreateTime")
    public Long createTime;

    /**
     * <p>部署模式。</p>
     */
    @NameInMap("DeployMode")
    public String deployMode;

    /**
     * <p>EMR默认角色。</p>
     */
    @NameInMap("EmrDefaultRole")
    public String emrDefaultRole;

    /**
     * <p>删除时间。</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>过期时间。</p>
     */
    @NameInMap("ExpireTime")
    public Long expireTime;

    /**
     * <p>节点属性。</p>
     */
    @NameInMap("NodeAttributes")
    public NodeAttributes nodeAttributes;

    /**
     * <p>付费类型。</p>
     */
    @NameInMap("PaymentType")
    public String paymentType;

    /**
     * <p>可用时间。</p>
     */
    @NameInMap("ReadyTime")
    public Long readyTime;

    /**
     * <p>区域ID。</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>EMR发行版。</p>
     */
    @NameInMap("ReleaseVersion")
    public String releaseVersion;

    /**
     * <p>资源组ID。</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>Kerberos安全模式。</p>
     */
    @NameInMap("SecurityMode")
    public String securityMode;

    @NameInMap("StateChangeReason")
    public ClusterStateChangeReason stateChangeReason;

    /**
     * <p>预付费配置。</p>
     */
    @NameInMap("SubscriptionConfig")
    public SubscriptionConfig subscriptionConfig;

    /**
     * <p>集群标签。</p>
     */
    @NameInMap("Tags")
    public java.util.List<Tag> tags;

    public static Cluster build(java.util.Map<String, ?> map) throws Exception {
        Cluster self = new Cluster();
        return TeaModel.build(map, self);
    }

    public Cluster setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public Cluster setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public Cluster setClusterState(String clusterState) {
        this.clusterState = clusterState;
        return this;
    }
    public String getClusterState() {
        return this.clusterState;
    }

    public Cluster setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }
    public String getClusterType() {
        return this.clusterType;
    }

    public Cluster setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public Cluster setDeployMode(String deployMode) {
        this.deployMode = deployMode;
        return this;
    }
    public String getDeployMode() {
        return this.deployMode;
    }

    public Cluster setEmrDefaultRole(String emrDefaultRole) {
        this.emrDefaultRole = emrDefaultRole;
        return this;
    }
    public String getEmrDefaultRole() {
        return this.emrDefaultRole;
    }

    public Cluster setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public Cluster setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public Long getExpireTime() {
        return this.expireTime;
    }

    public Cluster setNodeAttributes(NodeAttributes nodeAttributes) {
        this.nodeAttributes = nodeAttributes;
        return this;
    }
    public NodeAttributes getNodeAttributes() {
        return this.nodeAttributes;
    }

    public Cluster setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public String getPaymentType() {
        return this.paymentType;
    }

    public Cluster setReadyTime(Long readyTime) {
        this.readyTime = readyTime;
        return this;
    }
    public Long getReadyTime() {
        return this.readyTime;
    }

    public Cluster setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public Cluster setReleaseVersion(String releaseVersion) {
        this.releaseVersion = releaseVersion;
        return this;
    }
    public String getReleaseVersion() {
        return this.releaseVersion;
    }

    public Cluster setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public Cluster setSecurityMode(String securityMode) {
        this.securityMode = securityMode;
        return this;
    }
    public String getSecurityMode() {
        return this.securityMode;
    }

    public Cluster setStateChangeReason(ClusterStateChangeReason stateChangeReason) {
        this.stateChangeReason = stateChangeReason;
        return this;
    }
    public ClusterStateChangeReason getStateChangeReason() {
        return this.stateChangeReason;
    }

    public Cluster setSubscriptionConfig(SubscriptionConfig subscriptionConfig) {
        this.subscriptionConfig = subscriptionConfig;
        return this;
    }
    public SubscriptionConfig getSubscriptionConfig() {
        return this.subscriptionConfig;
    }

    public Cluster setTags(java.util.List<Tag> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<Tag> getTags() {
        return this.tags;
    }

}
