// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antiddos_public20170518.models;

import com.aliyun.tea.*;

public class DescribeDdosThresholdResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Bps")
        public Integer bps;

        @NameInMap("DdosType")
        public String ddosType;

        @NameInMap("ElasticBps")
        public Integer elasticBps;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("IsAuto")
        public Boolean isAuto;

        @NameInMap("MaxBps")
        public Integer maxBps;

        @NameInMap("MaxPps")
        public Integer maxPps;

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
