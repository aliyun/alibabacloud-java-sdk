// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class GetUserCertificateDetailResponseBody extends TeaModel {
    /**
     * <p>The algorithm of the certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>RSA</p>
     */
    @NameInMap("Algorithm")
    public String algorithm;

    /**
     * <p>Indicates whether the certificate was purchased from Alibaba Cloud. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Yes</p>
     * </li>
     * <li><p><strong>false</strong>: No</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("BuyInAliyun")
    public Boolean buyInAliyun;

    /**
     * <p>The content of the certificate that does not use a Chinese cryptographic algorithm. This parameter is returned only when the certFilter request parameter is false.</p>
     * 
     * <strong>example:</strong>
     * <p>---BEGIN CERTIFICATE----- MIIF...... -----END CERTIFICATE-----</p>
     */
    @NameInMap("Cert")
    public String cert;

    /**
     * <p>The information about the certificate chain.</p>
     */
    @NameInMap("CertChain")
    public java.util.List<GetUserCertificateDetailResponseBodyCertChain> certChain;

    /**
     * <p>The certificate ID followed by &quot;-cn-hangzhou&quot;. For example, if the certificate ID is 123, the value of CertIdentifier is &quot;123-cn-hangzhou&quot;.</p>
     * 
     * <strong>example:</strong>
     * <p>13781326-cn-hangzhou</p>
     */
    @NameInMap("CertIdentifier")
    public String certIdentifier;

    @NameInMap("CertSha2")
    public String certSha2;

    /**
     * <p>The city where the company or organization of the certificate purchaser is located.</p>
     * 
     * <strong>example:</strong>
     * <p>hangzhou</p>
     */
    @NameInMap("City")
    public String city;

    /**
     * <p>The primary domain name that is bound to the certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>*.com</p>
     */
    @NameInMap("Common")
    public String common;

    /**
     * <p>The country where the company or organization of the certificate purchaser is located.</p>
     * 
     * <strong>example:</strong>
     * <p>CN</p>
     */
    @NameInMap("Country")
    public String country;

    /**
     * <p>The content of the encryption certificate that uses a Chinese cryptographic algorithm. The certificate is in PEM format. This parameter is returned only when the certFilter request parameter is false.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN CERTIFICATE-----
     * MIICDzCCA***
     * -----END CERTIFICATE-----</p>
     */
    @NameInMap("EncryptCert")
    public String encryptCert;

    /**
     * <p>The private key of the encryption certificate that uses a Chinese cryptographic algorithm. The private key is in PEM format. This parameter is returned only when the certFilter request parameter is false.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN EC PRIVATE KEY-----
     * MHcCAQEEI****
     * -----END EC PRIVATE KEY-----</p>
     */
    @NameInMap("EncryptPrivateKey")
    public String encryptPrivateKey;

    /**
     * <p>The expiration date of the certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-10-25</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>Indicates whether the certificate has expired. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The certificate has expired.</p>
     * </li>
     * <li><p><strong>false</strong>: The certificate has not expired.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Expired")
    public Boolean expired;

    /**
     * <p>The fingerprint of the certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>1D7801BBE772D5DE55CBF1F88AEB41A42402DA07</p>
     */
    @NameInMap("Fingerprint")
    public String fingerprint;

    /**
     * <p>The ID of the certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>121345</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The ID of the resource instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cas-ivauto-hqito6</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The certification authority (CA) that issued the certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>Digicert</p>
     */
    @NameInMap("Issuer")
    public String issuer;

    /**
     * <p>The private key of the certificate that does not use a Chinese cryptographic algorithm. This parameter is returned only when the certFilter request parameter is false.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN RSA PRIVATE KEY----- MII.... -----END RSA PRIVATE KEY-----</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <p>The name of the certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>cert_name</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The end time of the validity period of the certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>17326613180000</p>
     */
    @NameInMap("NotAfter")
    public Long notAfter;

    /**
     * <p>The start time of the validity period of the certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>17321613180000</p>
     */
    @NameInMap("NotBefore")
    public Long notBefore;

    /**
     * <p>The ID of the certificate application order.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <p>The name of the company or organization of the certificate purchaser.</p>
     * 
     * <strong>example:</strong>
     * <p>Alibaba</p>
     */
    @NameInMap("OrgName")
    public String orgName;

    /**
     * <p>The province where the company or organization of the certificate purchaser is located.</p>
     * 
     * <strong>example:</strong>
     * <p>zhejiang</p>
     */
    @NameInMap("Province")
    public String province;

    /**
     * <p>The ID of the request. This unique ID is generated by Alibaba Cloud for the request and can be used to troubleshoot and locate issues.</p>
     * 
     * <strong>example:</strong>
     * <p>15C66C7B-671A-4297-9187-2C4477247A74</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aek****wia</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>All domain names that are bound to the certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>*.com</p>
     */
    @NameInMap("Sans")
    public String sans;

    /**
     * <p>The serial number of the certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>033cd852608689ef5e368fde89e0961769e8</p>
     */
    @NameInMap("SerialNo")
    public String serialNo;

    /**
     * <p>The SHA-2 value of the certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>573415B23243066AD345AE5A57BD0FAE94F598BDD06D906278B5FF318F090FC8</p>
     */
    @NameInMap("Sha2")
    public String sha2;

    /**
     * <p>The content of the signing certificate that uses a Chinese cryptographic algorithm. The certificate is in PEM format. This parameter is returned only when the certFilter request parameter is false.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN CERTIFICATE-----
     * MIICDzCCAbagAw****
     * -----END CERTIFICATE-----</p>
     */
    @NameInMap("SignCert")
    public String signCert;

    /**
     * <p>The private key of the signing certificate that uses a Chinese cryptographic algorithm. The private key is in PEM format. This parameter is returned only when the certFilter request parameter is false.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN EC PRIVATE KEY-----
     * MHcCAQEEILR****
     * -----END EC PRIVATE KEY-----</p>
     */
    @NameInMap("SignPrivateKey")
    public String signPrivateKey;

    /**
     * <p>The issuance date of the certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>2018-07-13</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    /**
     * <p>The list of tags.</p>
     */
    @NameInMap("Tags")
    public java.util.List<GetUserCertificateDetailResponseBodyTags> tags;

    public static GetUserCertificateDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserCertificateDetailResponseBody self = new GetUserCertificateDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserCertificateDetailResponseBody setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
        return this;
    }
    public String getAlgorithm() {
        return this.algorithm;
    }

    public GetUserCertificateDetailResponseBody setBuyInAliyun(Boolean buyInAliyun) {
        this.buyInAliyun = buyInAliyun;
        return this;
    }
    public Boolean getBuyInAliyun() {
        return this.buyInAliyun;
    }

    public GetUserCertificateDetailResponseBody setCert(String cert) {
        this.cert = cert;
        return this;
    }
    public String getCert() {
        return this.cert;
    }

    public GetUserCertificateDetailResponseBody setCertChain(java.util.List<GetUserCertificateDetailResponseBodyCertChain> certChain) {
        this.certChain = certChain;
        return this;
    }
    public java.util.List<GetUserCertificateDetailResponseBodyCertChain> getCertChain() {
        return this.certChain;
    }

    public GetUserCertificateDetailResponseBody setCertIdentifier(String certIdentifier) {
        this.certIdentifier = certIdentifier;
        return this;
    }
    public String getCertIdentifier() {
        return this.certIdentifier;
    }

    public GetUserCertificateDetailResponseBody setCertSha2(String certSha2) {
        this.certSha2 = certSha2;
        return this;
    }
    public String getCertSha2() {
        return this.certSha2;
    }

    public GetUserCertificateDetailResponseBody setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public GetUserCertificateDetailResponseBody setCommon(String common) {
        this.common = common;
        return this;
    }
    public String getCommon() {
        return this.common;
    }

    public GetUserCertificateDetailResponseBody setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public GetUserCertificateDetailResponseBody setEncryptCert(String encryptCert) {
        this.encryptCert = encryptCert;
        return this;
    }
    public String getEncryptCert() {
        return this.encryptCert;
    }

    public GetUserCertificateDetailResponseBody setEncryptPrivateKey(String encryptPrivateKey) {
        this.encryptPrivateKey = encryptPrivateKey;
        return this;
    }
    public String getEncryptPrivateKey() {
        return this.encryptPrivateKey;
    }

    public GetUserCertificateDetailResponseBody setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public GetUserCertificateDetailResponseBody setExpired(Boolean expired) {
        this.expired = expired;
        return this;
    }
    public Boolean getExpired() {
        return this.expired;
    }

    public GetUserCertificateDetailResponseBody setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
        return this;
    }
    public String getFingerprint() {
        return this.fingerprint;
    }

    public GetUserCertificateDetailResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public GetUserCertificateDetailResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetUserCertificateDetailResponseBody setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }
    public String getIssuer() {
        return this.issuer;
    }

    public GetUserCertificateDetailResponseBody setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public GetUserCertificateDetailResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetUserCertificateDetailResponseBody setNotAfter(Long notAfter) {
        this.notAfter = notAfter;
        return this;
    }
    public Long getNotAfter() {
        return this.notAfter;
    }

    public GetUserCertificateDetailResponseBody setNotBefore(Long notBefore) {
        this.notBefore = notBefore;
        return this;
    }
    public Long getNotBefore() {
        return this.notBefore;
    }

    public GetUserCertificateDetailResponseBody setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public GetUserCertificateDetailResponseBody setOrgName(String orgName) {
        this.orgName = orgName;
        return this;
    }
    public String getOrgName() {
        return this.orgName;
    }

    public GetUserCertificateDetailResponseBody setProvince(String province) {
        this.province = province;
        return this;
    }
    public String getProvince() {
        return this.province;
    }

    public GetUserCertificateDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserCertificateDetailResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public GetUserCertificateDetailResponseBody setSans(String sans) {
        this.sans = sans;
        return this;
    }
    public String getSans() {
        return this.sans;
    }

    public GetUserCertificateDetailResponseBody setSerialNo(String serialNo) {
        this.serialNo = serialNo;
        return this;
    }
    public String getSerialNo() {
        return this.serialNo;
    }

    public GetUserCertificateDetailResponseBody setSha2(String sha2) {
        this.sha2 = sha2;
        return this;
    }
    public String getSha2() {
        return this.sha2;
    }

    public GetUserCertificateDetailResponseBody setSignCert(String signCert) {
        this.signCert = signCert;
        return this;
    }
    public String getSignCert() {
        return this.signCert;
    }

    public GetUserCertificateDetailResponseBody setSignPrivateKey(String signPrivateKey) {
        this.signPrivateKey = signPrivateKey;
        return this;
    }
    public String getSignPrivateKey() {
        return this.signPrivateKey;
    }

    public GetUserCertificateDetailResponseBody setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public GetUserCertificateDetailResponseBody setTags(java.util.List<GetUserCertificateDetailResponseBodyTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<GetUserCertificateDetailResponseBodyTags> getTags() {
        return this.tags;
    }

    public static class GetUserCertificateDetailResponseBodyCertChain extends TeaModel {
        /**
         * <p>The common name of the certificate in the chain.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("CommonName")
        public String commonName;

        /**
         * <p>The common name of the issuer.</p>
         * 
         * <strong>example:</strong>
         * <p>Encryption Everywhere DV TLS CA - G2</p>
         */
        @NameInMap("IssuerCommonName")
        public String issuerCommonName;

        /**
         * <p>The expiration date of the certificate in the chain.</p>
         * 
         * <strong>example:</strong>
         * <p>17352613180000</p>
         */
        @NameInMap("NotAfter")
        public Long notAfter;

        /**
         * <p>The issuance date of the certificate in the chain.</p>
         * 
         * <strong>example:</strong>
         * <p>17322633180000</p>
         */
        @NameInMap("NotBefore")
        public Long notBefore;

        /**
         * <p>The number of days until the certificate in the chain expires.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("RemainDay")
        public Integer remainDay;

        public static GetUserCertificateDetailResponseBodyCertChain build(java.util.Map<String, ?> map) throws Exception {
            GetUserCertificateDetailResponseBodyCertChain self = new GetUserCertificateDetailResponseBodyCertChain();
            return TeaModel.build(map, self);
        }

        public GetUserCertificateDetailResponseBodyCertChain setCommonName(String commonName) {
            this.commonName = commonName;
            return this;
        }
        public String getCommonName() {
            return this.commonName;
        }

        public GetUserCertificateDetailResponseBodyCertChain setIssuerCommonName(String issuerCommonName) {
            this.issuerCommonName = issuerCommonName;
            return this;
        }
        public String getIssuerCommonName() {
            return this.issuerCommonName;
        }

        public GetUserCertificateDetailResponseBodyCertChain setNotAfter(Long notAfter) {
            this.notAfter = notAfter;
            return this;
        }
        public Long getNotAfter() {
            return this.notAfter;
        }

        public GetUserCertificateDetailResponseBodyCertChain setNotBefore(Long notBefore) {
            this.notBefore = notBefore;
            return this;
        }
        public Long getNotBefore() {
            return this.notBefore;
        }

        public GetUserCertificateDetailResponseBodyCertChain setRemainDay(Integer remainDay) {
            this.remainDay = remainDay;
            return this;
        }
        public Integer getRemainDay() {
            return this.remainDay;
        }

    }

    public static class GetUserCertificateDetailResponseBodyTags extends TeaModel {
        /**
         * <p>The key of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The value of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static GetUserCertificateDetailResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            GetUserCertificateDetailResponseBodyTags self = new GetUserCertificateDetailResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public GetUserCertificateDetailResponseBodyTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public GetUserCertificateDetailResponseBodyTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

}
