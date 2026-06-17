// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class TransportCertificateInfo extends TeaModel {
    @NameInMap("algorithm")
    public String algorithm;

    @NameInMap("certIdentifier")
    public String certIdentifier;

    @NameInMap("certName")
    public String certName;

    @NameInMap("certificateMatchStatus")
    public String certificateMatchStatus;

    @NameInMap("commonName")
    public String commonName;

    @NameInMap("coveredDomains")
    public java.util.List<String> coveredDomains;

    @NameInMap("issuer")
    public String issuer;

    @NameInMap("matchedDomains")
    public java.util.List<String> matchedDomains;

    @NameInMap("notAfterTimestamp")
    public Long notAfterTimestamp;

    @NameInMap("notBeforeTimestamp")
    public Long notBeforeTimestamp;

    @NameInMap("sans")
    public String sans;

    public static TransportCertificateInfo build(java.util.Map<String, ?> map) throws Exception {
        TransportCertificateInfo self = new TransportCertificateInfo();
        return TeaModel.build(map, self);
    }

    public TransportCertificateInfo setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
        return this;
    }
    public String getAlgorithm() {
        return this.algorithm;
    }

    public TransportCertificateInfo setCertIdentifier(String certIdentifier) {
        this.certIdentifier = certIdentifier;
        return this;
    }
    public String getCertIdentifier() {
        return this.certIdentifier;
    }

    public TransportCertificateInfo setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public TransportCertificateInfo setCertificateMatchStatus(String certificateMatchStatus) {
        this.certificateMatchStatus = certificateMatchStatus;
        return this;
    }
    public String getCertificateMatchStatus() {
        return this.certificateMatchStatus;
    }

    public TransportCertificateInfo setCommonName(String commonName) {
        this.commonName = commonName;
        return this;
    }
    public String getCommonName() {
        return this.commonName;
    }

    public TransportCertificateInfo setCoveredDomains(java.util.List<String> coveredDomains) {
        this.coveredDomains = coveredDomains;
        return this;
    }
    public java.util.List<String> getCoveredDomains() {
        return this.coveredDomains;
    }

    public TransportCertificateInfo setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }
    public String getIssuer() {
        return this.issuer;
    }

    public TransportCertificateInfo setMatchedDomains(java.util.List<String> matchedDomains) {
        this.matchedDomains = matchedDomains;
        return this;
    }
    public java.util.List<String> getMatchedDomains() {
        return this.matchedDomains;
    }

    public TransportCertificateInfo setNotAfterTimestamp(Long notAfterTimestamp) {
        this.notAfterTimestamp = notAfterTimestamp;
        return this;
    }
    public Long getNotAfterTimestamp() {
        return this.notAfterTimestamp;
    }

    public TransportCertificateInfo setNotBeforeTimestamp(Long notBeforeTimestamp) {
        this.notBeforeTimestamp = notBeforeTimestamp;
        return this;
    }
    public Long getNotBeforeTimestamp() {
        return this.notBeforeTimestamp;
    }

    public TransportCertificateInfo setSans(String sans) {
        this.sans = sans;
        return this;
    }
    public String getSans() {
        return this.sans;
    }

}
