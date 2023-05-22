// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnWafPolicyDomainsResponseBody extends TeaModel {
    /**
     * <p>The ID of the protection policy. You can specify only one ID in each request.</p>
     */
    @NameInMap("Domains")
    public java.util.List<DescribeDcdnWafPolicyDomainsResponseBodyDomains> domains;

    /**
     * <p>>You can call this operation up to 20 times per second per account.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The accelerated domain names.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The accelerated domain name that was protected by the specified protection policy.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of domain names returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeDcdnWafPolicyDomainsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnWafPolicyDomainsResponseBody self = new DescribeDcdnWafPolicyDomainsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnWafPolicyDomainsResponseBody setDomains(java.util.List<DescribeDcdnWafPolicyDomainsResponseBodyDomains> domains) {
        this.domains = domains;
        return this;
    }
    public java.util.List<DescribeDcdnWafPolicyDomainsResponseBodyDomains> getDomains() {
        return this.domains;
    }

    public DescribeDcdnWafPolicyDomainsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDcdnWafPolicyDomainsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDcdnWafPolicyDomainsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDcdnWafPolicyDomainsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDcdnWafPolicyDomainsResponseBodyDomains extends TeaModel {
        /**
         * <p>The accelerated domain name that was protected by the specified protection policy.</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        public static DescribeDcdnWafPolicyDomainsResponseBodyDomains build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnWafPolicyDomainsResponseBodyDomains self = new DescribeDcdnWafPolicyDomainsResponseBodyDomains();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnWafPolicyDomainsResponseBodyDomains setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

    }

}
