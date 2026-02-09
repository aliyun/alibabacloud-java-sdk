// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class SslCertMetaInfo extends TeaModel {
    /**
     * <p>The algorithm.</p>
     * 
     * <strong>example:</strong>
     * <p>RSA2048</p>
     */
    @NameInMap("algorithm")
    public String algorithm;

    /**
     * <p>The certificate ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890</p>
     */
    @NameInMap("certId")
    public Long certId;

    /**
     * <p>The certificate ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cert-123</p>
     */
    @NameInMap("certIdentifier")
    public String certIdentifier;

    /**
     * <p>The certificate name.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("certName")
    public String certName;

    /**
     * <p>The name.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("commonName")
    public String commonName;

    /**
     * <p>The domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>api.example.com</p>
     */
    @NameInMap("domain")
    public String domain;

    /**
     * <p>The certificate matching the domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("domainMatchCert")
    public Boolean domainMatchCert;

    /**
     * <p>The certificate fingerprint.</p>
     * 
     * <strong>example:</strong>
     * <p>A1:B2:C3:D4:E5:F6:78:90:AB:CD:EF:12:34:56:78:90</p>
     */
    @NameInMap("fingerprint")
    public String fingerprint;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp1234567890</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    /**
     * <p>isChainCompleted</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("isChainCompleted")
    public Boolean isChainCompleted;

    /**
     * <p>The certificate issuer.</p>
     * 
     * <strong>example:</strong>
     * <p>DigiCert Inc</p>
     */
    @NameInMap("issuer")
    public String issuer;

    /**
     * <p>The key size.</p>
     * 
     * <strong>example:</strong>
     * <p>2048</p>
     */
    @NameInMap("keySize")
    public String keySize;

    /**
     * <p>The md5 value.</p>
     * 
     * <strong>example:</strong>
     * <p>A1B2C3D4E5F67890ABCDEF1234567890</p>
     */
    @NameInMap("md5")
    public String md5;

    /**
     * <p>The time when the certificate expires.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890000</p>
     */
    @NameInMap("notAfterTimestamp")
    public Long notAfterTimestamp;

    /**
     * <p>The time when the certificate starts to take effect.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890000</p>
     */
    @NameInMap("notBeforeTimestamp")
    public Long notBeforeTimestamp;

    /**
     * <p>sans</p>
     * 
     * <strong>example:</strong>
     * <p>*.example.com,api.example.com,<a href="http://www.example.com">www.example.com</a></p>
     */
    @NameInMap("sans")
    public String sans;

    /**
     * <p>The serial number.</p>
     * 
     * <strong>example:</strong>
     * <p>03:A1:B2:C3:D4:E5:F6:78:90:AB:CD:EF:12:34:56:78:90</p>
     */
    @NameInMap("serialNo")
    public String serialNo;

    /**
     * <p>The sha2 value.</p>
     * 
     * <strong>example:</strong>
     * <p>A1B2C3D4E5F67890ABCDEF1234567890ABCDEF1234567890ABCDEF1234567890</p>
     */
    @NameInMap("sha2")
    public String sha2;

    /**
     * <p>The signature algorithm.</p>
     * 
     * <strong>example:</strong>
     * <p>sha256WithRSAEncryption</p>
     */
    @NameInMap("signAlgorithm")
    public String signAlgorithm;

    public static SslCertMetaInfo build(java.util.Map<String, ?> map) throws Exception {
        SslCertMetaInfo self = new SslCertMetaInfo();
        return TeaModel.build(map, self);
    }

    public SslCertMetaInfo setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
        return this;
    }
    public String getAlgorithm() {
        return this.algorithm;
    }

    public SslCertMetaInfo setCertId(Long certId) {
        this.certId = certId;
        return this;
    }
    public Long getCertId() {
        return this.certId;
    }

    public SslCertMetaInfo setCertIdentifier(String certIdentifier) {
        this.certIdentifier = certIdentifier;
        return this;
    }
    public String getCertIdentifier() {
        return this.certIdentifier;
    }

    public SslCertMetaInfo setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public SslCertMetaInfo setCommonName(String commonName) {
        this.commonName = commonName;
        return this;
    }
    public String getCommonName() {
        return this.commonName;
    }

    public SslCertMetaInfo setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public SslCertMetaInfo setDomainMatchCert(Boolean domainMatchCert) {
        this.domainMatchCert = domainMatchCert;
        return this;
    }
    public Boolean getDomainMatchCert() {
        return this.domainMatchCert;
    }

    public SslCertMetaInfo setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
        return this;
    }
    public String getFingerprint() {
        return this.fingerprint;
    }

    public SslCertMetaInfo setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SslCertMetaInfo setIsChainCompleted(Boolean isChainCompleted) {
        this.isChainCompleted = isChainCompleted;
        return this;
    }
    public Boolean getIsChainCompleted() {
        return this.isChainCompleted;
    }

    public SslCertMetaInfo setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }
    public String getIssuer() {
        return this.issuer;
    }

    public SslCertMetaInfo setKeySize(String keySize) {
        this.keySize = keySize;
        return this;
    }
    public String getKeySize() {
        return this.keySize;
    }

    public SslCertMetaInfo setMd5(String md5) {
        this.md5 = md5;
        return this;
    }
    public String getMd5() {
        return this.md5;
    }

    public SslCertMetaInfo setNotAfterTimestamp(Long notAfterTimestamp) {
        this.notAfterTimestamp = notAfterTimestamp;
        return this;
    }
    public Long getNotAfterTimestamp() {
        return this.notAfterTimestamp;
    }

    public SslCertMetaInfo setNotBeforeTimestamp(Long notBeforeTimestamp) {
        this.notBeforeTimestamp = notBeforeTimestamp;
        return this;
    }
    public Long getNotBeforeTimestamp() {
        return this.notBeforeTimestamp;
    }

    public SslCertMetaInfo setSans(String sans) {
        this.sans = sans;
        return this;
    }
    public String getSans() {
        return this.sans;
    }

    public SslCertMetaInfo setSerialNo(String serialNo) {
        this.serialNo = serialNo;
        return this;
    }
    public String getSerialNo() {
        return this.serialNo;
    }

    public SslCertMetaInfo setSha2(String sha2) {
        this.sha2 = sha2;
        return this;
    }
    public String getSha2() {
        return this.sha2;
    }

    public SslCertMetaInfo setSignAlgorithm(String signAlgorithm) {
        this.signAlgorithm = signAlgorithm;
        return this;
    }
    public String getSignAlgorithm() {
        return this.signAlgorithm;
    }

}
