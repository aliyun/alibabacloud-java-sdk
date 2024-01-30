// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class SaveSingleTaskForCreatingOrderTransferRequest extends TeaModel {
    @NameInMap("AuthorizationCode")
    public String authorizationCode;

    @NameInMap("CouponNo")
    public String couponNo;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("PermitPremiumTransfer")
    public Boolean permitPremiumTransfer;

    @NameInMap("PromotionNo")
    public String promotionNo;

    @NameInMap("RegistrantProfileId")
    public Long registrantProfileId;

    @NameInMap("UseCoupon")
    public Boolean useCoupon;

    @NameInMap("UsePromotion")
    public Boolean usePromotion;

    @NameInMap("UserClientIp")
    public String userClientIp;

    public static SaveSingleTaskForCreatingOrderTransferRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveSingleTaskForCreatingOrderTransferRequest self = new SaveSingleTaskForCreatingOrderTransferRequest();
        return TeaModel.build(map, self);
    }

    public SaveSingleTaskForCreatingOrderTransferRequest setAuthorizationCode(String authorizationCode) {
        this.authorizationCode = authorizationCode;
        return this;
    }
    public String getAuthorizationCode() {
        return this.authorizationCode;
    }

    public SaveSingleTaskForCreatingOrderTransferRequest setCouponNo(String couponNo) {
        this.couponNo = couponNo;
        return this;
    }
    public String getCouponNo() {
        return this.couponNo;
    }

    public SaveSingleTaskForCreatingOrderTransferRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SaveSingleTaskForCreatingOrderTransferRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SaveSingleTaskForCreatingOrderTransferRequest setPermitPremiumTransfer(Boolean permitPremiumTransfer) {
        this.permitPremiumTransfer = permitPremiumTransfer;
        return this;
    }
    public Boolean getPermitPremiumTransfer() {
        return this.permitPremiumTransfer;
    }

    public SaveSingleTaskForCreatingOrderTransferRequest setPromotionNo(String promotionNo) {
        this.promotionNo = promotionNo;
        return this;
    }
    public String getPromotionNo() {
        return this.promotionNo;
    }

    public SaveSingleTaskForCreatingOrderTransferRequest setRegistrantProfileId(Long registrantProfileId) {
        this.registrantProfileId = registrantProfileId;
        return this;
    }
    public Long getRegistrantProfileId() {
        return this.registrantProfileId;
    }

    public SaveSingleTaskForCreatingOrderTransferRequest setUseCoupon(Boolean useCoupon) {
        this.useCoupon = useCoupon;
        return this;
    }
    public Boolean getUseCoupon() {
        return this.useCoupon;
    }

    public SaveSingleTaskForCreatingOrderTransferRequest setUsePromotion(Boolean usePromotion) {
        this.usePromotion = usePromotion;
        return this;
    }
    public Boolean getUsePromotion() {
        return this.usePromotion;
    }

    public SaveSingleTaskForCreatingOrderTransferRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
