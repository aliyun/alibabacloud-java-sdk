// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetSystemTemplateResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The template information.</p>
     */
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
         * <p>{&quot;Container&quot;:{&quot;Format&quot;:&quot;m3u8&quot;},&quot;TransConfig&quot;:{&quot;TransMode&quot;:&quot;onepass&quot;},&quot;Video&quot;:{&quot;Codec&quot;:&quot;H.264&quot;,&quot;Maxrate&quot;:8000,&quot;Preset&quot;:&quot;medium&quot;,&quot;PixFmt&quot;:&quot;yuv420p&quot;,&quot;Width&quot;:2048,&quot;Bitrate&quot;:3500},&quot;Audio&quot;:{&quot;Codec&quot;:&quot;aac&quot;,&quot;Bitrate&quot;:160,&quot;Samplerate&quot;:44100,&quot;Channels&quot;:2}}</p>
         */
        @NameInMap("TemplateConfig")
        public String templateConfig;

        /**
         * <p>The template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>S00000001-100060</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <p>The template name.</p>
         * 
         * <strong>example:</strong>
         * <p>M3U8-2K</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        /**
         * <p>The type ID of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Type")
        public Integer type;

        /**
         * <p>The type name of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>TranscodeTemplate</p>
         */
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
