// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeRecordStatisticsSummaryResponseBody extends TeaModel {
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("TotalPages")
    public Integer totalPages;

    @NameInMap("TotalItems")
    public Integer totalItems;

    @NameInMap("Statistics")
    public DescribeRecordStatisticsSummaryResponseBodyStatistics statistics;

    public static DescribeRecordStatisticsSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecordStatisticsSummaryResponseBody self = new DescribeRecordStatisticsSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRecordStatisticsSummaryResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeRecordStatisticsSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRecordStatisticsSummaryResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeRecordStatisticsSummaryResponseBody setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public DescribeRecordStatisticsSummaryResponseBody setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
        return this;
    }
    public Integer getTotalItems() {
        return this.totalItems;
    }

    public DescribeRecordStatisticsSummaryResponseBody setStatistics(DescribeRecordStatisticsSummaryResponseBodyStatistics statistics) {
        this.statistics = statistics;
        return this;
    }
    public DescribeRecordStatisticsSummaryResponseBodyStatistics getStatistics() {
        return this.statistics;
    }

    public static class DescribeRecordStatisticsSummaryResponseBodyStatisticsStatistic extends TeaModel {
        @NameInMap("SubDomain")
        public String subDomain;

        @NameInMap("Count")
        public Long count;

        public static DescribeRecordStatisticsSummaryResponseBodyStatisticsStatistic build(java.util.Map<String, ?> map) throws Exception {
            DescribeRecordStatisticsSummaryResponseBodyStatisticsStatistic self = new DescribeRecordStatisticsSummaryResponseBodyStatisticsStatistic();
            return TeaModel.build(map, self);
        }

        public DescribeRecordStatisticsSummaryResponseBodyStatisticsStatistic setSubDomain(String subDomain) {
            this.subDomain = subDomain;
            return this;
        }
        public String getSubDomain() {
            return this.subDomain;
        }

        public DescribeRecordStatisticsSummaryResponseBodyStatisticsStatistic setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

    }

    public static class DescribeRecordStatisticsSummaryResponseBodyStatistics extends TeaModel {
        @NameInMap("Statistic")
        public java.util.List<DescribeRecordStatisticsSummaryResponseBodyStatisticsStatistic> statistic;

        public static DescribeRecordStatisticsSummaryResponseBodyStatistics build(java.util.Map<String, ?> map) throws Exception {
            DescribeRecordStatisticsSummaryResponseBodyStatistics self = new DescribeRecordStatisticsSummaryResponseBodyStatistics();
            return TeaModel.build(map, self);
        }

        public DescribeRecordStatisticsSummaryResponseBodyStatistics setStatistic(java.util.List<DescribeRecordStatisticsSummaryResponseBodyStatisticsStatistic> statistic) {
            this.statistic = statistic;
            return this;
        }
        public java.util.List<DescribeRecordStatisticsSummaryResponseBodyStatisticsStatistic> getStatistic() {
            return this.statistic;
        }

    }

}
