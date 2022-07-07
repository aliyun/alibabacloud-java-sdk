// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class UpdateCouponTemplateShrinkRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("CouponTemplateDTO")
    public String couponTemplateDTOShrink;

    public static UpdateCouponTemplateShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCouponTemplateShrinkRequest self = new UpdateCouponTemplateShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCouponTemplateShrinkRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public UpdateCouponTemplateShrinkRequest setCouponTemplateDTOShrink(String couponTemplateDTOShrink) {
        this.couponTemplateDTOShrink = couponTemplateDTOShrink;
        return this;
    }
    public String getCouponTemplateDTOShrink() {
        return this.couponTemplateDTOShrink;
    }

}
