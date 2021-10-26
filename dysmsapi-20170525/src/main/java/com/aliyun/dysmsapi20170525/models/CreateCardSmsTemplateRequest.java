// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class CreateCardSmsTemplateRequest extends TeaModel {
    @NameInMap("Memo")
    public String memo;

    @NameInMap("Template")
    public java.util.Map<String, ?> template;

    @NameInMap("TemplateName")
    public String templateName;

    public static CreateCardSmsTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCardSmsTemplateRequest self = new CreateCardSmsTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateCardSmsTemplateRequest setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

    public CreateCardSmsTemplateRequest setTemplate(java.util.Map<String, ?> template) {
        this.template = template;
        return this;
    }
    public java.util.Map<String, ?> getTemplate() {
        return this.template;
    }

    public CreateCardSmsTemplateRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

}
