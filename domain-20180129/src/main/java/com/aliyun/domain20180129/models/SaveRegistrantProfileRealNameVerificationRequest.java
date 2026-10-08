// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveRegistrantProfileRealNameVerificationRequest extends TeaModel {
    /**
     * <p>Detailed address (in English).  </p>
     * <blockquote>
     * <p>This parameter is available and required only when the <strong>RegistrantProfileId</strong> parameter is not provided. Failure to provide it will cause domain registration to fail.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>chao yang qu</p>
     */
    @NameInMap("Address")
    public String address;

    /**
     * <p>City (in English).  </p>
     * <blockquote>
     * <p>This parameter is active and required only when the <strong>RegistrantProfileId</strong> parameter is not provided. If this parameter is not provided, domain name registration will fail.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>bei jing shi</p>
     */
    @NameInMap("City")
    public String city;

    /**
     * <p>Country code, such as <strong>CN</strong>.</p>
     * <blockquote>
     * <p>This parameter is active and required only when the <strong>RegistrantProfileId</strong> parameter is not provided. Failure to provide it will cause domain registration to fail.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>CN</p>
     */
    @NameInMap("Country")
    public String country;

    /**
     * <p>Email address.  </p>
     * <blockquote>
     * <p>This parameter is available and required only when the <strong>RegistrantProfileId</strong> parameter is not provided. Failure to provide it will cause domain registration to fail.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:username@example.com">username@example.com</a></p>
     */
    @NameInMap("Email")
    public String email;

    /**
     * <p>Base64-encoded image of the identity verification document. Image requirements:  </p>
     * <ul>
     * <li>Format must be <strong>jpg</strong> or <strong>bmp</strong>.  </li>
     * <li>Original image size must be between <strong>55 KB and 1 MB</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>dGVzdA==</p>
     */
    @NameInMap("IdentityCredential")
    public String identityCredential;

    /**
     * <p>Certificate number for identity verification.</p>
     * 
     * <strong>example:</strong>
     * <p>4111111111111110**</p>
     */
    @NameInMap("IdentityCredentialNo")
    public String identityCredentialNo;

    /**
     * <p>Type of certificate used for identity verification. Valid values:  </p>
     * <ul>
     * <li><strong>SFZ</strong>: Identity card.  </li>
     * <li><strong>HZ</strong>: Passport.  </li>
     * <li><strong>YYZZ</strong>: Business license.  </li>
     * <li><strong>ORG</strong>: Organization code certificate.  </li>
     * <li><strong>XYDM</strong>: Unified Social Credit Code certificate.  </li>
     * <li><strong>TXZ</strong>: Mainland Travel Permits for Hong Kong and Macao Residents.</li>
     * </ul>
     * <blockquote>
     * <p>For more certificate types, see <a href="https://help.aliyun.com/document_detail/72209.html">Supported Certificate Types for Identity Verification</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>SFZ</p>
     */
    @NameInMap("IdentityCredentialType")
    public String identityCredentialType;

    /**
     * <p>Language of the error message returned by the API. Valid values:  </p>
     * <ul>
     * <li><strong>zh</strong>: Chinese  </li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * <p>Default value: <strong>en</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>Postal code.  </p>
     * <blockquote>
     * <p>This parameter is available and required only when the <strong>RegistrantProfileId</strong> parameter is not provided. Failure to provide it will cause domain registration to fail.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1234567</p>
     */
    @NameInMap("PostalCode")
    public String postalCode;

    /**
     * <p>Province (in English).  </p>
     * <blockquote>
     * <p>This parameter is active and required only when the <strong>RegistrantProfileId</strong> parameter is not provided. If this parameter is not provided, domain name registration will fail.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>bei jing</p>
     */
    @NameInMap("Province")
    public String province;

    /**
     * <p>Domain name contact (in English).  </p>
     * <blockquote>
     * <p>This parameter is active and required only when the <strong>RegistrantProfileId</strong> parameter is not provided. If this parameter is not provided, domain name registration will fail.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ce shi</p>
     */
    @NameInMap("RegistrantName")
    public String registrantName;

    /**
     * <p>Registrant name (in English).</p>
     * <blockquote>
     * <p>This parameter is active and required only when the <strong>RegistrantProfileId</strong> parameter is not provided. Failure to provide it will cause domain registration to fail.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ce shi</p>
     */
    @NameInMap("RegistrantOrganization")
    public String registrantOrganization;

    /**
     * <p>ID of the registrant profile template to be saved.  </p>
     * <p>The system automatically generates this ID after a registrant profile is successfully created. You can invoke the <a href="https://help.aliyun.com/document_detail/67701.html">QueryRegistrantProfiles</a> API to query the registrant profile ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567</p>
     */
    @NameInMap("RegistrantProfileId")
    public Long registrantProfileId;

    /**
     * <p>Templatetype. Valid values:  </p>
     * <ul>
     * <li><strong>common</strong>: General template.  </li>
     * <li><strong>cnnic</strong>: CNNIC template.</li>
     * </ul>
     * <blockquote>
     * <p>The CNNIC template is supported only on the Alibaba Cloud international site (alibabacloud.com). Domains under the CNNIC registry, such as &quot;.cn&quot; and &quot;.中国&quot;, registered on the Alibaba Cloud international site must use the CNNIC template. Other domains must use the general template.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>common</p>
     */
    @NameInMap("RegistrantProfileType")
    public String registrantProfileType;

    /**
     * <p>Type of the registrant. Valid values:  </p>
     * <ul>
     * <li><strong>1</strong>: Individual.  </li>
     * <li><strong>2</strong>: Enterprise or organization.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is available and required only when the <strong>RegistrantProfileId</strong> parameter is not provided. Failure to provide it will cause domain registration to fail.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RegistrantType")
    public String registrantType;

    /**
     * <p>Telephone country code.</p>
     * <blockquote>
     * <p>For example, the telephone country code for China is <strong>86</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>86</p>
     */
    @NameInMap("TelArea")
    public String telArea;

    /**
     * <p>Extension number.</p>
     * <blockquote>
     * <p>This parameter is active and required only when the <strong>RegistrantProfileId</strong> parameter is not provided. Failure to provide it will cause domain registration to fail.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("TelExt")
    public String telExt;

    /**
     * <p>Telephone number.  </p>
     * <blockquote>
     * <p>This parameter is available and required only when the <strong>RegistrantProfileId</strong> parameter is not provided. Failure to provide it will cause domain registration to fail.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>12345678</p>
     */
    @NameInMap("Telephone")
    public String telephone;

    /**
     * <p>User IP address. You can set it to <strong>127.0.0.1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("UserClientIp")
    public String userClientIp;

    /**
     * <p>Full address (in Chinese).</p>
     * <blockquote>
     * <p>This parameter applies only to the China site (aliyun.com). It is active and required only when the <strong>RegistrantProfileId</strong> parameter is not provided. Failure to provide it will cause domain registration to fail.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>朝阳区</p>
     */
    @NameInMap("ZhAddress")
    public String zhAddress;

    /**
     * <p>City (in Chinese).  </p>
     * <blockquote>
     * <p>This parameter applies only to the China site (aliyun.com). It is active and required only when the <strong>RegistrantProfileId</strong> parameter is not provided. If this parameter is not provided, domain name registration will fail.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>北京市</p>
     */
    @NameInMap("ZhCity")
    public String zhCity;

    /**
     * <p>Province (in Chinese).  </p>
     * <blockquote>
     * <p>This parameter applies only to the China site (aliyun.com). It is available and required only when the <strong>RegistrantProfileId</strong> parameter is not provided. Failure to provide it will cause domain registration to fail.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>北京</p>
     */
    @NameInMap("ZhProvince")
    public String zhProvince;

    /**
     * <p>Domain name contact (in Chinese).  </p>
     * <blockquote>
     * <p>This parameter applies only to the China site (aliyun.com). It is active and required only when the <strong>RegistrantProfileId</strong> parameter is not provided. If this parameter is not provided, domain name registration will fail.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>测试</p>
     */
    @NameInMap("ZhRegistrantName")
    public String zhRegistrantName;

    /**
     * <p>Registrant name (in Chinese).</p>
     * <blockquote>
     * <p>This parameter applies only to the China site (aliyun.com). It is active and required only when the <strong>RegistrantProfileId</strong> parameter is not provided. Failure to provide it will cause domain registration to fail.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>测试</p>
     */
    @NameInMap("ZhRegistrantOrganization")
    public String zhRegistrantOrganization;

    public static SaveRegistrantProfileRealNameVerificationRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveRegistrantProfileRealNameVerificationRequest self = new SaveRegistrantProfileRealNameVerificationRequest();
        return TeaModel.build(map, self);
    }

    public SaveRegistrantProfileRealNameVerificationRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public SaveRegistrantProfileRealNameVerificationRequest setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public SaveRegistrantProfileRealNameVerificationRequest setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public SaveRegistrantProfileRealNameVerificationRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public SaveRegistrantProfileRealNameVerificationRequest setIdentityCredential(String identityCredential) {
        this.identityCredential = identityCredential;
        return this;
    }
    public String getIdentityCredential() {
        return this.identityCredential;
    }

    public SaveRegistrantProfileRealNameVerificationRequest setIdentityCredentialNo(String identityCredentialNo) {
        this.identityCredentialNo = identityCredentialNo;
        return this;
    }
    public String getIdentityCredentialNo() {
        return this.identityCredentialNo;
    }

    public SaveRegistrantProfileRealNameVerificationRequest setIdentityCredentialType(String identityCredentialType) {
        this.identityCredentialType = identityCredentialType;
        return this;
    }
    public String getIdentityCredentialType() {
        return this.identityCredentialType;
    }

    public SaveRegistrantProfileRealNameVerificationRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SaveRegistrantProfileRealNameVerificationRequest setPostalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }
    public String getPostalCode() {
        return this.postalCode;
    }

    public SaveRegistrantProfileRealNameVerificationRequest setProvince(String province) {
        this.province = province;
        return this;
    }
    public String getProvince() {
        return this.province;
    }

    public SaveRegistrantProfileRealNameVerificationRequest setRegistrantName(String registrantName) {
        this.registrantName = registrantName;
        return this;
    }
    public String getRegistrantName() {
        return this.registrantName;
    }

    public SaveRegistrantProfileRealNameVerificationRequest setRegistrantOrganization(String registrantOrganization) {
        this.registrantOrganization = registrantOrganization;
        return this;
    }
    public String getRegistrantOrganization() {
        return this.registrantOrganization;
    }

    public SaveRegistrantProfileRealNameVerificationRequest setRegistrantProfileId(Long registrantProfileId) {
        this.registrantProfileId = registrantProfileId;
        return this;
    }
    public Long getRegistrantProfileId() {
        return this.registrantProfileId;
    }

    public SaveRegistrantProfileRealNameVerificationRequest setRegistrantProfileType(String registrantProfileType) {
        this.registrantProfileType = registrantProfileType;
        return this;
    }
    public String getRegistrantProfileType() {
        return this.registrantProfileType;
    }

    public SaveRegistrantProfileRealNameVerificationRequest setRegistrantType(String registrantType) {
        this.registrantType = registrantType;
        return this;
    }
    public String getRegistrantType() {
        return this.registrantType;
    }

    public SaveRegistrantProfileRealNameVerificationRequest setTelArea(String telArea) {
        this.telArea = telArea;
        return this;
    }
    public String getTelArea() {
        return this.telArea;
    }

    public SaveRegistrantProfileRealNameVerificationRequest setTelExt(String telExt) {
        this.telExt = telExt;
        return this;
    }
    public String getTelExt() {
        return this.telExt;
    }

    public SaveRegistrantProfileRealNameVerificationRequest setTelephone(String telephone) {
        this.telephone = telephone;
        return this;
    }
    public String getTelephone() {
        return this.telephone;
    }

    public SaveRegistrantProfileRealNameVerificationRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public SaveRegistrantProfileRealNameVerificationRequest setZhAddress(String zhAddress) {
        this.zhAddress = zhAddress;
        return this;
    }
    public String getZhAddress() {
        return this.zhAddress;
    }

    public SaveRegistrantProfileRealNameVerificationRequest setZhCity(String zhCity) {
        this.zhCity = zhCity;
        return this;
    }
    public String getZhCity() {
        return this.zhCity;
    }

    public SaveRegistrantProfileRealNameVerificationRequest setZhProvince(String zhProvince) {
        this.zhProvince = zhProvince;
        return this;
    }
    public String getZhProvince() {
        return this.zhProvince;
    }

    public SaveRegistrantProfileRealNameVerificationRequest setZhRegistrantName(String zhRegistrantName) {
        this.zhRegistrantName = zhRegistrantName;
        return this;
    }
    public String getZhRegistrantName() {
        return this.zhRegistrantName;
    }

    public SaveRegistrantProfileRealNameVerificationRequest setZhRegistrantOrganization(String zhRegistrantOrganization) {
        this.zhRegistrantOrganization = zhRegistrantOrganization;
        return this;
    }
    public String getZhRegistrantOrganization() {
        return this.zhRegistrantOrganization;
    }

}
