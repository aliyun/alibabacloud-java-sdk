// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnDeletedDomainsResponseBody extends TeaModel {
    // The information about the accelerated domain names.
    @NameInMap("Domains")
    public DescribeCdnDeletedDomainsResponseBodyDomains domains;

    // The page number of the returned page. It corresponds to the request parameter **PageNumber**.
    @NameInMap("PageNumber")
    public Long pageNumber;

    // The number of entries returned per page. It corresponds to the request parameter **PageSize**.
    @NameInMap("PageSize")
    public Long pageSize;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The total number of domain names returned.
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
        // The accelerated domain name.
        @NameInMap("DomainName")
        public String domainName;

        // The last time when the accelerated domain name was modified. The time is in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC+0.
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
