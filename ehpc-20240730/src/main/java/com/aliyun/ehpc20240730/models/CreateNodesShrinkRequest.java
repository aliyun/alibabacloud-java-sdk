// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class CreateNodesShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the cluster.</p>
     * <p>You can call <a href="https://help.aliyun.com/document_detail/87116.html">ListClusters</a> to query the cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ehpc-hz-FYUr32****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The hardware configuration of the compute nodes.</p>
     */
    @NameInMap("ComputeNode")
    public String computeNodeShrink;

    /**
     * <p>The number of compute nodes to add. Valid values: 1 to 99. The value must be greater than MinCount.</p>
     * <ul>
     * <li><p>If the available ECS inventory is less than MinCount, the node creation fails.</p>
     * </li>
     * <li><p>If the available ECS inventory is greater than or equal to MinCount but less than Count, nodes are added based on the number specified by MinCount.</p>
     * </li>
     * <li><p>If the available ECS inventory is greater than or equal to Count, nodes are added based on the number specified by Count.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>The ID of the deployment set.
     * You can call <a href="https://help.aliyun.com/document_detail/91313.html">DescribeDeploymentSets</a> to query the deployment set ID. Only deployment sets that use the low network latency strategy are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>ds-bp1frxuzdg87zh4pzq****</p>
     */
    @NameInMap("DeploymentSetId")
    public String deploymentSetId;

    /**
     * <p>The network type for communication between compute nodes. Valid values:</p>
     * <ul>
     * <li>vpc</li>
     * <li>eRDMA</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>vpc</p>
     */
    @NameInMap("HPCInterConnect")
    public String HPCInterConnect;

    /**
     * <p>The hostname prefix of the compute nodes in the queue.</p>
     * 
     * <strong>example:</strong>
     * <p>compute</p>
     */
    @NameInMap("HostnamePrefix")
    public String hostnamePrefix;

    /**
     * <p>The hostname suffix of the compute nodes in the queue.</p>
     * 
     * <strong>example:</strong>
     * <p>demo</p>
     */
    @NameInMap("HostnameSuffix")
    public String hostnameSuffix;

    @NameInMap("Hostnames")
    public String hostnamesShrink;

    /**
     * <p>Specifies whether deletion protection is enabled for the compute nodes.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("KeepAlive")
    public String keepAlive;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MinCount")
    public Integer minCount;

    /**
     * <p>The name of the queue to which the compute nodes belong.</p>
     * 
     * <strong>example:</strong>
     * <p>test1</p>
     */
    @NameInMap("QueueName")
    public String queueName;

    /**
     * <p>The name of the RAM role attached to the compute nodes in the queue.</p>
     * 
     * <strong>example:</strong>
     * <p>AliyunServiceRoleForOOSBandwidthScheduler</p>
     */
    @NameInMap("RamRole")
    public String ramRole;

    /**
     * <p>The ID of the reserved node pool.</p>
     * 
     * <strong>example:</strong>
     * <p>rnp-756vlp7a</p>
     */
    @NameInMap("ReservedNodePoolId")
    public String reservedNodePoolId;

    /**
     * <p>The vSwitch ID.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1lfcjbfb099rrjn****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    public static CreateNodesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateNodesShrinkRequest self = new CreateNodesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateNodesShrinkRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateNodesShrinkRequest setComputeNodeShrink(String computeNodeShrink) {
        this.computeNodeShrink = computeNodeShrink;
        return this;
    }
    public String getComputeNodeShrink() {
        return this.computeNodeShrink;
    }

    public CreateNodesShrinkRequest setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public CreateNodesShrinkRequest setDeploymentSetId(String deploymentSetId) {
        this.deploymentSetId = deploymentSetId;
        return this;
    }
    public String getDeploymentSetId() {
        return this.deploymentSetId;
    }

    public CreateNodesShrinkRequest setHPCInterConnect(String HPCInterConnect) {
        this.HPCInterConnect = HPCInterConnect;
        return this;
    }
    public String getHPCInterConnect() {
        return this.HPCInterConnect;
    }

    public CreateNodesShrinkRequest setHostnamePrefix(String hostnamePrefix) {
        this.hostnamePrefix = hostnamePrefix;
        return this;
    }
    public String getHostnamePrefix() {
        return this.hostnamePrefix;
    }

    public CreateNodesShrinkRequest setHostnameSuffix(String hostnameSuffix) {
        this.hostnameSuffix = hostnameSuffix;
        return this;
    }
    public String getHostnameSuffix() {
        return this.hostnameSuffix;
    }

    public CreateNodesShrinkRequest setHostnamesShrink(String hostnamesShrink) {
        this.hostnamesShrink = hostnamesShrink;
        return this;
    }
    public String getHostnamesShrink() {
        return this.hostnamesShrink;
    }

    public CreateNodesShrinkRequest setKeepAlive(String keepAlive) {
        this.keepAlive = keepAlive;
        return this;
    }
    public String getKeepAlive() {
        return this.keepAlive;
    }

    public CreateNodesShrinkRequest setMinCount(Integer minCount) {
        this.minCount = minCount;
        return this;
    }
    public Integer getMinCount() {
        return this.minCount;
    }

    public CreateNodesShrinkRequest setQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }
    public String getQueueName() {
        return this.queueName;
    }

    public CreateNodesShrinkRequest setRamRole(String ramRole) {
        this.ramRole = ramRole;
        return this;
    }
    public String getRamRole() {
        return this.ramRole;
    }

    public CreateNodesShrinkRequest setReservedNodePoolId(String reservedNodePoolId) {
        this.reservedNodePoolId = reservedNodePoolId;
        return this;
    }
    public String getReservedNodePoolId() {
        return this.reservedNodePoolId;
    }

    public CreateNodesShrinkRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

}
