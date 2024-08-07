// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeRecordResolveStatisticsSummaryResponseBody extends TeaModel {
    /**
     * <p>The page number. Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values: <strong>1 to 500</strong>. Default value: <strong>20</strong>.</p>
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
     * <p>389DFFA3-77A5-4A9E-BF3D-147C6F98A5BA</p>
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
         * <p>The number of DNS requests.</p>
         * 
         * <strong>example:</strong>
         * <p>330</p>
         */
        @NameInMap("Count")
        public String count;

        /**
         * <p>The subdomain name.</p>
         * 
         * <strong>example:</strong>
         * <p>tes.example.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>The type of the domain name. The parameter value is not case-sensitive. Valid values:</p>
         * <ul>
         * <li>PUBLIC (default): hosted public domain name</li>
         * <li>CACHE: cache-accelerated domain name</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PUBLIC</p>
         */
        @NameInMap("DomainType")
        public String domainType;

        /**
         * <p>The subdomain.</p>
         * 
         * <strong>example:</strong>
         * <p>test.example.com</p>
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
