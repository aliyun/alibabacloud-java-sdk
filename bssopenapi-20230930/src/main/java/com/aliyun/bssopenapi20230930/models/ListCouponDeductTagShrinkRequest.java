// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class ListCouponDeductTagShrinkRequest extends TeaModel {
    @NameInMap("CouponId")
    public String couponId;

    @NameInMap("EcIdAccountIds")
    public String ecIdAccountIdsShrink;

    @NameInMap("Nbid")
    public String nbid;

    public static ListCouponDeductTagShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCouponDeductTagShrinkRequest self = new ListCouponDeductTagShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListCouponDeductTagShrinkRequest setCouponId(String couponId) {
        this.couponId = couponId;
        return this;
    }
    public String getCouponId() {
        return this.couponId;
    }

    public ListCouponDeductTagShrinkRequest setEcIdAccountIdsShrink(String ecIdAccountIdsShrink) {
        this.ecIdAccountIdsShrink = ecIdAccountIdsShrink;
        return this;
    }
    public String getEcIdAccountIdsShrink() {
        return this.ecIdAccountIdsShrink;
    }

    public ListCouponDeductTagShrinkRequest setNbid(String nbid) {
        this.nbid = nbid;
        return this;
    }
    public String getNbid() {
        return this.nbid;
    }

}
