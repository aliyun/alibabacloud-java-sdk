// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class UpdateMessageTemplateRequest extends TeaModel {
    @NameInMap("TemplateDetail")
    public String templateDetail;

    @NameInMap("TemplateId")
    public Long templateId;

    @NameInMap("TemplateName")
    public String templateName;

    public static UpdateMessageTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMessageTemplateRequest self = new UpdateMessageTemplateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMessageTemplateRequest setTemplateDetail(String templateDetail) {
        this.templateDetail = templateDetail;
        return this;
    }
    public String getTemplateDetail() {
        return this.templateDetail;
    }

    public UpdateMessageTemplateRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

    public UpdateMessageTemplateRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

}
