// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class GetIMConfigResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    // 错误码
    @NameInMap("Code")
    public String code;

    // 网络错误码
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    // 错误信息
    @NameInMap("Messaage")
    public String messaage;

    // 返回结果
    @NameInMap("Result")
    public GetIMConfigResponseBodyResult result;

    public static GetIMConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetIMConfigResponseBody self = new GetIMConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetIMConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetIMConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetIMConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetIMConfigResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetIMConfigResponseBody setMessaage(String messaage) {
        this.messaage = messaage;
        return this;
    }
    public String getMessaage() {
        return this.messaage;
    }

    public GetIMConfigResponseBody setResult(GetIMConfigResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetIMConfigResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetIMConfigResponseBodyResultImConfigMsgConfig extends TeaModel {
        // 消息撤回时间，分钟
        @NameInMap("ClientMsgRecallTimeIntervalMinute")
        public Long clientMsgRecallTimeIntervalMinute;

        public static GetIMConfigResponseBodyResultImConfigMsgConfig build(java.util.Map<String, ?> map) throws Exception {
            GetIMConfigResponseBodyResultImConfigMsgConfig self = new GetIMConfigResponseBodyResultImConfigMsgConfig();
            return TeaModel.build(map, self);
        }

        public GetIMConfigResponseBodyResultImConfigMsgConfig setClientMsgRecallTimeIntervalMinute(Long clientMsgRecallTimeIntervalMinute) {
            this.clientMsgRecallTimeIntervalMinute = clientMsgRecallTimeIntervalMinute;
            return this;
        }
        public Long getClientMsgRecallTimeIntervalMinute() {
            return this.clientMsgRecallTimeIntervalMinute;
        }

    }

    public static class GetIMConfigResponseBodyResultImConfigCallbackConfig extends TeaModel {
        // 回调url，支持外部url
        @NameInMap("CallbackUrl")
        public String callbackUrl;

        // 加签密钥-key
        @NameInMap("SignatureKey")
        public String signatureKey;

        // 加签密钥-value
        @NameInMap("SignatureValue")
        public String signatureValue;

        // 已开通的回调方法Id列表
        @NameInMap("Apis")
        public java.util.Map<String, Boolean> apis;

        // 已开通的回调方法Id列表
        @NameInMap("Spis")
        public java.util.Map<String, Boolean> spis;

        // 已开通的事件输出列表
        @NameInMap("Events")
        public java.util.Map<String, Boolean> events;

        public static GetIMConfigResponseBodyResultImConfigCallbackConfig build(java.util.Map<String, ?> map) throws Exception {
            GetIMConfigResponseBodyResultImConfigCallbackConfig self = new GetIMConfigResponseBodyResultImConfigCallbackConfig();
            return TeaModel.build(map, self);
        }

        public GetIMConfigResponseBodyResultImConfigCallbackConfig setCallbackUrl(String callbackUrl) {
            this.callbackUrl = callbackUrl;
            return this;
        }
        public String getCallbackUrl() {
            return this.callbackUrl;
        }

        public GetIMConfigResponseBodyResultImConfigCallbackConfig setSignatureKey(String signatureKey) {
            this.signatureKey = signatureKey;
            return this;
        }
        public String getSignatureKey() {
            return this.signatureKey;
        }

        public GetIMConfigResponseBodyResultImConfigCallbackConfig setSignatureValue(String signatureValue) {
            this.signatureValue = signatureValue;
            return this;
        }
        public String getSignatureValue() {
            return this.signatureValue;
        }

        public GetIMConfigResponseBodyResultImConfigCallbackConfig setApis(java.util.Map<String, Boolean> apis) {
            this.apis = apis;
            return this;
        }
        public java.util.Map<String, Boolean> getApis() {
            return this.apis;
        }

        public GetIMConfigResponseBodyResultImConfigCallbackConfig setSpis(java.util.Map<String, Boolean> spis) {
            this.spis = spis;
            return this;
        }
        public java.util.Map<String, Boolean> getSpis() {
            return this.spis;
        }

        public GetIMConfigResponseBodyResultImConfigCallbackConfig setEvents(java.util.Map<String, Boolean> events) {
            this.events = events;
            return this;
        }
        public java.util.Map<String, Boolean> getEvents() {
            return this.events;
        }

    }

    public static class GetIMConfigResponseBodyResultImConfig extends TeaModel {
        // 消息配置
        @NameInMap("MsgConfig")
        public GetIMConfigResponseBodyResultImConfigMsgConfig msgConfig;

        // 回调配置
        @NameInMap("CallbackConfig")
        public GetIMConfigResponseBodyResultImConfigCallbackConfig callbackConfig;

        public static GetIMConfigResponseBodyResultImConfig build(java.util.Map<String, ?> map) throws Exception {
            GetIMConfigResponseBodyResultImConfig self = new GetIMConfigResponseBodyResultImConfig();
            return TeaModel.build(map, self);
        }

        public GetIMConfigResponseBodyResultImConfig setMsgConfig(GetIMConfigResponseBodyResultImConfigMsgConfig msgConfig) {
            this.msgConfig = msgConfig;
            return this;
        }
        public GetIMConfigResponseBodyResultImConfigMsgConfig getMsgConfig() {
            return this.msgConfig;
        }

        public GetIMConfigResponseBodyResultImConfig setCallbackConfig(GetIMConfigResponseBodyResultImConfigCallbackConfig callbackConfig) {
            this.callbackConfig = callbackConfig;
            return this;
        }
        public GetIMConfigResponseBodyResultImConfigCallbackConfig getCallbackConfig() {
            return this.callbackConfig;
        }

    }

    public static class GetIMConfigResponseBodyResult extends TeaModel {
        // im相关配置
        @NameInMap("ImConfig")
        public GetIMConfigResponseBodyResultImConfig imConfig;

        public static GetIMConfigResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetIMConfigResponseBodyResult self = new GetIMConfigResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetIMConfigResponseBodyResult setImConfig(GetIMConfigResponseBodyResultImConfig imConfig) {
            this.imConfig = imConfig;
            return this;
        }
        public GetIMConfigResponseBodyResultImConfig getImConfig() {
            return this.imConfig;
        }

    }

}
