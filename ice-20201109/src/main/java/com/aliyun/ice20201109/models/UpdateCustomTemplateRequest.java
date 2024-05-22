// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateCustomTemplateRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("TemplateConfig")
    public String templateConfig;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    public static UpdateCustomTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCustomTemplateRequest self = new UpdateCustomTemplateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCustomTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateCustomTemplateRequest setTemplateConfig(String templateConfig) {
        this.templateConfig = templateConfig;
        return this;
    }
    public String getTemplateConfig() {
        return this.templateConfig;
    }

    public UpdateCustomTemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
