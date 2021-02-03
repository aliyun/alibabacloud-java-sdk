// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeRecordStatisticsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Statistics")
    @Validation(required = true)
    public DescribeRecordStatisticsResponseStatistics statistics;

    public static DescribeRecordStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecordStatisticsResponse self = new DescribeRecordStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRecordStatisticsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRecordStatisticsResponse setStatistics(DescribeRecordStatisticsResponseStatistics statistics) {
        this.statistics = statistics;
        return this;
    }
    public DescribeRecordStatisticsResponseStatistics getStatistics() {
        return this.statistics;
    }

    public static class DescribeRecordStatisticsResponseStatisticsStatistic extends TeaModel {
        @NameInMap("Timestamp")
        @Validation(required = true)
        public Long timestamp;

        @NameInMap("Count")
        @Validation(required = true)
        public Long count;

        public static DescribeRecordStatisticsResponseStatisticsStatistic build(java.util.Map<String, ?> map) throws Exception {
            DescribeRecordStatisticsResponseStatisticsStatistic self = new DescribeRecordStatisticsResponseStatisticsStatistic();
            return TeaModel.build(map, self);
        }

        public DescribeRecordStatisticsResponseStatisticsStatistic setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public DescribeRecordStatisticsResponseStatisticsStatistic setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

    }

    public static class DescribeRecordStatisticsResponseStatistics extends TeaModel {
        @NameInMap("Statistic")
        @Validation(required = true)
        public java.util.List<DescribeRecordStatisticsResponseStatisticsStatistic> statistic;

        public static DescribeRecordStatisticsResponseStatistics build(java.util.Map<String, ?> map) throws Exception {
            DescribeRecordStatisticsResponseStatistics self = new DescribeRecordStatisticsResponseStatistics();
            return TeaModel.build(map, self);
        }

        public DescribeRecordStatisticsResponseStatistics setStatistic(java.util.List<DescribeRecordStatisticsResponseStatisticsStatistic> statistic) {
            this.statistic = statistic;
            return this;
        }
        public java.util.List<DescribeRecordStatisticsResponseStatisticsStatistic> getStatistic() {
            return this.statistic;
        }

    }

}
