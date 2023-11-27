// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class GetIMConfigResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Messaage")
    public String messaage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public GetIMConfigResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static GetIMConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetIMConfigResponseBody self = new GetIMConfigResponseBody();
        return TeaModel.build(map, self);
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

    public GetIMConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetIMConfigResponseBody setResult(GetIMConfigResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetIMConfigResponseBodyResult getResult() {
        return this.result;
    }

    public GetIMConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetIMConfigResponseBodyResultImConfigCallbackConfig extends TeaModel {
        @NameInMap("Apis")
        public java.util.Map<String, Boolean> apis;

        @NameInMap("CallbackUrl")
        public String callbackUrl;

        @NameInMap("Events")
        public java.util.Map<String, Boolean> events;

        @NameInMap("SignatureKey")
        public String signatureKey;

        @NameInMap("SignatureValue")
        public String signatureValue;

        @NameInMap("Spis")
        public java.util.Map<String, Boolean> spis;

        public static GetIMConfigResponseBodyResultImConfigCallbackConfig build(java.util.Map<String, ?> map) throws Exception {
            GetIMConfigResponseBodyResultImConfigCallbackConfig self = new GetIMConfigResponseBodyResultImConfigCallbackConfig();
            return TeaModel.build(map, self);
        }

        public GetIMConfigResponseBodyResultImConfigCallbackConfig setApis(java.util.Map<String, Boolean> apis) {
            this.apis = apis;
            return this;
        }
        public java.util.Map<String, Boolean> getApis() {
            return this.apis;
        }

        public GetIMConfigResponseBodyResultImConfigCallbackConfig setCallbackUrl(String callbackUrl) {
            this.callbackUrl = callbackUrl;
            return this;
        }
        public String getCallbackUrl() {
            return this.callbackUrl;
        }

        public GetIMConfigResponseBodyResultImConfigCallbackConfig setEvents(java.util.Map<String, Boolean> events) {
            this.events = events;
            return this;
        }
        public java.util.Map<String, Boolean> getEvents() {
            return this.events;
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

        public GetIMConfigResponseBodyResultImConfigCallbackConfig setSpis(java.util.Map<String, Boolean> spis) {
            this.spis = spis;
            return this;
        }
        public java.util.Map<String, Boolean> getSpis() {
            return this.spis;
        }

    }

    public static class GetIMConfigResponseBodyResultImConfigMsgConfig extends TeaModel {
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

    public static class GetIMConfigResponseBodyResultImConfig extends TeaModel {
        @NameInMap("CallbackConfig")
        public GetIMConfigResponseBodyResultImConfigCallbackConfig callbackConfig;

        @NameInMap("MsgConfig")
        public GetIMConfigResponseBodyResultImConfigMsgConfig msgConfig;

        public static GetIMConfigResponseBodyResultImConfig build(java.util.Map<String, ?> map) throws Exception {
            GetIMConfigResponseBodyResultImConfig self = new GetIMConfigResponseBodyResultImConfig();
            return TeaModel.build(map, self);
        }

        public GetIMConfigResponseBodyResultImConfig setCallbackConfig(GetIMConfigResponseBodyResultImConfigCallbackConfig callbackConfig) {
            this.callbackConfig = callbackConfig;
            return this;
        }
        public GetIMConfigResponseBodyResultImConfigCallbackConfig getCallbackConfig() {
            return this.callbackConfig;
        }

        public GetIMConfigResponseBodyResultImConfig setMsgConfig(GetIMConfigResponseBodyResultImConfigMsgConfig msgConfig) {
            this.msgConfig = msgConfig;
            return this;
        }
        public GetIMConfigResponseBodyResultImConfigMsgConfig getMsgConfig() {
            return this.msgConfig;
        }

    }

    public static class GetIMConfigResponseBodyResult extends TeaModel {
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
