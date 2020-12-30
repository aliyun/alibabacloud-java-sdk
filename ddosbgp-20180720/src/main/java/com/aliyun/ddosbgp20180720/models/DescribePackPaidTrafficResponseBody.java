// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DescribePackPaidTrafficResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PackPaidTraffics")
    public java.util.List<DescribePackPaidTrafficResponseBodyPackPaidTraffics> packPaidTraffics;

    public static DescribePackPaidTrafficResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePackPaidTrafficResponseBody self = new DescribePackPaidTrafficResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePackPaidTrafficResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribePackPaidTrafficResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePackPaidTrafficResponseBody setPackPaidTraffics(java.util.List<DescribePackPaidTrafficResponseBodyPackPaidTraffics> packPaidTraffics) {
        this.packPaidTraffics = packPaidTraffics;
        return this;
    }
    public java.util.List<DescribePackPaidTrafficResponseBodyPackPaidTraffics> getPackPaidTraffics() {
        return this.packPaidTraffics;
    }

    public static class DescribePackPaidTrafficResponseBodyPackPaidTraffics extends TeaModel {
        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("BaseBandwidth")
        public Integer baseBandwidth;

        @NameInMap("ElasticBandwidth")
        public Integer elasticBandwidth;

        @NameInMap("TotalCapacity")
        public Float totalCapacity;

        @NameInMap("MaxAttack")
        public Float maxAttack;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("PaidCapacity")
        public Float paidCapacity;

        public static DescribePackPaidTrafficResponseBodyPackPaidTraffics build(java.util.Map<String, ?> map) throws Exception {
            DescribePackPaidTrafficResponseBodyPackPaidTraffics self = new DescribePackPaidTrafficResponseBodyPackPaidTraffics();
            return TeaModel.build(map, self);
        }

        public DescribePackPaidTrafficResponseBodyPackPaidTraffics setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribePackPaidTrafficResponseBodyPackPaidTraffics setBaseBandwidth(Integer baseBandwidth) {
            this.baseBandwidth = baseBandwidth;
            return this;
        }
        public Integer getBaseBandwidth() {
            return this.baseBandwidth;
        }

        public DescribePackPaidTrafficResponseBodyPackPaidTraffics setElasticBandwidth(Integer elasticBandwidth) {
            this.elasticBandwidth = elasticBandwidth;
            return this;
        }
        public Integer getElasticBandwidth() {
            return this.elasticBandwidth;
        }

        public DescribePackPaidTrafficResponseBodyPackPaidTraffics setTotalCapacity(Float totalCapacity) {
            this.totalCapacity = totalCapacity;
            return this;
        }
        public Float getTotalCapacity() {
            return this.totalCapacity;
        }

        public DescribePackPaidTrafficResponseBodyPackPaidTraffics setMaxAttack(Float maxAttack) {
            this.maxAttack = maxAttack;
            return this;
        }
        public Float getMaxAttack() {
            return this.maxAttack;
        }

        public DescribePackPaidTrafficResponseBodyPackPaidTraffics setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribePackPaidTrafficResponseBodyPackPaidTraffics setPaidCapacity(Float paidCapacity) {
            this.paidCapacity = paidCapacity;
            return this;
        }
        public Float getPaidCapacity() {
            return this.paidCapacity;
        }

    }

}
