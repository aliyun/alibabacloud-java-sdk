// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveBatchTaskForCreatingOrderTransferRequest extends TeaModel {
    /**
     * <p>Coupon number.</p>
     * 
     * <strong>example:</strong>
     * <p>123123</p>
     */
    @NameInMap("CouponNo")
    public String couponNo;

    /**
     * <p>Language of the error message returned by the API. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * <p>Default value is <strong>en</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>List of job details.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("OrderTransferParam")
    public java.util.List<SaveBatchTaskForCreatingOrderTransferRequestOrderTransferParam> orderTransferParam;

    /**
     * <p>Coupon number.</p>
     * 
     * <strong>example:</strong>
     * <p>123123</p>
     */
    @NameInMap("PromotionNo")
    public String promotionNo;

    /**
     * <p>Is a coupon used? Valid values:</p>
     * <ul>
     * <li><strong>false</strong>: No.</li>
     * <li><strong>true</strong>: Yes.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("UseCoupon")
    public Boolean useCoupon;

    /**
     * <p>Whether to use a coupon. Valid values:</p>
     * <ul>
     * <li><strong>false</strong>: Do not use.</li>
     * <li><strong>true</strong>: Use.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("UsePromotion")
    public Boolean usePromotion;

    /**
     * <p>User IP address, which can be set to <strong>127.0.0.1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
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
        /**
         * <p>Domain name transfer-in password. If multiple domain names are involved, pass the passwords as a list.</p>
         * 
         * <strong>example:</strong>
         * <p>testCode</p>
         */
        @NameInMap("AuthorizationCode")
        public String authorizationCode;

        /**
         * <p>Domain name. If multiple domain names are involved, pass them as a list.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>Is transfer-in of premium domain names allowed? Valid values:</p>
         * <ul>
         * <li><strong>false</strong>: Allowed.</li>
         * <li><strong>true</strong>: Not allowed.</li>
         * </ul>
         * <p>Default value: <strong>false</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("PermitPremiumTransfer")
        public Boolean permitPremiumTransfer;

        /**
         * <p>ID of an identity-verified domain name registrant profile. You can obtain this ID by invoking the <a href="https://help.aliyun.com/document_detail/69359.htm?spm=a2c4g.11186623.0.0.5096253c12PfdB">QueryRegistrantProfileRealNameVerificationInfo</a> API.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
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
