// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DescribeInstanceSpecsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("InstanceSpecs")
    @Validation(required = true)
    public java.util.List<DescribeInstanceSpecsResponseInstanceSpecs> instanceSpecs;

    public static DescribeInstanceSpecsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceSpecsResponse self = new DescribeInstanceSpecsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceSpecsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceSpecsResponse setInstanceSpecs(java.util.List<DescribeInstanceSpecsResponseInstanceSpecs> instanceSpecs) {
        this.instanceSpecs = instanceSpecs;
        return this;
    }
    public java.util.List<DescribeInstanceSpecsResponseInstanceSpecs> getInstanceSpecs() {
        return this.instanceSpecs;
    }

    public static class DescribeInstanceSpecsResponseInstanceSpecsPackConfig extends TeaModel {
        @NameInMap("PackAdvThre")
        @Validation(required = true)
        public Integer packAdvThre;

        @NameInMap("IpAdvanceThre")
        @Validation(required = true)
        public Integer ipAdvanceThre;

        @NameInMap("IpBasicThre")
        @Validation(required = true)
        public Integer ipBasicThre;

        @NameInMap("PackBasicThre")
        @Validation(required = true)
        public Integer packBasicThre;

        @NameInMap("IpSpec")
        @Validation(required = true)
        public Integer ipSpec;

        @NameInMap("BindIpCount")
        @Validation(required = true)
        public Integer bindIpCount;

        public static DescribeInstanceSpecsResponseInstanceSpecsPackConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceSpecsResponseInstanceSpecsPackConfig self = new DescribeInstanceSpecsResponseInstanceSpecsPackConfig();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceSpecsResponseInstanceSpecsPackConfig setPackAdvThre(Integer packAdvThre) {
            this.packAdvThre = packAdvThre;
            return this;
        }
        public Integer getPackAdvThre() {
            return this.packAdvThre;
        }

        public DescribeInstanceSpecsResponseInstanceSpecsPackConfig setIpAdvanceThre(Integer ipAdvanceThre) {
            this.ipAdvanceThre = ipAdvanceThre;
            return this;
        }
        public Integer getIpAdvanceThre() {
            return this.ipAdvanceThre;
        }

        public DescribeInstanceSpecsResponseInstanceSpecsPackConfig setIpBasicThre(Integer ipBasicThre) {
            this.ipBasicThre = ipBasicThre;
            return this;
        }
        public Integer getIpBasicThre() {
            return this.ipBasicThre;
        }

        public DescribeInstanceSpecsResponseInstanceSpecsPackConfig setPackBasicThre(Integer packBasicThre) {
            this.packBasicThre = packBasicThre;
            return this;
        }
        public Integer getPackBasicThre() {
            return this.packBasicThre;
        }

        public DescribeInstanceSpecsResponseInstanceSpecsPackConfig setIpSpec(Integer ipSpec) {
            this.ipSpec = ipSpec;
            return this;
        }
        public Integer getIpSpec() {
            return this.ipSpec;
        }

        public DescribeInstanceSpecsResponseInstanceSpecsPackConfig setBindIpCount(Integer bindIpCount) {
            this.bindIpCount = bindIpCount;
            return this;
        }
        public Integer getBindIpCount() {
            return this.bindIpCount;
        }

    }

    public static class DescribeInstanceSpecsResponseInstanceSpecs extends TeaModel {
        @NameInMap("Region")
        @Validation(required = true)
        public String region;

        @NameInMap("AvailableDeleteBlackholeCount")
        @Validation(required = true)
        public String availableDeleteBlackholeCount;

        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("PackConfig")
        @Validation(required = true)
        public DescribeInstanceSpecsResponseInstanceSpecsPackConfig packConfig;

        public static DescribeInstanceSpecsResponseInstanceSpecs build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceSpecsResponseInstanceSpecs self = new DescribeInstanceSpecsResponseInstanceSpecs();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceSpecsResponseInstanceSpecs setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeInstanceSpecsResponseInstanceSpecs setAvailableDeleteBlackholeCount(String availableDeleteBlackholeCount) {
            this.availableDeleteBlackholeCount = availableDeleteBlackholeCount;
            return this;
        }
        public String getAvailableDeleteBlackholeCount() {
            return this.availableDeleteBlackholeCount;
        }

        public DescribeInstanceSpecsResponseInstanceSpecs setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstanceSpecsResponseInstanceSpecs setPackConfig(DescribeInstanceSpecsResponseInstanceSpecsPackConfig packConfig) {
            this.packConfig = packConfig;
            return this;
        }
        public DescribeInstanceSpecsResponseInstanceSpecsPackConfig getPackConfig() {
            return this.packConfig;
        }

    }

}
