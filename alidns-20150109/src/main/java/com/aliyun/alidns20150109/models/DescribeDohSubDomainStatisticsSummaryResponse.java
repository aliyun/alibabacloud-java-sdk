// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDohSubDomainStatisticsSummaryResponse extends TeaModel {
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
    public java.util.List<DescribeDohSubDomainStatisticsSummaryResponseStatistics> statistics;

    public static DescribeDohSubDomainStatisticsSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDohSubDomainStatisticsSummaryResponse self = new DescribeDohSubDomainStatisticsSummaryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDohSubDomainStatisticsSummaryResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDohSubDomainStatisticsSummaryResponse setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
        return this;
    }
    public Integer getTotalItems() {
        return this.totalItems;
    }

    public DescribeDohSubDomainStatisticsSummaryResponse setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public DescribeDohSubDomainStatisticsSummaryResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDohSubDomainStatisticsSummaryResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDohSubDomainStatisticsSummaryResponse setStatistics(java.util.List<DescribeDohSubDomainStatisticsSummaryResponseStatistics> statistics) {
        this.statistics = statistics;
        return this;
    }
    public java.util.List<DescribeDohSubDomainStatisticsSummaryResponseStatistics> getStatistics() {
        return this.statistics;
    }

    public static class DescribeDohSubDomainStatisticsSummaryResponseStatistics extends TeaModel {
        @NameInMap("SubDomain")
        @Validation(required = true)
        public String subDomain;

        @NameInMap("V4HttpCount")
        @Validation(required = true)
        public Long v4HttpCount;

        @NameInMap("V6HttpCount")
        @Validation(required = true)
        public Long v6HttpCount;

        @NameInMap("V4HttpsCount")
        @Validation(required = true)
        public Long v4HttpsCount;

        @NameInMap("V6HttpsCount")
        @Validation(required = true)
        public Long v6HttpsCount;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Long totalCount;

        @NameInMap("IpCount")
        @Validation(required = true)
        public Long ipCount;

        @NameInMap("HttpCount")
        @Validation(required = true)
        public Long httpCount;

        @NameInMap("HttpsCount")
        @Validation(required = true)
        public Long httpsCount;

        public static DescribeDohSubDomainStatisticsSummaryResponseStatistics build(java.util.Map<String, ?> map) throws Exception {
            DescribeDohSubDomainStatisticsSummaryResponseStatistics self = new DescribeDohSubDomainStatisticsSummaryResponseStatistics();
            return TeaModel.build(map, self);
        }

        public DescribeDohSubDomainStatisticsSummaryResponseStatistics setSubDomain(String subDomain) {
            this.subDomain = subDomain;
            return this;
        }
        public String getSubDomain() {
            return this.subDomain;
        }

        public DescribeDohSubDomainStatisticsSummaryResponseStatistics setV4HttpCount(Long v4HttpCount) {
            this.v4HttpCount = v4HttpCount;
            return this;
        }
        public Long getV4HttpCount() {
            return this.v4HttpCount;
        }

        public DescribeDohSubDomainStatisticsSummaryResponseStatistics setV6HttpCount(Long v6HttpCount) {
            this.v6HttpCount = v6HttpCount;
            return this;
        }
        public Long getV6HttpCount() {
            return this.v6HttpCount;
        }

        public DescribeDohSubDomainStatisticsSummaryResponseStatistics setV4HttpsCount(Long v4HttpsCount) {
            this.v4HttpsCount = v4HttpsCount;
            return this;
        }
        public Long getV4HttpsCount() {
            return this.v4HttpsCount;
        }

        public DescribeDohSubDomainStatisticsSummaryResponseStatistics setV6HttpsCount(Long v6HttpsCount) {
            this.v6HttpsCount = v6HttpsCount;
            return this;
        }
        public Long getV6HttpsCount() {
            return this.v6HttpsCount;
        }

        public DescribeDohSubDomainStatisticsSummaryResponseStatistics setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public DescribeDohSubDomainStatisticsSummaryResponseStatistics setIpCount(Long ipCount) {
            this.ipCount = ipCount;
            return this;
        }
        public Long getIpCount() {
            return this.ipCount;
        }

        public DescribeDohSubDomainStatisticsSummaryResponseStatistics setHttpCount(Long httpCount) {
            this.httpCount = httpCount;
            return this;
        }
        public Long getHttpCount() {
            return this.httpCount;
        }

        public DescribeDohSubDomainStatisticsSummaryResponseStatistics setHttpsCount(Long httpsCount) {
            this.httpsCount = httpsCount;
            return this;
        }
        public Long getHttpsCount() {
            return this.httpsCount;
        }

    }

}
