// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class DeleteTimeTemplateRequest extends TeaModel {
    @NameInMap("TemplateId")
    @Validation(required = true)
    public String templateId;

    public static DeleteTimeTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTimeTemplateRequest self = new DeleteTimeTemplateRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTimeTemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
