// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveBatchTaskForCreatingOrderRenewRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>12312412</p>
     */
    @NameInMap("CouponNo")
    public String couponNo;

    /**
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OrderRenewParam")
    public java.util.List<SaveBatchTaskForCreatingOrderRenewRequestOrderRenewParam> orderRenewParam;

    /**
     * <strong>example:</strong>
     * <p>123123123</p>
     */
    @NameInMap("PromotionNo")
    public String promotionNo;

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

    public static SaveBatchTaskForCreatingOrderRenewRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveBatchTaskForCreatingOrderRenewRequest self = new SaveBatchTaskForCreatingOrderRenewRequest();
        return TeaModel.build(map, self);
    }

    public SaveBatchTaskForCreatingOrderRenewRequest setCouponNo(String couponNo) {
        this.couponNo = couponNo;
        return this;
    }
    public String getCouponNo() {
        return this.couponNo;
    }

    public SaveBatchTaskForCreatingOrderRenewRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SaveBatchTaskForCreatingOrderRenewRequest setOrderRenewParam(java.util.List<SaveBatchTaskForCreatingOrderRenewRequestOrderRenewParam> orderRenewParam) {
        this.orderRenewParam = orderRenewParam;
        return this;
    }
    public java.util.List<SaveBatchTaskForCreatingOrderRenewRequestOrderRenewParam> getOrderRenewParam() {
        return this.orderRenewParam;
    }

    public SaveBatchTaskForCreatingOrderRenewRequest setPromotionNo(String promotionNo) {
        this.promotionNo = promotionNo;
        return this;
    }
    public String getPromotionNo() {
        return this.promotionNo;
    }

    public SaveBatchTaskForCreatingOrderRenewRequest setUseCoupon(Boolean useCoupon) {
        this.useCoupon = useCoupon;
        return this;
    }
    public Boolean getUseCoupon() {
        return this.useCoupon;
    }

    public SaveBatchTaskForCreatingOrderRenewRequest setUsePromotion(Boolean usePromotion) {
        this.usePromotion = usePromotion;
        return this;
    }
    public Boolean getUsePromotion() {
        return this.usePromotion;
    }

    public SaveBatchTaskForCreatingOrderRenewRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public static class SaveBatchTaskForCreatingOrderRenewRequestOrderRenewParam extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1522080000000</p>
         */
        @NameInMap("CurrentExpirationDate")
        public Long currentExpirationDate;

        /**
         * <strong>example:</strong>
         * <p>Aliyun.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SubscriptionDuration")
        public Integer subscriptionDuration;

        public static SaveBatchTaskForCreatingOrderRenewRequestOrderRenewParam build(java.util.Map<String, ?> map) throws Exception {
            SaveBatchTaskForCreatingOrderRenewRequestOrderRenewParam self = new SaveBatchTaskForCreatingOrderRenewRequestOrderRenewParam();
            return TeaModel.build(map, self);
        }

        public SaveBatchTaskForCreatingOrderRenewRequestOrderRenewParam setCurrentExpirationDate(Long currentExpirationDate) {
            this.currentExpirationDate = currentExpirationDate;
            return this;
        }
        public Long getCurrentExpirationDate() {
            return this.currentExpirationDate;
        }

        public SaveBatchTaskForCreatingOrderRenewRequestOrderRenewParam setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public SaveBatchTaskForCreatingOrderRenewRequestOrderRenewParam setSubscriptionDuration(Integer subscriptionDuration) {
            this.subscriptionDuration = subscriptionDuration;
            return this;
        }
        public Integer getSubscriptionDuration() {
            return this.subscriptionDuration;
        }

    }

}
