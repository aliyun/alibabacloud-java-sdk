// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeAutoScalingConfigResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The configurations of the auto scaling feature.</p>
     */
    @NameInMap("Data")
    public DescribeAutoScalingConfigResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * <br>
     * <p>>  If the request was successful, **Successful** is returned. If the request failed, an error message such as an error code is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
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
        /**
         * <p>The average bandwidth usage threshold that triggers automatic bandwidth downgrade. Unit: %.</p>
         */
        @NameInMap("BandwidthUsageLowerThreshold")
        public Integer bandwidthUsageLowerThreshold;

        /**
         * <p>The average bandwidth usage threshold that triggers automatic bandwidth adjustment. Unit: %.</p>
         */
        @NameInMap("BandwidthUsageUpperThreshold")
        public Integer bandwidthUsageUpperThreshold;

        /**
         * <p>Indicates whether the automatic bandwidth downgrade feature is enabled. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("Downgrade")
        public Boolean downgrade;

        /**
         * <p>The observation window of the automatic bandwidth adjustment feature. The return value consists of a numeric value and a time unit suffix. Valid values of the time unit suffix:</p>
         * <br>
         * <p>*   **s**: seconds.</p>
         * <p>*   **m**: minutes.</p>
         * <p>*   **h**: hours.</p>
         * <p>*   **d**: days.</p>
         * <br>
         * <p>>  A value of **5m** indicates 5 minutes.</p>
         */
        @NameInMap("ObservationWindowSize")
        public String observationWindowSize;

        /**
         * <p>Indicates whether the automatic bandwidth adjustment feature is enabled. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
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
        /**
         * <p>The scale-out step size of CPU.</p>
         */
        @NameInMap("CpuStep")
        public Integer cpuStep;

        /**
         * <p>The average CPU utilization threshold that triggers automatic scale-out of local resources. Unit: %.</p>
         */
        @NameInMap("CpuUsageUpperThreshold")
        public Integer cpuUsageUpperThreshold;

        /**
         * <p>The observation window of the automatic scale-in feature for local resources. The return value consists of a numeric value and a time unit suffix. Valid values of the time unit suffix:</p>
         * <br>
         * <p>*   **s**: seconds.</p>
         * <p>*   **m**: minutes.</p>
         * <p>*   **h**: hours.</p>
         * <p>*   **d**: days.</p>
         * <br>
         * <p>>  A value of **5m** indicates 5 minutes.</p>
         */
        @NameInMap("DowngradeObservationWindowSize")
        public String downgradeObservationWindowSize;

        /**
         * <p>Indicates whether the auto scaling feature is enabled for local resources. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        /**
         * <p>The observation window of the automatic scale-out feature for local resources. The return value consists of a numeric value and a time unit suffix. Valid values of the time unit suffix:</p>
         * <br>
         * <p>*   **s**: seconds.</p>
         * <p>*   **m**: minutes.</p>
         * <p>*   **h**: hours.</p>
         * <p>*   **d**: days.</p>
         * <br>
         * <p>>  A value of **5m** indicates 5 minutes.</p>
         */
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
        /**
         * <p>Indicates whether the feature of automatically removing shards is enabled. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("Downgrade")
        public Boolean downgrade;

        /**
         * <p>The observation window of the feature of automatically removing shards. The return value consists of a numeric value and a time unit suffix. Valid values of the time unit suffix:</p>
         * <br>
         * <p>*   **s**: seconds.</p>
         * <p>*   **m**: minutes.</p>
         * <p>*   **h**: hours.</p>
         * <p>*   **d**: days.</p>
         * <br>
         * <p>>  A value of **1d** indicates one day.</p>
         */
        @NameInMap("DowngradeObservationWindowSize")
        public String downgradeObservationWindowSize;

        /**
         * <p>The maximum number of shards in the instance.</p>
         */
        @NameInMap("MaxShards")
        public Integer maxShards;

        /**
         * <p>The average memory usage threshold that triggers automatic removal of shards. Unit: %.</p>
         */
        @NameInMap("MemUsageLowerThreshold")
        public Integer memUsageLowerThreshold;

        /**
         * <p>The average memory usage threshold that triggers automatic adding of shards. Unit: %.</p>
         */
        @NameInMap("MemUsageUpperThreshold")
        public Integer memUsageUpperThreshold;

        /**
         * <p>The minimum number of shards in the instance.</p>
         */
        @NameInMap("MinShards")
        public Integer minShards;

        /**
         * <p>Indicates whether the feature of automatically adding shards is enabled. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("Upgrade")
        public Boolean upgrade;

        /**
         * <p>The observation window of the feature of automatically adding shards. The return value consists of a numeric value and a time unit suffix. Valid values of the time unit suffix:</p>
         * <br>
         * <p>*   **s**: seconds.</p>
         * <p>*   **m**: minutes.</p>
         * <p>*   **h**: hours.</p>
         * <p>*   **d**: days.</p>
         * <br>
         * <p>>  A value of **5m** indicates 5 minutes.</p>
         */
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
        /**
         * <p>The quiescent period. The return value consists of a numeric value and a time unit suffix. Valid values of the time unit suffix:</p>
         * <br>
         * <p>*   **s**: seconds.</p>
         * <p>*   **m**: minutes.</p>
         * <p>*   **h**: hours.</p>
         * <p>*   **d**: days.</p>
         * <br>
         * <p>>  A value of **5m** indicates 5 minutes.</p>
         */
        @NameInMap("CoolDownTime")
        public String coolDownTime;

        /**
         * <p>The average CPU utilization threshold that triggers automatic specification scale-up. Unit: %.</p>
         */
        @NameInMap("CpuUsageUpperThreshold")
        public Integer cpuUsageUpperThreshold;

        /**
         * <p>Indicates whether the automatic specification scale-down feature is enabled. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("Downgrade")
        public Boolean downgrade;

        /**
         * <p>The maximum number of read-only nodes of the instance.</p>
         */
        @NameInMap("MaxReadOnlyNodes")
        public Integer maxReadOnlyNodes;

        /**
         * <p>The maximum specifications to which the database instance can be upgraded. For more information about the specifications of each type of supported database instances, see the following topics:</p>
         * <br>
         * <p>*   PolarDB for MySQL Cluster Edition instances: [Specifications of compute nodes](https://help.aliyun.com/document_detail/102542.html).</p>
         * <p>*   ApsaraDB RDS for MySQL High-availability Edition instances that use standard SSDs or enhanced SSDs (ESSDs): [Specifications](https://help.aliyun.com/document_detail/276974.html).</p>
         */
        @NameInMap("MaxSpec")
        public String maxSpec;

        /**
         * <p>The average memory usage threshold that triggers automatic specification scale-up. Unit: %.</p>
         */
        @NameInMap("MemUsageUpperThreshold")
        public Integer memUsageUpperThreshold;

        /**
         * <p>The observation window. The return value consists of a numeric value and a time unit suffix. Valid values of the time unit suffix:</p>
         * <br>
         * <p>*   **s**: seconds.</p>
         * <p>*   **m**: minutes.</p>
         * <p>*   **h**: hours.</p>
         * <p>*   **d**: days.</p>
         * <br>
         * <p>>  A value of **5m** indicates 5 minutes.</p>
         */
        @NameInMap("ObservationWindowSize")
        public String observationWindowSize;

        /**
         * <p>Indicates whether the automatic specification scale-up feature is enabled. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
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
        /**
         * <p>The average storage usage threshold that triggers automatic storage expansion. Unit: %.</p>
         */
        @NameInMap("DiskUsageUpperThreshold")
        public Integer diskUsageUpperThreshold;

        /**
         * <p>The maximum storage size. Unit: GB.</p>
         */
        @NameInMap("MaxStorage")
        public Integer maxStorage;

        /**
         * <p>Indicates whether the automatic storage expansion feature is enabled. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
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
        /**
         * <p>The configurations of the automatic bandwidth adjustment feature.</p>
         */
        @NameInMap("Bandwidth")
        public DescribeAutoScalingConfigResponseBodyDataBandwidth bandwidth;

        /**
         * <p>The configurations of the auto scaling feature for local resources.</p>
         */
        @NameInMap("Resource")
        public DescribeAutoScalingConfigResponseBodyDataResource resource;

        /**
         * <p>The configurations of the auto scaling feature for shards.</p>
         */
        @NameInMap("Shard")
        public DescribeAutoScalingConfigResponseBodyDataShard shard;

        /**
         * <p>The configurations of the auto scaling feature for specifications.</p>
         */
        @NameInMap("Spec")
        public DescribeAutoScalingConfigResponseBodyDataSpec spec;

        /**
         * <p>The configurations of the automatic storage expansion feature.</p>
         */
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
