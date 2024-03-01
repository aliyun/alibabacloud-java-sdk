// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDomainStatisticsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The statistics on the Domain Name System (DNS) requests.</p>
     */
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
        /**
         * <p>The number of DNS requests.</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <p>The domain name.</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>The statistical timestamp. Unit: milliseconds. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        public static DescribeDomainStatisticsResponseBodyStatisticsStatistic build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainStatisticsResponseBodyStatisticsStatistic self = new DescribeDomainStatisticsResponseBodyStatisticsStatistic();
            return TeaModel.build(map, self);
        }

        public DescribeDomainStatisticsResponseBodyStatisticsStatistic setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public DescribeDomainStatisticsResponseBodyStatisticsStatistic setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeDomainStatisticsResponseBodyStatisticsStatistic setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
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
