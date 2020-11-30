// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20171120.models;

import com.aliyun.tea.*;

public class DescribePackPaidTrafficResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PackPaidTraffics")
    @Validation(required = true)
    public java.util.List<DescribePackPaidTrafficResponsePackPaidTraffics> packPaidTraffics;

    public static DescribePackPaidTrafficResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePackPaidTrafficResponse self = new DescribePackPaidTrafficResponse();
        return TeaModel.build(map, self);
    }

    public DescribePackPaidTrafficResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePackPaidTrafficResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribePackPaidTrafficResponse setPackPaidTraffics(java.util.List<DescribePackPaidTrafficResponsePackPaidTraffics> packPaidTraffics) {
        this.packPaidTraffics = packPaidTraffics;
        return this;
    }
    public java.util.List<DescribePackPaidTrafficResponsePackPaidTraffics> getPackPaidTraffics() {
        return this.packPaidTraffics;
    }

    public static class DescribePackPaidTrafficResponsePackPaidTraffics extends TeaModel {
        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("StartTime")
        @Validation(required = true)
        public Long startTime;

        @NameInMap("BaseBandwidth")
        @Validation(required = true)
        public Integer baseBandwidth;

        @NameInMap("ElasticBandwidth")
        @Validation(required = true)
        public Integer elasticBandwidth;

        @NameInMap("PaidCapacity")
        @Validation(required = true)
        public Float paidCapacity;

        @NameInMap("TotalCapacity")
        @Validation(required = true)
        public Float totalCapacity;

        @NameInMap("MaxAttack")
        @Validation(required = true)
        public Float maxAttack;

        public static DescribePackPaidTrafficResponsePackPaidTraffics build(java.util.Map<String, ?> map) throws Exception {
            DescribePackPaidTrafficResponsePackPaidTraffics self = new DescribePackPaidTrafficResponsePackPaidTraffics();
            return TeaModel.build(map, self);
        }

        public DescribePackPaidTrafficResponsePackPaidTraffics setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribePackPaidTrafficResponsePackPaidTraffics setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribePackPaidTrafficResponsePackPaidTraffics setBaseBandwidth(Integer baseBandwidth) {
            this.baseBandwidth = baseBandwidth;
            return this;
        }
        public Integer getBaseBandwidth() {
            return this.baseBandwidth;
        }

        public DescribePackPaidTrafficResponsePackPaidTraffics setElasticBandwidth(Integer elasticBandwidth) {
            this.elasticBandwidth = elasticBandwidth;
            return this;
        }
        public Integer getElasticBandwidth() {
            return this.elasticBandwidth;
        }

        public DescribePackPaidTrafficResponsePackPaidTraffics setPaidCapacity(Float paidCapacity) {
            this.paidCapacity = paidCapacity;
            return this;
        }
        public Float getPaidCapacity() {
            return this.paidCapacity;
        }

        public DescribePackPaidTrafficResponsePackPaidTraffics setTotalCapacity(Float totalCapacity) {
            this.totalCapacity = totalCapacity;
            return this;
        }
        public Float getTotalCapacity() {
            return this.totalCapacity;
        }

        public DescribePackPaidTrafficResponsePackPaidTraffics setMaxAttack(Float maxAttack) {
            this.maxAttack = maxAttack;
            return this;
        }
        public Float getMaxAttack() {
            return this.maxAttack;
        }

    }

}
