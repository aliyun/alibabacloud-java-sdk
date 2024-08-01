// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeRecordStatisticsSummaryResponseBody extends TeaModel {
    /**
     * <p>The page number. Pages start from page <strong>1</strong>. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values: <strong>1 to 100</strong>. Default value: <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E49F0023-4A98-486F-8BA3-6003D5664105</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The DNS requests.</p>
     */
    @NameInMap("Statistics")
    public DescribeRecordStatisticsSummaryResponseBodyStatistics statistics;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("TotalItems")
    public Integer totalItems;

    /**
     * <p>The total number of pages returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalPages")
    public Integer totalPages;

    public static DescribeRecordStatisticsSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecordStatisticsSummaryResponseBody self = new DescribeRecordStatisticsSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRecordStatisticsSummaryResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
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

    public DescribeRecordStatisticsSummaryResponseBody setStatistics(DescribeRecordStatisticsSummaryResponseBodyStatistics statistics) {
        this.statistics = statistics;
        return this;
    }
    public DescribeRecordStatisticsSummaryResponseBodyStatistics getStatistics() {
        return this.statistics;
    }

    public DescribeRecordStatisticsSummaryResponseBody setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
        return this;
    }
    public Integer getTotalItems() {
        return this.totalItems;
    }

    public DescribeRecordStatisticsSummaryResponseBody setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public static class DescribeRecordStatisticsSummaryResponseBodyStatisticsStatistic extends TeaModel {
        /**
         * <p>The number of DNS requests.</p>
         * 
         * <strong>example:</strong>
         * <p>838711553</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <p>The subdomain.</p>
         * 
         * <strong>example:</strong>
         * <p>t1.alitest2.com</p>
         */
        @NameInMap("SubDomain")
        public String subDomain;

        public static DescribeRecordStatisticsSummaryResponseBodyStatisticsStatistic build(java.util.Map<String, ?> map) throws Exception {
            DescribeRecordStatisticsSummaryResponseBodyStatisticsStatistic self = new DescribeRecordStatisticsSummaryResponseBodyStatisticsStatistic();
            return TeaModel.build(map, self);
        }

        public DescribeRecordStatisticsSummaryResponseBodyStatisticsStatistic setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public DescribeRecordStatisticsSummaryResponseBodyStatisticsStatistic setSubDomain(String subDomain) {
            this.subDomain = subDomain;
            return this;
        }
        public String getSubDomain() {
            return this.subDomain;
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
