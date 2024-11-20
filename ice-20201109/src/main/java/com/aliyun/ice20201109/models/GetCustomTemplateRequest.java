// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetCustomTemplateRequest extends TeaModel {
    /**
     * <p>The template subtype.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Subtype")
    public Integer subtype;

    /**
     * <p>The template ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>96e8864746a0b6f3</strong></strong></p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The ID of the template type that is used to query the default template. This parameter is required if TemplateId is not specified.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Type")
    public Integer type;

    public static GetCustomTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCustomTemplateRequest self = new GetCustomTemplateRequest();
        return TeaModel.build(map, self);
    }

    public GetCustomTemplateRequest setSubtype(Integer subtype) {
        this.subtype = subtype;
        return this;
    }
    public Integer getSubtype() {
        return this.subtype;
    }

    public GetCustomTemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public GetCustomTemplateRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

}
