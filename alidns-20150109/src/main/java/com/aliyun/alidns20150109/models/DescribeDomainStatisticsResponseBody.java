// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDomainStatisticsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Statistics")
    public DescribeDomainStatisticsResponseBodyStatistics statistics;

    public static DescribeDomainStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainStatisticsResponseBody self = new DescribeDomainStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainStatisticsResponseBody setStatistics(DescribeDomainStatisticsResponseBodyStatistics statistics) {
        this.statistics = statistics;
        return this;
    }
    public DescribeDomainStatisticsResponseBodyStatistics getStatistics() {
        return this.statistics;
    }

    public static class DescribeDomainStatisticsResponseBodyStatisticsStatistic extends TeaModel {
        @NameInMap("Timestamp")
        public Long timestamp;

        @NameInMap("Count")
        public Long count;

        public static DescribeDomainStatisticsResponseBodyStatisticsStatistic build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainStatisticsResponseBodyStatisticsStatistic self = new DescribeDomainStatisticsResponseBodyStatisticsStatistic();
            return TeaModel.build(map, self);
        }

        public DescribeDomainStatisticsResponseBodyStatisticsStatistic setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public DescribeDomainStatisticsResponseBodyStatisticsStatistic setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

    }

    public static class DescribeDomainStatisticsResponseBodyStatistics extends TeaModel {
        @NameInMap("Statistic")
        public java.util.List<DescribeDomainStatisticsResponseBodyStatisticsStatistic> statistic;

        public static DescribeDomainStatisticsResponseBodyStatistics build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainStatisticsResponseBodyStatistics self = new DescribeDomainStatisticsResponseBodyStatistics();
            return TeaModel.build(map, self);
        }

        public DescribeDomainStatisticsResponseBodyStatistics setStatistic(java.util.List<DescribeDomainStatisticsResponseBodyStatisticsStatistic> statistic) {
            this.statistic = statistic;
            return this;
        }
        public java.util.List<DescribeDomainStatisticsResponseBodyStatisticsStatistic> getStatistic() {
            return this.statistic;
        }

    }

}
