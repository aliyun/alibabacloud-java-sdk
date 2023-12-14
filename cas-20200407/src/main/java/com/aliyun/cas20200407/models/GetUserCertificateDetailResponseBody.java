// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class GetUserCertificateDetailResponseBody extends TeaModel {
    /**
     * <p>The algorithm.</p>
     */
    @NameInMap("Algorithm")
    public String algorithm;

    /**
     * <p>Indicates whether the certificate was purchased from Alibaba Cloud. Valid values:</p>
     * <br>
     * <p>*   **true**: yes</p>
     * <p>*   **false**: no</p>
     */
    @NameInMap("BuyInAliyun")
    public Boolean buyInAliyun;

    /**
     * <p>The content of the certificate.</p>
     */
    @NameInMap("Cert")
    public String cert;

    /**
     * <p>The city of the company or organization to which the certificate purchaser belongs.</p>
     */
    @NameInMap("City")
    public String city;

    /**
     * <p>The parent domain name that is bound to the certificate.</p>
     */
    @NameInMap("Common")
    public String common;

    /**
     * <p>The country or region of the company or organization to which the certificate purchaser belongs.</p>
     */
    @NameInMap("Country")
    public String country;

    /**
     * <p>The content of the encryption certificate in PEM format.</p>
     */
    @NameInMap("EncryptCert")
    public String encryptCert;

    /**
     * <p>The private key of the encryption certificate in the PEM format.</p>
     */
    @NameInMap("EncryptPrivateKey")
    public String encryptPrivateKey;

    /**
     * <p>The expiration date of the certificate.</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>Indicates whether the certificate has expired. Valid values:</p>
     * <br>
     * <p>*   **true**: yes</p>
     * <p>*   **false**: no</p>
     */
    @NameInMap("Expired")
    public Boolean expired;

    /**
     * <p>The fingerprint of the certificate.</p>
     */
    @NameInMap("Fingerprint")
    public String fingerprint;

    /**
     * <p>The ID of the certificate.</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The certificate authority (CA) that issued the certificate.</p>
     */
    @NameInMap("Issuer")
    public String issuer;

    /**
     * <p>The private key.</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <p>The name of the certificate.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the certificate application order.</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <p>The name of the company or organization to which the certificate purchaser belongs.</p>
     */
    @NameInMap("OrgName")
    public String orgName;

    /**
     * <p>The province of the company or organization to which the certificate purchaser belongs.</p>
     */
    @NameInMap("Province")
    public String province;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the resource group to which the certificate belongs.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>All domain names that are bound to the certificate.</p>
     */
    @NameInMap("Sans")
    public String sans;

    /**
     * <p>The content of the signing certificate in the PEM format.</p>
     */
    @NameInMap("SignCert")
    public String signCert;

    /**
     * <p>The private key of the signing certificate in the PEM format.</p>
     */
    @NameInMap("SignPrivateKey")
    public String signPrivateKey;

    /**
     * <p>The issuance date of the certificate.</p>
     */
    @NameInMap("StartDate")
    public String startDate;

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

}
