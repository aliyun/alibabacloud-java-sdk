// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20171120.models;

import com.aliyun.tea.*;

public class DescribeResourcePackUsageResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Interval")
    @Validation(required = true)
    public Long interval;

    @NameInMap("StartTime")
    @Validation(required = true)
    public Long startTime;

    @NameInMap("EndTime")
    @Validation(required = true)
    public Long endTime;

    @NameInMap("PackUsages")
    @Validation(required = true)
    public java.util.List<DescribeResourcePackUsageResponsePackUsages> packUsages;

    public static DescribeResourcePackUsageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourcePackUsageResponse self = new DescribeResourcePackUsageResponse();
        return TeaModel.build(map, self);
    }

    public DescribeResourcePackUsageResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeResourcePackUsageResponse setInterval(Long interval) {
        this.interval = interval;
        return this;
    }
    public Long getInterval() {
        return this.interval;
    }

    public DescribeResourcePackUsageResponse setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeResourcePackUsageResponse setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeResourcePackUsageResponse setPackUsages(java.util.List<DescribeResourcePackUsageResponsePackUsages> packUsages) {
        this.packUsages = packUsages;
        return this;
    }
    public java.util.List<DescribeResourcePackUsageResponsePackUsages> getPackUsages() {
        return this.packUsages;
    }

    public static class DescribeResourcePackUsageResponsePackUsages extends TeaModel {
        @NameInMap("Traffic")
        @Validation(required = true)
        public Float traffic;

        @NameInMap("Time")
        @Validation(required = true)
        public Long time;

        public static DescribeResourcePackUsageResponsePackUsages build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourcePackUsageResponsePackUsages self = new DescribeResourcePackUsageResponsePackUsages();
            return TeaModel.build(map, self);
        }

        public DescribeResourcePackUsageResponsePackUsages setTraffic(Float traffic) {
            this.traffic = traffic;
            return this;
        }
        public Float getTraffic() {
            return this.traffic;
        }

        public DescribeResourcePackUsageResponsePackUsages setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

    }

}
