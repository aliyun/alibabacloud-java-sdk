// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class SaveTaskForUpdatingRegistrantInfoByIdentityCredentialRequest extends TeaModel {
    @NameInMap("Address")
    public String address;

    @NameInMap("City")
    public String city;

    @NameInMap("Country")
    public String country;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DomainName")
    public java.util.List<String> domainName;

    @NameInMap("Email")
    public String email;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("IdentityCredential")
    public String identityCredential;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("IdentityCredentialNo")
    public String identityCredentialNo;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("IdentityCredentialType")
    public String identityCredentialType;

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

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegistrantType")
    public String registrantType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TelArea")
    public String telArea;

    @NameInMap("TelExt")
    public String telExt;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Telephone")
    public String telephone;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TransferOutProhibited")
    public Boolean transferOutProhibited;

    @NameInMap("UserClientIp")
    public String userClientIp;

    public static SaveTaskForUpdatingRegistrantInfoByIdentityCredentialRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveTaskForUpdatingRegistrantInfoByIdentityCredentialRequest self = new SaveTaskForUpdatingRegistrantInfoByIdentityCredentialRequest();
        return TeaModel.build(map, self);
    }

    public SaveTaskForUpdatingRegistrantInfoByIdentityCredentialRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public SaveTaskForUpdatingRegistrantInfoByIdentityCredentialRequest setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public SaveTaskForUpdatingRegistrantInfoByIdentityCredentialRequest setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public SaveTaskForUpdatingRegistrantInfoByIdentityCredentialRequest setDomainName(java.util.List<String> domainName) {
        this.domainName = domainName;
        return this;
    }
    public java.util.List<String> getDomainName() {
        return this.domainName;
    }

    public SaveTaskForUpdatingRegistrantInfoByIdentityCredentialRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public SaveTaskForUpdatingRegistrantInfoByIdentityCredentialRequest setIdentityCredential(String identityCredential) {
        this.identityCredential = identityCredential;
        return this;
    }
    public String getIdentityCredential() {
        return this.identityCredential;
    }

    public SaveTaskForUpdatingRegistrantInfoByIdentityCredentialRequest setIdentityCredentialNo(String identityCredentialNo) {
        this.identityCredentialNo = identityCredentialNo;
        return this;
    }
    public String getIdentityCredentialNo() {
        return this.identityCredentialNo;
    }

    public SaveTaskForUpdatingRegistrantInfoByIdentityCredentialRequest setIdentityCredentialType(String identityCredentialType) {
        this.identityCredentialType = identityCredentialType;
        return this;
    }
    public String getIdentityCredentialType() {
        return this.identityCredentialType;
    }

    public SaveTaskForUpdatingRegistrantInfoByIdentityCredentialRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SaveTaskForUpdatingRegistrantInfoByIdentityCredentialRequest setPostalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }
    public String getPostalCode() {
        return this.postalCode;
    }

    public SaveTaskForUpdatingRegistrantInfoByIdentityCredentialRequest setProvince(String province) {
        this.province = province;
        return this;
    }
    public String getProvince() {
        return this.province;
    }

    public SaveTaskForUpdatingRegistrantInfoByIdentityCredentialRequest setRegistrantName(String registrantName) {
        this.registrantName = registrantName;
        return this;
    }
    public String getRegistrantName() {
        return this.registrantName;
    }

    public SaveTaskForUpdatingRegistrantInfoByIdentityCredentialRequest setRegistrantOrganization(String registrantOrganization) {
        this.registrantOrganization = registrantOrganization;
        return this;
    }
    public String getRegistrantOrganization() {
        return this.registrantOrganization;
    }

    public SaveTaskForUpdatingRegistrantInfoByIdentityCredentialRequest setRegistrantType(String registrantType) {
        this.registrantType = registrantType;
        return this;
    }
    public String getRegistrantType() {
        return this.registrantType;
    }

    public SaveTaskForUpdatingRegistrantInfoByIdentityCredentialRequest setTelArea(String telArea) {
        this.telArea = telArea;
        return this;
    }
    public String getTelArea() {
        return this.telArea;
    }

    public SaveTaskForUpdatingRegistrantInfoByIdentityCredentialRequest setTelExt(String telExt) {
        this.telExt = telExt;
        return this;
    }
    public String getTelExt() {
        return this.telExt;
    }

    public SaveTaskForUpdatingRegistrantInfoByIdentityCredentialRequest setTelephone(String telephone) {
        this.telephone = telephone;
        return this;
    }
    public String getTelephone() {
        return this.telephone;
    }

    public SaveTaskForUpdatingRegistrantInfoByIdentityCredentialRequest setTransferOutProhibited(Boolean transferOutProhibited) {
        this.transferOutProhibited = transferOutProhibited;
        return this;
    }
    public Boolean getTransferOutProhibited() {
        return this.transferOutProhibited;
    }

    public SaveTaskForUpdatingRegistrantInfoByIdentityCredentialRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
