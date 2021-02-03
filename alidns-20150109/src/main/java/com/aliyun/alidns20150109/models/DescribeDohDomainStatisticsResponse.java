// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDohDomainStatisticsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Statistics")
    @Validation(required = true)
    public java.util.List<DescribeDohDomainStatisticsResponseStatistics> statistics;

    public static DescribeDohDomainStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDohDomainStatisticsResponse self = new DescribeDohDomainStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDohDomainStatisticsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDohDomainStatisticsResponse setStatistics(java.util.List<DescribeDohDomainStatisticsResponseStatistics> statistics) {
        this.statistics = statistics;
        return this;
    }
    public java.util.List<DescribeDohDomainStatisticsResponseStatistics> getStatistics() {
        return this.statistics;
    }

    public static class DescribeDohDomainStatisticsResponseStatistics extends TeaModel {
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

        public static DescribeDohDomainStatisticsResponseStatistics build(java.util.Map<String, ?> map) throws Exception {
            DescribeDohDomainStatisticsResponseStatistics self = new DescribeDohDomainStatisticsResponseStatistics();
            return TeaModel.build(map, self);
        }

        public DescribeDohDomainStatisticsResponseStatistics setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public DescribeDohDomainStatisticsResponseStatistics setV4HttpCount(Long v4HttpCount) {
            this.v4HttpCount = v4HttpCount;
            return this;
        }
        public Long getV4HttpCount() {
            return this.v4HttpCount;
        }

        public DescribeDohDomainStatisticsResponseStatistics setV6HttpCount(Long v6HttpCount) {
            this.v6HttpCount = v6HttpCount;
            return this;
        }
        public Long getV6HttpCount() {
            return this.v6HttpCount;
        }

        public DescribeDohDomainStatisticsResponseStatistics setV4HttpsCount(Long v4HttpsCount) {
            this.v4HttpsCount = v4HttpsCount;
            return this;
        }
        public Long getV4HttpsCount() {
            return this.v4HttpsCount;
        }

        public DescribeDohDomainStatisticsResponseStatistics setV6HttpsCount(Long v6HttpsCount) {
            this.v6HttpsCount = v6HttpsCount;
            return this;
        }
        public Long getV6HttpsCount() {
            return this.v6HttpsCount;
        }

        public DescribeDohDomainStatisticsResponseStatistics setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
