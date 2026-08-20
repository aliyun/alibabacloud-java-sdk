// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class TransportCertificateInfo extends TeaModel {
    /**
     * <p>The signature/key algorithm.</p>
     * 
     * <strong>example:</strong>
     * <p>RSA_2048</p>
     */
    @NameInMap("algorithm")
    public String algorithm;

    /**
     * <p>The certificate identifier (certificate ID under the APIG cloud account).</p>
     * 
     * <strong>example:</strong>
     * <p>cert-1（1716***@cn-hangzhou 形态）</p>
     */
    @NameInMap("certIdentifier")
    public String certIdentifier;

    /**
     * <p>The certificate name.</p>
     * 
     * <strong>example:</strong>
     * <p>cert-name</p>
     */
    @NameInMap("certName")
    public String certName;

    /**
     * <p>The match status between the certificate and gateway instance domain names.</p>
     * 
     * <strong>example:</strong>
     * <p>Matched</p>
     */
    @NameInMap("certificateMatchStatus")
    public String certificateMatchStatus;

    /**
     * <p>The certificate Common Name (CN).</p>
     * 
     * <strong>example:</strong>
     * <p>api.example.com</p>
     */
    @NameInMap("commonName")
    public String commonName;

    /**
     * <p>The set of covered domain names parsed from CN and SAN (deduplicated in lowercase, may contain *. wildcards).</p>
     */
    @NameInMap("coveredDomains")
    public java.util.List<String> coveredDomains;

    /**
     * <p>The certificate issuer.</p>
     * 
     * <strong>example:</strong>
     * <p>DigiCert Secure Site CN CA G3</p>
     */
    @NameInMap("issuer")
    public String issuer;

    /**
     * <p>The gateway instance domain names matched by covered domains (ordered by instance domain name, deduplicated).</p>
     */
    @NameInMap("matchedDomains")
    public java.util.List<String> matchedDomains;

    /**
     * <p>The expiration timestamp (Unix milliseconds, from the certificate afterDate).</p>
     * 
     * <strong>example:</strong>
     * <p>1747958400000</p>
     */
    @NameInMap("notAfterTimestamp")
    public Long notAfterTimestamp;

    /**
     * <p>The effective period UNIX timestamp (Unix milliseconds, from the certificate beforeDate).</p>
     * 
     * <strong>example:</strong>
     * <p>1716336000000</p>
     */
    @NameInMap("notBeforeTimestamp")
    public Long notBeforeTimestamp;

    /**
     * <p>The raw SAN string (separated by commas, semicolons, or whitespace. Elements may have a DNS: prefix).</p>
     * 
     * <strong>example:</strong>
     * <p>DNS:*.example.org, DNS:foo.example.net</p>
     */
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
