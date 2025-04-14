// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class AddCouponDeductTagShrinkRequest extends TeaModel {
    @NameInMap("CouponId")
    public String couponId;

    @NameInMap("EcIdAccountIds")
    public String ecIdAccountIdsShrink;

    @NameInMap("Nbid")
    public String nbid;

    @NameInMap("Tags")
    public String tagsShrink;

    public static AddCouponDeductTagShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddCouponDeductTagShrinkRequest self = new AddCouponDeductTagShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddCouponDeductTagShrinkRequest setCouponId(String couponId) {
        this.couponId = couponId;
        return this;
    }
    public String getCouponId() {
        return this.couponId;
    }

    public AddCouponDeductTagShrinkRequest setEcIdAccountIdsShrink(String ecIdAccountIdsShrink) {
        this.ecIdAccountIdsShrink = ecIdAccountIdsShrink;
        return this;
    }
    public String getEcIdAccountIdsShrink() {
        return this.ecIdAccountIdsShrink;
    }

    public AddCouponDeductTagShrinkRequest setNbid(String nbid) {
        this.nbid = nbid;
        return this;
    }
    public String getNbid() {
        return this.nbid;
    }

    public AddCouponDeductTagShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

}
