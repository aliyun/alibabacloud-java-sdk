// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class Cluster extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>c-b933c5aac8fe****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The cluster name.</p>
     * 
     * <strong>example:</strong>
     * <p>emrtest</p>
     */
    @NameInMap("ClusterName")
    public String clusterName;

    /**
     * <p>The cluster state. Valid values:</p>
     * <ul>
     * <li><p><code>STARTING</code>: The cluster is starting.</p>
     * </li>
     * <li><p><code>START_FAILED</code>: The cluster failed to start.</p>
     * </li>
     * <li><p><code>BOOTSTRAPPING</code>: The cluster is running bootstrap actions.</p>
     * </li>
     * <li><p><code>RUNNING</code>: The cluster is running.</p>
     * </li>
     * <li><p><code>TERMINATING</code>: The cluster is terminating.</p>
     * </li>
     * <li><p><code>TERMINATED</code>: The cluster is terminated.</p>
     * </li>
     * <li><p><code>TERMINATED_WITH_ERRORS</code>: The cluster terminated due to errors.</p>
     * </li>
     * <li><p><code>TERMINATE_FAILED</code>: The cluster failed to terminate.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RUNNING</p>
     */
    @NameInMap("ClusterState")
    public String clusterState;

    /**
     * <p>The cluster type. Valid values:</p>
     * <ul>
     * <li><p><code>DATALAKE</code>: New data lake.</p>
     * </li>
     * <li><p><code>OLAP</code>: Data analysis.</p>
     * </li>
     * <li><p><code>DATAFLOW</code>: Real-time data flow.</p>
     * </li>
     * <li><p><code>DATASERVING</code>: Data serving.</p>
     * </li>
     * <li><p><code>CUSTOM</code>: Custom cluster.</p>
     * </li>
     * <li><p><code>HADOOP</code>: Legacy data lake.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DATALAKE</p>
     */
    @NameInMap("ClusterType")
    public String clusterType;

    /**
     * <p>The time when the cluster was created. The time is a Unix timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1592837465784</p>
     */
    @NameInMap("CreateTime")
    public Long createTime;

    /**
     * <p>Indicates whether deletion protection is enabled for the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DeletionProtection")
    public Boolean deletionProtection;

    /**
     * <p>The application deployment mode. Valid values:</p>
     * <ul>
     * <li><p><code>NORMAL</code>: Standard deployment.</p>
     * </li>
     * <li><p><code>HA</code>: High-availability deployment.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>HA</p>
     */
    @NameInMap("DeployMode")
    public String deployMode;

    /**
     * <p>The cluster description.</p>
     * 
     * <strong>example:</strong>
     * <p>EMR cluster</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The default role for E-MapReduce.</p>
     * 
     * <strong>example:</strong>
     * <p>AliyunEMRDefaultRole</p>
     */
    @NameInMap("EmrDefaultRole")
    public String emrDefaultRole;

    /**
     * <p>The time when the cluster was deleted. The time is a Unix timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1592837465784</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The time when the cluster is scheduled to expire. The time is a Unix timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1592837465784</p>
     */
    @NameInMap("ExpireTime")
    public Long expireTime;

    /**
     * <p>The node attributes.</p>
     */
    @NameInMap("NodeAttributes")
    public NodeAttributes nodeAttributes;

    /**
     * <p>The billing method. Valid values:</p>
     * <ul>
     * <li><p><code>PayAsYouGo</code>: Pay-as-you-go.</p>
     * </li>
     * <li><p><code>Subscription</code>: Subscription.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PayAsYouGo</p>
     */
    @NameInMap("PaymentType")
    public String paymentType;

    /**
     * <p>The time when the cluster became ready. The time is a Unix timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1592837465784</p>
     */
    @NameInMap("ReadyTime")
    public Long readyTime;

    /**
     * <p>The ID of the region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The release version of E-MapReduce.</p>
     * 
     * <strong>example:</strong>
     * <p>EMR-5.8.0</p>
     */
    @NameInMap("ReleaseVersion")
    public String releaseVersion;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmzabjyop****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The security mode of the cluster. Valid values:</p>
     * <ul>
     * <li><p><code>NORMAL</code>: Kerberos is disabled.</p>
     * </li>
     * <li><p><code>KERBEROS</code>: Kerberos is enabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NORMAL</p>
     */
    @NameInMap("SecurityMode")
    public String securityMode;

    /**
     * <p>The reason for the cluster state change.</p>
     */
    @NameInMap("StateChangeReason")
    public ClusterStateChangeReason stateChangeReason;

    /**
     * <p>The subscription configuration.</p>
     */
    @NameInMap("SubscriptionConfig")
    public SubscriptionConfig subscriptionConfig;

    /**
     * <p>The cluster tags.</p>
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

    public Cluster setDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
        return this;
    }
    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    public Cluster setDeployMode(String deployMode) {
        this.deployMode = deployMode;
        return this;
    }
    public String getDeployMode() {
        return this.deployMode;
    }

    public Cluster setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
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
