// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetLoginDetailsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetLoginDetailsResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("Params")
    public java.util.List<String> params;

    @NameInMap("RequestId")
    public String requestId;

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

    public GetLoginDetailsResponseBody setData(GetLoginDetailsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetLoginDetailsResponseBodyData getData() {
        return this.data;
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

    public GetLoginDetailsResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public GetLoginDetailsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetLoginDetailsResponseBodyData extends TeaModel {
        @NameInMap("AgentServerUrl")
        public String agentServerUrl;

        @NameInMap("AvatarUrl")
        public String avatarUrl;

        @NameInMap("ChatAppId")
        public String chatAppId;

        @NameInMap("ChatAppKey")
        public String chatAppKey;

        @NameInMap("ChatDeviceId")
        public String chatDeviceId;

        @NameInMap("ChatLoginToken")
        public String chatLoginToken;

        @NameInMap("ChatServerUrl")
        public String chatServerUrl;

        @NameInMap("ChatUserId")
        public String chatUserId;

        @NameInMap("DeviceExt")
        public String deviceExt;

        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("DeviceState")
        public String deviceState;

        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("Extension")
        public String extension;

        @NameInMap("Nickname")
        public String nickname;

        @NameInMap("Signature")
        public String signature;

        @NameInMap("Signature2")
        public String signature2;

        @NameInMap("SipServerUrl")
        public String sipServerUrl;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("UserKey")
        public String userKey;

        @NameInMap("UserKey2")
        public String userKey2;

        @NameInMap("WorkMode")
        public String workMode;

        public static GetLoginDetailsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetLoginDetailsResponseBodyData self = new GetLoginDetailsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetLoginDetailsResponseBodyData setAgentServerUrl(String agentServerUrl) {
            this.agentServerUrl = agentServerUrl;
            return this;
        }
        public String getAgentServerUrl() {
            return this.agentServerUrl;
        }

        public GetLoginDetailsResponseBodyData setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public GetLoginDetailsResponseBodyData setChatAppId(String chatAppId) {
            this.chatAppId = chatAppId;
            return this;
        }
        public String getChatAppId() {
            return this.chatAppId;
        }

        public GetLoginDetailsResponseBodyData setChatAppKey(String chatAppKey) {
            this.chatAppKey = chatAppKey;
            return this;
        }
        public String getChatAppKey() {
            return this.chatAppKey;
        }

        public GetLoginDetailsResponseBodyData setChatDeviceId(String chatDeviceId) {
            this.chatDeviceId = chatDeviceId;
            return this;
        }
        public String getChatDeviceId() {
            return this.chatDeviceId;
        }

        public GetLoginDetailsResponseBodyData setChatLoginToken(String chatLoginToken) {
            this.chatLoginToken = chatLoginToken;
            return this;
        }
        public String getChatLoginToken() {
            return this.chatLoginToken;
        }

        public GetLoginDetailsResponseBodyData setChatServerUrl(String chatServerUrl) {
            this.chatServerUrl = chatServerUrl;
            return this;
        }
        public String getChatServerUrl() {
            return this.chatServerUrl;
        }

        public GetLoginDetailsResponseBodyData setChatUserId(String chatUserId) {
            this.chatUserId = chatUserId;
            return this;
        }
        public String getChatUserId() {
            return this.chatUserId;
        }

        public GetLoginDetailsResponseBodyData setDeviceExt(String deviceExt) {
            this.deviceExt = deviceExt;
            return this;
        }
        public String getDeviceExt() {
            return this.deviceExt;
        }

        public GetLoginDetailsResponseBodyData setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public GetLoginDetailsResponseBodyData setDeviceState(String deviceState) {
            this.deviceState = deviceState;
            return this;
        }
        public String getDeviceState() {
            return this.deviceState;
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

        public GetLoginDetailsResponseBodyData setNickname(String nickname) {
            this.nickname = nickname;
            return this;
        }
        public String getNickname() {
            return this.nickname;
        }

        public GetLoginDetailsResponseBodyData setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

        public GetLoginDetailsResponseBodyData setSignature2(String signature2) {
            this.signature2 = signature2;
            return this;
        }
        public String getSignature2() {
            return this.signature2;
        }

        public GetLoginDetailsResponseBodyData setSipServerUrl(String sipServerUrl) {
            this.sipServerUrl = sipServerUrl;
            return this;
        }
        public String getSipServerUrl() {
            return this.sipServerUrl;
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

        public GetLoginDetailsResponseBodyData setUserKey2(String userKey2) {
            this.userKey2 = userKey2;
            return this;
        }
        public String getUserKey2() {
            return this.userKey2;
        }

        public GetLoginDetailsResponseBodyData setWorkMode(String workMode) {
            this.workMode = workMode;
            return this;
        }
        public String getWorkMode() {
            return this.workMode;
        }

    }

}
