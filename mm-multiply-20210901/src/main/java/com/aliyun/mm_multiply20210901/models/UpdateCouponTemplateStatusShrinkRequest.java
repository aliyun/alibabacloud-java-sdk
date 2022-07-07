// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class UpdateCouponTemplateStatusShrinkRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("CouponTemplateStatusDTO")
    public String couponTemplateStatusDTOShrink;

    public static UpdateCouponTemplateStatusShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCouponTemplateStatusShrinkRequest self = new UpdateCouponTemplateStatusShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCouponTemplateStatusShrinkRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public UpdateCouponTemplateStatusShrinkRequest setCouponTemplateStatusDTOShrink(String couponTemplateStatusDTOShrink) {
        this.couponTemplateStatusDTOShrink = couponTemplateStatusDTOShrink;
        return this;
    }
    public String getCouponTemplateStatusDTOShrink() {
        return this.couponTemplateStatusDTOShrink;
    }

}
