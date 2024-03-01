// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeRecordStatisticsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The statistics on the DNS requests.</p>
     */
    @NameInMap("Statistics")
    public DescribeRecordStatisticsResponseBodyStatistics statistics;

    public static DescribeRecordStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecordStatisticsResponseBody self = new DescribeRecordStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRecordStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRecordStatisticsResponseBody setStatistics(DescribeRecordStatisticsResponseBodyStatistics statistics) {
        this.statistics = statistics;
        return this;
    }
    public DescribeRecordStatisticsResponseBodyStatistics getStatistics() {
        return this.statistics;
    }

    public static class DescribeRecordStatisticsResponseBodyStatisticsStatistic extends TeaModel {
        /**
         * <p>The number of DNS requests.</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <p>The statistical timestamp. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        public static DescribeRecordStatisticsResponseBodyStatisticsStatistic build(java.util.Map<String, ?> map) throws Exception {
            DescribeRecordStatisticsResponseBodyStatisticsStatistic self = new DescribeRecordStatisticsResponseBodyStatisticsStatistic();
            return TeaModel.build(map, self);
        }

        public DescribeRecordStatisticsResponseBodyStatisticsStatistic setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public DescribeRecordStatisticsResponseBodyStatisticsStatistic setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

    public static class DescribeRecordStatisticsResponseBodyStatistics extends TeaModel {
        @NameInMap("Statistic")
        public java.util.List<DescribeRecordStatisticsResponseBodyStatisticsStatistic> statistic;

        public static DescribeRecordStatisticsResponseBodyStatistics build(java.util.Map<String, ?> map) throws Exception {
            DescribeRecordStatisticsResponseBodyStatistics self = new DescribeRecordStatisticsResponseBodyStatistics();
            return TeaModel.build(map, self);
        }

        public DescribeRecordStatisticsResponseBodyStatistics setStatistic(java.util.List<DescribeRecordStatisticsResponseBodyStatisticsStatistic> statistic) {
            this.statistic = statistic;
            return this;
        }
        public java.util.List<DescribeRecordStatisticsResponseBodyStatisticsStatistic> getStatistic() {
            return this.statistic;
        }

    }

}
