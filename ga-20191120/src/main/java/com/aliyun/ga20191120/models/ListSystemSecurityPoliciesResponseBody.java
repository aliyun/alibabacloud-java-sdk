// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListSystemSecurityPoliciesResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The security policies.</p>
     */
    @NameInMap("SecurityPolicies")
    public java.util.List<ListSystemSecurityPoliciesResponseBodySecurityPolicies> securityPolicies;

    /**
     * <p>The total number of entries returned.</p>
     */
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
        /**
         * <p>The supported cipher suites, which depend on the **TLSVersions** value.</p>
         * <br>
         * <p>The specified cipher suites must be supported by at least one **TLS protocol version** that you select. For example, if you set the TLSVersions.N parameter to **TLSv1.3**, you can specify only cipher suites that are supported by **TLSv1.3**.</p>
         * <br>
         * <p>*   **TLSv1.0** and **TLSv1.1** support the following cipher suites:</p>
         * <br>
         * <p>    *   **ECDHE-ECDSA-AES128-SHA**</p>
         * <p>    *   **ECDHE-ECDSA-AES256-SHA**</p>
         * <p>    *   **ECDHE-RSA-AES128-SHA**</p>
         * <p>    *   **ECDHE-RSA-AES256-SHA**</p>
         * <p>    *   **AES128-SHA**</p>
         * <p>    *   **AES256-SHA**</p>
         * <p>    *   **DES-CBC3-SHA**</p>
         * <br>
         * <p>*   **TLS 1.2** supports the following cipher suites:</p>
         * <br>
         * <p>    *   **ECDHE-ECDSA-AES128-SHA**</p>
         * <p>    *   **ECDHE-ECDSA-AES256-SHA**</p>
         * <p>    *   **ECDHE-RSA-AES128-SHA**</p>
         * <p>    *   **ECDHE-RSA-AES256-SHA**</p>
         * <p>    *   **AES128-SHA**</p>
         * <p>    *   **AES256-SHA**</p>
         * <p>    *   **DES-CBC3-SHA**</p>
         * <p>    *   **ECDHE-ECDSA-AES128-GCM-SHA256**</p>
         * <p>    *   **ECDHE-ECDSA-AES256-GCM-SHA384**</p>
         * <p>    *   **ECDHE-ECDSA-AES128-SHA256**</p>
         * <p>    *   **ECDHE-ECDSA-AES256-SHA384**</p>
         * <p>    *   **ECDHE-RSA-AES128-GCM-SHA256**</p>
         * <p>    *   **ECDHE-RSA-AES256-GCM-SHA384**</p>
         * <p>    *   **ECDHE-RSA-AES128-SHA256**</p>
         * <p>    *   **ECDHE-RSA-AES256-SHA384**</p>
         * <p>    *   **AES128-GCM-SHA256**</p>
         * <p>    *   **AES256-GCM-SHA384**</p>
         * <p>    *   **AES128-SHA256**</p>
         * <p>    *   **AES256-SHA256**</p>
         * <br>
         * <p>*   **TLSv1.3** supports the following cipher suites:</p>
         * <br>
         * <p>    *   **TLS_AES\_128\_GCM_SHA256**</p>
         * <p>    *   **TLS_AES\_256\_GCM_SHA384**</p>
         * <p>    *   **TLS_CHACHA20\_POLY1305\_SHA256**</p>
         * <p>    *   **TLS_AES\_128\_CCM_SHA256**</p>
         * <p>    *   **TLS_AES\_128\_CCM\_8\_SHA256**</p>
         */
        @NameInMap("Ciphers")
        public java.util.List<String> ciphers;

        /**
         * <p>The ID of the security policy.</p>
         */
        @NameInMap("SecurityPolicyId")
        public String securityPolicyId;

        /**
         * <p>The supported TLS protocol versions. Valid values: **TLSv1.0**, **TLSv1.1**, **TLSv1.2**, and **TLSv1.3**.</p>
         */
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
