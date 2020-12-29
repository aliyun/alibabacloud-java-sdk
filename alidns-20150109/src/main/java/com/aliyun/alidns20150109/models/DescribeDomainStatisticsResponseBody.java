// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDomainStatisticsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Statistics")
    public java.util.List<DescribeDomainStatisticsResponseBodyStatistics> statistics;

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

    public DescribeDomainStatisticsResponseBody setStatistics(java.util.List<DescribeDomainStatisticsResponseBodyStatistics> statistics) {
        this.statistics = statistics;
        return this;
    }
    public java.util.List<DescribeDomainStatisticsResponseBodyStatistics> getStatistics() {
        return this.statistics;
    }

    public static class DescribeDomainStatisticsResponseBodyStatistics extends TeaModel {
        @NameInMap("Timestamp")
        public Long timestamp;

        @NameInMap("Count")
        public Long count;

        public static DescribeDomainStatisticsResponseBodyStatistics build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainStatisticsResponseBodyStatistics self = new DescribeDomainStatisticsResponseBodyStatistics();
            return TeaModel.build(map, self);
        }

        public DescribeDomainStatisticsResponseBodyStatistics setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public DescribeDomainStatisticsResponseBodyStatistics setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

    }

}
