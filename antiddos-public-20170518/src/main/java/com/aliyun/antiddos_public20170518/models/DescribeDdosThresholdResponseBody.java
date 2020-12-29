// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antiddos_public20170518.models;

import com.aliyun.tea.*;

public class DescribeDdosThresholdResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Thresholds")
    public java.util.List<DescribeDdosThresholdResponseBodyThresholds> thresholds;

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

    public DescribeDdosThresholdResponseBody setThresholds(java.util.List<DescribeDdosThresholdResponseBodyThresholds> thresholds) {
        this.thresholds = thresholds;
        return this;
    }
    public java.util.List<DescribeDdosThresholdResponseBodyThresholds> getThresholds() {
        return this.thresholds;
    }

    public static class DescribeDdosThresholdResponseBodyThresholds extends TeaModel {
        @NameInMap("DdosType")
        public String ddosType;

        @NameInMap("IsAuto")
        public Boolean isAuto;

        @NameInMap("MaxBps")
        public Integer maxBps;

        @NameInMap("ElasticBps")
        public Integer elasticBps;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Bps")
        public Integer bps;

        @NameInMap("Pps")
        public Integer pps;

        @NameInMap("MaxPps")
        public Integer maxPps;

        public static DescribeDdosThresholdResponseBodyThresholds build(java.util.Map<String, ?> map) throws Exception {
            DescribeDdosThresholdResponseBodyThresholds self = new DescribeDdosThresholdResponseBodyThresholds();
            return TeaModel.build(map, self);
        }

        public DescribeDdosThresholdResponseBodyThresholds setDdosType(String ddosType) {
            this.ddosType = ddosType;
            return this;
        }
        public String getDdosType() {
            return this.ddosType;
        }

        public DescribeDdosThresholdResponseBodyThresholds setIsAuto(Boolean isAuto) {
            this.isAuto = isAuto;
            return this;
        }
        public Boolean getIsAuto() {
            return this.isAuto;
        }

        public DescribeDdosThresholdResponseBodyThresholds setMaxBps(Integer maxBps) {
            this.maxBps = maxBps;
            return this;
        }
        public Integer getMaxBps() {
            return this.maxBps;
        }

        public DescribeDdosThresholdResponseBodyThresholds setElasticBps(Integer elasticBps) {
            this.elasticBps = elasticBps;
            return this;
        }
        public Integer getElasticBps() {
            return this.elasticBps;
        }

        public DescribeDdosThresholdResponseBodyThresholds setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeDdosThresholdResponseBodyThresholds setBps(Integer bps) {
            this.bps = bps;
            return this;
        }
        public Integer getBps() {
            return this.bps;
        }

        public DescribeDdosThresholdResponseBodyThresholds setPps(Integer pps) {
            this.pps = pps;
            return this;
        }
        public Integer getPps() {
            return this.pps;
        }

        public DescribeDdosThresholdResponseBodyThresholds setMaxPps(Integer maxPps) {
            this.maxPps = maxPps;
            return this;
        }
        public Integer getMaxPps() {
            return this.maxPps;
        }

    }

}
