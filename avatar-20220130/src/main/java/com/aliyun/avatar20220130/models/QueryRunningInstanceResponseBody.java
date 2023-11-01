// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class QueryRunningInstanceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<QueryRunningInstanceResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryRunningInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRunningInstanceResponseBody self = new QueryRunningInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRunningInstanceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryRunningInstanceResponseBody setData(java.util.List<QueryRunningInstanceResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryRunningInstanceResponseBodyData> getData() {
        return this.data;
    }

    public QueryRunningInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryRunningInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRunningInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryRunningInstanceResponseBodyDataChannel extends TeaModel {
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

        public static QueryRunningInstanceResponseBodyDataChannel build(java.util.Map<String, ?> map) throws Exception {
            QueryRunningInstanceResponseBodyDataChannel self = new QueryRunningInstanceResponseBodyDataChannel();
            return TeaModel.build(map, self);
        }

        public QueryRunningInstanceResponseBodyDataChannel setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public QueryRunningInstanceResponseBodyDataChannel setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public QueryRunningInstanceResponseBodyDataChannel setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public QueryRunningInstanceResponseBodyDataChannel setGslb(java.util.List<String> gslb) {
            this.gslb = gslb;
            return this;
        }
        public java.util.List<String> getGslb() {
            return this.gslb;
        }

        public QueryRunningInstanceResponseBodyDataChannel setNonce(String nonce) {
            this.nonce = nonce;
            return this;
        }
        public String getNonce() {
            return this.nonce;
        }

        public QueryRunningInstanceResponseBodyDataChannel setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

        public QueryRunningInstanceResponseBodyDataChannel setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryRunningInstanceResponseBodyDataChannel setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public QueryRunningInstanceResponseBodyDataChannel setUserInfoInChannel(String userInfoInChannel) {
            this.userInfoInChannel = userInfoInChannel;
            return this;
        }
        public String getUserInfoInChannel() {
            return this.userInfoInChannel;
        }

    }

    public static class QueryRunningInstanceResponseBodyDataUser extends TeaModel {
        @NameInMap("UserId")
        public String userId;

        @NameInMap("UserName")
        public String userName;

        public static QueryRunningInstanceResponseBodyDataUser build(java.util.Map<String, ?> map) throws Exception {
            QueryRunningInstanceResponseBodyDataUser self = new QueryRunningInstanceResponseBodyDataUser();
            return TeaModel.build(map, self);
        }

        public QueryRunningInstanceResponseBodyDataUser setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public QueryRunningInstanceResponseBodyDataUser setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class QueryRunningInstanceResponseBodyData extends TeaModel {
        @NameInMap("Channel")
        public QueryRunningInstanceResponseBodyDataChannel channel;

        @NameInMap("SessionId")
        public String sessionId;

        @NameInMap("Token")
        public String token;

        @NameInMap("User")
        public QueryRunningInstanceResponseBodyDataUser user;

        public static QueryRunningInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryRunningInstanceResponseBodyData self = new QueryRunningInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryRunningInstanceResponseBodyData setChannel(QueryRunningInstanceResponseBodyDataChannel channel) {
            this.channel = channel;
            return this;
        }
        public QueryRunningInstanceResponseBodyDataChannel getChannel() {
            return this.channel;
        }

        public QueryRunningInstanceResponseBodyData setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public QueryRunningInstanceResponseBodyData setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

        public QueryRunningInstanceResponseBodyData setUser(QueryRunningInstanceResponseBodyDataUser user) {
            this.user = user;
            return this;
        }
        public QueryRunningInstanceResponseBodyDataUser getUser() {
            return this.user;
        }

    }

}
