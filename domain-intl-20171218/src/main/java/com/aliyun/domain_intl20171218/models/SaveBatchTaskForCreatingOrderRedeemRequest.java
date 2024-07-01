// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class SaveBatchTaskForCreatingOrderRedeemRequest extends TeaModel {
    @NameInMap("CouponNo")
    public String couponNo;

    @NameInMap("Lang")
    public String lang;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OrderRedeemParam")
    public java.util.List<SaveBatchTaskForCreatingOrderRedeemRequestOrderRedeemParam> orderRedeemParam;

    @NameInMap("PromotionNo")
    public String promotionNo;

    @NameInMap("UseCoupon")
    public Boolean useCoupon;

    @NameInMap("UsePromotion")
    public Boolean usePromotion;

    @NameInMap("UserClientIp")
    public String userClientIp;

    public static SaveBatchTaskForCreatingOrderRedeemRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveBatchTaskForCreatingOrderRedeemRequest self = new SaveBatchTaskForCreatingOrderRedeemRequest();
        return TeaModel.build(map, self);
    }

    public SaveBatchTaskForCreatingOrderRedeemRequest setCouponNo(String couponNo) {
        this.couponNo = couponNo;
        return this;
    }
    public String getCouponNo() {
        return this.couponNo;
    }

    public SaveBatchTaskForCreatingOrderRedeemRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SaveBatchTaskForCreatingOrderRedeemRequest setOrderRedeemParam(java.util.List<SaveBatchTaskForCreatingOrderRedeemRequestOrderRedeemParam> orderRedeemParam) {
        this.orderRedeemParam = orderRedeemParam;
        return this;
    }
    public java.util.List<SaveBatchTaskForCreatingOrderRedeemRequestOrderRedeemParam> getOrderRedeemParam() {
        return this.orderRedeemParam;
    }

    public SaveBatchTaskForCreatingOrderRedeemRequest setPromotionNo(String promotionNo) {
        this.promotionNo = promotionNo;
        return this;
    }
    public String getPromotionNo() {
        return this.promotionNo;
    }

    public SaveBatchTaskForCreatingOrderRedeemRequest setUseCoupon(Boolean useCoupon) {
        this.useCoupon = useCoupon;
        return this;
    }
    public Boolean getUseCoupon() {
        return this.useCoupon;
    }

    public SaveBatchTaskForCreatingOrderRedeemRequest setUsePromotion(Boolean usePromotion) {
        this.usePromotion = usePromotion;
        return this;
    }
    public Boolean getUsePromotion() {
        return this.usePromotion;
    }

    public SaveBatchTaskForCreatingOrderRedeemRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public static class SaveBatchTaskForCreatingOrderRedeemRequestOrderRedeemParam extends TeaModel {
        @NameInMap("CurrentExpirationDate")
        public Long currentExpirationDate;

        @NameInMap("DomainName")
        public String domainName;

        public static SaveBatchTaskForCreatingOrderRedeemRequestOrderRedeemParam build(java.util.Map<String, ?> map) throws Exception {
            SaveBatchTaskForCreatingOrderRedeemRequestOrderRedeemParam self = new SaveBatchTaskForCreatingOrderRedeemRequestOrderRedeemParam();
            return TeaModel.build(map, self);
        }

        public SaveBatchTaskForCreatingOrderRedeemRequestOrderRedeemParam setCurrentExpirationDate(Long currentExpirationDate) {
            this.currentExpirationDate = currentExpirationDate;
            return this;
        }
        public Long getCurrentExpirationDate() {
            return this.currentExpirationDate;
        }

        public SaveBatchTaskForCreatingOrderRedeemRequestOrderRedeemParam setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

    }

}
