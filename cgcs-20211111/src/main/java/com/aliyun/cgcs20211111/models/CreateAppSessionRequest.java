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

    @NameInMap("DatasetId")
    public String datasetId;

    @NameInMap("EnablePostpaid")
    public Boolean enablePostpaid;

    @NameInMap("ResultStore")
    public CreateAppSessionRequestResultStore resultStore;

    // 启动参数
    @NameInMap("StartParameters")
    public java.util.List<CreateAppSessionRequestStartParameters> startParameters;

    @NameInMap("StartParametersV2")
    public java.util.List<CreateAppSessionRequestStartParametersV2> startParametersV2;

    // 系统信息：如端侧机型等信息
    @NameInMap("SystemInfo")
    public java.util.List<CreateAppSessionRequestSystemInfo> systemInfo;

    @NameInMap("Timeout")
    public Long timeout;

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

    public CreateAppSessionRequest setDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public String getDatasetId() {
        return this.datasetId;
    }

    public CreateAppSessionRequest setEnablePostpaid(Boolean enablePostpaid) {
        this.enablePostpaid = enablePostpaid;
        return this;
    }
    public Boolean getEnablePostpaid() {
        return this.enablePostpaid;
    }

    public CreateAppSessionRequest setResultStore(CreateAppSessionRequestResultStore resultStore) {
        this.resultStore = resultStore;
        return this;
    }
    public CreateAppSessionRequestResultStore getResultStore() {
        return this.resultStore;
    }

    public CreateAppSessionRequest setStartParameters(java.util.List<CreateAppSessionRequestStartParameters> startParameters) {
        this.startParameters = startParameters;
        return this;
    }
    public java.util.List<CreateAppSessionRequestStartParameters> getStartParameters() {
        return this.startParameters;
    }

    public CreateAppSessionRequest setStartParametersV2(java.util.List<CreateAppSessionRequestStartParametersV2> startParametersV2) {
        this.startParametersV2 = startParametersV2;
        return this;
    }
    public java.util.List<CreateAppSessionRequestStartParametersV2> getStartParametersV2() {
        return this.startParametersV2;
    }

    public CreateAppSessionRequest setSystemInfo(java.util.List<CreateAppSessionRequestSystemInfo> systemInfo) {
        this.systemInfo = systemInfo;
        return this;
    }
    public java.util.List<CreateAppSessionRequestSystemInfo> getSystemInfo() {
        return this.systemInfo;
    }

    public CreateAppSessionRequest setTimeout(Long timeout) {
        this.timeout = timeout;
        return this;
    }
    public Long getTimeout() {
        return this.timeout;
    }

    public static class CreateAppSessionRequestResultStoreStoreInfo extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateAppSessionRequestResultStoreStoreInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateAppSessionRequestResultStoreStoreInfo self = new CreateAppSessionRequestResultStoreStoreInfo();
            return TeaModel.build(map, self);
        }

        public CreateAppSessionRequestResultStoreStoreInfo setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateAppSessionRequestResultStoreStoreInfo setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateAppSessionRequestResultStore extends TeaModel {
        @NameInMap("Need")
        public Boolean need;

        @NameInMap("StoreInfo")
        public java.util.List<CreateAppSessionRequestResultStoreStoreInfo> storeInfo;

        @NameInMap("Type")
        public String type;

        public static CreateAppSessionRequestResultStore build(java.util.Map<String, ?> map) throws Exception {
            CreateAppSessionRequestResultStore self = new CreateAppSessionRequestResultStore();
            return TeaModel.build(map, self);
        }

        public CreateAppSessionRequestResultStore setNeed(Boolean need) {
            this.need = need;
            return this;
        }
        public Boolean getNeed() {
            return this.need;
        }

        public CreateAppSessionRequestResultStore setStoreInfo(java.util.List<CreateAppSessionRequestResultStoreStoreInfo> storeInfo) {
            this.storeInfo = storeInfo;
            return this;
        }
        public java.util.List<CreateAppSessionRequestResultStoreStoreInfo> getStoreInfo() {
            return this.storeInfo;
        }

        public CreateAppSessionRequestResultStore setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateAppSessionRequestStartParameters extends TeaModel {
        // key
        @NameInMap("Key")
        public String key;

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

    public static class CreateAppSessionRequestStartParametersV2 extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public Object value;

        public static CreateAppSessionRequestStartParametersV2 build(java.util.Map<String, ?> map) throws Exception {
            CreateAppSessionRequestStartParametersV2 self = new CreateAppSessionRequestStartParametersV2();
            return TeaModel.build(map, self);
        }

        public CreateAppSessionRequestStartParametersV2 setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateAppSessionRequestStartParametersV2 setValue(Object value) {
            this.value = value;
            return this;
        }
        public Object getValue() {
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
