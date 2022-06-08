// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class DescribeCertificateResponseBody extends TeaModel {
    @NameInMap("Arn")
    public String arn;

    @NameInMap("CertificateId")
    public String certificateId;

    @NameInMap("CreatedAt")
    public String createdAt;

    @NameInMap("ExportablePrivateKey")
    public Boolean exportablePrivateKey;

    @NameInMap("Issuer")
    public String issuer;

    @NameInMap("KeySpec")
    public String keySpec;

    @NameInMap("NotAfter")
    public String notAfter;

    @NameInMap("NotBefore")
    public String notBefore;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Serial")
    public String serial;

    @NameInMap("SignatureAlgorithm")
    public String signatureAlgorithm;

    @NameInMap("Status")
    public String status;

    @NameInMap("Subject")
    public String subject;

    @NameInMap("SubjectAlternativeNames")
    public java.util.List<String> subjectAlternativeNames;

    @NameInMap("SubjectKeyIdentifier")
    public String subjectKeyIdentifier;

    @NameInMap("SubjectPublicKey")
    public String subjectPublicKey;

    @NameInMap("Tags")
    public java.util.Map<String, ?> tags;

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
