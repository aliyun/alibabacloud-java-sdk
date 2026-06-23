// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class CreateTemplateRequest extends TeaModel {
    /**
     * <p>The description of the orchestration template.</p>
     * 
     * <strong>example:</strong>
     * <p>this is test</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The name of the template.</p>
     * <p>Naming rules: The name must be 1 to 63 characters in length and can contain digits, Chinese characters, letters, and hyphens (-). It cannot start with a hyphen (-).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>service-account-template</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The tags of the orchestration template.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("tags")
    public String tags;

    /**
     * <p>The template content in YAML format.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>apiVersion: v1\nkind: ServiceAccount\nmetadata:\n  name: test-sa</p>
     */
    @NameInMap("template")
    public String template;

    /**
     * <p>The templatetype.</p>
     * <ul>
     * <li><p>If you set this parameter to <code>kubernetes</code>, the template is displayed on the Orchestration Templates page in the console.</p>
     * </li>
     * <li><p>If you leave this parameter empty or set it to other values, the template is not displayed on the Orchestration Templates page in the console.</p>
     * </li>
     * </ul>
     * <p>Settings this parameter to <code>kubernetes</code> is recommended.</p>
     * 
     * <strong>example:</strong>
     * <p>kubernetes</p>
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
