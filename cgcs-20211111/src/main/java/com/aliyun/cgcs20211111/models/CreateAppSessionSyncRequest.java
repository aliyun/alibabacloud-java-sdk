// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class CreateAppSessionSyncRequest extends TeaModel {
    // 应用ID
    @NameInMap("AppId")
    public String appId;

    // 应用版本
    @NameInMap("AppVersion")
    public String appVersion;

    // 客户端ip
    @NameInMap("ClientIp")
    public String clientIp;

    // 自定义会话id
    @NameInMap("CustomSessionId")
    public String customSessionId;

    // 自定义用户id
    @NameInMap("CustomUserId")
    public String customUserId;

    @NameInMap("DistrictId")
    public String districtId;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("SpeedInfo")
    public java.util.List<CreateAppSessionSyncRequestSpeedInfo> speedInfo;

    // 启动参数
    @NameInMap("StartParameters")
    public java.util.List<CreateAppSessionSyncRequestStartParameters> startParameters;

    // 系统信息：如端侧机型等信息
    @NameInMap("SystemInfo")
    public java.util.List<CreateAppSessionSyncRequestSystemInfo> systemInfo;

    @NameInMap("tags")
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

    public CreateAppSessionSyncRequest setSpeedInfo(java.util.List<CreateAppSessionSyncRequestSpeedInfo> speedInfo) {
        this.speedInfo = speedInfo;
        return this;
    }
    public java.util.List<CreateAppSessionSyncRequestSpeedInfo> getSpeedInfo() {
        return this.speedInfo;
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

    public static class CreateAppSessionSyncRequestSpeedInfo extends TeaModel {
        @NameInMap("endpointId")
        public Integer endpointId;

        @NameInMap("rtt")
        public Integer rtt;

        public static CreateAppSessionSyncRequestSpeedInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateAppSessionSyncRequestSpeedInfo self = new CreateAppSessionSyncRequestSpeedInfo();
            return TeaModel.build(map, self);
        }

        public CreateAppSessionSyncRequestSpeedInfo setEndpointId(Integer endpointId) {
            this.endpointId = endpointId;
            return this;
        }
        public Integer getEndpointId() {
            return this.endpointId;
        }

        public CreateAppSessionSyncRequestSpeedInfo setRtt(Integer rtt) {
            this.rtt = rtt;
            return this;
        }
        public Integer getRtt() {
            return this.rtt;
        }

    }

    public static class CreateAppSessionSyncRequestStartParameters extends TeaModel {
        // key
        @NameInMap("Key")
        public String key;

        // value
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
        @NameInMap("key")
        public String key;

        @NameInMap("value")
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
