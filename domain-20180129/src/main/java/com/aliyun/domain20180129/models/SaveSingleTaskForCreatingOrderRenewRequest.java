// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveSingleTaskForCreatingOrderRenewRequest extends TeaModel {
    @NameInMap("UserClientIp")
    public String userClientIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("SubscriptionDuration")
    public Integer subscriptionDuration;

    @NameInMap("CurrentExpirationDate")
    public Long currentExpirationDate;

    @NameInMap("CouponNo")
    public String couponNo;

    @NameInMap("UseCoupon")
    public Boolean useCoupon;

    @NameInMap("PromotionNo")
    public String promotionNo;

    @NameInMap("UsePromotion")
    public Boolean usePromotion;

    public static SaveSingleTaskForCreatingOrderRenewRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveSingleTaskForCreatingOrderRenewRequest self = new SaveSingleTaskForCreatingOrderRenewRequest();
        return TeaModel.build(map, self);
    }

    public SaveSingleTaskForCreatingOrderRenewRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public SaveSingleTaskForCreatingOrderRenewRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SaveSingleTaskForCreatingOrderRenewRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SaveSingleTaskForCreatingOrderRenewRequest setSubscriptionDuration(Integer subscriptionDuration) {
        this.subscriptionDuration = subscriptionDuration;
        return this;
    }
    public Integer getSubscriptionDuration() {
        return this.subscriptionDuration;
    }

    public SaveSingleTaskForCreatingOrderRenewRequest setCurrentExpirationDate(Long currentExpirationDate) {
        this.currentExpirationDate = currentExpirationDate;
        return this;
    }
    public Long getCurrentExpirationDate() {
        return this.currentExpirationDate;
    }

    public SaveSingleTaskForCreatingOrderRenewRequest setCouponNo(String couponNo) {
        this.couponNo = couponNo;
        return this;
    }
    public String getCouponNo() {
        return this.couponNo;
    }

    public SaveSingleTaskForCreatingOrderRenewRequest setUseCoupon(Boolean useCoupon) {
        this.useCoupon = useCoupon;
        return this;
    }
    public Boolean getUseCoupon() {
        return this.useCoupon;
    }

    public SaveSingleTaskForCreatingOrderRenewRequest setPromotionNo(String promotionNo) {
        this.promotionNo = promotionNo;
        return this;
    }
    public String getPromotionNo() {
        return this.promotionNo;
    }

    public SaveSingleTaskForCreatingOrderRenewRequest setUsePromotion(Boolean usePromotion) {
        this.usePromotion = usePromotion;
        return this;
    }
    public Boolean getUsePromotion() {
        return this.usePromotion;
    }

}
