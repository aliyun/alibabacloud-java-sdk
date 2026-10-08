// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveSingleTaskForCreatingOrderRenewRequest extends TeaModel {
    /**
     * <p>The coupon number.</p>
     * 
     * <strong>example:</strong>
     * <p>123123</p>
     */
    @NameInMap("CouponNo")
    public String couponNo;

    /**
     * <p>The current expiration date of the domain name. This value is a Unix timestamp in milliseconds, representing the time elapsed since 00:00:00 UTC on January 1, 1970.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1522080000000</p>
     */
    @NameInMap("CurrentExpirationDate")
    public Long currentExpirationDate;

    /**
     * <p>The domain name to renew.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The language of error messages returned by the API. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong>: Chinese.</p>
     * </li>
     * <li><p><strong>en</strong>: English.</p>
     * </li>
     * </ul>
     * <p>The default value is <strong>en</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    @NameInMap("PermitPremiumRenew")
    public Boolean permitPremiumRenew;

    /**
     * <p>The promotion number.</p>
     * 
     * <strong>example:</strong>
     * <p>123132</p>
     */
    @NameInMap("PromotionNo")
    public String promotionNo;

    /**
     * <p>The renewal period, in years. The value must be an integer from <strong>1</strong> to <strong>10</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SubscriptionDuration")
    public Integer subscriptionDuration;

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

    public static SaveSingleTaskForCreatingOrderRenewRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveSingleTaskForCreatingOrderRenewRequest self = new SaveSingleTaskForCreatingOrderRenewRequest();
        return TeaModel.build(map, self);
    }

    public SaveSingleTaskForCreatingOrderRenewRequest setCouponNo(String couponNo) {
        this.couponNo = couponNo;
        return this;
    }
    public String getCouponNo() {
        return this.couponNo;
    }

    public SaveSingleTaskForCreatingOrderRenewRequest setCurrentExpirationDate(Long currentExpirationDate) {
        this.currentExpirationDate = currentExpirationDate;
        return this;
    }
    public Long getCurrentExpirationDate() {
        return this.currentExpirationDate;
    }

    public SaveSingleTaskForCreatingOrderRenewRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SaveSingleTaskForCreatingOrderRenewRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SaveSingleTaskForCreatingOrderRenewRequest setPermitPremiumRenew(Boolean permitPremiumRenew) {
        this.permitPremiumRenew = permitPremiumRenew;
        return this;
    }
    public Boolean getPermitPremiumRenew() {
        return this.permitPremiumRenew;
    }

    public SaveSingleTaskForCreatingOrderRenewRequest setPromotionNo(String promotionNo) {
        this.promotionNo = promotionNo;
        return this;
    }
    public String getPromotionNo() {
        return this.promotionNo;
    }

    public SaveSingleTaskForCreatingOrderRenewRequest setSubscriptionDuration(Integer subscriptionDuration) {
        this.subscriptionDuration = subscriptionDuration;
        return this;
    }
    public Integer getSubscriptionDuration() {
        return this.subscriptionDuration;
    }

    public SaveSingleTaskForCreatingOrderRenewRequest setUseCoupon(Boolean useCoupon) {
        this.useCoupon = useCoupon;
        return this;
    }
    public Boolean getUseCoupon() {
        return this.useCoupon;
    }

    public SaveSingleTaskForCreatingOrderRenewRequest setUsePromotion(Boolean usePromotion) {
        this.usePromotion = usePromotion;
        return this;
    }
    public Boolean getUsePromotion() {
        return this.usePromotion;
    }

    public SaveSingleTaskForCreatingOrderRenewRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
