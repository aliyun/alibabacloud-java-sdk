// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetSystemTemplateRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    public static GetSystemTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSystemTemplateRequest self = new GetSystemTemplateRequest();
        return TeaModel.build(map, self);
    }

    public GetSystemTemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
