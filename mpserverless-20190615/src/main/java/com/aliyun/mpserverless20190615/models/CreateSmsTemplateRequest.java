// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class CreateSmsTemplateRequest extends TeaModel {
    @NameInMap("SpaceId")
    public String spaceId;

    @NameInMap("TemplateType")
    public Integer templateType;

    @NameInMap("TemplateName")
    public String templateName;

    @NameInMap("TemplateContent")
    public String templateContent;

    @NameInMap("Remark")
    public String remark;

    public static CreateSmsTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSmsTemplateRequest self = new CreateSmsTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateSmsTemplateRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

    public CreateSmsTemplateRequest setTemplateType(Integer templateType) {
        this.templateType = templateType;
        return this;
    }
    public Integer getTemplateType() {
        return this.templateType;
    }

    public CreateSmsTemplateRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public CreateSmsTemplateRequest setTemplateContent(String templateContent) {
        this.templateContent = templateContent;
        return this;
    }
    public String getTemplateContent() {
        return this.templateContent;
    }

    public CreateSmsTemplateRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
