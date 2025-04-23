// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class SetAutoScaleConfigRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ehpc-hz-FYUr32****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>Specifies whether to enable hyper-threading for the ECS instance that is used as the compute node.</p>
     * <blockquote>
     * <p> You can only disable hyper-threading for some instance types. The hyper-threading is enabled for ECS instances by default. For more information, see <a href="https://help.aliyun.com/document_detail/145895.html">Specify and view CPU options</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ComputeEnableHt")
    public Boolean computeEnableHt;

    /**
     * <p>The configurations of DNS.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;{\&quot;DnsType\&quot;:\&quot;PrivateZone\&quot;,\&quot;DnsName\&quot;:\&quot;xxxxx\&quot;}&quot;</p>
     */
    @NameInMap("DnsConfig")
    public String dnsConfig;

    /**
     * <p>Specifies whether to enable auto scale-out. Valid values:</p>
     * <ul>
     * <li>true: enables auto scale-out.</li>
     * <li>false: disables auto scale-out.</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableAutoGrow")
    public Boolean enableAutoGrow;

    /**
     * <p>Specifies whether to enable auto scale-in. Valid values:</p>
     * <ul>
     * <li>true: enables auto scale-in.</li>
     * <li>false: disables auto scale-in.</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableAutoShrink")
    public Boolean enableAutoShrink;

    /**
     * <p>The compute nodes that are excluded from auto scaling tasks. Separate multiple compute nodes with commas (,).</p>
     * <p>If you want to retain a compute node, you can specify the node as an additional node to retain the node when it is idle.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp19lgqwxb4206t5****,i-bp1g4hvzs9pywrhb****</p>
     */
    @NameInMap("ExcludeNodes")
    public String excludeNodes;

    /**
     * <p>The percentage of extra compute nodes. Valid values: 0 to 100.</p>
     * <p>Default value: 0.</p>
     * <p>If you need to add 100 compute nodes and the value of the ExtraNodesGrowRatio parameter is 2, 102 compute nodes are added.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ExtraNodesGrowRatio")
    public Integer extraNodesGrowRatio;

    /**
     * <p>The interval between two consecutive rounds of scale-out. Unit: minutes.</p>
     * <p>Valid values: 2 to 10.</p>
     * <p>Default value: 2.</p>
     * <blockquote>
     * <p>An interval may exist during multiple rounds of a scale-out task or between two consecutive scale-out tasks.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("GrowIntervalInMinutes")
    public Integer growIntervalInMinutes;

    /**
     * <p>The percentage of each round of a scale-out task. Valid values: 1 to 100.</p>
     * <p>Default value: 100.</p>
     * <p>If you set GrowRatio to 50, the scale-out has two rounds. Each round completes half of the scale-out.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("GrowRatio")
    public Integer growRatio;

    /**
     * <p>The scale-out timeout period. Unit: minutes.</p>
     * <p>Valid values: 10 to 60.</p>
     * <p>Default value: 20.</p>
     * <p>If the scale-out timeout period has been reached but the scale-out nodes still do not reach the Running state, the system releases them.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("GrowTimeoutInMinutes")
    public Integer growTimeoutInMinutes;

    /**
     * <p>The IDs of the images.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>If both <code>Queues.N.QueueImageId</code> and <code>ImageId</code> are specified, <code>Queues.N.QueueImageId</code> prevails.</p>
     * </li>
     * <li><p>If you set <code>Queues.N.QueueImageId</code> or <code>ImageId</code>, the parameter that you set takes effect.</p>
     * </li>
     * <li><p>If you leave both <code>Queues.N.QueueImageId</code> and <code>ImageId</code> empty, the image that was specified when you created the cluster or the last time you scaled out the cluster is used by default.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>centos_7_03_64_20G_alibase_201708****</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The maximum number of compute nodes that can be added to the cluster. Valid values: 0 to 500.</p>
     * <p>Default value: 100.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxNodesInCluster")
    public Integer maxNodesInCluster;

    /**
     * <p>The information about the queue.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("Queues")
    public java.util.List<SetAutoScaleConfigRequestQueues> queues;

    /**
     * <p>The number of consecutive times that a compute node is idle during the resource scale-in check.</p>
     * <p>Valid values: 2 to 5.</p>
     * <p>Default value: 3.</p>
     * <p>If the parameter is set to 3, a compute node is idle more than three consecutive times. In this case, the node is released. If a compute node is idle for longer than 6 minutes continuously, it is released by default. This is because the default value of the ShrinkIntervalInMinutes parameter is 2.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("ShrinkIdleTimes")
    public Integer shrinkIdleTimes;

    /**
     * <p>The interval between two consecutive rounds of scale-in. Unit: minutes.</p>
     * <p>Valid values: 2 to 10.</p>
     * <p>Default value: 2.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ShrinkIntervalInMinutes")
    public Integer shrinkIntervalInMinutes;

    /**
     * <p>The maximum hourly price of the compute nodes. The value can be accurate to three decimal places. The parameter takes effect only when <code>SpotStrategy</code> is set to <code>SpotWithPriceLimit</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>0.062</p>
     */
    @NameInMap("SpotPriceLimit")
    public Float spotPriceLimit;

    /**
     * <p>The preemption policy of the compute nodes. Valid values:</p>
     * <ul>
     * <li>NoSpot: The compute nodes are pay-as-you-go instances.</li>
     * <li>SpotWithPriceLimit: The compute nodes are preemptible instances that have a user-defined maximum hourly price.</li>
     * <li>SpotAsPriceGo: The compute nodes are preemptible instances for which the market price at the time of purchase is used as the bid price.</li>
     * </ul>
     * <p>Default value: NoSpot.</p>
     * 
     * <strong>example:</strong>
     * <p>SpotWithPriceLimit</p>
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
         * <p>The category of the data disk. Valid values:</p>
         * <ul>
         * <li>cloud_efficiency: ultra disk.</li>
         * <li>cloud_ssd: standard SSD.</li>
         * <li>cloud_essd: ESSD.</li>
         * <li>cloud: basic disk.</li>
         * </ul>
         * <p>Default value: cloud_efficiency.</p>
         * <p>Valid values of N: 0 to 16.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_efficiency</p>
         */
        @NameInMap("DataDiskCategory")
        public String dataDiskCategory;

        /**
         * <p>Specifies whether the data disk is released when the node is released. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <p>Default value: true.</p>
         * <p>Valid values of N: 0 to 16.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DataDiskDeleteWithInstance")
        public Boolean dataDiskDeleteWithInstance;

        /**
         * <p>Specifies whether to encrypt the data disk. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <p>Default value: false.</p>
         * <p>Valid values of N: 0 to 16.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("DataDiskEncrypted")
        public Boolean dataDiskEncrypted;

        /**
         * <p>The Key Management Service (KMS) key ID of the data disk.</p>
         * <p>Valid values of N: 0 to 16.</p>
         * 
         * <strong>example:</strong>
         * <p>0e478b7a-4262-4802-b8cb-00d3fb40826X</p>
         */
        @NameInMap("DataDiskKMSKeyId")
        public String dataDiskKMSKeyId;

        /**
         * <p>The performance level of the ESSD used as the data disk. The parameter takes effect only when the Queues.N.DataDisks.N.DataDiskCategory parameter is set to cloud_essd. Valid values:</p>
         * <ul>
         * <li>PL0: An ESSD can deliver up to 10,000 random read/write IOPS.</li>
         * <li>PL1: An ESSD can deliver up to 50,000 random read/write IOPS.</li>
         * <li>PL2: An ESSD can deliver up to 100,000 random read/write IOPS.</li>
         * <li>PL3: An ESSD can deliver up to 1,000,000 random read/write IOPS.</li>
         * </ul>
         * <p>Default value: PL1.</p>
         * <p>Valid values of N: 0 to 16.</p>
         * 
         * <strong>example:</strong>
         * <p>PL1</p>
         */
        @NameInMap("DataDiskPerformanceLevel")
        public String dataDiskPerformanceLevel;

        /**
         * <p>The size of the data disk. Unit: GB.</p>
         * <p>Valid values: 40 to 500.</p>
         * <p>Default value: 40.</p>
         * <p>Valid values of N: 0 to 16.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
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
         * <p>The instance type of the compute nodes that are automatically added to the queue.</p>
         * <p>You can specify the specification for 1 to 8 nodes.</p>
         * <p>The instance types of N compute nodes in the queue can be set at the same time when auto scaling is performed in the queue. Valid values of N: 0 to 500.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.n1.tiny</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The protection period of the preemptible instance. Unit: hours. Valid values: 0 to 1. A value of 0 means that no protection period is specified. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SpotDuration")
        public Integer spotDuration;

        /**
         * <p>The interruption mode of the preemptible instance. The value can only be Terminate, which indicates that the instance is released.</p>
         * 
         * <strong>example:</strong>
         * <p>Terminate</p>
         */
        @NameInMap("SpotInterruptionBehavior")
        public String spotInterruptionBehavior;

        /**
         * <p>The maximum hourly price of the compute nodes that are automatically added to the queue. The value can be accurate to three decimal places. The parameter takes effect only when <code>Queues.N.InstanceTypes.N.SpotStrategy</code> is set to <code>SpotWithPriceLimit</code>.</p>
         * <p>You can specify the maximum hourly price for 1 to 8 compute nodes.</p>
         * <p>The maximum hourly prices of N compute nodes in the queue can be set at the same time when auto scaling is performed in the queue. Valid values of N: 0 to 500.</p>
         * 
         * <strong>example:</strong>
         * <p>0.660</p>
         */
        @NameInMap("SpotPriceLimit")
        public Float spotPriceLimit;

        /**
         * <p>The preemption policy for the compute node that is automatically added to the queue. Valid values:</p>
         * <ul>
         * <li>NoSpot: The compute node is created as a pay-as-you-go instance.</li>
         * <li>SpotWithPriceLimit: The compute node is created as a preemptible instance that has a user-defined maximum hourly price.</li>
         * <li>SpotAsPriceGo: The compute node is created as a preemptible instance for which the market price at the time of purchase is used as the bid price.</li>
         * </ul>
         * <p>Default value: NoSpot.</p>
         * <p>You can specify the preemption policy for 1 to 8 compute nodes.</p>
         * <p>The preemption policies of N compute nodes in the queue can be set at the same time when auto scaling is performed in the queue. Valid values of N: 0 to 500.</p>
         * 
         * <strong>example:</strong>
         * <p>SpotWithPriceLimit</p>
         */
        @NameInMap("SpotStrategy")
        public String spotStrategy;

        /**
         * <p>The vSwitch ID of the compute nodes that are automatically added to the queue.</p>
         * <p>You can specify 1 to 8 IDs.</p>
         * <p>The vSwitch IDs of N compute nodes in the queue can be set at the same time when auto scaling is performed in the queue. Valid values of N: 0 to 500.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1lfcjbfb099rrjn****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The ID of the zone that compute nodes automatically added to the queue belong.</p>
         * <p>You can specify 1 to 8 IDs.</p>
         * <p>The zone IDs of N compute nodes in the queue can be set at the same time when auto scaling is performed in the queue. Valid values of N: 0 to 500.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-b</p>
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
         * <p>Specifies whether to automatically specify the minimum number of compute nodes that can be added in each round of scale-out. If you set this parameter to true, the minimum number of nodes for each scale-out is equal to the number of nodes required by the job. The maximum number is 99.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AutoMinNodesPerCycle")
        public Boolean autoMinNodesPerCycle;

        /**
         * <p>The list of data disks.</p>
         */
        @NameInMap("DataDisks")
        public java.util.List<SetAutoScaleConfigRequestQueuesDataDisks> dataDisks;

        /**
         * <p>Specifies whether the queue enables auto scale-out. Valid values:</p>
         * <ul>
         * <li>true: enables auto scale-out.</li>
         * <li>false: disables auto scale-out.</li>
         * </ul>
         * <p>Valid values of N: 1 to 8.</p>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableAutoGrow")
        public Boolean enableAutoGrow;

        /**
         * <p>Specifies whether the queue enables auto scale-in. Valid values:</p>
         * <ul>
         * <li>true: enables auto scale-in.</li>
         * <li>false: disables auto scale-in.</li>
         * </ul>
         * <p>Valid values of N: 1 to 8.</p>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableAutoShrink")
        public Boolean enableAutoShrink;

        /**
         * <p>The hostname prefix of the host that is used to perform scale-out for the queue. You can manage compute nodes that have a specified hostname prefix.</p>
         * <p>Valid values of N: 1 to 8.</p>
         * 
         * <strong>example:</strong>
         * <p>compute</p>
         */
        @NameInMap("HostNamePrefix")
        public String hostNamePrefix;

        /**
         * <p>The hostname suffix of the host that is used to perform scale-out for the queue. You can manage nodes that have a specified hostname suffix.</p>
         * <p>Valid values of N: 1 to 8.</p>
         * 
         * <strong>example:</strong>
         * <p>000</p>
         */
        @NameInMap("HostNameSuffix")
        public String hostNameSuffix;

        /**
         * <p>The instance type of the compute nodes that are automatically added to the queue. Valid values of N: 1 to 8.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.n1.medium</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The instance types of the nodes in the queue.</p>
         */
        @NameInMap("InstanceTypes")
        public java.util.List<SetAutoScaleConfigRequestQueuesInstanceTypes> instanceTypes;

        /**
         * <p>The maximum number of compute nodes that can be added to the queue. Valid values: 0 to 500.</p>
         * <p>Valid values of N: 1 to 8.</p>
         * <p>Default value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("MaxNodesInQueue")
        public Integer maxNodesInQueue;

        /**
         * <p>The maximum number of compute nodes that can be added in each round of scale-out. Valid values: 0 to 99.</p>
         * <p>Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("MaxNodesPerCycle")
        public Long maxNodesPerCycle;

        /**
         * <p>The minimum number of compute nodes that can be removed from the queue. Valid values: 0 to 50.</p>
         * <p>Valid values of N: 1 to 8.</p>
         * <p>Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MinNodesInQueue")
        public Integer minNodesInQueue;

        /**
         * <p>The minimum number of compute nodes that can be added in each round of scale-out. Valid values: 1 to 99</p>
         * <p>Default value: 1.</p>
         * <p>If the number of compute nodes that you want to add in a round is less than the value of this property, the system automatically changes the value of this property to the number of compute nodes that you want to add in a round. This helps ensure that compute nodes can be added as expected.</p>
         * <blockquote>
         * <p> The configuration takes effect only for the minimum compute nodes that can be added in the current round.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("MinNodesPerCycle")
        public Long minNodesPerCycle;

        /**
         * <p>The image ID of the queue where the scale-out is performed. Valid values of N: 1 to 8.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>If you set both <code>Queues.N.QueueImageId</code> and <code>ImageId</code>, <code>Queues.N.QueueImageId</code> prevails.</p>
         * </li>
         * <li><p>If you set <code>Queues.N.QueueImageId</code> or <code>ImageId</code>, the parameter that you set takes effect.</p>
         * </li>
         * <li><p>If you leave both <code>Queues.N.QueueImageId</code> and <code>ImageId</code> empty, the image that was specified when you created the cluster or the last time when you scaled out the cluster is used by default.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>centos_7_03_64_20G_alibase_201708****</p>
         */
        @NameInMap("QueueImageId")
        public String queueImageId;

        /**
         * <p>The name of the queue. You can specify 1 to 8 names.</p>
         * 
         * <strong>example:</strong>
         * <p>cluster1</p>
         */
        @NameInMap("QueueName")
        public String queueName;

        /**
         * <p>Specifies whether the instances are unordered. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <blockquote>
         * <p> If you set this parameter to true, the system selects instance types in descending order of the number of instances in stock during auto scaling.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("SortedByInventory")
        public Boolean sortedByInventory;

        /**
         * <p>The maximum hourly price of the compute nodes that are automatically added to the queue. The value can be accurate to three decimal places. The parameter takes effect only when <code>Queues.N.SpotStrategy</code> is set to <code>SpotWithPriceLimit</code>.</p>
         * <p>Valid values of N: 1 to 8.</p>
         * 
         * <strong>example:</strong>
         * <p>0.662</p>
         */
        @NameInMap("SpotPriceLimit")
        public Float spotPriceLimit;

        /**
         * <p>The preemption policy of the compute node that is automatically added to the queue. Valid values of N: 1 to 8.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>NoSpot: The compute node is created as a pay-as-you-go instance.</li>
         * <li>SpotWithPriceLimit: The compute node is created as a preemptible instance that has a user-defined maximum hourly price.</li>
         * <li>SpotAsPriceGo: The compute node is created as a preemptible instance for which the market price at the time of purchase is used as the bid price.</li>
         * </ul>
         * <p>Default value: NoSpot.</p>
         * 
         * <strong>example:</strong>
         * <p>NoSpot</p>
         */
        @NameInMap("SpotStrategy")
        public String spotStrategy;

        /**
         * <p>The category of the system disk specified for the compute nodes that are added to the queue. Valid values:</p>
         * <ul>
         * <li>cloud_efficiency: ultra disk.</li>
         * <li>cloud_ssd: standard SSD.</li>
         * <li>cloud_essd: enhanced SSD (ESSD).</li>
         * <li>cloud: basic disk. Disks of this type are retired.</li>
         * </ul>
         * <p>Valid values of N: 1 to 8.</p>
         * <p>Default value: cloud_efficiency.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_efficiency</p>
         */
        @NameInMap("SystemDiskCategory")
        public String systemDiskCategory;

        /**
         * <p>The performance level of the system disk specified for the compute nodes that are added to the queue. Valid values:</p>
         * <ul>
         * <li>PL0: An ESSD can deliver up to 10,000 random read/write IOPS.</li>
         * <li>PL1: An ESSD can deliver up to 50,000 random read/write IOPS.</li>
         * <li>PL2: An ESSD can deliver up to 100,000 random read/write IOPS.</li>
         * <li>PL3: An ESSD can deliver up to 1,000,000 random read/write IOPS.</li>
         * </ul>
         * <p>Valid values of N: 1 to 8.</p>
         * <p>Default value: PL1.</p>
         * 
         * <strong>example:</strong>
         * <p>PL1</p>
         */
        @NameInMap("SystemDiskLevel")
        public String systemDiskLevel;

        /**
         * <p>The size of the system disk specified for the compute nodes that are added to the queue. Unit: GB.</p>
         * <p>Valid values: 40 to 500.</p>
         * <p>Valid values of N: 1 to 8.</p>
         * <p>Default value: 40.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("SystemDiskSize")
        public Integer systemDiskSize;

        public static SetAutoScaleConfigRequestQueues build(java.util.Map<String, ?> map) throws Exception {
            SetAutoScaleConfigRequestQueues self = new SetAutoScaleConfigRequestQueues();
            return TeaModel.build(map, self);
        }

        public SetAutoScaleConfigRequestQueues setAutoMinNodesPerCycle(Boolean autoMinNodesPerCycle) {
            this.autoMinNodesPerCycle = autoMinNodesPerCycle;
            return this;
        }
        public Boolean getAutoMinNodesPerCycle() {
            return this.autoMinNodesPerCycle;
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
