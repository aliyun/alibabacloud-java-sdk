// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antiddos_public20170518.models;

import com.aliyun.tea.*;

public class DescribeIpDdosThresholdResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Bps")
        public Integer bps;

        @NameInMap("DdosType")
        public String ddosType;

        @NameInMap("ElasticBps")
        public Integer elasticBps;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InternetIp")
        public String internetIp;

        @NameInMap("IsAuto")
        public Boolean isAuto;

        @NameInMap("MaxBps")
        public Integer maxBps;

        @NameInMap("MaxPps")
        public Integer maxPps;

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
