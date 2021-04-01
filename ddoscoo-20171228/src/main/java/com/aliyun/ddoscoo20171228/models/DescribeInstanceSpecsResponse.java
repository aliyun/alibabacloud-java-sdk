// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

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

    public static class DescribeInstanceSpecsResponseInstanceSpecs extends TeaModel {
        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("BaseBandwidth")
        @Validation(required = true)
        public Integer baseBandwidth;

        @NameInMap("ElasticBandwidth")
        @Validation(required = true)
        public Integer elasticBandwidth;

        @NameInMap("PortLimit")
        @Validation(required = true)
        public Integer portLimit;

        @NameInMap("SiteLimit")
        @Validation(required = true)
        public Integer siteLimit;

        @NameInMap("DomainLimit")
        @Validation(required = true)
        public Integer domainLimit;

        @NameInMap("BandwidthMbps")
        @Validation(required = true)
        public Integer bandwidthMbps;

        @NameInMap("DefenseCount")
        @Validation(required = true)
        public Integer defenseCount;

        @NameInMap("FunctionVersion")
        @Validation(required = true)
        public String functionVersion;

        @NameInMap("QpsLimit")
        @Validation(required = true)
        public Integer qpsLimit;

        public static DescribeInstanceSpecsResponseInstanceSpecs build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceSpecsResponseInstanceSpecs self = new DescribeInstanceSpecsResponseInstanceSpecs();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceSpecsResponseInstanceSpecs setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstanceSpecsResponseInstanceSpecs setBaseBandwidth(Integer baseBandwidth) {
            this.baseBandwidth = baseBandwidth;
            return this;
        }
        public Integer getBaseBandwidth() {
            return this.baseBandwidth;
        }

        public DescribeInstanceSpecsResponseInstanceSpecs setElasticBandwidth(Integer elasticBandwidth) {
            this.elasticBandwidth = elasticBandwidth;
            return this;
        }
        public Integer getElasticBandwidth() {
            return this.elasticBandwidth;
        }

        public DescribeInstanceSpecsResponseInstanceSpecs setPortLimit(Integer portLimit) {
            this.portLimit = portLimit;
            return this;
        }
        public Integer getPortLimit() {
            return this.portLimit;
        }

        public DescribeInstanceSpecsResponseInstanceSpecs setSiteLimit(Integer siteLimit) {
            this.siteLimit = siteLimit;
            return this;
        }
        public Integer getSiteLimit() {
            return this.siteLimit;
        }

        public DescribeInstanceSpecsResponseInstanceSpecs setDomainLimit(Integer domainLimit) {
            this.domainLimit = domainLimit;
            return this;
        }
        public Integer getDomainLimit() {
            return this.domainLimit;
        }

        public DescribeInstanceSpecsResponseInstanceSpecs setBandwidthMbps(Integer bandwidthMbps) {
            this.bandwidthMbps = bandwidthMbps;
            return this;
        }
        public Integer getBandwidthMbps() {
            return this.bandwidthMbps;
        }

        public DescribeInstanceSpecsResponseInstanceSpecs setDefenseCount(Integer defenseCount) {
            this.defenseCount = defenseCount;
            return this;
        }
        public Integer getDefenseCount() {
            return this.defenseCount;
        }

        public DescribeInstanceSpecsResponseInstanceSpecs setFunctionVersion(String functionVersion) {
            this.functionVersion = functionVersion;
            return this;
        }
        public String getFunctionVersion() {
            return this.functionVersion;
        }

        public DescribeInstanceSpecsResponseInstanceSpecs setQpsLimit(Integer qpsLimit) {
            this.qpsLimit = qpsLimit;
            return this;
        }
        public Integer getQpsLimit() {
            return this.qpsLimit;
        }

    }

}
