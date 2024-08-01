// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDomainStatisticsSummaryResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>CC625C21-8832-4683-BF10-C3CFB1A4FA13</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The statistics on the Domain Name System (DNS) requests.</p>
     */
    @NameInMap("Statistics")
    public DescribeDomainStatisticsSummaryResponseBodyStatistics statistics;

    /**
     * <p>The total number of data records.</p>
     * 
     * <strong>example:</strong>
     * <p>68</p>
     */
    @NameInMap("TotalItems")
    public Integer totalItems;

    /**
     * <p>The total number of returned pages.</p>
     * 
     * <strong>example:</strong>
     * <p>14</p>
     */
    @NameInMap("TotalPages")
    public Integer totalPages;

    public static DescribeDomainStatisticsSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainStatisticsSummaryResponseBody self = new DescribeDomainStatisticsSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainStatisticsSummaryResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDomainStatisticsSummaryResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDomainStatisticsSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainStatisticsSummaryResponseBody setStatistics(DescribeDomainStatisticsSummaryResponseBodyStatistics statistics) {
        this.statistics = statistics;
        return this;
    }
    public DescribeDomainStatisticsSummaryResponseBodyStatistics getStatistics() {
        return this.statistics;
    }

    public DescribeDomainStatisticsSummaryResponseBody setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
        return this;
    }
    public Integer getTotalItems() {
        return this.totalItems;
    }

    public DescribeDomainStatisticsSummaryResponseBody setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public static class DescribeDomainStatisticsSummaryResponseBodyStatisticsStatistic extends TeaModel {
        /**
         * <p>The number of DNS requests.</p>
         * 
         * <strong>example:</strong>
         * <p>35509014</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <p>The domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>ali-gslb.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>The type of the domain name. The parameter value is not case-sensitive. Valid values:</p>
         * <p>PUBLIC (default): hosted public domain name</p>
         * <p>CACHE: cache-accelerated domain name</p>
         * 
         * <strong>example:</strong>
         * <p>PUBLIC</p>
         */
        @NameInMap("DomainType")
        public String domainType;

        /**
         * <p>Indicates whether the DNS traffic analysis feature is enabled for the domain name. Valid values:</p>
         * <ul>
         * <li>OPEN</li>
         * <li>CLOSE</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OPEN</p>
         */
        @NameInMap("resolveAnalysisStatus")
        public String resolveAnalysisStatus;

        public static DescribeDomainStatisticsSummaryResponseBodyStatisticsStatistic build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainStatisticsSummaryResponseBodyStatisticsStatistic self = new DescribeDomainStatisticsSummaryResponseBodyStatisticsStatistic();
            return TeaModel.build(map, self);
        }

        public DescribeDomainStatisticsSummaryResponseBodyStatisticsStatistic setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public DescribeDomainStatisticsSummaryResponseBodyStatisticsStatistic setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeDomainStatisticsSummaryResponseBodyStatisticsStatistic setDomainType(String domainType) {
            this.domainType = domainType;
            return this;
        }
        public String getDomainType() {
            return this.domainType;
        }

        public DescribeDomainStatisticsSummaryResponseBodyStatisticsStatistic setResolveAnalysisStatus(String resolveAnalysisStatus) {
            this.resolveAnalysisStatus = resolveAnalysisStatus;
            return this;
        }
        public String getResolveAnalysisStatus() {
            return this.resolveAnalysisStatus;
        }

    }

    public static class DescribeDomainStatisticsSummaryResponseBodyStatistics extends TeaModel {
        @NameInMap("Statistic")
        public java.util.List<DescribeDomainStatisticsSummaryResponseBodyStatisticsStatistic> statistic;

        public static DescribeDomainStatisticsSummaryResponseBodyStatistics build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainStatisticsSummaryResponseBodyStatistics self = new DescribeDomainStatisticsSummaryResponseBodyStatistics();
            return TeaModel.build(map, self);
        }

        public DescribeDomainStatisticsSummaryResponseBodyStatistics setStatistic(java.util.List<DescribeDomainStatisticsSummaryResponseBodyStatisticsStatistic> statistic) {
            this.statistic = statistic;
            return this;
        }
        public java.util.List<DescribeDomainStatisticsSummaryResponseBodyStatisticsStatistic> getStatistic() {
            return this.statistic;
        }

    }

}
