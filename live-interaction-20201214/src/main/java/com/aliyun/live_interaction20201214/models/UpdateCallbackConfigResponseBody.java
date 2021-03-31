// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class UpdateCallbackConfigResponseBody extends TeaModel {
    // desc
    @NameInMap("Message")
    public String message;

    // requestId
    @NameInMap("RequestId")
    public String requestId;

    // httpStatusCode
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    // code
    @NameInMap("Code")
    public String code;

    // success
    @NameInMap("Success")
    public Boolean success;

    // result
    @NameInMap("Result")
    public UpdateCallbackConfigResponseBodyResult result;

    public static UpdateCallbackConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateCallbackConfigResponseBody self = new UpdateCallbackConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateCallbackConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateCallbackConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateCallbackConfigResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UpdateCallbackConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateCallbackConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public UpdateCallbackConfigResponseBody setResult(UpdateCallbackConfigResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public UpdateCallbackConfigResponseBodyResult getResult() {
        return this.result;
    }

    public static class UpdateCallbackConfigResponseBodyResultImConfigMsgConfig extends TeaModel {
        // 消息撤回时间间隔，毫秒
        @NameInMap("MsgRecallTimeInterval")
        public Long msgRecallTimeInterval;

        public static UpdateCallbackConfigResponseBodyResultImConfigMsgConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateCallbackConfigResponseBodyResultImConfigMsgConfig self = new UpdateCallbackConfigResponseBodyResultImConfigMsgConfig();
            return TeaModel.build(map, self);
        }

        public UpdateCallbackConfigResponseBodyResultImConfigMsgConfig setMsgRecallTimeInterval(Long msgRecallTimeInterval) {
            this.msgRecallTimeInterval = msgRecallTimeInterval;
            return this;
        }
        public Long getMsgRecallTimeInterval() {
            return this.msgRecallTimeInterval;
        }

    }

    public static class UpdateCallbackConfigResponseBodyResultImConfigCallbackConfig extends TeaModel {
        // 回调url
        @NameInMap("BackendUrl")
        public String backendUrl;

        // 加签密钥-key
        @NameInMap("SignatureKey")
        public String signatureKey;

        // 加签密钥-value
        @NameInMap("SignatureValue")
        public String signatureValue;

        // 回调方法列表
        @NameInMap("ApiIds")
        public java.util.List<String> apiIds;

        public static UpdateCallbackConfigResponseBodyResultImConfigCallbackConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateCallbackConfigResponseBodyResultImConfigCallbackConfig self = new UpdateCallbackConfigResponseBodyResultImConfigCallbackConfig();
            return TeaModel.build(map, self);
        }

        public UpdateCallbackConfigResponseBodyResultImConfigCallbackConfig setBackendUrl(String backendUrl) {
            this.backendUrl = backendUrl;
            return this;
        }
        public String getBackendUrl() {
            return this.backendUrl;
        }

        public UpdateCallbackConfigResponseBodyResultImConfigCallbackConfig setSignatureKey(String signatureKey) {
            this.signatureKey = signatureKey;
            return this;
        }
        public String getSignatureKey() {
            return this.signatureKey;
        }

        public UpdateCallbackConfigResponseBodyResultImConfigCallbackConfig setSignatureValue(String signatureValue) {
            this.signatureValue = signatureValue;
            return this;
        }
        public String getSignatureValue() {
            return this.signatureValue;
        }

        public UpdateCallbackConfigResponseBodyResultImConfigCallbackConfig setApiIds(java.util.List<String> apiIds) {
            this.apiIds = apiIds;
            return this;
        }
        public java.util.List<String> getApiIds() {
            return this.apiIds;
        }

    }

    public static class UpdateCallbackConfigResponseBodyResultImConfig extends TeaModel {
        // 消息配置
        @NameInMap("MsgConfig")
        public UpdateCallbackConfigResponseBodyResultImConfigMsgConfig msgConfig;

        // 回调配置
        @NameInMap("CallbackConfig")
        public UpdateCallbackConfigResponseBodyResultImConfigCallbackConfig callbackConfig;

        public static UpdateCallbackConfigResponseBodyResultImConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateCallbackConfigResponseBodyResultImConfig self = new UpdateCallbackConfigResponseBodyResultImConfig();
            return TeaModel.build(map, self);
        }

        public UpdateCallbackConfigResponseBodyResultImConfig setMsgConfig(UpdateCallbackConfigResponseBodyResultImConfigMsgConfig msgConfig) {
            this.msgConfig = msgConfig;
            return this;
        }
        public UpdateCallbackConfigResponseBodyResultImConfigMsgConfig getMsgConfig() {
            return this.msgConfig;
        }

        public UpdateCallbackConfigResponseBodyResultImConfig setCallbackConfig(UpdateCallbackConfigResponseBodyResultImConfigCallbackConfig callbackConfig) {
            this.callbackConfig = callbackConfig;
            return this;
        }
        public UpdateCallbackConfigResponseBodyResultImConfigCallbackConfig getCallbackConfig() {
            return this.callbackConfig;
        }

    }

    public static class UpdateCallbackConfigResponseBodyResult extends TeaModel {
        // im相关配置
        @NameInMap("ImConfig")
        public UpdateCallbackConfigResponseBodyResultImConfig imConfig;

        public static UpdateCallbackConfigResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpdateCallbackConfigResponseBodyResult self = new UpdateCallbackConfigResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpdateCallbackConfigResponseBodyResult setImConfig(UpdateCallbackConfigResponseBodyResultImConfig imConfig) {
            this.imConfig = imConfig;
            return this;
        }
        public UpdateCallbackConfigResponseBodyResultImConfig getImConfig() {
            return this.imConfig;
        }

    }

}
