// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateClientCertificateResponseBody extends TeaModel {
    /**
     * <p>The ID of the CA certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>babaded901474b9693acf530e0fb1dbb</p>
     */
    @NameInMap("CACertificateId")
    public String CACertificateId;

    /**
     * <p>The certificate content.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN CERTIFICATE-----</p>
     */
    @NameInMap("Certificate")
    public String certificate;

    /**
     * <p>The Common Name of the certificate.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.example.com">www.example.com</a></p>
     */
    @NameInMap("CommonName")
    public String commonName;

    /**
     * <p>The SHA-256 fingerprint of the certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>1dc5fc9af4eead2570c70d94b416130baeb6d4429b51fd3557379588456aca66</p>
     */
    @NameInMap("FingerprintSha256")
    public String fingerprintSha256;

    /**
     * <p>The certificate ID on ESA.</p>
     * 
     * <strong>example:</strong>
     * <p>babaded901474b9693acf530e0fb1d95</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The CA that issued the certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>DCDN CA</p>
     */
    @NameInMap("Issuer")
    public String issuer;

    /**
     * <p>The time when the certificate expires.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-12-01T02:12:49Z</p>
     */
    @NameInMap("NotAfter")
    public String notAfter;

    /**
     * <p>The time when the certificate takes effect.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-12-01T02:12:49Z</p>
     */
    @NameInMap("NotBefore")
    public String notBefore;

    /**
     * <p>The private key of the certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN PRIVATE KEY-----</p>
     */
    @NameInMap("PrivateKey")
    public String privateKey;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C370DAF1-C838-4288-A1A0-9A87633D248E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The serial number of the certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>babaded901474b9693acf530e0fb1daa</p>
     */
    @NameInMap("SerialNumber")
    public String serialNumber;

    /**
     * <p>The signature algorithm of the certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>SHA256-RSA</p>
     */
    @NameInMap("SignatureAlgorithm")
    public String signatureAlgorithm;

    /**
     * <p>The status of the certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>active</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The validity period of the certificate. Unit: day.</p>
     * 
     * <strong>example:</strong>
     * <p>365</p>
     */
    @NameInMap("ValidityDays")
    public String validityDays;

    public static CreateClientCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateClientCertificateResponseBody self = new CreateClientCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateClientCertificateResponseBody setCACertificateId(String CACertificateId) {
        this.CACertificateId = CACertificateId;
        return this;
    }
    public String getCACertificateId() {
        return this.CACertificateId;
    }

    public CreateClientCertificateResponseBody setCertificate(String certificate) {
        this.certificate = certificate;
        return this;
    }
    public String getCertificate() {
        return this.certificate;
    }

    public CreateClientCertificateResponseBody setCommonName(String commonName) {
        this.commonName = commonName;
        return this;
    }
    public String getCommonName() {
        return this.commonName;
    }

    public CreateClientCertificateResponseBody setFingerprintSha256(String fingerprintSha256) {
        this.fingerprintSha256 = fingerprintSha256;
        return this;
    }
    public String getFingerprintSha256() {
        return this.fingerprintSha256;
    }

    public CreateClientCertificateResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateClientCertificateResponseBody setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }
    public String getIssuer() {
        return this.issuer;
    }

    public CreateClientCertificateResponseBody setNotAfter(String notAfter) {
        this.notAfter = notAfter;
        return this;
    }
    public String getNotAfter() {
        return this.notAfter;
    }

    public CreateClientCertificateResponseBody setNotBefore(String notBefore) {
        this.notBefore = notBefore;
        return this;
    }
    public String getNotBefore() {
        return this.notBefore;
    }

    public CreateClientCertificateResponseBody setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }
    public String getPrivateKey() {
        return this.privateKey;
    }

    public CreateClientCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateClientCertificateResponseBody setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }
    public String getSerialNumber() {
        return this.serialNumber;
    }

    public CreateClientCertificateResponseBody setSignatureAlgorithm(String signatureAlgorithm) {
        this.signatureAlgorithm = signatureAlgorithm;
        return this;
    }
    public String getSignatureAlgorithm() {
        return this.signatureAlgorithm;
    }

    public CreateClientCertificateResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CreateClientCertificateResponseBody setValidityDays(String validityDays) {
        this.validityDays = validityDays;
        return this;
    }
    public String getValidityDays() {
        return this.validityDays;
    }

}
