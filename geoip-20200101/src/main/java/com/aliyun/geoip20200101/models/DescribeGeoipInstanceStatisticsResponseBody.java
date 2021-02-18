// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.geoip20200101.models;

import com.aliyun.tea.*;

public class DescribeGeoipInstanceStatisticsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Statistics")
    public DescribeGeoipInstanceStatisticsResponseBodyStatistics statistics;

    public static DescribeGeoipInstanceStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGeoipInstanceStatisticsResponseBody self = new DescribeGeoipInstanceStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGeoipInstanceStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGeoipInstanceStatisticsResponseBody setStatistics(DescribeGeoipInstanceStatisticsResponseBodyStatistics statistics) {
        this.statistics = statistics;
        return this;
    }
    public DescribeGeoipInstanceStatisticsResponseBodyStatistics getStatistics() {
        return this.statistics;
    }

    public static class DescribeGeoipInstanceStatisticsResponseBodyStatisticsStatistic extends TeaModel {
        @NameInMap("Timestamp")
        public Long timestamp;

        @NameInMap("Count")
        public Long count;

        public static DescribeGeoipInstanceStatisticsResponseBodyStatisticsStatistic build(java.util.Map<String, ?> map) throws Exception {
            DescribeGeoipInstanceStatisticsResponseBodyStatisticsStatistic self = new DescribeGeoipInstanceStatisticsResponseBodyStatisticsStatistic();
            return TeaModel.build(map, self);
        }

        public DescribeGeoipInstanceStatisticsResponseBodyStatisticsStatistic setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public DescribeGeoipInstanceStatisticsResponseBodyStatisticsStatistic setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

    }

    public static class DescribeGeoipInstanceStatisticsResponseBodyStatistics extends TeaModel {
        @NameInMap("Statistic")
        public java.util.List<DescribeGeoipInstanceStatisticsResponseBodyStatisticsStatistic> statistic;

        public static DescribeGeoipInstanceStatisticsResponseBodyStatistics build(java.util.Map<String, ?> map) throws Exception {
            DescribeGeoipInstanceStatisticsResponseBodyStatistics self = new DescribeGeoipInstanceStatisticsResponseBodyStatistics();
            return TeaModel.build(map, self);
        }

        public DescribeGeoipInstanceStatisticsResponseBodyStatistics setStatistic(java.util.List<DescribeGeoipInstanceStatisticsResponseBodyStatisticsStatistic> statistic) {
            this.statistic = statistic;
            return this;
        }
        public java.util.List<DescribeGeoipInstanceStatisticsResponseBodyStatisticsStatistic> getStatistic() {
            return this.statistic;
        }

    }

}
