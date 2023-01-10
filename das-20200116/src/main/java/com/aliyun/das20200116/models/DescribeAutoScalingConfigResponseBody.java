// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeAutoScalingConfigResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeAutoScalingConfigResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static DescribeAutoScalingConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutoScalingConfigResponseBody self = new DescribeAutoScalingConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAutoScalingConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeAutoScalingConfigResponseBody setData(DescribeAutoScalingConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeAutoScalingConfigResponseBodyData getData() {
        return this.data;
    }

    public DescribeAutoScalingConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAutoScalingConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAutoScalingConfigResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class DescribeAutoScalingConfigResponseBodyDataBandwidth extends TeaModel {
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

        public static DescribeAutoScalingConfigResponseBodyDataBandwidth build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutoScalingConfigResponseBodyDataBandwidth self = new DescribeAutoScalingConfigResponseBodyDataBandwidth();
            return TeaModel.build(map, self);
        }

        public DescribeAutoScalingConfigResponseBodyDataBandwidth setBandwidthUsageLowerThreshold(Integer bandwidthUsageLowerThreshold) {
            this.bandwidthUsageLowerThreshold = bandwidthUsageLowerThreshold;
            return this;
        }
        public Integer getBandwidthUsageLowerThreshold() {
            return this.bandwidthUsageLowerThreshold;
        }

        public DescribeAutoScalingConfigResponseBodyDataBandwidth setBandwidthUsageUpperThreshold(Integer bandwidthUsageUpperThreshold) {
            this.bandwidthUsageUpperThreshold = bandwidthUsageUpperThreshold;
            return this;
        }
        public Integer getBandwidthUsageUpperThreshold() {
            return this.bandwidthUsageUpperThreshold;
        }

        public DescribeAutoScalingConfigResponseBodyDataBandwidth setDowngrade(Boolean downgrade) {
            this.downgrade = downgrade;
            return this;
        }
        public Boolean getDowngrade() {
            return this.downgrade;
        }

        public DescribeAutoScalingConfigResponseBodyDataBandwidth setObservationWindowSize(String observationWindowSize) {
            this.observationWindowSize = observationWindowSize;
            return this;
        }
        public String getObservationWindowSize() {
            return this.observationWindowSize;
        }

        public DescribeAutoScalingConfigResponseBodyDataBandwidth setUpgrade(Boolean upgrade) {
            this.upgrade = upgrade;
            return this;
        }
        public Boolean getUpgrade() {
            return this.upgrade;
        }

    }

    public static class DescribeAutoScalingConfigResponseBodyDataResource extends TeaModel {
        @NameInMap("CpuStep")
        public Integer cpuStep;

        @NameInMap("CpuUsageUpperThreshold")
        public Integer cpuUsageUpperThreshold;

        @NameInMap("DowngradeObservationWindowSize")
        public String downgradeObservationWindowSize;

        @NameInMap("Enable")
        public Boolean enable;

        @NameInMap("UpgradeObservationWindowSize")
        public String upgradeObservationWindowSize;

        public static DescribeAutoScalingConfigResponseBodyDataResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutoScalingConfigResponseBodyDataResource self = new DescribeAutoScalingConfigResponseBodyDataResource();
            return TeaModel.build(map, self);
        }

        public DescribeAutoScalingConfigResponseBodyDataResource setCpuStep(Integer cpuStep) {
            this.cpuStep = cpuStep;
            return this;
        }
        public Integer getCpuStep() {
            return this.cpuStep;
        }

        public DescribeAutoScalingConfigResponseBodyDataResource setCpuUsageUpperThreshold(Integer cpuUsageUpperThreshold) {
            this.cpuUsageUpperThreshold = cpuUsageUpperThreshold;
            return this;
        }
        public Integer getCpuUsageUpperThreshold() {
            return this.cpuUsageUpperThreshold;
        }

        public DescribeAutoScalingConfigResponseBodyDataResource setDowngradeObservationWindowSize(String downgradeObservationWindowSize) {
            this.downgradeObservationWindowSize = downgradeObservationWindowSize;
            return this;
        }
        public String getDowngradeObservationWindowSize() {
            return this.downgradeObservationWindowSize;
        }

        public DescribeAutoScalingConfigResponseBodyDataResource setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public DescribeAutoScalingConfigResponseBodyDataResource setUpgradeObservationWindowSize(String upgradeObservationWindowSize) {
            this.upgradeObservationWindowSize = upgradeObservationWindowSize;
            return this;
        }
        public String getUpgradeObservationWindowSize() {
            return this.upgradeObservationWindowSize;
        }

    }

    public static class DescribeAutoScalingConfigResponseBodyDataShard extends TeaModel {
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

        public static DescribeAutoScalingConfigResponseBodyDataShard build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutoScalingConfigResponseBodyDataShard self = new DescribeAutoScalingConfigResponseBodyDataShard();
            return TeaModel.build(map, self);
        }

        public DescribeAutoScalingConfigResponseBodyDataShard setDowngrade(Boolean downgrade) {
            this.downgrade = downgrade;
            return this;
        }
        public Boolean getDowngrade() {
            return this.downgrade;
        }

        public DescribeAutoScalingConfigResponseBodyDataShard setDowngradeObservationWindowSize(String downgradeObservationWindowSize) {
            this.downgradeObservationWindowSize = downgradeObservationWindowSize;
            return this;
        }
        public String getDowngradeObservationWindowSize() {
            return this.downgradeObservationWindowSize;
        }

        public DescribeAutoScalingConfigResponseBodyDataShard setMaxShards(Integer maxShards) {
            this.maxShards = maxShards;
            return this;
        }
        public Integer getMaxShards() {
            return this.maxShards;
        }

        public DescribeAutoScalingConfigResponseBodyDataShard setMemUsageLowerThreshold(Integer memUsageLowerThreshold) {
            this.memUsageLowerThreshold = memUsageLowerThreshold;
            return this;
        }
        public Integer getMemUsageLowerThreshold() {
            return this.memUsageLowerThreshold;
        }

        public DescribeAutoScalingConfigResponseBodyDataShard setMemUsageUpperThreshold(Integer memUsageUpperThreshold) {
            this.memUsageUpperThreshold = memUsageUpperThreshold;
            return this;
        }
        public Integer getMemUsageUpperThreshold() {
            return this.memUsageUpperThreshold;
        }

        public DescribeAutoScalingConfigResponseBodyDataShard setMinShards(Integer minShards) {
            this.minShards = minShards;
            return this;
        }
        public Integer getMinShards() {
            return this.minShards;
        }

        public DescribeAutoScalingConfigResponseBodyDataShard setUpgrade(Boolean upgrade) {
            this.upgrade = upgrade;
            return this;
        }
        public Boolean getUpgrade() {
            return this.upgrade;
        }

        public DescribeAutoScalingConfigResponseBodyDataShard setUpgradeObservationWindowSize(String upgradeObservationWindowSize) {
            this.upgradeObservationWindowSize = upgradeObservationWindowSize;
            return this;
        }
        public String getUpgradeObservationWindowSize() {
            return this.upgradeObservationWindowSize;
        }

    }

    public static class DescribeAutoScalingConfigResponseBodyDataSpec extends TeaModel {
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

        public static DescribeAutoScalingConfigResponseBodyDataSpec build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutoScalingConfigResponseBodyDataSpec self = new DescribeAutoScalingConfigResponseBodyDataSpec();
            return TeaModel.build(map, self);
        }

        public DescribeAutoScalingConfigResponseBodyDataSpec setCoolDownTime(String coolDownTime) {
            this.coolDownTime = coolDownTime;
            return this;
        }
        public String getCoolDownTime() {
            return this.coolDownTime;
        }

        public DescribeAutoScalingConfigResponseBodyDataSpec setCpuUsageUpperThreshold(Integer cpuUsageUpperThreshold) {
            this.cpuUsageUpperThreshold = cpuUsageUpperThreshold;
            return this;
        }
        public Integer getCpuUsageUpperThreshold() {
            return this.cpuUsageUpperThreshold;
        }

        public DescribeAutoScalingConfigResponseBodyDataSpec setDowngrade(Boolean downgrade) {
            this.downgrade = downgrade;
            return this;
        }
        public Boolean getDowngrade() {
            return this.downgrade;
        }

        public DescribeAutoScalingConfigResponseBodyDataSpec setMaxReadOnlyNodes(Integer maxReadOnlyNodes) {
            this.maxReadOnlyNodes = maxReadOnlyNodes;
            return this;
        }
        public Integer getMaxReadOnlyNodes() {
            return this.maxReadOnlyNodes;
        }

        public DescribeAutoScalingConfigResponseBodyDataSpec setMaxSpec(String maxSpec) {
            this.maxSpec = maxSpec;
            return this;
        }
        public String getMaxSpec() {
            return this.maxSpec;
        }

        public DescribeAutoScalingConfigResponseBodyDataSpec setMemUsageUpperThreshold(Integer memUsageUpperThreshold) {
            this.memUsageUpperThreshold = memUsageUpperThreshold;
            return this;
        }
        public Integer getMemUsageUpperThreshold() {
            return this.memUsageUpperThreshold;
        }

        public DescribeAutoScalingConfigResponseBodyDataSpec setObservationWindowSize(String observationWindowSize) {
            this.observationWindowSize = observationWindowSize;
            return this;
        }
        public String getObservationWindowSize() {
            return this.observationWindowSize;
        }

        public DescribeAutoScalingConfigResponseBodyDataSpec setUpgrade(Boolean upgrade) {
            this.upgrade = upgrade;
            return this;
        }
        public Boolean getUpgrade() {
            return this.upgrade;
        }

    }

    public static class DescribeAutoScalingConfigResponseBodyDataStorage extends TeaModel {
        @NameInMap("DiskUsageUpperThreshold")
        public Integer diskUsageUpperThreshold;

        @NameInMap("MaxStorage")
        public Integer maxStorage;

        @NameInMap("Upgrade")
        public Boolean upgrade;

        public static DescribeAutoScalingConfigResponseBodyDataStorage build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutoScalingConfigResponseBodyDataStorage self = new DescribeAutoScalingConfigResponseBodyDataStorage();
            return TeaModel.build(map, self);
        }

        public DescribeAutoScalingConfigResponseBodyDataStorage setDiskUsageUpperThreshold(Integer diskUsageUpperThreshold) {
            this.diskUsageUpperThreshold = diskUsageUpperThreshold;
            return this;
        }
        public Integer getDiskUsageUpperThreshold() {
            return this.diskUsageUpperThreshold;
        }

        public DescribeAutoScalingConfigResponseBodyDataStorage setMaxStorage(Integer maxStorage) {
            this.maxStorage = maxStorage;
            return this;
        }
        public Integer getMaxStorage() {
            return this.maxStorage;
        }

        public DescribeAutoScalingConfigResponseBodyDataStorage setUpgrade(Boolean upgrade) {
            this.upgrade = upgrade;
            return this;
        }
        public Boolean getUpgrade() {
            return this.upgrade;
        }

    }

    public static class DescribeAutoScalingConfigResponseBodyData extends TeaModel {
        @NameInMap("Bandwidth")
        public DescribeAutoScalingConfigResponseBodyDataBandwidth bandwidth;

        @NameInMap("Resource")
        public DescribeAutoScalingConfigResponseBodyDataResource resource;

        @NameInMap("Shard")
        public DescribeAutoScalingConfigResponseBodyDataShard shard;

        @NameInMap("Spec")
        public DescribeAutoScalingConfigResponseBodyDataSpec spec;

        @NameInMap("Storage")
        public DescribeAutoScalingConfigResponseBodyDataStorage storage;

        public static DescribeAutoScalingConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutoScalingConfigResponseBodyData self = new DescribeAutoScalingConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeAutoScalingConfigResponseBodyData setBandwidth(DescribeAutoScalingConfigResponseBodyDataBandwidth bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public DescribeAutoScalingConfigResponseBodyDataBandwidth getBandwidth() {
            return this.bandwidth;
        }

        public DescribeAutoScalingConfigResponseBodyData setResource(DescribeAutoScalingConfigResponseBodyDataResource resource) {
            this.resource = resource;
            return this;
        }
        public DescribeAutoScalingConfigResponseBodyDataResource getResource() {
            return this.resource;
        }

        public DescribeAutoScalingConfigResponseBodyData setShard(DescribeAutoScalingConfigResponseBodyDataShard shard) {
            this.shard = shard;
            return this;
        }
        public DescribeAutoScalingConfigResponseBodyDataShard getShard() {
            return this.shard;
        }

        public DescribeAutoScalingConfigResponseBodyData setSpec(DescribeAutoScalingConfigResponseBodyDataSpec spec) {
            this.spec = spec;
            return this;
        }
        public DescribeAutoScalingConfigResponseBodyDataSpec getSpec() {
            return this.spec;
        }

        public DescribeAutoScalingConfigResponseBodyData setStorage(DescribeAutoScalingConfigResponseBodyDataStorage storage) {
            this.storage = storage;
            return this;
        }
        public DescribeAutoScalingConfigResponseBodyDataStorage getStorage() {
            return this.storage;
        }

    }

}
