// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateCustomTemplateResponseBody extends TeaModel {
    // 模板信息
    @NameInMap("CustomTemplate")
    public CreateCustomTemplateResponseBodyCustomTemplate customTemplate;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    public static CreateCustomTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomTemplateResponseBody self = new CreateCustomTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCustomTemplateResponseBody setCustomTemplate(CreateCustomTemplateResponseBodyCustomTemplate customTemplate) {
        this.customTemplate = customTemplate;
        return this;
    }
    public CreateCustomTemplateResponseBodyCustomTemplate getCustomTemplate() {
        return this.customTemplate;
    }

    public CreateCustomTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateCustomTemplateResponseBodyCustomTemplate extends TeaModel {
        // 模板创建时间
        @NameInMap("CreateTime")
        public String createTime;

        // 是否默认模板
        @NameInMap("IsDefault")
        public Boolean isDefault;

        // 模板修改时间
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        // 模板状态
        @NameInMap("Status")
        public String status;

        // 模板子类型名称
        @NameInMap("Subtype")
        public String subtype;

        // 模板参数
        @NameInMap("TemplateConfig")
        public String templateConfig;

        // 模板Id
        @NameInMap("TemplateId")
        public String templateId;

        // 模板名称
        @NameInMap("TemplateName")
        public String templateName;

        // 模板类型ID
        @NameInMap("Type")
        public Integer type;

        // 模板类型名称
        @NameInMap("TypeName")
        public String typeName;

        public static CreateCustomTemplateResponseBodyCustomTemplate build(java.util.Map<String, ?> map) throws Exception {
            CreateCustomTemplateResponseBodyCustomTemplate self = new CreateCustomTemplateResponseBodyCustomTemplate();
            return TeaModel.build(map, self);
        }

        public CreateCustomTemplateResponseBodyCustomTemplate setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreateCustomTemplateResponseBodyCustomTemplate setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public CreateCustomTemplateResponseBodyCustomTemplate setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public CreateCustomTemplateResponseBodyCustomTemplate setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateCustomTemplateResponseBodyCustomTemplate setSubtype(String subtype) {
            this.subtype = subtype;
            return this;
        }
        public String getSubtype() {
            return this.subtype;
        }

        public CreateCustomTemplateResponseBodyCustomTemplate setTemplateConfig(String templateConfig) {
            this.templateConfig = templateConfig;
            return this;
        }
        public String getTemplateConfig() {
            return this.templateConfig;
        }

        public CreateCustomTemplateResponseBodyCustomTemplate setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public CreateCustomTemplateResponseBodyCustomTemplate setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public CreateCustomTemplateResponseBodyCustomTemplate setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public CreateCustomTemplateResponseBodyCustomTemplate setTypeName(String typeName) {
            this.typeName = typeName;
            return this;
        }
        public String getTypeName() {
            return this.typeName;
        }

    }

}
