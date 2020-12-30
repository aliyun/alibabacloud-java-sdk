// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveBatchTaskForCreatingOrderActivateRequest extends TeaModel {
    @NameInMap("UserClientIp")
    public String userClientIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("CouponNo")
    public String couponNo;

    @NameInMap("UseCoupon")
    public Boolean useCoupon;

    @NameInMap("PromotionNo")
    public String promotionNo;

    @NameInMap("UsePromotion")
    public Boolean usePromotion;

    @NameInMap("OrderActivateParam")
    public java.util.List<SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam> orderActivateParam;

    public static SaveBatchTaskForCreatingOrderActivateRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveBatchTaskForCreatingOrderActivateRequest self = new SaveBatchTaskForCreatingOrderActivateRequest();
        return TeaModel.build(map, self);
    }

    public SaveBatchTaskForCreatingOrderActivateRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public SaveBatchTaskForCreatingOrderActivateRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SaveBatchTaskForCreatingOrderActivateRequest setCouponNo(String couponNo) {
        this.couponNo = couponNo;
        return this;
    }
    public String getCouponNo() {
        return this.couponNo;
    }

    public SaveBatchTaskForCreatingOrderActivateRequest setUseCoupon(Boolean useCoupon) {
        this.useCoupon = useCoupon;
        return this;
    }
    public Boolean getUseCoupon() {
        return this.useCoupon;
    }

    public SaveBatchTaskForCreatingOrderActivateRequest setPromotionNo(String promotionNo) {
        this.promotionNo = promotionNo;
        return this;
    }
    public String getPromotionNo() {
        return this.promotionNo;
    }

    public SaveBatchTaskForCreatingOrderActivateRequest setUsePromotion(Boolean usePromotion) {
        this.usePromotion = usePromotion;
        return this;
    }
    public Boolean getUsePromotion() {
        return this.usePromotion;
    }

    public SaveBatchTaskForCreatingOrderActivateRequest setOrderActivateParam(java.util.List<SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam> orderActivateParam) {
        this.orderActivateParam = orderActivateParam;
        return this;
    }
    public java.util.List<SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam> getOrderActivateParam() {
        return this.orderActivateParam;
    }

    public static class SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam extends TeaModel {
        @NameInMap("TelExt")
        public String telExt;

        @NameInMap("AliyunDns")
        public Boolean aliyunDns;

        @NameInMap("PermitPremiumActivation")
        public Boolean permitPremiumActivation;

        @NameInMap("ZhProvince")
        public String zhProvince;

        @NameInMap("Telephone")
        public String telephone;

        @NameInMap("RegistrantOrganization")
        public String registrantOrganization;

        @NameInMap("City")
        public String city;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("ZhCity")
        public String zhCity;

        @NameInMap("Dns1")
        public String dns1;

        @NameInMap("TelArea")
        public String telArea;

        @NameInMap("Address")
        public String address;

        @NameInMap("EnableDomainProxy")
        public Boolean enableDomainProxy;

        @NameInMap("PostalCode")
        public String postalCode;

        @NameInMap("RegistrantProfileId")
        public Long registrantProfileId;

        @NameInMap("ZhRegistrantOrganization")
        public String zhRegistrantOrganization;

        @NameInMap("TrademarkDomainActivation")
        public Boolean trademarkDomainActivation;

        @NameInMap("Dns2")
        public String dns2;

        @NameInMap("ZhRegistrantName")
        public String zhRegistrantName;

        @NameInMap("Email")
        public String email;

        @NameInMap("RegistrantType")
        public String registrantType;

        @NameInMap("Country")
        public String country;

        @NameInMap("RegistrantName")
        public String registrantName;

        @NameInMap("SubscriptionDuration")
        public Integer subscriptionDuration;

        @NameInMap("ZhAddress")
        public String zhAddress;

        @NameInMap("Province")
        public String province;

        public static SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam build(java.util.Map<String, ?> map) throws Exception {
            SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam self = new SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam();
            return TeaModel.build(map, self);
        }

        public SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam setTelExt(String telExt) {
            this.telExt = telExt;
            return this;
        }
        public String getTelExt() {
            return this.telExt;
        }

        public SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam setAliyunDns(Boolean aliyunDns) {
            this.aliyunDns = aliyunDns;
            return this;
        }
        public Boolean getAliyunDns() {
            return this.aliyunDns;
        }

        public SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam setPermitPremiumActivation(Boolean permitPremiumActivation) {
            this.permitPremiumActivation = permitPremiumActivation;
            return this;
        }
        public Boolean getPermitPremiumActivation() {
            return this.permitPremiumActivation;
        }

        public SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam setZhProvince(String zhProvince) {
            this.zhProvince = zhProvince;
            return this;
        }
        public String getZhProvince() {
            return this.zhProvince;
        }

        public SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam setTelephone(String telephone) {
            this.telephone = telephone;
            return this;
        }
        public String getTelephone() {
            return this.telephone;
        }

        public SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam setRegistrantOrganization(String registrantOrganization) {
            this.registrantOrganization = registrantOrganization;
            return this;
        }
        public String getRegistrantOrganization() {
            return this.registrantOrganization;
        }

        public SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam setZhCity(String zhCity) {
            this.zhCity = zhCity;
            return this;
        }
        public String getZhCity() {
            return this.zhCity;
        }

        public SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam setDns1(String dns1) {
            this.dns1 = dns1;
            return this;
        }
        public String getDns1() {
            return this.dns1;
        }

        public SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam setTelArea(String telArea) {
            this.telArea = telArea;
            return this;
        }
        public String getTelArea() {
            return this.telArea;
        }

        public SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam setEnableDomainProxy(Boolean enableDomainProxy) {
            this.enableDomainProxy = enableDomainProxy;
            return this;
        }
        public Boolean getEnableDomainProxy() {
            return this.enableDomainProxy;
        }

        public SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam setPostalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
        }
        public String getPostalCode() {
            return this.postalCode;
        }

        public SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam setRegistrantProfileId(Long registrantProfileId) {
            this.registrantProfileId = registrantProfileId;
            return this;
        }
        public Long getRegistrantProfileId() {
            return this.registrantProfileId;
        }

        public SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam setZhRegistrantOrganization(String zhRegistrantOrganization) {
            this.zhRegistrantOrganization = zhRegistrantOrganization;
            return this;
        }
        public String getZhRegistrantOrganization() {
            return this.zhRegistrantOrganization;
        }

        public SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam setTrademarkDomainActivation(Boolean trademarkDomainActivation) {
            this.trademarkDomainActivation = trademarkDomainActivation;
            return this;
        }
        public Boolean getTrademarkDomainActivation() {
            return this.trademarkDomainActivation;
        }

        public SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam setDns2(String dns2) {
            this.dns2 = dns2;
            return this;
        }
        public String getDns2() {
            return this.dns2;
        }

        public SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam setZhRegistrantName(String zhRegistrantName) {
            this.zhRegistrantName = zhRegistrantName;
            return this;
        }
        public String getZhRegistrantName() {
            return this.zhRegistrantName;
        }

        public SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam setRegistrantType(String registrantType) {
            this.registrantType = registrantType;
            return this;
        }
        public String getRegistrantType() {
            return this.registrantType;
        }

        public SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam setCountry(String country) {
            this.country = country;
            return this;
        }
        public String getCountry() {
            return this.country;
        }

        public SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam setRegistrantName(String registrantName) {
            this.registrantName = registrantName;
            return this;
        }
        public String getRegistrantName() {
            return this.registrantName;
        }

        public SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam setSubscriptionDuration(Integer subscriptionDuration) {
            this.subscriptionDuration = subscriptionDuration;
            return this;
        }
        public Integer getSubscriptionDuration() {
            return this.subscriptionDuration;
        }

        public SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam setZhAddress(String zhAddress) {
            this.zhAddress = zhAddress;
            return this;
        }
        public String getZhAddress() {
            return this.zhAddress;
        }

        public SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

    }

}
