// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveSingleTaskForCreatingOrderActivateRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>chao yang qu</p>
     */
    @NameInMap("Address")
    public String address;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AliyunDns")
    public Boolean aliyunDns;

    /**
     * <strong>example:</strong>
     * <p>bei jing shi</p>
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
     * <p>123456</p>
     */
    @NameInMap("CouponNo")
    public String couponNo;

    /**
     * <strong>example:</strong>
     * <p>ns1.aliyun.com</p>
     */
    @NameInMap("Dns1")
    public String dns1;

    /**
     * <strong>example:</strong>
     * <p>ns2.aliyun.com</p>
     */
    @NameInMap("Dns2")
    public String dns2;

    /**
     * <p>This parameter is required.</p>
     * 
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
     * <p>false</p>
     */
    @NameInMap("EnableDomainProxy")
    public Boolean enableDomainProxy;

    /**
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("PermitPremiumActivation")
    public Boolean permitPremiumActivation;

    /**
     * <strong>example:</strong>
     * <p>1234567</p>
     */
    @NameInMap("PostalCode")
    public String postalCode;

    /**
     * <strong>example:</strong>
     * <p>123123</p>
     */
    @NameInMap("PromotionNo")
    public String promotionNo;

    /**
     * <strong>example:</strong>
     * <p>bei jing</p>
     */
    @NameInMap("Province")
    public String province;

    /**
     * <strong>example:</strong>
     * <p>ce shi</p>
     */
    @NameInMap("RegistrantName")
    public String registrantName;

    /**
     * <strong>example:</strong>
     * <p>ce shi</p>
     */
    @NameInMap("RegistrantOrganization")
    public String registrantOrganization;

    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("RegistrantProfileId")
    public Long registrantProfileId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RegistrantType")
    public String registrantType;

    /**
     * <strong>example:</strong>
     * <p>rg-XX</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SubscriptionDuration")
    public Integer subscriptionDuration;

    /**
     * <strong>example:</strong>
     * <p>86</p>
     */
    @NameInMap("TelArea")
    public String telArea;

    /**
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("TelExt")
    public String telExt;

    /**
     * <strong>example:</strong>
     * <p>12345678</p>
     */
    @NameInMap("Telephone")
    public String telephone;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("TrademarkDomainActivation")
    public Boolean trademarkDomainActivation;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("UseCoupon")
    public Boolean useCoupon;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("UsePromotion")
    public Boolean usePromotion;

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
