// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class ListExternalSAMLIdPCertificatesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SAMLIdPCertificates")
    public java.util.List<ListExternalSAMLIdPCertificatesResponseBodySAMLIdPCertificates> SAMLIdPCertificates;

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
        @NameInMap("CertificateId")
        public String certificateId;

        @NameInMap("Issuer")
        public String issuer;

        @NameInMap("NotAfter")
        public String notAfter;

        @NameInMap("NotBefore")
        public String notBefore;

        @NameInMap("PublicKey")
        public String publicKey;

        @NameInMap("SerialNumber")
        public String serialNumber;

        @NameInMap("SignatureAlgorithm")
        public String signatureAlgorithm;

        @NameInMap("Subject")
        public String subject;

        @NameInMap("Version")
        public Integer version;

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
