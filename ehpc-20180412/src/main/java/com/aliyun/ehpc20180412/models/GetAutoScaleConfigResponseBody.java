// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class GetAutoScaleConfigResponseBody extends TeaModel {
    /**
     * <p>The prefix of the queue name. You can query queues that have a specified prefix.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The ID of the cluster.</p>
     */
    @NameInMap("ClusterType")
    public String clusterType;

    /**
     * <p>Specifies whether to enable hyper-threading for the ECS instance that is used as the compute node.</p>
     * <br>
     * <p>>  You can only disable hyper-threading for some instance types. The hyper-threading is enabled for ECS instances by default. For more information, see [Specify and view CPU options](~~145895~~).</p>
     */
    @NameInMap("ComputeEnableHt")
    public Boolean computeEnableHt;

    /**
     * <p>The Domain Name System (DNS) settings.</p>
     */
    @NameInMap("DnsConfig")
    public String dnsConfig;

    /**
     * <p>The percentage of each round of scale-out. Valid values: 1 to 100.</p>
     * <br>
     * <p>If you set GrowRatio to 50, the scale-out has two rounds. Each round completes half of the scale-out.</p>
     */
    @NameInMap("EnableAutoGrow")
    public Boolean enableAutoGrow;

    /**
     * <p>The number of consecutive times that a compute node is idle during the resource scale-in check. Valid values: 2 to 5.</p>
     * <br>
     * <p>If the parameter is set to 3, a compute node is idle for more than three consecutive times. In this case, the node is released.</p>
     */
    @NameInMap("EnableAutoShrink")
    public Boolean enableAutoShrink;

    /**
     * <p>The ID of the Alibaba Cloud account.</p>
     */
    @NameInMap("ExcludeNodes")
    public String excludeNodes;

    /**
     * <p>The instance type of the compute nodes that were automatically added in the queue.</p>
     */
    @NameInMap("ExtraNodesGrowRatio")
    public Integer extraNodesGrowRatio;

    /**
     * <p>The image ID of the compute nodes in the queue.</p>
     */
    @NameInMap("GrowIntervalInMinutes")
    public Integer growIntervalInMinutes;

    /**
     * <p>The minimum number of compute nodes that can be retained in a queue. Valid values: 0 to 50.</p>
     */
    @NameInMap("GrowRatio")
    public Integer growRatio;

    /**
     * <p>The maximum hourly price of the compute nodes. The value can be accurate to three decimal places. The parameter takes effect only when SpotStrategy is set to SpotWithPriceLimit.</p>
     */
    @NameInMap("GrowTimeoutInMinutes")
    public Integer growTimeoutInMinutes;

    /**
     * <p>The preemption policy of the compute nodes. Valid values:</p>
     * <br>
     * <p>*   NoSpot: The compute nodes are pay-as-you-go instances.</p>
     * <p>*   SpotWithPriceLimit: The compute nodes are preemptible instances that have a user-defined maximum hourly price.</p>
     * <p>*   SpotAsPriceGo: The compute nodes are preemptible instances for which the market price at the time of purchase is used as the bid price.</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The interval between two consecutive rounds of scale-in. Unit: minutes. Valid values: 2 to 10.</p>
     * <br>
     * <p>>  An interval may exist during multiple rounds of a scale-out task or between two consecutive scale-out tasks.</p>
     */
    @NameInMap("MaxNodesInCluster")
    public Integer maxNodesInCluster;

    /**
     * <p>The maximum number of compute nodes that can be added in a queue. Valid values: 0 to 500.</p>
     */
    @NameInMap("Queues")
    public GetAutoScaleConfigResponseBodyQueues queues;

    /**
     * <p>The image ID of the compute nodes in the queue.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The suffix of the queue name. You can query queues that have a specified suffix.</p>
     */
    @NameInMap("ShrinkIdleTimes")
    public Integer shrinkIdleTimes;

    /**
     * <p>The auto scaling configuration of the queue.</p>
     * <br>
     * <p>>  If auto scaling is enabled for the cluster and queue at the same time, the queue settings prevail.</p>
     */
    @NameInMap("ShrinkIntervalInMinutes")
    public Integer shrinkIntervalInMinutes;

    /**
     * <p>The type of the system disk. Valid values:</p>
     * <br>
     * <p>*   cloud_efficiency: ultra disk</p>
     * <p>*   cloud_ssd: SSD</p>
     * <p>*   cloud_essd: ESSD</p>
     * <p>*   cloud: basic disk</p>
     */
    @NameInMap("SpotPriceLimit")
    public Float spotPriceLimit;

    /**
     * <p>The percentage of extra compute nodes. Valid values: 0 to 100.</p>
     * <br>
     * <p>If you need to add 100 compute nodes and the value of the ExtraNodesGrowRatio parameter is 2, 102 compute nodes are added.</p>
     */
    @NameInMap("SpotStrategy")
    public String spotStrategy;

    /**
     * <p>The size of the system disk. Unit: GB. Valid values: 40 to 500.</p>
     */
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
        /**
         * <p>The type of the data disk. Valid values:</p>
         * <br>
         * <p>- cloud_efficiency: ultra disk</p>
         * <p>- cloud_ssd: SSD</p>
         * <p>- cloud_essd: ESSD</p>
         * <p>- cloud: basic disk</p>
         */
        @NameInMap("HostNamePrefix")
        public String hostNamePrefix;

        /**
         * <p>Indicates whether the data disk is encrypted. Valid values:</p>
         * <br>
         * <p>- true</p>
         * <p>- false</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The list of data disks.</p>
         */
        @NameInMap("SpotDuration")
        public Integer spotDuration;

        /**
         * <p>The minimum number of compute nodes that can be added in each round of an auto scale-out task. Valid values: 1 to 99.</p>
         * <br>
         * <p>Default value: 1.</p>
         * <br>
         * <p>If the number of compute nodes that you want to add in a round is less than the value of this property, the system automatically changes the value of this property to the number of compute nodes that you want to add in a round. This helps ensure that compute nodes can be added as expected.</p>
         * <br>
         * <p>> The configuration takes effect only for the minimum compute nodes that can be added in the current round.</p>
         */
        @NameInMap("SpotInterruptionBehavior")
        public String spotInterruptionBehavior;

        /**
         * <p>The performance level of the ESSD used as the data disk. The parameter takes effect only when the DataDisks.N.DataDiskCategory parameter is set to cloud_essd. Valid values:</p>
         * <br>
         * <p>- PL0: A single ESSD can deliver up to 10,000 random read/write IOPS.</p>
         * <p>- PL1: A single ESSD can deliver up to 50,000 random read/write IOPS.</p>
         * <p>- PL2: A single ESSD can deliver up to 100,000 random read/write IOPS.</p>
         * <p>- PL3: A single ESSD can deliver up to 1,000,000 random read/write IOPS.</p>
         */
        @NameInMap("SpotPriceLimit")
        public Float spotPriceLimit;

        /**
         * <p>The KMS key ID of the data disk.</p>
         */
        @NameInMap("SpotStrategy")
        public String spotStrategy;

        /**
         * <p>The capacity of the data disk. Unit: GB.</p>
         * <br>
         * <p>Valid values: 40 to 500.</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>Indicates whether the data disk is released when the node is released. Valid values:</p>
         * <br>
         * <p>- true</p>
         * <p>- false</p>
         */
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
        @NameInMap("AutoMinNodesPerCycle")
        public Boolean autoMinNodesPerCycle;

        @NameInMap("DataDisks")
        public GetAutoScaleConfigResponseBodyQueuesQueueInfoDataDisks dataDisks;

        /**
         * <p>The instance type of the node.</p>
         */
        @NameInMap("EnableAutoGrow")
        public Boolean enableAutoGrow;

        /**
         * <p>The ID of the zone.</p>
         */
        @NameInMap("EnableAutoShrink")
        public Boolean enableAutoShrink;

        /**
         * <p>The specification information of the compute nodes.</p>
         */
        @NameInMap("HostNamePrefix")
        public String hostNamePrefix;

        /**
         * <p>The performance level of the system disk. Valid values:</p>
         * <br>
         * <p>*   PL0: A single ESSD can deliver up to 10,000 random read/write IOPS.</p>
         * <p>*   PL1: A single ESSD can deliver up to 50,000 random read/write IOPS.</p>
         * <p>*   PL2: A single ESSD can deliver up to 100,000 random read/write IOPS.</p>
         * <p>*   PL3: A single ESSD can deliver up to 1,000,000 random read/write IOPS.</p>
         */
        @NameInMap("HostNameSuffix")
        public String hostNameSuffix;

        /**
         * <p>Indicates whether the queue enabled auto scale-out. Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The list of data disks.</p>
         */
        @NameInMap("InstanceTypes")
        public GetAutoScaleConfigResponseBodyQueuesQueueInfoInstanceTypes instanceTypes;

        /**
         * <p>The ID of the vSwitch.</p>
         */
        @NameInMap("MaxNodesInQueue")
        public Integer maxNodesInQueue;

        @NameInMap("MaxNodesPerCycle")
        public Long maxNodesPerCycle;

        /**
         * <p>The maximum hourly price of the compute nodes. The value can be accurate to three decimal places. The parameter takes effect only when SpotStrategy is set to SpotWithPriceLimit.</p>
         */
        @NameInMap("MinNodesInQueue")
        public Integer minNodesInQueue;

        @NameInMap("MinNodesPerCycle")
        public Long minNodesPerCycle;

        /**
         * <p>Indicates whether the queue enabled auto scale-in. Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false</p>
         */
        @NameInMap("QueueImageId")
        public String queueImageId;

        /**
         * <p>The maximum hourly price of the compute nodes. The value can be accurate to three decimal places. The parameter takes effect only when SpotStrategy is set to SpotWithPriceLimit.</p>
         */
        @NameInMap("QueueName")
        public String queueName;

        /**
         * <p>The protection period of the preemptible instance. Unit: hours. Valid values: 0 to 1. Default value: 1. A value of 0 means no protection period is specified.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("SortedByInventory")
        public Boolean sortedByInventory;

        /**
         * <p>The interruption mode of the preemptible instance. Default value: Terminate. Set the value to Terminate, which indicates that the instance is released.</p>
         */
        @NameInMap("SpotPriceLimit")
        public Float spotPriceLimit;

        /**
         * <p>The ID of the resource group to which the compute nodes belong.</p>
         */
        @NameInMap("SpotStrategy")
        public String spotStrategy;

        /**
         * <p>The name of the queue.</p>
         */
        @NameInMap("SystemDiskCategory")
        public String systemDiskCategory;

        /**
         * <p>The bidding method of the compute nodes. Valid values:</p>
         * <br>
         * <p>*   NoSpot: The compute nodes are pay-as-you-go instances.</p>
         * <p>*   SpotWithPriceLimit: The compute nodes are preemptible instances that have a user-defined maximum hourly price.</p>
         * <p>*   SpotAsPriceGo: The compute nodes are preemptible instances for which the market price at the time of purchase is used as the bid price.</p>
         */
        @NameInMap("SystemDiskLevel")
        public String systemDiskLevel;

        /**
         * <p>The prefix of the hostname. You can query compute nodes that have a specified prefix.</p>
         */
        @NameInMap("SystemDiskSize")
        public Integer systemDiskSize;

        public static GetAutoScaleConfigResponseBodyQueuesQueueInfo build(java.util.Map<String, ?> map) throws Exception {
            GetAutoScaleConfigResponseBodyQueuesQueueInfo self = new GetAutoScaleConfigResponseBodyQueuesQueueInfo();
            return TeaModel.build(map, self);
        }

        public GetAutoScaleConfigResponseBodyQueuesQueueInfo setAutoMinNodesPerCycle(Boolean autoMinNodesPerCycle) {
            this.autoMinNodesPerCycle = autoMinNodesPerCycle;
            return this;
        }
        public Boolean getAutoMinNodesPerCycle() {
            return this.autoMinNodesPerCycle;
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
