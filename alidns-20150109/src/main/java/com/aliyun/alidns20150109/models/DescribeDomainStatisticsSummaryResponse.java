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

    public DescribeDomainStatisticsSummaryResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainStatisticsSummaryResponse setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
        return this;
    }
    public Integer getTotalItems() {
        return this.totalItems;
    }

    public DescribeDomainStatisticsSummaryResponse setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public DescribeDomainStatisticsSummaryResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDomainStatisticsSummaryResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDomainStatisticsSummaryResponse setStatistics(DescribeDomainStatisticsSummaryResponseStatistics statistics) {
        this.statistics = statistics;
        return this;
    }
    public DescribeDomainStatisticsSummaryResponseStatistics getStatistics() {
        return this.statistics;
    }

    public static class DescribeDomainStatisticsSummaryResponseStatisticsStatistic extends TeaModel {
        @NameInMap("DomainName")
        @Validation(required = true)
        public String domainName;

        @NameInMap("Count")
        @Validation(required = true)
        public Long count;

        @NameInMap("DomainType")
        @Validation(required = true)
        public String domainType;

        public static DescribeDomainStatisticsSummaryResponseStatisticsStatistic build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainStatisticsSummaryResponseStatisticsStatistic self = new DescribeDomainStatisticsSummaryResponseStatisticsStatistic();
            return TeaModel.build(map, self);
        }

        public DescribeDomainStatisticsSummaryResponseStatisticsStatistic setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeDomainStatisticsSummaryResponseStatisticsStatistic setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public DescribeDomainStatisticsSummaryResponseStatisticsStatistic setDomainType(String domainType) {
            this.domainType = domainType;
            return this;
        }
        public String getDomainType() {
            return this.domainType;
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

        public DescribeDomainStatisticsSummaryResponseStatistics setStatistic(java.util.List<DescribeDomainStatisticsSummaryResponseStatisticsStatistic> statistic) {
            this.statistic = statistic;
            return this;
        }
        public java.util.List<DescribeDomainStatisticsSummaryResponseStatisticsStatistic> getStatistic() {
            return this.statistic;
        }

    }

}
