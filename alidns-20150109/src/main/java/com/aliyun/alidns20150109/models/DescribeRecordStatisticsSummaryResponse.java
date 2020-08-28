// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeRecordStatisticsSummaryResponse extends TeaModel {
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
    public DescribeRecordStatisticsSummaryResponseStatistics statistics;

    public static DescribeRecordStatisticsSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecordStatisticsSummaryResponse self = new DescribeRecordStatisticsSummaryResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeRecordStatisticsSummaryResponseStatisticsStatistic extends TeaModel {
        @NameInMap("SubDomain")
        @Validation(required = true)
        public String subDomain;

        @NameInMap("Count")
        @Validation(required = true)
        public Long count;

        public static DescribeRecordStatisticsSummaryResponseStatisticsStatistic build(java.util.Map<String, ?> map) throws Exception {
            DescribeRecordStatisticsSummaryResponseStatisticsStatistic self = new DescribeRecordStatisticsSummaryResponseStatisticsStatistic();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeRecordStatisticsSummaryResponseStatistics extends TeaModel {
        @NameInMap("Statistic")
        @Validation(required = true)
        public java.util.List<DescribeRecordStatisticsSummaryResponseStatisticsStatistic> statistic;

        public static DescribeRecordStatisticsSummaryResponseStatistics build(java.util.Map<String, ?> map) throws Exception {
            DescribeRecordStatisticsSummaryResponseStatistics self = new DescribeRecordStatisticsSummaryResponseStatistics();
            return TeaModel.build(map, self);
        }

    }

}
