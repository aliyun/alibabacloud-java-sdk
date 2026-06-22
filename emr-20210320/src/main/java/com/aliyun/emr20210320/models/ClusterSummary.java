// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ClusterSummary extends TeaModel {
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
     * <p>The state of the cluster. Valid values:</p>
     * <ul>
     * <li><p><code>STARTING</code>: The cluster is starting.</p>
     * </li>
     * <li><p><code>START_FAILED</code>: The cluster fails to be started.</p>
     * </li>
     * <li><p><code>BOOTSTRAPPING</code>: The cluster is being initialized.</p>
     * </li>
     * <li><p><code>RUNNING</code>: The cluster is running.</p>
     * </li>
     * <li><p><code>TERMINATING</code>: The cluster is being terminated.</p>
     * </li>
     * <li><p><code>TERMINATED</code>: The cluster is terminated.</p>
     * </li>
     * <li><p><code>TERMINATED_WITH_ERRORS</code>: The cluster is terminated with errors.</p>
     * </li>
     * <li><p><code>TERMINATE_FAILED</code>: The cluster fails to be terminated.</p>
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
     * <li><p><code>DATALAKE</code>: data lake.</p>
     * </li>
     * <li><p><code>OLAP</code>: data analytics.</p>
     * </li>
     * <li><p><code>DATAFLOW</code>: real-time dataflow.</p>
     * </li>
     * <li><p><code>DATASERVING</code>: data serving.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DATALAKE</p>
     */
    @NameInMap("ClusterType")
    public String clusterType;

    /**
     * <p>The time when the cluster was created.</p>
     * 
     * <strong>example:</strong>
     * <p>1592837465788</p>
     */
    @NameInMap("CreateTime")
    public Long createTime;

    /**
     * <p>The release protection feature.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DeletionProtection")
    public Boolean deletionProtection;

    /**
     * <p>The description of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>EMR cluster</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The EMR service role.</p>
     * 
     * <strong>example:</strong>
     * <p>AliyunEMRDefaultRole</p>
     */
    @NameInMap("EmrDefaultRole")
    public String emrDefaultRole;

    /**
     * <p>The time when the cluster was deleted.</p>
     * 
     * <strong>example:</strong>
     * <p>1592837485788</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The expiration time.</p>
     * 
     * <strong>example:</strong>
     * <p>1592837475788</p>
     */
    @NameInMap("ExpireTime")
    public Long expireTime;

    /**
     * <p>The billing method. Valid values:</p>
     * <ul>
     * <li><p><code>PayAsYouGo</code>: pay-as-you-go.</p>
     * </li>
     * <li><p><code>Subscription</code>: subscription.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PayAsYouGo</p>
     */
    @NameInMap("PaymentType")
    public String paymentType;

    /**
     * <p>The time when the cluster is available.</p>
     * 
     * <strong>example:</strong>
     * <p>1592837465788</p>
     */
    @NameInMap("ReadyTime")
    public Long readyTime;

    /**
     * <p>The E-MapReduce (EMR) release version.</p>
     * 
     * <strong>example:</strong>
     * <p>EMR-5.8.0</p>
     */
    @NameInMap("ReleaseVersion")
    public String releaseVersion;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmzabjyop****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The reason for the failure.</p>
     */
    @NameInMap("StateChangeReason")
    public ClusterStateChangeReason stateChangeReason;

    /**
     * <p>The list of tags.</p>
     */
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

    public ClusterSummary setDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
        return this;
    }
    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    public ClusterSummary setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
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
