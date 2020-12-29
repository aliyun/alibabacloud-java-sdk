// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDohSubDomainStatisticsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Statistics")
    public java.util.List<DescribeDohSubDomainStatisticsResponseBodyStatistics> statistics;

    public static DescribeDohSubDomainStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDohSubDomainStatisticsResponseBody self = new DescribeDohSubDomainStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDohSubDomainStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDohSubDomainStatisticsResponseBody setStatistics(java.util.List<DescribeDohSubDomainStatisticsResponseBodyStatistics> statistics) {
        this.statistics = statistics;
        return this;
    }
    public java.util.List<DescribeDohSubDomainStatisticsResponseBodyStatistics> getStatistics() {
        return this.statistics;
    }

    public static class DescribeDohSubDomainStatisticsResponseBodyStatistics extends TeaModel {
        @NameInMap("V6HttpCount")
        public Long v6HttpCount;

        @NameInMap("V4HttpsCount")
        public Long v4HttpsCount;

        @NameInMap("Timestamp")
        public Long timestamp;

        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("V4HttpCount")
        public Long v4HttpCount;

        @NameInMap("V6HttpsCount")
        public Long v6HttpsCount;

        public static DescribeDohSubDomainStatisticsResponseBodyStatistics build(java.util.Map<String, ?> map) throws Exception {
            DescribeDohSubDomainStatisticsResponseBodyStatistics self = new DescribeDohSubDomainStatisticsResponseBodyStatistics();
            return TeaModel.build(map, self);
        }

        public DescribeDohSubDomainStatisticsResponseBodyStatistics setV6HttpCount(Long v6HttpCount) {
            this.v6HttpCount = v6HttpCount;
            return this;
        }
        public Long getV6HttpCount() {
            return this.v6HttpCount;
        }

        public DescribeDohSubDomainStatisticsResponseBodyStatistics setV4HttpsCount(Long v4HttpsCount) {
            this.v4HttpsCount = v4HttpsCount;
            return this;
        }
        public Long getV4HttpsCount() {
            return this.v4HttpsCount;
        }

        public DescribeDohSubDomainStatisticsResponseBodyStatistics setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public DescribeDohSubDomainStatisticsResponseBodyStatistics setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public DescribeDohSubDomainStatisticsResponseBodyStatistics setV4HttpCount(Long v4HttpCount) {
            this.v4HttpCount = v4HttpCount;
            return this;
        }
        public Long getV4HttpCount() {
            return this.v4HttpCount;
        }

        public DescribeDohSubDomainStatisticsResponseBodyStatistics setV6HttpsCount(Long v6HttpsCount) {
            this.v6HttpsCount = v6HttpsCount;
            return this;
        }
        public Long getV6HttpsCount() {
            return this.v6HttpsCount;
        }

    }

}
