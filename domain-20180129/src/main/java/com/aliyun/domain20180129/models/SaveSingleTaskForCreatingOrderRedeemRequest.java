// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveSingleTaskForCreatingOrderRedeemRequest extends TeaModel {
    @NameInMap("UserClientIp")
    public String userClientIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("DomainName")
    public String domainName;

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

    public static SaveSingleTaskForCreatingOrderRedeemRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveSingleTaskForCreatingOrderRedeemRequest self = new SaveSingleTaskForCreatingOrderRedeemRequest();
        return TeaModel.build(map, self);
    }

    public SaveSingleTaskForCreatingOrderRedeemRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public SaveSingleTaskForCreatingOrderRedeemRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SaveSingleTaskForCreatingOrderRedeemRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SaveSingleTaskForCreatingOrderRedeemRequest setCurrentExpirationDate(Long currentExpirationDate) {
        this.currentExpirationDate = currentExpirationDate;
        return this;
    }
    public Long getCurrentExpirationDate() {
        return this.currentExpirationDate;
    }

    public SaveSingleTaskForCreatingOrderRedeemRequest setCouponNo(String couponNo) {
        this.couponNo = couponNo;
        return this;
    }
    public String getCouponNo() {
        return this.couponNo;
    }

    public SaveSingleTaskForCreatingOrderRedeemRequest setUseCoupon(Boolean useCoupon) {
        this.useCoupon = useCoupon;
        return this;
    }
    public Boolean getUseCoupon() {
        return this.useCoupon;
    }

    public SaveSingleTaskForCreatingOrderRedeemRequest setPromotionNo(String promotionNo) {
        this.promotionNo = promotionNo;
        return this;
    }
    public String getPromotionNo() {
        return this.promotionNo;
    }

    public SaveSingleTaskForCreatingOrderRedeemRequest setUsePromotion(Boolean usePromotion) {
        this.usePromotion = usePromotion;
        return this;
    }
    public Boolean getUsePromotion() {
        return this.usePromotion;
    }

}
