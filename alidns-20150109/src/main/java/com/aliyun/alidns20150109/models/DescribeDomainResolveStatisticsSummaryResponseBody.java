// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDomainResolveStatisticsSummaryResponseBody extends TeaModel {
    /**
     * <p>The page number. Pages start from page <strong>1</strong>. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Maximum value: <strong>100</strong>. Default value: <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6856BCF6-11D6-4D7E-AC53-FD579933522B</p>
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
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
         * <p>The number of DNS requests.</p>
         * 
         * <strong>example:</strong>
         * <p>35509014</p>
         */
        @NameInMap("Count")
        public String count;

        /**
         * <p>The domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>The type of the domain name. Valid values:</p>
         * <ul>
         * <li>PUBLIC: hosted public domain name</li>
         * <li>CACHE: cache-accelerated domain name</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CACHE</p>
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
