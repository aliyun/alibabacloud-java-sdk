// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveBatchTaskForCreatingOrderActivateRequest extends TeaModel {
    @NameInMap("CouponNo")
    public String couponNo;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("OrderActivateParam")
    public java.util.List<SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam> orderActivateParam;

    @NameInMap("PromotionNo")
    public String promotionNo;

    @NameInMap("UseCoupon")
    public Boolean useCoupon;

    @NameInMap("UsePromotion")
    public Boolean usePromotion;

    @NameInMap("UserClientIp")
    public String userClientIp;

    public static SaveBatchTaskForCreatingOrderActivateRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveBatchTaskForCreatingOrderActivateRequest self = new SaveBatchTaskForCreatingOrderActivateRequest();
        return TeaModel.build(map, self);
    }

    public SaveBatchTaskForCreatingOrderActivateRequest setCouponNo(String couponNo) {
        this.couponNo = couponNo;
        return this;
    }
    public String getCouponNo() {
        return this.couponNo;
    }

    public SaveBatchTaskForCreatingOrderActivateRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SaveBatchTaskForCreatingOrderActivateRequest setOrderActivateParam(java.util.List<SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam> orderActivateParam) {
        this.orderActivateParam = orderActivateParam;
        return this;
    }
    public java.util.List<SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam> getOrderActivateParam() {
        return this.orderActivateParam;
    }

    public SaveBatchTaskForCreatingOrderActivateRequest setPromotionNo(String promotionNo) {
        this.promotionNo = promotionNo;
        return this;
    }
    public String getPromotionNo() {
        return this.promotionNo;
    }

    public SaveBatchTaskForCreatingOrderActivateRequest setUseCoupon(Boolean useCoupon) {
        this.useCoupon = useCoupon;
        return this;
    }
    public Boolean getUseCoupon() {
        return this.useCoupon;
    }

    public SaveBatchTaskForCreatingOrderActivateRequest setUsePromotion(Boolean usePromotion) {
        this.usePromotion = usePromotion;
        return this;
    }
    public Boolean getUsePromotion() {
        return this.usePromotion;
    }

    public SaveBatchTaskForCreatingOrderActivateRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public static class SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam extends TeaModel {
        @NameInMap("Address")
        public String address;

        @NameInMap("AliyunDns")
        public Boolean aliyunDns;

        @NameInMap("City")
        public String city;

        @NameInMap("Country")
        public String country;

        @NameInMap("Dns1")
        public String dns1;

        @NameInMap("Dns2")
        public String dns2;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("Email")
        public String email;

        @NameInMap("EnableDomainProxy")
        public Boolean enableDomainProxy;

        @NameInMap("PermitPremiumActivation")
        public Boolean permitPremiumActivation;

        @NameInMap("PostalCode")
        public String postalCode;

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

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

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

        public static SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam build(java.util.Map<String, ?> map) throws Exception {
            SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam self = new SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam();
            return TeaModel.build(map, self);
        }

        public SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam setAliyunDns(Boolean aliyunDns) {
            this.aliyunDns = aliyunDns;
            return this;
        }
        public Boolean getAliyunDns() {
            return this.aliyunDns;
        }

        public SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam setCountry(String country) {
            this.country = country;
            return this;
        }
        public String getCountry() {
            return this.country;
        }

        public SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam setDns1(String dns1) {
            this.dns1 = dns1;
            return this;
        }
        public String getDns1() {
            return this.dns1;
        }

        public SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam setDns2(String dns2) {
            this.dns2 = dns2;
            return this;
        }
        public String getDns2() {
            return this.dns2;
        }

        public SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam setEnableDomainProxy(Boolean enableDomainProxy) {
            this.enableDomainProxy = enableDomainProxy;
            return this;
        }
        public Boolean getEnableDomainProxy() {
            return this.enableDomainProxy;
        }

        public SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam setPermitPremiumActivation(Boolean permitPremiumActivation) {
            this.permitPremiumActivation = permitPremiumActivation;
            return this;
        }
        public Boolean getPermitPremiumActivation() {
            return this.permitPremiumActivation;
        }

        public SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam setPostalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
        }
        public String getPostalCode() {
            return this.postalCode;
        }

        public SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

        public SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam setRegistrantName(String registrantName) {
            this.registrantName = registrantName;
            return this;
        }
        public String getRegistrantName() {
            return this.registrantName;
        }

        public SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam setRegistrantOrganization(String registrantOrganization) {
            this.registrantOrganization = registrantOrganization;
            return this;
        }
        public String getRegistrantOrganization() {
            return this.registrantOrganization;
        }

        public SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam setRegistrantProfileId(Long registrantProfileId) {
            this.registrantProfileId = registrantProfileId;
            return this;
        }
        public Long getRegistrantProfileId() {
            return this.registrantProfileId;
        }

        public SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam setRegistrantType(String registrantType) {
            this.registrantType = registrantType;
            return this;
        }
        public String getRegistrantType() {
            return this.registrantType;
        }

        public SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam setSubscriptionDuration(Integer subscriptionDuration) {
            this.subscriptionDuration = subscriptionDuration;
            return this;
        }
        public Integer getSubscriptionDuration() {
            return this.subscriptionDuration;
        }

        public SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam setTelArea(String telArea) {
            this.telArea = telArea;
            return this;
        }
        public String getTelArea() {
            return this.telArea;
        }

        public SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam setTelExt(String telExt) {
            this.telExt = telExt;
            return this;
        }
        public String getTelExt() {
            return this.telExt;
        }

        public SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam setTelephone(String telephone) {
            this.telephone = telephone;
            return this;
        }
        public String getTelephone() {
            return this.telephone;
        }

        public SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam setTrademarkDomainActivation(Boolean trademarkDomainActivation) {
            this.trademarkDomainActivation = trademarkDomainActivation;
            return this;
        }
        public Boolean getTrademarkDomainActivation() {
            return this.trademarkDomainActivation;
        }

        public SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam setZhAddress(String zhAddress) {
            this.zhAddress = zhAddress;
            return this;
        }
        public String getZhAddress() {
            return this.zhAddress;
        }

        public SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam setZhCity(String zhCity) {
            this.zhCity = zhCity;
            return this;
        }
        public String getZhCity() {
            return this.zhCity;
        }

        public SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam setZhProvince(String zhProvince) {
            this.zhProvince = zhProvince;
            return this;
        }
        public String getZhProvince() {
            return this.zhProvince;
        }

        public SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam setZhRegistrantName(String zhRegistrantName) {
            this.zhRegistrantName = zhRegistrantName;
            return this;
        }
        public String getZhRegistrantName() {
            return this.zhRegistrantName;
        }

        public SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam setZhRegistrantOrganization(String zhRegistrantOrganization) {
            this.zhRegistrantOrganization = zhRegistrantOrganization;
            return this;
        }
        public String getZhRegistrantOrganization() {
            return this.zhRegistrantOrganization;
        }

    }

}
