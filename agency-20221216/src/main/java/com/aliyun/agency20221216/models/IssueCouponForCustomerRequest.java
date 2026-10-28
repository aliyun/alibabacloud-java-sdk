// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class IssueCouponForCustomerRequest extends TeaModel {
    /**
     * <p>The language parameter. Default value: none. Valid values:</p>
     * <ul>
     * <li>zh-CN: Chinese.</li>
     * <li>en-US: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The reason for applying for the coupon. The reason can be up to 500 characters in length. Example: Apply for a coupon for Customer XXX.</p>
     * 
     * <strong>example:</strong>
     * <p>Apply for a coupon for Customer XXX, who is XXXX</p>
     */
    @NameInMap("ApplicationReason")
    public String applicationReason;

    /**
     * <p>The ID of the coupon template.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5075915</p>
     */
    @NameInMap("CouponTemplateId")
    public Long couponTemplateId;

    /**
     * <p>Specifies whether to use the POC privilege quota. Valid values:</p>
     * <ul>
     * <li>true: Uses the POC privilege quota. If all submitted accounts are marked as approval-exempt, the current coupon application skips the approval process, and the POC privilege quota in your partner benefit package is deducted.</li>
     * <li>false: Does not use the POC privilege quota. Regardless of the approval-exempt status of the submitted accounts, your POC coupon benefit quota remains unchanged. In this case, the application follows the standard coupon application approval process.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsUseBenefit")
    @Deprecated
    public Boolean isUseBenefit;

    /**
     * <p>The list of UIDs. Separate multiple UIDs with commas (,). Example: 111,2222.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>111,2222</p>
     */
    @NameInMap("Uidlist")
    public String uidlist;

    public static IssueCouponForCustomerRequest build(java.util.Map<String, ?> map) throws Exception {
        IssueCouponForCustomerRequest self = new IssueCouponForCustomerRequest();
        return TeaModel.build(map, self);
    }

    public IssueCouponForCustomerRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public IssueCouponForCustomerRequest setApplicationReason(String applicationReason) {
        this.applicationReason = applicationReason;
        return this;
    }
    public String getApplicationReason() {
        return this.applicationReason;
    }

    public IssueCouponForCustomerRequest setCouponTemplateId(Long couponTemplateId) {
        this.couponTemplateId = couponTemplateId;
        return this;
    }
    public Long getCouponTemplateId() {
        return this.couponTemplateId;
    }

    @Deprecated
    public IssueCouponForCustomerRequest setIsUseBenefit(Boolean isUseBenefit) {
        this.isUseBenefit = isUseBenefit;
        return this;
    }
    public Boolean getIsUseBenefit() {
        return this.isUseBenefit;
    }

    public IssueCouponForCustomerRequest setUidlist(String uidlist) {
        this.uidlist = uidlist;
        return this;
    }
    public String getUidlist() {
        return this.uidlist;
    }

}
