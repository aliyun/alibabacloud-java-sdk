// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelservice20220614.models;

import com.aliyun.tea.*;

public class GetUserResponseBody extends TeaModel {
    @NameInMap("AnthropicHost")
    public String anthropicHost;

    @NameInMap("ApiKeys")
    public java.util.List<GetUserResponseBodyApiKeys> apiKeys;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("Code")
    public String code;

    @NameInMap("DashscopeHost")
    public String dashscopeHost;

    @NameInMap("Host")
    public String host;

    @NameInMap("InnerToken")
    public String innerToken;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Token")
    public String token;

    public static GetUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserResponseBody self = new GetUserResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserResponseBody setAnthropicHost(String anthropicHost) {
        this.anthropicHost = anthropicHost;
        return this;
    }
    public String getAnthropicHost() {
        return this.anthropicHost;
    }

    public GetUserResponseBody setApiKeys(java.util.List<GetUserResponseBodyApiKeys> apiKeys) {
        this.apiKeys = apiKeys;
        return this;
    }
    public java.util.List<GetUserResponseBodyApiKeys> getApiKeys() {
        return this.apiKeys;
    }

    public GetUserResponseBody setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetUserResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetUserResponseBody setDashscopeHost(String dashscopeHost) {
        this.dashscopeHost = dashscopeHost;
        return this;
    }
    public String getDashscopeHost() {
        return this.dashscopeHost;
    }

    public GetUserResponseBody setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public GetUserResponseBody setInnerToken(String innerToken) {
        this.innerToken = innerToken;
        return this;
    }
    public String getInnerToken() {
        return this.innerToken;
    }

    public GetUserResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserResponseBody setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public static class GetUserResponseBodyApiKeys extends TeaModel {
        @NameInMap("ApiKey")
        public String apiKey;

        @NameInMap("InnerApiKey")
        public String innerApiKey;

        public static GetUserResponseBodyApiKeys build(java.util.Map<String, ?> map) throws Exception {
            GetUserResponseBodyApiKeys self = new GetUserResponseBodyApiKeys();
            return TeaModel.build(map, self);
        }

        public GetUserResponseBodyApiKeys setApiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }
        public String getApiKey() {
            return this.apiKey;
        }

        public GetUserResponseBodyApiKeys setInnerApiKey(String innerApiKey) {
            this.innerApiKey = innerApiKey;
            return this;
        }
        public String getInnerApiKey() {
            return this.innerApiKey;
        }

    }

}
