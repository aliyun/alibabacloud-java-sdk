// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DescribeInstanceSpecsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("InstanceSpecs")
    public java.util.List<DescribeInstanceSpecsResponseBodyInstanceSpecs> instanceSpecs;

    public static DescribeInstanceSpecsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceSpecsResponseBody self = new DescribeInstanceSpecsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceSpecsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceSpecsResponseBody setInstanceSpecs(java.util.List<DescribeInstanceSpecsResponseBodyInstanceSpecs> instanceSpecs) {
        this.instanceSpecs = instanceSpecs;
        return this;
    }
    public java.util.List<DescribeInstanceSpecsResponseBodyInstanceSpecs> getInstanceSpecs() {
        return this.instanceSpecs;
    }

    public static class DescribeInstanceSpecsResponseBodyInstanceSpecsPackConfig extends TeaModel {
        @NameInMap("PackBasicThre")
        public Integer packBasicThre;

        @NameInMap("BindIpCount")
        public Integer bindIpCount;

        @NameInMap("PackAdvThre")
        public Integer packAdvThre;

        @NameInMap("IpBasicThre")
        public Integer ipBasicThre;

        @NameInMap("IpAdvanceThre")
        public Integer ipAdvanceThre;

        @NameInMap("IpSpec")
        public Integer ipSpec;

        public static DescribeInstanceSpecsResponseBodyInstanceSpecsPackConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceSpecsResponseBodyInstanceSpecsPackConfig self = new DescribeInstanceSpecsResponseBodyInstanceSpecsPackConfig();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceSpecsResponseBodyInstanceSpecsPackConfig setPackBasicThre(Integer packBasicThre) {
            this.packBasicThre = packBasicThre;
            return this;
        }
        public Integer getPackBasicThre() {
            return this.packBasicThre;
        }

        public DescribeInstanceSpecsResponseBodyInstanceSpecsPackConfig setBindIpCount(Integer bindIpCount) {
            this.bindIpCount = bindIpCount;
            return this;
        }
        public Integer getBindIpCount() {
            return this.bindIpCount;
        }

        public DescribeInstanceSpecsResponseBodyInstanceSpecsPackConfig setPackAdvThre(Integer packAdvThre) {
            this.packAdvThre = packAdvThre;
            return this;
        }
        public Integer getPackAdvThre() {
            return this.packAdvThre;
        }

        public DescribeInstanceSpecsResponseBodyInstanceSpecsPackConfig setIpBasicThre(Integer ipBasicThre) {
            this.ipBasicThre = ipBasicThre;
            return this;
        }
        public Integer getIpBasicThre() {
            return this.ipBasicThre;
        }

        public DescribeInstanceSpecsResponseBodyInstanceSpecsPackConfig setIpAdvanceThre(Integer ipAdvanceThre) {
            this.ipAdvanceThre = ipAdvanceThre;
            return this;
        }
        public Integer getIpAdvanceThre() {
            return this.ipAdvanceThre;
        }

        public DescribeInstanceSpecsResponseBodyInstanceSpecsPackConfig setIpSpec(Integer ipSpec) {
            this.ipSpec = ipSpec;
            return this;
        }
        public Integer getIpSpec() {
            return this.ipSpec;
        }

    }

    public static class DescribeInstanceSpecsResponseBodyInstanceSpecs extends TeaModel {
        @NameInMap("PackConfig")
        public DescribeInstanceSpecsResponseBodyInstanceSpecsPackConfig packConfig;

        @NameInMap("Region")
        public String region;

        @NameInMap("AvailableDeleteBlackholeCount")
        public String availableDeleteBlackholeCount;

        @NameInMap("InstanceId")
        public String instanceId;

        public static DescribeInstanceSpecsResponseBodyInstanceSpecs build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceSpecsResponseBodyInstanceSpecs self = new DescribeInstanceSpecsResponseBodyInstanceSpecs();
            return TeaModel.build(map, self);
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

    }

}
