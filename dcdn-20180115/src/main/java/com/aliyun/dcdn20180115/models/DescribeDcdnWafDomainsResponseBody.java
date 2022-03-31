// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnWafDomainsResponseBody extends TeaModel {
    @NameInMap("Domains")
    public java.util.List<DescribeDcdnWafDomainsResponseBodyDomains> domains;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeDcdnWafDomainsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnWafDomainsResponseBody self = new DescribeDcdnWafDomainsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnWafDomainsResponseBody setDomains(java.util.List<DescribeDcdnWafDomainsResponseBodyDomains> domains) {
        this.domains = domains;
        return this;
    }
    public java.util.List<DescribeDcdnWafDomainsResponseBodyDomains> getDomains() {
        return this.domains;
    }

    public DescribeDcdnWafDomainsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDcdnWafDomainsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDcdnWafDomainsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDcdnWafDomainsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDcdnWafDomainsResponseBodyDomains extends TeaModel {
        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("PolicyCount")
        public Integer policyCount;

        public static DescribeDcdnWafDomainsResponseBodyDomains build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnWafDomainsResponseBodyDomains self = new DescribeDcdnWafDomainsResponseBodyDomains();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnWafDomainsResponseBodyDomains setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeDcdnWafDomainsResponseBodyDomains setPolicyCount(Integer policyCount) {
            this.policyCount = policyCount;
            return this;
        }
        public Integer getPolicyCount() {
            return this.policyCount;
        }

    }

}
