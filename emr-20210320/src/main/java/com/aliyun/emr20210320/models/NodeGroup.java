// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class NodeGroup extends TeaModel {
    /**
     * <p>The additional security group IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;sg-hp3abbae8lb6lmb1****&quot;]</p>
     */
    @NameInMap("AdditionalSecurityGroupIds")
    public java.util.List<String> additionalSecurityGroupIds;

    /**
     * <p>Applies only when <code>NodeResizeStrategy</code> is set to <code>COST_OPTIMIZED</code>. If set to <code>true</code>, the system creates Pay-As-You-Go instances to meet the target capacity if it fails to create enough spot instances due to price or inventory constraints.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("CompensateWithOnDemand")
    public Boolean compensateWithOnDemand;

    /**
     * <p>The configurations of the cost-optimized mode.</p>
     */
    @NameInMap("CostOptimizedConfig")
    public CostOptimizedConfig costOptimizedConfig;

    /**
     * <p>The data disks.</p>
     */
    @NameInMap("DataDisks")
    public java.util.List<DataDisk> dataDisks;

    /**
     * <p>The Deployment Set strategy. Valid values:</p>
     * <ul>
     * <li><p>NONE: Does not use a Deployment Set.</p>
     * </li>
     * <li><p>CLUSTER: Uses a cluster-level Deployment Set.</p>
     * </li>
     * <li><p>NODE_GROUP: Uses a node group-level Deployment Set.</p>
     * </li>
     * </ul>
     * <p>Default: <code>NONE</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>NONE</p>
     */
    @NameInMap("DeploymentSetStrategy")
    public String deploymentSetStrategy;

    /**
     * <p>Specifies whether to enable graceful shutdown for components deployed in the node group. Valid values:</p>
     * <ul>
     * <li><p>true: Enables graceful shutdown.</p>
     * </li>
     * <li><p>false: Disables graceful shutdown.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("GracefulShutdown")
    public Boolean gracefulShutdown;

    /**
     * <p>The instance types.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;ecs.g6.4xlarge&quot;]</p>
     */
    @NameInMap("InstanceTypes")
    public java.util.List<String> instanceTypes;

    /**
     * <p>The node group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ng-869471354ecd****</p>
     */
    @NameInMap("NodeGroupId")
    public String nodeGroupId;

    /**
     * <p>The node group name.</p>
     * 
     * <strong>example:</strong>
     * <p>core-1</p>
     */
    @NameInMap("NodeGroupName")
    public String nodeGroupName;

    /**
     * <p>The state of the node group.</p>
     * 
     * <strong>example:</strong>
     * <p>RESIZING</p>
     */
    @NameInMap("NodeGroupState")
    public String nodeGroupState;

    /**
     * <p>The type of the node group. Valid values:</p>
     * <ul>
     * <li><p>MASTER: A master node.</p>
     * </li>
     * <li><p>CORE: A core node.</p>
     * </li>
     * <li><p>TASK: A task node.</p>
     * </li>
     * <li><p>GATEWAY: A gateway node. This value is not applicable to DATALAKE, OLAP, or DATASERVING clusters.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MASTER</p>
     */
    @NameInMap("NodeGroupType")
    public String nodeGroupType;

    /**
     * <ul>
     * <li><p>COST_OPTIMIZED: The cost-optimized strategy.</p>
     * </li>
     * <li><p>PRIORITY: The priority-based strategy.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PRIORITY</p>
     */
    @NameInMap("NodeResizeStrategy")
    public String nodeResizeStrategy;

    /**
     * <p>The payment type. Valid values are <code>Subscription</code> for the subscription billing method and <code>PayAsYouGo</code> for the Pay-As-You-Go billing method.</p>
     * 
     * <strong>example:</strong>
     * <p>Subscription</p>
     */
    @NameInMap("PaymentType")
    public String paymentType;

    /**
     * <p>The private pool options.</p>
     */
    @NameInMap("PrivatePoolOptions")
    public PrivatePoolOptions privatePoolOptions;

    /**
     * <p>The number of running nodes.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("RunningNodeCount")
    public Integer runningNodeCount;

    /**
     * <p>The bid prices for the spot instances. This parameter is effective only when <code>SpotStrategy</code> is set to <code>SpotWithPriceLimit</code>. The array can contain 0 to 100 elements.</p>
     */
    @NameInMap("SpotBidPrices")
    public java.util.List<SpotBidPrice> spotBidPrices;

    /**
     * <p>Specifies whether to enable spot instance remedy. If enabled, the scaling group attempts to create a new instance to replace a spot instance that is about to be reclaimed. Valid values:</p>
     * <ul>
     * <li><p>true: Enables spot instance remedy.</p>
     * </li>
     * <li><p>false: Disables spot instance remedy.</p>
     * </li>
     * </ul>
     * <p>Default: <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SpotInstanceRemedy")
    public Boolean spotInstanceRemedy;

    /**
     * <p>The policy for using spot instances. Valid values:</p>
     * <ul>
     * <li><p>NoSpot: No spot instances are used.</p>
     * </li>
     * <li><p>SpotWithPriceLimit: Spot instances are created with a user-defined maximum bid price.</p>
     * </li>
     * <li><p>SpotAsPriceGo: The system automatically bids for spot instances. The bid price does not exceed the price of a Pay-As-You-Go instance.</p>
     * </li>
     * </ul>
     * <p>Default: <code>NoSpot</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>NoSpot</p>
     */
    @NameInMap("SpotStrategy")
    public String spotStrategy;

    /**
     * <p>The reason for the state change.</p>
     * 
     * <strong>example:</strong>
     * <p>手动重启</p>
     */
    @NameInMap("StateChangeReason")
    public NodeGroupStateChangeReason stateChangeReason;

    /**
     * <p>The node group state.</p>
     * 
     * <strong>example:</strong>
     * <p>CREATED</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The system disk.</p>
     */
    @NameInMap("SystemDisk")
    public SystemDisk systemDisk;

    /**
     * <p>The VSwitch IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;vsw-hp35g7ya5ymw68mmg****&quot;]</p>
     */
    @NameInMap("VSwitchIds")
    public java.util.List<String> vSwitchIds;

    /**
     * <p>Specifies whether to assign a public IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("WithPublicIp")
    public Boolean withPublicIp;

    /**
     * <p>The zone ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static NodeGroup build(java.util.Map<String, ?> map) throws Exception {
        NodeGroup self = new NodeGroup();
        return TeaModel.build(map, self);
    }

    public NodeGroup setAdditionalSecurityGroupIds(java.util.List<String> additionalSecurityGroupIds) {
        this.additionalSecurityGroupIds = additionalSecurityGroupIds;
        return this;
    }
    public java.util.List<String> getAdditionalSecurityGroupIds() {
        return this.additionalSecurityGroupIds;
    }

    public NodeGroup setCompensateWithOnDemand(Boolean compensateWithOnDemand) {
        this.compensateWithOnDemand = compensateWithOnDemand;
        return this;
    }
    public Boolean getCompensateWithOnDemand() {
        return this.compensateWithOnDemand;
    }

    public NodeGroup setCostOptimizedConfig(CostOptimizedConfig costOptimizedConfig) {
        this.costOptimizedConfig = costOptimizedConfig;
        return this;
    }
    public CostOptimizedConfig getCostOptimizedConfig() {
        return this.costOptimizedConfig;
    }

    public NodeGroup setDataDisks(java.util.List<DataDisk> dataDisks) {
        this.dataDisks = dataDisks;
        return this;
    }
    public java.util.List<DataDisk> getDataDisks() {
        return this.dataDisks;
    }

    public NodeGroup setDeploymentSetStrategy(String deploymentSetStrategy) {
        this.deploymentSetStrategy = deploymentSetStrategy;
        return this;
    }
    public String getDeploymentSetStrategy() {
        return this.deploymentSetStrategy;
    }

    public NodeGroup setGracefulShutdown(Boolean gracefulShutdown) {
        this.gracefulShutdown = gracefulShutdown;
        return this;
    }
    public Boolean getGracefulShutdown() {
        return this.gracefulShutdown;
    }

    public NodeGroup setInstanceTypes(java.util.List<String> instanceTypes) {
        this.instanceTypes = instanceTypes;
        return this;
    }
    public java.util.List<String> getInstanceTypes() {
        return this.instanceTypes;
    }

    public NodeGroup setNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
        return this;
    }
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    public NodeGroup setNodeGroupName(String nodeGroupName) {
        this.nodeGroupName = nodeGroupName;
        return this;
    }
    public String getNodeGroupName() {
        return this.nodeGroupName;
    }

    public NodeGroup setNodeGroupState(String nodeGroupState) {
        this.nodeGroupState = nodeGroupState;
        return this;
    }
    public String getNodeGroupState() {
        return this.nodeGroupState;
    }

    public NodeGroup setNodeGroupType(String nodeGroupType) {
        this.nodeGroupType = nodeGroupType;
        return this;
    }
    public String getNodeGroupType() {
        return this.nodeGroupType;
    }

    public NodeGroup setNodeResizeStrategy(String nodeResizeStrategy) {
        this.nodeResizeStrategy = nodeResizeStrategy;
        return this;
    }
    public String getNodeResizeStrategy() {
        return this.nodeResizeStrategy;
    }

    public NodeGroup setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public String getPaymentType() {
        return this.paymentType;
    }

    public NodeGroup setPrivatePoolOptions(PrivatePoolOptions privatePoolOptions) {
        this.privatePoolOptions = privatePoolOptions;
        return this;
    }
    public PrivatePoolOptions getPrivatePoolOptions() {
        return this.privatePoolOptions;
    }

    public NodeGroup setRunningNodeCount(Integer runningNodeCount) {
        this.runningNodeCount = runningNodeCount;
        return this;
    }
    public Integer getRunningNodeCount() {
        return this.runningNodeCount;
    }

    public NodeGroup setSpotBidPrices(java.util.List<SpotBidPrice> spotBidPrices) {
        this.spotBidPrices = spotBidPrices;
        return this;
    }
    public java.util.List<SpotBidPrice> getSpotBidPrices() {
        return this.spotBidPrices;
    }

    public NodeGroup setSpotInstanceRemedy(Boolean spotInstanceRemedy) {
        this.spotInstanceRemedy = spotInstanceRemedy;
        return this;
    }
    public Boolean getSpotInstanceRemedy() {
        return this.spotInstanceRemedy;
    }

    public NodeGroup setSpotStrategy(String spotStrategy) {
        this.spotStrategy = spotStrategy;
        return this;
    }
    public String getSpotStrategy() {
        return this.spotStrategy;
    }

    public NodeGroup setStateChangeReason(NodeGroupStateChangeReason stateChangeReason) {
        this.stateChangeReason = stateChangeReason;
        return this;
    }
    public NodeGroupStateChangeReason getStateChangeReason() {
        return this.stateChangeReason;
    }

    public NodeGroup setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public NodeGroup setSystemDisk(SystemDisk systemDisk) {
        this.systemDisk = systemDisk;
        return this;
    }
    public SystemDisk getSystemDisk() {
        return this.systemDisk;
    }

    public NodeGroup setVSwitchIds(java.util.List<String> vSwitchIds) {
        this.vSwitchIds = vSwitchIds;
        return this;
    }
    public java.util.List<String> getVSwitchIds() {
        return this.vSwitchIds;
    }

    public NodeGroup setWithPublicIp(Boolean withPublicIp) {
        this.withPublicIp = withPublicIp;
        return this;
    }
    public Boolean getWithPublicIp() {
        return this.withPublicIp;
    }

    public NodeGroup setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
