// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class GetAdvancedQueryTemplateRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>utpl-N9fpjnFBSWauSXhVNP3erw</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    public static GetAdvancedQueryTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAdvancedQueryTemplateRequest self = new GetAdvancedQueryTemplateRequest();
        return TeaModel.build(map, self);
    }

    public GetAdvancedQueryTemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
