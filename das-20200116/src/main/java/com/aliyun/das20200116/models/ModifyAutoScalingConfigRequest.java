// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class ModifyAutoScalingConfigRequest extends TeaModel {
    @NameInMap("Bandwidth")
    public ModifyAutoScalingConfigRequestBandwidth bandwidth;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Resource")
    public ModifyAutoScalingConfigRequestResource resource;

    @NameInMap("Shard")
    public ModifyAutoScalingConfigRequestShard shard;

    @NameInMap("Spec")
    public ModifyAutoScalingConfigRequestSpec spec;

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
        @NameInMap("Apply")
        public Boolean apply;

        @NameInMap("BandwidthUsageLowerThreshold")
        public Integer bandwidthUsageLowerThreshold;

        @NameInMap("BandwidthUsageUpperThreshold")
        public Integer bandwidthUsageUpperThreshold;

        @NameInMap("Downgrade")
        public Boolean downgrade;

        @NameInMap("ObservationWindowSize")
        public String observationWindowSize;

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
        @NameInMap("Apply")
        public Boolean apply;

        @NameInMap("CpuUsageUpperThreshold")
        public Integer cpuUsageUpperThreshold;

        @NameInMap("DowngradeObservationWindowSize")
        public String downgradeObservationWindowSize;

        @NameInMap("Enable")
        public Boolean enable;

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
        @NameInMap("Apply")
        public Boolean apply;

        @NameInMap("Downgrade")
        public Boolean downgrade;

        @NameInMap("DowngradeObservationWindowSize")
        public String downgradeObservationWindowSize;

        @NameInMap("MaxShards")
        public Integer maxShards;

        @NameInMap("MemUsageLowerThreshold")
        public Integer memUsageLowerThreshold;

        @NameInMap("MemUsageUpperThreshold")
        public Integer memUsageUpperThreshold;

        @NameInMap("MinShards")
        public Integer minShards;

        @NameInMap("Upgrade")
        public Boolean upgrade;

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
        @NameInMap("Apply")
        public Boolean apply;

        @NameInMap("CoolDownTime")
        public String coolDownTime;

        @NameInMap("CpuUsageUpperThreshold")
        public Integer cpuUsageUpperThreshold;

        @NameInMap("Downgrade")
        public Boolean downgrade;

        @NameInMap("MaxReadOnlyNodes")
        public Integer maxReadOnlyNodes;

        @NameInMap("MaxSpec")
        public String maxSpec;

        @NameInMap("MemUsageUpperThreshold")
        public Integer memUsageUpperThreshold;

        @NameInMap("ObservationWindowSize")
        public String observationWindowSize;

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
        @NameInMap("Apply")
        public Boolean apply;

        @NameInMap("DiskUsageUpperThreshold")
        public Integer diskUsageUpperThreshold;

        @NameInMap("MaxStorage")
        public Integer maxStorage;

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
