// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyTemplateBaseInfoRequest extends TeaModel {
    /**
     * <p>The template description.</p>
     * 
     * <strong>example:</strong>
     * <p>This is description.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The template ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>b-0caoeogs88y*****</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The template name.</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    public static ModifyTemplateBaseInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyTemplateBaseInfoRequest self = new ModifyTemplateBaseInfoRequest();
        return TeaModel.build(map, self);
    }

    public ModifyTemplateBaseInfoRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyTemplateBaseInfoRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public ModifyTemplateBaseInfoRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

}
