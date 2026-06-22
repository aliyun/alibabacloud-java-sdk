// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class NodeGroupConfig extends TeaModel {
    /**
     * <p>The IDs of the additional security groups. In addition to the security group of the cluster, you can specify additional security groups for the node group. You can specify up to two security group IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;sg-hp3abbae8lb6lmb1****&quot;]</p>
     */
    @NameInMap("AdditionalSecurityGroupIds")
    public java.util.List<String> additionalSecurityGroupIds;

    /**
     * <p>The auto scaling policy.</p>
     */
    @NameInMap("AutoScalingPolicy")
    public AutoScalingPolicy autoScalingPolicy;

    /**
     * <p>Specifies whether to automatically create pay-as-you-go instances to meet the required capacity when the number of preemptible instances is insufficient. This parameter is effective only when <code>nodeResizeStrategy</code> is set to <code>COST_OPTIMIZED</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("CompensateWithOnDemand")
    public Boolean compensateWithOnDemand;

    /**
     * <p>A list of custom component tags.</p>
     */
    @NameInMap("ComponentTags")
    public java.util.List<String> componentTags;

    /**
     * <p>The cost optimization settings.</p>
     */
    @NameInMap("CostOptimizedConfig")
    public CostOptimizedConfig costOptimizedConfig;

    /**
     * <p>The data disks. Currently, the array can contain only one data disk.</p>
     */
    @NameInMap("DataDisks")
    public java.util.List<DataDisk> dataDisks;

    /**
     * <p>The deployment set strategy. Valid values:</p>
     * <ul>
     * <li><p><code>NONE</code>: No deployment sets are used.</p>
     * </li>
     * <li><p><code>CLUSTER</code>: The cluster-level deployment set is used.</p>
     * </li>
     * <li><p><code>NODE_GROUP</code>: The node group-level deployment set is used.</p>
     * </li>
     * </ul>
     * <p>Default value: <code>NONE</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>NONE</p>
     */
    @NameInMap("DeploymentSetStrategy")
    public String deploymentSetStrategy;

    /**
     * <p>Specifies whether to enable graceful shutdown for the components in the node group. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: Enables graceful shutdown.</p>
     * </li>
     * <li><p><code>false</code>: Disables graceful shutdown.</p>
     * </li>
     * </ul>
     * <p>Default value: <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("GracefulShutdown")
    public Boolean gracefulShutdown;

    /**
     * <p>The instance types. You can specify 1 to 100 instance types.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;ecs.g6.xlarge&quot;]</p>
     */
    @NameInMap("InstanceTypes")
    public java.util.List<String> instanceTypes;

    /**
     * <p>The number of nodes in the node group. Valid values: 1 to 1,000.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("NodeCount")
    public Integer nodeCount;

    /**
     * <p>The name of the node group. The name can be up to 128 characters in length and must be unique within the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>core-1</p>
     */
    @NameInMap("NodeGroupName")
    public String nodeGroupName;

    /**
     * <p>The type of the node group. Valid values:</p>
     * <ul>
     * <li><p><code>MASTER</code>: a master node group.</p>
     * </li>
     * <li><p><code>CORE</code>: a core node group.</p>
     * </li>
     * <li><p><code>TASK</code>: a task node group.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CORE</p>
     */
    @NameInMap("NodeGroupType")
    public String nodeGroupType;

    /**
     * <p>The node scale-out strategy. Valid values:</p>
     * <ul>
     * <li><p><code>COST_OPTIMIZED</code>: The cost-optimized strategy.</p>
     * </li>
     * <li><p><code>PRIORITY</code>: The priority-based strategy.</p>
     * </li>
     * </ul>
     * <p>Default value: <code>PRIORITY</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>PRIORITY</p>
     */
    @NameInMap("NodeResizeStrategy")
    public String nodeResizeStrategy;

    /**
     * <p>The billing method of the node group. If you do not specify this parameter, the billing method of the cluster is used. Valid values:</p>
     * <ul>
     * <li><p><code>PayAsYouGo</code>: pay-as-you-go.</p>
     * </li>
     * <li><p><code>Subscription</code>: subscription.</p>
     * </li>
     * </ul>
     * <p>Default value: <code>PayAsYouGo</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>PayAsYouGo</p>
     */
    @NameInMap("PaymentType")
    public String paymentType;

    /**
     * <p>The private pool options. This parameter is effective only when you create pay-as-you-go instances.</p>
     */
    @NameInMap("PrivatePoolOptions")
    public PrivatePoolOptions privatePoolOptions;

    /**
     * <p>The bid prices for the preemptible instances. This parameter is effective only when <code>SpotStrategy</code> is set to <code>SpotWithPriceLimit</code>. You can specify up to 100 bid prices.</p>
     */
    @NameInMap("SpotBidPrices")
    public java.util.List<SpotBidPrice> spotBidPrices;

    /**
     * <p>If enabled, the auto scaling group attempts to create a new instance to replace a spot instance that is about to be reclaimed. This process is triggered when the auto scaling group receives a system message about the impending reclamation. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: The auto scaling group attempts to replace a spot instance that is about to be reclaimed.</p>
     * </li>
     * <li><p><code>false</code>: The auto scaling group does not attempt to replace a spot instance that is about to be reclaimed.</p>
     * </li>
     * </ul>
     * <p>Default value: <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SpotInstanceRemedy")
    public Boolean spotInstanceRemedy;

    /**
     * <p>The preemption strategy for preemptible instances. Valid values:</p>
     * <ul>
     * <li><p><code>NoSpot</code>: pay-as-you-go instances.</p>
     * </li>
     * <li><p><code>SpotWithPriceLimit</code>: preemptible instances with a user-defined maximum hourly price.</p>
     * </li>
     * <li><p><code>SpotAsPriceGo</code>: preemptible instances that are automatically bid at the pay-as-you-go price.</p>
     * </li>
     * </ul>
     * <p>Default value: <code>NoSpot</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>NoSpot</p>
     */
    @NameInMap("SpotStrategy")
    public String spotStrategy;

    /**
     * <p>The subscription settings of the node group. If you do not specify this parameter, the subscription settings of the cluster are used.</p>
     */
    @NameInMap("SubscriptionConfig")
    public SubscriptionConfig subscriptionConfig;

    /**
     * <p>The system disk.</p>
     */
    @NameInMap("SystemDisk")
    public SystemDisk systemDisk;

    /**
     * <p>The vSwitch IDs. You can specify 1 to 20 vSwitch IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;vsw-hp35g7ya5ymw68mmg****&quot;]</p>
     */
    @NameInMap("VSwitchIds")
    public java.util.List<String> vSwitchIds;

    /**
     * <p>Specifies whether to assign a public IP address to the instances. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: Assigns a public IP address.</p>
     * </li>
     * <li><p><code>false</code>: Does not assign a public IP address.</p>
     * </li>
     * </ul>
     * <p>Default value: <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("WithPublicIp")
    public Boolean withPublicIp;

    public static NodeGroupConfig build(java.util.Map<String, ?> map) throws Exception {
        NodeGroupConfig self = new NodeGroupConfig();
        return TeaModel.build(map, self);
    }

    public NodeGroupConfig setAdditionalSecurityGroupIds(java.util.List<String> additionalSecurityGroupIds) {
        this.additionalSecurityGroupIds = additionalSecurityGroupIds;
        return this;
    }
    public java.util.List<String> getAdditionalSecurityGroupIds() {
        return this.additionalSecurityGroupIds;
    }

    public NodeGroupConfig setAutoScalingPolicy(AutoScalingPolicy autoScalingPolicy) {
        this.autoScalingPolicy = autoScalingPolicy;
        return this;
    }
    public AutoScalingPolicy getAutoScalingPolicy() {
        return this.autoScalingPolicy;
    }

    public NodeGroupConfig setCompensateWithOnDemand(Boolean compensateWithOnDemand) {
        this.compensateWithOnDemand = compensateWithOnDemand;
        return this;
    }
    public Boolean getCompensateWithOnDemand() {
        return this.compensateWithOnDemand;
    }

    public NodeGroupConfig setComponentTags(java.util.List<String> componentTags) {
        this.componentTags = componentTags;
        return this;
    }
    public java.util.List<String> getComponentTags() {
        return this.componentTags;
    }

    public NodeGroupConfig setCostOptimizedConfig(CostOptimizedConfig costOptimizedConfig) {
        this.costOptimizedConfig = costOptimizedConfig;
        return this;
    }
    public CostOptimizedConfig getCostOptimizedConfig() {
        return this.costOptimizedConfig;
    }

    public NodeGroupConfig setDataDisks(java.util.List<DataDisk> dataDisks) {
        this.dataDisks = dataDisks;
        return this;
    }
    public java.util.List<DataDisk> getDataDisks() {
        return this.dataDisks;
    }

    public NodeGroupConfig setDeploymentSetStrategy(String deploymentSetStrategy) {
        this.deploymentSetStrategy = deploymentSetStrategy;
        return this;
    }
    public String getDeploymentSetStrategy() {
        return this.deploymentSetStrategy;
    }

    public NodeGroupConfig setGracefulShutdown(Boolean gracefulShutdown) {
        this.gracefulShutdown = gracefulShutdown;
        return this;
    }
    public Boolean getGracefulShutdown() {
        return this.gracefulShutdown;
    }

    public NodeGroupConfig setInstanceTypes(java.util.List<String> instanceTypes) {
        this.instanceTypes = instanceTypes;
        return this;
    }
    public java.util.List<String> getInstanceTypes() {
        return this.instanceTypes;
    }

    public NodeGroupConfig setNodeCount(Integer nodeCount) {
        this.nodeCount = nodeCount;
        return this;
    }
    public Integer getNodeCount() {
        return this.nodeCount;
    }

    public NodeGroupConfig setNodeGroupName(String nodeGroupName) {
        this.nodeGroupName = nodeGroupName;
        return this;
    }
    public String getNodeGroupName() {
        return this.nodeGroupName;
    }

    public NodeGroupConfig setNodeGroupType(String nodeGroupType) {
        this.nodeGroupType = nodeGroupType;
        return this;
    }
    public String getNodeGroupType() {
        return this.nodeGroupType;
    }

    public NodeGroupConfig setNodeResizeStrategy(String nodeResizeStrategy) {
        this.nodeResizeStrategy = nodeResizeStrategy;
        return this;
    }
    public String getNodeResizeStrategy() {
        return this.nodeResizeStrategy;
    }

    public NodeGroupConfig setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public String getPaymentType() {
        return this.paymentType;
    }

    public NodeGroupConfig setPrivatePoolOptions(PrivatePoolOptions privatePoolOptions) {
        this.privatePoolOptions = privatePoolOptions;
        return this;
    }
    public PrivatePoolOptions getPrivatePoolOptions() {
        return this.privatePoolOptions;
    }

    public NodeGroupConfig setSpotBidPrices(java.util.List<SpotBidPrice> spotBidPrices) {
        this.spotBidPrices = spotBidPrices;
        return this;
    }
    public java.util.List<SpotBidPrice> getSpotBidPrices() {
        return this.spotBidPrices;
    }

    public NodeGroupConfig setSpotInstanceRemedy(Boolean spotInstanceRemedy) {
        this.spotInstanceRemedy = spotInstanceRemedy;
        return this;
    }
    public Boolean getSpotInstanceRemedy() {
        return this.spotInstanceRemedy;
    }

    public NodeGroupConfig setSpotStrategy(String spotStrategy) {
        this.spotStrategy = spotStrategy;
        return this;
    }
    public String getSpotStrategy() {
        return this.spotStrategy;
    }

    public NodeGroupConfig setSubscriptionConfig(SubscriptionConfig subscriptionConfig) {
        this.subscriptionConfig = subscriptionConfig;
        return this;
    }
    public SubscriptionConfig getSubscriptionConfig() {
        return this.subscriptionConfig;
    }

    public NodeGroupConfig setSystemDisk(SystemDisk systemDisk) {
        this.systemDisk = systemDisk;
        return this;
    }
    public SystemDisk getSystemDisk() {
        return this.systemDisk;
    }

    public NodeGroupConfig setVSwitchIds(java.util.List<String> vSwitchIds) {
        this.vSwitchIds = vSwitchIds;
        return this;
    }
    public java.util.List<String> getVSwitchIds() {
        return this.vSwitchIds;
    }

    public NodeGroupConfig setWithPublicIp(Boolean withPublicIp) {
        this.withPublicIp = withPublicIp;
        return this;
    }
    public Boolean getWithPublicIp() {
        return this.withPublicIp;
    }

}
