// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveSingleTaskForCreatingOrderActivateRequest extends TeaModel {
    /**
     * <p>The detailed address in English.</p>
     * <blockquote>
     * <p>This parameter is available and required only when the <strong>RegistrantProfileId</strong> parameter is not specified. If you do not specify this parameter, the domain name registration fails.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>chao yang qu</p>
     */
    @NameInMap("Address")
    public String address;

    /**
     * <p>Specifies whether to use Alibaba Cloud DNS servers. Valid values: <strong>true</strong> and <strong>false</strong>. Default value: <strong>true</strong>.</p>
     * <blockquote>
     * <ul>
     * <li>If you set this parameter to <strong>true</strong>, you do not need to specify the <strong>Dns1</strong> and <strong>Dns2</strong> parameters. Otherwise, the specified <strong>Dns1</strong> and <strong>Dns2</strong> parameters do not take effect.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>If you set this parameter to <strong>false</strong>, you must specify the <strong>Dns1</strong> and <strong>Dns2</strong> parameters.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AliyunDns")
    public Boolean aliyunDns;

    /**
     * <p>The city name in English.</p>
     * <blockquote>
     * <p>This parameter is available and required only when the <strong>RegistrantProfileId</strong> parameter is not specified. If you do not specify this parameter, the domain name registration fails.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>bei jing shi</p>
     */
    @NameInMap("City")
    public String city;

    /**
     * <p>The country code, such as <strong>CN</strong>.</p>
     * <blockquote>
     * <p>This parameter is available and required only when the <strong>RegistrantProfileId</strong> parameter is not specified. If you do not specify this parameter, the domain name registration fails.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>CN</p>
     */
    @NameInMap("Country")
    public String country;

    /**
     * <p>The ID of the voucher. Default value: a string.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("CouponNo")
    public String couponNo;

    /**
     * <p>The first custom DNS server.</p>
     * <blockquote>
     * <ul>
     * <li>This parameter is available and required only when the <strong>AliyunDns</strong> parameter is set to <strong>false</strong>.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>Make sure that the custom DNS server is correct. Otherwise, the registration may fail.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ns1.aliyun.com</p>
     */
    @NameInMap("Dns1")
    public String dns1;

    /**
     * <p>The second custom DNS server.</p>
     * <blockquote>
     * <ul>
     * <li>This parameter is available and required only when the <strong>AliyunDns</strong> parameter is set to <strong>false</strong>.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>Make sure that the custom DNS server is correct. Otherwise, the registration may fail.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ns2.aliyun.com</p>
     */
    @NameInMap("Dns2")
    public String dns2;

    /**
     * <p>The domain name that you want to register.</p>
     * <blockquote>
     * <p>When you register a domain name, you must specify the registrant information. If you do not specify the registrant information, the domain name registration fails. You can specify the RegistrantProfileId parameter to use a registrant profile that defines the registrant information.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The email address.</p>
     * <blockquote>
     * <p>This parameter is available and required only when the <strong>RegistrantProfileId</strong> parameter is not specified. If you do not specify this parameter, the domain name registration fails.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:username@example.com">username@example.com</a></p>
     */
    @NameInMap("Email")
    public String email;

    /**
     * <p>Specifies whether to enable the domain name privacy protection service. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Enable.</li>
     * <li><strong>false</strong>: Do not enable.</li>
     * </ul>
     * <p>Default value: <strong>true</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableDomainProxy")
    public Boolean enableDomainProxy;

    /**
     * <p>The domain name in Punycode format. This parameter can be left empty.</p>
     * 
     * <strong>example:</strong>
     * <p>xn--fiqs8s.com</p>
     */
    @NameInMap("ExpectedPunycode")
    public String expectedPunycode;

    /**
     * <p>The language of the error message returned by the API operation. Valid values:</p>
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
     * <p>Specifies whether to allow the registration of premium domain names. Valid values:</p>
     * <ul>
     * <li><strong>false</strong>: Not allowed.</li>
     * <li><strong>true</strong>: Allowed.</li>
     * </ul>
     * <p>Default value: <strong>false</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("PermitPremiumActivation")
    public Boolean permitPremiumActivation;

    /**
     * <p>The postal code.</p>
     * <blockquote>
     * <p>This parameter is available and required only when the <strong>RegistrantProfileId</strong> parameter is not specified. If you do not specify this parameter, the domain name registration fails.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1234567</p>
     */
    @NameInMap("PostalCode")
    public String postalCode;

    /**
     * <p>The ID of the coupon.</p>
     * 
     * <strong>example:</strong>
     * <p>123123</p>
     */
    @NameInMap("PromotionNo")
    public String promotionNo;

    /**
     * <p>The province name in English.</p>
     * <blockquote>
     * <p>This parameter is available and required only when the <strong>RegistrantProfileId</strong> parameter is not specified. If you do not specify this parameter, the domain name registration fails.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>bei jing</p>
     */
    @NameInMap("Province")
    public String province;

    /**
     * <p>The name of the domain name contact in English.</p>
     * <blockquote>
     * <p>This parameter is available and required only when the <strong>RegistrantProfileId</strong> parameter is not specified. If you do not specify this parameter, the domain name registration fails.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ce shi</p>
     */
    @NameInMap("RegistrantName")
    public String registrantName;

    /**
     * <p>The name of the domain name registrant in English.</p>
     * <blockquote>
     * <p>This parameter is available and required only when the <strong>RegistrantProfileId</strong> parameter is not specified. If you do not specify this parameter, the domain name registration fails.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ce shi</p>
     */
    @NameInMap("RegistrantOrganization")
    public String registrantOrganization;

    /**
     * <p>The ID of the domain name registrant profile. The profile contains information such as the registrant name, contact name, phone number, and email address. You can use only a real-name verified registrant profile to register a domain name. If you have created a registrant profile, you can call the <a href="~~QueryRegistrantProfiles~~">QueryRegistrantProfiles</a> operation to query the profile ID.</p>
     * <blockquote>
     * <p>After you specify this parameter, you do not need to specify the <strong>RegistrantType</strong>, <strong>ZhRegistrantOrganization</strong>, <strong>ZhRegistrantName</strong>, <strong>ZhProvince</strong>, <strong>ZhCity</strong>, <strong>ZhAddress</strong>, <strong>RegistrantOrganization</strong>, <strong>RegistrantName</strong>, <strong>Province</strong>, <strong>City</strong>, <strong>Address</strong>, <strong>PostalCode</strong>, <strong>Country</strong>, <strong>TelArea</strong>, <strong>Telephone</strong>, <strong>TelExt</strong>, or <strong>Email</strong> parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("RegistrantProfileId")
    public Long registrantProfileId;

    /**
     * <p>The type of the domain name registrant. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: Individual.</li>
     * <li><strong>2</strong>: Enterprise or organization.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is available and required only when the <strong>RegistrantProfileId</strong> parameter is not specified. If you do not specify this parameter, the domain name registration fails.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RegistrantType")
    public String registrantType;

    /**
     * <p>None.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-XX</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The subscription duration. Unit: <strong>year</strong>. Default value: <strong>1 year</strong>. Maximum value: <strong>10 years</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SubscriptionDuration")
    public Integer subscriptionDuration;

    /**
     * <p>The country code for the phone number, such as <strong>86</strong> for China.</p>
     * <blockquote>
     * <p>This parameter is available and required only when the <strong>RegistrantProfileId</strong> parameter is not specified. If you do not specify this parameter, the domain name registration fails.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>86</p>
     */
    @NameInMap("TelArea")
    public String telArea;

    /**
     * <p>The extension number.</p>
     * <blockquote>
     * <p>This parameter is available and required only when the <strong>RegistrantProfileId</strong> parameter is not specified. If you do not specify this parameter, the domain name registration fails.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("TelExt")
    public String telExt;

    /**
     * <p>The phone number.</p>
     * <blockquote>
     * <p>This parameter is available and required only when the <strong>RegistrantProfileId</strong> parameter is not specified. If you do not specify this parameter, the domain name registration fails.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>12345678</p>
     */
    @NameInMap("Telephone")
    public String telephone;

    /**
     * <p>Specifies whether to allow the registration of trademark domain names. Valid values:</p>
     * <ul>
     * <li><strong>false</strong>: Not allowed.</li>
     * <li><strong>true</strong>: Allowed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("TrademarkDomainActivation")
    public Boolean trademarkDomainActivation;

    /**
     * <p>Specifies whether to use a voucher. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Use.</li>
     * <li><strong>false</strong>: Do not use.</li>
     * </ul>
     * <p>Default value: <strong>false</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("UseCoupon")
    public Boolean useCoupon;

    /**
     * <p>Specifies whether to use a coupon. Valid values:</p>
     * <ul>
     * <li><strong>false</strong>: Not allowed.</li>
     * <li><strong>true</strong>: Allowed.</li>
     * </ul>
     * <p>Default value: <strong>false</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("UsePromotion")
    public Boolean usePromotion;

    /**
     * <p>The IP address of the client. You can set this parameter to <strong>127.0.0.1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("UserClientIp")
    public String userClientIp;

    /**
     * <p>The detailed address in Chinese.</p>
     * <blockquote>
     * <p>This parameter is applicable only to the China site. This parameter is available and required only when the <strong>RegistrantProfileId</strong> parameter is not specified. If you do not specify this parameter, the domain name registration fails.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>朝阳区</p>
     */
    @NameInMap("ZhAddress")
    public String zhAddress;

    /**
     * <p>The city name in Chinese.</p>
     * <blockquote>
     * <p>This parameter is applicable only to the China site. This parameter is available and required only when the <strong>RegistrantProfileId</strong> parameter is not specified. If you do not specify this parameter, the domain name registration fails.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>北京市</p>
     */
    @NameInMap("ZhCity")
    public String zhCity;

    /**
     * <p>The province name in Chinese.</p>
     * <blockquote>
     * <p>This parameter is applicable only to the China site. This parameter is available and required only when the <strong>RegistrantProfileId</strong> parameter is not specified. If you do not specify this parameter, the domain name registration fails.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>北京</p>
     */
    @NameInMap("ZhProvince")
    public String zhProvince;

    /**
     * <p>The name of the domain name contact in Chinese.</p>
     * <blockquote>
     * <p>This parameter is applicable only to the China site. This parameter is available and required only when the <strong>RegistrantProfileId</strong> parameter is not specified. If you do not specify this parameter, the domain name registration fails.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>测试</p>
     */
    @NameInMap("ZhRegistrantName")
    public String zhRegistrantName;

    /**
     * <p>The name of the domain name registrant in Chinese.</p>
     * <blockquote>
     * <p>This parameter is applicable only to the China site. This parameter is available and required only when the <strong>RegistrantProfileId</strong> parameter is not specified. If you do not specify this parameter, the domain name registration fails.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>测试</p>
     */
    @NameInMap("ZhRegistrantOrganization")
    public String zhRegistrantOrganization;

    public static SaveSingleTaskForCreatingOrderActivateRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveSingleTaskForCreatingOrderActivateRequest self = new SaveSingleTaskForCreatingOrderActivateRequest();
        return TeaModel.build(map, self);
    }

    public SaveSingleTaskForCreatingOrderActivateRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public SaveSingleTaskForCreatingOrderActivateRequest setAliyunDns(Boolean aliyunDns) {
        this.aliyunDns = aliyunDns;
        return this;
    }
    public Boolean getAliyunDns() {
        return this.aliyunDns;
    }

    public SaveSingleTaskForCreatingOrderActivateRequest setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public SaveSingleTaskForCreatingOrderActivateRequest setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public SaveSingleTaskForCreatingOrderActivateRequest setCouponNo(String couponNo) {
        this.couponNo = couponNo;
        return this;
    }
    public String getCouponNo() {
        return this.couponNo;
    }

    public SaveSingleTaskForCreatingOrderActivateRequest setDns1(String dns1) {
        this.dns1 = dns1;
        return this;
    }
    public String getDns1() {
        return this.dns1;
    }

    public SaveSingleTaskForCreatingOrderActivateRequest setDns2(String dns2) {
        this.dns2 = dns2;
        return this;
    }
    public String getDns2() {
        return this.dns2;
    }

    public SaveSingleTaskForCreatingOrderActivateRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SaveSingleTaskForCreatingOrderActivateRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public SaveSingleTaskForCreatingOrderActivateRequest setEnableDomainProxy(Boolean enableDomainProxy) {
        this.enableDomainProxy = enableDomainProxy;
        return this;
    }
    public Boolean getEnableDomainProxy() {
        return this.enableDomainProxy;
    }

    public SaveSingleTaskForCreatingOrderActivateRequest setExpectedPunycode(String expectedPunycode) {
        this.expectedPunycode = expectedPunycode;
        return this;
    }
    public String getExpectedPunycode() {
        return this.expectedPunycode;
    }

    public SaveSingleTaskForCreatingOrderActivateRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SaveSingleTaskForCreatingOrderActivateRequest setPermitPremiumActivation(Boolean permitPremiumActivation) {
        this.permitPremiumActivation = permitPremiumActivation;
        return this;
    }
    public Boolean getPermitPremiumActivation() {
        return this.permitPremiumActivation;
    }

    public SaveSingleTaskForCreatingOrderActivateRequest setPostalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }
    public String getPostalCode() {
        return this.postalCode;
    }

    public SaveSingleTaskForCreatingOrderActivateRequest setPromotionNo(String promotionNo) {
        this.promotionNo = promotionNo;
        return this;
    }
    public String getPromotionNo() {
        return this.promotionNo;
    }

    public SaveSingleTaskForCreatingOrderActivateRequest setProvince(String province) {
        this.province = province;
        return this;
    }
    public String getProvince() {
        return this.province;
    }

    public SaveSingleTaskForCreatingOrderActivateRequest setRegistrantName(String registrantName) {
        this.registrantName = registrantName;
        return this;
    }
    public String getRegistrantName() {
        return this.registrantName;
    }

    public SaveSingleTaskForCreatingOrderActivateRequest setRegistrantOrganization(String registrantOrganization) {
        this.registrantOrganization = registrantOrganization;
        return this;
    }
    public String getRegistrantOrganization() {
        return this.registrantOrganization;
    }

    public SaveSingleTaskForCreatingOrderActivateRequest setRegistrantProfileId(Long registrantProfileId) {
        this.registrantProfileId = registrantProfileId;
        return this;
    }
    public Long getRegistrantProfileId() {
        return this.registrantProfileId;
    }

    public SaveSingleTaskForCreatingOrderActivateRequest setRegistrantType(String registrantType) {
        this.registrantType = registrantType;
        return this;
    }
    public String getRegistrantType() {
        return this.registrantType;
    }

    public SaveSingleTaskForCreatingOrderActivateRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public SaveSingleTaskForCreatingOrderActivateRequest setSubscriptionDuration(Integer subscriptionDuration) {
        this.subscriptionDuration = subscriptionDuration;
        return this;
    }
    public Integer getSubscriptionDuration() {
        return this.subscriptionDuration;
    }

    public SaveSingleTaskForCreatingOrderActivateRequest setTelArea(String telArea) {
        this.telArea = telArea;
        return this;
    }
    public String getTelArea() {
        return this.telArea;
    }

    public SaveSingleTaskForCreatingOrderActivateRequest setTelExt(String telExt) {
        this.telExt = telExt;
        return this;
    }
    public String getTelExt() {
        return this.telExt;
    }

    public SaveSingleTaskForCreatingOrderActivateRequest setTelephone(String telephone) {
        this.telephone = telephone;
        return this;
    }
    public String getTelephone() {
        return this.telephone;
    }

    public SaveSingleTaskForCreatingOrderActivateRequest setTrademarkDomainActivation(Boolean trademarkDomainActivation) {
        this.trademarkDomainActivation = trademarkDomainActivation;
        return this;
    }
    public Boolean getTrademarkDomainActivation() {
        return this.trademarkDomainActivation;
    }

    public SaveSingleTaskForCreatingOrderActivateRequest setUseCoupon(Boolean useCoupon) {
        this.useCoupon = useCoupon;
        return this;
    }
    public Boolean getUseCoupon() {
        return this.useCoupon;
    }

    public SaveSingleTaskForCreatingOrderActivateRequest setUsePromotion(Boolean usePromotion) {
        this.usePromotion = usePromotion;
        return this;
    }
    public Boolean getUsePromotion() {
        return this.usePromotion;
    }

    public SaveSingleTaskForCreatingOrderActivateRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public SaveSingleTaskForCreatingOrderActivateRequest setZhAddress(String zhAddress) {
        this.zhAddress = zhAddress;
        return this;
    }
    public String getZhAddress() {
        return this.zhAddress;
    }

    public SaveSingleTaskForCreatingOrderActivateRequest setZhCity(String zhCity) {
        this.zhCity = zhCity;
        return this;
    }
    public String getZhCity() {
        return this.zhCity;
    }

    public SaveSingleTaskForCreatingOrderActivateRequest setZhProvince(String zhProvince) {
        this.zhProvince = zhProvince;
        return this;
    }
    public String getZhProvince() {
        return this.zhProvince;
    }

    public SaveSingleTaskForCreatingOrderActivateRequest setZhRegistrantName(String zhRegistrantName) {
        this.zhRegistrantName = zhRegistrantName;
        return this;
    }
    public String getZhRegistrantName() {
        return this.zhRegistrantName;
    }

    public SaveSingleTaskForCreatingOrderActivateRequest setZhRegistrantOrganization(String zhRegistrantOrganization) {
        this.zhRegistrantOrganization = zhRegistrantOrganization;
        return this;
    }
    public String getZhRegistrantOrganization() {
        return this.zhRegistrantOrganization;
    }

}
