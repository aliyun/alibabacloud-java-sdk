// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class DeleteMessageTemplateRequest extends TeaModel {
    @NameInMap("TemplateId")
    public Long templateId;

    public static DeleteMessageTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMessageTemplateRequest self = new DeleteMessageTemplateRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMessageTemplateRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

}
