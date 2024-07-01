// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class SaveBatchTaskForUpdatingContactInfoByNewContactRequest extends TeaModel {
    @NameInMap("Address")
    public String address;

    @NameInMap("City")
    public String city;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ContactType")
    public String contactType;

    @NameInMap("Country")
    public String country;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DomainName")
    public java.util.List<String> domainName;

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

    @NameInMap("TelArea")
    public String telArea;

    @NameInMap("TelExt")
    public String telExt;

    @NameInMap("Telephone")
    public String telephone;

    @NameInMap("TransferOutProhibited")
    public Boolean transferOutProhibited;

    @NameInMap("UserClientIp")
    public String userClientIp;

    public static SaveBatchTaskForUpdatingContactInfoByNewContactRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveBatchTaskForUpdatingContactInfoByNewContactRequest self = new SaveBatchTaskForUpdatingContactInfoByNewContactRequest();
        return TeaModel.build(map, self);
    }

    public SaveBatchTaskForUpdatingContactInfoByNewContactRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public SaveBatchTaskForUpdatingContactInfoByNewContactRequest setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public SaveBatchTaskForUpdatingContactInfoByNewContactRequest setContactType(String contactType) {
        this.contactType = contactType;
        return this;
    }
    public String getContactType() {
        return this.contactType;
    }

    public SaveBatchTaskForUpdatingContactInfoByNewContactRequest setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public SaveBatchTaskForUpdatingContactInfoByNewContactRequest setDomainName(java.util.List<String> domainName) {
        this.domainName = domainName;
        return this;
    }
    public java.util.List<String> getDomainName() {
        return this.domainName;
    }

    public SaveBatchTaskForUpdatingContactInfoByNewContactRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public SaveBatchTaskForUpdatingContactInfoByNewContactRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SaveBatchTaskForUpdatingContactInfoByNewContactRequest setPostalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }
    public String getPostalCode() {
        return this.postalCode;
    }

    public SaveBatchTaskForUpdatingContactInfoByNewContactRequest setProvince(String province) {
        this.province = province;
        return this;
    }
    public String getProvince() {
        return this.province;
    }

    public SaveBatchTaskForUpdatingContactInfoByNewContactRequest setRegistrantName(String registrantName) {
        this.registrantName = registrantName;
        return this;
    }
    public String getRegistrantName() {
        return this.registrantName;
    }

    public SaveBatchTaskForUpdatingContactInfoByNewContactRequest setRegistrantOrganization(String registrantOrganization) {
        this.registrantOrganization = registrantOrganization;
        return this;
    }
    public String getRegistrantOrganization() {
        return this.registrantOrganization;
    }

    public SaveBatchTaskForUpdatingContactInfoByNewContactRequest setTelArea(String telArea) {
        this.telArea = telArea;
        return this;
    }
    public String getTelArea() {
        return this.telArea;
    }

    public SaveBatchTaskForUpdatingContactInfoByNewContactRequest setTelExt(String telExt) {
        this.telExt = telExt;
        return this;
    }
    public String getTelExt() {
        return this.telExt;
    }

    public SaveBatchTaskForUpdatingContactInfoByNewContactRequest setTelephone(String telephone) {
        this.telephone = telephone;
        return this;
    }
    public String getTelephone() {
        return this.telephone;
    }

    public SaveBatchTaskForUpdatingContactInfoByNewContactRequest setTransferOutProhibited(Boolean transferOutProhibited) {
        this.transferOutProhibited = transferOutProhibited;
        return this;
    }
    public Boolean getTransferOutProhibited() {
        return this.transferOutProhibited;
    }

    public SaveBatchTaskForUpdatingContactInfoByNewContactRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
