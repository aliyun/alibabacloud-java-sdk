// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDomainStatisticsSummaryResponseBody extends TeaModel {
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
    public java.util.List<DescribeDomainStatisticsSummaryResponseBodyStatistics> statistics;

    public static DescribeDomainStatisticsSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainStatisticsSummaryResponseBody self = new DescribeDomainStatisticsSummaryResponseBody();
        return TeaModel.build(map, self);
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

    public DescribeDomainStatisticsSummaryResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDomainStatisticsSummaryResponseBody setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public DescribeDomainStatisticsSummaryResponseBody setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
        return this;
    }
    public Integer getTotalItems() {
        return this.totalItems;
    }

    public DescribeDomainStatisticsSummaryResponseBody setStatistics(java.util.List<DescribeDomainStatisticsSummaryResponseBodyStatistics> statistics) {
        this.statistics = statistics;
        return this;
    }
    public java.util.List<DescribeDomainStatisticsSummaryResponseBodyStatistics> getStatistics() {
        return this.statistics;
    }

    public static class DescribeDomainStatisticsSummaryResponseBodyStatistics extends TeaModel {
        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("Count")
        public Long count;

        @NameInMap("DomainType")
        public String domainType;

        public static DescribeDomainStatisticsSummaryResponseBodyStatistics build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainStatisticsSummaryResponseBodyStatistics self = new DescribeDomainStatisticsSummaryResponseBodyStatistics();
            return TeaModel.build(map, self);
        }

        public DescribeDomainStatisticsSummaryResponseBodyStatistics setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeDomainStatisticsSummaryResponseBodyStatistics setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public DescribeDomainStatisticsSummaryResponseBodyStatistics setDomainType(String domainType) {
            this.domainType = domainType;
            return this;
        }
        public String getDomainType() {
            return this.domainType;
        }

    }

}
