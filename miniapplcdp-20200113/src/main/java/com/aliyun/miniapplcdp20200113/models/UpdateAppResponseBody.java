// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class UpdateAppResponseBody extends TeaModel {
    @NameInMap("Data")
    public UpdateAppResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static UpdateAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppResponseBody self = new UpdateAppResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAppResponseBody setData(UpdateAppResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateAppResponseBodyData getData() {
        return this.data;
    }

    public UpdateAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateAppResponseBodyDataCategories extends TeaModel {
        @NameInMap("CategoryId")
        public String categoryId;

        @NameInMap("CategoryName")
        public String categoryName;

        @NameInMap("ParentCategoryId")
        public String parentCategoryId;

        public static UpdateAppResponseBodyDataCategories build(java.util.Map<String, ?> map) throws Exception {
            UpdateAppResponseBodyDataCategories self = new UpdateAppResponseBodyDataCategories();
            return TeaModel.build(map, self);
        }

        public UpdateAppResponseBodyDataCategories setCategoryId(String categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public String getCategoryId() {
            return this.categoryId;
        }

        public UpdateAppResponseBodyDataCategories setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

        public UpdateAppResponseBodyDataCategories setParentCategoryId(String parentCategoryId) {
            this.parentCategoryId = parentCategoryId;
            return this;
        }
        public String getParentCategoryId() {
            return this.parentCategoryId;
        }

    }

    public static class UpdateAppResponseBodyData extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("AppStatus")
        public String appStatus;

        @NameInMap("AppType")
        public String appType;

        @NameInMap("Categories")
        public java.util.List<UpdateAppResponseBodyDataCategories> categories;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("Icon")
        public String icon;

        @NameInMap("IsTemplate")
        public Boolean isTemplate;

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

        public static UpdateAppResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateAppResponseBodyData self = new UpdateAppResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateAppResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public UpdateAppResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public UpdateAppResponseBodyData setAppStatus(String appStatus) {
            this.appStatus = appStatus;
            return this;
        }
        public String getAppStatus() {
            return this.appStatus;
        }

        public UpdateAppResponseBodyData setAppType(String appType) {
            this.appType = appType;
            return this;
        }
        public String getAppType() {
            return this.appType;
        }

        public UpdateAppResponseBodyData setCategories(java.util.List<UpdateAppResponseBodyDataCategories> categories) {
            this.categories = categories;
            return this;
        }
        public java.util.List<UpdateAppResponseBodyDataCategories> getCategories() {
            return this.categories;
        }

        public UpdateAppResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public UpdateAppResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateAppResponseBodyData setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public UpdateAppResponseBodyData setIsTemplate(Boolean isTemplate) {
            this.isTemplate = isTemplate;
            return this;
        }
        public Boolean getIsTemplate() {
            return this.isTemplate;
        }

        public UpdateAppResponseBodyData setLastEditTime(String lastEditTime) {
            this.lastEditTime = lastEditTime;
            return this;
        }
        public String getLastEditTime() {
            return this.lastEditTime;
        }

        public UpdateAppResponseBodyData setMainModuleId(String mainModuleId) {
            this.mainModuleId = mainModuleId;
            return this;
        }
        public String getMainModuleId() {
            return this.mainModuleId;
        }

        public UpdateAppResponseBodyData setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public UpdateAppResponseBodyData setSchemaVersion(String schemaVersion) {
            this.schemaVersion = schemaVersion;
            return this;
        }
        public String getSchemaVersion() {
            return this.schemaVersion;
        }

        public UpdateAppResponseBodyData setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

    }

}
