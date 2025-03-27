// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antiddos_public20170518.models;

import com.aliyun.tea.*;

public class DescribeIpDdosThresholdResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>025F1688-680B-551A-9A8E-1A0D796315CF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>An array that consists of the details of the threshold.</p>
     */
    @NameInMap("Threshold")
    public DescribeIpDdosThresholdResponseBodyThreshold threshold;

    public static DescribeIpDdosThresholdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeIpDdosThresholdResponseBody self = new DescribeIpDdosThresholdResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeIpDdosThresholdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeIpDdosThresholdResponseBody setThreshold(DescribeIpDdosThresholdResponseBodyThreshold threshold) {
        this.threshold = threshold;
        return this;
    }
    public DescribeIpDdosThresholdResponseBodyThreshold getThreshold() {
        return this.threshold;
    }

    public static class DescribeIpDdosThresholdResponseBodyThreshold extends TeaModel {
        /**
         * <p>If the value of the <strong>DdosType</strong> parameter is <strong>defense</strong>, the Bps parameter indicates the current traffic scrubbing threshold. Unit: Mbit/s.</p>
         * <p>If the value of the <strong>DdosType</strong> parameter is <strong>blackhole</strong>, the Bps parameter indicates the basic protection threshold. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>7500</p>
         */
        @NameInMap("Bps")
        public Integer bps;

        /**
         * <p>The type of the threshold. Valid values:</p>
         * <ul>
         * <li><strong>defense</strong>: traffic scrubbing threshold</li>
         * <li><strong>blackhole</strong>: DDoS mitigation threshold</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>defense</p>
         */
        @NameInMap("DdosType")
        public String ddosType;

        /**
         * <p>The burstable protection threshold (the maximum DDoS mitigation threshold). Unit: Mbit/s.</p>
         * <blockquote>
         * <p>This parameter is returned only when the value of the <strong>DdosType</strong> parameter is <strong>blackhole</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>12310</p>
         */
        @NameInMap("ElasticBps")
        public Integer elasticBps;

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp1i88rqjza51s****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The IP address of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>192.0.XX.XX</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>Indicates whether the threshold is automatically adjusted. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The scrubbing thresholds are automatically adjusted based on the traffic load on the asset.</li>
         * <li><strong>false</strong>: The scrubbing thresholds are not automatically adjusted. You must manually specify the scrubbing thresholds.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsAuto")
        public Boolean isAuto;

        /**
         * <p>The maximum traffic scrubbing threshold. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>7500</p>
         */
        @NameInMap("MaxBps")
        public Integer maxBps;

        /**
         * <p>The maximum packet scrubbing threshold. Unit: pps.</p>
         * 
         * <strong>example:</strong>
         * <p>5000000</p>
         */
        @NameInMap("MaxPps")
        public Integer maxPps;

        /**
         * <p>The packet scrubbing threshold. Unit: packets per second (pps).</p>
         * <blockquote>
         * <p>This parameter is returned only when the value of the <strong>DdosType</strong> parameter is <strong>defense</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5000000</p>
         */
        @NameInMap("Pps")
        public Integer pps;

        public static DescribeIpDdosThresholdResponseBodyThreshold build(java.util.Map<String, ?> map) throws Exception {
            DescribeIpDdosThresholdResponseBodyThreshold self = new DescribeIpDdosThresholdResponseBodyThreshold();
            return TeaModel.build(map, self);
        }

        public DescribeIpDdosThresholdResponseBodyThreshold setBps(Integer bps) {
            this.bps = bps;
            return this;
        }
        public Integer getBps() {
            return this.bps;
        }

        public DescribeIpDdosThresholdResponseBodyThreshold setDdosType(String ddosType) {
            this.ddosType = ddosType;
            return this;
        }
        public String getDdosType() {
            return this.ddosType;
        }

        public DescribeIpDdosThresholdResponseBodyThreshold setElasticBps(Integer elasticBps) {
            this.elasticBps = elasticBps;
            return this;
        }
        public Integer getElasticBps() {
            return this.elasticBps;
        }

        public DescribeIpDdosThresholdResponseBodyThreshold setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeIpDdosThresholdResponseBodyThreshold setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public DescribeIpDdosThresholdResponseBodyThreshold setIsAuto(Boolean isAuto) {
            this.isAuto = isAuto;
            return this;
        }
        public Boolean getIsAuto() {
            return this.isAuto;
        }

        public DescribeIpDdosThresholdResponseBodyThreshold setMaxBps(Integer maxBps) {
            this.maxBps = maxBps;
            return this;
        }
        public Integer getMaxBps() {
            return this.maxBps;
        }

        public DescribeIpDdosThresholdResponseBodyThreshold setMaxPps(Integer maxPps) {
            this.maxPps = maxPps;
            return this;
        }
        public Integer getMaxPps() {
            return this.maxPps;
        }

        public DescribeIpDdosThresholdResponseBodyThreshold setPps(Integer pps) {
            this.pps = pps;
            return this;
        }
        public Integer getPps() {
            return this.pps;
        }

    }

}
