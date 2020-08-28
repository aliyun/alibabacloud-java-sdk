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

    }

    public static class DescribeDomainStatisticsResponseStatistics extends TeaModel {
        @NameInMap("Statistic")
        @Validation(required = true)
        public java.util.List<DescribeDomainStatisticsResponseStatisticsStatistic> statistic;

        public static DescribeDomainStatisticsResponseStatistics build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainStatisticsResponseStatistics self = new DescribeDomainStatisticsResponseStatistics();
            return TeaModel.build(map, self);
        }

    }

}
