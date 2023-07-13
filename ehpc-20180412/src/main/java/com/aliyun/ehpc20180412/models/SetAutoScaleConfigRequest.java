// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class SetAutoScaleConfigRequest extends TeaModel {
    /**
     * <p>## Usage notes</p>
     * <br>
     * <p>If the settings in the Queue Configuration section are different from the settings in the Global Configurations section, the former prevails.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The minimum number of compute nodes that can be added in each round of an auto scale-out task. Valid values: 1 to 99.</p>
     * <br>
     * <p>Default value: 1.</p>
     * <br>
     * <p>If the number of compute nodes that you want to add in a round is less than the value of this property, the system automatically changes the value of this property to the number of compute nodes that you want to add in a round. This helps ensure that compute nodes can be added as expected.</p>
     * <br>
     * <p>> The configuration takes effect only for the minimum compute nodes that can be added in the current round.</p>
     */
    @NameInMap("ComputeEnableHt")
    public Boolean computeEnableHt;

    @NameInMap("DnsConfig")
    public String dnsConfig;

    /**
     * <p>The ID of the cluster.</p>
     */
    @NameInMap("EnableAutoGrow")
    public Boolean enableAutoGrow;

    /**
     * <p>Specifies whether to enable auto scale-out. Valid values:</p>
     * <br>
     * <p>*   true: enables auto scale-out.</p>
     * <p>*   false: disables auto scale-out.</p>
     * <br>
     * <p>Default value: false.</p>
     */
    @NameInMap("EnableAutoShrink")
    public Boolean enableAutoShrink;

    /**
     * <p>The maximum number of compute nodes that can be added to the cluster. Valid values: 0 to 500.</p>
     * <br>
     * <p>Default value: 100.</p>
     */
    @NameInMap("ExcludeNodes")
    public String excludeNodes;

    /**
     * <p>The scale-out timeout period. Unit: minutes.</p>
     * <br>
     * <p>Valid values: 10 to 60.</p>
     * <br>
     * <p>Default value: 20.</p>
     * <br>
     * <p>If the scale-out timeout period has been reached but the scale-out nodes still do not reach the Running state, the system releases them.</p>
     */
    @NameInMap("ExtraNodesGrowRatio")
    public Integer extraNodesGrowRatio;

    /**
     * <p>Specifies whether to enable auto scale-in. Valid values:</p>
     * <br>
     * <p>*   true: enables auto scale-in.</p>
     * <p>*   false: disables auto scale-in.</p>
     * <br>
     * <p>Default value: false.</p>
     */
    @NameInMap("GrowIntervalInMinutes")
    public Integer growIntervalInMinutes;

    /**
     * <p>The percentage of extra compute nodes. Valid values: 0 to 100.</p>
     * <br>
     * <p>Default value: 0.</p>
     * <br>
     * <p>If you need to add 100 compute nodes and the value of the ExtraNodesGrowRatio parameter is 2, 102 compute nodes are added.</p>
     */
    @NameInMap("GrowRatio")
    public Integer growRatio;

    /**
     * <p>The number of consecutive times that a compute node is idle during the resource scale-in check.</p>
     * <br>
     * <p>Valid values: 2 to 5.</p>
     * <br>
     * <p>Default value: 3.</p>
     * <br>
     * <p>If the parameter is set to 3, a compute node is released if it is idle for more than three consecutive times. If a compute node is idle for more than 6 minutes in a row, it is released by default. This is because the default value of the ShrinkIntervalInMinutes parameter is 2.</p>
     */
    @NameInMap("GrowTimeoutInMinutes")
    public Integer growTimeoutInMinutes;

    /**
     * <p>The maximum hourly price of the compute nodes. The value can be accurate to three decimal places. The parameter takes effect only when `SpotStrategy` is set to `SpotWithPriceLimit`.</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The percentage of each round of a scale-out task. Valid values: 1 to 100.</p>
     * <br>
     * <p>Default value: 100.</p>
     * <br>
     * <p>If you set GrowRatio to 50, the scale-out has two rounds. Each round completes half of the scale-out.</p>
     */
    @NameInMap("MaxNodesInCluster")
    public Integer maxNodesInCluster;

    /**
     * <p>The IDs of the images.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   If both `Queues.N.QueueImageId` and `ImageId` are specified, `Queues.N.QueueImageId` prevails.</p>
     * <br>
     * <p>*   If you set `Queues.N.QueueImageId` or `ImageId`, the parameter that you set takes effect.</p>
     * <p>*   If you leave both `Queues.N.QueueImageId` and `ImageId` empty, the image that was specified when you created the cluster or the last time when you scaled out the cluster is used by default.</p>
     */
    @NameInMap("Queues")
    public java.util.List<SetAutoScaleConfigRequestQueues> queues;

    /**
     * <p>The interval between two consecutive rounds of scale-in. Unit: minutes.</p>
     * <br>
     * <p>Valid values: 2 to 10.</p>
     * <br>
     * <p>Default value: 2.</p>
     */
    @NameInMap("ShrinkIdleTimes")
    public Integer shrinkIdleTimes;

    /**
     * <p>The interval between two consecutive rounds of scale-out. Unit: minutes.</p>
     * <br>
     * <p>Valid values: 2 to 10.</p>
     * <br>
     * <p>Default value: 2.</p>
     * <br>
     * <p>> An interval may exist during multiple rounds of a scale-out task or between two consecutive scale-out tasks.</p>
     */
    @NameInMap("ShrinkIntervalInMinutes")
    public Integer shrinkIntervalInMinutes;

    /**
     * <p>The preemption policy of the compute nodes. Valid values:</p>
     * <br>
     * <p>*   NoSpot: The compute nodes are pay-as-you-go instances.</p>
     * <p>*   SpotWithPriceLimit: The compute nodes are preemptible instances that have a user-defined maximum hourly price.</p>
     * <p>*   SpotAsPriceGo: The compute nodes are preemptible instances for which the market price at the time of purchase is used as the bid price.</p>
     * <br>
     * <p>Default value: NoSpot.</p>
     */
    @NameInMap("SpotPriceLimit")
    public Float spotPriceLimit;

    /**
     * <p>The compute nodes that are excluded from auto scaling tasks. Separate multiple compute nodes with commas (,).</p>
     * <br>
     * <p>If you want to retain a compute node, you can specify the node as an additional node to retain the node when it is idle.</p>
     */
    @NameInMap("SpotStrategy")
    public String spotStrategy;

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

    public SetAutoScaleConfigRequest setComputeEnableHt(Boolean computeEnableHt) {
        this.computeEnableHt = computeEnableHt;
        return this;
    }
    public Boolean getComputeEnableHt() {
        return this.computeEnableHt;
    }

    public SetAutoScaleConfigRequest setDnsConfig(String dnsConfig) {
        this.dnsConfig = dnsConfig;
        return this;
    }
    public String getDnsConfig() {
        return this.dnsConfig;
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

    public SetAutoScaleConfigRequest setExcludeNodes(String excludeNodes) {
        this.excludeNodes = excludeNodes;
        return this;
    }
    public String getExcludeNodes() {
        return this.excludeNodes;
    }

    public SetAutoScaleConfigRequest setExtraNodesGrowRatio(Integer extraNodesGrowRatio) {
        this.extraNodesGrowRatio = extraNodesGrowRatio;
        return this;
    }
    public Integer getExtraNodesGrowRatio() {
        return this.extraNodesGrowRatio;
    }

    public SetAutoScaleConfigRequest setGrowIntervalInMinutes(Integer growIntervalInMinutes) {
        this.growIntervalInMinutes = growIntervalInMinutes;
        return this;
    }
    public Integer getGrowIntervalInMinutes() {
        return this.growIntervalInMinutes;
    }

    public SetAutoScaleConfigRequest setGrowRatio(Integer growRatio) {
        this.growRatio = growRatio;
        return this;
    }
    public Integer getGrowRatio() {
        return this.growRatio;
    }

    public SetAutoScaleConfigRequest setGrowTimeoutInMinutes(Integer growTimeoutInMinutes) {
        this.growTimeoutInMinutes = growTimeoutInMinutes;
        return this;
    }
    public Integer getGrowTimeoutInMinutes() {
        return this.growTimeoutInMinutes;
    }

    public SetAutoScaleConfigRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public SetAutoScaleConfigRequest setMaxNodesInCluster(Integer maxNodesInCluster) {
        this.maxNodesInCluster = maxNodesInCluster;
        return this;
    }
    public Integer getMaxNodesInCluster() {
        return this.maxNodesInCluster;
    }

    public SetAutoScaleConfigRequest setQueues(java.util.List<SetAutoScaleConfigRequestQueues> queues) {
        this.queues = queues;
        return this;
    }
    public java.util.List<SetAutoScaleConfigRequestQueues> getQueues() {
        return this.queues;
    }

    public SetAutoScaleConfigRequest setShrinkIdleTimes(Integer shrinkIdleTimes) {
        this.shrinkIdleTimes = shrinkIdleTimes;
        return this;
    }
    public Integer getShrinkIdleTimes() {
        return this.shrinkIdleTimes;
    }

    public SetAutoScaleConfigRequest setShrinkIntervalInMinutes(Integer shrinkIntervalInMinutes) {
        this.shrinkIntervalInMinutes = shrinkIntervalInMinutes;
        return this;
    }
    public Integer getShrinkIntervalInMinutes() {
        return this.shrinkIntervalInMinutes;
    }

    public SetAutoScaleConfigRequest setSpotPriceLimit(Float spotPriceLimit) {
        this.spotPriceLimit = spotPriceLimit;
        return this;
    }
    public Float getSpotPriceLimit() {
        return this.spotPriceLimit;
    }

    public SetAutoScaleConfigRequest setSpotStrategy(String spotStrategy) {
        this.spotStrategy = spotStrategy;
        return this;
    }
    public String getSpotStrategy() {
        return this.spotStrategy;
    }

    public static class SetAutoScaleConfigRequestQueuesDataDisks extends TeaModel {
        /**
         * <p>The size of the data disk. Unit: GB.</p>
         * <br>
         * <p>Valid values: 40 to 500.</p>
         * <br>
         * <p>Default value: 40.</p>
         * <br>
         * <p>Valid values of N: 0 to 16.</p>
         */
        @NameInMap("DataDiskCategory")
        public String dataDiskCategory;

        /**
         * <p>The type of the data disk. Valid values:</p>
         * <br>
         * <p>*   cloud_efficiency: ultra disk</p>
         * <p>*   cloud_ssd: SSD</p>
         * <p>*   cloud_essd: ESSD</p>
         * <p>*   cloud: basic disk</p>
         * <br>
         * <p>Default value: cloud_efficiency.</p>
         * <br>
         * <p>Valid values of N: 0 to 16.</p>
         */
        @NameInMap("DataDiskDeleteWithInstance")
        public Boolean dataDiskDeleteWithInstance;

        /**
         * <p>The performance level of the ESSD used as the data disk. The parameter takes effect only when the Queues.N.DataDisks.N.DataDiskCategory parameter is set to cloud_essd. Valid values:</p>
         * <br>
         * <p>*   PL0: A single ESSD can deliver up to 10,000 random read/write IOPS.</p>
         * <p>*   PL1: A single ESSD can deliver up to 50,000 random read/write IOPS.</p>
         * <p>*   PL2: A single ESSD can deliver up to 100,000 random read/write IOPS.</p>
         * <p>*   PL3: A single ESSD can deliver up to 1,000,000 random read/write IOPS.</p>
         * <br>
         * <p>Default value: PL1.</p>
         * <br>
         * <p>Valid values of N: 0 to 16.</p>
         */
        @NameInMap("DataDiskEncrypted")
        public Boolean dataDiskEncrypted;

        /**
         * <p>Specifies whether to encrypt the data disk. Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false</p>
         * <br>
         * <p>Default value: false.</p>
         * <br>
         * <p>Valid values of N: 0 to 16.</p>
         */
        @NameInMap("DataDiskKMSKeyId")
        public String dataDiskKMSKeyId;

        /**
         * <p>Specifies whether the data disk is released when the node is released. Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false</p>
         * <br>
         * <p>Default value: true.</p>
         * <br>
         * <p>Valid values of N: 0 to 16.</p>
         */
        @NameInMap("DataDiskPerformanceLevel")
        public String dataDiskPerformanceLevel;

        /**
         * <p>The list of data disks.</p>
         */
        @NameInMap("DataDiskSize")
        public Integer dataDiskSize;

        public static SetAutoScaleConfigRequestQueuesDataDisks build(java.util.Map<String, ?> map) throws Exception {
            SetAutoScaleConfigRequestQueuesDataDisks self = new SetAutoScaleConfigRequestQueuesDataDisks();
            return TeaModel.build(map, self);
        }

        public SetAutoScaleConfigRequestQueuesDataDisks setDataDiskCategory(String dataDiskCategory) {
            this.dataDiskCategory = dataDiskCategory;
            return this;
        }
        public String getDataDiskCategory() {
            return this.dataDiskCategory;
        }

        public SetAutoScaleConfigRequestQueuesDataDisks setDataDiskDeleteWithInstance(Boolean dataDiskDeleteWithInstance) {
            this.dataDiskDeleteWithInstance = dataDiskDeleteWithInstance;
            return this;
        }
        public Boolean getDataDiskDeleteWithInstance() {
            return this.dataDiskDeleteWithInstance;
        }

        public SetAutoScaleConfigRequestQueuesDataDisks setDataDiskEncrypted(Boolean dataDiskEncrypted) {
            this.dataDiskEncrypted = dataDiskEncrypted;
            return this;
        }
        public Boolean getDataDiskEncrypted() {
            return this.dataDiskEncrypted;
        }

        public SetAutoScaleConfigRequestQueuesDataDisks setDataDiskKMSKeyId(String dataDiskKMSKeyId) {
            this.dataDiskKMSKeyId = dataDiskKMSKeyId;
            return this;
        }
        public String getDataDiskKMSKeyId() {
            return this.dataDiskKMSKeyId;
        }

        public SetAutoScaleConfigRequestQueuesDataDisks setDataDiskPerformanceLevel(String dataDiskPerformanceLevel) {
            this.dataDiskPerformanceLevel = dataDiskPerformanceLevel;
            return this;
        }
        public String getDataDiskPerformanceLevel() {
            return this.dataDiskPerformanceLevel;
        }

        public SetAutoScaleConfigRequestQueuesDataDisks setDataDiskSize(Integer dataDiskSize) {
            this.dataDiskSize = dataDiskSize;
            return this;
        }
        public Integer getDataDiskSize() {
            return this.dataDiskSize;
        }

    }

    public static class SetAutoScaleConfigRequestQueuesInstanceTypes extends TeaModel {
        /**
         * <p>The maximum hourly price of the compute nodes that are automatically added in the queue. The value can be accurate to three decimal places. The parameter takes effect only when `Queues.N.InstanceTypes.N.SpotStrategy` is set to `SpotWithPriceLimit`.</p>
         * <br>
         * <p>The names of N queues can be set at the same time. Valid values of N: 1 to 8.</p>
         * <br>
         * <p>The maximum hourly prices of N compute nodes in the queue can be set at the same time when auto scaling is performed in the queue. Valid values of N: 0 to 500.</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The bidding method of the compute nodes that are automatically added in the queue. Valid values:</p>
         * <br>
         * <p>*   NoSpot: The compute nodes are pay-as-you-go instances.</p>
         * <p>*   SpotWithPriceLimit: The compute nodes are preemptible instances that have a user-defined maximum hourly price.</p>
         * <p>*   SpotAsPriceGo: The compute nodes are preemptible instances for which the market price at the time of purchase is used as the bid price.</p>
         * <br>
         * <p>Default value: NoSpot.</p>
         * <br>
         * <p>The names of N queues can be set at the same time. Valid values of N: 1 to 8.</p>
         * <br>
         * <p>The bidding methods of N compute nodes in the queue can be set at the same time when auto scaling is performed in the queue. Valid values of N: 0 to 500.</p>
         */
        @NameInMap("SpotDuration")
        public Integer spotDuration;

        /**
         * <p>The protection period of the preemptible instance. Unit: hours. Valid values: 0 to 1. A value of 0 means that no protection period is specified. Default value: 1.</p>
         */
        @NameInMap("SpotInterruptionBehavior")
        public String spotInterruptionBehavior;

        /**
         * <p>The zone ID of the compute nodes that are automatically added to the queues.</p>
         * <br>
         * <p>The names of N queues can be set at the same time. Valid values of N: 1 to 8.</p>
         * <br>
         * <p>The zone IDs of N compute nodes in the queue can be set at the same time when auto scaling is performed in the queue. Valid values of N: 0 to 500.</p>
         */
        @NameInMap("SpotPriceLimit")
        public Float spotPriceLimit;

        /**
         * <p>The instance type of the compute nodes that are automatically added in the queue.</p>
         * <br>
         * <p>The names of N queues can be set at the same time. Valid values of N: 1 to 8.</p>
         * <br>
         * <p>The instance types of N compute nodes in the queue can be set at the same time when auto scaling is performed in the queue. Valid values of N: 0 to 500.</p>
         */
        @NameInMap("SpotStrategy")
        public String spotStrategy;

        /**
         * <p>The array of node information.</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The vSwitch ID of the compute nodes that are automatically added to the queues.</p>
         * <br>
         * <p>The names of N queues can be set at the same time. Valid values of N: 1 to 8.</p>
         * <br>
         * <p>The vSwitch IDs of N compute nodes in the queue can be set at the same time when auto scaling is performed in the queue. Valid values of N: 0 to 500.</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static SetAutoScaleConfigRequestQueuesInstanceTypes build(java.util.Map<String, ?> map) throws Exception {
            SetAutoScaleConfigRequestQueuesInstanceTypes self = new SetAutoScaleConfigRequestQueuesInstanceTypes();
            return TeaModel.build(map, self);
        }

        public SetAutoScaleConfigRequestQueuesInstanceTypes setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public SetAutoScaleConfigRequestQueuesInstanceTypes setSpotDuration(Integer spotDuration) {
            this.spotDuration = spotDuration;
            return this;
        }
        public Integer getSpotDuration() {
            return this.spotDuration;
        }

        public SetAutoScaleConfigRequestQueuesInstanceTypes setSpotInterruptionBehavior(String spotInterruptionBehavior) {
            this.spotInterruptionBehavior = spotInterruptionBehavior;
            return this;
        }
        public String getSpotInterruptionBehavior() {
            return this.spotInterruptionBehavior;
        }

        public SetAutoScaleConfigRequestQueuesInstanceTypes setSpotPriceLimit(Float spotPriceLimit) {
            this.spotPriceLimit = spotPriceLimit;
            return this;
        }
        public Float getSpotPriceLimit() {
            return this.spotPriceLimit;
        }

        public SetAutoScaleConfigRequestQueuesInstanceTypes setSpotStrategy(String spotStrategy) {
            this.spotStrategy = spotStrategy;
            return this;
        }
        public String getSpotStrategy() {
            return this.spotStrategy;
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

    }

    public static class SetAutoScaleConfigRequestQueues extends TeaModel {
        /**
         * <p>The interruption mode of the preemptible instance. Default value: Terminate. Set the value to Terminate, which indicates that the instance is released.</p>
         */
        @NameInMap("DataDisks")
        public java.util.List<SetAutoScaleConfigRequestQueuesDataDisks> dataDisks;

        /**
         * <p>The name of the queue. The names of N queues can be set at the same time. Valid values of N: 1 to 8.</p>
         */
        @NameInMap("EnableAutoGrow")
        public Boolean enableAutoGrow;

        /**
         * <p>The maximum number of the compute nodes that can be added in the queue. Valid values: 0 to 500.</p>
         * <br>
         * <p>Valid values of N: 1 to 8.</p>
         * <br>
         * <p>Default value: 100.</p>
         */
        @NameInMap("EnableAutoShrink")
        public Boolean enableAutoShrink;

        /**
         * <p>The bidding method of the compute nodes that are automatically added in the queue. Valid values of N: 1 to 8.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   NoSpot: The compute nodes are pay-as-you-go instances.</p>
         * <p>*   SpotWithPriceLimit: The compute nodes are preemptible instances that have a user-defined maximum hourly price.</p>
         * <p>*   SpotAsPriceGo: The compute nodes are preemptible instances for which the market price at the time of purchase is used as the bid price.</p>
         * <br>
         * <p>Default value: NoSpot.</p>
         */
        @NameInMap("HostNamePrefix")
        public String hostNamePrefix;

        /**
         * <p>The instance type of the compute nodes that are automatically added in the queues. Valid values of N: 1 to 8.</p>
         */
        @NameInMap("HostNameSuffix")
        public String hostNameSuffix;

        /**
         * <p>The type of the system disk specified for the compute nodes that are added in the queue. Valid values:</p>
         * <br>
         * <p>*   cloud_efficiency: ultra disk</p>
         * <p>*   cloud_ssd: SSD</p>
         * <p>*   cloud_essd: ESSD</p>
         * <p>*   cloud: basic disk. Disks of this type are retired.</p>
         * <br>
         * <p>Valid values of N: 1 to 8.</p>
         * <br>
         * <p>Default value: cloud_efficiency.</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The maximum hourly price of the compute nodes that are automatically added in the queue. The value can be accurate to three decimal places. The parameter takes effect only when `Queues.N.SpotStrategy` is set to `SpotWithPriceLimit`.</p>
         * <br>
         * <p>Valid values of N: 1 to 8.</p>
         */
        @NameInMap("InstanceTypes")
        public java.util.List<SetAutoScaleConfigRequestQueuesInstanceTypes> instanceTypes;

        /**
         * <p>The size of the system disk specified for the compute nodes that are added to the queue. Unit: GB.</p>
         * <br>
         * <p>Valid values: 40 to 500.</p>
         * <br>
         * <p>Valid values of N: 1 to 8.</p>
         * <br>
         * <p>Default value: 40.</p>
         */
        @NameInMap("MaxNodesInQueue")
        public Integer maxNodesInQueue;

        /**
         * <p>The KMS key ID of the data disk.</p>
         * <br>
         * <p>Valid values of N: 0 to 16.</p>
         */
        @NameInMap("MaxNodesPerCycle")
        public Long maxNodesPerCycle;

        /**
         * <p>The hostname prefix of the host that is used to perform scale-out for the queue. You can manage compute nodes that have a specified hostname prefix.</p>
         * <br>
         * <p>Valid values of N: 1 to 8.</p>
         */
        @NameInMap("MinNodesInQueue")
        public Integer minNodesInQueue;

        /**
         * <p>The maximum number of compute nodes that can be added in each round of an auto scale-out task. Valid values: 0 to 99.</p>
         * <br>
         * <p>Default value: 0.</p>
         */
        @NameInMap("MinNodesPerCycle")
        public Long minNodesPerCycle;

        /**
         * <p>The array of information about queues.</p>
         */
        @NameInMap("QueueImageId")
        public String queueImageId;

        /**
         * <p>Specifies whether the queue enables auto scale-in. Valid values:</p>
         * <br>
         * <p>*   true: enables auto scale-in.</p>
         * <p>*   false: disables auto scale-in</p>
         * <br>
         * <p>Valid values of N: 1 to 8.</p>
         * <br>
         * <p>Default value: false.</p>
         */
        @NameInMap("QueueName")
        public String queueName;

        @NameInMap("SortedByInventory")
        public Boolean sortedByInventory;

        /**
         * <p>The performance level of the system disk specified for the compute nodes that are added to the queue. Valid values:</p>
         * <br>
         * <p>*   PL0: A single ESSD can deliver up to 10,000 random read/write IOPS.</p>
         * <p>*   PL1: A single ESSD can deliver up to 50,000 random read/write IOPS.</p>
         * <p>*   PL2: A single ESSD can deliver up to 100,000 random read/write IOPS.</p>
         * <p>*   PL3: A single ESSD can deliver up to 1,000,000 random read/write IOPS.</p>
         * <br>
         * <p>Valid values of N: 1 to 8.</p>
         * <br>
         * <p>Default value: PL1.</p>
         */
        @NameInMap("SpotPriceLimit")
        public Float spotPriceLimit;

        /**
         * <p>The hostname suffix of the host that is used to perform scale-out for the queue. You can manage nodes that have a specified hostname suffix.</p>
         * <br>
         * <p>Valid values of N: 1 to 8.</p>
         */
        @NameInMap("SpotStrategy")
        public String spotStrategy;

        /**
         * <p>The image ID of the queue where scale-out is performed. Valid values of N: 1 to 8.</p>
         * <br>
         * <p>> </p>
         * <br>
         * <p>*   If both `Queues.N.QueueImageId` and `ImageId` are specified, `Queues.N.QueueImageId` prevails.</p>
         * <br>
         * <p>*   If you set `Queues.N.QueueImageId` or `ImageId`, the parameter that you set takes effect.</p>
         * <p>*   If you leave both `Queues.N.QueueImageId` and `ImageId` empty, the image that was specified when you created the cluster or the last time when you scaled out the cluster is used by default.</p>
         */
        @NameInMap("SystemDiskCategory")
        public String systemDiskCategory;

        /**
         * <p>Specifies whether the queue enables auto scale-out. Valid values:</p>
         * <br>
         * <p>*   true: enables auto scale-out.</p>
         * <p>*   false: disables auto scale-out.</p>
         * <br>
         * <p>Valid values of N: 1 to 8.</p>
         * <br>
         * <p>Default value: false.</p>
         */
        @NameInMap("SystemDiskLevel")
        public String systemDiskLevel;

        /**
         * <p>The minimum number of the compute nodes that can be removed in the queue. Valid values: 0 to 50.</p>
         * <br>
         * <p>Valid values of N: 1 to 8.</p>
         * <br>
         * <p>Default value: 0.</p>
         */
        @NameInMap("SystemDiskSize")
        public Integer systemDiskSize;

        public static SetAutoScaleConfigRequestQueues build(java.util.Map<String, ?> map) throws Exception {
            SetAutoScaleConfigRequestQueues self = new SetAutoScaleConfigRequestQueues();
            return TeaModel.build(map, self);
        }

        public SetAutoScaleConfigRequestQueues setDataDisks(java.util.List<SetAutoScaleConfigRequestQueuesDataDisks> dataDisks) {
            this.dataDisks = dataDisks;
            return this;
        }
        public java.util.List<SetAutoScaleConfigRequestQueuesDataDisks> getDataDisks() {
            return this.dataDisks;
        }

        public SetAutoScaleConfigRequestQueues setEnableAutoGrow(Boolean enableAutoGrow) {
            this.enableAutoGrow = enableAutoGrow;
            return this;
        }
        public Boolean getEnableAutoGrow() {
            return this.enableAutoGrow;
        }

        public SetAutoScaleConfigRequestQueues setEnableAutoShrink(Boolean enableAutoShrink) {
            this.enableAutoShrink = enableAutoShrink;
            return this;
        }
        public Boolean getEnableAutoShrink() {
            return this.enableAutoShrink;
        }

        public SetAutoScaleConfigRequestQueues setHostNamePrefix(String hostNamePrefix) {
            this.hostNamePrefix = hostNamePrefix;
            return this;
        }
        public String getHostNamePrefix() {
            return this.hostNamePrefix;
        }

        public SetAutoScaleConfigRequestQueues setHostNameSuffix(String hostNameSuffix) {
            this.hostNameSuffix = hostNameSuffix;
            return this;
        }
        public String getHostNameSuffix() {
            return this.hostNameSuffix;
        }

        public SetAutoScaleConfigRequestQueues setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public SetAutoScaleConfigRequestQueues setInstanceTypes(java.util.List<SetAutoScaleConfigRequestQueuesInstanceTypes> instanceTypes) {
            this.instanceTypes = instanceTypes;
            return this;
        }
        public java.util.List<SetAutoScaleConfigRequestQueuesInstanceTypes> getInstanceTypes() {
            return this.instanceTypes;
        }

        public SetAutoScaleConfigRequestQueues setMaxNodesInQueue(Integer maxNodesInQueue) {
            this.maxNodesInQueue = maxNodesInQueue;
            return this;
        }
        public Integer getMaxNodesInQueue() {
            return this.maxNodesInQueue;
        }

        public SetAutoScaleConfigRequestQueues setMaxNodesPerCycle(Long maxNodesPerCycle) {
            this.maxNodesPerCycle = maxNodesPerCycle;
            return this;
        }
        public Long getMaxNodesPerCycle() {
            return this.maxNodesPerCycle;
        }

        public SetAutoScaleConfigRequestQueues setMinNodesInQueue(Integer minNodesInQueue) {
            this.minNodesInQueue = minNodesInQueue;
            return this;
        }
        public Integer getMinNodesInQueue() {
            return this.minNodesInQueue;
        }

        public SetAutoScaleConfigRequestQueues setMinNodesPerCycle(Long minNodesPerCycle) {
            this.minNodesPerCycle = minNodesPerCycle;
            return this;
        }
        public Long getMinNodesPerCycle() {
            return this.minNodesPerCycle;
        }

        public SetAutoScaleConfigRequestQueues setQueueImageId(String queueImageId) {
            this.queueImageId = queueImageId;
            return this;
        }
        public String getQueueImageId() {
            return this.queueImageId;
        }

        public SetAutoScaleConfigRequestQueues setQueueName(String queueName) {
            this.queueName = queueName;
            return this;
        }
        public String getQueueName() {
            return this.queueName;
        }

        public SetAutoScaleConfigRequestQueues setSortedByInventory(Boolean sortedByInventory) {
            this.sortedByInventory = sortedByInventory;
            return this;
        }
        public Boolean getSortedByInventory() {
            return this.sortedByInventory;
        }

        public SetAutoScaleConfigRequestQueues setSpotPriceLimit(Float spotPriceLimit) {
            this.spotPriceLimit = spotPriceLimit;
            return this;
        }
        public Float getSpotPriceLimit() {
            return this.spotPriceLimit;
        }

        public SetAutoScaleConfigRequestQueues setSpotStrategy(String spotStrategy) {
            this.spotStrategy = spotStrategy;
            return this;
        }
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

        public SetAutoScaleConfigRequestQueues setSystemDiskCategory(String systemDiskCategory) {
            this.systemDiskCategory = systemDiskCategory;
            return this;
        }
        public String getSystemDiskCategory() {
            return this.systemDiskCategory;
        }

        public SetAutoScaleConfigRequestQueues setSystemDiskLevel(String systemDiskLevel) {
            this.systemDiskLevel = systemDiskLevel;
            return this;
        }
        public String getSystemDiskLevel() {
            return this.systemDiskLevel;
        }

        public SetAutoScaleConfigRequestQueues setSystemDiskSize(Integer systemDiskSize) {
            this.systemDiskSize = systemDiskSize;
            return this;
        }
        public Integer getSystemDiskSize() {
            return this.systemDiskSize;
        }

    }

}
