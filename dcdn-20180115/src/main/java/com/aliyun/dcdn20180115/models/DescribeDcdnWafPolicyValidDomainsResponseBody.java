// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnWafPolicyValidDomainsResponseBody extends TeaModel {
    @NameInMap("Domains")
    public java.util.List<DescribeDcdnWafPolicyValidDomainsResponseBodyDomains> domains;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeDcdnWafPolicyValidDomainsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnWafPolicyValidDomainsResponseBody self = new DescribeDcdnWafPolicyValidDomainsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnWafPolicyValidDomainsResponseBody setDomains(java.util.List<DescribeDcdnWafPolicyValidDomainsResponseBodyDomains> domains) {
        this.domains = domains;
        return this;
    }
    public java.util.List<DescribeDcdnWafPolicyValidDomainsResponseBodyDomains> getDomains() {
        return this.domains;
    }

    public DescribeDcdnWafPolicyValidDomainsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDcdnWafPolicyValidDomainsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDcdnWafPolicyValidDomainsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDcdnWafPolicyValidDomainsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDcdnWafPolicyValidDomainsResponseBodyDomains extends TeaModel {
        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("PolicyId")
        public Long policyId;

        @NameInMap("PolicyName")
        public String policyName;

        @NameInMap("PolicyType")
        public String policyType;

        public static DescribeDcdnWafPolicyValidDomainsResponseBodyDomains build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnWafPolicyValidDomainsResponseBodyDomains self = new DescribeDcdnWafPolicyValidDomainsResponseBodyDomains();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnWafPolicyValidDomainsResponseBodyDomains setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeDcdnWafPolicyValidDomainsResponseBodyDomains setPolicyId(Long policyId) {
            this.policyId = policyId;
            return this;
        }
        public Long getPolicyId() {
            return this.policyId;
        }

        public DescribeDcdnWafPolicyValidDomainsResponseBodyDomains setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

        public DescribeDcdnWafPolicyValidDomainsResponseBodyDomains setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

}
