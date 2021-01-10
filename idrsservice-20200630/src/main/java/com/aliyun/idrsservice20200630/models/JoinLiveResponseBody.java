// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class JoinLiveResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public JoinLiveResponseBodyData data;

    @NameInMap("Code")
    public String code;

    public static JoinLiveResponseBody build(java.util.Map<String, ?> map) throws Exception {
        JoinLiveResponseBody self = new JoinLiveResponseBody();
        return TeaModel.build(map, self);
    }

    public JoinLiveResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public JoinLiveResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public JoinLiveResponseBody setData(JoinLiveResponseBodyData data) {
        this.data = data;
        return this;
    }
    public JoinLiveResponseBodyData getData() {
        return this.data;
    }

    public JoinLiveResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class JoinLiveResponseBodyDataTokenDataTurn extends TeaModel {
        @NameInMap("Password")
        public String password;

        @NameInMap("Username")
        public String username;

        public static JoinLiveResponseBodyDataTokenDataTurn build(java.util.Map<String, ?> map) throws Exception {
            JoinLiveResponseBodyDataTokenDataTurn self = new JoinLiveResponseBodyDataTokenDataTurn();
            return TeaModel.build(map, self);
        }

        public JoinLiveResponseBodyDataTokenDataTurn setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public JoinLiveResponseBodyDataTokenDataTurn setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class JoinLiveResponseBodyDataTokenData extends TeaModel {
        @NameInMap("Turn")
        public JoinLiveResponseBodyDataTokenDataTurn turn;

        @NameInMap("Token")
        public String token;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("Nonce")
        public String nonce;

        @NameInMap("Gslb")
        public java.util.List<String> gslb;

        @NameInMap("LiveId")
        public String liveId;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("Timestamp")
        public Long timestamp;

        public static JoinLiveResponseBodyDataTokenData build(java.util.Map<String, ?> map) throws Exception {
            JoinLiveResponseBodyDataTokenData self = new JoinLiveResponseBodyDataTokenData();
            return TeaModel.build(map, self);
        }

        public JoinLiveResponseBodyDataTokenData setTurn(JoinLiveResponseBodyDataTokenDataTurn turn) {
            this.turn = turn;
            return this;
        }
        public JoinLiveResponseBodyDataTokenDataTurn getTurn() {
            return this.turn;
        }

        public JoinLiveResponseBodyDataTokenData setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

        public JoinLiveResponseBodyDataTokenData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public JoinLiveResponseBodyDataTokenData setNonce(String nonce) {
            this.nonce = nonce;
            return this;
        }
        public String getNonce() {
            return this.nonce;
        }

        public JoinLiveResponseBodyDataTokenData setGslb(java.util.List<String> gslb) {
            this.gslb = gslb;
            return this;
        }
        public java.util.List<String> getGslb() {
            return this.gslb;
        }

        public JoinLiveResponseBodyDataTokenData setLiveId(String liveId) {
            this.liveId = liveId;
            return this;
        }
        public String getLiveId() {
            return this.liveId;
        }

        public JoinLiveResponseBodyDataTokenData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public JoinLiveResponseBodyDataTokenData setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

    public static class JoinLiveResponseBodyData extends TeaModel {
        @NameInMap("Code")
        public Integer code;

        @NameInMap("TokenData")
        public JoinLiveResponseBodyDataTokenData tokenData;

        public static JoinLiveResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            JoinLiveResponseBodyData self = new JoinLiveResponseBodyData();
            return TeaModel.build(map, self);
        }

        public JoinLiveResponseBodyData setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public JoinLiveResponseBodyData setTokenData(JoinLiveResponseBodyDataTokenData tokenData) {
            this.tokenData = tokenData;
            return this;
        }
        public JoinLiveResponseBodyDataTokenData getTokenData() {
            return this.tokenData;
        }

    }

}
