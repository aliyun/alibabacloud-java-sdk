// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class CreateRCSTemplateRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("RelatedSignNames")
    public String relatedSignNames;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("TemplateContent")
    public String templateContent;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("TemplateFormat")
    public String templateFormat;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值示例值</p>
     */
    @NameInMap("TemplateMenu")
    public String templateMenu;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("TemplateRule")
    public String templateRule;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("TemplateType")
    public Long templateType;

    public static CreateRCSTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRCSTemplateRequest self = new CreateRCSTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateRCSTemplateRequest setRelatedSignNames(String relatedSignNames) {
        this.relatedSignNames = relatedSignNames;
        return this;
    }
    public String getRelatedSignNames() {
        return this.relatedSignNames;
    }

    public CreateRCSTemplateRequest setTemplateContent(String templateContent) {
        this.templateContent = templateContent;
        return this;
    }
    public String getTemplateContent() {
        return this.templateContent;
    }

    public CreateRCSTemplateRequest setTemplateFormat(String templateFormat) {
        this.templateFormat = templateFormat;
        return this;
    }
    public String getTemplateFormat() {
        return this.templateFormat;
    }

    public CreateRCSTemplateRequest setTemplateMenu(String templateMenu) {
        this.templateMenu = templateMenu;
        return this;
    }
    public String getTemplateMenu() {
        return this.templateMenu;
    }

    public CreateRCSTemplateRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public CreateRCSTemplateRequest setTemplateRule(String templateRule) {
        this.templateRule = templateRule;
        return this;
    }
    public String getTemplateRule() {
        return this.templateRule;
    }

    public CreateRCSTemplateRequest setTemplateType(Long templateType) {
        this.templateType = templateType;
        return this;
    }
    public Long getTemplateType() {
        return this.templateType;
    }

}
