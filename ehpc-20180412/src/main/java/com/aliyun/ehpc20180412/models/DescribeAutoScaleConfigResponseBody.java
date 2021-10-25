// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DescribeAutoScaleConfigResponseBody extends TeaModel {
    @NameInMap("MaxNodesInCluster")
    public Integer maxNodesInCluster;

    @NameInMap("GrowTimeoutInMinutes")
    public Integer growTimeoutInMinutes;

    @NameInMap("SpotStrategy")
    public String spotStrategy;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("EnableAutoShrink")
    public Boolean enableAutoShrink;

    @NameInMap("ClusterType")
    public String clusterType;

    @NameInMap("EnableAutoGrow")
    public Boolean enableAutoGrow;

    @NameInMap("ExcludeNodes")
    public String excludeNodes;

    @NameInMap("GrowIntervalInMinutes")
    public Integer growIntervalInMinutes;

    @NameInMap("ShrinkIntervalInMinutes")
    public Integer shrinkIntervalInMinutes;

    @NameInMap("SpotPriceLimit")
    public String spotPriceLimit;

    @NameInMap("ShrinkIdleTimes")
    public Integer shrinkIdleTimes;

    @NameInMap("ExtraNodesGrowRatio")
    public Integer extraNodesGrowRatio;

    @NameInMap("GrowRatio")
    public Integer growRatio;

    @NameInMap("Uid")
    public String uid;

    @NameInMap("ClusterId")
    public String clusterId;

    public static DescribeAutoScaleConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutoScaleConfigResponseBody self = new DescribeAutoScaleConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAutoScaleConfigResponseBody setMaxNodesInCluster(Integer maxNodesInCluster) {
        this.maxNodesInCluster = maxNodesInCluster;
        return this;
    }
    public Integer getMaxNodesInCluster() {
        return this.maxNodesInCluster;
    }

    public DescribeAutoScaleConfigResponseBody setGrowTimeoutInMinutes(Integer growTimeoutInMinutes) {
        this.growTimeoutInMinutes = growTimeoutInMinutes;
        return this;
    }
    public Integer getGrowTimeoutInMinutes() {
        return this.growTimeoutInMinutes;
    }

    public DescribeAutoScaleConfigResponseBody setSpotStrategy(String spotStrategy) {
        this.spotStrategy = spotStrategy;
        return this;
    }
    public String getSpotStrategy() {
        return this.spotStrategy;
    }

    public DescribeAutoScaleConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAutoScaleConfigResponseBody setEnableAutoShrink(Boolean enableAutoShrink) {
        this.enableAutoShrink = enableAutoShrink;
        return this;
    }
    public Boolean getEnableAutoShrink() {
        return this.enableAutoShrink;
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

    public DescribeAutoScaleConfigResponseBody setExcludeNodes(String excludeNodes) {
        this.excludeNodes = excludeNodes;
        return this;
    }
    public String getExcludeNodes() {
        return this.excludeNodes;
    }

    public DescribeAutoScaleConfigResponseBody setGrowIntervalInMinutes(Integer growIntervalInMinutes) {
        this.growIntervalInMinutes = growIntervalInMinutes;
        return this;
    }
    public Integer getGrowIntervalInMinutes() {
        return this.growIntervalInMinutes;
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

    public DescribeAutoScaleConfigResponseBody setShrinkIdleTimes(Integer shrinkIdleTimes) {
        this.shrinkIdleTimes = shrinkIdleTimes;
        return this;
    }
    public Integer getShrinkIdleTimes() {
        return this.shrinkIdleTimes;
    }

    public DescribeAutoScaleConfigResponseBody setExtraNodesGrowRatio(Integer extraNodesGrowRatio) {
        this.extraNodesGrowRatio = extraNodesGrowRatio;
        return this;
    }
    public Integer getExtraNodesGrowRatio() {
        return this.extraNodesGrowRatio;
    }

    public DescribeAutoScaleConfigResponseBody setGrowRatio(Integer growRatio) {
        this.growRatio = growRatio;
        return this;
    }
    public Integer getGrowRatio() {
        return this.growRatio;
    }

    public DescribeAutoScaleConfigResponseBody setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

    public DescribeAutoScaleConfigResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}
