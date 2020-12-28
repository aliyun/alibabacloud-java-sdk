// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class GetAutoScaleConfigResponseBody extends TeaModel {
    @NameInMap("ExtraNodesGrowRatio")
    public Integer extraNodesGrowRatio;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("EnableAutoGrow")
    public Boolean enableAutoGrow;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("MaxNodesInCluster")
    public Integer maxNodesInCluster;

    @NameInMap("ShrinkIdleTimes")
    public Integer shrinkIdleTimes;

    @NameInMap("EnableAutoShrink")
    public Boolean enableAutoShrink;

    @NameInMap("ClusterType")
    public String clusterType;

    @NameInMap("GrowRatio")
    public Integer growRatio;

    @NameInMap("GrowIntervalInMinutes")
    public Integer growIntervalInMinutes;

    @NameInMap("Uid")
    public String uid;

    @NameInMap("GrowTimeoutInMinutes")
    public Integer growTimeoutInMinutes;

    @NameInMap("ImageId")
    public String imageId;

    @NameInMap("ShrinkIntervalInMinutes")
    public Integer shrinkIntervalInMinutes;

    @NameInMap("SpotPriceLimit")
    public Float spotPriceLimit;

    @NameInMap("Queues")
    public java.util.List<GetAutoScaleConfigResponseBodyQueues> queues;

    @NameInMap("ExcludeNodes")
    public String excludeNodes;

    @NameInMap("SpotStrategy")
    public String spotStrategy;

    public static GetAutoScaleConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAutoScaleConfigResponseBody self = new GetAutoScaleConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAutoScaleConfigResponseBody setExtraNodesGrowRatio(Integer extraNodesGrowRatio) {
        this.extraNodesGrowRatio = extraNodesGrowRatio;
        return this;
    }
    public Integer getExtraNodesGrowRatio() {
        return this.extraNodesGrowRatio;
    }

    public GetAutoScaleConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAutoScaleConfigResponseBody setEnableAutoGrow(Boolean enableAutoGrow) {
        this.enableAutoGrow = enableAutoGrow;
        return this;
    }
    public Boolean getEnableAutoGrow() {
        return this.enableAutoGrow;
    }

    public GetAutoScaleConfigResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetAutoScaleConfigResponseBody setMaxNodesInCluster(Integer maxNodesInCluster) {
        this.maxNodesInCluster = maxNodesInCluster;
        return this;
    }
    public Integer getMaxNodesInCluster() {
        return this.maxNodesInCluster;
    }

    public GetAutoScaleConfigResponseBody setShrinkIdleTimes(Integer shrinkIdleTimes) {
        this.shrinkIdleTimes = shrinkIdleTimes;
        return this;
    }
    public Integer getShrinkIdleTimes() {
        return this.shrinkIdleTimes;
    }

    public GetAutoScaleConfigResponseBody setEnableAutoShrink(Boolean enableAutoShrink) {
        this.enableAutoShrink = enableAutoShrink;
        return this;
    }
    public Boolean getEnableAutoShrink() {
        return this.enableAutoShrink;
    }

    public GetAutoScaleConfigResponseBody setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }
    public String getClusterType() {
        return this.clusterType;
    }

    public GetAutoScaleConfigResponseBody setGrowRatio(Integer growRatio) {
        this.growRatio = growRatio;
        return this;
    }
    public Integer getGrowRatio() {
        return this.growRatio;
    }

    public GetAutoScaleConfigResponseBody setGrowIntervalInMinutes(Integer growIntervalInMinutes) {
        this.growIntervalInMinutes = growIntervalInMinutes;
        return this;
    }
    public Integer getGrowIntervalInMinutes() {
        return this.growIntervalInMinutes;
    }

    public GetAutoScaleConfigResponseBody setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

    public GetAutoScaleConfigResponseBody setGrowTimeoutInMinutes(Integer growTimeoutInMinutes) {
        this.growTimeoutInMinutes = growTimeoutInMinutes;
        return this;
    }
    public Integer getGrowTimeoutInMinutes() {
        return this.growTimeoutInMinutes;
    }

    public GetAutoScaleConfigResponseBody setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public GetAutoScaleConfigResponseBody setShrinkIntervalInMinutes(Integer shrinkIntervalInMinutes) {
        this.shrinkIntervalInMinutes = shrinkIntervalInMinutes;
        return this;
    }
    public Integer getShrinkIntervalInMinutes() {
        return this.shrinkIntervalInMinutes;
    }

    public GetAutoScaleConfigResponseBody setSpotPriceLimit(Float spotPriceLimit) {
        this.spotPriceLimit = spotPriceLimit;
        return this;
    }
    public Float getSpotPriceLimit() {
        return this.spotPriceLimit;
    }

    public GetAutoScaleConfigResponseBody setQueues(java.util.List<GetAutoScaleConfigResponseBodyQueues> queues) {
        this.queues = queues;
        return this;
    }
    public java.util.List<GetAutoScaleConfigResponseBodyQueues> getQueues() {
        return this.queues;
    }

    public GetAutoScaleConfigResponseBody setExcludeNodes(String excludeNodes) {
        this.excludeNodes = excludeNodes;
        return this;
    }
    public String getExcludeNodes() {
        return this.excludeNodes;
    }

    public GetAutoScaleConfigResponseBody setSpotStrategy(String spotStrategy) {
        this.spotStrategy = spotStrategy;
        return this;
    }
    public String getSpotStrategy() {
        return this.spotStrategy;
    }

    public static class GetAutoScaleConfigResponseBodyQueuesInstanceTypes extends TeaModel {
        @NameInMap("HostNamePrefix")
        public String hostNamePrefix;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("SpotPriceLimit")
        public Float spotPriceLimit;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("SpotStrategy")
        public String spotStrategy;

        public static GetAutoScaleConfigResponseBodyQueuesInstanceTypes build(java.util.Map<String, ?> map) throws Exception {
            GetAutoScaleConfigResponseBodyQueuesInstanceTypes self = new GetAutoScaleConfigResponseBodyQueuesInstanceTypes();
            return TeaModel.build(map, self);
        }

        public GetAutoScaleConfigResponseBodyQueuesInstanceTypes setHostNamePrefix(String hostNamePrefix) {
            this.hostNamePrefix = hostNamePrefix;
            return this;
        }
        public String getHostNamePrefix() {
            return this.hostNamePrefix;
        }

        public GetAutoScaleConfigResponseBodyQueuesInstanceTypes setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public GetAutoScaleConfigResponseBodyQueuesInstanceTypes setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public GetAutoScaleConfigResponseBodyQueuesInstanceTypes setSpotPriceLimit(Float spotPriceLimit) {
            this.spotPriceLimit = spotPriceLimit;
            return this;
        }
        public Float getSpotPriceLimit() {
            return this.spotPriceLimit;
        }

        public GetAutoScaleConfigResponseBodyQueuesInstanceTypes setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public GetAutoScaleConfigResponseBodyQueuesInstanceTypes setSpotStrategy(String spotStrategy) {
            this.spotStrategy = spotStrategy;
            return this;
        }
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

    }

    public static class GetAutoScaleConfigResponseBodyQueues extends TeaModel {
        @NameInMap("MinNodesInQueue")
        public Integer minNodesInQueue;

        @NameInMap("MaxNodesInQueue")
        public Integer maxNodesInQueue;

        @NameInMap("EnableAutoShrink")
        public Boolean enableAutoShrink;

        @NameInMap("QueueName")
        public String queueName;

        @NameInMap("QueueImageId")
        public String queueImageId;

        @NameInMap("EnableAutoGrow")
        public Boolean enableAutoGrow;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("SpotPriceLimit")
        public Float spotPriceLimit;

        @NameInMap("InstanceTypes")
        public java.util.List<GetAutoScaleConfigResponseBodyQueuesInstanceTypes> instanceTypes;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("SpotStrategy")
        public String spotStrategy;

        public static GetAutoScaleConfigResponseBodyQueues build(java.util.Map<String, ?> map) throws Exception {
            GetAutoScaleConfigResponseBodyQueues self = new GetAutoScaleConfigResponseBodyQueues();
            return TeaModel.build(map, self);
        }

        public GetAutoScaleConfigResponseBodyQueues setMinNodesInQueue(Integer minNodesInQueue) {
            this.minNodesInQueue = minNodesInQueue;
            return this;
        }
        public Integer getMinNodesInQueue() {
            return this.minNodesInQueue;
        }

        public GetAutoScaleConfigResponseBodyQueues setMaxNodesInQueue(Integer maxNodesInQueue) {
            this.maxNodesInQueue = maxNodesInQueue;
            return this;
        }
        public Integer getMaxNodesInQueue() {
            return this.maxNodesInQueue;
        }

        public GetAutoScaleConfigResponseBodyQueues setEnableAutoShrink(Boolean enableAutoShrink) {
            this.enableAutoShrink = enableAutoShrink;
            return this;
        }
        public Boolean getEnableAutoShrink() {
            return this.enableAutoShrink;
        }

        public GetAutoScaleConfigResponseBodyQueues setQueueName(String queueName) {
            this.queueName = queueName;
            return this;
        }
        public String getQueueName() {
            return this.queueName;
        }

        public GetAutoScaleConfigResponseBodyQueues setQueueImageId(String queueImageId) {
            this.queueImageId = queueImageId;
            return this;
        }
        public String getQueueImageId() {
            return this.queueImageId;
        }

        public GetAutoScaleConfigResponseBodyQueues setEnableAutoGrow(Boolean enableAutoGrow) {
            this.enableAutoGrow = enableAutoGrow;
            return this;
        }
        public Boolean getEnableAutoGrow() {
            return this.enableAutoGrow;
        }

        public GetAutoScaleConfigResponseBodyQueues setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public GetAutoScaleConfigResponseBodyQueues setSpotPriceLimit(Float spotPriceLimit) {
            this.spotPriceLimit = spotPriceLimit;
            return this;
        }
        public Float getSpotPriceLimit() {
            return this.spotPriceLimit;
        }

        public GetAutoScaleConfigResponseBodyQueues setInstanceTypes(java.util.List<GetAutoScaleConfigResponseBodyQueuesInstanceTypes> instanceTypes) {
            this.instanceTypes = instanceTypes;
            return this;
        }
        public java.util.List<GetAutoScaleConfigResponseBodyQueuesInstanceTypes> getInstanceTypes() {
            return this.instanceTypes;
        }

        public GetAutoScaleConfigResponseBodyQueues setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public GetAutoScaleConfigResponseBodyQueues setSpotStrategy(String spotStrategy) {
            this.spotStrategy = spotStrategy;
            return this;
        }
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

    }

}
