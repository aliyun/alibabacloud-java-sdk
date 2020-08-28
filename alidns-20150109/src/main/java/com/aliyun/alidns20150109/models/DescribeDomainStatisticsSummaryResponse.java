// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDomainStatisticsSummaryResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalItems")
    @Validation(required = true)
    public Integer totalItems;

    @NameInMap("TotalPages")
    @Validation(required = true)
    public Integer totalPages;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("Statistics")
    @Validation(required = true)
    public DescribeDomainStatisticsSummaryResponseStatistics statistics;

    public static DescribeDomainStatisticsSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainStatisticsSummaryResponse self = new DescribeDomainStatisticsSummaryResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeDomainStatisticsSummaryResponseStatisticsStatistic extends TeaModel {
        @NameInMap("DomainName")
        @Validation(required = true)
        public String domainName;

        @NameInMap("Count")
        @Validation(required = true)
        public Long count;

        public static DescribeDomainStatisticsSummaryResponseStatisticsStatistic build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainStatisticsSummaryResponseStatisticsStatistic self = new DescribeDomainStatisticsSummaryResponseStatisticsStatistic();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeDomainStatisticsSummaryResponseStatistics extends TeaModel {
        @NameInMap("Statistic")
        @Validation(required = true)
        public java.util.List<DescribeDomainStatisticsSummaryResponseStatisticsStatistic> statistic;

        public static DescribeDomainStatisticsSummaryResponseStatistics build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainStatisticsSummaryResponseStatistics self = new DescribeDomainStatisticsSummaryResponseStatistics();
            return TeaModel.build(map, self);
        }

    }

}
