// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class CreateTemplateRequest extends TeaModel {
    /**
     * <p>The description of the template.</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The name of the orchestration template.</p>
     * <br>
     * <p>The name must be 1 to 63 characters in length, and can contain digits, letters, and hyphens (-). It cannot start with a hyphen (-).</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The label of the template.</p>
     */
    @NameInMap("tags")
    public String tags;

    /**
     * <p>The template content in the YAML format.</p>
     */
    @NameInMap("template")
    public String template;

    /**
     * <p>The type of template. You can set the parameter to a custom value.</p>
     * <br>
     * <p>*   If the parameter is set to `kubernetes`, the template is displayed on the Templates page in the console.</p>
     * <p>*   If you set the parameter to `compose`, the template is not displayed in the console.</p>
     * <br>
     * <p>We recommend that you set the parameter to `kubernetes`.</p>
     * <br>
     * <p>Default value: `compose`.</p>
     */
    @NameInMap("template_type")
    public String templateType;

    public static CreateTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTemplateRequest self = new CreateTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateTemplateRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateTemplateRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public CreateTemplateRequest setTemplate(String template) {
        this.template = template;
        return this;
    }
    public String getTemplate() {
        return this.template;
    }

    public CreateTemplateRequest setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

}
