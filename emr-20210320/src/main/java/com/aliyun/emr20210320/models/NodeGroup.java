// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class NodeGroup extends TeaModel {
    /**
     * <p>安全组ID。</p>
     */
    @NameInMap("AdditionalSecurityGroupIds")
    public java.util.List<String> additionalSecurityGroupIds;

    /**
     * <p>成本优化模式配置。</p>
     */
    @NameInMap("CostOptimizedConfig")
    public CostOptimizedConfig costOptimizedConfig;

    /**
     * <p>数据盘列表。</p>
     */
    @NameInMap("DataDisks")
    public java.util.List<DataDisk> dataDisks;

    /**
     * <p>部署集策略。取值范围：</p>
     * <p>- NONE：不适用部署集。</p>
     * <p>- CLUSTER：使用集群级别部署集。</p>
     * <p>- NODE_GROUP：使用节点组级别部署集。</p>
     * <br>
     * <p>默认值：NONE。</p>
     */
    @NameInMap("DeploymentSetStrategy")
    public String deploymentSetStrategy;

    /**
     * <p>节点组上部署的组件是否开启优雅下线。取值范围：</p>
     * <p>- true：开启优雅下线。</p>
     * <p>- false：不开启优雅下线。</p>
     */
    @NameInMap("GracefulShutdown")
    public Boolean gracefulShutdown;

    /**
     * <p>实例类型列表。</p>
     */
    @NameInMap("InstanceTypes")
    public java.util.List<String> instanceTypes;

    /**
     * <p>节点组ID。</p>
     */
    @NameInMap("NodeGroupId")
    public String nodeGroupId;

    /**
     * <p>节点组名称。最大长度128个字符。</p>
     */
    @NameInMap("NodeGroupName")
    public String nodeGroupName;

    /**
     * <p>节点组状态。</p>
     */
    @NameInMap("NodeGroupState")
    public String nodeGroupState;

    /**
     * <p>节点组类型。取值范围：</p>
     * <p>- MASTER：管理类型节点组。</p>
     * <p>- CORE：存储类型节点组。</p>
     * <p>- TASK：计算类型节点组。</p>
     */
    @NameInMap("NodeGroupType")
    public String nodeGroupType;

    /**
     * <p>- COST_OPTIMIZED：成本优化策略。</p>
     * <p>- PRIORITY：优先级策略。</p>
     */
    @NameInMap("NodeResizeStrategy")
    public String nodeResizeStrategy;

    /**
     * <p>节点组付费类型。取值范围：</p>
     * <p>- PayAsYouGo：后付费，按量付费。</p>
     * <p>- Subscription：预付费，包年包月。</p>
     */
    @NameInMap("PaymentType")
    public String paymentType;

    /**
     * <p>存活节点数量。</p>
     */
    @NameInMap("RunningNodeCount")
    public Integer runningNodeCount;

    @NameInMap("SpotBidPrices")
    public java.util.List<SpotBidPrice> spotBidPrices;

    /**
     * <p>开启补齐抢占式实例后，当收到抢占式实例将被回收的系统消息时，伸缩组将尝试创建新的实例，替换掉将被回收的抢占式实例。取值范围：</p>
     * <p>- true：开启补齐抢占式实例。</p>
     * <p>- false：不开启补齐抢占式实例。</p>
     * <br>
     * <p>默认值：false。</p>
     */
    @NameInMap("SpotInstanceRemedy")
    public Boolean spotInstanceRemedy;

    /**
     * <p>是否支持竞价实例。</p>
     */
    @NameInMap("SpotStrategy")
    public String spotStrategy;

    /**
     * <p>状态变化原因。</p>
     */
    @NameInMap("StateChangeReason")
    public NodeGroupStateChangeReason stateChangeReason;

    /**
     * <p>系统盘信息。</p>
     */
    @NameInMap("SystemDisk")
    public SystemDisk systemDisk;

    /**
     * <p>虚拟机交换机ID列表。</p>
     */
    @NameInMap("VSwitchIds")
    public java.util.List<String> vSwitchIds;

    /**
     * <p>是否开公网IP。取值范围：</p>
     * <p>- true：开公网。</p>
     * <p>- false：不开公网。</p>
     */
    @NameInMap("WithPublicIp")
    public Boolean withPublicIp;

    /**
     * <p>可用区ID。</p>
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
