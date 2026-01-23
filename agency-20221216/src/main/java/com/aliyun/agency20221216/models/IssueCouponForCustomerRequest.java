// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class IssueCouponForCustomerRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <strong>example:</strong>
     * <p>为客户XXX审批优惠券，该客户是XXXX</p>
     */
    @NameInMap("ApplicationReason")
    public String applicationReason;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5075915</p>
     */
    @NameInMap("CouponTemplateId")
    public Long couponTemplateId;

    @NameInMap("IsUseBenefit")
    @Deprecated
    public Boolean isUseBenefit;

    /**
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
