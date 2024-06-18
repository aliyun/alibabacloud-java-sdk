// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class ListSystemSecurityPoliciesResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>593B0448-D13E-4C56-AC0D-FDF0FDE0E9A3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The security policies.</p>
     */
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
        /**
         * <p>The supported encryption algorithms.</p>
         */
        @NameInMap("Ciphers")
        public java.util.List<String> ciphers;

        /**
         * <p>The ID of the security policy.</p>
         * 
         * <strong>example:</strong>
         * <p>spy-n0kn923****</p>
         */
        @NameInMap("SecurityPolicyId")
        public String securityPolicyId;

        /**
         * <p>The TLS versions that are supported.</p>
         */
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
