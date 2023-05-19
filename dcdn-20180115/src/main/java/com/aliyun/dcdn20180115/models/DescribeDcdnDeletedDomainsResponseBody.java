// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDeletedDomainsResponseBody extends TeaModel {
    /**
     * <p>The accelerated domain name.</p>
     */
    @NameInMap("Domains")
    public DescribeDcdnDeletedDomainsResponseBodyDomains domains;

    /**
     * <p>The total number of domain names returned.</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The list of accelerated domain names and the time each domain name was last modified.</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The number of domain names returned per page, which is the same as the **PageSize** parameter in request parameters.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The time when the accelerated domain name was last modified. The time follows the ISO 8601 standard in the yyyy-MM-ddThh:mm:ssZ format. The time is displayed in UTC+0.</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeDcdnDeletedDomainsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDeletedDomainsResponseBody self = new DescribeDcdnDeletedDomainsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDeletedDomainsResponseBody setDomains(DescribeDcdnDeletedDomainsResponseBodyDomains domains) {
        this.domains = domains;
        return this;
    }
    public DescribeDcdnDeletedDomainsResponseBodyDomains getDomains() {
        return this.domains;
    }

    public DescribeDcdnDeletedDomainsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDcdnDeletedDomainsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeDcdnDeletedDomainsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDcdnDeletedDomainsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDcdnDeletedDomainsResponseBodyDomainsPageData extends TeaModel {
        /**
         * <p>The total number of domain names returned.</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>>  You can call this operation up to 10 times per second per account.</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        public static DescribeDcdnDeletedDomainsResponseBodyDomainsPageData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDeletedDomainsResponseBodyDomainsPageData self = new DescribeDcdnDeletedDomainsResponseBodyDomainsPageData();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDeletedDomainsResponseBodyDomainsPageData setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeDcdnDeletedDomainsResponseBodyDomainsPageData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

    }

    public static class DescribeDcdnDeletedDomainsResponseBodyDomains extends TeaModel {
        @NameInMap("PageData")
        public java.util.List<DescribeDcdnDeletedDomainsResponseBodyDomainsPageData> pageData;

        public static DescribeDcdnDeletedDomainsResponseBodyDomains build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDeletedDomainsResponseBodyDomains self = new DescribeDcdnDeletedDomainsResponseBodyDomains();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDeletedDomainsResponseBodyDomains setPageData(java.util.List<DescribeDcdnDeletedDomainsResponseBodyDomainsPageData> pageData) {
            this.pageData = pageData;
            return this;
        }
        public java.util.List<DescribeDcdnDeletedDomainsResponseBodyDomainsPageData> getPageData() {
            return this.pageData;
        }

    }

}
