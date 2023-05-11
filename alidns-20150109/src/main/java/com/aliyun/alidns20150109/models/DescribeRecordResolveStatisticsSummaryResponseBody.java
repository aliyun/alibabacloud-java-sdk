// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeRecordResolveStatisticsSummaryResponseBody extends TeaModel {
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
    public java.util.List<DescribeRecordResolveStatisticsSummaryResponseBodyStatistics> statistics;

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

    public static DescribeRecordResolveStatisticsSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecordResolveStatisticsSummaryResponseBody self = new DescribeRecordResolveStatisticsSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRecordResolveStatisticsSummaryResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeRecordResolveStatisticsSummaryResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeRecordResolveStatisticsSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRecordResolveStatisticsSummaryResponseBody setStatistics(java.util.List<DescribeRecordResolveStatisticsSummaryResponseBodyStatistics> statistics) {
        this.statistics = statistics;
        return this;
    }
    public java.util.List<DescribeRecordResolveStatisticsSummaryResponseBodyStatistics> getStatistics() {
        return this.statistics;
    }

    public DescribeRecordResolveStatisticsSummaryResponseBody setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
        return this;
    }
    public Integer getTotalItems() {
        return this.totalItems;
    }

    public DescribeRecordResolveStatisticsSummaryResponseBody setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public static class DescribeRecordResolveStatisticsSummaryResponseBodyStatistics extends TeaModel {
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
         * <p>The type of the domain name. Valid values: PUBLIC and CACHE. PUBLIC indicates an authoritative domain name. CACHE indicates a cache-accelerated domain name.</p>
         */
        @NameInMap("DomainType")
        public String domainType;

        /**
         * <p>子域名</p>
         */
        @NameInMap("SubDomain")
        public String subDomain;

        public static DescribeRecordResolveStatisticsSummaryResponseBodyStatistics build(java.util.Map<String, ?> map) throws Exception {
            DescribeRecordResolveStatisticsSummaryResponseBodyStatistics self = new DescribeRecordResolveStatisticsSummaryResponseBodyStatistics();
            return TeaModel.build(map, self);
        }

        public DescribeRecordResolveStatisticsSummaryResponseBodyStatistics setCount(String count) {
            this.count = count;
            return this;
        }
        public String getCount() {
            return this.count;
        }

        public DescribeRecordResolveStatisticsSummaryResponseBodyStatistics setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeRecordResolveStatisticsSummaryResponseBodyStatistics setDomainType(String domainType) {
            this.domainType = domainType;
            return this;
        }
        public String getDomainType() {
            return this.domainType;
        }

        public DescribeRecordResolveStatisticsSummaryResponseBodyStatistics setSubDomain(String subDomain) {
            this.subDomain = subDomain;
            return this;
        }
        public String getSubDomain() {
            return this.subDomain;
        }

    }

}
