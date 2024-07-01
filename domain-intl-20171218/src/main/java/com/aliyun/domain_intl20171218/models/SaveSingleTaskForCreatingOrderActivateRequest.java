// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class SaveSingleTaskForCreatingOrderActivateRequest extends TeaModel {
    @NameInMap("Address")
    public String address;

    @NameInMap("AliyunDns")
    public Boolean aliyunDns;

    @NameInMap("City")
    public String city;

    @NameInMap("Country")
    public String country;

    @NameInMap("CouponNo")
    public String couponNo;

    @NameInMap("Dns1")
    public String dns1;

    @NameInMap("Dns2")
    public String dns2;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("Email")
    public String email;

    @NameInMap("EnableDomainProxy")
    public Boolean enableDomainProxy;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("PermitPremiumActivation")
    public Boolean permitPremiumActivation;

    @NameInMap("PostalCode")
    public String postalCode;

    @NameInMap("PromotionNo")
    public String promotionNo;

    @NameInMap("Province")
    public String province;

    @NameInMap("RegistrantName")
    public String registrantName;

    @NameInMap("RegistrantOrganization")
    public String registrantOrganization;

    @NameInMap("RegistrantProfileId")
    public Long registrantProfileId;

    @NameInMap("RegistrantType")
    public String registrantType;

    @NameInMap("SubscriptionDuration")
    public Integer subscriptionDuration;

    @NameInMap("TelArea")
    public String telArea;

    @NameInMap("TelExt")
    public String telExt;

    @NameInMap("Telephone")
    public String telephone;

    @NameInMap("TrademarkDomainActivation")
    public Boolean trademarkDomainActivation;

    @NameInMap("UseCoupon")
    public Boolean useCoupon;

    @NameInMap("UsePromotion")
    public Boolean usePromotion;

    @NameInMap("UserClientIp")
    public String userClientIp;

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

}
