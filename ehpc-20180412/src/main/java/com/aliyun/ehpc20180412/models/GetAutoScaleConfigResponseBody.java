// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class GetAutoScaleConfigResponseBody extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("ClusterType")
    public String clusterType;

    @NameInMap("EnableAutoGrow")
    public Boolean enableAutoGrow;

    @NameInMap("EnableAutoShrink")
    public Boolean enableAutoShrink;

    @NameInMap("ExcludeNodes")
    public String excludeNodes;

    @NameInMap("ExtraNodesGrowRatio")
    public Integer extraNodesGrowRatio;

    @NameInMap("GrowIntervalInMinutes")
    public Integer growIntervalInMinutes;

    @NameInMap("GrowRatio")
    public Integer growRatio;

    @NameInMap("GrowTimeoutInMinutes")
    public Integer growTimeoutInMinutes;

    @NameInMap("ImageId")
    public String imageId;

    @NameInMap("MaxNodesInCluster")
    public Integer maxNodesInCluster;

    @NameInMap("Queues")
    public GetAutoScaleConfigResponseBodyQueues queues;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ShrinkIdleTimes")
    public Integer shrinkIdleTimes;

    @NameInMap("ShrinkIntervalInMinutes")
    public Integer shrinkIntervalInMinutes;

    @NameInMap("SpotPriceLimit")
    public Float spotPriceLimit;

    @NameInMap("SpotStrategy")
    public String spotStrategy;

    @NameInMap("Uid")
    public String uid;

    public static GetAutoScaleConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAutoScaleConfigResponseBody self = new GetAutoScaleConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAutoScaleConfigResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetAutoScaleConfigResponseBody setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }
    public String getClusterType() {
        return this.clusterType;
    }

    public GetAutoScaleConfigResponseBody setEnableAutoGrow(Boolean enableAutoGrow) {
        this.enableAutoGrow = enableAutoGrow;
        return this;
    }
    public Boolean getEnableAutoGrow() {
        return this.enableAutoGrow;
    }

    public GetAutoScaleConfigResponseBody setEnableAutoShrink(Boolean enableAutoShrink) {
        this.enableAutoShrink = enableAutoShrink;
        return this;
    }
    public Boolean getEnableAutoShrink() {
        return this.enableAutoShrink;
    }

    public GetAutoScaleConfigResponseBody setExcludeNodes(String excludeNodes) {
        this.excludeNodes = excludeNodes;
        return this;
    }
    public String getExcludeNodes() {
        return this.excludeNodes;
    }

    public GetAutoScaleConfigResponseBody setExtraNodesGrowRatio(Integer extraNodesGrowRatio) {
        this.extraNodesGrowRatio = extraNodesGrowRatio;
        return this;
    }
    public Integer getExtraNodesGrowRatio() {
        return this.extraNodesGrowRatio;
    }

    public GetAutoScaleConfigResponseBody setGrowIntervalInMinutes(Integer growIntervalInMinutes) {
        this.growIntervalInMinutes = growIntervalInMinutes;
        return this;
    }
    public Integer getGrowIntervalInMinutes() {
        return this.growIntervalInMinutes;
    }

    public GetAutoScaleConfigResponseBody setGrowRatio(Integer growRatio) {
        this.growRatio = growRatio;
        return this;
    }
    public Integer getGrowRatio() {
        return this.growRatio;
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

    public GetAutoScaleConfigResponseBody setMaxNodesInCluster(Integer maxNodesInCluster) {
        this.maxNodesInCluster = maxNodesInCluster;
        return this;
    }
    public Integer getMaxNodesInCluster() {
        return this.maxNodesInCluster;
    }

    public GetAutoScaleConfigResponseBody setQueues(GetAutoScaleConfigResponseBodyQueues queues) {
        this.queues = queues;
        return this;
    }
    public GetAutoScaleConfigResponseBodyQueues getQueues() {
        return this.queues;
    }

    public GetAutoScaleConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAutoScaleConfigResponseBody setShrinkIdleTimes(Integer shrinkIdleTimes) {
        this.shrinkIdleTimes = shrinkIdleTimes;
        return this;
    }
    public Integer getShrinkIdleTimes() {
        return this.shrinkIdleTimes;
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

    public GetAutoScaleConfigResponseBody setSpotStrategy(String spotStrategy) {
        this.spotStrategy = spotStrategy;
        return this;
    }
    public String getSpotStrategy() {
        return this.spotStrategy;
    }

    public GetAutoScaleConfigResponseBody setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

    public static class GetAutoScaleConfigResponseBodyQueuesQueueInfoInstanceTypesInstanceTypeInfo extends TeaModel {
        @NameInMap("HostNamePrefix")
        public String hostNamePrefix;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("SpotPriceLimit")
        public Float spotPriceLimit;

        @NameInMap("SpotStrategy")
        public String spotStrategy;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("ZoneId")
        public String zoneId;

        public static GetAutoScaleConfigResponseBodyQueuesQueueInfoInstanceTypesInstanceTypeInfo build(java.util.Map<String, ?> map) throws Exception {
            GetAutoScaleConfigResponseBodyQueuesQueueInfoInstanceTypesInstanceTypeInfo self = new GetAutoScaleConfigResponseBodyQueuesQueueInfoInstanceTypesInstanceTypeInfo();
            return TeaModel.build(map, self);
        }

        public GetAutoScaleConfigResponseBodyQueuesQueueInfoInstanceTypesInstanceTypeInfo setHostNamePrefix(String hostNamePrefix) {
            this.hostNamePrefix = hostNamePrefix;
            return this;
        }
        public String getHostNamePrefix() {
            return this.hostNamePrefix;
        }

        public GetAutoScaleConfigResponseBodyQueuesQueueInfoInstanceTypesInstanceTypeInfo setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public GetAutoScaleConfigResponseBodyQueuesQueueInfoInstanceTypesInstanceTypeInfo setSpotPriceLimit(Float spotPriceLimit) {
            this.spotPriceLimit = spotPriceLimit;
            return this;
        }
        public Float getSpotPriceLimit() {
            return this.spotPriceLimit;
        }

        public GetAutoScaleConfigResponseBodyQueuesQueueInfoInstanceTypesInstanceTypeInfo setSpotStrategy(String spotStrategy) {
            this.spotStrategy = spotStrategy;
            return this;
        }
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

        public GetAutoScaleConfigResponseBodyQueuesQueueInfoInstanceTypesInstanceTypeInfo setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public GetAutoScaleConfigResponseBodyQueuesQueueInfoInstanceTypesInstanceTypeInfo setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class GetAutoScaleConfigResponseBodyQueuesQueueInfoInstanceTypes extends TeaModel {
        @NameInMap("InstanceTypeInfo")
        public java.util.List<GetAutoScaleConfigResponseBodyQueuesQueueInfoInstanceTypesInstanceTypeInfo> instanceTypeInfo;

        public static GetAutoScaleConfigResponseBodyQueuesQueueInfoInstanceTypes build(java.util.Map<String, ?> map) throws Exception {
            GetAutoScaleConfigResponseBodyQueuesQueueInfoInstanceTypes self = new GetAutoScaleConfigResponseBodyQueuesQueueInfoInstanceTypes();
            return TeaModel.build(map, self);
        }

        public GetAutoScaleConfigResponseBodyQueuesQueueInfoInstanceTypes setInstanceTypeInfo(java.util.List<GetAutoScaleConfigResponseBodyQueuesQueueInfoInstanceTypesInstanceTypeInfo> instanceTypeInfo) {
            this.instanceTypeInfo = instanceTypeInfo;
            return this;
        }
        public java.util.List<GetAutoScaleConfigResponseBodyQueuesQueueInfoInstanceTypesInstanceTypeInfo> getInstanceTypeInfo() {
            return this.instanceTypeInfo;
        }

    }

    public static class GetAutoScaleConfigResponseBodyQueuesQueueInfo extends TeaModel {
        @NameInMap("EnableAutoGrow")
        public Boolean enableAutoGrow;

        @NameInMap("EnableAutoShrink")
        public Boolean enableAutoShrink;

        @NameInMap("HostNamePrefix")
        public String hostNamePrefix;

        @NameInMap("HostNameSuffix")
        public String hostNameSuffix;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("InstanceTypes")
        public GetAutoScaleConfigResponseBodyQueuesQueueInfoInstanceTypes instanceTypes;

        @NameInMap("MaxNodesInQueue")
        public Integer maxNodesInQueue;

        @NameInMap("MinNodesInQueue")
        public Integer minNodesInQueue;

        @NameInMap("QueueImageId")
        public String queueImageId;

        @NameInMap("QueueName")
        public String queueName;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("SpotPriceLimit")
        public Float spotPriceLimit;

        @NameInMap("SpotStrategy")
        public String spotStrategy;

        @NameInMap("SystemDiskCategory")
        public String systemDiskCategory;

        @NameInMap("SystemDiskLevel")
        public String systemDiskLevel;

        @NameInMap("SystemDiskSize")
        public Integer systemDiskSize;

        public static GetAutoScaleConfigResponseBodyQueuesQueueInfo build(java.util.Map<String, ?> map) throws Exception {
            GetAutoScaleConfigResponseBodyQueuesQueueInfo self = new GetAutoScaleConfigResponseBodyQueuesQueueInfo();
            return TeaModel.build(map, self);
        }

        public GetAutoScaleConfigResponseBodyQueuesQueueInfo setEnableAutoGrow(Boolean enableAutoGrow) {
            this.enableAutoGrow = enableAutoGrow;
            return this;
        }
        public Boolean getEnableAutoGrow() {
            return this.enableAutoGrow;
        }

        public GetAutoScaleConfigResponseBodyQueuesQueueInfo setEnableAutoShrink(Boolean enableAutoShrink) {
            this.enableAutoShrink = enableAutoShrink;
            return this;
        }
        public Boolean getEnableAutoShrink() {
            return this.enableAutoShrink;
        }

        public GetAutoScaleConfigResponseBodyQueuesQueueInfo setHostNamePrefix(String hostNamePrefix) {
            this.hostNamePrefix = hostNamePrefix;
            return this;
        }
        public String getHostNamePrefix() {
            return this.hostNamePrefix;
        }

        public GetAutoScaleConfigResponseBodyQueuesQueueInfo setHostNameSuffix(String hostNameSuffix) {
            this.hostNameSuffix = hostNameSuffix;
            return this;
        }
        public String getHostNameSuffix() {
            return this.hostNameSuffix;
        }

        public GetAutoScaleConfigResponseBodyQueuesQueueInfo setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public GetAutoScaleConfigResponseBodyQueuesQueueInfo setInstanceTypes(GetAutoScaleConfigResponseBodyQueuesQueueInfoInstanceTypes instanceTypes) {
            this.instanceTypes = instanceTypes;
            return this;
        }
        public GetAutoScaleConfigResponseBodyQueuesQueueInfoInstanceTypes getInstanceTypes() {
            return this.instanceTypes;
        }

        public GetAutoScaleConfigResponseBodyQueuesQueueInfo setMaxNodesInQueue(Integer maxNodesInQueue) {
            this.maxNodesInQueue = maxNodesInQueue;
            return this;
        }
        public Integer getMaxNodesInQueue() {
            return this.maxNodesInQueue;
        }

        public GetAutoScaleConfigResponseBodyQueuesQueueInfo setMinNodesInQueue(Integer minNodesInQueue) {
            this.minNodesInQueue = minNodesInQueue;
            return this;
        }
        public Integer getMinNodesInQueue() {
            return this.minNodesInQueue;
        }

        public GetAutoScaleConfigResponseBodyQueuesQueueInfo setQueueImageId(String queueImageId) {
            this.queueImageId = queueImageId;
            return this;
        }
        public String getQueueImageId() {
            return this.queueImageId;
        }

        public GetAutoScaleConfigResponseBodyQueuesQueueInfo setQueueName(String queueName) {
            this.queueName = queueName;
            return this;
        }
        public String getQueueName() {
            return this.queueName;
        }

        public GetAutoScaleConfigResponseBodyQueuesQueueInfo setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public GetAutoScaleConfigResponseBodyQueuesQueueInfo setSpotPriceLimit(Float spotPriceLimit) {
            this.spotPriceLimit = spotPriceLimit;
            return this;
        }
        public Float getSpotPriceLimit() {
            return this.spotPriceLimit;
        }

        public GetAutoScaleConfigResponseBodyQueuesQueueInfo setSpotStrategy(String spotStrategy) {
            this.spotStrategy = spotStrategy;
            return this;
        }
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

        public GetAutoScaleConfigResponseBodyQueuesQueueInfo setSystemDiskCategory(String systemDiskCategory) {
            this.systemDiskCategory = systemDiskCategory;
            return this;
        }
        public String getSystemDiskCategory() {
            return this.systemDiskCategory;
        }

        public GetAutoScaleConfigResponseBodyQueuesQueueInfo setSystemDiskLevel(String systemDiskLevel) {
            this.systemDiskLevel = systemDiskLevel;
            return this;
        }
        public String getSystemDiskLevel() {
            return this.systemDiskLevel;
        }

        public GetAutoScaleConfigResponseBodyQueuesQueueInfo setSystemDiskSize(Integer systemDiskSize) {
            this.systemDiskSize = systemDiskSize;
            return this;
        }
        public Integer getSystemDiskSize() {
            return this.systemDiskSize;
        }

    }

    public static class GetAutoScaleConfigResponseBodyQueues extends TeaModel {
        @NameInMap("QueueInfo")
        public java.util.List<GetAutoScaleConfigResponseBodyQueuesQueueInfo> queueInfo;

        public static GetAutoScaleConfigResponseBodyQueues build(java.util.Map<String, ?> map) throws Exception {
            GetAutoScaleConfigResponseBodyQueues self = new GetAutoScaleConfigResponseBodyQueues();
            return TeaModel.build(map, self);
        }

        public GetAutoScaleConfigResponseBodyQueues setQueueInfo(java.util.List<GetAutoScaleConfigResponseBodyQueuesQueueInfo> queueInfo) {
            this.queueInfo = queueInfo;
            return this;
        }
        public java.util.List<GetAutoScaleConfigResponseBodyQueuesQueueInfo> getQueueInfo() {
            return this.queueInfo;
        }

    }

}
