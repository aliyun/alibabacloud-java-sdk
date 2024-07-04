// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ClusterSummary extends TeaModel {
    /**
     * <p>集群ID。</p>
     * 
     * <strong>example:</strong>
     * <p>c-b933c5aac8fe****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>集群名称。</p>
     * 
     * <strong>example:</strong>
     * <p>emrtest</p>
     */
    @NameInMap("ClusterName")
    public String clusterName;

    /**
     * <p>集群状态。取值范围：</p>
     * <ul>
     * <li>STARTING：启动中。</li>
     * <li>START_FAILED：启动失败。</li>
     * <li>BOOTSTRAPPING：引导操作初始化。</li>
     * <li>RUNNING：运行中。</li>
     * <li>TERMINATING：终止中。</li>
     * <li>TERMINATED：已终止。</li>
     * <li>TERMINATED_WITH_ERRORS：发生异常导致终止。</li>
     * <li>TERMINATE_FAILED：终止失败。</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RUNNING</p>
     */
    @NameInMap("ClusterState")
    public String clusterState;

    /**
     * <p>集群类型。取值范围：</p>
     * <ul>
     * <li>DATALAKE：新版数据湖。</li>
     * <li>OLAP：数据分析。</li>
     * <li>DATAFLOW：实时数据流。</li>
     * <li>DATASERVING：数据服务。</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DATALAKE</p>
     */
    @NameInMap("ClusterType")
    public String clusterType;

    /**
     * <p>创建时间。</p>
     * 
     * <strong>example:</strong>
     * <p>1592837465784</p>
     */
    @NameInMap("CreateTime")
    public Long createTime;

    /**
     * <p>EMR服务角色。</p>
     */
    @NameInMap("EmrDefaultRole")
    public String emrDefaultRole;

    /**
     * <p>删除时间。</p>
     * 
     * <strong>example:</strong>
     * <p>1592837465784</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>过期时间。</p>
     * 
     * <strong>example:</strong>
     * <p>1592837465784</p>
     */
    @NameInMap("ExpireTime")
    public Long expireTime;

    /**
     * <p>付费类型。取值范围：</p>
     * <ul>
     * <li>PayAsYouGo：后付费。</li>
     * <li>Subscription：预付费。</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PayAsYouGo</p>
     */
    @NameInMap("PaymentType")
    public String paymentType;

    /**
     * <p>可用时间。</p>
     * 
     * <strong>example:</strong>
     * <p>1592837465784</p>
     */
    @NameInMap("ReadyTime")
    public Long readyTime;

    /**
     * <p>EMR发行版。</p>
     * 
     * <strong>example:</strong>
     * <p>EMR-5.8.0</p>
     */
    @NameInMap("ReleaseVersion")
    public String releaseVersion;

    /**
     * <p>资源组ID。</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmzabjyop****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>失败原因。</p>
     */
    @NameInMap("StateChangeReason")
    public ClusterStateChangeReason stateChangeReason;

    /**
     * <p>标签列表。</p>
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
