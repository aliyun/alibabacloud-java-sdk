// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class CreateAppSessionShrinkRequest extends TeaModel {
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

    @NameInMap("DatasetId")
    public String datasetId;

    @NameInMap("EnablePostpaid")
    public Boolean enablePostpaid;

    @NameInMap("ResultStore")
    public String resultStoreShrink;

    // 启动参数
    @NameInMap("StartParameters")
    public java.util.List<CreateAppSessionShrinkRequestStartParameters> startParameters;

    @NameInMap("StartParametersV2")
    public String startParametersV2Shrink;

    // 系统信息：如端侧机型等信息
    @NameInMap("SystemInfo")
    public java.util.List<CreateAppSessionShrinkRequestSystemInfo> systemInfo;

    @NameInMap("Timeout")
    public Long timeout;

    public static CreateAppSessionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppSessionShrinkRequest self = new CreateAppSessionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppSessionShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateAppSessionShrinkRequest setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public CreateAppSessionShrinkRequest setClientIp(String clientIp) {
        this.clientIp = clientIp;
        return this;
    }
    public String getClientIp() {
        return this.clientIp;
    }

    public CreateAppSessionShrinkRequest setCustomSessionId(String customSessionId) {
        this.customSessionId = customSessionId;
        return this;
    }
    public String getCustomSessionId() {
        return this.customSessionId;
    }

    public CreateAppSessionShrinkRequest setCustomUserId(String customUserId) {
        this.customUserId = customUserId;
        return this;
    }
    public String getCustomUserId() {
        return this.customUserId;
    }

    public CreateAppSessionShrinkRequest setDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public String getDatasetId() {
        return this.datasetId;
    }

    public CreateAppSessionShrinkRequest setEnablePostpaid(Boolean enablePostpaid) {
        this.enablePostpaid = enablePostpaid;
        return this;
    }
    public Boolean getEnablePostpaid() {
        return this.enablePostpaid;
    }

    public CreateAppSessionShrinkRequest setResultStoreShrink(String resultStoreShrink) {
        this.resultStoreShrink = resultStoreShrink;
        return this;
    }
    public String getResultStoreShrink() {
        return this.resultStoreShrink;
    }

    public CreateAppSessionShrinkRequest setStartParameters(java.util.List<CreateAppSessionShrinkRequestStartParameters> startParameters) {
        this.startParameters = startParameters;
        return this;
    }
    public java.util.List<CreateAppSessionShrinkRequestStartParameters> getStartParameters() {
        return this.startParameters;
    }

    public CreateAppSessionShrinkRequest setStartParametersV2Shrink(String startParametersV2Shrink) {
        this.startParametersV2Shrink = startParametersV2Shrink;
        return this;
    }
    public String getStartParametersV2Shrink() {
        return this.startParametersV2Shrink;
    }

    public CreateAppSessionShrinkRequest setSystemInfo(java.util.List<CreateAppSessionShrinkRequestSystemInfo> systemInfo) {
        this.systemInfo = systemInfo;
        return this;
    }
    public java.util.List<CreateAppSessionShrinkRequestSystemInfo> getSystemInfo() {
        return this.systemInfo;
    }

    public CreateAppSessionShrinkRequest setTimeout(Long timeout) {
        this.timeout = timeout;
        return this;
    }
    public Long getTimeout() {
        return this.timeout;
    }

    public static class CreateAppSessionShrinkRequestStartParameters extends TeaModel {
        // key
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateAppSessionShrinkRequestStartParameters build(java.util.Map<String, ?> map) throws Exception {
            CreateAppSessionShrinkRequestStartParameters self = new CreateAppSessionShrinkRequestStartParameters();
            return TeaModel.build(map, self);
        }

        public CreateAppSessionShrinkRequestStartParameters setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateAppSessionShrinkRequestStartParameters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateAppSessionShrinkRequestSystemInfo extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateAppSessionShrinkRequestSystemInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateAppSessionShrinkRequestSystemInfo self = new CreateAppSessionShrinkRequestSystemInfo();
            return TeaModel.build(map, self);
        }

        public CreateAppSessionShrinkRequestSystemInfo setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateAppSessionShrinkRequestSystemInfo setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
