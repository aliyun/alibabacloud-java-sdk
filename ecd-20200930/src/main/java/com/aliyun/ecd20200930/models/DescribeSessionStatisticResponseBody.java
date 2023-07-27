// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeSessionStatisticResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Statistic")
    public java.util.List<DescribeSessionStatisticResponseBodyStatistic> statistic;

    @NameInMap("TotalCount")
    public String totalCount;

    public static DescribeSessionStatisticResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSessionStatisticResponseBody self = new DescribeSessionStatisticResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSessionStatisticResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSessionStatisticResponseBody setStatistic(java.util.List<DescribeSessionStatisticResponseBodyStatistic> statistic) {
        this.statistic = statistic;
        return this;
    }
    public java.util.List<DescribeSessionStatisticResponseBodyStatistic> getStatistic() {
        return this.statistic;
    }

    public DescribeSessionStatisticResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeSessionStatisticResponseBodyStatistic extends TeaModel {
        @NameInMap("Count")
        public Long count;

        @NameInMap("TimePoint")
        public Long timePoint;

        public static DescribeSessionStatisticResponseBodyStatistic build(java.util.Map<String, ?> map) throws Exception {
            DescribeSessionStatisticResponseBodyStatistic self = new DescribeSessionStatisticResponseBodyStatistic();
            return TeaModel.build(map, self);
        }

        public DescribeSessionStatisticResponseBodyStatistic setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public DescribeSessionStatisticResponseBodyStatistic setTimePoint(Long timePoint) {
            this.timePoint = timePoint;
            return this;
        }
        public Long getTimePoint() {
            return this.timePoint;
        }

    }

}
