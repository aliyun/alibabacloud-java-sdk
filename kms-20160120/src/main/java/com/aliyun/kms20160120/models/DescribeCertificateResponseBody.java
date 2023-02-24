// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class DescribeCertificateResponseBody extends TeaModel {
    /**
     * <p>The Alibaba Cloud Resource Name (ARN) of the certificate.</p>
     */
    @NameInMap("Arn")
    public String arn;

    /**
     * <p>The ID of the certificate. The ID must be globally unique in Certificates Manager.</p>
     */
    @NameInMap("CertificateId")
    public String certificateId;

    /**
     * <p>The time when the certificate was created.</p>
     */
    @NameInMap("CreatedAt")
    public String createdAt;

    /**
     * <p>Indicates whether the private key of the certificate can be exported for use. Valid values:</p>
     * <br>
     * <p>*   true: The private key of the certificate can be exported for use. This is the default value.</p>
     * <p>*   false: The private key of the certificate cannot be exported for use.</p>
     */
    @NameInMap("ExportablePrivateKey")
    public Boolean exportablePrivateKey;

    /**
     * <p>The certificate issuer in the distinguished name (DN) format.</p>
     */
    @NameInMap("Issuer")
    public String issuer;

    /**
     * <p>The type of the key.</p>
     */
    @NameInMap("KeySpec")
    public String keySpec;

    /**
     * <p>The end of the validity period of the certificate.</p>
     */
    @NameInMap("NotAfter")
    public String notAfter;

    /**
     * <p>The beginning of the validity period of the certificate.</p>
     */
    @NameInMap("NotBefore")
    public String notBefore;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The serial number of the certificate.</p>
     */
    @NameInMap("Serial")
    public String serial;

    /**
     * <p>The signature algorithm of the certificate. Valid values:</p>
     * <br>
     * <p>*   RSA2048-SHA256</p>
     * <p>*   ECDSA-SHA256</p>
     * <p>*   SM2-SM3</p>
     */
    @NameInMap("SignatureAlgorithm")
    public String signatureAlgorithm;

    /**
     * <p>The status of the certificate. Valid values:</p>
     * <br>
     * <p>*   PENDING: The certificate is to be imported.</p>
     * <p>*   ACTIVE: The certificate is enabled.</p>
     * <p>*   INACTIVE: The certificate is disabled.</p>
     * <p>*   REVOKED: The certificate is revoked.</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The subject of the certificate, which is in the DN format.</p>
     */
    @NameInMap("Subject")
    public String subject;

    /**
     * <p>The alias of the certificate subject.</p>
     * <br>
     * <p>A domain name list is supported. A maximum of 10 domain names are supported.</p>
     */
    @NameInMap("SubjectAlternativeNames")
    public java.util.List<String> subjectAlternativeNames;

    /**
     * <p>The public key identifier of the certificate subject.</p>
     */
    @NameInMap("SubjectKeyIdentifier")
    public String subjectKeyIdentifier;

    /**
     * <p>The public key of the certificate.</p>
     */
    @NameInMap("SubjectPublicKey")
    public String subjectPublicKey;

    /**
     * <p>The tag of the certificate.</p>
     */
    @NameInMap("Tags")
    public java.util.Map<String, ?> tags;

    /**
     * <p>The time when the certificate was updated.</p>
     */
    @NameInMap("UpdatedAt")
    public String updatedAt;

    public static DescribeCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCertificateResponseBody self = new DescribeCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCertificateResponseBody setArn(String arn) {
        this.arn = arn;
        return this;
    }
    public String getArn() {
        return this.arn;
    }

    public DescribeCertificateResponseBody setCertificateId(String certificateId) {
        this.certificateId = certificateId;
        return this;
    }
    public String getCertificateId() {
        return this.certificateId;
    }

    public DescribeCertificateResponseBody setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public DescribeCertificateResponseBody setExportablePrivateKey(Boolean exportablePrivateKey) {
        this.exportablePrivateKey = exportablePrivateKey;
        return this;
    }
    public Boolean getExportablePrivateKey() {
        return this.exportablePrivateKey;
    }

    public DescribeCertificateResponseBody setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }
    public String getIssuer() {
        return this.issuer;
    }

    public DescribeCertificateResponseBody setKeySpec(String keySpec) {
        this.keySpec = keySpec;
        return this;
    }
    public String getKeySpec() {
        return this.keySpec;
    }

    public DescribeCertificateResponseBody setNotAfter(String notAfter) {
        this.notAfter = notAfter;
        return this;
    }
    public String getNotAfter() {
        return this.notAfter;
    }

    public DescribeCertificateResponseBody setNotBefore(String notBefore) {
        this.notBefore = notBefore;
        return this;
    }
    public String getNotBefore() {
        return this.notBefore;
    }

    public DescribeCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCertificateResponseBody setSerial(String serial) {
        this.serial = serial;
        return this;
    }
    public String getSerial() {
        return this.serial;
    }

    public DescribeCertificateResponseBody setSignatureAlgorithm(String signatureAlgorithm) {
        this.signatureAlgorithm = signatureAlgorithm;
        return this;
    }
    public String getSignatureAlgorithm() {
        return this.signatureAlgorithm;
    }

    public DescribeCertificateResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeCertificateResponseBody setSubject(String subject) {
        this.subject = subject;
        return this;
    }
    public String getSubject() {
        return this.subject;
    }

    public DescribeCertificateResponseBody setSubjectAlternativeNames(java.util.List<String> subjectAlternativeNames) {
        this.subjectAlternativeNames = subjectAlternativeNames;
        return this;
    }
    public java.util.List<String> getSubjectAlternativeNames() {
        return this.subjectAlternativeNames;
    }

    public DescribeCertificateResponseBody setSubjectKeyIdentifier(String subjectKeyIdentifier) {
        this.subjectKeyIdentifier = subjectKeyIdentifier;
        return this;
    }
    public String getSubjectKeyIdentifier() {
        return this.subjectKeyIdentifier;
    }

    public DescribeCertificateResponseBody setSubjectPublicKey(String subjectPublicKey) {
        this.subjectPublicKey = subjectPublicKey;
        return this;
    }
    public String getSubjectPublicKey() {
        return this.subjectPublicKey;
    }

    public DescribeCertificateResponseBody setTags(java.util.Map<String, ?> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.Map<String, ?> getTags() {
        return this.tags;
    }

    public DescribeCertificateResponseBody setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

}
