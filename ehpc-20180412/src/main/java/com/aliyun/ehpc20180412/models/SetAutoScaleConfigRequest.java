// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class SetAutoScaleConfigRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("EnableAutoGrow")
    public Boolean enableAutoGrow;

    @NameInMap("EnableAutoShrink")
    public Boolean enableAutoShrink;

    @NameInMap("GrowIntervalInMinutes")
    public Integer growIntervalInMinutes;

    @NameInMap("ShrinkIntervalInMinutes")
    public Integer shrinkIntervalInMinutes;

    @NameInMap("ShrinkIdleTimes")
    public Integer shrinkIdleTimes;

    @NameInMap("GrowTimeoutInMinutes")
    public Integer growTimeoutInMinutes;

    @NameInMap("ExtraNodesGrowRatio")
    public Integer extraNodesGrowRatio;

    @NameInMap("GrowRatio")
    public Integer growRatio;

    @NameInMap("MaxNodesInCluster")
    public Integer maxNodesInCluster;

    @NameInMap("ExcludeNodes")
    public String excludeNodes;

    @NameInMap("SpotStrategy")
    public String spotStrategy;

    @NameInMap("SpotPriceLimit")
    public Float spotPriceLimit;

    @NameInMap("ImageId")
    public String imageId;

    @NameInMap("Queues")
    public java.util.List<SetAutoScaleConfigRequestQueues> queues;

    public static SetAutoScaleConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SetAutoScaleConfigRequest self = new SetAutoScaleConfigRequest();
        return TeaModel.build(map, self);
    }

    public SetAutoScaleConfigRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public SetAutoScaleConfigRequest setEnableAutoGrow(Boolean enableAutoGrow) {
        this.enableAutoGrow = enableAutoGrow;
        return this;
    }
    public Boolean getEnableAutoGrow() {
        return this.enableAutoGrow;
    }

    public SetAutoScaleConfigRequest setEnableAutoShrink(Boolean enableAutoShrink) {
        this.enableAutoShrink = enableAutoShrink;
        return this;
    }
    public Boolean getEnableAutoShrink() {
        return this.enableAutoShrink;
    }

    public SetAutoScaleConfigRequest setGrowIntervalInMinutes(Integer growIntervalInMinutes) {
        this.growIntervalInMinutes = growIntervalInMinutes;
        return this;
    }
    public Integer getGrowIntervalInMinutes() {
        return this.growIntervalInMinutes;
    }

    public SetAutoScaleConfigRequest setShrinkIntervalInMinutes(Integer shrinkIntervalInMinutes) {
        this.shrinkIntervalInMinutes = shrinkIntervalInMinutes;
        return this;
    }
    public Integer getShrinkIntervalInMinutes() {
        return this.shrinkIntervalInMinutes;
    }

    public SetAutoScaleConfigRequest setShrinkIdleTimes(Integer shrinkIdleTimes) {
        this.shrinkIdleTimes = shrinkIdleTimes;
        return this;
    }
    public Integer getShrinkIdleTimes() {
        return this.shrinkIdleTimes;
    }

    public SetAutoScaleConfigRequest setGrowTimeoutInMinutes(Integer growTimeoutInMinutes) {
        this.growTimeoutInMinutes = growTimeoutInMinutes;
        return this;
    }
    public Integer getGrowTimeoutInMinutes() {
        return this.growTimeoutInMinutes;
    }

    public SetAutoScaleConfigRequest setExtraNodesGrowRatio(Integer extraNodesGrowRatio) {
        this.extraNodesGrowRatio = extraNodesGrowRatio;
        return this;
    }
    public Integer getExtraNodesGrowRatio() {
        return this.extraNodesGrowRatio;
    }

    public SetAutoScaleConfigRequest setGrowRatio(Integer growRatio) {
        this.growRatio = growRatio;
        return this;
    }
    public Integer getGrowRatio() {
        return this.growRatio;
    }

    public SetAutoScaleConfigRequest setMaxNodesInCluster(Integer maxNodesInCluster) {
        this.maxNodesInCluster = maxNodesInCluster;
        return this;
    }
    public Integer getMaxNodesInCluster() {
        return this.maxNodesInCluster;
    }

    public SetAutoScaleConfigRequest setExcludeNodes(String excludeNodes) {
        this.excludeNodes = excludeNodes;
        return this;
    }
    public String getExcludeNodes() {
        return this.excludeNodes;
    }

    public SetAutoScaleConfigRequest setSpotStrategy(String spotStrategy) {
        this.spotStrategy = spotStrategy;
        return this;
    }
    public String getSpotStrategy() {
        return this.spotStrategy;
    }

    public SetAutoScaleConfigRequest setSpotPriceLimit(Float spotPriceLimit) {
        this.spotPriceLimit = spotPriceLimit;
        return this;
    }
    public Float getSpotPriceLimit() {
        return this.spotPriceLimit;
    }

    public SetAutoScaleConfigRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public SetAutoScaleConfigRequest setQueues(java.util.List<SetAutoScaleConfigRequestQueues> queues) {
        this.queues = queues;
        return this;
    }
    public java.util.List<SetAutoScaleConfigRequestQueues> getQueues() {
        return this.queues;
    }

    public static class SetAutoScaleConfigRequestQueuesInstanceTypes extends TeaModel {
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

        public static SetAutoScaleConfigRequestQueuesInstanceTypes build(java.util.Map<String, ?> map) throws Exception {
            SetAutoScaleConfigRequestQueuesInstanceTypes self = new SetAutoScaleConfigRequestQueuesInstanceTypes();
            return TeaModel.build(map, self);
        }

        public SetAutoScaleConfigRequestQueuesInstanceTypes setHostNamePrefix(String hostNamePrefix) {
            this.hostNamePrefix = hostNamePrefix;
            return this;
        }
        public String getHostNamePrefix() {
            return this.hostNamePrefix;
        }

        public SetAutoScaleConfigRequestQueuesInstanceTypes setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public SetAutoScaleConfigRequestQueuesInstanceTypes setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public SetAutoScaleConfigRequestQueuesInstanceTypes setSpotPriceLimit(Float spotPriceLimit) {
            this.spotPriceLimit = spotPriceLimit;
            return this;
        }
        public Float getSpotPriceLimit() {
            return this.spotPriceLimit;
        }

        public SetAutoScaleConfigRequestQueuesInstanceTypes setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public SetAutoScaleConfigRequestQueuesInstanceTypes setSpotStrategy(String spotStrategy) {
            this.spotStrategy = spotStrategy;
            return this;
        }
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

    }

    public static class SetAutoScaleConfigRequestQueues extends TeaModel {
        @NameInMap("MinNodesInQueue")
        public Integer minNodesInQueue;

        @NameInMap("MaxNodesInQueue")
        public Integer maxNodesInQueue;

        @NameInMap("EnableAutoShrink")
        public Boolean enableAutoShrink;

        @NameInMap("QueueName")
        public String queueName;

        @NameInMap("EnableAutoGrow")
        public Boolean enableAutoGrow;

        @NameInMap("QueueImageId")
        public String queueImageId;

        @NameInMap("SpotPriceLimit")
        public Float spotPriceLimit;

        @NameInMap("InstanceTypes")
        public java.util.List<SetAutoScaleConfigRequestQueuesInstanceTypes> instanceTypes;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("SpotStrategy")
        public String spotStrategy;

        public static SetAutoScaleConfigRequestQueues build(java.util.Map<String, ?> map) throws Exception {
            SetAutoScaleConfigRequestQueues self = new SetAutoScaleConfigRequestQueues();
            return TeaModel.build(map, self);
        }

        public SetAutoScaleConfigRequestQueues setMinNodesInQueue(Integer minNodesInQueue) {
            this.minNodesInQueue = minNodesInQueue;
            return this;
        }
        public Integer getMinNodesInQueue() {
            return this.minNodesInQueue;
        }

        public SetAutoScaleConfigRequestQueues setMaxNodesInQueue(Integer maxNodesInQueue) {
            this.maxNodesInQueue = maxNodesInQueue;
            return this;
        }
        public Integer getMaxNodesInQueue() {
            return this.maxNodesInQueue;
        }

        public SetAutoScaleConfigRequestQueues setEnableAutoShrink(Boolean enableAutoShrink) {
            this.enableAutoShrink = enableAutoShrink;
            return this;
        }
        public Boolean getEnableAutoShrink() {
            return this.enableAutoShrink;
        }

        public SetAutoScaleConfigRequestQueues setQueueName(String queueName) {
            this.queueName = queueName;
            return this;
        }
        public String getQueueName() {
            return this.queueName;
        }

        public SetAutoScaleConfigRequestQueues setEnableAutoGrow(Boolean enableAutoGrow) {
            this.enableAutoGrow = enableAutoGrow;
            return this;
        }
        public Boolean getEnableAutoGrow() {
            return this.enableAutoGrow;
        }

        public SetAutoScaleConfigRequestQueues setQueueImageId(String queueImageId) {
            this.queueImageId = queueImageId;
            return this;
        }
        public String getQueueImageId() {
            return this.queueImageId;
        }

        public SetAutoScaleConfigRequestQueues setSpotPriceLimit(Float spotPriceLimit) {
            this.spotPriceLimit = spotPriceLimit;
            return this;
        }
        public Float getSpotPriceLimit() {
            return this.spotPriceLimit;
        }

        public SetAutoScaleConfigRequestQueues setInstanceTypes(java.util.List<SetAutoScaleConfigRequestQueuesInstanceTypes> instanceTypes) {
            this.instanceTypes = instanceTypes;
            return this;
        }
        public java.util.List<SetAutoScaleConfigRequestQueuesInstanceTypes> getInstanceTypes() {
            return this.instanceTypes;
        }

        public SetAutoScaleConfigRequestQueues setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public SetAutoScaleConfigRequestQueues setSpotStrategy(String spotStrategy) {
            this.spotStrategy = spotStrategy;
            return this;
        }
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

    }

}
