// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class ListSystemSecurityPoliciesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SecurityPolicies")
    public java.util.List<ListSystemSecurityPoliciesResponseBodySecurityPolicies> securityPolicies;

    public static ListSystemSecurityPoliciesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSystemSecurityPoliciesResponseBody self = new ListSystemSecurityPoliciesResponseBody();
        return TeaModel.build(map, self);
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

    public static class ListSystemSecurityPoliciesResponseBodySecurityPolicies extends TeaModel {
        @NameInMap("Ciphers")
        public java.util.List<String> ciphers;

        @NameInMap("SecurityPolicyId")
        public String securityPolicyId;

        @NameInMap("TLSVersions")
        public java.util.List<String> TLSVersions;

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

        public ListSystemSecurityPoliciesResponseBodySecurityPolicies setTLSVersions(java.util.List<String> TLSVersions) {
            this.TLSVersions = TLSVersions;
            return this;
        }
        public java.util.List<String> getTLSVersions() {
            return this.TLSVersions;
        }

    }

}
