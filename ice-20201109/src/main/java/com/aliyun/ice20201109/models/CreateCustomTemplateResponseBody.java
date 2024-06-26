// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateCustomTemplateResponseBody extends TeaModel {
    @NameInMap("CustomTemplate")
    public CreateCustomTemplateResponseBodyCustomTemplate customTemplate;

    /**
     * <strong>example:</strong>
     * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>2022-04-19T02:04:31Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsDefault")
        public Boolean isDefault;

        /**
         * <strong>example:</strong>
         * <p>2022-04-19T02:04:31Z</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>Remux</p>
         */
        @NameInMap("Subtype")
        public String subtype;

        /**
         * <strong>example:</strong>
         * <p>{&quot;Container&quot;:{&quot;Format&quot;:&quot;flv&quot;},&quot;Video&quot;:{},&quot;Audio&quot;:{}}</p>
         */
        @NameInMap("TemplateConfig")
        public String templateConfig;

        /**
         * <strong>example:</strong>
         * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <strong>example:</strong>
         * <p>test-template</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Type")
        public Integer type;

        /**
         * <strong>example:</strong>
         * <p>TranscodeTemplate</p>
         */
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
