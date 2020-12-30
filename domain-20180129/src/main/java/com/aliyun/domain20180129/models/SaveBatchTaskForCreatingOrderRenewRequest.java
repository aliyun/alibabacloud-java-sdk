// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveBatchTaskForCreatingOrderRenewRequest extends TeaModel {
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

    @NameInMap("OrderRenewParam")
    public java.util.List<SaveBatchTaskForCreatingOrderRenewRequestOrderRenewParam> orderRenewParam;

    public static SaveBatchTaskForCreatingOrderRenewRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveBatchTaskForCreatingOrderRenewRequest self = new SaveBatchTaskForCreatingOrderRenewRequest();
        return TeaModel.build(map, self);
    }

    public SaveBatchTaskForCreatingOrderRenewRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public SaveBatchTaskForCreatingOrderRenewRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SaveBatchTaskForCreatingOrderRenewRequest setCouponNo(String couponNo) {
        this.couponNo = couponNo;
        return this;
    }
    public String getCouponNo() {
        return this.couponNo;
    }

    public SaveBatchTaskForCreatingOrderRenewRequest setUseCoupon(Boolean useCoupon) {
        this.useCoupon = useCoupon;
        return this;
    }
    public Boolean getUseCoupon() {
        return this.useCoupon;
    }

    public SaveBatchTaskForCreatingOrderRenewRequest setPromotionNo(String promotionNo) {
        this.promotionNo = promotionNo;
        return this;
    }
    public String getPromotionNo() {
        return this.promotionNo;
    }

    public SaveBatchTaskForCreatingOrderRenewRequest setUsePromotion(Boolean usePromotion) {
        this.usePromotion = usePromotion;
        return this;
    }
    public Boolean getUsePromotion() {
        return this.usePromotion;
    }

    public SaveBatchTaskForCreatingOrderRenewRequest setOrderRenewParam(java.util.List<SaveBatchTaskForCreatingOrderRenewRequestOrderRenewParam> orderRenewParam) {
        this.orderRenewParam = orderRenewParam;
        return this;
    }
    public java.util.List<SaveBatchTaskForCreatingOrderRenewRequestOrderRenewParam> getOrderRenewParam() {
        return this.orderRenewParam;
    }

    public static class SaveBatchTaskForCreatingOrderRenewRequestOrderRenewParam extends TeaModel {
        @NameInMap("SubscriptionDuration")
        public Integer subscriptionDuration;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("CurrentExpirationDate")
        public Long currentExpirationDate;

        public static SaveBatchTaskForCreatingOrderRenewRequestOrderRenewParam build(java.util.Map<String, ?> map) throws Exception {
            SaveBatchTaskForCreatingOrderRenewRequestOrderRenewParam self = new SaveBatchTaskForCreatingOrderRenewRequestOrderRenewParam();
            return TeaModel.build(map, self);
        }

        public SaveBatchTaskForCreatingOrderRenewRequestOrderRenewParam setSubscriptionDuration(Integer subscriptionDuration) {
            this.subscriptionDuration = subscriptionDuration;
            return this;
        }
        public Integer getSubscriptionDuration() {
            return this.subscriptionDuration;
        }

        public SaveBatchTaskForCreatingOrderRenewRequestOrderRenewParam setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public SaveBatchTaskForCreatingOrderRenewRequestOrderRenewParam setCurrentExpirationDate(Long currentExpirationDate) {
            this.currentExpirationDate = currentExpirationDate;
            return this;
        }
        public Long getCurrentExpirationDate() {
            return this.currentExpirationDate;
        }

    }

}
