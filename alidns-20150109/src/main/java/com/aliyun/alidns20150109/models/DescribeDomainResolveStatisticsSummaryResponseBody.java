// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDomainResolveStatisticsSummaryResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The statistics.</p>
     */
    @NameInMap("Statistics")
    public java.util.List<DescribeDomainResolveStatisticsSummaryResponseBodyStatistics> statistics;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalItems")
    public Integer totalItems;

    /**
     * <p>The total number of pages returned.</p>
     */
    @NameInMap("TotalPages")
    public Integer totalPages;

    public static DescribeDomainResolveStatisticsSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainResolveStatisticsSummaryResponseBody self = new DescribeDomainResolveStatisticsSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainResolveStatisticsSummaryResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDomainResolveStatisticsSummaryResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDomainResolveStatisticsSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainResolveStatisticsSummaryResponseBody setStatistics(java.util.List<DescribeDomainResolveStatisticsSummaryResponseBodyStatistics> statistics) {
        this.statistics = statistics;
        return this;
    }
    public java.util.List<DescribeDomainResolveStatisticsSummaryResponseBodyStatistics> getStatistics() {
        return this.statistics;
    }

    public DescribeDomainResolveStatisticsSummaryResponseBody setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
        return this;
    }
    public Integer getTotalItems() {
        return this.totalItems;
    }

    public DescribeDomainResolveStatisticsSummaryResponseBody setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public static class DescribeDomainResolveStatisticsSummaryResponseBodyStatistics extends TeaModel {
        /**
         * <p>The number of resolution requests.</p>
         */
        @NameInMap("Count")
        public String count;

        /**
         * <p>The domain name.</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>The instance type. Valid values: PUBLIC and CACHE. PUBLIC indicates an authoritative domain name. CACHE indicates a cache-accelerated domain name.</p>
         */
        @NameInMap("DomainType")
        public String domainType;

        public static DescribeDomainResolveStatisticsSummaryResponseBodyStatistics build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainResolveStatisticsSummaryResponseBodyStatistics self = new DescribeDomainResolveStatisticsSummaryResponseBodyStatistics();
            return TeaModel.build(map, self);
        }

        public DescribeDomainResolveStatisticsSummaryResponseBodyStatistics setCount(String count) {
            this.count = count;
            return this;
        }
        public String getCount() {
            return this.count;
        }

        public DescribeDomainResolveStatisticsSummaryResponseBodyStatistics setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeDomainResolveStatisticsSummaryResponseBodyStatistics setDomainType(String domainType) {
            this.domainType = domainType;
            return this;
        }
        public String getDomainType() {
            return this.domainType;
        }

    }

}
