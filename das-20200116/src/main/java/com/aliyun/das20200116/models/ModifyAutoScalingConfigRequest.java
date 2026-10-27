// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class ModifyAutoScalingConfigRequest extends TeaModel {
    /**
     * <p>The configuration items for the bandwidth elastic scaling feature.</p>
     */
    @NameInMap("Bandwidth")
    public ModifyAutoScalingConfigRequestBandwidth bandwidth;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-2ze8g2am97624****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The configuration items for the resource elastic scaling feature.</p>
     */
    @NameInMap("Resource")
    public ModifyAutoScalingConfigRequestResource resource;

    /**
     * <p>The configuration items for the shard elastic scaling feature.</p>
     */
    @NameInMap("Shard")
    public ModifyAutoScalingConfigRequestShard shard;

    /**
     * <p>The configuration items for the specification elastic scaling feature.</p>
     */
    @NameInMap("Spec")
    public ModifyAutoScalingConfigRequestSpec spec;

    /**
     * <p>The configuration items for the automatic storage expansion feature.</p>
     */
    @NameInMap("Storage")
    public ModifyAutoScalingConfigRequestStorage storage;

    public static ModifyAutoScalingConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAutoScalingConfigRequest self = new ModifyAutoScalingConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAutoScalingConfigRequest setBandwidth(ModifyAutoScalingConfigRequestBandwidth bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public ModifyAutoScalingConfigRequestBandwidth getBandwidth() {
        return this.bandwidth;
    }

    public ModifyAutoScalingConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyAutoScalingConfigRequest setResource(ModifyAutoScalingConfigRequestResource resource) {
        this.resource = resource;
        return this;
    }
    public ModifyAutoScalingConfigRequestResource getResource() {
        return this.resource;
    }

    public ModifyAutoScalingConfigRequest setShard(ModifyAutoScalingConfigRequestShard shard) {
        this.shard = shard;
        return this;
    }
    public ModifyAutoScalingConfigRequestShard getShard() {
        return this.shard;
    }

    public ModifyAutoScalingConfigRequest setSpec(ModifyAutoScalingConfigRequestSpec spec) {
        this.spec = spec;
        return this;
    }
    public ModifyAutoScalingConfigRequestSpec getSpec() {
        return this.spec;
    }

    public ModifyAutoScalingConfigRequest setStorage(ModifyAutoScalingConfigRequestStorage storage) {
        this.storage = storage;
        return this;
    }
    public ModifyAutoScalingConfigRequestStorage getStorage() {
        return this.storage;
    }

    public static class ModifyAutoScalingConfigRequestBandwidth extends TeaModel {
        /**
         * <p>Specifies whether to apply the configurations under the <strong>Bandwidth</strong> configuration item for the bandwidth elastic scaling feature:</p>
         * <ul>
         * <li><strong>true</strong>: Yes.</li>
         * <li><strong>false</strong>: No.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Apply")
        public Boolean apply;

        /**
         * <p>The threshold of average bandwidth usage that triggers automatic bandwidth downgrade. Unit: %. Valid values:</p>
         * <ul>
         * <li><strong>10</strong></li>
         * <li><strong>20</strong></li>
         * <li><strong>30</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("BandwidthUsageLowerThreshold")
        public Integer bandwidthUsageLowerThreshold;

        /**
         * <p>The threshold of average bandwidth usage that triggers automatic bandwidth upgrade. Unit: %. Valid values:</p>
         * <ul>
         * <li><strong>50</strong></li>
         * <li><strong>60</strong></li>
         * <li><strong>70</strong></li>
         * <li><strong>80</strong></li>
         * <li><strong>90</strong></li>
         * <li><strong>95</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>70</p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("BandwidthUsageUpperThreshold")
        public Integer bandwidthUsageUpperThreshold;

        /**
         * <p>Specifies whether to enable automatic bandwidth downgrade:</p>
         * <ul>
         * <li><strong>true</strong>: Yes.</li>
         * <li><strong>false</strong>: No.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Downgrade")
        public Boolean downgrade;

        /**
         * <p>The observation window for automatic bandwidth upgrade. The parameter value consists of a number and a time unit suffix. The time suffix <strong>m</strong> indicates minutes. Valid values:</p>
         * <ul>
         * <li><strong>1m</strong></li>
         * <li><strong>5m</strong></li>
         * <li><strong>10m</strong></li>
         * <li><strong>15m</strong></li>
         * <li><strong>30m</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>5m</p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("ObservationWindowSize")
        public String observationWindowSize;

        /**
         * <p>Specifies whether to enable automatic bandwidth upgrade:</p>
         * <ul>
         * <li><strong>true</strong>: Yes.</li>
         * <li><strong>false</strong>: No.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Upgrade")
        public Boolean upgrade;

        public static ModifyAutoScalingConfigRequestBandwidth build(java.util.Map<String, ?> map) throws Exception {
            ModifyAutoScalingConfigRequestBandwidth self = new ModifyAutoScalingConfigRequestBandwidth();
            return TeaModel.build(map, self);
        }

        public ModifyAutoScalingConfigRequestBandwidth setApply(Boolean apply) {
            this.apply = apply;
            return this;
        }
        public Boolean getApply() {
            return this.apply;
        }

        public ModifyAutoScalingConfigRequestBandwidth setBandwidthUsageLowerThreshold(Integer bandwidthUsageLowerThreshold) {
            this.bandwidthUsageLowerThreshold = bandwidthUsageLowerThreshold;
            return this;
        }
        public Integer getBandwidthUsageLowerThreshold() {
            return this.bandwidthUsageLowerThreshold;
        }

        public ModifyAutoScalingConfigRequestBandwidth setBandwidthUsageUpperThreshold(Integer bandwidthUsageUpperThreshold) {
            this.bandwidthUsageUpperThreshold = bandwidthUsageUpperThreshold;
            return this;
        }
        public Integer getBandwidthUsageUpperThreshold() {
            return this.bandwidthUsageUpperThreshold;
        }

        public ModifyAutoScalingConfigRequestBandwidth setDowngrade(Boolean downgrade) {
            this.downgrade = downgrade;
            return this;
        }
        public Boolean getDowngrade() {
            return this.downgrade;
        }

        public ModifyAutoScalingConfigRequestBandwidth setObservationWindowSize(String observationWindowSize) {
            this.observationWindowSize = observationWindowSize;
            return this;
        }
        public String getObservationWindowSize() {
            return this.observationWindowSize;
        }

        public ModifyAutoScalingConfigRequestBandwidth setUpgrade(Boolean upgrade) {
            this.upgrade = upgrade;
            return this;
        }
        public Boolean getUpgrade() {
            return this.upgrade;
        }

    }

    public static class ModifyAutoScalingConfigRequestResource extends TeaModel {
        /**
         * <p>Specifies whether to apply the configurations under the <strong>Resource</strong> configuration item for the resource elastic scaling feature:</p>
         * <ul>
         * <li><strong>true</strong>: Yes.</li>
         * <li><strong>false</strong>: No.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         * 
         * <strong>if can be null:</strong>
         * <p>false</p>
         */
        @NameInMap("Apply")
        public Boolean apply;

        /**
         * <p>The threshold of average CPU utilization that triggers automatic resource scale-up. Unit: %. Valid values:</p>
         * <ul>
         * <li><strong>70</strong></li>
         * <li><strong>80</strong></li>
         * <li><strong>90</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>70</p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("CpuUsageUpperThreshold")
        public Integer cpuUsageUpperThreshold;

        /**
         * <p>The observation window for scale-down. The parameter value consists of a number and a time unit suffix. The time suffix <strong>m</strong> indicates minutes. Valid values:</p>
         * <ul>
         * <li><strong>1m</strong></li>
         * <li><strong>3m</strong></li>
         * <li><strong>5m</strong></li>
         * <li><strong>10m</strong></li>
         * <li><strong>20m</strong></li>
         * <li><strong>30m</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>5m</p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("DowngradeObservationWindowSize")
        public String downgradeObservationWindowSize;

        /**
         * <p>Specifies whether to enable resource elastic scaling:</p>
         * <ul>
         * <li><strong>true</strong>: Yes.</li>
         * <li><strong>false</strong>: No.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         * 
         * <strong>if can be null:</strong>
         * <p>false</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        /**
         * <p>The observation window for scale-up. The parameter value consists of a number and a time unit suffix. The time suffix <strong>m</strong> indicates minutes. Valid values:</p>
         * <ul>
         * <li><strong>1m</strong></li>
         * <li><strong>3m</strong></li>
         * <li><strong>5m</strong></li>
         * <li><strong>10m</strong></li>
         * <li><strong>20m</strong></li>
         * <li><strong>30m</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>5m</p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("UpgradeObservationWindowSize")
        public String upgradeObservationWindowSize;

        public static ModifyAutoScalingConfigRequestResource build(java.util.Map<String, ?> map) throws Exception {
            ModifyAutoScalingConfigRequestResource self = new ModifyAutoScalingConfigRequestResource();
            return TeaModel.build(map, self);
        }

        public ModifyAutoScalingConfigRequestResource setApply(Boolean apply) {
            this.apply = apply;
            return this;
        }
        public Boolean getApply() {
            return this.apply;
        }

        public ModifyAutoScalingConfigRequestResource setCpuUsageUpperThreshold(Integer cpuUsageUpperThreshold) {
            this.cpuUsageUpperThreshold = cpuUsageUpperThreshold;
            return this;
        }
        public Integer getCpuUsageUpperThreshold() {
            return this.cpuUsageUpperThreshold;
        }

        public ModifyAutoScalingConfigRequestResource setDowngradeObservationWindowSize(String downgradeObservationWindowSize) {
            this.downgradeObservationWindowSize = downgradeObservationWindowSize;
            return this;
        }
        public String getDowngradeObservationWindowSize() {
            return this.downgradeObservationWindowSize;
        }

        public ModifyAutoScalingConfigRequestResource setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public ModifyAutoScalingConfigRequestResource setUpgradeObservationWindowSize(String upgradeObservationWindowSize) {
            this.upgradeObservationWindowSize = upgradeObservationWindowSize;
            return this;
        }
        public String getUpgradeObservationWindowSize() {
            return this.upgradeObservationWindowSize;
        }

    }

    public static class ModifyAutoScalingConfigRequestShard extends TeaModel {
        /**
         * <p>Specifies whether to apply the configurations under the <strong>Shard</strong> configuration item for the shard elastic scaling feature:</p>
         * <ul>
         * <li><strong>true</strong>: Yes.</li>
         * <li><strong>false</strong>: No.</li>
         * </ul>
         * <blockquote>
         * <p>Notice: The shard elastic scaling feature is supported only when the target database instance is Tair (Redis® OSS-Compatible) cloud-native (formerly cloud disk) edition in cluster architecture on the China site.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Apply")
        public Boolean apply;

        /**
         * <p>Specifies whether to enable automatic shard reduction:</p>
         * <ul>
         * <li><strong>true</strong>: Yes.</li>
         * <li><strong>false</strong>: No.</li>
         * </ul>
         * <blockquote>
         * <p>The automatic shard reduction feature is currently in canary release.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Downgrade")
        public Boolean downgrade;

        /**
         * <p>The observation window for automatic shard reduction. The parameter value consists of a number and a time unit suffix. The time suffix <strong>h</strong> indicates hours, and <strong>d</strong> indicates days. Valid values:</p>
         * <ul>
         * <li><strong>1h</strong></li>
         * <li><strong>2h</strong></li>
         * <li><strong>3h</strong></li>
         * <li><strong>1d</strong></li>
         * <li><strong>7d</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1h</p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("DowngradeObservationWindowSize")
        public String downgradeObservationWindowSize;

        /**
         * <p>The maximum total number of shards for the instance. The value must be a positive integer. Valid values: 4 to 32.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("MaxShards")
        public Integer maxShards;

        /**
         * <p>The threshold of average memory utilization that triggers automatic shard reduction. Unit: %. Valid values:</p>
         * <ul>
         * <li><strong>10</strong></li>
         * <li><strong>20</strong></li>
         * <li><strong>30</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("MemUsageLowerThreshold")
        public Integer memUsageLowerThreshold;

        /**
         * <p>The threshold of average memory utilization that triggers automatic shard addition. Unit: %. Valid values:</p>
         * <ul>
         * <li><strong>50</strong></li>
         * <li><strong>60</strong></li>
         * <li><strong>70</strong></li>
         * <li><strong>80</strong></li>
         * <li><strong>90</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>70</p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("MemUsageUpperThreshold")
        public Integer memUsageUpperThreshold;

        /**
         * <p>The minimum total number of shards for the instance. The value must be a positive integer. Valid values: 4 to 32.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("MinShards")
        public Integer minShards;

        /**
         * <p>Specifies whether to enable automatic shard addition:</p>
         * <ul>
         * <li><strong>true</strong>: Yes.</li>
         * <li><strong>false</strong>: No.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Upgrade")
        public Boolean upgrade;

        /**
         * <p>The observation window for automatic shard addition. The parameter value consists of a number and a time unit suffix. The time suffix <strong>m</strong> indicates minutes. Valid values:</p>
         * <ul>
         * <li><strong>5m</strong></li>
         * <li><strong>10m</strong></li>
         * <li><strong>15m</strong></li>
         * <li><strong>30m</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>5m</p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("UpgradeObservationWindowSize")
        public String upgradeObservationWindowSize;

        public static ModifyAutoScalingConfigRequestShard build(java.util.Map<String, ?> map) throws Exception {
            ModifyAutoScalingConfigRequestShard self = new ModifyAutoScalingConfigRequestShard();
            return TeaModel.build(map, self);
        }

        public ModifyAutoScalingConfigRequestShard setApply(Boolean apply) {
            this.apply = apply;
            return this;
        }
        public Boolean getApply() {
            return this.apply;
        }

        public ModifyAutoScalingConfigRequestShard setDowngrade(Boolean downgrade) {
            this.downgrade = downgrade;
            return this;
        }
        public Boolean getDowngrade() {
            return this.downgrade;
        }

        public ModifyAutoScalingConfigRequestShard setDowngradeObservationWindowSize(String downgradeObservationWindowSize) {
            this.downgradeObservationWindowSize = downgradeObservationWindowSize;
            return this;
        }
        public String getDowngradeObservationWindowSize() {
            return this.downgradeObservationWindowSize;
        }

        public ModifyAutoScalingConfigRequestShard setMaxShards(Integer maxShards) {
            this.maxShards = maxShards;
            return this;
        }
        public Integer getMaxShards() {
            return this.maxShards;
        }

        public ModifyAutoScalingConfigRequestShard setMemUsageLowerThreshold(Integer memUsageLowerThreshold) {
            this.memUsageLowerThreshold = memUsageLowerThreshold;
            return this;
        }
        public Integer getMemUsageLowerThreshold() {
            return this.memUsageLowerThreshold;
        }

        public ModifyAutoScalingConfigRequestShard setMemUsageUpperThreshold(Integer memUsageUpperThreshold) {
            this.memUsageUpperThreshold = memUsageUpperThreshold;
            return this;
        }
        public Integer getMemUsageUpperThreshold() {
            return this.memUsageUpperThreshold;
        }

        public ModifyAutoScalingConfigRequestShard setMinShards(Integer minShards) {
            this.minShards = minShards;
            return this;
        }
        public Integer getMinShards() {
            return this.minShards;
        }

        public ModifyAutoScalingConfigRequestShard setUpgrade(Boolean upgrade) {
            this.upgrade = upgrade;
            return this;
        }
        public Boolean getUpgrade() {
            return this.upgrade;
        }

        public ModifyAutoScalingConfigRequestShard setUpgradeObservationWindowSize(String upgradeObservationWindowSize) {
            this.upgradeObservationWindowSize = upgradeObservationWindowSize;
            return this;
        }
        public String getUpgradeObservationWindowSize() {
            return this.upgradeObservationWindowSize;
        }

    }

    public static class ModifyAutoScalingConfigRequestSpec extends TeaModel {
        /**
         * <p>Specifies whether to apply the configurations under the <strong>Spec</strong> configuration item for the specification elastic scaling feature:</p>
         * <ul>
         * <li><strong>true</strong>: Yes.</li>
         * <li><strong>false</strong>: No.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Apply")
        public Boolean apply;

        /**
         * <p>The cool-down period. The parameter value consists of a number and a time unit suffix. The supported database instances and valid values are as follows. The time suffix <strong>m</strong> indicates minutes, <strong>h</strong> indicates hours, and <strong>d</strong> indicates days:</p>
         * <ul>
         * <li>PolarDB for MySQL Cluster Edition: <strong>5m</strong>, <strong>10m</strong>, <strong>30m</strong>, <strong>1h</strong>, <strong>2h</strong>, <strong>3h</strong>, <strong>1d</strong>, and <strong>7d</strong>.</li>
         * <li>ApsaraDB RDS for MySQL high availability series cloud disk edition: <strong>5m</strong>, <strong>10m</strong>, <strong>30m</strong>, <strong>1h</strong>, <strong>2h</strong>, <strong>3h</strong>, <strong>1d</strong>, and <strong>7d</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>5m</p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("CoolDownTime")
        public String coolDownTime;

        /**
         * <p>The threshold of average CPU utilization that triggers automatic specification scale-up. Unit: %. Valid values:</p>
         * <ul>
         * <li><strong>50</strong></li>
         * <li><strong>60</strong></li>
         * <li><strong>70</strong></li>
         * <li><strong>80</strong></li>
         * <li><strong>90</strong></li>
         * </ul>
         * <blockquote>
         * <p>Notice: You must set this parameter when the target database instance is PolarDB for MySQL Cluster Edition or ApsaraDB RDS for MySQL high availability series cloud disk edition.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>70</p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("CpuUsageUpperThreshold")
        public Integer cpuUsageUpperThreshold;

        /**
         * <p>Specifies whether automatic specification scale-down is enabled:</p>
         * <ul>
         * <li><strong>true</strong>: Yes.</li>
         * <li><strong>false</strong>: No.</li>
         * </ul>
         * <blockquote>
         * <p>Notice: You must set this parameter when the target database instance is PolarDB for MySQL Cluster Edition or ApsaraDB RDS for MySQL high availability series cloud disk edition.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         * 
         * <strong>if can be null:</strong>
         * <p>false</p>
         */
        @NameInMap("Downgrade")
        public Boolean downgrade;

        /**
         * <p>The maximum number of read-only nodes for the instance.</p>
         * <blockquote>
         * <p>Notice: You must set this parameter when the target database instance is PolarDB for MySQL Cluster Edition.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("MaxReadOnlyNodes")
        public Integer maxReadOnlyNodes;

        /**
         * <p>The upper limit of the specification for automatic scale-up. You can only scale up to a higher specification within the same series of the database instance. For more details, see the specification documentation for each database instance:
         * &lt;props=&quot;china&quot;&gt;</p>
         * <ul>
         * <li>For PolarDB for MySQL Cluster Edition, see <a href="https://help.aliyun.com/document_detail/102542.html">Compute node specifications</a>.</li>
         * <li>For ApsaraDB RDS for MySQL high availability series cloud disk edition, see <a href="https://help.aliyun.com/document_detail/276974.html">Product specifications</a>.</li>
         * <li>For Tair (Redis® OSS-Compatible) cloud-native (formerly cloud disk) open-source edition, see <a href="https://help.aliyun.com/document_detail/144986.html">Instance specifications</a>.</li>
         * </ul>
         * <p>&lt;props=&quot;intl&quot;&gt;</p>
         * <ul>
         * <li>For PolarDB for MySQL Cluster Edition, see <a href="https://help.aliyun.com/document_detail/102542.html">Compute node specifications</a>.</li>
         * <li>For ApsaraDB RDS for MySQL high availability series cloud disk edition, see <a href="https://help.aliyun.com/document_detail/276974.html">Product specifications</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>polar.mysql.x8.12xlarge</p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("MaxSpec")
        public String maxSpec;

        /**
         * <p>The threshold of average memory utilization that triggers automatic specification scale-up. Unit: %. Valid values:</p>
         * <ul>
         * <li><strong>50</strong></li>
         * <li><strong>60</strong></li>
         * <li><strong>70</strong></li>
         * <li><strong>80</strong></li>
         * <li><strong>90</strong></li>
         * </ul>
         * <blockquote>
         * <p>Notice: You must set this parameter when the target database instance is Tair (Redis® OSS-Compatible) cloud-native (formerly cloud disk) open-source edition on the China site.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>70</p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("MemUsageUpperThreshold")
        public Integer memUsageUpperThreshold;

        /**
         * <p>The observation window. The parameter value consists of a number and a time unit suffix. The supported database instances and valid values are as follows. The time suffix <strong>m</strong> indicates minutes, and <strong>h</strong> indicates hours:</p>
         * <ul>
         * <li>PolarDB for MySQL Cluster Edition: <strong>5m</strong>, <strong>10m</strong>, <strong>15m</strong>, and <strong>30m</strong>.</li>
         * <li>ApsaraDB RDS for MySQL high availability series cloud disk edition: <strong>5m</strong>, <strong>20m</strong>, <strong>30m</strong>, <strong>40m</strong>, and <strong>1h</strong>.</li>
         * <li>Tair (Redis® OSS-Compatible) cloud-native (formerly cloud disk) open-source edition: <strong>5m</strong>, <strong>10m</strong>, <strong>15m</strong>, and <strong>30m</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>5m</p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("ObservationWindowSize")
        public String observationWindowSize;

        /**
         * <p>Specifies whether to enable automatic specification scale-up:</p>
         * <ul>
         * <li><strong>true</strong>: Yes.</li>
         * <li><strong>false</strong>: No.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         * 
         * <strong>if can be null:</strong>
         * <p>false</p>
         */
        @NameInMap("Upgrade")
        public Boolean upgrade;

        public static ModifyAutoScalingConfigRequestSpec build(java.util.Map<String, ?> map) throws Exception {
            ModifyAutoScalingConfigRequestSpec self = new ModifyAutoScalingConfigRequestSpec();
            return TeaModel.build(map, self);
        }

        public ModifyAutoScalingConfigRequestSpec setApply(Boolean apply) {
            this.apply = apply;
            return this;
        }
        public Boolean getApply() {
            return this.apply;
        }

        public ModifyAutoScalingConfigRequestSpec setCoolDownTime(String coolDownTime) {
            this.coolDownTime = coolDownTime;
            return this;
        }
        public String getCoolDownTime() {
            return this.coolDownTime;
        }

        public ModifyAutoScalingConfigRequestSpec setCpuUsageUpperThreshold(Integer cpuUsageUpperThreshold) {
            this.cpuUsageUpperThreshold = cpuUsageUpperThreshold;
            return this;
        }
        public Integer getCpuUsageUpperThreshold() {
            return this.cpuUsageUpperThreshold;
        }

        public ModifyAutoScalingConfigRequestSpec setDowngrade(Boolean downgrade) {
            this.downgrade = downgrade;
            return this;
        }
        public Boolean getDowngrade() {
            return this.downgrade;
        }

        public ModifyAutoScalingConfigRequestSpec setMaxReadOnlyNodes(Integer maxReadOnlyNodes) {
            this.maxReadOnlyNodes = maxReadOnlyNodes;
            return this;
        }
        public Integer getMaxReadOnlyNodes() {
            return this.maxReadOnlyNodes;
        }

        public ModifyAutoScalingConfigRequestSpec setMaxSpec(String maxSpec) {
            this.maxSpec = maxSpec;
            return this;
        }
        public String getMaxSpec() {
            return this.maxSpec;
        }

        public ModifyAutoScalingConfigRequestSpec setMemUsageUpperThreshold(Integer memUsageUpperThreshold) {
            this.memUsageUpperThreshold = memUsageUpperThreshold;
            return this;
        }
        public Integer getMemUsageUpperThreshold() {
            return this.memUsageUpperThreshold;
        }

        public ModifyAutoScalingConfigRequestSpec setObservationWindowSize(String observationWindowSize) {
            this.observationWindowSize = observationWindowSize;
            return this;
        }
        public String getObservationWindowSize() {
            return this.observationWindowSize;
        }

        public ModifyAutoScalingConfigRequestSpec setUpgrade(Boolean upgrade) {
            this.upgrade = upgrade;
            return this;
        }
        public Boolean getUpgrade() {
            return this.upgrade;
        }

    }

    public static class ModifyAutoScalingConfigRequestStorage extends TeaModel {
        /**
         * <p>Specifies whether to apply the configurations under the <strong>Storage</strong> configuration item for the automatic storage expansion feature:</p>
         * <ul>
         * <li><strong>true</strong>: Yes.</li>
         * <li><strong>false</strong>: No.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Apply")
        public Boolean apply;

        /**
         * <p>The threshold of average storage space utilization that triggers automatic storage expansion. Unit: %. Valid values:</p>
         * <ul>
         * <li><strong>50</strong></li>
         * <li><strong>60</strong></li>
         * <li><strong>70</strong></li>
         * <li><strong>80</strong></li>
         * <li><strong>90</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>70</p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("DiskUsageUpperThreshold")
        public Integer diskUsageUpperThreshold;

        /**
         * <p>The upper limit of the storage space. The value must be greater than or equal to the current total storage space of the instance. Valid values:</p>
         * <ul>
         * <li>ESSD cloud disk upper limit: 32,000 GB.</li>
         * <li>Standard SSD upper limit: 6,000 GB.</li>
         * </ul>
         * <blockquote>
         * <p>Standard SSDs are retired. <a href="https://help.aliyun.com/document_detail/314678.html">Upgrade to ESSD cloud disks</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>32000</p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("MaxStorage")
        public Integer maxStorage;

        /**
         * <p>Specifies whether to enable automatic storage expansion:</p>
         * <ul>
         * <li><strong>true</strong>: Yes.</li>
         * <li><strong>false</strong>: No.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         * 
         * <strong>if can be null:</strong>
         * <p>false</p>
         */
        @NameInMap("Upgrade")
        public Boolean upgrade;

        public static ModifyAutoScalingConfigRequestStorage build(java.util.Map<String, ?> map) throws Exception {
            ModifyAutoScalingConfigRequestStorage self = new ModifyAutoScalingConfigRequestStorage();
            return TeaModel.build(map, self);
        }

        public ModifyAutoScalingConfigRequestStorage setApply(Boolean apply) {
            this.apply = apply;
            return this;
        }
        public Boolean getApply() {
            return this.apply;
        }

        public ModifyAutoScalingConfigRequestStorage setDiskUsageUpperThreshold(Integer diskUsageUpperThreshold) {
            this.diskUsageUpperThreshold = diskUsageUpperThreshold;
            return this;
        }
        public Integer getDiskUsageUpperThreshold() {
            return this.diskUsageUpperThreshold;
        }

        public ModifyAutoScalingConfigRequestStorage setMaxStorage(Integer maxStorage) {
            this.maxStorage = maxStorage;
            return this;
        }
        public Integer getMaxStorage() {
            return this.maxStorage;
        }

        public ModifyAutoScalingConfigRequestStorage setUpgrade(Boolean upgrade) {
            this.upgrade = upgrade;
            return this;
        }
        public Boolean getUpgrade() {
            return this.upgrade;
        }

    }

}
