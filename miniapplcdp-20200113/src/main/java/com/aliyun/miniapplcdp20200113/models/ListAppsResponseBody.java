// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class ListAppsResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListAppsResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static ListAppsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAppsResponseBody self = new ListAppsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAppsResponseBody setData(ListAppsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListAppsResponseBodyData getData() {
        return this.data;
    }

    public ListAppsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAppsResponseBodyDataItemsCategories extends TeaModel {
        @NameInMap("CategoryId")
        public String categoryId;

        @NameInMap("CategoryName")
        public String categoryName;

        @NameInMap("ParentCategoryId")
        public String parentCategoryId;

        public static ListAppsResponseBodyDataItemsCategories build(java.util.Map<String, ?> map) throws Exception {
            ListAppsResponseBodyDataItemsCategories self = new ListAppsResponseBodyDataItemsCategories();
            return TeaModel.build(map, self);
        }

        public ListAppsResponseBodyDataItemsCategories setCategoryId(String categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public String getCategoryId() {
            return this.categoryId;
        }

        public ListAppsResponseBodyDataItemsCategories setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

        public ListAppsResponseBodyDataItemsCategories setParentCategoryId(String parentCategoryId) {
            this.parentCategoryId = parentCategoryId;
            return this;
        }
        public String getParentCategoryId() {
            return this.parentCategoryId;
        }

    }

    public static class ListAppsResponseBodyDataItems extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("AppStatus")
        public String appStatus;

        @NameInMap("AppType")
        public String appType;

        @NameInMap("Categories")
        public java.util.List<ListAppsResponseBodyDataItemsCategories> categories;

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

        public static ListAppsResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListAppsResponseBodyDataItems self = new ListAppsResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public ListAppsResponseBodyDataItems setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListAppsResponseBodyDataItems setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListAppsResponseBodyDataItems setAppStatus(String appStatus) {
            this.appStatus = appStatus;
            return this;
        }
        public String getAppStatus() {
            return this.appStatus;
        }

        public ListAppsResponseBodyDataItems setAppType(String appType) {
            this.appType = appType;
            return this;
        }
        public String getAppType() {
            return this.appType;
        }

        public ListAppsResponseBodyDataItems setCategories(java.util.List<ListAppsResponseBodyDataItemsCategories> categories) {
            this.categories = categories;
            return this;
        }
        public java.util.List<ListAppsResponseBodyDataItemsCategories> getCategories() {
            return this.categories;
        }

        public ListAppsResponseBodyDataItems setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListAppsResponseBodyDataItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListAppsResponseBodyDataItems setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public ListAppsResponseBodyDataItems setIsTemplate(Boolean isTemplate) {
            this.isTemplate = isTemplate;
            return this;
        }
        public Boolean getIsTemplate() {
            return this.isTemplate;
        }

        public ListAppsResponseBodyDataItems setLastEditTime(String lastEditTime) {
            this.lastEditTime = lastEditTime;
            return this;
        }
        public String getLastEditTime() {
            return this.lastEditTime;
        }

        public ListAppsResponseBodyDataItems setMainModuleId(String mainModuleId) {
            this.mainModuleId = mainModuleId;
            return this;
        }
        public String getMainModuleId() {
            return this.mainModuleId;
        }

        public ListAppsResponseBodyDataItems setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ListAppsResponseBodyDataItems setPlatformVersion(String platformVersion) {
            this.platformVersion = platformVersion;
            return this;
        }
        public String getPlatformVersion() {
            return this.platformVersion;
        }

        public ListAppsResponseBodyDataItems setSchemaVersion(String schemaVersion) {
            this.schemaVersion = schemaVersion;
            return this;
        }
        public String getSchemaVersion() {
            return this.schemaVersion;
        }

        public ListAppsResponseBodyDataItems setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

    }

    public static class ListAppsResponseBodyData extends TeaModel {
        @NameInMap("Items")
        public java.util.List<ListAppsResponseBodyDataItems> items;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListAppsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAppsResponseBodyData self = new ListAppsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAppsResponseBodyData setItems(java.util.List<ListAppsResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListAppsResponseBodyDataItems> getItems() {
            return this.items;
        }

        public ListAppsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListAppsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListAppsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
