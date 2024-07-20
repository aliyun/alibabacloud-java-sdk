// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListSystemSecurityPoliciesResponseBody extends TeaModel {
    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A9B4E54C-9CCD-4002-91A9-D38C6C209192</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of TLS security policies.</p>
     */
    @NameInMap("SecurityPolicies")
    public java.util.List<ListSystemSecurityPoliciesResponseBodySecurityPolicies> securityPolicies;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
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
         * <p>The supported cipher suites. The value of this parameter is determined by the value of <strong>TLSVersions</strong>.</p>
         * <p>The specified cipher suites must be supported by at least one value of <strong>TLSVersions</strong>. For example, if you set TLSVersions to <strong>TLSv1.3</strong>, you must specify cipher suites that are supported by <strong>TLSv1.3</strong>.</p>
         * <ul>
         * <li><p>Valid values when TLSVersions is set to <strong>TLSv1.0</strong> or <strong>TLSv1.1</strong>:</p>
         * <ul>
         * <li>ECDHE-ECDSA-AES128-SHA</li>
         * <li>ECDHE-ECDSA-AES256-SHA</li>
         * <li>ECDHE-RSA-AES128-SHA</li>
         * <li>ECDHE-RSA-AES256-SHA</li>
         * <li>AES128-SHA</li>
         * <li>AES256-SHA</li>
         * <li>DES-CBC3-SHA</li>
         * </ul>
         * </li>
         * <li><p>Valid values when TLSVersions is set to <strong>TLSv1.2</strong>:</p>
         * <ul>
         * <li>ECDHE-ECDSA-AES128-SHA</li>
         * <li>ECDHE-ECDSA-AES256-SHA</li>
         * <li>ECDHE-RSA-AES128-SHA</li>
         * <li>ECDHE-RSA-AES256-SHA</li>
         * <li>AES128-SHA</li>
         * <li>AES256-SHA</li>
         * <li>DES-CBC3-SHA</li>
         * <li>ECDHE-ECDSA-AES128-GCM-SHA256</li>
         * <li>ECDHE-ECDSA-AES256-GCM-SHA384</li>
         * <li>ECDHE-ECDSA-AES128-SHA256</li>
         * <li>ECDHE-ECDSA-AES256-SHA384</li>
         * <li>ECDHE-RSA-AES128-GCM-SHA256</li>
         * <li>ECDHE-RSA-AES256-GCM-SHA384</li>
         * <li>ECDHE-RSA-AES128-SHA256</li>
         * <li>ECDHE-RSA-AES256-SHA384</li>
         * <li>AES128-GCM-SHA256</li>
         * <li>AES256-GCM-SHA384</li>
         * <li>AES128-SHA256</li>
         * <li>AES256-SHA256</li>
         * </ul>
         * </li>
         * <li><p>Valid values when TLSVersions is set to <strong>TLSv1.3</strong>:</p>
         * <ul>
         * <li>TLS_AES_128_GCM_SHA256</li>
         * <li>TLS_AES_256_GCM_SHA384</li>
         * <li>TLS_CHACHA20_POLY1305_SHA256</li>
         * <li>TLS_AES_128_CCM_SHA256</li>
         * <li>TLS_AES_128_CCM_8_SHA256</li>
         * </ul>
         * </li>
         * </ul>
         */
        @NameInMap("Ciphers")
        public java.util.List<String> ciphers;

        /**
         * <p>The ID of the TLS security policy.</p>
         * 
         * <strong>example:</strong>
         * <p>tls_cipher_policy_1_1</p>
         */
        @NameInMap("SecurityPolicyId")
        public String securityPolicyId;

        /**
         * <p>The supported TLS versions. Valid values: <strong>TLSv1.0</strong>, <strong>TLSv1.1</strong>, <strong>TLSv1.2</strong>, and <strong>TLSv1.3</strong>.</p>
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
