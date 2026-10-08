// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveSingleTaskForCreatingOrderTransferRequest extends TeaModel {
    /**
     * <p>Domain name transfer-in password.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testCode</p>
     */
    @NameInMap("AuthorizationCode")
    public String authorizationCode;

    /**
     * <p>Coupon number.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("CouponNo")
    public String couponNo;

    /**
     * <p>Domain name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>Language for error messages returned by the API. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese;</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * <p>Default value: <strong>en</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>Is transfer-in of premium domain names allowed. Default value: <strong>false</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("PermitPremiumTransfer")
    public Boolean permitPremiumTransfer;

    /**
     * <p>Coupon number.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("PromotionNo")
    public String promotionNo;

    /**
     * <p>ID of the domain name registrant profile that has passed identity verification.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("RegistrantProfileId")
    public Long registrantProfileId;

    /**
     * <p>Is a coupon used.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("UseCoupon")
    public Boolean useCoupon;

    /**
     * <p>Is a coupon used.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("UsePromotion")
    public Boolean usePromotion;

    /**
     * <p>User IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
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
