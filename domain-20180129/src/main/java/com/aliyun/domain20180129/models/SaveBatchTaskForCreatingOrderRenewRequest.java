// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveBatchTaskForCreatingOrderRenewRequest extends TeaModel {
    /**
     * <p>The coupon ID.</p>
     * 
     * <strong>example:</strong>
     * <p>12312412</p>
     */
    @NameInMap("CouponNo")
    public String couponNo;

    /**
     * <p>The language of the error messages. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong>: Chinese.</p>
     * </li>
     * <li><p><strong>en</strong>: English.</p>
     * </li>
     * </ul>
     * <p>Default value: <strong>en</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The parameters for each domain name to be renewed.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("OrderRenewParam")
    public java.util.List<SaveBatchTaskForCreatingOrderRenewRequestOrderRenewParam> orderRenewParam;

    /**
     * <p>The promotion ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123123123</p>
     */
    @NameInMap("PromotionNo")
    public String promotionNo;

    /**
     * <p>Specifies whether to use a coupon. Valid values:</p>
     * <ul>
     * <li><p><strong>false</strong>: Do not use a coupon.</p>
     * </li>
     * <li><p><strong>true</strong>: Use a coupon.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("UseCoupon")
    public Boolean useCoupon;

    /**
     * <p>Specifies whether to use a promotion. Valid values:</p>
     * <ul>
     * <li><p><strong>false</strong>: Do not use a promotion.</p>
     * </li>
     * <li><p><strong>true</strong>: Use a promotion.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("UsePromotion")
    public Boolean usePromotion;

    /**
     * <p>The user\&quot;s IP address. You can set this parameter to <strong>127.0.0.1</strong>.</p>
     * 
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
         * <p>The current expiration date of the domain name, expressed in milliseconds since 00:00:00 UTC on January 1, 1970.</p>
         * 
         * <strong>example:</strong>
         * <p>1522080000000</p>
         */
        @NameInMap("CurrentExpirationDate")
        public Long currentExpirationDate;

        /**
         * <p>The domain name that you want to renew. You can obtain a list of your domain names by calling the <a href="https://help.aliyun.com/document_detail/67712.html">QueryDomainList</a> operation.</p>
         * 
         * <strong>example:</strong>
         * <p>Aliyun.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>Specifies whether to allow the renewal of premium domain names. Default value: false.</p>
         */
        @NameInMap("PermitPremiumRenew")
        public Boolean permitPremiumRenew;

        /**
         * <p>The renewal duration, in years. Default value: <strong>1</strong>. Valid values: <strong>1</strong> to <strong>10</strong>.</p>
         * 
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

        public SaveBatchTaskForCreatingOrderRenewRequestOrderRenewParam setPermitPremiumRenew(Boolean permitPremiumRenew) {
            this.permitPremiumRenew = permitPremiumRenew;
            return this;
        }
        public Boolean getPermitPremiumRenew() {
            return this.permitPremiumRenew;
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
