// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class CreateModuleResponseBody extends TeaModel {
    @NameInMap("Data")
    public CreateModuleResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateModuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateModuleResponseBody self = new CreateModuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateModuleResponseBody setData(CreateModuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateModuleResponseBodyData getData() {
        return this.data;
    }

    public CreateModuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateModuleResponseBodyData extends TeaModel {
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

        public static CreateModuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateModuleResponseBodyData self = new CreateModuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateModuleResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreateModuleResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateModuleResponseBodyData setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public CreateModuleResponseBodyData setLatestPublishedCommit(String latestPublishedCommit) {
            this.latestPublishedCommit = latestPublishedCommit;
            return this;
        }
        public String getLatestPublishedCommit() {
            return this.latestPublishedCommit;
        }

        public CreateModuleResponseBodyData setLatestPublishedVersion(String latestPublishedVersion) {
            this.latestPublishedVersion = latestPublishedVersion;
            return this;
        }
        public String getLatestPublishedVersion() {
            return this.latestPublishedVersion;
        }

        public CreateModuleResponseBodyData setMinimumPlatformVersion(String minimumPlatformVersion) {
            this.minimumPlatformVersion = minimumPlatformVersion;
            return this;
        }
        public String getMinimumPlatformVersion() {
            return this.minimumPlatformVersion;
        }

        public CreateModuleResponseBodyData setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public CreateModuleResponseBodyData setModuleId(String moduleId) {
            this.moduleId = moduleId;
            return this;
        }
        public String getModuleId() {
            return this.moduleId;
        }

        public CreateModuleResponseBodyData setModuleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }
        public String getModuleName() {
            return this.moduleName;
        }

        public CreateModuleResponseBodyData setModuleType(String moduleType) {
            this.moduleType = moduleType;
            return this;
        }
        public String getModuleType() {
            return this.moduleType;
        }

        public CreateModuleResponseBodyData setOwnerAppId(String ownerAppId) {
            this.ownerAppId = ownerAppId;
            return this;
        }
        public String getOwnerAppId() {
            return this.ownerAppId;
        }

        public CreateModuleResponseBodyData setOwnerUserId(String ownerUserId) {
            this.ownerUserId = ownerUserId;
            return this;
        }
        public String getOwnerUserId() {
            return this.ownerUserId;
        }

        public CreateModuleResponseBodyData setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public CreateModuleResponseBodyData setPlatformVersion(String platformVersion) {
            this.platformVersion = platformVersion;
            return this;
        }
        public String getPlatformVersion() {
            return this.platformVersion;
        }

    }

}
