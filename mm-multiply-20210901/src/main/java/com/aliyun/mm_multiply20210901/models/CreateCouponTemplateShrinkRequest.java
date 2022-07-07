// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class CreateCouponTemplateShrinkRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("CouponTemplateDTO")
    public String couponTemplateDTOShrink;

    public static CreateCouponTemplateShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCouponTemplateShrinkRequest self = new CreateCouponTemplateShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateCouponTemplateShrinkRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public CreateCouponTemplateShrinkRequest setCouponTemplateDTOShrink(String couponTemplateDTOShrink) {
        this.couponTemplateDTOShrink = couponTemplateDTOShrink;
        return this;
    }
    public String getCouponTemplateDTOShrink() {
        return this.couponTemplateDTOShrink;
    }

}
