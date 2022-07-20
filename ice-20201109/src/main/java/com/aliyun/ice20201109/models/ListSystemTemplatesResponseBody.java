// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListSystemTemplatesResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 模板信息列表
    @NameInMap("SystemTemplateList")
    public java.util.List<ListSystemTemplatesResponseBodySystemTemplateList> systemTemplateList;

    // 模板总数
    @NameInMap("Total")
    public Integer total;

    public static ListSystemTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSystemTemplatesResponseBody self = new ListSystemTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSystemTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSystemTemplatesResponseBody setSystemTemplateList(java.util.List<ListSystemTemplatesResponseBodySystemTemplateList> systemTemplateList) {
        this.systemTemplateList = systemTemplateList;
        return this;
    }
    public java.util.List<ListSystemTemplatesResponseBodySystemTemplateList> getSystemTemplateList() {
        return this.systemTemplateList;
    }

    public ListSystemTemplatesResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class ListSystemTemplatesResponseBodySystemTemplateList extends TeaModel {
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

        public static ListSystemTemplatesResponseBodySystemTemplateList build(java.util.Map<String, ?> map) throws Exception {
            ListSystemTemplatesResponseBodySystemTemplateList self = new ListSystemTemplatesResponseBodySystemTemplateList();
            return TeaModel.build(map, self);
        }

        public ListSystemTemplatesResponseBodySystemTemplateList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListSystemTemplatesResponseBodySystemTemplateList setSubtype(Integer subtype) {
            this.subtype = subtype;
            return this;
        }
        public Integer getSubtype() {
            return this.subtype;
        }

        public ListSystemTemplatesResponseBodySystemTemplateList setSubtypeName(String subtypeName) {
            this.subtypeName = subtypeName;
            return this;
        }
        public String getSubtypeName() {
            return this.subtypeName;
        }

        public ListSystemTemplatesResponseBodySystemTemplateList setTemplateConfig(String templateConfig) {
            this.templateConfig = templateConfig;
            return this;
        }
        public String getTemplateConfig() {
            return this.templateConfig;
        }

        public ListSystemTemplatesResponseBodySystemTemplateList setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public ListSystemTemplatesResponseBodySystemTemplateList setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public ListSystemTemplatesResponseBodySystemTemplateList setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public ListSystemTemplatesResponseBodySystemTemplateList setTypeName(String typeName) {
            this.typeName = typeName;
            return this;
        }
        public String getTypeName() {
            return this.typeName;
        }

    }

}
