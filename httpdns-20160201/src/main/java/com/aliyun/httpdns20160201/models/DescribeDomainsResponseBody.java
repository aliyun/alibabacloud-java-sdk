// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.httpdns20160201.models;

import com.aliyun.tea.*;

public class DescribeDomainsResponseBody extends TeaModel {
    @NameInMap("Domains")
    public DescribeDomainsResponseBodyDomains domains;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeDomainsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainsResponseBody self = new DescribeDomainsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainsResponseBody setDomains(DescribeDomainsResponseBodyDomains domains) {
        this.domains = domains;
        return this;
    }
    public DescribeDomainsResponseBodyDomains getDomains() {
        return this.domains;
    }

    public DescribeDomainsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDomainsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeDomainsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDomainsResponseBodyDomainsDomain extends TeaModel {
        @NameInMap("DomainName")
        public String domainName;

        public static DescribeDomainsResponseBodyDomainsDomain build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainsResponseBodyDomainsDomain self = new DescribeDomainsResponseBodyDomainsDomain();
            return TeaModel.build(map, self);
        }

        public DescribeDomainsResponseBodyDomainsDomain setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

    }

    public static class DescribeDomainsResponseBodyDomains extends TeaModel {
        @NameInMap("Domain")
        public java.util.List<DescribeDomainsResponseBodyDomainsDomain> domain;

        public static DescribeDomainsResponseBodyDomains build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainsResponseBodyDomains self = new DescribeDomainsResponseBodyDomains();
            return TeaModel.build(map, self);
        }

        public DescribeDomainsResponseBodyDomains setDomain(java.util.List<DescribeDomainsResponseBodyDomainsDomain> domain) {
            this.domain = domain;
            return this;
        }
        public java.util.List<DescribeDomainsResponseBodyDomainsDomain> getDomain() {
            return this.domain;
        }

    }

}
