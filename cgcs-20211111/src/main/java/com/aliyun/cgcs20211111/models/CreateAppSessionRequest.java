// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class CreateAppSessionRequest extends TeaModel {
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

    // 启动参数
    @NameInMap("StartParameters")
    public java.util.List<CreateAppSessionRequestStartParameters> startParameters;

    // 系统信息：如端侧机型等信息
    @NameInMap("SystemInfo")
    public java.util.List<CreateAppSessionRequestSystemInfo> systemInfo;

    public static CreateAppSessionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppSessionRequest self = new CreateAppSessionRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppSessionRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateAppSessionRequest setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public CreateAppSessionRequest setClientIp(String clientIp) {
        this.clientIp = clientIp;
        return this;
    }
    public String getClientIp() {
        return this.clientIp;
    }

    public CreateAppSessionRequest setCustomSessionId(String customSessionId) {
        this.customSessionId = customSessionId;
        return this;
    }
    public String getCustomSessionId() {
        return this.customSessionId;
    }

    public CreateAppSessionRequest setCustomUserId(String customUserId) {
        this.customUserId = customUserId;
        return this;
    }
    public String getCustomUserId() {
        return this.customUserId;
    }

    public CreateAppSessionRequest setStartParameters(java.util.List<CreateAppSessionRequestStartParameters> startParameters) {
        this.startParameters = startParameters;
        return this;
    }
    public java.util.List<CreateAppSessionRequestStartParameters> getStartParameters() {
        return this.startParameters;
    }

    public CreateAppSessionRequest setSystemInfo(java.util.List<CreateAppSessionRequestSystemInfo> systemInfo) {
        this.systemInfo = systemInfo;
        return this;
    }
    public java.util.List<CreateAppSessionRequestSystemInfo> getSystemInfo() {
        return this.systemInfo;
    }

    public static class CreateAppSessionRequestStartParameters extends TeaModel {
        // key
        @NameInMap("Key")
        public String key;

        // value
        @NameInMap("Value")
        public String value;

        public static CreateAppSessionRequestStartParameters build(java.util.Map<String, ?> map) throws Exception {
            CreateAppSessionRequestStartParameters self = new CreateAppSessionRequestStartParameters();
            return TeaModel.build(map, self);
        }

        public CreateAppSessionRequestStartParameters setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateAppSessionRequestStartParameters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateAppSessionRequestSystemInfo extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateAppSessionRequestSystemInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateAppSessionRequestSystemInfo self = new CreateAppSessionRequestSystemInfo();
            return TeaModel.build(map, self);
        }

        public CreateAppSessionRequestSystemInfo setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateAppSessionRequestSystemInfo setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
