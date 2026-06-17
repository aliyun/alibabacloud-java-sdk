// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ListTlsInspectCACertificatesResponseBody extends TeaModel {
    /**
     * <p>The list of certificates.</p>
     */
    @NameInMap("Certificates")
    public java.util.List<ListTlsInspectCACertificatesResponseBodyCertificates> certificates;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>CBF1E9B7-D6A0-4E9E-AD3E-******837D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListTlsInspectCACertificatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTlsInspectCACertificatesResponseBody self = new ListTlsInspectCACertificatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTlsInspectCACertificatesResponseBody setCertificates(java.util.List<ListTlsInspectCACertificatesResponseBodyCertificates> certificates) {
        this.certificates = certificates;
        return this;
    }
    public java.util.List<ListTlsInspectCACertificatesResponseBodyCertificates> getCertificates() {
        return this.certificates;
    }

    public ListTlsInspectCACertificatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTlsInspectCACertificatesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListTlsInspectCACertificatesResponseBodyCertificates extends TeaModel {
        /**
         * <p>The encryption algorithm of the CA certificate. Valid values:</p>
         * <ul>
         * <li><p><strong>RSA</strong>: the RSA algorithm.</p>
         * </li>
         * <li><p><strong>ECC</strong>: the ECC algorithm.</p>
         * </li>
         * <li><p><strong>SM2</strong>: the SM2 algorithm.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RSA</p>
         */
        @NameInMap("Algorithm")
        public String algorithm;

        /**
         * <p>The alias of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>rsa_ml_***_root</p>
         */
        @NameInMap("AliasName")
        public String aliasName;

        /**
         * <p>The ID of the CA certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>2732BB48-2969-5716-B5D9-******CA85</p>
         */
        @NameInMap("CaCertId")
        public String caCertId;

        /**
         * <p>The type of the CA certificate. Valid values:</p>
         * <ul>
         * <li><p><strong>ROOT</strong>: a root CA certificate.</p>
         * </li>
         * <li><p><strong>SUB_ROOT</strong>: a subordinate CA certificate.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ROOT</p>
         */
        @NameInMap("CaCertType")
        public String caCertType;

        /**
         * <p>The expiration timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1934***149</p>
         */
        @NameInMap("ExpirationTime")
        public Long expirationTime;

        /**
         * <p>The key length of the CA certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>2048</p>
         */
        @NameInMap("KeySize")
        public Integer keySize;

        /**
         * <p>The ID of the parent CA certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>340BB48-2969-5716-B5D9-****ACA85</p>
         */
        @NameInMap("ParentCaCertId")
        public String parentCaCertId;

        /**
         * <p>The signature algorithm of the CA certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>SHA256WITHRSA</p>
         */
        @NameInMap("SignAlgorithm")
        public String signAlgorithm;

        /**
         * <p>The status of the certificate. Valid values:</p>
         * <ul>
         * <li><p><strong>ISSUE</strong>: enabled.</p>
         * </li>
         * <li><p><strong>REVOKE</strong>: revoked.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ISSUE</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListTlsInspectCACertificatesResponseBodyCertificates build(java.util.Map<String, ?> map) throws Exception {
            ListTlsInspectCACertificatesResponseBodyCertificates self = new ListTlsInspectCACertificatesResponseBodyCertificates();
            return TeaModel.build(map, self);
        }

        public ListTlsInspectCACertificatesResponseBodyCertificates setAlgorithm(String algorithm) {
            this.algorithm = algorithm;
            return this;
        }
        public String getAlgorithm() {
            return this.algorithm;
        }

        public ListTlsInspectCACertificatesResponseBodyCertificates setAliasName(String aliasName) {
            this.aliasName = aliasName;
            return this;
        }
        public String getAliasName() {
            return this.aliasName;
        }

        public ListTlsInspectCACertificatesResponseBodyCertificates setCaCertId(String caCertId) {
            this.caCertId = caCertId;
            return this;
        }
        public String getCaCertId() {
            return this.caCertId;
        }

        public ListTlsInspectCACertificatesResponseBodyCertificates setCaCertType(String caCertType) {
            this.caCertType = caCertType;
            return this;
        }
        public String getCaCertType() {
            return this.caCertType;
        }

        public ListTlsInspectCACertificatesResponseBodyCertificates setExpirationTime(Long expirationTime) {
            this.expirationTime = expirationTime;
            return this;
        }
        public Long getExpirationTime() {
            return this.expirationTime;
        }

        public ListTlsInspectCACertificatesResponseBodyCertificates setKeySize(Integer keySize) {
            this.keySize = keySize;
            return this;
        }
        public Integer getKeySize() {
            return this.keySize;
        }

        public ListTlsInspectCACertificatesResponseBodyCertificates setParentCaCertId(String parentCaCertId) {
            this.parentCaCertId = parentCaCertId;
            return this;
        }
        public String getParentCaCertId() {
            return this.parentCaCertId;
        }

        public ListTlsInspectCACertificatesResponseBodyCertificates setSignAlgorithm(String signAlgorithm) {
            this.signAlgorithm = signAlgorithm;
            return this;
        }
        public String getSignAlgorithm() {
            return this.signAlgorithm;
        }

        public ListTlsInspectCACertificatesResponseBodyCertificates setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
