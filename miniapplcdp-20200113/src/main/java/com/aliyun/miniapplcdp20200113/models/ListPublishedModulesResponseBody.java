// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class ListPublishedModulesResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListPublishedModulesResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static ListPublishedModulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPublishedModulesResponseBody self = new ListPublishedModulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPublishedModulesResponseBody setData(ListPublishedModulesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListPublishedModulesResponseBodyData getData() {
        return this.data;
    }

    public ListPublishedModulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListPublishedModulesResponseBodyDataItems extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("Icon")
        public String icon;

        @NameInMap("LatestPublishedCommit")
        public String latestPublishedCommit;

        @NameInMap("LatestPublishedVersion")
        public String latestPublishedVersion;

        @NameInMap("MinimumPlatformVersion")
        public String minimumPlatformVersion;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("ModuleId")
        public String moduleId;

        @NameInMap("ModuleName")
        public String moduleName;

        @NameInMap("ModuleType")
        public String moduleType;

        @NameInMap("OwnerAppId")
        public String ownerAppId;

        @NameInMap("OwnerUserId")
        public String ownerUserId;

        @NameInMap("Platform")
        public String platform;

        @NameInMap("PlatformVersion")
        public String platformVersion;

        public static ListPublishedModulesResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListPublishedModulesResponseBodyDataItems self = new ListPublishedModulesResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public ListPublishedModulesResponseBodyDataItems setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListPublishedModulesResponseBodyDataItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListPublishedModulesResponseBodyDataItems setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public ListPublishedModulesResponseBodyDataItems setLatestPublishedCommit(String latestPublishedCommit) {
            this.latestPublishedCommit = latestPublishedCommit;
            return this;
        }
        public String getLatestPublishedCommit() {
            return this.latestPublishedCommit;
        }

        public ListPublishedModulesResponseBodyDataItems setLatestPublishedVersion(String latestPublishedVersion) {
            this.latestPublishedVersion = latestPublishedVersion;
            return this;
        }
        public String getLatestPublishedVersion() {
            return this.latestPublishedVersion;
        }

        public ListPublishedModulesResponseBodyDataItems setMinimumPlatformVersion(String minimumPlatformVersion) {
            this.minimumPlatformVersion = minimumPlatformVersion;
            return this;
        }
        public String getMinimumPlatformVersion() {
            return this.minimumPlatformVersion;
        }

        public ListPublishedModulesResponseBodyDataItems setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ListPublishedModulesResponseBodyDataItems setModuleId(String moduleId) {
            this.moduleId = moduleId;
            return this;
        }
        public String getModuleId() {
            return this.moduleId;
        }

        public ListPublishedModulesResponseBodyDataItems setModuleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }
        public String getModuleName() {
            return this.moduleName;
        }

        public ListPublishedModulesResponseBodyDataItems setModuleType(String moduleType) {
            this.moduleType = moduleType;
            return this;
        }
        public String getModuleType() {
            return this.moduleType;
        }

        public ListPublishedModulesResponseBodyDataItems setOwnerAppId(String ownerAppId) {
            this.ownerAppId = ownerAppId;
            return this;
        }
        public String getOwnerAppId() {
            return this.ownerAppId;
        }

        public ListPublishedModulesResponseBodyDataItems setOwnerUserId(String ownerUserId) {
            this.ownerUserId = ownerUserId;
            return this;
        }
        public String getOwnerUserId() {
            return this.ownerUserId;
        }

        public ListPublishedModulesResponseBodyDataItems setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public ListPublishedModulesResponseBodyDataItems setPlatformVersion(String platformVersion) {
            this.platformVersion = platformVersion;
            return this;
        }
        public String getPlatformVersion() {
            return this.platformVersion;
        }

    }

    public static class ListPublishedModulesResponseBodyData extends TeaModel {
        @NameInMap("Items")
        public java.util.List<ListPublishedModulesResponseBodyDataItems> items;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListPublishedModulesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListPublishedModulesResponseBodyData self = new ListPublishedModulesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListPublishedModulesResponseBodyData setItems(java.util.List<ListPublishedModulesResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListPublishedModulesResponseBodyDataItems> getItems() {
            return this.items;
        }

        public ListPublishedModulesResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListPublishedModulesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListPublishedModulesResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
