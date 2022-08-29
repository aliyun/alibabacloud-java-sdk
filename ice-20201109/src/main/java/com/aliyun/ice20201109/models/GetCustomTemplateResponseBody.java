// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetCustomTemplateResponseBody extends TeaModel {
    @NameInMap("CustomTemplate")
    public GetCustomTemplateResponseBodyCustomTemplate customTemplate;

    @NameInMap("RequestId")
    public String requestId;

    public static GetCustomTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCustomTemplateResponseBody self = new GetCustomTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCustomTemplateResponseBody setCustomTemplate(GetCustomTemplateResponseBodyCustomTemplate customTemplate) {
        this.customTemplate = customTemplate;
        return this;
    }
    public GetCustomTemplateResponseBodyCustomTemplate getCustomTemplate() {
        return this.customTemplate;
    }

    public GetCustomTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetCustomTemplateResponseBodyCustomTemplate extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("IsDefault")
        public Boolean isDefault;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("Subtype")
        public Integer subtype;

        @NameInMap("SubtypeName")
        public String subtypeName;

        @NameInMap("TemplateConfig")
        public String templateConfig;

        @NameInMap("TemplateId")
        public String templateId;

        @NameInMap("TemplateName")
        public String templateName;

        @NameInMap("Type")
        public Integer type;

        @NameInMap("TypeName")
        public String typeName;

        public static GetCustomTemplateResponseBodyCustomTemplate build(java.util.Map<String, ?> map) throws Exception {
            GetCustomTemplateResponseBodyCustomTemplate self = new GetCustomTemplateResponseBodyCustomTemplate();
            return TeaModel.build(map, self);
        }

        public GetCustomTemplateResponseBodyCustomTemplate setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetCustomTemplateResponseBodyCustomTemplate setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public GetCustomTemplateResponseBodyCustomTemplate setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public GetCustomTemplateResponseBodyCustomTemplate setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetCustomTemplateResponseBodyCustomTemplate setSubtype(Integer subtype) {
            this.subtype = subtype;
            return this;
        }
        public Integer getSubtype() {
            return this.subtype;
        }

        public GetCustomTemplateResponseBodyCustomTemplate setSubtypeName(String subtypeName) {
            this.subtypeName = subtypeName;
            return this;
        }
        public String getSubtypeName() {
            return this.subtypeName;
        }

        public GetCustomTemplateResponseBodyCustomTemplate setTemplateConfig(String templateConfig) {
            this.templateConfig = templateConfig;
            return this;
        }
        public String getTemplateConfig() {
            return this.templateConfig;
        }

        public GetCustomTemplateResponseBodyCustomTemplate setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public GetCustomTemplateResponseBodyCustomTemplate setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public GetCustomTemplateResponseBodyCustomTemplate setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public GetCustomTemplateResponseBodyCustomTemplate setTypeName(String typeName) {
            this.typeName = typeName;
            return this;
        }
        public String getTypeName() {
            return this.typeName;
        }

    }

}
