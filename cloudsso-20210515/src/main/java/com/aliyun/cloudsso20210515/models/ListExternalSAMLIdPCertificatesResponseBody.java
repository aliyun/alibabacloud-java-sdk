// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class ListExternalSAMLIdPCertificatesResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>400979BC-92EC-58B9-B47C-6913BD56A6FD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The SAML signing certificates.</p>
     */
    @NameInMap("SAMLIdPCertificates")
    public java.util.List<ListExternalSAMLIdPCertificatesResponseBodySAMLIdPCertificates> SAMLIdPCertificates;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCounts")
    public Integer totalCounts;

    public static ListExternalSAMLIdPCertificatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListExternalSAMLIdPCertificatesResponseBody self = new ListExternalSAMLIdPCertificatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListExternalSAMLIdPCertificatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListExternalSAMLIdPCertificatesResponseBody setSAMLIdPCertificates(java.util.List<ListExternalSAMLIdPCertificatesResponseBodySAMLIdPCertificates> SAMLIdPCertificates) {
        this.SAMLIdPCertificates = SAMLIdPCertificates;
        return this;
    }
    public java.util.List<ListExternalSAMLIdPCertificatesResponseBodySAMLIdPCertificates> getSAMLIdPCertificates() {
        return this.SAMLIdPCertificates;
    }

    public ListExternalSAMLIdPCertificatesResponseBody setTotalCounts(Integer totalCounts) {
        this.totalCounts = totalCounts;
        return this;
    }
    public Integer getTotalCounts() {
        return this.totalCounts;
    }

    public static class ListExternalSAMLIdPCertificatesResponseBodySAMLIdPCertificates extends TeaModel {
        /**
         * <p>The ID of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>idp-c-00dt9gnl7fmjaw9c****</p>
         */
        @NameInMap("CertificateId")
        public String certificateId;

        /**
         * <p>The issuer of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>1.2.840.113549.1.9.1=#160d696e666f406f6b74612e63****,CN=dev-xxxxxx,OU=SSOProvider,O=Okta,L=San Francisco,ST=California,C=US</p>
         */
        @NameInMap("Issuer")
        public String issuer;

        /**
         * <p>The time when the certificate expires.</p>
         * 
         * <strong>example:</strong>
         * <p>2030-06-23T07:04:37Z</p>
         */
        @NameInMap("NotAfter")
        public String notAfter;

        /**
         * <p>The time when the certificate was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-06-23T07:03:37Z</p>
         */
        @NameInMap("NotBefore")
        public String notBefore;

        /**
         * <p>The public key of the certificate. The value of this parameter is in the PEM format and is Base64-encoded.</p>
         * 
         * <strong>example:</strong>
         * <p>MIIBIjANBgkqhkiG****</p>
         */
        @NameInMap("PublicKey")
        public String publicKey;

        /**
         * <p>The serial number of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>159289587****</p>
         */
        @NameInMap("SerialNumber")
        public String serialNumber;

        /**
         * <p>The signature algorithm of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>SHA256withRSA</p>
         */
        @NameInMap("SignatureAlgorithm")
        public String signatureAlgorithm;

        /**
         * <p>The subject of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>1.2.840.113549.1.9.1=#160d696e666f406f6b74612e63****,CN=dev-xxxxxx,OU=SSOProvider,O=Okta,L=San Francisco,ST=California,C=US</p>
         */
        @NameInMap("Subject")
        public String subject;

        /**
         * <p>The version of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Version")
        public Integer version;

        /**
         * <p>The X.509 certificate in the PEM format.</p>
         * 
         * <strong>example:</strong>
         * <p>MIIDpDCCAoygAwIBAgIG****</p>
         */
        @NameInMap("X509Certificate")
        public String x509Certificate;

        public static ListExternalSAMLIdPCertificatesResponseBodySAMLIdPCertificates build(java.util.Map<String, ?> map) throws Exception {
            ListExternalSAMLIdPCertificatesResponseBodySAMLIdPCertificates self = new ListExternalSAMLIdPCertificatesResponseBodySAMLIdPCertificates();
            return TeaModel.build(map, self);
        }

        public ListExternalSAMLIdPCertificatesResponseBodySAMLIdPCertificates setCertificateId(String certificateId) {
            this.certificateId = certificateId;
            return this;
        }
        public String getCertificateId() {
            return this.certificateId;
        }

        public ListExternalSAMLIdPCertificatesResponseBodySAMLIdPCertificates setIssuer(String issuer) {
            this.issuer = issuer;
            return this;
        }
        public String getIssuer() {
            return this.issuer;
        }

        public ListExternalSAMLIdPCertificatesResponseBodySAMLIdPCertificates setNotAfter(String notAfter) {
            this.notAfter = notAfter;
            return this;
        }
        public String getNotAfter() {
            return this.notAfter;
        }

        public ListExternalSAMLIdPCertificatesResponseBodySAMLIdPCertificates setNotBefore(String notBefore) {
            this.notBefore = notBefore;
            return this;
        }
        public String getNotBefore() {
            return this.notBefore;
        }

        public ListExternalSAMLIdPCertificatesResponseBodySAMLIdPCertificates setPublicKey(String publicKey) {
            this.publicKey = publicKey;
            return this;
        }
        public String getPublicKey() {
            return this.publicKey;
        }

        public ListExternalSAMLIdPCertificatesResponseBodySAMLIdPCertificates setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public String getSerialNumber() {
            return this.serialNumber;
        }

        public ListExternalSAMLIdPCertificatesResponseBodySAMLIdPCertificates setSignatureAlgorithm(String signatureAlgorithm) {
            this.signatureAlgorithm = signatureAlgorithm;
            return this;
        }
        public String getSignatureAlgorithm() {
            return this.signatureAlgorithm;
        }

        public ListExternalSAMLIdPCertificatesResponseBodySAMLIdPCertificates setSubject(String subject) {
            this.subject = subject;
            return this;
        }
        public String getSubject() {
            return this.subject;
        }

        public ListExternalSAMLIdPCertificatesResponseBodySAMLIdPCertificates setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
        }

        public ListExternalSAMLIdPCertificatesResponseBodySAMLIdPCertificates setX509Certificate(String x509Certificate) {
            this.x509Certificate = x509Certificate;
            return this;
        }
        public String getX509Certificate() {
            return this.x509Certificate;
        }

    }

}
