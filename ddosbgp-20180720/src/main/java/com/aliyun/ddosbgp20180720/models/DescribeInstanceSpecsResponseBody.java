// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DescribeInstanceSpecsResponseBody extends TeaModel {
    /**
     * <p>The specifications of the Anti-DDoS Origin instance, including whether best-effort protection is enabled, the number of available best-effort protection sessions, and the number of used best-effort protection sessions.</p>
     */
    @NameInMap("InstanceSpecs")
    public java.util.List<DescribeInstanceSpecsResponseBodyInstanceSpecs> instanceSpecs;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>5840AB9F-1419-4620-807D-5EA476090247</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeInstanceSpecsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceSpecsResponseBody self = new DescribeInstanceSpecsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceSpecsResponseBody setInstanceSpecs(java.util.List<DescribeInstanceSpecsResponseBodyInstanceSpecs> instanceSpecs) {
        this.instanceSpecs = instanceSpecs;
        return this;
    }
    public java.util.List<DescribeInstanceSpecsResponseBodyInstanceSpecs> getInstanceSpecs() {
        return this.instanceSpecs;
    }

    public DescribeInstanceSpecsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeInstanceSpecsResponseBodyInstanceSpecsPackConfig extends TeaModel {
        /**
         * <p>The bandwidth. Unit: Gbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Bandwidth")
        public Long bandwidth;

        /**
         * <p>The number of IP addresses that are protected by the Anti-DDoS Origin Enterprise instance.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("BindIpCount")
        public Integer bindIpCount;

        /**
         * <p>The burstable clean bandwidth. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ElasticBwMbps")
        public Integer elasticBwMbps;

        /**
         * <p>The metering method of burstable clean bandwidth. Valid values:</p>
         * <ul>
         * <li><strong>month</strong>: the monthly 95th percentile metering method.</li>
         * <li><strong>day</strong>: the daily 95th percentile metering method.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>day</p>
         */
        @NameInMap("ElasticBwMode")
        public String elasticBwMode;

        /**
         * <p>The burstable protection bandwidth of each protected IP address. Unit: Gbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("IpAdvanceThre")
        public Integer ipAdvanceThre;

        /**
         * <p>The basic protection bandwidth of each protected IP address. Unit: Gbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("IpBasicThre")
        public Integer ipBasicThre;

        /**
         * <p>The number of IP addresses that can be protected by the Anti-DDoS Origin Enterprise instance.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("IpSpec")
        public Integer ipSpec;

        /**
         * <p>The clean bandwidth. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("NormalBandwidth")
        public Integer normalBandwidth;

        /**
         * <p>The burstable protection bandwidth of the Anti-DDoS Origin instance. Unit: Gbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("PackAdvThre")
        public Integer packAdvThre;

        /**
         * <p>The basic protection bandwidth of the Anti-DDoS Origin instance. Unit: Gbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PackBasicThre")
        public Integer packBasicThre;

        public static DescribeInstanceSpecsResponseBodyInstanceSpecsPackConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceSpecsResponseBodyInstanceSpecsPackConfig self = new DescribeInstanceSpecsResponseBodyInstanceSpecsPackConfig();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceSpecsResponseBodyInstanceSpecsPackConfig setBandwidth(Long bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Long getBandwidth() {
            return this.bandwidth;
        }

        public DescribeInstanceSpecsResponseBodyInstanceSpecsPackConfig setBindIpCount(Integer bindIpCount) {
            this.bindIpCount = bindIpCount;
            return this;
        }
        public Integer getBindIpCount() {
            return this.bindIpCount;
        }

        public DescribeInstanceSpecsResponseBodyInstanceSpecsPackConfig setElasticBwMbps(Integer elasticBwMbps) {
            this.elasticBwMbps = elasticBwMbps;
            return this;
        }
        public Integer getElasticBwMbps() {
            return this.elasticBwMbps;
        }

        public DescribeInstanceSpecsResponseBodyInstanceSpecsPackConfig setElasticBwMode(String elasticBwMode) {
            this.elasticBwMode = elasticBwMode;
            return this;
        }
        public String getElasticBwMode() {
            return this.elasticBwMode;
        }

        public DescribeInstanceSpecsResponseBodyInstanceSpecsPackConfig setIpAdvanceThre(Integer ipAdvanceThre) {
            this.ipAdvanceThre = ipAdvanceThre;
            return this;
        }
        public Integer getIpAdvanceThre() {
            return this.ipAdvanceThre;
        }

        public DescribeInstanceSpecsResponseBodyInstanceSpecsPackConfig setIpBasicThre(Integer ipBasicThre) {
            this.ipBasicThre = ipBasicThre;
            return this;
        }
        public Integer getIpBasicThre() {
            return this.ipBasicThre;
        }

        public DescribeInstanceSpecsResponseBodyInstanceSpecsPackConfig setIpSpec(Integer ipSpec) {
            this.ipSpec = ipSpec;
            return this;
        }
        public Integer getIpSpec() {
            return this.ipSpec;
        }

        public DescribeInstanceSpecsResponseBodyInstanceSpecsPackConfig setNormalBandwidth(Integer normalBandwidth) {
            this.normalBandwidth = normalBandwidth;
            return this;
        }
        public Integer getNormalBandwidth() {
            return this.normalBandwidth;
        }

        public DescribeInstanceSpecsResponseBodyInstanceSpecsPackConfig setPackAdvThre(Integer packAdvThre) {
            this.packAdvThre = packAdvThre;
            return this;
        }
        public Integer getPackAdvThre() {
            return this.packAdvThre;
        }

        public DescribeInstanceSpecsResponseBodyInstanceSpecsPackConfig setPackBasicThre(Integer packBasicThre) {
            this.packBasicThre = packBasicThre;
            return this;
        }
        public Integer getPackBasicThre() {
            return this.packBasicThre;
        }

    }

    public static class DescribeInstanceSpecsResponseBodyInstanceSpecs extends TeaModel {
        /**
         * <p>The available best-effort protection sessions.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("AvailableDefenseTimes")
        public Integer availableDefenseTimes;

        /**
         * <p>The number of times that blackhole filtering can be deactivated.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("AvailableDeleteBlackholeCount")
        public String availableDeleteBlackholeCount;

        /**
         * <p>The percentage of the used best-effort protection sessions. Unit: %.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("DefenseTimesPercent")
        public Integer defenseTimesPercent;

        /**
         * <p>Indicates whether the instance is downgraded. Valid value:</p>
         * <ul>
         * <li><strong>8</strong>: The instance is downgraded due to excessive bandwidth usage.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("DowngradeStatus")
        public Integer downgradeStatus;

        /**
         * <p>The ID of the Anti-DDoS Origin instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ddosbgp-cn-n6w1r7nz****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>Indicates whether best-effort protection is enabled. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Best-effort protection is disabled.</li>
         * <li><strong>1</strong>: Best-effort protection is enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IsFullDefenseMode")
        public Integer isFullDefenseMode;

        /**
         * <p>The configurations of the Anti-DDoS Origin instance, including the number of protected IP addresses and protection bandwidth.</p>
         */
        @NameInMap("PackConfig")
        public DescribeInstanceSpecsResponseBodyInstanceSpecsPackConfig packConfig;

        /**
         * <p>The region ID of the Anti-DDoS Origin instance.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/118703.html">DescribeRegions</a> operation to query the name of the region.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The total best-effort protection sessions.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("TotalDefenseTimes")
        public Integer totalDefenseTimes;

        public static DescribeInstanceSpecsResponseBodyInstanceSpecs build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceSpecsResponseBodyInstanceSpecs self = new DescribeInstanceSpecsResponseBodyInstanceSpecs();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceSpecsResponseBodyInstanceSpecs setAvailableDefenseTimes(Integer availableDefenseTimes) {
            this.availableDefenseTimes = availableDefenseTimes;
            return this;
        }
        public Integer getAvailableDefenseTimes() {
            return this.availableDefenseTimes;
        }

        public DescribeInstanceSpecsResponseBodyInstanceSpecs setAvailableDeleteBlackholeCount(String availableDeleteBlackholeCount) {
            this.availableDeleteBlackholeCount = availableDeleteBlackholeCount;
            return this;
        }
        public String getAvailableDeleteBlackholeCount() {
            return this.availableDeleteBlackholeCount;
        }

        public DescribeInstanceSpecsResponseBodyInstanceSpecs setDefenseTimesPercent(Integer defenseTimesPercent) {
            this.defenseTimesPercent = defenseTimesPercent;
            return this;
        }
        public Integer getDefenseTimesPercent() {
            return this.defenseTimesPercent;
        }

        public DescribeInstanceSpecsResponseBodyInstanceSpecs setDowngradeStatus(Integer downgradeStatus) {
            this.downgradeStatus = downgradeStatus;
            return this;
        }
        public Integer getDowngradeStatus() {
            return this.downgradeStatus;
        }

        public DescribeInstanceSpecsResponseBodyInstanceSpecs setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstanceSpecsResponseBodyInstanceSpecs setIsFullDefenseMode(Integer isFullDefenseMode) {
            this.isFullDefenseMode = isFullDefenseMode;
            return this;
        }
        public Integer getIsFullDefenseMode() {
            return this.isFullDefenseMode;
        }

        public DescribeInstanceSpecsResponseBodyInstanceSpecs setPackConfig(DescribeInstanceSpecsResponseBodyInstanceSpecsPackConfig packConfig) {
            this.packConfig = packConfig;
            return this;
        }
        public DescribeInstanceSpecsResponseBodyInstanceSpecsPackConfig getPackConfig() {
            return this.packConfig;
        }

        public DescribeInstanceSpecsResponseBodyInstanceSpecs setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeInstanceSpecsResponseBodyInstanceSpecs setTotalDefenseTimes(Integer totalDefenseTimes) {
            this.totalDefenseTimes = totalDefenseTimes;
            return this;
        }
        public Integer getTotalDefenseTimes() {
            return this.totalDefenseTimes;
        }

    }

}
