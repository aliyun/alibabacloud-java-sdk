// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class ListAppsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public ListAppsResponseBodyData data;

    public static ListAppsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAppsResponseBody self = new ListAppsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAppsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAppsResponseBody setData(ListAppsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListAppsResponseBodyData getData() {
        return this.data;
    }

    public static class ListAppsResponseBodyDataItems extends TeaModel {
        @NameInMap("AppStatus")
        public String appStatus;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("IsTemplate")
        public Boolean isTemplate;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("Icon")
        public String icon;

        @NameInMap("AppType")
        public String appType;

        @NameInMap("Source")
        public String source;

        @NameInMap("LastEditTime")
        public String lastEditTime;

        public static ListAppsResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListAppsResponseBodyDataItems self = new ListAppsResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public ListAppsResponseBodyDataItems setAppStatus(String appStatus) {
            this.appStatus = appStatus;
            return this;
        }
        public String getAppStatus() {
            return this.appStatus;
        }

        public ListAppsResponseBodyDataItems setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListAppsResponseBodyDataItems setIsTemplate(Boolean isTemplate) {
            this.isTemplate = isTemplate;
            return this;
        }
        public Boolean getIsTemplate() {
            return this.isTemplate;
        }

        public ListAppsResponseBodyDataItems setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ListAppsResponseBodyDataItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListAppsResponseBodyDataItems setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListAppsResponseBodyDataItems setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListAppsResponseBodyDataItems setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public ListAppsResponseBodyDataItems setAppType(String appType) {
            this.appType = appType;
            return this;
        }
        public String getAppType() {
            return this.appType;
        }

        public ListAppsResponseBodyDataItems setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListAppsResponseBodyDataItems setLastEditTime(String lastEditTime) {
            this.lastEditTime = lastEditTime;
            return this;
        }
        public String getLastEditTime() {
            return this.lastEditTime;
        }

    }

    public static class ListAppsResponseBodyData extends TeaModel {
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("Items")
        public java.util.List<ListAppsResponseBodyDataItems> items;

        public static ListAppsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAppsResponseBodyData self = new ListAppsResponseBodyData();
            return TeaModel.build(map, self);
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

        public ListAppsResponseBodyData setItems(java.util.List<ListAppsResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListAppsResponseBodyDataItems> getItems() {
            return this.items;
        }

    }

}
