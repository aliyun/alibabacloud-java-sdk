// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DescribeInstanceSpecsResponseBody extends TeaModel {
    @NameInMap("InstanceSpecs")
    public java.util.List<DescribeInstanceSpecsResponseBodyInstanceSpecs> instanceSpecs;

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
        @NameInMap("BindIpCount")
        public Integer bindIpCount;

        @NameInMap("IpAdvanceThre")
        public Integer ipAdvanceThre;

        @NameInMap("IpBasicThre")
        public Integer ipBasicThre;

        @NameInMap("IpSpec")
        public Integer ipSpec;

        @NameInMap("NormalBandwidth")
        public Integer normalBandwidth;

        @NameInMap("PackAdvThre")
        public Integer packAdvThre;

        @NameInMap("PackBasicThre")
        public Integer packBasicThre;

        public static DescribeInstanceSpecsResponseBodyInstanceSpecsPackConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceSpecsResponseBodyInstanceSpecsPackConfig self = new DescribeInstanceSpecsResponseBodyInstanceSpecsPackConfig();
            return TeaModel.build(map, self);
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
        @NameInMap("AvailableDefenseTimes")
        public Integer availableDefenseTimes;

        @NameInMap("AvailableDeleteBlackholeCount")
        public String availableDeleteBlackholeCount;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("IsFullDefenseMode")
        public Integer isFullDefenseMode;

        @NameInMap("PackConfig")
        public DescribeInstanceSpecsResponseBodyInstanceSpecsPackConfig packConfig;

        @NameInMap("Region")
        public String region;

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
