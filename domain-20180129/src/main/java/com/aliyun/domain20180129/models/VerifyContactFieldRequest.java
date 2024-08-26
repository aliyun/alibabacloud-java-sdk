// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class VerifyContactFieldRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Rd. xitucheng</p>
     */
    @NameInMap("Address")
    public String address;

    /**
     * <strong>example:</strong>
     * <p>Bei jing</p>
     */
    @NameInMap("City")
    public String city;

    /**
     * <strong>example:</strong>
     * <p>CN</p>
     */
    @NameInMap("Country")
    public String country;

    /**
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <strong>example:</strong>
     * <p><a href="mailto:username@example.com">username@example.com</a></p>
     */
    @NameInMap("Email")
    public String email;

    /**
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    @NameInMap("PostalCode")
    public String postalCode;

    /**
     * <strong>example:</strong>
     * <p>Bei jing</p>
     */
    @NameInMap("Province")
    public String province;

    /**
     * <strong>example:</strong>
     * <p>wang xian sheng</p>
     */
    @NameInMap("RegistrantName")
    public String registrantName;

    /**
     * <strong>example:</strong>
     * <p>wang xian sheng</p>
     */
    @NameInMap("RegistrantOrganization")
    public String registrantOrganization;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RegistrantType")
    public String registrantType;

    /**
     * <strong>example:</strong>
     * <p>86</p>
     */
    @NameInMap("TelArea")
    public String telArea;

    /**
     * <strong>example:</strong>
     * <p>01</p>
     */
    @NameInMap("TelExt")
    public String telExt;

    /**
     * <strong>example:</strong>
     * <p>1390000****</p>
     */
    @NameInMap("Telephone")
    public String telephone;

    /**
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("UserClientIp")
    public String userClientIp;

    @NameInMap("ZhAddress")
    public String zhAddress;

    @NameInMap("ZhCity")
    public String zhCity;

    @NameInMap("ZhProvince")
    public String zhProvince;

    @NameInMap("ZhRegistrantName")
    public String zhRegistrantName;

    @NameInMap("ZhRegistrantOrganization")
    public String zhRegistrantOrganization;

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

    public VerifyContactFieldRequest setZhAddress(String zhAddress) {
        this.zhAddress = zhAddress;
        return this;
    }
    public String getZhAddress() {
        return this.zhAddress;
    }

    public VerifyContactFieldRequest setZhCity(String zhCity) {
        this.zhCity = zhCity;
        return this;
    }
    public String getZhCity() {
        return this.zhCity;
    }

    public VerifyContactFieldRequest setZhProvince(String zhProvince) {
        this.zhProvince = zhProvince;
        return this;
    }
    public String getZhProvince() {
        return this.zhProvince;
    }

    public VerifyContactFieldRequest setZhRegistrantName(String zhRegistrantName) {
        this.zhRegistrantName = zhRegistrantName;
        return this;
    }
    public String getZhRegistrantName() {
        return this.zhRegistrantName;
    }

    public VerifyContactFieldRequest setZhRegistrantOrganization(String zhRegistrantOrganization) {
        this.zhRegistrantOrganization = zhRegistrantOrganization;
        return this;
    }
    public String getZhRegistrantOrganization() {
        return this.zhRegistrantOrganization;
    }

}
