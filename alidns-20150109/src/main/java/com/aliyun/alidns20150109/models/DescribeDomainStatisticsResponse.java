// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDomainStatisticsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Statistics")
    @Validation(required = true)
    public DescribeDomainStatisticsResponseStatistics statistics;

    public static DescribeDomainStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainStatisticsResponse self = new DescribeDomainStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainStatisticsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainStatisticsResponse setStatistics(DescribeDomainStatisticsResponseStatistics statistics) {
        this.statistics = statistics;
        return this;
    }
    public DescribeDomainStatisticsResponseStatistics getStatistics() {
        return this.statistics;
    }

    public static class DescribeDomainStatisticsResponseStatisticsStatistic extends TeaModel {
        @NameInMap("Timestamp")
        @Validation(required = true)
        public Long timestamp;

        @NameInMap("Count")
        @Validation(required = true)
        public Long count;

        public static DescribeDomainStatisticsResponseStatisticsStatistic build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainStatisticsResponseStatisticsStatistic self = new DescribeDomainStatisticsResponseStatisticsStatistic();
            return TeaModel.build(map, self);
        }

        public DescribeDomainStatisticsResponseStatisticsStatistic setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public DescribeDomainStatisticsResponseStatisticsStatistic setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

    }

    public static class DescribeDomainStatisticsResponseStatistics extends TeaModel {
        @NameInMap("Statistic")
        @Validation(required = true)
        public java.util.List<DescribeDomainStatisticsResponseStatisticsStatistic> statistic;

        public static DescribeDomainStatisticsResponseStatistics build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainStatisticsResponseStatistics self = new DescribeDomainStatisticsResponseStatistics();
            return TeaModel.build(map, self);
        }

        public DescribeDomainStatisticsResponseStatistics setStatistic(java.util.List<DescribeDomainStatisticsResponseStatisticsStatistic> statistic) {
            this.statistic = statistic;
            return this;
        }
        public java.util.List<DescribeDomainStatisticsResponseStatisticsStatistic> getStatistic() {
            return this.statistic;
        }

    }

}
