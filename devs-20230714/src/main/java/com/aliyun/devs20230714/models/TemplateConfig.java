// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class TemplateConfig extends TeaModel {
    @NameInMap("parameters")
    public java.util.Map<String, ?> parameters;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("templateName")
    public String templateName;

    public static TemplateConfig build(java.util.Map<String, ?> map) throws Exception {
        TemplateConfig self = new TemplateConfig();
        return TeaModel.build(map, self);
    }

    public TemplateConfig setParameters(java.util.Map<String, ?> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.Map<String, ?> getParameters() {
        return this.parameters;
    }

    public TemplateConfig setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

}
