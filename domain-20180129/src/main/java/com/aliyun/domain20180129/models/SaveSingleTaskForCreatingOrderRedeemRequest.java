// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveSingleTaskForCreatingOrderRedeemRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>123123</p>
     */
    @NameInMap("CouponNo")
    public String couponNo;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0000</p>
     */
    @NameInMap("CurrentExpirationDate")
    public Long currentExpirationDate;

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
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>123123</p>
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

    public static SaveSingleTaskForCreatingOrderRedeemRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveSingleTaskForCreatingOrderRedeemRequest self = new SaveSingleTaskForCreatingOrderRedeemRequest();
        return TeaModel.build(map, self);
    }

    public SaveSingleTaskForCreatingOrderRedeemRequest setCouponNo(String couponNo) {
        this.couponNo = couponNo;
        return this;
    }
    public String getCouponNo() {
        return this.couponNo;
    }

    public SaveSingleTaskForCreatingOrderRedeemRequest setCurrentExpirationDate(Long currentExpirationDate) {
        this.currentExpirationDate = currentExpirationDate;
        return this;
    }
    public Long getCurrentExpirationDate() {
        return this.currentExpirationDate;
    }

    public SaveSingleTaskForCreatingOrderRedeemRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SaveSingleTaskForCreatingOrderRedeemRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SaveSingleTaskForCreatingOrderRedeemRequest setPromotionNo(String promotionNo) {
        this.promotionNo = promotionNo;
        return this;
    }
    public String getPromotionNo() {
        return this.promotionNo;
    }

    public SaveSingleTaskForCreatingOrderRedeemRequest setUseCoupon(Boolean useCoupon) {
        this.useCoupon = useCoupon;
        return this;
    }
    public Boolean getUseCoupon() {
        return this.useCoupon;
    }

    public SaveSingleTaskForCreatingOrderRedeemRequest setUsePromotion(Boolean usePromotion) {
        this.usePromotion = usePromotion;
        return this;
    }
    public Boolean getUsePromotion() {
        return this.usePromotion;
    }

    public SaveSingleTaskForCreatingOrderRedeemRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
