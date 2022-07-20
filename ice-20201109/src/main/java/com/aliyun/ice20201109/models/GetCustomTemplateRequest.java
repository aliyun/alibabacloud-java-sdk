// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetCustomTemplateRequest extends TeaModel {
    @NameInMap("Subtype")
    public Integer subtype;

    // 模板ID
    @NameInMap("TemplateId")
    public String templateId;

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
