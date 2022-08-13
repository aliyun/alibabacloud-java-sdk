// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class CreateAppSessionSyncRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("AppVersion")
    public String appVersion;

    @NameInMap("ClientIp")
    public String clientIp;

    @NameInMap("CustomSessionId")
    public String customSessionId;

    @NameInMap("CustomUserId")
    public String customUserId;

    @NameInMap("DistrictId")
    public String districtId;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("StartParameters")
    public java.util.List<CreateAppSessionSyncRequestStartParameters> startParameters;

    @NameInMap("SystemInfo")
    public java.util.List<CreateAppSessionSyncRequestSystemInfo> systemInfo;

    @NameInMap("Tags")
    public java.util.List<CreateAppSessionSyncRequestTags> tags;

    public static CreateAppSessionSyncRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppSessionSyncRequest self = new CreateAppSessionSyncRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppSessionSyncRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateAppSessionSyncRequest setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public CreateAppSessionSyncRequest setClientIp(String clientIp) {
        this.clientIp = clientIp;
        return this;
    }
    public String getClientIp() {
        return this.clientIp;
    }

    public CreateAppSessionSyncRequest setCustomSessionId(String customSessionId) {
        this.customSessionId = customSessionId;
        return this;
    }
    public String getCustomSessionId() {
        return this.customSessionId;
    }

    public CreateAppSessionSyncRequest setCustomUserId(String customUserId) {
        this.customUserId = customUserId;
        return this;
    }
    public String getCustomUserId() {
        return this.customUserId;
    }

    public CreateAppSessionSyncRequest setDistrictId(String districtId) {
        this.districtId = districtId;
        return this;
    }
    public String getDistrictId() {
        return this.districtId;
    }

    public CreateAppSessionSyncRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public CreateAppSessionSyncRequest setStartParameters(java.util.List<CreateAppSessionSyncRequestStartParameters> startParameters) {
        this.startParameters = startParameters;
        return this;
    }
    public java.util.List<CreateAppSessionSyncRequestStartParameters> getStartParameters() {
        return this.startParameters;
    }

    public CreateAppSessionSyncRequest setSystemInfo(java.util.List<CreateAppSessionSyncRequestSystemInfo> systemInfo) {
        this.systemInfo = systemInfo;
        return this;
    }
    public java.util.List<CreateAppSessionSyncRequestSystemInfo> getSystemInfo() {
        return this.systemInfo;
    }

    public CreateAppSessionSyncRequest setTags(java.util.List<CreateAppSessionSyncRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<CreateAppSessionSyncRequestTags> getTags() {
        return this.tags;
    }

    public static class CreateAppSessionSyncRequestStartParameters extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateAppSessionSyncRequestStartParameters build(java.util.Map<String, ?> map) throws Exception {
            CreateAppSessionSyncRequestStartParameters self = new CreateAppSessionSyncRequestStartParameters();
            return TeaModel.build(map, self);
        }

        public CreateAppSessionSyncRequestStartParameters setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateAppSessionSyncRequestStartParameters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateAppSessionSyncRequestSystemInfo extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateAppSessionSyncRequestSystemInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateAppSessionSyncRequestSystemInfo self = new CreateAppSessionSyncRequestSystemInfo();
            return TeaModel.build(map, self);
        }

        public CreateAppSessionSyncRequestSystemInfo setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateAppSessionSyncRequestSystemInfo setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateAppSessionSyncRequestTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateAppSessionSyncRequestTags build(java.util.Map<String, ?> map) throws Exception {
            CreateAppSessionSyncRequestTags self = new CreateAppSessionSyncRequestTags();
            return TeaModel.build(map, self);
        }

        public CreateAppSessionSyncRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateAppSessionSyncRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
