// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListSystemSecurityPoliciesResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SecurityPolicies")
    public java.util.List<ListSystemSecurityPoliciesResponseBodySecurityPolicies> securityPolicies;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListSystemSecurityPoliciesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSystemSecurityPoliciesResponseBody self = new ListSystemSecurityPoliciesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSystemSecurityPoliciesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListSystemSecurityPoliciesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListSystemSecurityPoliciesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSystemSecurityPoliciesResponseBody setSecurityPolicies(java.util.List<ListSystemSecurityPoliciesResponseBodySecurityPolicies> securityPolicies) {
        this.securityPolicies = securityPolicies;
        return this;
    }
    public java.util.List<ListSystemSecurityPoliciesResponseBodySecurityPolicies> getSecurityPolicies() {
        return this.securityPolicies;
    }

    public ListSystemSecurityPoliciesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListSystemSecurityPoliciesResponseBodySecurityPolicies extends TeaModel {
        @NameInMap("Ciphers")
        public java.util.List<String> ciphers;

        @NameInMap("SecurityPolicyId")
        public String securityPolicyId;

        @NameInMap("TlsVersions")
        public java.util.List<String> tlsVersions;

        public static ListSystemSecurityPoliciesResponseBodySecurityPolicies build(java.util.Map<String, ?> map) throws Exception {
            ListSystemSecurityPoliciesResponseBodySecurityPolicies self = new ListSystemSecurityPoliciesResponseBodySecurityPolicies();
            return TeaModel.build(map, self);
        }

        public ListSystemSecurityPoliciesResponseBodySecurityPolicies setCiphers(java.util.List<String> ciphers) {
            this.ciphers = ciphers;
            return this;
        }
        public java.util.List<String> getCiphers() {
            return this.ciphers;
        }

        public ListSystemSecurityPoliciesResponseBodySecurityPolicies setSecurityPolicyId(String securityPolicyId) {
            this.securityPolicyId = securityPolicyId;
            return this;
        }
        public String getSecurityPolicyId() {
            return this.securityPolicyId;
        }

        public ListSystemSecurityPoliciesResponseBodySecurityPolicies setTlsVersions(java.util.List<String> tlsVersions) {
            this.tlsVersions = tlsVersions;
            return this;
        }
        public java.util.List<String> getTlsVersions() {
            return this.tlsVersions;
        }

    }

}
