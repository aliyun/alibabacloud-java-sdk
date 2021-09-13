// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetLoginDetailsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Params")
    public java.util.List<String> params;

    @NameInMap("Data")
    public GetLoginDetailsResponseBodyData data;

    public static GetLoginDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLoginDetailsResponseBody self = new GetLoginDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLoginDetailsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetLoginDetailsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetLoginDetailsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLoginDetailsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLoginDetailsResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public GetLoginDetailsResponseBody setData(GetLoginDetailsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetLoginDetailsResponseBodyData getData() {
        return this.data;
    }

    public static class GetLoginDetailsResponseBodyData extends TeaModel {
        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("Extension")
        public String extension;

        @NameInMap("Signature")
        public String signature;

        @NameInMap("SipServerUrl")
        public String sipServerUrl;

        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("AgentServerUrl")
        public String agentServerUrl;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("UserKey")
        public String userKey;

        public static GetLoginDetailsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetLoginDetailsResponseBodyData self = new GetLoginDetailsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetLoginDetailsResponseBodyData setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetLoginDetailsResponseBodyData setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public GetLoginDetailsResponseBodyData setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

        public GetLoginDetailsResponseBodyData setSipServerUrl(String sipServerUrl) {
            this.sipServerUrl = sipServerUrl;
            return this;
        }
        public String getSipServerUrl() {
            return this.sipServerUrl;
        }

        public GetLoginDetailsResponseBodyData setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public GetLoginDetailsResponseBodyData setAgentServerUrl(String agentServerUrl) {
            this.agentServerUrl = agentServerUrl;
            return this;
        }
        public String getAgentServerUrl() {
            return this.agentServerUrl;
        }

        public GetLoginDetailsResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public GetLoginDetailsResponseBodyData setUserKey(String userKey) {
            this.userKey = userKey;
            return this;
        }
        public String getUserKey() {
            return this.userKey;
        }

    }

}
