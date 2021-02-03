// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDohDomainStatisticsSummaryResponseBody extends TeaModel {
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
    public java.util.List<DescribeDohDomainStatisticsSummaryResponseBodyStatistics> statistics;

    public static DescribeDohDomainStatisticsSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDohDomainStatisticsSummaryResponseBody self = new DescribeDohDomainStatisticsSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDohDomainStatisticsSummaryResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDohDomainStatisticsSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDohDomainStatisticsSummaryResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDohDomainStatisticsSummaryResponseBody setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public DescribeDohDomainStatisticsSummaryResponseBody setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
        return this;
    }
    public Integer getTotalItems() {
        return this.totalItems;
    }

    public DescribeDohDomainStatisticsSummaryResponseBody setStatistics(java.util.List<DescribeDohDomainStatisticsSummaryResponseBodyStatistics> statistics) {
        this.statistics = statistics;
        return this;
    }
    public java.util.List<DescribeDohDomainStatisticsSummaryResponseBodyStatistics> getStatistics() {
        return this.statistics;
    }

    public static class DescribeDohDomainStatisticsSummaryResponseBodyStatistics extends TeaModel {
        @NameInMap("V6HttpCount")
        public Long v6HttpCount;

        @NameInMap("V4HttpsCount")
        public Long v4HttpsCount;

        @NameInMap("IpCount")
        public Long ipCount;

        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("HttpCount")
        public Long httpCount;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("HttpsCount")
        public Long httpsCount;

        @NameInMap("V4HttpCount")
        public Long v4HttpCount;

        @NameInMap("V6HttpsCount")
        public Long v6HttpsCount;

        public static DescribeDohDomainStatisticsSummaryResponseBodyStatistics build(java.util.Map<String, ?> map) throws Exception {
            DescribeDohDomainStatisticsSummaryResponseBodyStatistics self = new DescribeDohDomainStatisticsSummaryResponseBodyStatistics();
            return TeaModel.build(map, self);
        }

        public DescribeDohDomainStatisticsSummaryResponseBodyStatistics setV6HttpCount(Long v6HttpCount) {
            this.v6HttpCount = v6HttpCount;
            return this;
        }
        public Long getV6HttpCount() {
            return this.v6HttpCount;
        }

        public DescribeDohDomainStatisticsSummaryResponseBodyStatistics setV4HttpsCount(Long v4HttpsCount) {
            this.v4HttpsCount = v4HttpsCount;
            return this;
        }
        public Long getV4HttpsCount() {
            return this.v4HttpsCount;
        }

        public DescribeDohDomainStatisticsSummaryResponseBodyStatistics setIpCount(Long ipCount) {
            this.ipCount = ipCount;
            return this;
        }
        public Long getIpCount() {
            return this.ipCount;
        }

        public DescribeDohDomainStatisticsSummaryResponseBodyStatistics setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public DescribeDohDomainStatisticsSummaryResponseBodyStatistics setHttpCount(Long httpCount) {
            this.httpCount = httpCount;
            return this;
        }
        public Long getHttpCount() {
            return this.httpCount;
        }

        public DescribeDohDomainStatisticsSummaryResponseBodyStatistics setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeDohDomainStatisticsSummaryResponseBodyStatistics setHttpsCount(Long httpsCount) {
            this.httpsCount = httpsCount;
            return this;
        }
        public Long getHttpsCount() {
            return this.httpsCount;
        }

        public DescribeDohDomainStatisticsSummaryResponseBodyStatistics setV4HttpCount(Long v4HttpCount) {
            this.v4HttpCount = v4HttpCount;
            return this;
        }
        public Long getV4HttpCount() {
            return this.v4HttpCount;
        }

        public DescribeDohDomainStatisticsSummaryResponseBodyStatistics setV6HttpsCount(Long v6HttpsCount) {
            this.v6HttpsCount = v6HttpsCount;
            return this;
        }
        public Long getV6HttpsCount() {
            return this.v6HttpsCount;
        }

    }

}
