// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class ListModulesByPageResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListModulesByPageResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static ListModulesByPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListModulesByPageResponseBody self = new ListModulesByPageResponseBody();
        return TeaModel.build(map, self);
    }

    public ListModulesByPageResponseBody setData(ListModulesByPageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListModulesByPageResponseBodyData getData() {
        return this.data;
    }

    public ListModulesByPageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListModulesByPageResponseBodyDataItems extends TeaModel {
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

        public static ListModulesByPageResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListModulesByPageResponseBodyDataItems self = new ListModulesByPageResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public ListModulesByPageResponseBodyDataItems setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListModulesByPageResponseBodyDataItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListModulesByPageResponseBodyDataItems setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public ListModulesByPageResponseBodyDataItems setLatestPublishedCommit(String latestPublishedCommit) {
            this.latestPublishedCommit = latestPublishedCommit;
            return this;
        }
        public String getLatestPublishedCommit() {
            return this.latestPublishedCommit;
        }

        public ListModulesByPageResponseBodyDataItems setLatestPublishedVersion(String latestPublishedVersion) {
            this.latestPublishedVersion = latestPublishedVersion;
            return this;
        }
        public String getLatestPublishedVersion() {
            return this.latestPublishedVersion;
        }

        public ListModulesByPageResponseBodyDataItems setMinimumPlatformVersion(String minimumPlatformVersion) {
            this.minimumPlatformVersion = minimumPlatformVersion;
            return this;
        }
        public String getMinimumPlatformVersion() {
            return this.minimumPlatformVersion;
        }

        public ListModulesByPageResponseBodyDataItems setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ListModulesByPageResponseBodyDataItems setModuleId(String moduleId) {
            this.moduleId = moduleId;
            return this;
        }
        public String getModuleId() {
            return this.moduleId;
        }

        public ListModulesByPageResponseBodyDataItems setModuleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }
        public String getModuleName() {
            return this.moduleName;
        }

        public ListModulesByPageResponseBodyDataItems setModuleType(String moduleType) {
            this.moduleType = moduleType;
            return this;
        }
        public String getModuleType() {
            return this.moduleType;
        }

        public ListModulesByPageResponseBodyDataItems setOwnerAppId(String ownerAppId) {
            this.ownerAppId = ownerAppId;
            return this;
        }
        public String getOwnerAppId() {
            return this.ownerAppId;
        }

        public ListModulesByPageResponseBodyDataItems setOwnerUserId(String ownerUserId) {
            this.ownerUserId = ownerUserId;
            return this;
        }
        public String getOwnerUserId() {
            return this.ownerUserId;
        }

        public ListModulesByPageResponseBodyDataItems setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public ListModulesByPageResponseBodyDataItems setPlatformVersion(String platformVersion) {
            this.platformVersion = platformVersion;
            return this;
        }
        public String getPlatformVersion() {
            return this.platformVersion;
        }

    }

    public static class ListModulesByPageResponseBodyData extends TeaModel {
        @NameInMap("Items")
        public java.util.List<ListModulesByPageResponseBodyDataItems> items;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListModulesByPageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListModulesByPageResponseBodyData self = new ListModulesByPageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListModulesByPageResponseBodyData setItems(java.util.List<ListModulesByPageResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListModulesByPageResponseBodyDataItems> getItems() {
            return this.items;
        }

        public ListModulesByPageResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListModulesByPageResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListModulesByPageResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
