// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeAutoScalingConfigResponseBody extends TeaModel {
    /**
     * <p>The returned status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The elastic scaling feature configuration of the instance.</p>
     */
    @NameInMap("Data")
    public DescribeAutoScalingConfigResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * <blockquote>
     * <p>If the request is successful, <strong>Successful</strong> is returned. If the request fails, an error message such as an error code is returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B6D17591-B48B-4D31-9CD6-9B9796B2****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request is successful.</li>
     * <li><strong>false</strong>: The request fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("BandwidthUsageLowerThreshold")
        public Integer bandwidthUsageLowerThreshold;

        /**
         * <p>The average bandwidth usage threshold that triggers automatic bandwidth upgrade. Unit: %.</p>
         * 
         * <strong>example:</strong>
         * <p>70</p>
         */
        @NameInMap("BandwidthUsageUpperThreshold")
        public Integer bandwidthUsageUpperThreshold;

        /**
         * <p>Indicates whether automatic bandwidth downgrade is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Enabled.</li>
         * <li><strong>false</strong>: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Downgrade")
        public Boolean downgrade;

        /**
         * <p>The observation window for automatic bandwidth upgrade. The value consists of a number and a time unit suffix. The time unit suffixes are:</p>
         * <ul>
         * <li><strong>s</strong>: seconds.</li>
         * <li><strong>m</strong>: minutes.</li>
         * <li><strong>h</strong>: hours.</li>
         * <li><strong>d</strong>: days.</li>
         * </ul>
         * <blockquote>
         * <p>For example, <strong>5m</strong> indicates 5 minutes.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5m</p>
         */
        @NameInMap("ObservationWindowSize")
        public String observationWindowSize;

        /**
         * <p>Indicates whether automatic bandwidth upgrade is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Enabled.</li>
         * <li><strong>false</strong>: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
         * <p>The CPU scale-up increment.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("CpuStep")
        public Integer cpuStep;

        /**
         * <p>The average CPU utilization threshold that triggers automatic local resource scale-up. Unit: %.</p>
         * 
         * <strong>example:</strong>
         * <p>70</p>
         */
        @NameInMap("CpuUsageUpperThreshold")
        public Integer cpuUsageUpperThreshold;

        /**
         * <p>The scale-down observation window. The value consists of a number and a time unit suffix. The time unit suffixes are:</p>
         * <ul>
         * <li><strong>s</strong>: seconds.</li>
         * <li><strong>m</strong>: minutes.</li>
         * <li><strong>h</strong>: hours.</li>
         * <li><strong>d</strong>: days.</li>
         * </ul>
         * <blockquote>
         * <p>For example, <strong>5m</strong> indicates 5 minutes.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5m</p>
         */
        @NameInMap("DowngradeObservationWindowSize")
        public String downgradeObservationWindowSize;

        /**
         * <p>Indicates whether local resource elastic scaling is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Enabled.</li>
         * <li><strong>false</strong>: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        /**
         * <p>The scale-up observation window. The value consists of a number and a time unit suffix. The time unit suffixes are:</p>
         * <ul>
         * <li><strong>s</strong>: seconds.</li>
         * <li><strong>m</strong>: minutes.</li>
         * <li><strong>h</strong>: hours.</li>
         * <li><strong>d</strong>: days.</li>
         * </ul>
         * <blockquote>
         * <p>For example, <strong>5m</strong> indicates 5 minutes.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5m</p>
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
         * <p>Indicates whether automatic shard removal is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Enabled.</li>
         * <li><strong>false</strong>: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Downgrade")
        public Boolean downgrade;

        /**
         * <p>The observation window for automatic shard removal. The value consists of a number and a time unit suffix. The time unit suffixes are:</p>
         * <ul>
         * <li><strong>s</strong>: seconds.</li>
         * <li><strong>m</strong>: minutes.</li>
         * <li><strong>h</strong>: hours.</li>
         * <li><strong>d</strong>: days.</li>
         * </ul>
         * <blockquote>
         * <p>For example, <strong>1d</strong> indicates 1 day.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1d</p>
         */
        @NameInMap("DowngradeObservationWindowSize")
        public String downgradeObservationWindowSize;

        /**
         * <p>The maximum total number of shards for the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("MaxShards")
        public Integer maxShards;

        /**
         * <p>The average memory utilization threshold that triggers automatic shard removal. Unit: %.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("MemUsageLowerThreshold")
        public Integer memUsageLowerThreshold;

        /**
         * <p>The average memory utilization threshold that triggers automatic shard addition. Unit: %.</p>
         * 
         * <strong>example:</strong>
         * <p>70</p>
         */
        @NameInMap("MemUsageUpperThreshold")
        public Integer memUsageUpperThreshold;

        /**
         * <p>The minimum total number of shards for the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("MinShards")
        public Integer minShards;

        /**
         * <p>Indicates whether automatic shard addition is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Enabled.</li>
         * <li><strong>false</strong>: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Upgrade")
        public Boolean upgrade;

        /**
         * <p>The observation window for automatic shard addition. The value consists of a number and a time unit suffix. The time unit suffixes are:</p>
         * <ul>
         * <li><strong>s</strong>: seconds.</li>
         * <li><strong>m</strong>: minutes.</li>
         * <li><strong>h</strong>: hours.</li>
         * <li><strong>d</strong>: days.</li>
         * </ul>
         * <blockquote>
         * <p>For example, <strong>5m</strong> indicates 5 minutes.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5m</p>
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
         * <p>The cool-down period. The value consists of a number and a time unit suffix. The time unit suffixes are:</p>
         * <ul>
         * <li><strong>s</strong>: seconds.</li>
         * <li><strong>m</strong>: minutes.</li>
         * <li><strong>h</strong>: hours.</li>
         * <li><strong>d</strong>: days.</li>
         * </ul>
         * <blockquote>
         * <p>For example, <strong>5m</strong> indicates 5 minutes.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5m</p>
         */
        @NameInMap("CoolDownTime")
        public String coolDownTime;

        /**
         * <p>The average CPU utilization threshold that triggers automatic specification scale-up. Unit: %.</p>
         * 
         * <strong>example:</strong>
         * <p>70</p>
         */
        @NameInMap("CpuUsageUpperThreshold")
        public Integer cpuUsageUpperThreshold;

        /**
         * <p>Indicates whether automatic specification scale-down is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Enabled.</li>
         * <li><strong>false</strong>: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Downgrade")
        public Boolean downgrade;

        /**
         * <p>The maximum number of read-only nodes for the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("MaxReadOnlyNodes")
        public Integer maxReadOnlyNodes;

        /**
         * <p>The maximum specification for automatic scale-up. For details, refer to the product specification documentation for each database instance:
         * &lt;props=&quot;china&quot;&gt;</p>
         * <ul>
         * <li>For PolarDB for MySQL Cluster Edition, see <a href="https://help.aliyun.com/document_detail/102542.html">Compute node specifications</a>.</li>
         * <li>For ApsaraDB RDS for MySQL high-availability series with cloud disks, see <a href="https://help.aliyun.com/document_detail/276974.html">Product specifications</a>.</li>
         * <li>For Redis community cloud disk edition, see <a href="https://help.aliyun.com/document_detail/144986.html">Instance specifications</a>.</li>
         * </ul>
         * <p>&lt;props=&quot;intl&quot;&gt;</p>
         * <ul>
         * <li>For PolarDB for MySQL Cluster Edition, see <a href="https://help.aliyun.com/document_detail/102542.html">Compute node specifications</a>.</li>
         * <li>For ApsaraDB RDS for MySQL high-availability series with cloud disks, see <a href="https://help.aliyun.com/document_detail/276974.html">Product specifications</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>polar.mysql.x8.12xlarge</p>
         */
        @NameInMap("MaxSpec")
        public String maxSpec;

        /**
         * <p>The average memory utilization threshold that triggers automatic specification scale-up. Unit: %.</p>
         * 
         * <strong>example:</strong>
         * <p>70</p>
         */
        @NameInMap("MemUsageUpperThreshold")
        public Integer memUsageUpperThreshold;

        /**
         * <p>The observation window. The value consists of a number and a time unit suffix. The time unit suffixes are:</p>
         * <ul>
         * <li><strong>s</strong>: seconds.</li>
         * <li><strong>m</strong>: minutes.</li>
         * <li><strong>h</strong>: hours.</li>
         * <li><strong>d</strong>: days.</li>
         * </ul>
         * <blockquote>
         * <p>For example, <strong>5m</strong> indicates 5 minutes.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5m</p>
         */
        @NameInMap("ObservationWindowSize")
        public String observationWindowSize;

        /**
         * <p>Indicates whether automatic specification scale-up is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Enabled.</li>
         * <li><strong>false</strong>: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
         * <p>The average storage utilization threshold that triggers automatic storage scaling. Unit: %.</p>
         * 
         * <strong>example:</strong>
         * <p>70</p>
         */
        @NameInMap("DiskUsageUpperThreshold")
        public Integer diskUsageUpperThreshold;

        /**
         * <p>The maximum storage capacity. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>32000</p>
         */
        @NameInMap("MaxStorage")
        public Integer maxStorage;

        /**
         * <p>Indicates whether automatic storage scaling is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Enabled.</li>
         * <li><strong>false</strong>: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
         * <p>The bandwidth elastic scaling feature configuration of the instance.</p>
         */
        @NameInMap("Bandwidth")
        public DescribeAutoScalingConfigResponseBodyDataBandwidth bandwidth;

        /**
         * <p>The local resource elastic scaling feature configuration of the instance.</p>
         */
        @NameInMap("Resource")
        public DescribeAutoScalingConfigResponseBodyDataResource resource;

        /**
         * <p>The shard elastic scaling feature configuration of the instance.</p>
         */
        @NameInMap("Shard")
        public DescribeAutoScalingConfigResponseBodyDataShard shard;

        /**
         * <p>The specification elastic scaling feature configuration.</p>
         */
        @NameInMap("Spec")
        public DescribeAutoScalingConfigResponseBodyDataSpec spec;

        /**
         * <p>The Automatic storage scaling feature configuration of the instance.</p>
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
