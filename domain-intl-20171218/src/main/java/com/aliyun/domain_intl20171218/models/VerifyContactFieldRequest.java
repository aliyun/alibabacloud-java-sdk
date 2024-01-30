// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class VerifyContactFieldRequest extends TeaModel {
    @NameInMap("Address")
    public String address;

    @NameInMap("City")
    public String city;

    @NameInMap("Country")
    public String country;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("Email")
    public String email;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("PostalCode")
    public String postalCode;

    @NameInMap("Province")
    public String province;

    @NameInMap("RegistrantName")
    public String registrantName;

    @NameInMap("RegistrantOrganization")
    public String registrantOrganization;

    @NameInMap("RegistrantType")
    public String registrantType;

    @NameInMap("TelArea")
    public String telArea;

    @NameInMap("TelExt")
    public String telExt;

    @NameInMap("Telephone")
    public String telephone;

    @NameInMap("UserClientIp")
    public String userClientIp;

    public static VerifyContactFieldRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyContactFieldRequest self = new VerifyContactFieldRequest();
        return TeaModel.build(map, self);
    }

    public VerifyContactFieldRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public VerifyContactFieldRequest setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public VerifyContactFieldRequest setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public VerifyContactFieldRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public VerifyContactFieldRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public VerifyContactFieldRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public VerifyContactFieldRequest setPostalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }
    public String getPostalCode() {
        return this.postalCode;
    }

    public VerifyContactFieldRequest setProvince(String province) {
        this.province = province;
        return this;
    }
    public String getProvince() {
        return this.province;
    }

    public VerifyContactFieldRequest setRegistrantName(String registrantName) {
        this.registrantName = registrantName;
        return this;
    }
    public String getRegistrantName() {
        return this.registrantName;
    }

    public VerifyContactFieldRequest setRegistrantOrganization(String registrantOrganization) {
        this.registrantOrganization = registrantOrganization;
        return this;
    }
    public String getRegistrantOrganization() {
        return this.registrantOrganization;
    }

    public VerifyContactFieldRequest setRegistrantType(String registrantType) {
        this.registrantType = registrantType;
        return this;
    }
    public String getRegistrantType() {
        return this.registrantType;
    }

    public VerifyContactFieldRequest setTelArea(String telArea) {
        this.telArea = telArea;
        return this;
    }
    public String getTelArea() {
        return this.telArea;
    }

    public VerifyContactFieldRequest setTelExt(String telExt) {
        this.telExt = telExt;
        return this;
    }
    public String getTelExt() {
        return this.telExt;
    }

    public VerifyContactFieldRequest setTelephone(String telephone) {
        this.telephone = telephone;
        return this;
    }
    public String getTelephone() {
        return this.telephone;
    }

    public VerifyContactFieldRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
