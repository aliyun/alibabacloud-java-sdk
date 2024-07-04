// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class NodeGroupConfig extends TeaModel {
    /**
     * <p>附加安全组。除集群设置的安全组外，为节点组单独设置的附加安全组。数组元数个数N的取值范围：0~2。</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;sg-hp3abbae8lb6lmb1****&quot;]</p>
     */
    @NameInMap("AdditionalSecurityGroupIds")
    public java.util.List<String> additionalSecurityGroupIds;

    @NameInMap("ComponentTags")
    public java.util.List<String> componentTags;

    /**
     * <p>成本优化模式配置。</p>
     */
    @NameInMap("CostOptimizedConfig")
    public CostOptimizedConfig costOptimizedConfig;

    /**
     * <p>数据盘。当前数据盘只支持一种磁盘类型，即数组元数个数N的取值范围：1~1。</p>
     */
    @NameInMap("DataDisks")
    public java.util.List<DataDisk> dataDisks;

    /**
     * <p>部署集策略。取值范围：</p>
     * <ul>
     * <li>NONE：不适用部署集。</li>
     * <li>CLUSTER：使用集群级别部署集。</li>
     * <li>NODE_GROUP：使用节点组级别部署集。</li>
     * </ul>
     * <p>默认值：NONE。</p>
     * 
     * <strong>example:</strong>
     * <p>NONE</p>
     */
    @NameInMap("DeploymentSetStrategy")
    public String deploymentSetStrategy;

    /**
     * <p>节点组上部署的组件是否开启优雅下线。取值范围：</p>
     * <ul>
     * <li>true：开启优雅下线。</li>
     * <li>false：不开启优雅下线。</li>
     * </ul>
     * <p>默认值：false。</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("GracefulShutdown")
    public Boolean gracefulShutdown;

    /**
     * <p>节点实例类型列表。数组元数个数N的取值范围：1~100。</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;ecs.g6.xlarge&quot;]</p>
     */
    @NameInMap("InstanceTypes")
    public java.util.List<String> instanceTypes;

    /**
     * <p>节点数量。取值范围：1~1000。</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("NodeCount")
    public Integer nodeCount;

    /**
     * <p>节点组名称。最大长度128个字符。集群内要求节点组名称唯一。</p>
     * 
     * <strong>example:</strong>
     * <p>core-1</p>
     */
    @NameInMap("NodeGroupName")
    public String nodeGroupName;

    /**
     * <p>节点组类型。取值范围：</p>
     * <ul>
     * <li>MASTER：管理类型节点组。</li>
     * <li>CORE：存储类型节点组。</li>
     * <li>TASK：计算类型节点组。</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CORE</p>
     */
    @NameInMap("NodeGroupType")
    public String nodeGroupType;

    /**
     * <p>节点扩容策略。取值范围：</p>
     * <ul>
     * <li>COST_OPTIMIZED：成本优化策略。</li>
     * <li>PRIORITY：优先级策略。</li>
     * </ul>
     * <p>默认值：PRIORITY。</p>
     * 
     * <strong>example:</strong>
     * <p>PRIORITY</p>
     */
    @NameInMap("NodeResizeStrategy")
    public String nodeResizeStrategy;

    /**
     * <p>节点组付费类型。不传入时默认和集群付费类型一致。取值范围：</p>
     * <ul>
     * <li>PayAsYouGo：后付费，按量付费。</li>
     * <li>Subscription：预付费，包年包月。</li>
     * </ul>
     * <p>默认值：PayAsYouGo。</p>
     * 
     * <strong>example:</strong>
     * <p>PayAsYouGo</p>
     */
    @NameInMap("PaymentType")
    public String paymentType;

    /**
     * <p>抢占式Spot实例出价价格。参数SpotStrategy取值为SpotWithPriceLimit时生效。数组元数个数N的取值范围：0~100。</p>
     */
    @NameInMap("SpotBidPrices")
    public java.util.List<SpotBidPrice> spotBidPrices;

    /**
     * <p>开启后，当收到抢占式实例将被回收的系统消息时，伸缩组将尝试创建新的实例，替换掉将被回收的抢占式实例。取值范围：</p>
     * <ul>
     * <li>true：开启补齐抢占式实例。</li>
     * <li>false：不开启补齐抢占式实例。</li>
     * </ul>
     * <p>默认值：false。</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SpotInstanceRemedy")
    public Boolean spotInstanceRemedy;

    /**
     * <p>抢占式Spot实例策略。取值范围：</p>
     * <ul>
     * <li>NoSpot：正常按量付费实例。</li>
     * <li>SpotWithPriceLimit：设置最高出价的抢占式实例。</li>
     * <li>SpotAsPriceGo：系统自动出价，最高按量付费价格的抢占式实例。</li>
     * </ul>
     * <p>默认值：NoSpot。</p>
     * 
     * <strong>example:</strong>
     * <p>NoSpot</p>
     */
    @NameInMap("SpotStrategy")
    public String spotStrategy;

    /**
     * <p>节点组预付费配置。不传入时默认和集群预付费配置一致。</p>
     */
    @NameInMap("SubscriptionConfig")
    public SubscriptionConfig subscriptionConfig;

    /**
     * <p>系统盘。</p>
     */
    @NameInMap("SystemDisk")
    public SystemDisk systemDisk;

    /**
     * <p>虚拟机交换机ID列表。数组元数个数N的取值范围：1~20。</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;vsw-hp35g7ya5ymw68mmg****&quot;]</p>
     */
    @NameInMap("VSwitchIds")
    public java.util.List<String> vSwitchIds;

    /**
     * <p>是否开公网IP。取值范围：</p>
     * <ul>
     * <li>true：开公网。</li>
     * <li>false：不开公网。</li>
     * </ul>
     * <p>默认值：false。</p>
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
