// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class CreateAppResponseBody extends TeaModel {
    @NameInMap("Data")
    public CreateAppResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAppResponseBody self = new CreateAppResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAppResponseBody setData(CreateAppResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateAppResponseBodyData getData() {
        return this.data;
    }

    public CreateAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateAppResponseBodyDataCategories extends TeaModel {
        @NameInMap("CategoryId")
        public String categoryId;

        @NameInMap("CategoryName")
        public String categoryName;

        @NameInMap("ParentCategoryId")
        public String parentCategoryId;

        public static CreateAppResponseBodyDataCategories build(java.util.Map<String, ?> map) throws Exception {
            CreateAppResponseBodyDataCategories self = new CreateAppResponseBodyDataCategories();
            return TeaModel.build(map, self);
        }

        public CreateAppResponseBodyDataCategories setCategoryId(String categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public String getCategoryId() {
            return this.categoryId;
        }

        public CreateAppResponseBodyDataCategories setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

        public CreateAppResponseBodyDataCategories setParentCategoryId(String parentCategoryId) {
            this.parentCategoryId = parentCategoryId;
            return this;
        }
        public String getParentCategoryId() {
            return this.parentCategoryId;
        }

    }

    public static class CreateAppResponseBodyData extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("AppStatus")
        public String appStatus;

        @NameInMap("AppType")
        public String appType;

        @NameInMap("Categories")
        public java.util.List<CreateAppResponseBodyDataCategories> categories;

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

        @NameInMap("PlatformVersion")
        public String platformVersion;

        @NameInMap("SchemaVersion")
        public String schemaVersion;

        @NameInMap("Source")
        public String source;

        public static CreateAppResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateAppResponseBodyData self = new CreateAppResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateAppResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public CreateAppResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public CreateAppResponseBodyData setAppStatus(String appStatus) {
            this.appStatus = appStatus;
            return this;
        }
        public String getAppStatus() {
            return this.appStatus;
        }

        public CreateAppResponseBodyData setAppType(String appType) {
            this.appType = appType;
            return this;
        }
        public String getAppType() {
            return this.appType;
        }

        public CreateAppResponseBodyData setCategories(java.util.List<CreateAppResponseBodyDataCategories> categories) {
            this.categories = categories;
            return this;
        }
        public java.util.List<CreateAppResponseBodyDataCategories> getCategories() {
            return this.categories;
        }

        public CreateAppResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreateAppResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateAppResponseBodyData setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public CreateAppResponseBodyData setIsTemplate(Boolean isTemplate) {
            this.isTemplate = isTemplate;
            return this;
        }
        public Boolean getIsTemplate() {
            return this.isTemplate;
        }

        public CreateAppResponseBodyData setLastEditTime(String lastEditTime) {
            this.lastEditTime = lastEditTime;
            return this;
        }
        public String getLastEditTime() {
            return this.lastEditTime;
        }

        public CreateAppResponseBodyData setMainModuleId(String mainModuleId) {
            this.mainModuleId = mainModuleId;
            return this;
        }
        public String getMainModuleId() {
            return this.mainModuleId;
        }

        public CreateAppResponseBodyData setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public CreateAppResponseBodyData setPlatformVersion(String platformVersion) {
            this.platformVersion = platformVersion;
            return this;
        }
        public String getPlatformVersion() {
            return this.platformVersion;
        }

        public CreateAppResponseBodyData setSchemaVersion(String schemaVersion) {
            this.schemaVersion = schemaVersion;
            return this;
        }
        public String getSchemaVersion() {
            return this.schemaVersion;
        }

        public CreateAppResponseBodyData setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

    }

}
