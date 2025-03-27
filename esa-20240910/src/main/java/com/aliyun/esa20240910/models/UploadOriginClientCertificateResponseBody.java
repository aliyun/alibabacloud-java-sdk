// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UploadOriginClientCertificateResponseBody extends TeaModel {
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
     * <p>The certificate ID.</p>
     * 
     * <strong>example:</strong>
     * <p>babaabcd****</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The CA that issued the certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>GlobalSign nv-sa</p>
     */
    @NameInMap("Issuer")
    public String issuer;

    /**
     * <p>The time when the certificate expires.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-12-01T02:13:07Z</p>
     */
    @NameInMap("NotAfter")
    public String notAfter;

    /**
     * <p>The time when the certificate takes effect.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-12-01T02:13:07Z</p>
     */
    @NameInMap("NotBefore")
    public String notBefore;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>36af3fcc-43d0-441c-86b1-428951dc8225</p>
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
     * <p>OK</p>
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

    public static UploadOriginClientCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UploadOriginClientCertificateResponseBody self = new UploadOriginClientCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public UploadOriginClientCertificateResponseBody setCommonName(String commonName) {
        this.commonName = commonName;
        return this;
    }
    public String getCommonName() {
        return this.commonName;
    }

    public UploadOriginClientCertificateResponseBody setFingerprintSha256(String fingerprintSha256) {
        this.fingerprintSha256 = fingerprintSha256;
        return this;
    }
    public String getFingerprintSha256() {
        return this.fingerprintSha256;
    }

    public UploadOriginClientCertificateResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UploadOriginClientCertificateResponseBody setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }
    public String getIssuer() {
        return this.issuer;
    }

    public UploadOriginClientCertificateResponseBody setNotAfter(String notAfter) {
        this.notAfter = notAfter;
        return this;
    }
    public String getNotAfter() {
        return this.notAfter;
    }

    public UploadOriginClientCertificateResponseBody setNotBefore(String notBefore) {
        this.notBefore = notBefore;
        return this;
    }
    public String getNotBefore() {
        return this.notBefore;
    }

    public UploadOriginClientCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UploadOriginClientCertificateResponseBody setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }
    public String getSerialNumber() {
        return this.serialNumber;
    }

    public UploadOriginClientCertificateResponseBody setSignatureAlgorithm(String signatureAlgorithm) {
        this.signatureAlgorithm = signatureAlgorithm;
        return this;
    }
    public String getSignatureAlgorithm() {
        return this.signatureAlgorithm;
    }

    public UploadOriginClientCertificateResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UploadOriginClientCertificateResponseBody setValidityDays(String validityDays) {
        this.validityDays = validityDays;
        return this;
    }
    public String getValidityDays() {
        return this.validityDays;
    }

}
