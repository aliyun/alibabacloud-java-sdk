// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class UpdateNodeGroupAttributesRequest extends TeaModel {
    /**
     * <p>The ACK cluster configuration.</p>
     */
    @NameInMap("AckConfig")
    public AckConfig ackConfig;

    /**
     * <p>The list of security group IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;sg-hp3abbae8lb6lmb1****&quot;]</p>
     */
    @NameInMap("AdditionalSecurityGroupIds")
    @Deprecated
    public java.util.List<String> additionalSecurityGroupIds;

    /**
     * <p>The automatic compensation state.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoCompensateState")
    public Boolean autoCompensateState;

    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c-b933c5aac8fe****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The cost-optimized mode configuration.</p>
     */
    @NameInMap("CostOptimizedConfig")
    public CostOptimizedConfig costOptimizedConfig;

    /**
     * <p>The node group description.</p>
     * 
     * <strong>example:</strong>
     * <p>emr-core-1</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The spot instance strategy.</p>
     * 
     * <strong>example:</strong>
     * <p>SpotWithPriceLimit</p>
     */
    @NameInMap("EcsSpotStrategy")
    public String ecsSpotStrategy;

    /**
     * <p>Specifies whether to enable graceful decommission. When a cluster is created in V303, graceful decommission is disabled by default for task groups.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableGracefulDecommission")
    public Boolean enableGracefulDecommission;

    /**
     * <p>The list of ECS instance types.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("InstanceTypeList")
    public java.util.List<String> instanceTypeList;

    /**
     * <p>The key pair for ECS logon.</p>
     * 
     * <strong>example:</strong>
     * <p>test_pair</p>
     */
    @NameInMap("KeyPairName")
    @Deprecated
    public String keyPairName;

    /**
     * <p>The maximum number of instances in the node group.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("MaxSize")
    public Integer maxSize;

    /**
     * <p>The minimum number of instances in the node group.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("MinSize")
    public Integer minSize;

    /**
     * <p>The target number of nodes in the node group.</p>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("NodeCount")
    public Integer nodeCount;

    /**
     * <p>The node group ID.</p>
     * <p>This parameter is required.</p>
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
     * <p>CORE1</p>
     */
    @NameInMap("NodeGroupName")
    public String nodeGroupName;

    /**
     * <p>The node scale-out strategy. Valid values: COST_OPTIMIZED and PRIORITY. Default value: PRIORITY.</p>
     * 
     * <strong>example:</strong>
     * <p>PRIORITY</p>
     */
    @NameInMap("NodeResizeStrategy")
    public String nodeResizeStrategy;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The maximum bid prices for spot instances. This parameter takes effect only when spotStrategy is set to SpotWithPriceLimit.</p>
     */
    @NameInMap("SpotBidPrices")
    public java.util.List<SpotBidPrice> spotBidPrices;

    /**
     * <p>Specifies whether to enable spot instance supplementation. If this feature is enabled, the scaling group attempts to create new instances to replace spot instances that are about to be reclaimed when the system sends a reclamation notification. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SpotInstanceRemedy")
    public Boolean spotInstanceRemedy;

    /**
     * <p>The vSwitch ID.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-hp35g7ya5ymw68mmg****</p>
     */
    @NameInMap("VSwitchId")
    @Deprecated
    public String vSwitchId;

    public static UpdateNodeGroupAttributesRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateNodeGroupAttributesRequest self = new UpdateNodeGroupAttributesRequest();
        return TeaModel.build(map, self);
    }

    public UpdateNodeGroupAttributesRequest setAckConfig(AckConfig ackConfig) {
        this.ackConfig = ackConfig;
        return this;
    }
    public AckConfig getAckConfig() {
        return this.ackConfig;
    }

    @Deprecated
    public UpdateNodeGroupAttributesRequest setAdditionalSecurityGroupIds(java.util.List<String> additionalSecurityGroupIds) {
        this.additionalSecurityGroupIds = additionalSecurityGroupIds;
        return this;
    }
    public java.util.List<String> getAdditionalSecurityGroupIds() {
        return this.additionalSecurityGroupIds;
    }

    public UpdateNodeGroupAttributesRequest setAutoCompensateState(Boolean autoCompensateState) {
        this.autoCompensateState = autoCompensateState;
        return this;
    }
    public Boolean getAutoCompensateState() {
        return this.autoCompensateState;
    }

    public UpdateNodeGroupAttributesRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UpdateNodeGroupAttributesRequest setCostOptimizedConfig(CostOptimizedConfig costOptimizedConfig) {
        this.costOptimizedConfig = costOptimizedConfig;
        return this;
    }
    public CostOptimizedConfig getCostOptimizedConfig() {
        return this.costOptimizedConfig;
    }

    public UpdateNodeGroupAttributesRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateNodeGroupAttributesRequest setEcsSpotStrategy(String ecsSpotStrategy) {
        this.ecsSpotStrategy = ecsSpotStrategy;
        return this;
    }
    public String getEcsSpotStrategy() {
        return this.ecsSpotStrategy;
    }

    public UpdateNodeGroupAttributesRequest setEnableGracefulDecommission(Boolean enableGracefulDecommission) {
        this.enableGracefulDecommission = enableGracefulDecommission;
        return this;
    }
    public Boolean getEnableGracefulDecommission() {
        return this.enableGracefulDecommission;
    }

    public UpdateNodeGroupAttributesRequest setInstanceTypeList(java.util.List<String> instanceTypeList) {
        this.instanceTypeList = instanceTypeList;
        return this;
    }
    public java.util.List<String> getInstanceTypeList() {
        return this.instanceTypeList;
    }

    @Deprecated
    public UpdateNodeGroupAttributesRequest setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }
    public String getKeyPairName() {
        return this.keyPairName;
    }

    public UpdateNodeGroupAttributesRequest setMaxSize(Integer maxSize) {
        this.maxSize = maxSize;
        return this;
    }
    public Integer getMaxSize() {
        return this.maxSize;
    }

    public UpdateNodeGroupAttributesRequest setMinSize(Integer minSize) {
        this.minSize = minSize;
        return this;
    }
    public Integer getMinSize() {
        return this.minSize;
    }

    public UpdateNodeGroupAttributesRequest setNodeCount(Integer nodeCount) {
        this.nodeCount = nodeCount;
        return this;
    }
    public Integer getNodeCount() {
        return this.nodeCount;
    }

    public UpdateNodeGroupAttributesRequest setNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
        return this;
    }
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    public UpdateNodeGroupAttributesRequest setNodeGroupName(String nodeGroupName) {
        this.nodeGroupName = nodeGroupName;
        return this;
    }
    public String getNodeGroupName() {
        return this.nodeGroupName;
    }

    public UpdateNodeGroupAttributesRequest setNodeResizeStrategy(String nodeResizeStrategy) {
        this.nodeResizeStrategy = nodeResizeStrategy;
        return this;
    }
    public String getNodeResizeStrategy() {
        return this.nodeResizeStrategy;
    }

    public UpdateNodeGroupAttributesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateNodeGroupAttributesRequest setSpotBidPrices(java.util.List<SpotBidPrice> spotBidPrices) {
        this.spotBidPrices = spotBidPrices;
        return this;
    }
    public java.util.List<SpotBidPrice> getSpotBidPrices() {
        return this.spotBidPrices;
    }

    public UpdateNodeGroupAttributesRequest setSpotInstanceRemedy(Boolean spotInstanceRemedy) {
        this.spotInstanceRemedy = spotInstanceRemedy;
        return this;
    }
    public Boolean getSpotInstanceRemedy() {
        return this.spotInstanceRemedy;
    }

    @Deprecated
    public UpdateNodeGroupAttributesRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

}
