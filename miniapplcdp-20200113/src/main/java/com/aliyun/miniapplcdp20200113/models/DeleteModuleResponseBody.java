// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class DeleteModuleResponseBody extends TeaModel {
    @NameInMap("Data")
    public DeleteModuleResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static DeleteModuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteModuleResponseBody self = new DeleteModuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteModuleResponseBody setData(DeleteModuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteModuleResponseBodyData getData() {
        return this.data;
    }

    public DeleteModuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DeleteModuleResponseBodyData extends TeaModel {
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

        public static DeleteModuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteModuleResponseBodyData self = new DeleteModuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteModuleResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DeleteModuleResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DeleteModuleResponseBodyData setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public DeleteModuleResponseBodyData setLatestPublishedCommit(String latestPublishedCommit) {
            this.latestPublishedCommit = latestPublishedCommit;
            return this;
        }
        public String getLatestPublishedCommit() {
            return this.latestPublishedCommit;
        }

        public DeleteModuleResponseBodyData setLatestPublishedVersion(String latestPublishedVersion) {
            this.latestPublishedVersion = latestPublishedVersion;
            return this;
        }
        public String getLatestPublishedVersion() {
            return this.latestPublishedVersion;
        }

        public DeleteModuleResponseBodyData setMinimumPlatformVersion(String minimumPlatformVersion) {
            this.minimumPlatformVersion = minimumPlatformVersion;
            return this;
        }
        public String getMinimumPlatformVersion() {
            return this.minimumPlatformVersion;
        }

        public DeleteModuleResponseBodyData setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public DeleteModuleResponseBodyData setModuleId(String moduleId) {
            this.moduleId = moduleId;
            return this;
        }
        public String getModuleId() {
            return this.moduleId;
        }

        public DeleteModuleResponseBodyData setModuleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }
        public String getModuleName() {
            return this.moduleName;
        }

        public DeleteModuleResponseBodyData setOwnerAppId(String ownerAppId) {
            this.ownerAppId = ownerAppId;
            return this;
        }
        public String getOwnerAppId() {
            return this.ownerAppId;
        }

        public DeleteModuleResponseBodyData setOwnerUserId(String ownerUserId) {
            this.ownerUserId = ownerUserId;
            return this;
        }
        public String getOwnerUserId() {
            return this.ownerUserId;
        }

        public DeleteModuleResponseBodyData setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

    }

}
