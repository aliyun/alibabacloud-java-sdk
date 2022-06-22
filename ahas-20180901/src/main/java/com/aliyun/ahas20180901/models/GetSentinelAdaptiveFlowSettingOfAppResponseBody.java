// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class GetSentinelAdaptiveFlowSettingOfAppResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetSentinelAdaptiveFlowSettingOfAppResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetSentinelAdaptiveFlowSettingOfAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSentinelAdaptiveFlowSettingOfAppResponseBody self = new GetSentinelAdaptiveFlowSettingOfAppResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSentinelAdaptiveFlowSettingOfAppResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSentinelAdaptiveFlowSettingOfAppResponseBody setData(GetSentinelAdaptiveFlowSettingOfAppResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSentinelAdaptiveFlowSettingOfAppResponseBodyData getData() {
        return this.data;
    }

    public GetSentinelAdaptiveFlowSettingOfAppResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSentinelAdaptiveFlowSettingOfAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSentinelAdaptiveFlowSettingOfAppResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetSentinelAdaptiveFlowSettingOfAppResponseBodyData extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("EnableAutoSystemAdaptive")
        public Boolean enableAutoSystemAdaptive;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("UserId")
        public String userId;

        public static GetSentinelAdaptiveFlowSettingOfAppResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSentinelAdaptiveFlowSettingOfAppResponseBodyData self = new GetSentinelAdaptiveFlowSettingOfAppResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSentinelAdaptiveFlowSettingOfAppResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public GetSentinelAdaptiveFlowSettingOfAppResponseBodyData setEnableAutoSystemAdaptive(Boolean enableAutoSystemAdaptive) {
            this.enableAutoSystemAdaptive = enableAutoSystemAdaptive;
            return this;
        }
        public Boolean getEnableAutoSystemAdaptive() {
            return this.enableAutoSystemAdaptive;
        }

        public GetSentinelAdaptiveFlowSettingOfAppResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public GetSentinelAdaptiveFlowSettingOfAppResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
