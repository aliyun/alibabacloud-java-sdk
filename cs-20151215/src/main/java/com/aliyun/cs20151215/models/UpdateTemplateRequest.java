// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class UpdateTemplateRequest extends TeaModel {
    /**
     * <p>The description of the template.</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The name of the template.</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The label of the template.</p>
     */
    @NameInMap("tags")
    public String tags;

    /**
     * <p>The YAML content of the template.</p>
     */
    @NameInMap("template")
    public String template;

    /**
     * <p>The type of template. This parameter can be set to a custom value.</p>
     * <br>
     * <p>*   If the parameter is set to `kubernetes`, the template is displayed on the Templates page in the console.</p>
     * <p>*   If the parameter is set to `compose`, the template is displayed on the Container Service - Swarm page in the console. Container Service for Swarm is deprecated.</p>
     */
    @NameInMap("template_type")
    public String templateType;

    public static UpdateTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTemplateRequest self = new UpdateTemplateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTemplateRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateTemplateRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public UpdateTemplateRequest setTemplate(String template) {
        this.template = template;
        return this;
    }
    public String getTemplate() {
        return this.template;
    }

    public UpdateTemplateRequest setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

}
