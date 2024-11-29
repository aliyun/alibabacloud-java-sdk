// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class DeleteCouponTemplateRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6558410265670417297</p>
     */
    @NameInMap("TemplateId")
    public Long templateId;

    public static DeleteCouponTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCouponTemplateRequest self = new DeleteCouponTemplateRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCouponTemplateRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

}
