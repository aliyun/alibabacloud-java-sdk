// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class SslCertMetaInfo extends TeaModel {
    @NameInMap("algorithm")
    public String algorithm;

    @NameInMap("certId")
    public Long certId;

    @NameInMap("certIdentifier")
    public String certIdentifier;

    @NameInMap("certName")
    public String certName;

    @NameInMap("commonName")
    public String commonName;

    @NameInMap("domain")
    public String domain;

    @NameInMap("domainMatchCert")
    public Boolean domainMatchCert;

    @NameInMap("fingerprint")
    public String fingerprint;

    @NameInMap("instanceId")
    public String instanceId;

    @NameInMap("isChainCompleted")
    public Boolean isChainCompleted;

    @NameInMap("issuer")
    public String issuer;

    @NameInMap("keySize")
    public String keySize;

    @NameInMap("md5")
    public String md5;

    @NameInMap("notAfterTimestamp")
    public Long notAfterTimestamp;

    @NameInMap("notBeforeTimestamp")
    public Long notBeforeTimestamp;

    @NameInMap("sans")
    public String sans;

    @NameInMap("serialNo")
    public String serialNo;

    @NameInMap("sha2")
    public String sha2;

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
