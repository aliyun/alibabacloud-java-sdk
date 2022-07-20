// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetSystemTemplateResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 模板信息
    @NameInMap("SystemTemplate")
    public GetSystemTemplateResponseBodySystemTemplate systemTemplate;

    public static GetSystemTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSystemTemplateResponseBody self = new GetSystemTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSystemTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSystemTemplateResponseBody setSystemTemplate(GetSystemTemplateResponseBodySystemTemplate systemTemplate) {
        this.systemTemplate = systemTemplate;
        return this;
    }
    public GetSystemTemplateResponseBodySystemTemplate getSystemTemplate() {
        return this.systemTemplate;
    }

    public static class GetSystemTemplateResponseBodySystemTemplate extends TeaModel {
        // 模板状态
        @NameInMap("Status")
        public String status;

        // 模板子类型ID
        @NameInMap("Subtype")
        public Integer subtype;

        // 模板子类型名称
        @NameInMap("SubtypeName")
        public String subtypeName;

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

        public static GetSystemTemplateResponseBodySystemTemplate build(java.util.Map<String, ?> map) throws Exception {
            GetSystemTemplateResponseBodySystemTemplate self = new GetSystemTemplateResponseBodySystemTemplate();
            return TeaModel.build(map, self);
        }

        public GetSystemTemplateResponseBodySystemTemplate setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetSystemTemplateResponseBodySystemTemplate setSubtype(Integer subtype) {
            this.subtype = subtype;
            return this;
        }
        public Integer getSubtype() {
            return this.subtype;
        }

        public GetSystemTemplateResponseBodySystemTemplate setSubtypeName(String subtypeName) {
            this.subtypeName = subtypeName;
            return this;
        }
        public String getSubtypeName() {
            return this.subtypeName;
        }

        public GetSystemTemplateResponseBodySystemTemplate setTemplateConfig(String templateConfig) {
            this.templateConfig = templateConfig;
            return this;
        }
        public String getTemplateConfig() {
            return this.templateConfig;
        }

        public GetSystemTemplateResponseBodySystemTemplate setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public GetSystemTemplateResponseBodySystemTemplate setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public GetSystemTemplateResponseBodySystemTemplate setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public GetSystemTemplateResponseBodySystemTemplate setTypeName(String typeName) {
            this.typeName = typeName;
            return this;
        }
        public String getTypeName() {
            return this.typeName;
        }

    }

}
