// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DescribeInstanceSpecsResponseBody extends TeaModel {
    /**
     * <p>The number of IP addresses that are protected by the Anti-DDoS Origin Enterprise instance.</p>
     */
    @NameInMap("InstanceSpecs")
    public java.util.List<DescribeInstanceSpecsResponseBodyInstanceSpecs> instanceSpecs;

    /**
     * <p>The number of times that the unlimited protection feature can be enabled.</p>
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
        @NameInMap("Bandwidth")
        public Long bandwidth;

        /**
         * <p>The ID of the Anti-DDoS Origin Enterprise instance.</p>
         */
        @NameInMap("BindIpCount")
        public Integer bindIpCount;

        /**
         * <p>DescribeInstanceSpecs</p>
         */
        @NameInMap("IpAdvanceThre")
        public Integer ipAdvanceThre;

        /**
         * <p>WB269094</p>
         */
        @NameInMap("IpBasicThre")
        public Integer ipBasicThre;

        @NameInMap("IpSpec")
        public Integer ipSpec;

        /**
         * <p>DescribeInstanceSpecs</p>
         */
        @NameInMap("NormalBandwidth")
        public Integer normalBandwidth;

        /**
         * <p>All Alibaba Cloud API operations must include common request parameters. For more information about common request parameters, see [Common parameters](~~118841~~).</p>
         * <br>
         * <p>For more information about sample requests, see the **"Examples"** section of this topic.</p>
         */
        @NameInMap("PackAdvThre")
        public Integer packAdvThre;

        /**
         * <p>The ID of the request.</p>
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
         * <p>The ID of the Anti-DDoS Origin Enterprise instance. This parameter value is a string consisting of JSON arrays. Each element in a JSON array indicates an instance ID. If you want to query more than one instance, separate instance IDs with commas (,).</p>
         * <br>
         * <p>>  You can call the [DescribeInstanceList](~~118698~~) operation to query the IDs of all Anti-DDoS Origin Enterprise instances in a specific region.</p>
         */
        @NameInMap("AvailableDefenseTimes")
        public Integer availableDefenseTimes;

        /**
         * <p>The basic protection bandwidth of the Anti-DDoS Origin Enterprise instance. Unit: Gbit/s.</p>
         */
        @NameInMap("AvailableDeleteBlackholeCount")
        public String availableDeleteBlackholeCount;

        /**
         * <p>The number of IP addresses that can be protected by the Anti-DDoS Origin Enterprise instance.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The region ID of the Anti-DDoS Origin Enterprise instance.</p>
         * <br>
         * <p>>  You can call the [DescribeRegions](~~118703~~) operation to query the name of the region.</p>
         */
        @NameInMap("IsFullDefenseMode")
        public Integer isFullDefenseMode;

        /**
         * <p>The specifications of the Anti-DDoS Origin Enterprise instance, including whether the unlimited protection feature is enabled, and the numbers of times that the unlimited protection feature can be enabled and has been enabled.</p>
         */
        @NameInMap("PackConfig")
        public DescribeInstanceSpecsResponseBodyInstanceSpecsPackConfig packConfig;

        /**
         * <p>The number of times that blackhole filtering can be deactivated.</p>
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
