// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListCustomTemplatesResponseBody extends TeaModel {
    @NameInMap("CustomTemplateList")
    public java.util.List<ListCustomTemplatesResponseBodyCustomTemplateList> customTemplateList;

    @NameInMap("RequestId")
    public String requestId;

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
