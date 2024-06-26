// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListCustomTemplatesResponseBody extends TeaModel {
    @NameInMap("CustomTemplateList")
    public java.util.List<ListCustomTemplatesResponseBodyCustomTemplateList> customTemplateList;

    /**
     * <strong>example:</strong>
     * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static ListCustomTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCustomTemplatesResponseBody self = new ListCustomTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCustomTemplatesResponseBody setCustomTemplateList(java.util.List<ListCustomTemplatesResponseBodyCustomTemplateList> customTemplateList) {
        this.customTemplateList = customTemplateList;
        return this;
    }
    public java.util.List<ListCustomTemplatesResponseBodyCustomTemplateList> getCustomTemplateList() {
        return this.customTemplateList;
    }

    public ListCustomTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCustomTemplatesResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class ListCustomTemplatesResponseBodyCustomTemplateList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2022-07-12T16:17:54Z</p>
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
         * <p>2022-07-12T16:17:54Z</p>
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
         * <p>2</p>
         */
        @NameInMap("Subtype")
        public Integer subtype;

        /**
         * <strong>example:</strong>
         * <p>AudioTranscode</p>
         */
        @NameInMap("SubtypeName")
        public String subtypeName;

        /**
         * <strong>example:</strong>
         * <p>{&quot;Container&quot;:{&quot;Format&quot;:&quot;mp3&quot;},&quot;Audio&quot;:{&quot;Codec&quot;:&quot;mp3&quot;,&quot;Bitrate&quot;:&quot;64&quot;,&quot;Samplerate&quot;:&quot;22050&quot;,&quot;Channels&quot;:&quot;2&quot;}}</p>
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

        public static ListCustomTemplatesResponseBodyCustomTemplateList build(java.util.Map<String, ?> map) throws Exception {
            ListCustomTemplatesResponseBodyCustomTemplateList self = new ListCustomTemplatesResponseBodyCustomTemplateList();
            return TeaModel.build(map, self);
        }

        public ListCustomTemplatesResponseBodyCustomTemplateList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListCustomTemplatesResponseBodyCustomTemplateList setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public ListCustomTemplatesResponseBodyCustomTemplateList setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ListCustomTemplatesResponseBodyCustomTemplateList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListCustomTemplatesResponseBodyCustomTemplateList setSubtype(Integer subtype) {
            this.subtype = subtype;
            return this;
        }
        public Integer getSubtype() {
            return this.subtype;
        }

        public ListCustomTemplatesResponseBodyCustomTemplateList setSubtypeName(String subtypeName) {
            this.subtypeName = subtypeName;
            return this;
        }
        public String getSubtypeName() {
            return this.subtypeName;
        }

        public ListCustomTemplatesResponseBodyCustomTemplateList setTemplateConfig(String templateConfig) {
            this.templateConfig = templateConfig;
            return this;
        }
        public String getTemplateConfig() {
            return this.templateConfig;
        }

        public ListCustomTemplatesResponseBodyCustomTemplateList setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public ListCustomTemplatesResponseBodyCustomTemplateList setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public ListCustomTemplatesResponseBodyCustomTemplateList setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public ListCustomTemplatesResponseBodyCustomTemplateList setTypeName(String typeName) {
            this.typeName = typeName;
            return this;
        }
        public String getTypeName() {
            return this.typeName;
        }

    }

}
