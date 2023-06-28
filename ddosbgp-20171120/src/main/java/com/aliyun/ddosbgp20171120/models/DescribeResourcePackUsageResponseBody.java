// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20171120.models;

import com.aliyun.tea.*;

public class DescribeResourcePackUsageResponseBody extends TeaModel {
    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("Interval")
    public Long interval;

    @NameInMap("PackUsages")
    public java.util.List<DescribeResourcePackUsageResponseBodyPackUsages> packUsages;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StartTime")
    public Long startTime;

    public static DescribeResourcePackUsageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourcePackUsageResponseBody self = new DescribeResourcePackUsageResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeResourcePackUsageResponseBody setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeResourcePackUsageResponseBody setInterval(Long interval) {
        this.interval = interval;
        return this;
    }
    public Long getInterval() {
        return this.interval;
    }

    public DescribeResourcePackUsageResponseBody setPackUsages(java.util.List<DescribeResourcePackUsageResponseBodyPackUsages> packUsages) {
        this.packUsages = packUsages;
        return this;
    }
    public java.util.List<DescribeResourcePackUsageResponseBodyPackUsages> getPackUsages() {
        return this.packUsages;
    }

    public DescribeResourcePackUsageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeResourcePackUsageResponseBody setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public static class DescribeResourcePackUsageResponseBodyPackUsages extends TeaModel {
        @NameInMap("Time")
        public Long time;

        @NameInMap("Traffic")
        public Float traffic;

        public static DescribeResourcePackUsageResponseBodyPackUsages build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourcePackUsageResponseBodyPackUsages self = new DescribeResourcePackUsageResponseBodyPackUsages();
            return TeaModel.build(map, self);
        }

        public DescribeResourcePackUsageResponseBodyPackUsages setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public DescribeResourcePackUsageResponseBodyPackUsages setTraffic(Float traffic) {
            this.traffic = traffic;
            return this;
        }
        public Float getTraffic() {
            return this.traffic;
        }

    }

}
