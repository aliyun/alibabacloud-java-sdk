// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveBatchTaskForUpdatingContactInfoByNewContactRequest extends TeaModel {
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
     * <p>Contact type. Valid values:  </p>
     * <ul>
     * <li><strong>registrant</strong>: Registrant.  </li>
     * <li><strong>admin</strong>: Administrator.  </li>
     * <li><strong>billing</strong>: Billing contact.  </li>
     * <li><strong>tech</strong>: Technical contact.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>registrant</p>
     */
    @NameInMap("ContactType")
    public String contactType;

    /**
     * <p>Country code, such as <strong>CN</strong> or <strong>US</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>CN</p>
     */
    @NameInMap("Country")
    public String country;

    /**
     * <p>Domain name list.</p>
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
     * <p>Language of error messages returned by the API. Valid values:  </p>
     * <ul>
     * <li><strong>zh</strong>: Chinese.  </li>
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
     * <p>Domain registrant type. Valid values:  </p>
     * <ul>
     * <li><strong>1</strong>: Individual.  </li>
     * <li><strong>2</strong>: Enterprise.</li>
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
     * 
     * <strong>example:</strong>
     * <p>86</p>
     */
    @NameInMap("TelArea")
    public String telArea;

    /**
     * <p>Extension number.</p>
     * 
     * <strong>example:</strong>
     * <p>1235</p>
     */
    @NameInMap("TelExt")
    public String telExt;

    /**
     * <p>Telephone number.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890</p>
     */
    @NameInMap("Telephone")
    public String telephone;

    /**
     * <p>Whether to add a transfer-out prohibition restriction. This parameter only takes effect when <strong>ContactType</strong> is <strong>registrant</strong>, indicating whether the domain name is restricted from transfer-out for 60 days after the registrant is modified. The default value is <strong>false</strong>, which means transfer-out is not restricted.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("TransferOutProhibited")
    public Boolean transferOutProhibited;

    /**
     * <p>User IP.</p>
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
     * <p>Chinese city.</p>
     * 
     * <strong>example:</strong>
     * <p>北京市</p>
     */
    @NameInMap("ZhCity")
    public String zhCity;

    /**
     * <p>Chinese province.</p>
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

    public SaveBatchTaskForUpdatingContactInfoByNewContactRequest setRegistrantType(String registrantType) {
        this.registrantType = registrantType;
        return this;
    }
    public String getRegistrantType() {
        return this.registrantType;
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

    public SaveBatchTaskForUpdatingContactInfoByNewContactRequest setZhAddress(String zhAddress) {
        this.zhAddress = zhAddress;
        return this;
    }
    public String getZhAddress() {
        return this.zhAddress;
    }

    public SaveBatchTaskForUpdatingContactInfoByNewContactRequest setZhCity(String zhCity) {
        this.zhCity = zhCity;
        return this;
    }
    public String getZhCity() {
        return this.zhCity;
    }

    public SaveBatchTaskForUpdatingContactInfoByNewContactRequest setZhProvince(String zhProvince) {
        this.zhProvince = zhProvince;
        return this;
    }
    public String getZhProvince() {
        return this.zhProvince;
    }

    public SaveBatchTaskForUpdatingContactInfoByNewContactRequest setZhRegistrantName(String zhRegistrantName) {
        this.zhRegistrantName = zhRegistrantName;
        return this;
    }
    public String getZhRegistrantName() {
        return this.zhRegistrantName;
    }

    public SaveBatchTaskForUpdatingContactInfoByNewContactRequest setZhRegistrantOrganization(String zhRegistrantOrganization) {
        this.zhRegistrantOrganization = zhRegistrantOrganization;
        return this;
    }
    public String getZhRegistrantOrganization() {
        return this.zhRegistrantOrganization;
    }

}
