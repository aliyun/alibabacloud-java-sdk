// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveBatchTaskForCreatingOrderRedeemRequest extends TeaModel {
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

    @NameInMap("OrderRedeemParam")
    public java.util.List<SaveBatchTaskForCreatingOrderRedeemRequestOrderRedeemParam> orderRedeemParam;

    public static SaveBatchTaskForCreatingOrderRedeemRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveBatchTaskForCreatingOrderRedeemRequest self = new SaveBatchTaskForCreatingOrderRedeemRequest();
        return TeaModel.build(map, self);
    }

    public SaveBatchTaskForCreatingOrderRedeemRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public SaveBatchTaskForCreatingOrderRedeemRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SaveBatchTaskForCreatingOrderRedeemRequest setCouponNo(String couponNo) {
        this.couponNo = couponNo;
        return this;
    }
    public String getCouponNo() {
        return this.couponNo;
    }

    public SaveBatchTaskForCreatingOrderRedeemRequest setUseCoupon(Boolean useCoupon) {
        this.useCoupon = useCoupon;
        return this;
    }
    public Boolean getUseCoupon() {
        return this.useCoupon;
    }

    public SaveBatchTaskForCreatingOrderRedeemRequest setPromotionNo(String promotionNo) {
        this.promotionNo = promotionNo;
        return this;
    }
    public String getPromotionNo() {
        return this.promotionNo;
    }

    public SaveBatchTaskForCreatingOrderRedeemRequest setUsePromotion(Boolean usePromotion) {
        this.usePromotion = usePromotion;
        return this;
    }
    public Boolean getUsePromotion() {
        return this.usePromotion;
    }

    public SaveBatchTaskForCreatingOrderRedeemRequest setOrderRedeemParam(java.util.List<SaveBatchTaskForCreatingOrderRedeemRequestOrderRedeemParam> orderRedeemParam) {
        this.orderRedeemParam = orderRedeemParam;
        return this;
    }
    public java.util.List<SaveBatchTaskForCreatingOrderRedeemRequestOrderRedeemParam> getOrderRedeemParam() {
        return this.orderRedeemParam;
    }

    public static class SaveBatchTaskForCreatingOrderRedeemRequestOrderRedeemParam extends TeaModel {
        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("CurrentExpirationDate")
        public Long currentExpirationDate;

        public static SaveBatchTaskForCreatingOrderRedeemRequestOrderRedeemParam build(java.util.Map<String, ?> map) throws Exception {
            SaveBatchTaskForCreatingOrderRedeemRequestOrderRedeemParam self = new SaveBatchTaskForCreatingOrderRedeemRequestOrderRedeemParam();
            return TeaModel.build(map, self);
        }

        public SaveBatchTaskForCreatingOrderRedeemRequestOrderRedeemParam setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public SaveBatchTaskForCreatingOrderRedeemRequestOrderRedeemParam setCurrentExpirationDate(Long currentExpirationDate) {
            this.currentExpirationDate = currentExpirationDate;
            return this;
        }
        public Long getCurrentExpirationDate() {
            return this.currentExpirationDate;
        }

    }

}
