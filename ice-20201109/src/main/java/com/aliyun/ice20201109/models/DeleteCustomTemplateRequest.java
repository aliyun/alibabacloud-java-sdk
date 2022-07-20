// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteCustomTemplateRequest extends TeaModel {
    // 模板ID
    @NameInMap("TemplateId")
    public String templateId;

    public static DeleteCustomTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomTemplateRequest self = new DeleteCustomTemplateRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCustomTemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
