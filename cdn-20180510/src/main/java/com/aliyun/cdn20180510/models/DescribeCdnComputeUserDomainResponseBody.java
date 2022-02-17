// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnComputeUserDomainResponseBody extends TeaModel {
    @NameInMap("Domains")
    public DescribeCdnComputeUserDomainResponseBodyDomains domains;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeCdnComputeUserDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnComputeUserDomainResponseBody self = new DescribeCdnComputeUserDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCdnComputeUserDomainResponseBody setDomains(DescribeCdnComputeUserDomainResponseBodyDomains domains) {
        this.domains = domains;
        return this;
    }
    public DescribeCdnComputeUserDomainResponseBodyDomains getDomains() {
        return this.domains;
    }

    public DescribeCdnComputeUserDomainResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCdnComputeUserDomainResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeCdnComputeUserDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCdnComputeUserDomainResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeCdnComputeUserDomainResponseBodyDomainsPageData extends TeaModel {
        @NameInMap("Cname")
        public String cname;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("DomainStatus")
        public String domainStatus;

        @NameInMap("GmtCreated")
        public String gmtCreated;

        @NameInMap("GmtModified")
        public String gmtModified;

        public static DescribeCdnComputeUserDomainResponseBodyDomainsPageData build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnComputeUserDomainResponseBodyDomainsPageData self = new DescribeCdnComputeUserDomainResponseBodyDomainsPageData();
            return TeaModel.build(map, self);
        }

        public DescribeCdnComputeUserDomainResponseBodyDomainsPageData setCname(String cname) {
            this.cname = cname;
            return this;
        }
        public String getCname() {
            return this.cname;
        }

        public DescribeCdnComputeUserDomainResponseBodyDomainsPageData setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeCdnComputeUserDomainResponseBodyDomainsPageData setDomainStatus(String domainStatus) {
            this.domainStatus = domainStatus;
            return this;
        }
        public String getDomainStatus() {
            return this.domainStatus;
        }

        public DescribeCdnComputeUserDomainResponseBodyDomainsPageData setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public DescribeCdnComputeUserDomainResponseBodyDomainsPageData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

    }

    public static class DescribeCdnComputeUserDomainResponseBodyDomains extends TeaModel {
        @NameInMap("PageData")
        public java.util.List<DescribeCdnComputeUserDomainResponseBodyDomainsPageData> pageData;

        public static DescribeCdnComputeUserDomainResponseBodyDomains build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnComputeUserDomainResponseBodyDomains self = new DescribeCdnComputeUserDomainResponseBodyDomains();
            return TeaModel.build(map, self);
        }

        public DescribeCdnComputeUserDomainResponseBodyDomains setPageData(java.util.List<DescribeCdnComputeUserDomainResponseBodyDomainsPageData> pageData) {
            this.pageData = pageData;
            return this;
        }
        public java.util.List<DescribeCdnComputeUserDomainResponseBodyDomainsPageData> getPageData() {
            return this.pageData;
        }

    }

}
