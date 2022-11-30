// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class GetUserCertificateDetailResponseBody extends TeaModel {
    @NameInMap("BuyInAliyun")
    public Boolean buyInAliyun;

    @NameInMap("Cert")
    public String cert;

    @NameInMap("City")
    public String city;

    @NameInMap("Common")
    public String common;

    @NameInMap("Country")
    public String country;

    @NameInMap("EncryptCert")
    public String encryptCert;

    @NameInMap("EncryptPrivateKey")
    public String encryptPrivateKey;

    @NameInMap("EndDate")
    public String endDate;

    @NameInMap("Expired")
    public Boolean expired;

    @NameInMap("Fingerprint")
    public String fingerprint;

    @NameInMap("Id")
    public Long id;

    @NameInMap("Issuer")
    public String issuer;

    @NameInMap("Key")
    public String key;

    @NameInMap("Name")
    public String name;

    @NameInMap("OrderId")
    public Long orderId;

    @NameInMap("OrgName")
    public String orgName;

    @NameInMap("Province")
    public String province;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("Sans")
    public String sans;

    @NameInMap("SignCert")
    public String signCert;

    @NameInMap("SignPrivateKey")
    public String signPrivateKey;

    @NameInMap("StartDate")
    public String startDate;

    public static GetUserCertificateDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserCertificateDetailResponseBody self = new GetUserCertificateDetailResponseBody();
        return TeaModel.build(map, self);
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
