// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class SaveBatchTaskForCreatingOrderTransferRequest extends TeaModel {
    @NameInMap("CouponNo")
    public String couponNo;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("OrderTransferParam")
    public java.util.List<SaveBatchTaskForCreatingOrderTransferRequestOrderTransferParam> orderTransferParam;

    @NameInMap("PromotionNo")
    public String promotionNo;

    @NameInMap("UseCoupon")
    public Boolean useCoupon;

    @NameInMap("UsePromotion")
    public Boolean usePromotion;

    @NameInMap("UserClientIp")
    public String userClientIp;

    public static SaveBatchTaskForCreatingOrderTransferRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveBatchTaskForCreatingOrderTransferRequest self = new SaveBatchTaskForCreatingOrderTransferRequest();
        return TeaModel.build(map, self);
    }

    public SaveBatchTaskForCreatingOrderTransferRequest setCouponNo(String couponNo) {
        this.couponNo = couponNo;
        return this;
    }
    public String getCouponNo() {
        return this.couponNo;
    }

    public SaveBatchTaskForCreatingOrderTransferRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SaveBatchTaskForCreatingOrderTransferRequest setOrderTransferParam(java.util.List<SaveBatchTaskForCreatingOrderTransferRequestOrderTransferParam> orderTransferParam) {
        this.orderTransferParam = orderTransferParam;
        return this;
    }
    public java.util.List<SaveBatchTaskForCreatingOrderTransferRequestOrderTransferParam> getOrderTransferParam() {
        return this.orderTransferParam;
    }

    public SaveBatchTaskForCreatingOrderTransferRequest setPromotionNo(String promotionNo) {
        this.promotionNo = promotionNo;
        return this;
    }
    public String getPromotionNo() {
        return this.promotionNo;
    }

    public SaveBatchTaskForCreatingOrderTransferRequest setUseCoupon(Boolean useCoupon) {
        this.useCoupon = useCoupon;
        return this;
    }
    public Boolean getUseCoupon() {
        return this.useCoupon;
    }

    public SaveBatchTaskForCreatingOrderTransferRequest setUsePromotion(Boolean usePromotion) {
        this.usePromotion = usePromotion;
        return this;
    }
    public Boolean getUsePromotion() {
        return this.usePromotion;
    }

    public SaveBatchTaskForCreatingOrderTransferRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public static class SaveBatchTaskForCreatingOrderTransferRequestOrderTransferParam extends TeaModel {
        @NameInMap("AuthorizationCode")
        public String authorizationCode;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("PermitPremiumTransfer")
        public Boolean permitPremiumTransfer;

        @NameInMap("RegistrantProfileId")
        public Long registrantProfileId;

        public static SaveBatchTaskForCreatingOrderTransferRequestOrderTransferParam build(java.util.Map<String, ?> map) throws Exception {
            SaveBatchTaskForCreatingOrderTransferRequestOrderTransferParam self = new SaveBatchTaskForCreatingOrderTransferRequestOrderTransferParam();
            return TeaModel.build(map, self);
        }

        public SaveBatchTaskForCreatingOrderTransferRequestOrderTransferParam setAuthorizationCode(String authorizationCode) {
            this.authorizationCode = authorizationCode;
            return this;
        }
        public String getAuthorizationCode() {
            return this.authorizationCode;
        }

        public SaveBatchTaskForCreatingOrderTransferRequestOrderTransferParam setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public SaveBatchTaskForCreatingOrderTransferRequestOrderTransferParam setPermitPremiumTransfer(Boolean permitPremiumTransfer) {
            this.permitPremiumTransfer = permitPremiumTransfer;
            return this;
        }
        public Boolean getPermitPremiumTransfer() {
            return this.permitPremiumTransfer;
        }

        public SaveBatchTaskForCreatingOrderTransferRequestOrderTransferParam setRegistrantProfileId(Long registrantProfileId) {
            this.registrantProfileId = registrantProfileId;
            return this;
        }
        public Long getRegistrantProfileId() {
            return this.registrantProfileId;
        }

    }

}
