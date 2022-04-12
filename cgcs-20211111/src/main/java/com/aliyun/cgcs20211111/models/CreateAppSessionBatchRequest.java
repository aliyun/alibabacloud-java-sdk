// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class CreateAppSessionBatchRequest extends TeaModel {
    @NameInMap("AppInfos")
    public java.util.List<CreateAppSessionBatchRequestAppInfos> appInfos;

    @NameInMap("CustomTaskId")
    public String customTaskId;

    @NameInMap("Timeout")
    public Integer timeout;

    public static CreateAppSessionBatchRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppSessionBatchRequest self = new CreateAppSessionBatchRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppSessionBatchRequest setAppInfos(java.util.List<CreateAppSessionBatchRequestAppInfos> appInfos) {
        this.appInfos = appInfos;
        return this;
    }
    public java.util.List<CreateAppSessionBatchRequestAppInfos> getAppInfos() {
        return this.appInfos;
    }

    public CreateAppSessionBatchRequest setCustomTaskId(String customTaskId) {
        this.customTaskId = customTaskId;
        return this;
    }
    public String getCustomTaskId() {
        return this.customTaskId;
    }

    public CreateAppSessionBatchRequest setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

    public static class CreateAppSessionBatchRequestAppInfosStartParameters extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateAppSessionBatchRequestAppInfosStartParameters build(java.util.Map<String, ?> map) throws Exception {
            CreateAppSessionBatchRequestAppInfosStartParameters self = new CreateAppSessionBatchRequestAppInfosStartParameters();
            return TeaModel.build(map, self);
        }

        public CreateAppSessionBatchRequestAppInfosStartParameters setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateAppSessionBatchRequestAppInfosStartParameters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateAppSessionBatchRequestAppInfosSystemInfo extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateAppSessionBatchRequestAppInfosSystemInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateAppSessionBatchRequestAppInfosSystemInfo self = new CreateAppSessionBatchRequestAppInfosSystemInfo();
            return TeaModel.build(map, self);
        }

        public CreateAppSessionBatchRequestAppInfosSystemInfo setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateAppSessionBatchRequestAppInfosSystemInfo setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateAppSessionBatchRequestAppInfos extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("AppVersion")
        public String appVersion;

        @NameInMap("ClientIp")
        public String clientIp;

        @NameInMap("CustomUserId")
        public String customUserId;

        @NameInMap("CustomerSessionId")
        public String customerSessionId;

        @NameInMap("StartParameters")
        public java.util.List<CreateAppSessionBatchRequestAppInfosStartParameters> startParameters;

        @NameInMap("SystemInfo")
        public java.util.List<CreateAppSessionBatchRequestAppInfosSystemInfo> systemInfo;

        public static CreateAppSessionBatchRequestAppInfos build(java.util.Map<String, ?> map) throws Exception {
            CreateAppSessionBatchRequestAppInfos self = new CreateAppSessionBatchRequestAppInfos();
            return TeaModel.build(map, self);
        }

        public CreateAppSessionBatchRequestAppInfos setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public CreateAppSessionBatchRequestAppInfos setAppVersion(String appVersion) {
            this.appVersion = appVersion;
            return this;
        }
        public String getAppVersion() {
            return this.appVersion;
        }

        public CreateAppSessionBatchRequestAppInfos setClientIp(String clientIp) {
            this.clientIp = clientIp;
            return this;
        }
        public String getClientIp() {
            return this.clientIp;
        }

        public CreateAppSessionBatchRequestAppInfos setCustomUserId(String customUserId) {
            this.customUserId = customUserId;
            return this;
        }
        public String getCustomUserId() {
            return this.customUserId;
        }

        public CreateAppSessionBatchRequestAppInfos setCustomerSessionId(String customerSessionId) {
            this.customerSessionId = customerSessionId;
            return this;
        }
        public String getCustomerSessionId() {
            return this.customerSessionId;
        }

        public CreateAppSessionBatchRequestAppInfos setStartParameters(java.util.List<CreateAppSessionBatchRequestAppInfosStartParameters> startParameters) {
            this.startParameters = startParameters;
            return this;
        }
        public java.util.List<CreateAppSessionBatchRequestAppInfosStartParameters> getStartParameters() {
            return this.startParameters;
        }

        public CreateAppSessionBatchRequestAppInfos setSystemInfo(java.util.List<CreateAppSessionBatchRequestAppInfosSystemInfo> systemInfo) {
            this.systemInfo = systemInfo;
            return this;
        }
        public java.util.List<CreateAppSessionBatchRequestAppInfosSystemInfo> getSystemInfo() {
            return this.systemInfo;
        }

    }

}
