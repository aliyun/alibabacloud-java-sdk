// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class SaveRegistrantProfileRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("Address")
    public String address;

    /**
     * <strong>example:</strong>
     * <p>long yan shi</p>
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
     * <p>false</p>
     */
    @NameInMap("DefaultRegistrantProfile")
    public Boolean defaultRegistrantProfile;

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

    /**
     * <strong>example:</strong>
     * <p>236300</p>
     */
    @NameInMap("PostalCode")
    public String postalCode;

    /**
     * <strong>example:</strong>
     * <p>fu jian</p>
     */
    @NameInMap("Province")
    public String province;

    /**
     * <strong>example:</strong>
     * <p>chen zi chen</p>
     */
    @NameInMap("RegistrantName")
    public String registrantName;

    /**
     * <strong>example:</strong>
     * <p>liu yang</p>
     */
    @NameInMap("RegistrantOrganization")
    public String registrantOrganization;

    /**
     * <strong>example:</strong>
     * <p>12659727</p>
     */
    @NameInMap("RegistrantProfileId")
    public Long registrantProfileId;

    /**
     * <strong>example:</strong>
     * <p>common</p>
     */
    @NameInMap("RegistrantProfileType")
    public String registrantProfileType;

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
     * <p>7381</p>
     */
    @NameInMap("TelExt")
    public String telExt;

    /**
     * <strong>example:</strong>
     * <p>1829756****</p>
     */
    @NameInMap("Telephone")
    public String telephone;

    /**
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("UserClientIp")
    public String userClientIp;

    public static SaveRegistrantProfileRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveRegistrantProfileRequest self = new SaveRegistrantProfileRequest();
        return TeaModel.build(map, self);
    }

    public SaveRegistrantProfileRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public SaveRegistrantProfileRequest setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public SaveRegistrantProfileRequest setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public SaveRegistrantProfileRequest setDefaultRegistrantProfile(Boolean defaultRegistrantProfile) {
        this.defaultRegistrantProfile = defaultRegistrantProfile;
        return this;
    }
    public Boolean getDefaultRegistrantProfile() {
        return this.defaultRegistrantProfile;
    }

    public SaveRegistrantProfileRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public SaveRegistrantProfileRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SaveRegistrantProfileRequest setPostalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }
    public String getPostalCode() {
        return this.postalCode;
    }

    public SaveRegistrantProfileRequest setProvince(String province) {
        this.province = province;
        return this;
    }
    public String getProvince() {
        return this.province;
    }

    public SaveRegistrantProfileRequest setRegistrantName(String registrantName) {
        this.registrantName = registrantName;
        return this;
    }
    public String getRegistrantName() {
        return this.registrantName;
    }

    public SaveRegistrantProfileRequest setRegistrantOrganization(String registrantOrganization) {
        this.registrantOrganization = registrantOrganization;
        return this;
    }
    public String getRegistrantOrganization() {
        return this.registrantOrganization;
    }

    public SaveRegistrantProfileRequest setRegistrantProfileId(Long registrantProfileId) {
        this.registrantProfileId = registrantProfileId;
        return this;
    }
    public Long getRegistrantProfileId() {
        return this.registrantProfileId;
    }

    public SaveRegistrantProfileRequest setRegistrantProfileType(String registrantProfileType) {
        this.registrantProfileType = registrantProfileType;
        return this;
    }
    public String getRegistrantProfileType() {
        return this.registrantProfileType;
    }

    public SaveRegistrantProfileRequest setRegistrantType(String registrantType) {
        this.registrantType = registrantType;
        return this;
    }
    public String getRegistrantType() {
        return this.registrantType;
    }

    public SaveRegistrantProfileRequest setTelArea(String telArea) {
        this.telArea = telArea;
        return this;
    }
    public String getTelArea() {
        return this.telArea;
    }

    public SaveRegistrantProfileRequest setTelExt(String telExt) {
        this.telExt = telExt;
        return this;
    }
    public String getTelExt() {
        return this.telExt;
    }

    public SaveRegistrantProfileRequest setTelephone(String telephone) {
        this.telephone = telephone;
        return this;
    }
    public String getTelephone() {
        return this.telephone;
    }

    public SaveRegistrantProfileRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
