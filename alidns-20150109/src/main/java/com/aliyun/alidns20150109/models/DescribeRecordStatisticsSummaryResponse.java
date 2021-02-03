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

    public DescribeRecordStatisticsSummaryResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRecordStatisticsSummaryResponse setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
        return this;
    }
    public Integer getTotalItems() {
        return this.totalItems;
    }

    public DescribeRecordStatisticsSummaryResponse setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public DescribeRecordStatisticsSummaryResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeRecordStatisticsSummaryResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeRecordStatisticsSummaryResponse setStatistics(DescribeRecordStatisticsSummaryResponseStatistics statistics) {
        this.statistics = statistics;
        return this;
    }
    public DescribeRecordStatisticsSummaryResponseStatistics getStatistics() {
        return this.statistics;
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

        public DescribeRecordStatisticsSummaryResponseStatisticsStatistic setSubDomain(String subDomain) {
            this.subDomain = subDomain;
            return this;
        }
        public String getSubDomain() {
            return this.subDomain;
        }

        public DescribeRecordStatisticsSummaryResponseStatisticsStatistic setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
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

        public DescribeRecordStatisticsSummaryResponseStatistics setStatistic(java.util.List<DescribeRecordStatisticsSummaryResponseStatisticsStatistic> statistic) {
            this.statistic = statistic;
            return this;
        }
        public java.util.List<DescribeRecordStatisticsSummaryResponseStatisticsStatistic> getStatistic() {
            return this.statistic;
        }

    }

}
