// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antiddos_public20170518.models;

import com.aliyun.tea.*;

public class DescribeDdosThresholdResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>E9B3C090-55AD-59C6-979E-FCFD81E7D9E7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>An array that consists of the details of the threshold.</p>
     */
    @NameInMap("Thresholds")
    public DescribeDdosThresholdResponseBodyThresholds thresholds;

    public static DescribeDdosThresholdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDdosThresholdResponseBody self = new DescribeDdosThresholdResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDdosThresholdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDdosThresholdResponseBody setThresholds(DescribeDdosThresholdResponseBodyThresholds thresholds) {
        this.thresholds = thresholds;
        return this;
    }
    public DescribeDdosThresholdResponseBodyThresholds getThresholds() {
        return this.thresholds;
    }

    public static class DescribeDdosThresholdResponseBodyThresholdsThreshold extends TeaModel {
        /**
         * <p>If the value of the <strong>DdosType</strong> parameter is <strong>defense</strong>, the Bps parameter indicates the current traffic scrubbing threshold. Unit: Mbit/s.</p>
         * <p>If the value of the <strong>DdosType</strong> parameter is <strong>blackhole</strong>, the Bps parameter indicates the basic protection threshold. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
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
         * <p>i-bp10bclrt56fblts****</p>
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
         * <p>1024</p>
         */
        @NameInMap("MaxBps")
        public Integer maxBps;

        /**
         * <p>The maximum packet scrubbing threshold. Unit: pps.</p>
         * 
         * <strong>example:</strong>
         * <p>150000</p>
         */
        @NameInMap("MaxPps")
        public Integer maxPps;

        /**
         * <p>The packet scrubbing threshold. Unit: pps.</p>
         * <blockquote>
         * <p>This parameter is returned only when the value of the <strong>DdosType</strong> parameter is <strong>defense</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>150000</p>
         */
        @NameInMap("Pps")
        public Integer pps;

        public static DescribeDdosThresholdResponseBodyThresholdsThreshold build(java.util.Map<String, ?> map) throws Exception {
            DescribeDdosThresholdResponseBodyThresholdsThreshold self = new DescribeDdosThresholdResponseBodyThresholdsThreshold();
            return TeaModel.build(map, self);
        }

        public DescribeDdosThresholdResponseBodyThresholdsThreshold setBps(Integer bps) {
            this.bps = bps;
            return this;
        }
        public Integer getBps() {
            return this.bps;
        }

        public DescribeDdosThresholdResponseBodyThresholdsThreshold setDdosType(String ddosType) {
            this.ddosType = ddosType;
            return this;
        }
        public String getDdosType() {
            return this.ddosType;
        }

        public DescribeDdosThresholdResponseBodyThresholdsThreshold setElasticBps(Integer elasticBps) {
            this.elasticBps = elasticBps;
            return this;
        }
        public Integer getElasticBps() {
            return this.elasticBps;
        }

        public DescribeDdosThresholdResponseBodyThresholdsThreshold setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeDdosThresholdResponseBodyThresholdsThreshold setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public DescribeDdosThresholdResponseBodyThresholdsThreshold setIsAuto(Boolean isAuto) {
            this.isAuto = isAuto;
            return this;
        }
        public Boolean getIsAuto() {
            return this.isAuto;
        }

        public DescribeDdosThresholdResponseBodyThresholdsThreshold setMaxBps(Integer maxBps) {
            this.maxBps = maxBps;
            return this;
        }
        public Integer getMaxBps() {
            return this.maxBps;
        }

        public DescribeDdosThresholdResponseBodyThresholdsThreshold setMaxPps(Integer maxPps) {
            this.maxPps = maxPps;
            return this;
        }
        public Integer getMaxPps() {
            return this.maxPps;
        }

        public DescribeDdosThresholdResponseBodyThresholdsThreshold setPps(Integer pps) {
            this.pps = pps;
            return this;
        }
        public Integer getPps() {
            return this.pps;
        }

    }

    public static class DescribeDdosThresholdResponseBodyThresholds extends TeaModel {
        @NameInMap("Threshold")
        public java.util.List<DescribeDdosThresholdResponseBodyThresholdsThreshold> threshold;

        public static DescribeDdosThresholdResponseBodyThresholds build(java.util.Map<String, ?> map) throws Exception {
            DescribeDdosThresholdResponseBodyThresholds self = new DescribeDdosThresholdResponseBodyThresholds();
            return TeaModel.build(map, self);
        }

        public DescribeDdosThresholdResponseBodyThresholds setThreshold(java.util.List<DescribeDdosThresholdResponseBodyThresholdsThreshold> threshold) {
            this.threshold = threshold;
            return this;
        }
        public java.util.List<DescribeDdosThresholdResponseBodyThresholdsThreshold> getThreshold() {
            return this.threshold;
        }

    }

}
