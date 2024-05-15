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
     * <br>
     * <p>This parameter is required.</p>
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
         * <p>Specifies whether to apply the **Bandwidth** configuration of the automatic bandwidth adjustment feature. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("Apply")
        public Boolean apply;

        /**
         * <p>The average bandwidth usage threshold that triggers automatic bandwidth downgrade. Unit: %. Valid values:</p>
         * <br>
         * <p>*   **10**</p>
         * <p>*   **20**</p>
         * <p>*   **30**</p>
         */
        @NameInMap("BandwidthUsageLowerThreshold")
        public Integer bandwidthUsageLowerThreshold;

        /**
         * <p>The average bandwidth usage threshold that triggers automatic bandwidth upgrade. Unit: %. Valid values:</p>
         * <br>
         * <p>*   **50**</p>
         * <p>*   **60**</p>
         * <p>*   **70**</p>
         * <p>*   **80**</p>
         * <p>*   **90**</p>
         * <p>*   **95**</p>
         */
        @NameInMap("BandwidthUsageUpperThreshold")
        public Integer bandwidthUsageUpperThreshold;

        /**
         * <p>Specifies whether to enable the automatic bandwidth downgrade feature. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("Downgrade")
        public Boolean downgrade;

        /**
         * <p>The observation window of the automatic bandwidth adjustment feature. The value of this parameter consists of a numeric value and a time unit suffix. The **m** time unit suffix specifies the minute. Valid values:</p>
         * <br>
         * <p>*   **1m**</p>
         * <p>*   **5m**</p>
         * <p>*   **10m**</p>
         * <p>*   **15m**</p>
         * <p>*   **30m**</p>
         */
        @NameInMap("ObservationWindowSize")
        public String observationWindowSize;

        /**
         * <p>Specifies whether to enable the automatic bandwidth upgrade feature. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
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
         * <p>Specifies whether to apply the **Resource** configuration of the auto scaling feature for resources. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("Apply")
        public Boolean apply;

        /**
         * <p>The average CPU utilization threshold that triggers automatic scale-out of resources. Unit: %. Valid values:</p>
         * <br>
         * <p>*   **70**</p>
         * <p>*   **80**</p>
         * <p>*   **90**</p>
         */
        @NameInMap("CpuUsageUpperThreshold")
        public Integer cpuUsageUpperThreshold;

        /**
         * <p>The observation window of the automatic resource scale-in feature. The value of this parameter consists of a numeric value and a time unit suffix. The **m** time unit suffix specifies the minute. Valid values:</p>
         * <br>
         * <p>*   **1m**</p>
         * <p>*   **3m**</p>
         * <p>*   **5m**</p>
         * <p>*   **10m**</p>
         * <p>*   **20m**</p>
         * <p>*   **30m**</p>
         */
        @NameInMap("DowngradeObservationWindowSize")
        public String downgradeObservationWindowSize;

        /**
         * <p>Specifies whether to enable the auto scaling feature for resources. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        /**
         * <p>The observation window of the automatic resource scale-out feature. The value of this parameter consists of a numeric value and a time unit suffix. The **m** time unit suffix specifies the minute. Valid values:</p>
         * <br>
         * <p>*   **1m**</p>
         * <p>*   **3m**</p>
         * <p>*   **5m**</p>
         * <p>*   **10m**</p>
         * <p>*   **20m**</p>
         * <p>*   **30m**</p>
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
         * <p>Specifies whether to apply the **Shard** configuration of the auto scaling feature for shards. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         * <br>
         * <p>> The auto scaling feature for shards is available only for ApsaraDB for Redis Community Edition cloud-native instances on the China site (aliyun.com).</p>
         */
        @NameInMap("Apply")
        public Boolean apply;

        /**
         * <p>Specifies whether to enable the feature of automatically removing shards. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         * <br>
         * <p>>  The feature of automatically removing shards is in canary release.</p>
         */
        @NameInMap("Downgrade")
        public Boolean downgrade;

        /**
         * <p>The observation window of the feature of automatically removing shards. The value of this parameter consists of a numeric value and a time unit suffix. The **h** time unit suffix specifies the hour. The **d** time unit suffix specifies the day. Valid values:</p>
         * <br>
         * <p>*   **1h**</p>
         * <p>*   **2h**</p>
         * <p>*   **3h**</p>
         * <p>*   **1d**</p>
         * <p>*   **7d**</p>
         */
        @NameInMap("DowngradeObservationWindowSize")
        public String downgradeObservationWindowSize;

        /**
         * <p>The maximum number of shards in the instance. The value must be a positive integer. Valid values: 4 to 32.</p>
         */
        @NameInMap("MaxShards")
        public Integer maxShards;

        /**
         * <p>The average memory usage threshold that triggers automatic removal of shards. Unit: %. Valid values:</p>
         * <br>
         * <p>*   **10**</p>
         * <p>*   **20**</p>
         * <p>*   **30**</p>
         */
        @NameInMap("MemUsageLowerThreshold")
        public Integer memUsageLowerThreshold;

        /**
         * <p>The average memory usage threshold that triggers automatic adding of shards. Unit: %. Valid values:</p>
         * <br>
         * <p>*   **50**</p>
         * <p>*   **60**</p>
         * <p>*   **70**</p>
         * <p>*   **80**</p>
         * <p>*   **90**</p>
         */
        @NameInMap("MemUsageUpperThreshold")
        public Integer memUsageUpperThreshold;

        /**
         * <p>The minimum number of shards in the instance. The value must be a positive integer. Valid values: 4 to 32.</p>
         */
        @NameInMap("MinShards")
        public Integer minShards;

        /**
         * <p>Specifies whether to enable the feature of automatically adding shards. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("Upgrade")
        public Boolean upgrade;

        /**
         * <p>The observation window of the feature of automatically adding shards. The value of this parameter consists of a numeric value and a time unit suffix. The **m** time unit suffix specifies the minute. Valid values:</p>
         * <br>
         * <p>*   **5m**</p>
         * <p>*   **10m**</p>
         * <p>*   **15m**</p>
         * <p>*   **30m**</p>
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
         * <p>Specifies whether to apply the **Spec** configuration of the auto scaling feature for specifications. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("Apply")
        public Boolean apply;

        /**
         * <p>The quiescent period. The value of this parameter consists of a numeric value and a time unit suffix. The **m** time unit suffix specifies the minute, the **h** time unit suffix specifies the hour, and the **d** time suffix unit specifies the day.</p>
         * <br>
         * <p>*   Valid values for PolarDB for MySQL Cluster Edition instances: **5m**, **10m**, **30m**, **1h**, **2h**, **3h**, **1d**, and **7d**.</p>
         * <p>*   Valid values for ApsaraDB RDS for MySQL High-availability Edition instances that use standard SSDs or ESSDs: **5m**, **10m**, **30m**, **1h**, **2h**, **3h**, **1d**, and **7d**.</p>
         */
        @NameInMap("CoolDownTime")
        public String coolDownTime;

        /**
         * <p>The average CPU utilization threshold that triggers automatic specification scale-up. Unit: %. Valid values:</p>
         * <br>
         * <p>*   **50**</p>
         * <p>*   **60**</p>
         * <p>*   **70**</p>
         * <p>*   **80**</p>
         * <p>*   **90**</p>
         * <br>
         * <p>> This parameter must be specified if the database instance is a PolarDB for MySQL Cluster Edition instance or an ApsaraDB RDS for MySQL High-availability Edition instance that uses standard SSDs or ESSDs.</p>
         */
        @NameInMap("CpuUsageUpperThreshold")
        public Integer cpuUsageUpperThreshold;

        /**
         * <p>Specifies whether to enable the automatic specification scale-down feature. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         * <br>
         * <p>> This parameter must be specified if the database instance is a PolarDB for MySQL Cluster Edition instance or an ApsaraDB RDS for MySQL High-availability Edition instance that uses standard SSDs or ESSDs.</p>
         */
        @NameInMap("Downgrade")
        public Boolean downgrade;

        /**
         * <p>The maximum number of read-only nodes of the instance.</p>
         * <br>
         * <p>> This parameter must be specified if the database instance is a PolarDB for MySQL Cluster Edition instance.</p>
         */
        @NameInMap("MaxReadOnlyNodes")
        public Integer maxReadOnlyNodes;

        /**
         * <p>The maximum specifications to which the database instance can be scaled up. The database instance can be upgraded only to a database instance of the same edition with higher specifications. For information about the specifications of different database instances, see the following topics:</p>
         * <br>
         * <p>*   PolarDB for MySQL Cluster Edition instances: [Specifications of compute nodes](https://help.aliyun.com/document_detail/102542.html)</p>
         * <p>*   ApsaraDB RDS for MySQL High-availability Edition instances that use standard SSDs or ESSDs: [Specifications](https://help.aliyun.com/document_detail/276974.html)</p>
         */
        @NameInMap("MaxSpec")
        public String maxSpec;

        /**
         * <p>The average memory usage threshold that triggers automatic specification scale-up. Unit: %. Valid values:</p>
         * <br>
         * <p>*   **50**</p>
         * <p>*   **60**</p>
         * <p>*   **70**</p>
         * <p>*   **80**</p>
         * <p>*   **90**</p>
         * <br>
         * <p>> This parameter must be specified if the database instance is an ApsaraDB for Redis Community Edition cloud-native instance on the China site (aliyun.com).</p>
         */
        @NameInMap("MemUsageUpperThreshold")
        public Integer memUsageUpperThreshold;

        /**
         * <p>The observation window. The value of this parameter consists of a numeric value and a time unit suffix. The **m** time unit suffix specifies the minute and the **h** time unit suffix specifies the hour.</p>
         * <br>
         * <p>*   Valid values for PolarDB for MySQL Cluster Edition instances: **5m**, **10m**, **15m**, and **30m**.</p>
         * <p>*   Valid values for ApsaraDB RDS for MySQL High-availability Edition instances that use standard SSDs or ESSDs: **5m**, **20m**, **30m**, **40m**, and **1h**.</p>
         * <p>*   Valid values for ApsaraDB for Redis Community Edition cloud-native instances: **5m**, **10m**, **15m**, and **30m**.</p>
         */
        @NameInMap("ObservationWindowSize")
        public String observationWindowSize;

        /**
         * <p>Specifies whether to enable the automatic specification scale-up feature. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
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
         * <p>Specifies whether to apply the **Storage** configuration of the automatic storage expansion feature. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("Apply")
        public Boolean apply;

        /**
         * <p>The average storage usage threshold that triggers automatic storage expansion. Unit: %. Valid values:</p>
         * <br>
         * <p>*   **50**</p>
         * <p>*   **60**</p>
         * <p>*   **70**</p>
         * <p>*   **80**</p>
         * <p>*   **90**</p>
         */
        @NameInMap("DiskUsageUpperThreshold")
        public Integer diskUsageUpperThreshold;

        /**
         * <p>The maximum storage size of the database instance. The value must be greater than or equal to the total storage size of the instance. Valid values of different types of instances:</p>
         * <br>
         * <p>*   If the ApsaraDB for RDS instance uses ESSDs, the value of this parameter can be set to 32000, in GB.</p>
         * <p>*   If the ApsaraDB for RDS instance uses standard SSDs, the value of this parameter can be set to 6000, in GB.</p>
         * <br>
         * <p>>  The ApsaraDB RDS for MySQL instances that use standard SSDs are discontinued. We recommend that you [upgrade the storage type of an ApsaraDB RDS for MySQL instance from standard SSDs to ESSDs](https://help.aliyun.com/document_detail/314678.html).</p>
         */
        @NameInMap("MaxStorage")
        public Integer maxStorage;

        /**
         * <p>Specifies whether to enable the automatic storage expansion feature. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
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
