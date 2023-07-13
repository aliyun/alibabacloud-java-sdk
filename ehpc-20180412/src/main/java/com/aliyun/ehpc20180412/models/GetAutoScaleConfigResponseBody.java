// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class GetAutoScaleConfigResponseBody extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("ClusterType")
    public String clusterType;

    @NameInMap("ComputeEnableHt")
    public Boolean computeEnableHt;

    @NameInMap("DnsConfig")
    public String dnsConfig;

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

    public GetAutoScaleConfigResponseBody setComputeEnableHt(Boolean computeEnableHt) {
        this.computeEnableHt = computeEnableHt;
        return this;
    }
    public Boolean getComputeEnableHt() {
        return this.computeEnableHt;
    }

    public GetAutoScaleConfigResponseBody setDnsConfig(String dnsConfig) {
        this.dnsConfig = dnsConfig;
        return this;
    }
    public String getDnsConfig() {
        return this.dnsConfig;
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

    public static class GetAutoScaleConfigResponseBodyQueuesQueueInfoDataDisksDataDisksInfo extends TeaModel {
        @NameInMap("DataDiskCategory")
        public String dataDiskCategory;

        @NameInMap("DataDiskDeleteWithInstance")
        public Boolean dataDiskDeleteWithInstance;

        @NameInMap("DataDiskEncrypted")
        public Boolean dataDiskEncrypted;

        @NameInMap("DataDiskKMSKeyId")
        public String dataDiskKMSKeyId;

        @NameInMap("DataDiskPerformanceLevel")
        public String dataDiskPerformanceLevel;

        @NameInMap("DataDiskSize")
        public Integer dataDiskSize;

        public static GetAutoScaleConfigResponseBodyQueuesQueueInfoDataDisksDataDisksInfo build(java.util.Map<String, ?> map) throws Exception {
            GetAutoScaleConfigResponseBodyQueuesQueueInfoDataDisksDataDisksInfo self = new GetAutoScaleConfigResponseBodyQueuesQueueInfoDataDisksDataDisksInfo();
            return TeaModel.build(map, self);
        }

        public GetAutoScaleConfigResponseBodyQueuesQueueInfoDataDisksDataDisksInfo setDataDiskCategory(String dataDiskCategory) {
            this.dataDiskCategory = dataDiskCategory;
            return this;
        }
        public String getDataDiskCategory() {
            return this.dataDiskCategory;
        }

        public GetAutoScaleConfigResponseBodyQueuesQueueInfoDataDisksDataDisksInfo setDataDiskDeleteWithInstance(Boolean dataDiskDeleteWithInstance) {
            this.dataDiskDeleteWithInstance = dataDiskDeleteWithInstance;
            return this;
        }
        public Boolean getDataDiskDeleteWithInstance() {
            return this.dataDiskDeleteWithInstance;
        }

        public GetAutoScaleConfigResponseBodyQueuesQueueInfoDataDisksDataDisksInfo setDataDiskEncrypted(Boolean dataDiskEncrypted) {
            this.dataDiskEncrypted = dataDiskEncrypted;
            return this;
        }
        public Boolean getDataDiskEncrypted() {
            return this.dataDiskEncrypted;
        }

        public GetAutoScaleConfigResponseBodyQueuesQueueInfoDataDisksDataDisksInfo setDataDiskKMSKeyId(String dataDiskKMSKeyId) {
            this.dataDiskKMSKeyId = dataDiskKMSKeyId;
            return this;
        }
        public String getDataDiskKMSKeyId() {
            return this.dataDiskKMSKeyId;
        }

        public GetAutoScaleConfigResponseBodyQueuesQueueInfoDataDisksDataDisksInfo setDataDiskPerformanceLevel(String dataDiskPerformanceLevel) {
            this.dataDiskPerformanceLevel = dataDiskPerformanceLevel;
            return this;
        }
        public String getDataDiskPerformanceLevel() {
            return this.dataDiskPerformanceLevel;
        }

        public GetAutoScaleConfigResponseBodyQueuesQueueInfoDataDisksDataDisksInfo setDataDiskSize(Integer dataDiskSize) {
            this.dataDiskSize = dataDiskSize;
            return this;
        }
        public Integer getDataDiskSize() {
            return this.dataDiskSize;
        }

    }

    public static class GetAutoScaleConfigResponseBodyQueuesQueueInfoDataDisks extends TeaModel {
        @NameInMap("DataDisksInfo")
        public java.util.List<GetAutoScaleConfigResponseBodyQueuesQueueInfoDataDisksDataDisksInfo> dataDisksInfo;

        public static GetAutoScaleConfigResponseBodyQueuesQueueInfoDataDisks build(java.util.Map<String, ?> map) throws Exception {
            GetAutoScaleConfigResponseBodyQueuesQueueInfoDataDisks self = new GetAutoScaleConfigResponseBodyQueuesQueueInfoDataDisks();
            return TeaModel.build(map, self);
        }

        public GetAutoScaleConfigResponseBodyQueuesQueueInfoDataDisks setDataDisksInfo(java.util.List<GetAutoScaleConfigResponseBodyQueuesQueueInfoDataDisksDataDisksInfo> dataDisksInfo) {
            this.dataDisksInfo = dataDisksInfo;
            return this;
        }
        public java.util.List<GetAutoScaleConfigResponseBodyQueuesQueueInfoDataDisksDataDisksInfo> getDataDisksInfo() {
            return this.dataDisksInfo;
        }

    }

    public static class GetAutoScaleConfigResponseBodyQueuesQueueInfoInstanceTypesInstanceTypeInfo extends TeaModel {
        @NameInMap("HostNamePrefix")
        public String hostNamePrefix;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("SpotDuration")
        public Integer spotDuration;

        @NameInMap("SpotInterruptionBehavior")
        public String spotInterruptionBehavior;

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

        public GetAutoScaleConfigResponseBodyQueuesQueueInfoInstanceTypesInstanceTypeInfo setSpotDuration(Integer spotDuration) {
            this.spotDuration = spotDuration;
            return this;
        }
        public Integer getSpotDuration() {
            return this.spotDuration;
        }

        public GetAutoScaleConfigResponseBodyQueuesQueueInfoInstanceTypesInstanceTypeInfo setSpotInterruptionBehavior(String spotInterruptionBehavior) {
            this.spotInterruptionBehavior = spotInterruptionBehavior;
            return this;
        }
        public String getSpotInterruptionBehavior() {
            return this.spotInterruptionBehavior;
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
        @NameInMap("DataDisks")
        public GetAutoScaleConfigResponseBodyQueuesQueueInfoDataDisks dataDisks;

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

        @NameInMap("MaxNodesPerCycle")
        public Long maxNodesPerCycle;

        @NameInMap("MinNodesInQueue")
        public Integer minNodesInQueue;

        @NameInMap("MinNodesPerCycle")
        public Long minNodesPerCycle;

        @NameInMap("QueueImageId")
        public String queueImageId;

        @NameInMap("QueueName")
        public String queueName;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("SortedByInventory")
        public Boolean sortedByInventory;

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

        public GetAutoScaleConfigResponseBodyQueuesQueueInfo setDataDisks(GetAutoScaleConfigResponseBodyQueuesQueueInfoDataDisks dataDisks) {
            this.dataDisks = dataDisks;
            return this;
        }
        public GetAutoScaleConfigResponseBodyQueuesQueueInfoDataDisks getDataDisks() {
            return this.dataDisks;
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

        public GetAutoScaleConfigResponseBodyQueuesQueueInfo setMaxNodesPerCycle(Long maxNodesPerCycle) {
            this.maxNodesPerCycle = maxNodesPerCycle;
            return this;
        }
        public Long getMaxNodesPerCycle() {
            return this.maxNodesPerCycle;
        }

        public GetAutoScaleConfigResponseBodyQueuesQueueInfo setMinNodesInQueue(Integer minNodesInQueue) {
            this.minNodesInQueue = minNodesInQueue;
            return this;
        }
        public Integer getMinNodesInQueue() {
            return this.minNodesInQueue;
        }

        public GetAutoScaleConfigResponseBodyQueuesQueueInfo setMinNodesPerCycle(Long minNodesPerCycle) {
            this.minNodesPerCycle = minNodesPerCycle;
            return this;
        }
        public Long getMinNodesPerCycle() {
            return this.minNodesPerCycle;
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

        public GetAutoScaleConfigResponseBodyQueuesQueueInfo setSortedByInventory(Boolean sortedByInventory) {
            this.sortedByInventory = sortedByInventory;
            return this;
        }
        public Boolean getSortedByInventory() {
            return this.sortedByInventory;
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
