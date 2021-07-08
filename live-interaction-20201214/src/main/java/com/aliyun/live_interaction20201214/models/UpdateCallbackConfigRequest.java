// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class UpdateCallbackConfigRequest extends TeaModel {
    // 应用Id
    @NameInMap("AppId")
    public String appId;

    @NameInMap("RequestParams")
    public UpdateCallbackConfigRequestRequestParams requestParams;

    public static UpdateCallbackConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCallbackConfigRequest self = new UpdateCallbackConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCallbackConfigRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateCallbackConfigRequest setRequestParams(UpdateCallbackConfigRequestRequestParams requestParams) {
        this.requestParams = requestParams;
        return this;
    }
    public UpdateCallbackConfigRequestRequestParams getRequestParams() {
        return this.requestParams;
    }

    public static class UpdateCallbackConfigRequestRequestParams extends TeaModel {
        // 回调url
        @NameInMap("CallbackUrl")
        public String callbackUrl;

        // 加签密钥-key
        @NameInMap("SignatureKey")
        public String signatureKey;

        // 加签密钥-value
        @NameInMap("SignatureValue")
        public String signatureValue;

        // 回调api列表
        @NameInMap("Apis")
        public java.util.Map<String, Boolean> apis;

        // 回调列表
        @NameInMap("Spis")
        public java.util.Map<String, Boolean> spis;

        // 事件输出列表
        @NameInMap("Events")
        public java.util.Map<String, Boolean> events;

        public static UpdateCallbackConfigRequestRequestParams build(java.util.Map<String, ?> map) throws Exception {
            UpdateCallbackConfigRequestRequestParams self = new UpdateCallbackConfigRequestRequestParams();
            return TeaModel.build(map, self);
        }

        public UpdateCallbackConfigRequestRequestParams setCallbackUrl(String callbackUrl) {
            this.callbackUrl = callbackUrl;
            return this;
        }
        public String getCallbackUrl() {
            return this.callbackUrl;
        }

        public UpdateCallbackConfigRequestRequestParams setSignatureKey(String signatureKey) {
            this.signatureKey = signatureKey;
            return this;
        }
        public String getSignatureKey() {
            return this.signatureKey;
        }

        public UpdateCallbackConfigRequestRequestParams setSignatureValue(String signatureValue) {
            this.signatureValue = signatureValue;
            return this;
        }
        public String getSignatureValue() {
            return this.signatureValue;
        }

        public UpdateCallbackConfigRequestRequestParams setApis(java.util.Map<String, Boolean> apis) {
            this.apis = apis;
            return this;
        }
        public java.util.Map<String, Boolean> getApis() {
            return this.apis;
        }

        public UpdateCallbackConfigRequestRequestParams setSpis(java.util.Map<String, Boolean> spis) {
            this.spis = spis;
            return this;
        }
        public java.util.Map<String, Boolean> getSpis() {
            return this.spis;
        }

        public UpdateCallbackConfigRequestRequestParams setEvents(java.util.Map<String, Boolean> events) {
            this.events = events;
            return this;
        }
        public java.util.Map<String, Boolean> getEvents() {
            return this.events;
        }

    }

}
