// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class NodeGroup extends TeaModel {
    /**
     * <p>安全组ID。</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;sg-hp3abbae8lb6lmb1****&quot;]</p>
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
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("GracefulShutdown")
    public Boolean gracefulShutdown;

    /**
     * <p>实例类型列表。</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;ecs.g6.4xlarge&quot;]</p>
     */
    @NameInMap("InstanceTypes")
    public java.util.List<String> instanceTypes;

    /**
     * <p>节点组ID。</p>
     * 
     * <strong>example:</strong>
     * <p>ng-869471354ecd****</p>
     */
    @NameInMap("NodeGroupId")
    public String nodeGroupId;

    /**
     * <p>节点组名称。最大长度128个字符。</p>
     * 
     * <strong>example:</strong>
     * <p>core-1</p>
     */
    @NameInMap("NodeGroupName")
    public String nodeGroupName;

    /**
     * <p>节点组状态。</p>
     * 
     * <strong>example:</strong>
     * <p>CREATED</p>
     */
    @NameInMap("NodeGroupState")
    public String nodeGroupState;

    /**
     * <p>节点组类型。取值范围：</p>
     * <ul>
     * <li>MASTER：管理类型节点组。</li>
     * <li>CORE：存储类型节点组。</li>
     * <li>TASK：计算类型节点组。</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CORE</p>
     */
    @NameInMap("NodeGroupType")
    public String nodeGroupType;

    /**
     * <ul>
     * <li>COST_OPTIMIZED：成本优化策略。</li>
     * <li>PRIORITY：优先级策略。</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PRIORITY</p>
     */
    @NameInMap("NodeResizeStrategy")
    public String nodeResizeStrategy;

    /**
     * <p>节点组付费类型。取值范围：</p>
     * <ul>
     * <li>PayAsYouGo：后付费，按量付费。</li>
     * <li>Subscription：预付费，包年包月。</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PayAsYouGo</p>
     */
    @NameInMap("PaymentType")
    public String paymentType;

    /**
     * <p>存活节点数量。</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("RunningNodeCount")
    public Integer runningNodeCount;

    @NameInMap("SpotBidPrices")
    public java.util.List<SpotBidPrice> spotBidPrices;

    /**
     * <p>开启补齐抢占式实例后，当收到抢占式实例将被回收的系统消息时，伸缩组将尝试创建新的实例，替换掉将被回收的抢占式实例。取值范围：</p>
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
     * <p>是否支持竞价实例。</p>
     * 
     * <strong>example:</strong>
     * <p>NoSpot</p>
     */
    @NameInMap("SpotStrategy")
    public String spotStrategy;

    /**
     * <p>状态变化原因。</p>
     */
    @NameInMap("StateChangeReason")
    public NodeGroupStateChangeReason stateChangeReason;

    /**
     * <p>节点组状态，NodeGroupState别名。</p>
     * 
     * <strong>example:</strong>
     * <p>CREATED</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>系统盘信息。</p>
     */
    @NameInMap("SystemDisk")
    public SystemDisk systemDisk;

    /**
     * <p>虚拟机交换机ID列表。</p>
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
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("WithPublicIp")
    public Boolean withPublicIp;

    /**
     * <p>可用区ID。</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing-h</p>
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
