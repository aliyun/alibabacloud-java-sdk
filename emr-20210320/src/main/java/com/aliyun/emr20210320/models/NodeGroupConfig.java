// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class NodeGroupConfig extends TeaModel {
    @NameInMap("AdditionalSecurityGroupIds")
    public java.util.List<String> additionalSecurityGroupIds;

    @NameInMap("CostOptimizedConfig")
    public CostOptimizedConfig costOptimizedConfig;

    @NameInMap("DataDisks")
    public java.util.List<DataDisk> dataDisks;

    @NameInMap("DeploymentSetStrategy")
    public String deploymentSetStrategy;

    @NameInMap("GracefulShutdown")
    public Boolean gracefulShutdown;

    @NameInMap("InstanceTypes")
    public java.util.List<String> instanceTypes;

    @NameInMap("NodeCount")
    public Integer nodeCount;

    @NameInMap("NodeGroupName")
    public String nodeGroupName;

    @NameInMap("NodeGroupType")
    public String nodeGroupType;

    @NameInMap("NodeResizeStrategy")
    public String nodeResizeStrategy;

    @NameInMap("PaymentType")
    public String paymentType;

    @NameInMap("SpotBidPrices")
    public java.util.List<SpotBidPrice> spotBidPrices;

    @NameInMap("SpotInstanceRemedy")
    public Boolean spotInstanceRemedy;

    @NameInMap("SpotStrategy")
    public String spotStrategy;

    @NameInMap("SubscriptionConfig")
    public SubscriptionConfig subscriptionConfig;

    @NameInMap("SystemDisk")
    public SystemDisk systemDisk;

    @NameInMap("VSwitchIds")
    public java.util.List<String> vSwitchIds;

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
