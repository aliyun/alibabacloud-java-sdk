// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetCustomTemplateResponseBody extends TeaModel {
    /**
     * <p>The template information.</p>
     */
    @NameInMap("CustomTemplate")
    public GetCustomTemplateResponseBodyCustomTemplate customTemplate;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
     */
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

    public static class GetCustomTemplateResponseBodyCustomTemplateFrontendHintTranscodeTemplateHint extends TeaModel {
        @NameInMap("BitrateControlType")
        public String bitrateControlType;

        public static GetCustomTemplateResponseBodyCustomTemplateFrontendHintTranscodeTemplateHint build(java.util.Map<String, ?> map) throws Exception {
            GetCustomTemplateResponseBodyCustomTemplateFrontendHintTranscodeTemplateHint self = new GetCustomTemplateResponseBodyCustomTemplateFrontendHintTranscodeTemplateHint();
            return TeaModel.build(map, self);
        }

        public GetCustomTemplateResponseBodyCustomTemplateFrontendHintTranscodeTemplateHint setBitrateControlType(String bitrateControlType) {
            this.bitrateControlType = bitrateControlType;
            return this;
        }
        public String getBitrateControlType() {
            return this.bitrateControlType;
        }

    }

    public static class GetCustomTemplateResponseBodyCustomTemplateFrontendHint extends TeaModel {
        @NameInMap("TranscodeTemplateHint")
        public GetCustomTemplateResponseBodyCustomTemplateFrontendHintTranscodeTemplateHint transcodeTemplateHint;

        public static GetCustomTemplateResponseBodyCustomTemplateFrontendHint build(java.util.Map<String, ?> map) throws Exception {
            GetCustomTemplateResponseBodyCustomTemplateFrontendHint self = new GetCustomTemplateResponseBodyCustomTemplateFrontendHint();
            return TeaModel.build(map, self);
        }

        public GetCustomTemplateResponseBodyCustomTemplateFrontendHint setTranscodeTemplateHint(GetCustomTemplateResponseBodyCustomTemplateFrontendHintTranscodeTemplateHint transcodeTemplateHint) {
            this.transcodeTemplateHint = transcodeTemplateHint;
            return this;
        }
        public GetCustomTemplateResponseBodyCustomTemplateFrontendHintTranscodeTemplateHint getTranscodeTemplateHint() {
            return this.transcodeTemplateHint;
        }

    }

    public static class GetCustomTemplateResponseBodyCustomTemplate extends TeaModel {
        /**
         * <p>The time when the template was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-01-01T10:00:00Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("FrontendHint")
        public GetCustomTemplateResponseBodyCustomTemplateFrontendHint frontendHint;

        /**
         * <p>Indicates whether the template is the default template.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsDefault")
        public Boolean isDefault;

        /**
         * <p>The time when the template was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-01-01T11:00:00Z</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>The template state.</p>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The subtype ID of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Subtype")
        public Integer subtype;

        /**
         * <p>The subtype name of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("SubtypeName")
        public String subtypeName;

        /**
         * <p>The template parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Type&quot;:&quot;Normal&quot;,&quot;FrameType&quot;:&quot;normal&quot;,&quot;Time&quot;:0,&quot;Count&quot;:10}</p>
         */
        @NameInMap("TemplateConfig")
        public String templateConfig;

        /**
         * <p>The template ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <p>The template name.</p>
         * 
         * <strong>example:</strong>
         * <p>测试转码模板</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        /**
         * <p>The type ID of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Type")
        public Integer type;

        /**
         * <p>The type name of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>SnapshotTemplate</p>
         */
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

        public GetCustomTemplateResponseBodyCustomTemplate setFrontendHint(GetCustomTemplateResponseBodyCustomTemplateFrontendHint frontendHint) {
            this.frontendHint = frontendHint;
            return this;
        }
        public GetCustomTemplateResponseBodyCustomTemplateFrontendHint getFrontendHint() {
            return this.frontendHint;
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
