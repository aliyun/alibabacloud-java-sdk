// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveBatchTaskForCreatingOrderRedeemRequest extends TeaModel {
    /**
     * <p>Coupon number.</p>
     * 
     * <strong>example:</strong>
     * <p>123123</p>
     */
    @NameInMap("CouponNo")
    public String couponNo;

    /**
     * <p>Language of error messages returned by the API. Valid values:  </p>
     * <ul>
     * <li><strong>zh</strong>: Chinese;  </li>
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
     * <p>List of job details.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("OrderRedeemParam")
    public java.util.List<SaveBatchTaskForCreatingOrderRedeemRequestOrderRedeemParam> orderRedeemParam;

    /**
     * <p>Coupon number.</p>
     * 
     * <strong>example:</strong>
     * <p>123213123</p>
     */
    @NameInMap("PromotionNo")
    public String promotionNo;

    /**
     * <p>Is coupon used? Valid values:  </p>
     * <ul>
     * <li><strong>false</strong>: No.  </li>
     * <li><strong>true</strong>: Yes.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("UseCoupon")
    public Boolean useCoupon;

    /**
     * <p>Is coupon used? Valid values:  </p>
     * <ul>
     * <li><strong>false</strong>: No.  </li>
     * <li><strong>true</strong>: Yes.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("UsePromotion")
    public Boolean usePromotion;

    /**
     * <p>User IP address. You can set it to <strong>127.0.0.1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
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
        /**
         * <p>Current expiration date of the domain name, represented as the number of milliseconds from 00:00 UTC on January 1, 1970, to the domain’s current expiration date.</p>
         * 
         * <strong>example:</strong>
         * <p>000000</p>
         */
        @NameInMap("CurrentExpirationDate")
        public Long currentExpirationDate;

        /**
         * <p>Domain name. If multiple domain names are involved, pass a domain name list. You can obtain the domain name list by using the <a href="https://help.aliyun.com/document_detail/67712.html">QueryDomainList</a> API.</p>
         * 
         * <strong>example:</strong>
         * <p>Aliyun.com</p>
         */
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
