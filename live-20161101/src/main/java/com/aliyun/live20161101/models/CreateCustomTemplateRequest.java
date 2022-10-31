// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CreateCustomTemplateRequest extends TeaModel {
    @NameInMap("CustomTemplate")
    public String customTemplate;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("Template")
    public String template;

    public static CreateCustomTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomTemplateRequest self = new CreateCustomTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateCustomTemplateRequest setCustomTemplate(String customTemplate) {
        this.customTemplate = customTemplate;
        return this;
    }
    public String getCustomTemplate() {
        return this.customTemplate;
    }

    public CreateCustomTemplateRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateCustomTemplateRequest setTemplate(String template) {
        this.template = template;
        return this;
    }
    public String getTemplate() {
        return this.template;
    }

}
