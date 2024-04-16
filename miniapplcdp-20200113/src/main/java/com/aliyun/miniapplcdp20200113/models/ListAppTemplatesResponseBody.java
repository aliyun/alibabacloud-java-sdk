// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class ListAppTemplatesResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListAppTemplatesResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static ListAppTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAppTemplatesResponseBody self = new ListAppTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAppTemplatesResponseBody setData(ListAppTemplatesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListAppTemplatesResponseBodyData getData() {
        return this.data;
    }

    public ListAppTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAppTemplatesResponseBodyDataItems extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("AppType")
        public String appType;

        @NameInMap("CategoryName")
        public String categoryName;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("Icon")
        public String icon;

        @NameInMap("LastEditTime")
        public String lastEditTime;

        @NameInMap("MainModuleId")
        public String mainModuleId;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("SchemaVersion")
        public String schemaVersion;

        @NameInMap("Source")
        public String source;

        @NameInMap("TemplateId")
        public String templateId;

        @NameInMap("TemplateType")
        public String templateType;

        public static ListAppTemplatesResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListAppTemplatesResponseBodyDataItems self = new ListAppTemplatesResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public ListAppTemplatesResponseBodyDataItems setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListAppTemplatesResponseBodyDataItems setAppType(String appType) {
            this.appType = appType;
            return this;
        }
        public String getAppType() {
            return this.appType;
        }

        public ListAppTemplatesResponseBodyDataItems setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

        public ListAppTemplatesResponseBodyDataItems setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListAppTemplatesResponseBodyDataItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListAppTemplatesResponseBodyDataItems setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public ListAppTemplatesResponseBodyDataItems setLastEditTime(String lastEditTime) {
            this.lastEditTime = lastEditTime;
            return this;
        }
        public String getLastEditTime() {
            return this.lastEditTime;
        }

        public ListAppTemplatesResponseBodyDataItems setMainModuleId(String mainModuleId) {
            this.mainModuleId = mainModuleId;
            return this;
        }
        public String getMainModuleId() {
            return this.mainModuleId;
        }

        public ListAppTemplatesResponseBodyDataItems setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ListAppTemplatesResponseBodyDataItems setSchemaVersion(String schemaVersion) {
            this.schemaVersion = schemaVersion;
            return this;
        }
        public String getSchemaVersion() {
            return this.schemaVersion;
        }

        public ListAppTemplatesResponseBodyDataItems setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListAppTemplatesResponseBodyDataItems setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public ListAppTemplatesResponseBodyDataItems setTemplateType(String templateType) {
            this.templateType = templateType;
            return this;
        }
        public String getTemplateType() {
            return this.templateType;
        }

    }

    public static class ListAppTemplatesResponseBodyData extends TeaModel {
        @NameInMap("Items")
        public java.util.List<ListAppTemplatesResponseBodyDataItems> items;

        public static ListAppTemplatesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAppTemplatesResponseBodyData self = new ListAppTemplatesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAppTemplatesResponseBodyData setItems(java.util.List<ListAppTemplatesResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListAppTemplatesResponseBodyDataItems> getItems() {
            return this.items;
        }

    }

}
