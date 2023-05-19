// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnWafPolicyValidDomainsResponseBody extends TeaModel {
    /**
     * <p>The information about the protected domain names.</p>
     */
    @NameInMap("Domains")
    public java.util.List<DescribeDcdnWafPolicyValidDomainsResponseBodyDomains> domains;

    /**
     * <p>The page number of the returned page, which is the same as the PageNumber parameter in request parameters.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of domain names returned per page, which is the same as the PageSize parameter in request parameters.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of domain names returned.</p>
     */
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

    public static class DescribeDcdnWafPolicyValidDomainsResponseBodyDomainsPolicies extends TeaModel {
        /**
         * <p>The ID of the rule.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name of the policy.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The type of the policy.</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeDcdnWafPolicyValidDomainsResponseBodyDomainsPolicies build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnWafPolicyValidDomainsResponseBodyDomainsPolicies self = new DescribeDcdnWafPolicyValidDomainsResponseBodyDomainsPolicies();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnWafPolicyValidDomainsResponseBodyDomainsPolicies setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeDcdnWafPolicyValidDomainsResponseBodyDomainsPolicies setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDcdnWafPolicyValidDomainsResponseBodyDomainsPolicies setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeDcdnWafPolicyValidDomainsResponseBodyDomains extends TeaModel {
        /**
         * <p>The protected domain name.</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>The policy that is bound to the domain name.</p>
         */
        @NameInMap("Policies")
        public java.util.List<DescribeDcdnWafPolicyValidDomainsResponseBodyDomainsPolicies> policies;

        /**
         * <p>The ID of the protection policy.</p>
         */
        @NameInMap("PolicyId")
        public Long policyId;

        /**
         * <p>The name of the protection policy.</p>
         */
        @NameInMap("PolicyName")
        public String policyName;

        /**
         * <p>Indicates whether the protection policy is the default policy. Valid values:</p>
         * <br>
         * <p>*   default: The protection policy is the default policy.</p>
         * <p>*   custom: The protection policy is not the default policy.</p>
         */
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

        public DescribeDcdnWafPolicyValidDomainsResponseBodyDomains setPolicies(java.util.List<DescribeDcdnWafPolicyValidDomainsResponseBodyDomainsPolicies> policies) {
            this.policies = policies;
            return this;
        }
        public java.util.List<DescribeDcdnWafPolicyValidDomainsResponseBodyDomainsPolicies> getPolicies() {
            return this.policies;
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
