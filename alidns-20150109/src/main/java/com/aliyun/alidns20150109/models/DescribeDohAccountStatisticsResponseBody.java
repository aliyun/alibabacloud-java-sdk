// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDohAccountStatisticsResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The statistics list.</p>
     */
    @NameInMap("Statistics")
    public java.util.List<DescribeDohAccountStatisticsResponseBodyStatistics> statistics;

    public static DescribeDohAccountStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDohAccountStatisticsResponseBody self = new DescribeDohAccountStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDohAccountStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDohAccountStatisticsResponseBody setStatistics(java.util.List<DescribeDohAccountStatisticsResponseBodyStatistics> statistics) {
        this.statistics = statistics;
        return this;
    }
    public java.util.List<DescribeDohAccountStatisticsResponseBodyStatistics> getStatistics() {
        return this.statistics;
    }

    public static class DescribeDohAccountStatisticsResponseBodyStatistics extends TeaModel {
        /**
         * <p>The timestamp.</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        /**
         * <p>The total number of requests.</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        /**
         * <p>The number of IPv4-based HTTP requests.</p>
         */
        @NameInMap("V4HttpCount")
        public Long v4HttpCount;

        /**
         * <p>The number of IPv4-based HTTPS requests.</p>
         */
        @NameInMap("V4HttpsCount")
        public Long v4HttpsCount;

        /**
         * <p>The number of IPv6-based HTTP requests.</p>
         */
        @NameInMap("V6HttpCount")
        public Long v6HttpCount;

        /**
         * <p>The number of IPv6-based HTTPS requests.</p>
         */
        @NameInMap("V6HttpsCount")
        public Long v6HttpsCount;

        public static DescribeDohAccountStatisticsResponseBodyStatistics build(java.util.Map<String, ?> map) throws Exception {
            DescribeDohAccountStatisticsResponseBodyStatistics self = new DescribeDohAccountStatisticsResponseBodyStatistics();
            return TeaModel.build(map, self);
        }

        public DescribeDohAccountStatisticsResponseBodyStatistics setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public DescribeDohAccountStatisticsResponseBodyStatistics setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public DescribeDohAccountStatisticsResponseBodyStatistics setV4HttpCount(Long v4HttpCount) {
            this.v4HttpCount = v4HttpCount;
            return this;
        }
        public Long getV4HttpCount() {
            return this.v4HttpCount;
        }

        public DescribeDohAccountStatisticsResponseBodyStatistics setV4HttpsCount(Long v4HttpsCount) {
            this.v4HttpsCount = v4HttpsCount;
            return this;
        }
        public Long getV4HttpsCount() {
            return this.v4HttpsCount;
        }

        public DescribeDohAccountStatisticsResponseBodyStatistics setV6HttpCount(Long v6HttpCount) {
            this.v6HttpCount = v6HttpCount;
            return this;
        }
        public Long getV6HttpCount() {
            return this.v6HttpCount;
        }

        public DescribeDohAccountStatisticsResponseBodyStatistics setV6HttpsCount(Long v6HttpsCount) {
            this.v6HttpsCount = v6HttpsCount;
            return this;
        }
        public Long getV6HttpsCount() {
            return this.v6HttpsCount;
        }

    }

}
