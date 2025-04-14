// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class DeleteCouponDeductTagShrinkRequest extends TeaModel {
    @NameInMap("CouponId")
    public String couponId;

    @NameInMap("EcIdAccountIds")
    public String ecIdAccountIdsShrink;

    @NameInMap("Nbid")
    public String nbid;

    @NameInMap("TagKeys")
    public String tagKeysShrink;

    public static DeleteCouponDeductTagShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCouponDeductTagShrinkRequest self = new DeleteCouponDeductTagShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCouponDeductTagShrinkRequest setCouponId(String couponId) {
        this.couponId = couponId;
        return this;
    }
    public String getCouponId() {
        return this.couponId;
    }

    public DeleteCouponDeductTagShrinkRequest setEcIdAccountIdsShrink(String ecIdAccountIdsShrink) {
        this.ecIdAccountIdsShrink = ecIdAccountIdsShrink;
        return this;
    }
    public String getEcIdAccountIdsShrink() {
        return this.ecIdAccountIdsShrink;
    }

    public DeleteCouponDeductTagShrinkRequest setNbid(String nbid) {
        this.nbid = nbid;
        return this;
    }
    public String getNbid() {
        return this.nbid;
    }

    public DeleteCouponDeductTagShrinkRequest setTagKeysShrink(String tagKeysShrink) {
        this.tagKeysShrink = tagKeysShrink;
        return this;
    }
    public String getTagKeysShrink() {
        return this.tagKeysShrink;
    }

}
