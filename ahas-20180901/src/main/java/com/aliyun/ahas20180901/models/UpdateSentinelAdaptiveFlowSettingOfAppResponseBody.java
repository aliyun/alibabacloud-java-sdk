// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class UpdateSentinelAdaptiveFlowSettingOfAppResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public UpdateSentinelAdaptiveFlowSettingOfAppResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static UpdateSentinelAdaptiveFlowSettingOfAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSentinelAdaptiveFlowSettingOfAppResponseBody self = new UpdateSentinelAdaptiveFlowSettingOfAppResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSentinelAdaptiveFlowSettingOfAppResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateSentinelAdaptiveFlowSettingOfAppResponseBody setData(UpdateSentinelAdaptiveFlowSettingOfAppResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateSentinelAdaptiveFlowSettingOfAppResponseBodyData getData() {
        return this.data;
    }

    public UpdateSentinelAdaptiveFlowSettingOfAppResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateSentinelAdaptiveFlowSettingOfAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateSentinelAdaptiveFlowSettingOfAppResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateSentinelAdaptiveFlowSettingOfAppResponseBodyData extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("EnableAutoSystemAdaptive")
        public Boolean enableAutoSystemAdaptive;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("UserId")
        public String userId;

        public static UpdateSentinelAdaptiveFlowSettingOfAppResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateSentinelAdaptiveFlowSettingOfAppResponseBodyData self = new UpdateSentinelAdaptiveFlowSettingOfAppResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateSentinelAdaptiveFlowSettingOfAppResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public UpdateSentinelAdaptiveFlowSettingOfAppResponseBodyData setEnableAutoSystemAdaptive(Boolean enableAutoSystemAdaptive) {
            this.enableAutoSystemAdaptive = enableAutoSystemAdaptive;
            return this;
        }
        public Boolean getEnableAutoSystemAdaptive() {
            return this.enableAutoSystemAdaptive;
        }

        public UpdateSentinelAdaptiveFlowSettingOfAppResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public UpdateSentinelAdaptiveFlowSettingOfAppResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
