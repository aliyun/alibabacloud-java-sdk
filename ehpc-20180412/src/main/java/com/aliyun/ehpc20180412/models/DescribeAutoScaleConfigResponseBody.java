// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DescribeAutoScaleConfigResponseBody extends TeaModel {
    /**
     * <p>The ID of the associated cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>ehpc-hz-FYUr32****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The type of the scheduler. Valid values:</p>
     * <ul>
     * <li>pbs</li>
     * <li>slurm</li>
     * <li>opengridscheduler</li>
     * <li>deadline</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>slurm</p>
     */
    @NameInMap("ClusterType")
    public String clusterType;

    /**
     * <p>Specifies whether to enable auto scale-out.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableAutoGrow")
    public Boolean enableAutoGrow;

    /**
     * <p>Specifies whether to enable auto scale-in.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableAutoShrink")
    public Boolean enableAutoShrink;

    /**
     * <p>The list of nodes on which auto scaling is not enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp19lgqwxb4206t5****,i-bp1g4hvzs9pywrhb****</p>
     */
    @NameInMap("ExcludeNodes")
    public String excludeNodes;

    /**
     * <p>The percentage of extra compute nodes. Valid values: 0 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ExtraNodesGrowRatio")
    public Integer extraNodesGrowRatio;

    /**
     * <p>The interval between two consecutive rounds of scale-in. Valid values: 2 to 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("GrowIntervalInMinutes")
    public Integer growIntervalInMinutes;

    /**
     * <p>The percentage of each round of scale-out. Valid values: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("GrowRatio")
    public Integer growRatio;

    /**
     * <p>The timeout period before the scale-out nodes were started. Valid values: 10 to 60.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("GrowTimeoutInMinutes")
    public Integer growTimeoutInMinutes;

    /**
     * <p>The maximum number of compute nodes in the cluster. This parameter indicates the largest number of nodes that can be added to the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxNodesInCluster")
    public Integer maxNodesInCluster;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE73</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of consecutive idle times of a node during the resource shrink check. Valid values: 2 to 5.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("ShrinkIdleTimes")
    public Integer shrinkIdleTimes;

    /**
     * <p>The interval between two consecutive rounds of scale-out. Valid values: 2 to 10.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ShrinkIntervalInMinutes")
    public Integer shrinkIntervalInMinutes;

    /**
     * <p>The maximum hourly price of the new ECS instance. The value is accurate to three decimal places. It takes effect only when SpotStrategy is set to SpotWithPriceLimit.</p>
     * 
     * <strong>example:</strong>
     * <p>0.062</p>
     */
    @NameInMap("SpotPriceLimit")
    public String spotPriceLimit;

    /**
     * <p>The bidding method of the compute nodes. Valid values:</p>
     * <ul>
     * <li>NoSpot: The instances of the compute node are pay-as-you-go instances.</li>
     * <li>SpotWithPriceLimit: The instance is created as a preemptible instance with a user-defined maximum hourly price.</li>
     * <li>SpotAsPriceGo: The instance is a preemptible instance for which the market price at the time of purchase is automatically used as the bidding price.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NoSpot</p>
     */
    @NameInMap("SpotStrategy")
    public String spotStrategy;

    /**
     * <p>The user ID.</p>
     * 
     * <strong>example:</strong>
     * <p>testu****</p>
     */
    @NameInMap("Uid")
    public String uid;

    public static DescribeAutoScaleConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutoScaleConfigResponseBody self = new DescribeAutoScaleConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAutoScaleConfigResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeAutoScaleConfigResponseBody setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }
    public String getClusterType() {
        return this.clusterType;
    }

    public DescribeAutoScaleConfigResponseBody setEnableAutoGrow(Boolean enableAutoGrow) {
        this.enableAutoGrow = enableAutoGrow;
        return this;
    }
    public Boolean getEnableAutoGrow() {
        return this.enableAutoGrow;
    }

    public DescribeAutoScaleConfigResponseBody setEnableAutoShrink(Boolean enableAutoShrink) {
        this.enableAutoShrink = enableAutoShrink;
        return this;
    }
    public Boolean getEnableAutoShrink() {
        return this.enableAutoShrink;
    }

    public DescribeAutoScaleConfigResponseBody setExcludeNodes(String excludeNodes) {
        this.excludeNodes = excludeNodes;
        return this;
    }
    public String getExcludeNodes() {
        return this.excludeNodes;
    }

    public DescribeAutoScaleConfigResponseBody setExtraNodesGrowRatio(Integer extraNodesGrowRatio) {
        this.extraNodesGrowRatio = extraNodesGrowRatio;
        return this;
    }
    public Integer getExtraNodesGrowRatio() {
        return this.extraNodesGrowRatio;
    }

    public DescribeAutoScaleConfigResponseBody setGrowIntervalInMinutes(Integer growIntervalInMinutes) {
        this.growIntervalInMinutes = growIntervalInMinutes;
        return this;
    }
    public Integer getGrowIntervalInMinutes() {
        return this.growIntervalInMinutes;
    }

    public DescribeAutoScaleConfigResponseBody setGrowRatio(Integer growRatio) {
        this.growRatio = growRatio;
        return this;
    }
    public Integer getGrowRatio() {
        return this.growRatio;
    }

    public DescribeAutoScaleConfigResponseBody setGrowTimeoutInMinutes(Integer growTimeoutInMinutes) {
        this.growTimeoutInMinutes = growTimeoutInMinutes;
        return this;
    }
    public Integer getGrowTimeoutInMinutes() {
        return this.growTimeoutInMinutes;
    }

    public DescribeAutoScaleConfigResponseBody setMaxNodesInCluster(Integer maxNodesInCluster) {
        this.maxNodesInCluster = maxNodesInCluster;
        return this;
    }
    public Integer getMaxNodesInCluster() {
        return this.maxNodesInCluster;
    }

    public DescribeAutoScaleConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAutoScaleConfigResponseBody setShrinkIdleTimes(Integer shrinkIdleTimes) {
        this.shrinkIdleTimes = shrinkIdleTimes;
        return this;
    }
    public Integer getShrinkIdleTimes() {
        return this.shrinkIdleTimes;
    }

    public DescribeAutoScaleConfigResponseBody setShrinkIntervalInMinutes(Integer shrinkIntervalInMinutes) {
        this.shrinkIntervalInMinutes = shrinkIntervalInMinutes;
        return this;
    }
    public Integer getShrinkIntervalInMinutes() {
        return this.shrinkIntervalInMinutes;
    }

    public DescribeAutoScaleConfigResponseBody setSpotPriceLimit(String spotPriceLimit) {
        this.spotPriceLimit = spotPriceLimit;
        return this;
    }
    public String getSpotPriceLimit() {
        return this.spotPriceLimit;
    }

    public DescribeAutoScaleConfigResponseBody setSpotStrategy(String spotStrategy) {
        this.spotStrategy = spotStrategy;
        return this;
    }
    public String getSpotStrategy() {
        return this.spotStrategy;
    }

    public DescribeAutoScaleConfigResponseBody setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

}
