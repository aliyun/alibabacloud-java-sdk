// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDohAccountStatisticsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Statistics")
    @Validation(required = true)
    public java.util.List<DescribeDohAccountStatisticsResponseStatistics> statistics;

    public static DescribeDohAccountStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDohAccountStatisticsResponse self = new DescribeDohAccountStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDohAccountStatisticsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDohAccountStatisticsResponse setStatistics(java.util.List<DescribeDohAccountStatisticsResponseStatistics> statistics) {
        this.statistics = statistics;
        return this;
    }
    public java.util.List<DescribeDohAccountStatisticsResponseStatistics> getStatistics() {
        return this.statistics;
    }

    public static class DescribeDohAccountStatisticsResponseStatistics extends TeaModel {
        @NameInMap("Timestamp")
        @Validation(required = true)
        public Long timestamp;

        @NameInMap("V4HttpCount")
        @Validation(required = true)
        public Long v4HttpCount;

        @NameInMap("V6HttpCount")
        @Validation(required = true)
        public Long v6HttpCount;

        @NameInMap("V4HttpsCount")
        @Validation(required = true)
        public Long v4HttpsCount;

        @NameInMap("V6HttpsCount")
        @Validation(required = true)
        public Long v6HttpsCount;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Long totalCount;

        public static DescribeDohAccountStatisticsResponseStatistics build(java.util.Map<String, ?> map) throws Exception {
            DescribeDohAccountStatisticsResponseStatistics self = new DescribeDohAccountStatisticsResponseStatistics();
            return TeaModel.build(map, self);
        }

        public DescribeDohAccountStatisticsResponseStatistics setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public DescribeDohAccountStatisticsResponseStatistics setV4HttpCount(Long v4HttpCount) {
            this.v4HttpCount = v4HttpCount;
            return this;
        }
        public Long getV4HttpCount() {
            return this.v4HttpCount;
        }

        public DescribeDohAccountStatisticsResponseStatistics setV6HttpCount(Long v6HttpCount) {
            this.v6HttpCount = v6HttpCount;
            return this;
        }
        public Long getV6HttpCount() {
            return this.v6HttpCount;
        }

        public DescribeDohAccountStatisticsResponseStatistics setV4HttpsCount(Long v4HttpsCount) {
            this.v4HttpsCount = v4HttpsCount;
            return this;
        }
        public Long getV4HttpsCount() {
            return this.v4HttpsCount;
        }

        public DescribeDohAccountStatisticsResponseStatistics setV6HttpsCount(Long v6HttpsCount) {
            this.v6HttpsCount = v6HttpsCount;
            return this;
        }
        public Long getV6HttpsCount() {
            return this.v6HttpsCount;
        }

        public DescribeDohAccountStatisticsResponseStatistics setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
