// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

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

    public static class DescribeInstanceSpecsResponseBodyInstanceSpecs extends TeaModel {
        @NameInMap("BandwidthMbps")
        public Integer bandwidthMbps;

        @NameInMap("BaseBandwidth")
        public Integer baseBandwidth;

        @NameInMap("ConnLimit")
        public Long connLimit;

        @NameInMap("CpsLimit")
        public Long cpsLimit;

        @NameInMap("DefenseCount")
        public Integer defenseCount;

        @NameInMap("DomainLimit")
        public Integer domainLimit;

        @NameInMap("ElasticBandwidth")
        public Integer elasticBandwidth;

        @NameInMap("ElasticBw")
        public Integer elasticBw;

        @NameInMap("ElasticBwModel")
        public String elasticBwModel;

        @NameInMap("FunctionVersion")
        public String functionVersion;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("PortLimit")
        public Integer portLimit;

        @NameInMap("QpsLimit")
        public Integer qpsLimit;

        @NameInMap("SiteLimit")
        public Integer siteLimit;

        public static DescribeInstanceSpecsResponseBodyInstanceSpecs build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceSpecsResponseBodyInstanceSpecs self = new DescribeInstanceSpecsResponseBodyInstanceSpecs();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceSpecsResponseBodyInstanceSpecs setBandwidthMbps(Integer bandwidthMbps) {
            this.bandwidthMbps = bandwidthMbps;
            return this;
        }
        public Integer getBandwidthMbps() {
            return this.bandwidthMbps;
        }

        public DescribeInstanceSpecsResponseBodyInstanceSpecs setBaseBandwidth(Integer baseBandwidth) {
            this.baseBandwidth = baseBandwidth;
            return this;
        }
        public Integer getBaseBandwidth() {
            return this.baseBandwidth;
        }

        public DescribeInstanceSpecsResponseBodyInstanceSpecs setConnLimit(Long connLimit) {
            this.connLimit = connLimit;
            return this;
        }
        public Long getConnLimit() {
            return this.connLimit;
        }

        public DescribeInstanceSpecsResponseBodyInstanceSpecs setCpsLimit(Long cpsLimit) {
            this.cpsLimit = cpsLimit;
            return this;
        }
        public Long getCpsLimit() {
            return this.cpsLimit;
        }

        public DescribeInstanceSpecsResponseBodyInstanceSpecs setDefenseCount(Integer defenseCount) {
            this.defenseCount = defenseCount;
            return this;
        }
        public Integer getDefenseCount() {
            return this.defenseCount;
        }

        public DescribeInstanceSpecsResponseBodyInstanceSpecs setDomainLimit(Integer domainLimit) {
            this.domainLimit = domainLimit;
            return this;
        }
        public Integer getDomainLimit() {
            return this.domainLimit;
        }

        public DescribeInstanceSpecsResponseBodyInstanceSpecs setElasticBandwidth(Integer elasticBandwidth) {
            this.elasticBandwidth = elasticBandwidth;
            return this;
        }
        public Integer getElasticBandwidth() {
            return this.elasticBandwidth;
        }

        public DescribeInstanceSpecsResponseBodyInstanceSpecs setElasticBw(Integer elasticBw) {
            this.elasticBw = elasticBw;
            return this;
        }
        public Integer getElasticBw() {
            return this.elasticBw;
        }

        public DescribeInstanceSpecsResponseBodyInstanceSpecs setElasticBwModel(String elasticBwModel) {
            this.elasticBwModel = elasticBwModel;
            return this;
        }
        public String getElasticBwModel() {
            return this.elasticBwModel;
        }

        public DescribeInstanceSpecsResponseBodyInstanceSpecs setFunctionVersion(String functionVersion) {
            this.functionVersion = functionVersion;
            return this;
        }
        public String getFunctionVersion() {
            return this.functionVersion;
        }

        public DescribeInstanceSpecsResponseBodyInstanceSpecs setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstanceSpecsResponseBodyInstanceSpecs setPortLimit(Integer portLimit) {
            this.portLimit = portLimit;
            return this;
        }
        public Integer getPortLimit() {
            return this.portLimit;
        }

        public DescribeInstanceSpecsResponseBodyInstanceSpecs setQpsLimit(Integer qpsLimit) {
            this.qpsLimit = qpsLimit;
            return this;
        }
        public Integer getQpsLimit() {
            return this.qpsLimit;
        }

        public DescribeInstanceSpecsResponseBodyInstanceSpecs setSiteLimit(Integer siteLimit) {
            this.siteLimit = siteLimit;
            return this;
        }
        public Integer getSiteLimit() {
            return this.siteLimit;
        }

    }

}
