// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class GetCouponTemplateDetailRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5093156</p>
     */
    @NameInMap("TemplateId")
    public Long templateId;

    public static GetCouponTemplateDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCouponTemplateDetailRequest self = new GetCouponTemplateDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetCouponTemplateDetailRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

}
