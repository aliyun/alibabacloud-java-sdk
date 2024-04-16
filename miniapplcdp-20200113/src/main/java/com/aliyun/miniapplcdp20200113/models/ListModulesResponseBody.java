// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class ListModulesResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListModulesResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static ListModulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListModulesResponseBody self = new ListModulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListModulesResponseBody setData(ListModulesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListModulesResponseBodyData getData() {
        return this.data;
    }

    public ListModulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListModulesResponseBodyDataItems extends TeaModel {
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

        @NameInMap("OwnerAppId")
        public String ownerAppId;

        @NameInMap("OwnerUserId")
        public String ownerUserId;

        @NameInMap("Platform")
        public String platform;

        @NameInMap("PlatformVersion")
        public String platformVersion;

        public static ListModulesResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListModulesResponseBodyDataItems self = new ListModulesResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public ListModulesResponseBodyDataItems setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListModulesResponseBodyDataItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListModulesResponseBodyDataItems setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public ListModulesResponseBodyDataItems setLatestPublishedCommit(String latestPublishedCommit) {
            this.latestPublishedCommit = latestPublishedCommit;
            return this;
        }
        public String getLatestPublishedCommit() {
            return this.latestPublishedCommit;
        }

        public ListModulesResponseBodyDataItems setLatestPublishedVersion(String latestPublishedVersion) {
            this.latestPublishedVersion = latestPublishedVersion;
            return this;
        }
        public String getLatestPublishedVersion() {
            return this.latestPublishedVersion;
        }

        public ListModulesResponseBodyDataItems setMinimumPlatformVersion(String minimumPlatformVersion) {
            this.minimumPlatformVersion = minimumPlatformVersion;
            return this;
        }
        public String getMinimumPlatformVersion() {
            return this.minimumPlatformVersion;
        }

        public ListModulesResponseBodyDataItems setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ListModulesResponseBodyDataItems setModuleId(String moduleId) {
            this.moduleId = moduleId;
            return this;
        }
        public String getModuleId() {
            return this.moduleId;
        }

        public ListModulesResponseBodyDataItems setModuleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }
        public String getModuleName() {
            return this.moduleName;
        }

        public ListModulesResponseBodyDataItems setOwnerAppId(String ownerAppId) {
            this.ownerAppId = ownerAppId;
            return this;
        }
        public String getOwnerAppId() {
            return this.ownerAppId;
        }

        public ListModulesResponseBodyDataItems setOwnerUserId(String ownerUserId) {
            this.ownerUserId = ownerUserId;
            return this;
        }
        public String getOwnerUserId() {
            return this.ownerUserId;
        }

        public ListModulesResponseBodyDataItems setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public ListModulesResponseBodyDataItems setPlatformVersion(String platformVersion) {
            this.platformVersion = platformVersion;
            return this;
        }
        public String getPlatformVersion() {
            return this.platformVersion;
        }

    }

    public static class ListModulesResponseBodyData extends TeaModel {
        @NameInMap("Items")
        public java.util.List<ListModulesResponseBodyDataItems> items;

        public static ListModulesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListModulesResponseBodyData self = new ListModulesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListModulesResponseBodyData setItems(java.util.List<ListModulesResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListModulesResponseBodyDataItems> getItems() {
            return this.items;
        }

    }

}
