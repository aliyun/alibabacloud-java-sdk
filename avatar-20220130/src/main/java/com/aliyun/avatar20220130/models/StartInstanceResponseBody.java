// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class StartInstanceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public StartInstanceResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("Success")
    public Boolean success;

    public static StartInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartInstanceResponseBody self = new StartInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public StartInstanceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public StartInstanceResponseBody setData(StartInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public StartInstanceResponseBodyData getData() {
        return this.data;
    }

    public StartInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public StartInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class StartInstanceResponseBodyDataChannel extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("ChannelId")
        public String channelId;

        @NameInMap("ExpiredTime")
        public String expiredTime;

        @NameInMap("Gslb")
        public java.util.List<String> gslb;

        @NameInMap("Nonce")
        public String nonce;

        @NameInMap("Token")
        public String token;

        @NameInMap("Type")
        public String type;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("UserInfoInChannel")
        public String userInfoInChannel;

        public static StartInstanceResponseBodyDataChannel build(java.util.Map<String, ?> map) throws Exception {
            StartInstanceResponseBodyDataChannel self = new StartInstanceResponseBodyDataChannel();
            return TeaModel.build(map, self);
        }

        public StartInstanceResponseBodyDataChannel setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public StartInstanceResponseBodyDataChannel setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public StartInstanceResponseBodyDataChannel setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public StartInstanceResponseBodyDataChannel setGslb(java.util.List<String> gslb) {
            this.gslb = gslb;
            return this;
        }
        public java.util.List<String> getGslb() {
            return this.gslb;
        }

        public StartInstanceResponseBodyDataChannel setNonce(String nonce) {
            this.nonce = nonce;
            return this;
        }
        public String getNonce() {
            return this.nonce;
        }

        public StartInstanceResponseBodyDataChannel setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

        public StartInstanceResponseBodyDataChannel setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public StartInstanceResponseBodyDataChannel setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public StartInstanceResponseBodyDataChannel setUserInfoInChannel(String userInfoInChannel) {
            this.userInfoInChannel = userInfoInChannel;
            return this;
        }
        public String getUserInfoInChannel() {
            return this.userInfoInChannel;
        }

    }

    public static class StartInstanceResponseBodyData extends TeaModel {
        @NameInMap("Channel")
        public StartInstanceResponseBodyDataChannel channel;

        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("SessionId")
        public String sessionId;

        public static StartInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            StartInstanceResponseBodyData self = new StartInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public StartInstanceResponseBodyData setChannel(StartInstanceResponseBodyDataChannel channel) {
            this.channel = channel;
            return this;
        }
        public StartInstanceResponseBodyDataChannel getChannel() {
            return this.channel;
        }

        public StartInstanceResponseBodyData setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public StartInstanceResponseBodyData setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

    }

}
