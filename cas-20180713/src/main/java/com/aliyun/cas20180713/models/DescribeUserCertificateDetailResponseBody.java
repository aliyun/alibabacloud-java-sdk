// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20180713.models;

import com.aliyun.tea.*;

public class DescribeUserCertificateDetailResponseBody extends TeaModel {
    @NameInMap("Fingerprint")
    public String fingerprint;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Issuer")
    public String issuer;

    @NameInMap("Expired")
    public Boolean expired;

    @NameInMap("OrgName")
    public String orgName;

    @NameInMap("City")
    public String city;

    @NameInMap("EndDate")
    public String endDate;

    @NameInMap("Province")
    public String province;

    @NameInMap("BuyInAliyun")
    public Boolean buyInAliyun;

    @NameInMap("Common")
    public String common;

    @NameInMap("Name")
    public String name;

    @NameInMap("StartDate")
    public String startDate;

    @NameInMap("Sans")
    public String sans;

    @NameInMap("Country")
    public String country;

    @NameInMap("Cert")
    public String cert;

    @NameInMap("Id")
    public Long id;

    @NameInMap("Key")
    public String key;

    public static DescribeUserCertificateDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserCertificateDetailResponseBody self = new DescribeUserCertificateDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserCertificateDetailResponseBody setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
        return this;
    }
    public String getFingerprint() {
        return this.fingerprint;
    }

    public DescribeUserCertificateDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUserCertificateDetailResponseBody setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }
    public String getIssuer() {
        return this.issuer;
    }

    public DescribeUserCertificateDetailResponseBody setExpired(Boolean expired) {
        this.expired = expired;
        return this;
    }
    public Boolean getExpired() {
        return this.expired;
    }

    public DescribeUserCertificateDetailResponseBody setOrgName(String orgName) {
        this.orgName = orgName;
        return this;
    }
    public String getOrgName() {
        return this.orgName;
    }

    public DescribeUserCertificateDetailResponseBody setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public DescribeUserCertificateDetailResponseBody setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public DescribeUserCertificateDetailResponseBody setProvince(String province) {
        this.province = province;
        return this;
    }
    public String getProvince() {
        return this.province;
    }

    public DescribeUserCertificateDetailResponseBody setBuyInAliyun(Boolean buyInAliyun) {
        this.buyInAliyun = buyInAliyun;
        return this;
    }
    public Boolean getBuyInAliyun() {
        return this.buyInAliyun;
    }

    public DescribeUserCertificateDetailResponseBody setCommon(String common) {
        this.common = common;
        return this;
    }
    public String getCommon() {
        return this.common;
    }

    public DescribeUserCertificateDetailResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeUserCertificateDetailResponseBody setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public DescribeUserCertificateDetailResponseBody setSans(String sans) {
        this.sans = sans;
        return this;
    }
    public String getSans() {
        return this.sans;
    }

    public DescribeUserCertificateDetailResponseBody setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public DescribeUserCertificateDetailResponseBody setCert(String cert) {
        this.cert = cert;
        return this;
    }
    public String getCert() {
        return this.cert;
    }

    public DescribeUserCertificateDetailResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DescribeUserCertificateDetailResponseBody setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

}
