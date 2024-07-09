// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnDeletedDomainsResponseBody extends TeaModel {
    /**
     * <p>The list of accelerated domain names and the time each domain name was last modified.</p>
     */
    @NameInMap("Domains")
    public DescribeCdnDeletedDomainsResponseBodyDomains domains;

    /**
     * <p>The page number of the returned page, which is the same as the <strong>PageNumber</strong> parameter in request parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of domain names returned per page, which is the same as the <strong>PageSize</strong> parameter in request parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>AA75AADB-5E25-4970-B480-EAA1F5658483</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of domain names returned.</p>
     * 
     * <strong>example:</strong>
     * <p>16</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeCdnDeletedDomainsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnDeletedDomainsResponseBody self = new DescribeCdnDeletedDomainsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCdnDeletedDomainsResponseBody setDomains(DescribeCdnDeletedDomainsResponseBodyDomains domains) {
        this.domains = domains;
        return this;
    }
    public DescribeCdnDeletedDomainsResponseBodyDomains getDomains() {
        return this.domains;
    }

    public DescribeCdnDeletedDomainsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCdnDeletedDomainsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeCdnDeletedDomainsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCdnDeletedDomainsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeCdnDeletedDomainsResponseBodyDomainsPageData extends TeaModel {
        /**
         * <p>The accelerated domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>The time when the accelerated domain name was modified. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2015-10-28T11:05:52Z</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        public static DescribeCdnDeletedDomainsResponseBodyDomainsPageData build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnDeletedDomainsResponseBodyDomainsPageData self = new DescribeCdnDeletedDomainsResponseBodyDomainsPageData();
            return TeaModel.build(map, self);
        }

        public DescribeCdnDeletedDomainsResponseBodyDomainsPageData setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeCdnDeletedDomainsResponseBodyDomainsPageData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

    }

    public static class DescribeCdnDeletedDomainsResponseBodyDomains extends TeaModel {
        @NameInMap("PageData")
        public java.util.List<DescribeCdnDeletedDomainsResponseBodyDomainsPageData> pageData;

        public static DescribeCdnDeletedDomainsResponseBodyDomains build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnDeletedDomainsResponseBodyDomains self = new DescribeCdnDeletedDomainsResponseBodyDomains();
            return TeaModel.build(map, self);
        }

        public DescribeCdnDeletedDomainsResponseBodyDomains setPageData(java.util.List<DescribeCdnDeletedDomainsResponseBodyDomainsPageData> pageData) {
            this.pageData = pageData;
            return this;
        }
        public java.util.List<DescribeCdnDeletedDomainsResponseBodyDomainsPageData> getPageData() {
            return this.pageData;
        }

    }

}
