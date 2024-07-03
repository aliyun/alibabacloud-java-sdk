// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class ModifyAutoScalingConfigRequest extends TeaModel {
    /**
     * <p>The configuration item of the automatic bandwidth adjustment feature.</p>
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
     * <p>The configuration item of the auto scaling feature for resources.</p>
     */
    @NameInMap("Resource")
    public ModifyAutoScalingConfigRequestResource resource;

    /**
     * <p>The configuration item of the auto scaling feature for shards.</p>
     */
    @NameInMap("Shard")
    public ModifyAutoScalingConfigRequestShard shard;

    /**
     * <p>The configuration item of the auto scaling feature for specifications.</p>
     */
    @NameInMap("Spec")
    public ModifyAutoScalingConfigRequestSpec spec;

    /**
     * <p>The configuration item of the automatic storage expansion feature.</p>
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
         * <p>Specifies whether to apply the <strong>Bandwidth</strong> configuration of the automatic bandwidth adjustment feature. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Apply")
        public Boolean apply;

        /**
         * <p>The average bandwidth usage threshold that triggers automatic bandwidth downgrade. Unit: %. Valid values:</p>
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
         * <p>The average bandwidth usage threshold that triggers automatic bandwidth upgrade. Unit: %. Valid values:</p>
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
         * <p>Specifies whether to enable the automatic bandwidth downgrade feature. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Downgrade")
        public Boolean downgrade;

        /**
         * <p>The observation window of the automatic bandwidth adjustment feature. The value of this parameter consists of a numeric value and a time unit suffix. The <strong>m</strong> time unit suffix specifies the minute. Valid values:</p>
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
         * <p>Specifies whether to enable the automatic bandwidth upgrade feature. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
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
         * <p>Specifies whether to apply the <strong>Resource</strong> configuration of the auto scaling feature for resources. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
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
         * <p>The average CPU utilization threshold that triggers automatic scale-out of resources. Unit: %. Valid values:</p>
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
         * <p>The observation window of the automatic resource scale-in feature. The value of this parameter consists of a numeric value and a time unit suffix. The <strong>m</strong> time unit suffix specifies the minute. Valid values:</p>
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
         * <p>Specifies whether to enable the auto scaling feature for resources. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
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
         * <p>The observation window of the automatic resource scale-out feature. The value of this parameter consists of a numeric value and a time unit suffix. The <strong>m</strong> time unit suffix specifies the minute. Valid values:</p>
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
         * <p>Specifies whether to apply the <strong>Shard</strong> configuration of the auto scaling feature for shards. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * <blockquote>
         * <p>The auto scaling feature for shards is available only for ApsaraDB for Redis Community Edition cloud-native instances on the China site (aliyun.com).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Apply")
        public Boolean apply;

        /**
         * <p>Specifies whether to enable the feature of automatically removing shards. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * <blockquote>
         * <p> The feature of automatically removing shards is in canary release.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Downgrade")
        public Boolean downgrade;

        /**
         * <p>The observation window of the feature of automatically removing shards. The value of this parameter consists of a numeric value and a time unit suffix. The <strong>h</strong> time unit suffix specifies the hour. The <strong>d</strong> time unit suffix specifies the day. Valid values:</p>
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
         * <p>The maximum number of shards in the instance. The value must be a positive integer. Valid values: 4 to 32.</p>
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
         * <p>The average memory usage threshold that triggers automatic removal of shards. Unit: %. Valid values:</p>
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
         * <p>The average memory usage threshold that triggers automatic adding of shards. Unit: %. Valid values:</p>
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
         * <p>The minimum number of shards in the instance. The value must be a positive integer. Valid values: 4 to 32.</p>
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
         * <p>Specifies whether to enable the feature of automatically adding shards. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Upgrade")
        public Boolean upgrade;

        /**
         * <p>The observation window of the feature of automatically adding shards. The value of this parameter consists of a numeric value and a time unit suffix. The <strong>m</strong> time unit suffix specifies the minute. Valid values:</p>
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
         * <p>Specifies whether to apply the <strong>Spec</strong> configuration of the auto scaling feature for specifications. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Apply")
        public Boolean apply;

        /**
         * <p>The quiescent period. The value of this parameter consists of a numeric value and a time unit suffix. The <strong>m</strong> time unit suffix specifies the minute, the <strong>h</strong> time unit suffix specifies the hour, and the <strong>d</strong> time suffix unit specifies the day.</p>
         * <ul>
         * <li>Valid values for PolarDB for MySQL Cluster Edition instances: <strong>5m</strong>, <strong>10m</strong>, <strong>30m</strong>, <strong>1h</strong>, <strong>2h</strong>, <strong>3h</strong>, <strong>1d</strong>, and <strong>7d</strong>.</li>
         * <li>Valid values for ApsaraDB RDS for MySQL High-availability Edition instances that use standard SSDs or ESSDs: <strong>5m</strong>, <strong>10m</strong>, <strong>30m</strong>, <strong>1h</strong>, <strong>2h</strong>, <strong>3h</strong>, <strong>1d</strong>, and <strong>7d</strong>.</li>
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
         * <p>The average CPU utilization threshold that triggers automatic specification scale-up. Unit: %. Valid values:</p>
         * <ul>
         * <li><strong>50</strong></li>
         * <li><strong>60</strong></li>
         * <li><strong>70</strong></li>
         * <li><strong>80</strong></li>
         * <li><strong>90</strong></li>
         * </ul>
         * <blockquote>
         * <p>This parameter must be specified if the database instance is a PolarDB for MySQL Cluster Edition instance or an ApsaraDB RDS for MySQL High-availability Edition instance that uses standard SSDs or ESSDs.</p>
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
         * <p>Specifies whether to enable the automatic specification scale-down feature. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * <blockquote>
         * <p>This parameter must be specified if the database instance is a PolarDB for MySQL Cluster Edition instance or an ApsaraDB RDS for MySQL High-availability Edition instance that uses standard SSDs or ESSDs.</p>
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
         * <p>The maximum number of read-only nodes of the instance.</p>
         * <blockquote>
         * <p>This parameter must be specified if the database instance is a PolarDB for MySQL Cluster Edition instance.</p>
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
         * <p>The maximum specifications to which the database instance can be scaled up. The database instance can be upgraded only to a database instance of the same edition with higher specifications. For information about the specifications of different database instances, see the following topics:</p>
         * <ul>
         * <li>PolarDB for MySQL Cluster Edition instances: <a href="https://help.aliyun.com/document_detail/102542.html">Specifications of compute nodes</a></li>
         * <li>ApsaraDB RDS for MySQL High-availability Edition instances that use standard SSDs or ESSDs: <a href="https://help.aliyun.com/document_detail/276974.html">Specifications</a></li>
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
         * <p>The average memory usage threshold that triggers automatic specification scale-up. Unit: %. Valid values:</p>
         * <ul>
         * <li><strong>50</strong></li>
         * <li><strong>60</strong></li>
         * <li><strong>70</strong></li>
         * <li><strong>80</strong></li>
         * <li><strong>90</strong></li>
         * </ul>
         * <blockquote>
         * <p>This parameter must be specified if the database instance is an ApsaraDB for Redis Community Edition cloud-native instance on the China site (aliyun.com).</p>
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
         * <p>The observation window. The value of this parameter consists of a numeric value and a time unit suffix. The <strong>m</strong> time unit suffix specifies the minute and the <strong>h</strong> time unit suffix specifies the hour.</p>
         * <ul>
         * <li>Valid values for PolarDB for MySQL Cluster Edition instances: <strong>5m</strong>, <strong>10m</strong>, <strong>15m</strong>, and <strong>30m</strong>.</li>
         * <li>Valid values for ApsaraDB RDS for MySQL High-availability Edition instances that use standard SSDs or ESSDs: <strong>5m</strong>, <strong>20m</strong>, <strong>30m</strong>, <strong>40m</strong>, and <strong>1h</strong>.</li>
         * <li>Valid values for ApsaraDB for Redis Community Edition cloud-native instances: <strong>5m</strong>, <strong>10m</strong>, <strong>15m</strong>, and <strong>30m</strong>.</li>
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
         * <p>Specifies whether to enable the automatic specification scale-up feature. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
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
         * <p>Specifies whether to apply the <strong>Storage</strong> configuration of the automatic storage expansion feature. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Apply")
        public Boolean apply;

        /**
         * <p>The average storage usage threshold that triggers automatic storage expansion. Unit: %. Valid values:</p>
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
         * <p>The maximum storage size of the database instance. The value must be greater than or equal to the total storage size of the instance. Valid values of different types of instances:</p>
         * <ul>
         * <li>If the ApsaraDB for RDS instance uses ESSDs, the value of this parameter can be set to 32000, in GB.</li>
         * <li>If the ApsaraDB for RDS instance uses standard SSDs, the value of this parameter can be set to 6000, in GB.</li>
         * </ul>
         * <blockquote>
         * <p> The ApsaraDB RDS for MySQL instances that use standard SSDs are discontinued. We recommend that you <a href="https://help.aliyun.com/document_detail/314678.html">upgrade the storage type of an ApsaraDB RDS for MySQL instance from standard SSDs to ESSDs</a>.</p>
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
         * <p>Specifies whether to enable the automatic storage expansion feature. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
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
