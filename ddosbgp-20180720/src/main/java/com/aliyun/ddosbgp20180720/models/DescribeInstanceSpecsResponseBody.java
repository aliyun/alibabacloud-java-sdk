// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DescribeInstanceSpecsResponseBody extends TeaModel {
    /**
     * <p>The specifications of the Anti-DDoS Origin Enterprise instance, including whether the unlimited protection feature is enabled, and the numbers of times that the unlimited protection feature can be enabled and has been enabled.</p>
     */
    @NameInMap("InstanceSpecs")
    public java.util.List<DescribeInstanceSpecsResponseBodyInstanceSpecs> instanceSpecs;

    /**
     * <p>The ID of the request.</p>
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
         * <p>The bandwidth of the package configuration.</p>
         */
        @NameInMap("Bandwidth")
        public Long bandwidth;

        /**
         * <p>The number of IP addresses that are protected by the Anti-DDoS Origin Enterprise instance.</p>
         */
        @NameInMap("BindIpCount")
        public Integer bindIpCount;

        /**
         * <p>The burstable bandwidth of each protected IP address. Unit: Gbit/s.</p>
         */
        @NameInMap("IpAdvanceThre")
        public Integer ipAdvanceThre;

        /**
         * <p>The basic bandwidth of each protected IP address. Unit: Gbit/s.</p>
         */
        @NameInMap("IpBasicThre")
        public Integer ipBasicThre;

        /**
         * <p>The number of IP addresses that can be protected by the Anti-DDoS Origin Enterprise instance.</p>
         */
        @NameInMap("IpSpec")
        public Integer ipSpec;

        /**
         * <p>The normal clean bandwidth. Unit: Mbit/s.</p>
         */
        @NameInMap("NormalBandwidth")
        public Integer normalBandwidth;

        /**
         * <p>The burstable protection bandwidth of the Anti-DDoS Origin Enterprise instance. Unit: Gbit/s.</p>
         */
        @NameInMap("PackAdvThre")
        public Integer packAdvThre;

        /**
         * <p>The basic protection bandwidth of the Anti-DDoS Origin Enterprise instance. Unit: Gbit/s.</p>
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
         * <p>The number of times that the unlimited protection feature can be enabled.</p>
         */
        @NameInMap("AvailableDefenseTimes")
        public Integer availableDefenseTimes;

        /**
         * <p>The number of times that blackhole filtering can be deactivated.</p>
         */
        @NameInMap("AvailableDeleteBlackholeCount")
        public String availableDeleteBlackholeCount;

        @NameInMap("DefenseTimesPercent")
        public Integer defenseTimesPercent;

        /**
         * <p>The ID of the Anti-DDoS Origin Enterprise instance.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>Indicates whether the unlimited protection feature is enabled. Valid values:</p>
         * <br>
         * <p>*   **0**: The unlimited protection feature is disabled.</p>
         * <p>*   **1**: The unlimited protection feature is enabled.</p>
         */
        @NameInMap("IsFullDefenseMode")
        public Integer isFullDefenseMode;

        /**
         * <p>The configurations of the Anti-DDoS Origin Enterprise instance, including the number of protected IP addresses and protection bandwidth.</p>
         */
        @NameInMap("PackConfig")
        public DescribeInstanceSpecsResponseBodyInstanceSpecsPackConfig packConfig;

        /**
         * <p>The region ID of the Anti-DDoS Origin Enterprise instance.</p>
         * <br>
         * <p>>  You can call the [DescribeRegions](https://help.aliyun.com/document_detail/118703.html) operation to query the name of the region.</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The number of times that the unlimited protection feature can be enabled.</p>
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
