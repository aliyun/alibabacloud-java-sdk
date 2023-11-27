// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class UpdateCallbackConfigRequest extends TeaModel {
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

        public static UpdateCallbackConfigRequestRequestParams build(java.util.Map<String, ?> map) throws Exception {
            UpdateCallbackConfigRequestRequestParams self = new UpdateCallbackConfigRequestRequestParams();
            return TeaModel.build(map, self);
        }

        public UpdateCallbackConfigRequestRequestParams setApis(java.util.Map<String, Boolean> apis) {
            this.apis = apis;
            return this;
        }
        public java.util.Map<String, Boolean> getApis() {
            return this.apis;
        }

        public UpdateCallbackConfigRequestRequestParams setCallbackUrl(String callbackUrl) {
            this.callbackUrl = callbackUrl;
            return this;
        }
        public String getCallbackUrl() {
            return this.callbackUrl;
        }

        public UpdateCallbackConfigRequestRequestParams setEvents(java.util.Map<String, Boolean> events) {
            this.events = events;
            return this;
        }
        public java.util.Map<String, Boolean> getEvents() {
            return this.events;
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

        public UpdateCallbackConfigRequestRequestParams setSpis(java.util.Map<String, Boolean> spis) {
            this.spis = spis;
            return this;
        }
        public java.util.Map<String, Boolean> getSpis() {
            return this.spis;
        }

    }

}
