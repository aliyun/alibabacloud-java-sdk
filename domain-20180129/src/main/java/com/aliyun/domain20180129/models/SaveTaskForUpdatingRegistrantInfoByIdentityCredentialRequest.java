// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveTaskForUpdatingRegistrantInfoByIdentityCredentialRequest extends TeaModel {
    /**
     * <p>Specific address.</p>
     * 
     * <strong>example:</strong>
     * <p>chao yang qu</p>
     */
    @NameInMap("Address")
    public String address;

    /**
     * <p>City.</p>
     * 
     * <strong>example:</strong>
     * <p>bei jing shi</p>
     */
    @NameInMap("City")
    public String city;

    /**
     * <p>Country code, such as <strong>CN</strong> or <strong>US</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>CN</p>
     */
    @NameInMap("Country")
    public String country;

    /**
     * <p>List of domain names.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>alibabacloud.com</p>
     */
    @NameInMap("DomainName")
    public java.util.List<String> domainName;

    /**
     * <p>Mailbox.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:test@aliyun.com">test@aliyun.com</a></p>
     */
    @NameInMap("Email")
    public String email;

    /**
     * <p>Base64-encoded image of the identity verification document. Image requirements:</p>
     * <ul>
     * <li>Format must be <strong>jpg</strong> or <strong>bmp</strong>.</li>
     * <li>Original image size must be between <strong>55 KB and 1 MB</strong>.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>h6UPhXz/ADP/2Q==</p>
     */
    @NameInMap("IdentityCredential")
    public String identityCredential;

    /**
     * <p>Certificate number used for identity verification, such as an ID card number or Unified Social Credit Code.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5****************9</p>
     */
    @NameInMap("IdentityCredentialNo")
    public String identityCredentialNo;

    /**
     * <p>Identity verification certificate type. Valid values:</p>
     * <ul>
     * <li><strong>SFZ</strong>: Identity card.</li>
     * <li><strong>HZ</strong>: Passport.</li>
     * <li><strong>YYZZ</strong>: Business license.</li>
     * <li><strong>ORG</strong>: Organization code certificate.</li>
     * <li><strong>XYDM</strong>: Unified Social Credit Code certificate.</li>
     * <li><strong>TXZ</strong>: Mainland Travel Permits for Hong Kong and Macao Residents.</li>
     * </ul>
     * <p>If your certificate type is not listed above, see <a href="https://help.aliyun.com/document_detail/72209.html">Supported identity verification certificate types</a> for valid values of other certificate types.</p>
     * <blockquote>
     * <p>You must select the certificate type that matches the document you are submitting.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SFZ</p>
     */
    @NameInMap("IdentityCredentialType")
    public String identityCredentialType;

    /**
     * <p>Language of the error message returned by the API. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * <p>Default value: <strong>en</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>Postal code.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("PostalCode")
    public String postalCode;

    /**
     * <p>Province.</p>
     * 
     * <strong>example:</strong>
     * <p>bei jing</p>
     */
    @NameInMap("Province")
    public String province;

    /**
     * <p>Contact name.</p>
     * 
     * <strong>example:</strong>
     * <p>ce shi</p>
     */
    @NameInMap("RegistrantName")
    public String registrantName;

    /**
     * <p>Registrant organization name.</p>
     * 
     * <strong>example:</strong>
     * <p>ce shi</p>
     */
    @NameInMap("RegistrantOrganization")
    public String registrantOrganization;

    /**
     * <p>Domain registrant type. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: Individual.</li>
     * <li><strong>2</strong>: Organization.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RegistrantType")
    public String registrantType;

    /**
     * <p>Telephone country code.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>86</p>
     */
    @NameInMap("TelArea")
    public String telArea;

    /**
     * <p>Telephone extension number.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("TelExt")
    public String telExt;

    /**
     * <p>Telephone number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345678</p>
     */
    @NameInMap("Telephone")
    public String telephone;

    /**
     * <p>Whether to add a transfer-out prohibition restriction. This indicates whether modifying the registrant imposes a 60-day restriction on domain name transfer-out. Default value: <strong>false</strong>, which means transfer-out is not restricted.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("TransferOutProhibited")
    public Boolean transferOutProhibited;

    /**
     * <p>User IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("UserClientIp")
    public String userClientIp;

    /**
     * <p>Chinese address.</p>
     * 
     * <strong>example:</strong>
     * <p>朝阳区</p>
     */
    @NameInMap("ZhAddress")
    public String zhAddress;

    /**
     * <p>Chinese city name.</p>
     * 
     * <strong>example:</strong>
     * <p>北京市</p>
     */
    @NameInMap("ZhCity")
    public String zhCity;

    /**
     * <p>Chinese province name.</p>
     * 
     * <strong>example:</strong>
     * <p>北京</p>
     */
    @NameInMap("ZhProvince")
    public String zhProvince;

    /**
     * <p>Chinese contact name.</p>
     * 
     * <strong>example:</strong>
     * <p>测试</p>
     */
    @NameInMap("ZhRegistrantName")
    public String zhRegistrantName;

    /**
     * <p>Chinese registrant organization name.</p>
     * 
     * <strong>example:</strong>
     * <p>测试</p>
     */
    @NameInMap("ZhRegistrantOrganization")
    public String zhRegistrantOrganization;

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

    public SaveTaskForUpdatingRegistrantInfoByIdentityCredentialRequest setZhAddress(String zhAddress) {
        this.zhAddress = zhAddress;
        return this;
    }
    public String getZhAddress() {
        return this.zhAddress;
    }

    public SaveTaskForUpdatingRegistrantInfoByIdentityCredentialRequest setZhCity(String zhCity) {
        this.zhCity = zhCity;
        return this;
    }
    public String getZhCity() {
        return this.zhCity;
    }

    public SaveTaskForUpdatingRegistrantInfoByIdentityCredentialRequest setZhProvince(String zhProvince) {
        this.zhProvince = zhProvince;
        return this;
    }
    public String getZhProvince() {
        return this.zhProvince;
    }

    public SaveTaskForUpdatingRegistrantInfoByIdentityCredentialRequest setZhRegistrantName(String zhRegistrantName) {
        this.zhRegistrantName = zhRegistrantName;
        return this;
    }
    public String getZhRegistrantName() {
        return this.zhRegistrantName;
    }

    public SaveTaskForUpdatingRegistrantInfoByIdentityCredentialRequest setZhRegistrantOrganization(String zhRegistrantOrganization) {
        this.zhRegistrantOrganization = zhRegistrantOrganization;
        return this;
    }
    public String getZhRegistrantOrganization() {
        return this.zhRegistrantOrganization;
    }

}
