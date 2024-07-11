// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeInstanceSpecsResponseBody extends TeaModel {
    /**
     * <p>The details of the specifications of the instance.</p>
     */
    @NameInMap("InstanceSpecs")
    public java.util.List<DescribeInstanceSpecsResponseBodyInstanceSpecs> instanceSpecs;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>4E3A9B5F-5DDB-593D-A1E6-F1F451DB5E0B</p>
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

    public static class DescribeInstanceSpecsResponseBodyInstanceSpecs extends TeaModel {
        /**
         * <p>The clean bandwidth. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("BandwidthMbps")
        public Integer bandwidthMbps;

        /**
         * <p>The basic protection bandwidth. Unit: Gbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("BaseBandwidth")
        public Integer baseBandwidth;

        /**
         * <p>The specification of concurrent connections of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>100000</p>
         */
        @NameInMap("ConnLimit")
        public Long connLimit;

        /**
         * <p>The specification of new connections of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>5000</p>
         */
        @NameInMap("CpsLimit")
        public Long cpsLimit;

        /**
         * <p>The number of available advanced mitigation sessions for this month. <strong>-1</strong>: unlimited</p>
         * <blockquote>
         * <p> This parameter is returned only when the request parameter <strong>RegionId</strong> is set to <strong>ap-southeast-1</strong>. If RegionId is set to ap-southeast-1, the specifications of Anti-DDoS Proxy (Outside Chinese Mainland) instances are queried.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("DefenseCount")
        public Integer defenseCount;

        /**
         * <p>The number of domain names that can be protected by the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("DomainLimit")
        public Integer domainLimit;

        /**
         * <p>The burstable protection bandwidth. Unit: Gbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("ElasticBandwidth")
        public Integer elasticBandwidth;

        /**
         * <p>The burstable clean bandwidth. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("ElasticBw")
        public Integer elasticBw;

        /**
         * <p>The metering method of the burstable clean bandwidth. Valid values:</p>
         * <ul>
         * <li><strong>day</strong>: the metering method of daily 95th percentile</li>
         * <li><strong>month</strong>: the metering method of monthly 95th percentile</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>day</p>
         */
        @NameInMap("ElasticBwModel")
        public String elasticBwModel;

        /**
         * <p>The burstable QPS. Unit: QPS</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ElasticQps")
        public Long elasticQps;

        /**
         * <p>The metering method of the burstable QPS. Valid values:</p>
         * <ul>
         * <li><strong>day</strong>: the metering method of daily 95th percentile</li>
         * <li><strong>month</strong>: the metering method of monthly 95th percentile</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>day</p>
         */
        @NameInMap("ElasticQpsMode")
        public String elasticQpsMode;

        /**
         * <p>The function plan of the instance. Valid values:</p>
         * <ul>
         * <li><strong>default</strong>: Standard</li>
         * <li><strong>enhance</strong>: Enhanced</li>
         * <li><strong>cnhk</strong>: Chinese Mainland Acceleration (CMA)</li>
         * <li><strong>cnhk_default</strong>: Secure Chinese Mainland Acceleration (Sec-CMA) standard</li>
         * <li><strong>cnhk_enhance</strong>: Sec-CMA enhanced</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("FunctionVersion")
        public String functionVersion;

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ddoscoo-cn-zvp2eibz****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The number of ports that can be protected by the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("PortLimit")
        public Integer portLimit;

        /**
         * <p>The clean QPS.</p>
         * 
         * <strong>example:</strong>
         * <p>3000</p>
         */
        @NameInMap("QpsLimit")
        public Integer qpsLimit;

        /**
         * <p>The threshold of the clean bandwidth. Valid values: 0 to 15360. The value 0 indicates that rate limiting is never triggered. Unit: Mbit/s</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RealLimitBw")
        public Long realLimitBw;

        /**
         * <p>The number of sites that can be protected by the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
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

        public DescribeInstanceSpecsResponseBodyInstanceSpecs setElasticQps(Long elasticQps) {
            this.elasticQps = elasticQps;
            return this;
        }
        public Long getElasticQps() {
            return this.elasticQps;
        }

        public DescribeInstanceSpecsResponseBodyInstanceSpecs setElasticQpsMode(String elasticQpsMode) {
            this.elasticQpsMode = elasticQpsMode;
            return this;
        }
        public String getElasticQpsMode() {
            return this.elasticQpsMode;
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

        public DescribeInstanceSpecsResponseBodyInstanceSpecs setRealLimitBw(Long realLimitBw) {
            this.realLimitBw = realLimitBw;
            return this;
        }
        public Long getRealLimitBw() {
            return this.realLimitBw;
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
