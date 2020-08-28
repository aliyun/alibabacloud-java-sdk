// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class JoinLiveResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public JoinLiveResponseData data;

    public static JoinLiveResponse build(java.util.Map<String, ?> map) throws Exception {
        JoinLiveResponse self = new JoinLiveResponse();
        return TeaModel.build(map, self);
    }

    public JoinLiveResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public JoinLiveResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public JoinLiveResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public JoinLiveResponse setData(JoinLiveResponseData data) {
        this.data = data;
        return this;
    }
    public JoinLiveResponseData getData() {
        return this.data;
    }

    public static class JoinLiveResponseDataTokenDataTurn extends TeaModel {
        @NameInMap("Password")
        @Validation(required = true)
        public String password;

        @NameInMap("Username")
        @Validation(required = true)
        public String username;

        public static JoinLiveResponseDataTokenDataTurn build(java.util.Map<String, ?> map) throws Exception {
            JoinLiveResponseDataTokenDataTurn self = new JoinLiveResponseDataTokenDataTurn();
            return TeaModel.build(map, self);
        }

        public JoinLiveResponseDataTokenDataTurn setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public JoinLiveResponseDataTokenDataTurn setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class JoinLiveResponseDataTokenData extends TeaModel {
        @NameInMap("AppId")
        @Validation(required = true)
        public String appId;

        @NameInMap("LiveId")
        @Validation(required = true)
        public String liveId;

        @NameInMap("Nonce")
        @Validation(required = true)
        public String nonce;

        @NameInMap("Timestamp")
        @Validation(required = true)
        public Long timestamp;

        @NameInMap("Token")
        @Validation(required = true)
        public String token;

        @NameInMap("UserId")
        @Validation(required = true)
        public String userId;

        @NameInMap("Turn")
        @Validation(required = true)
        public JoinLiveResponseDataTokenDataTurn turn;

        @NameInMap("Gslb")
        @Validation(required = true)
        public java.util.List<String> gslb;

        public static JoinLiveResponseDataTokenData build(java.util.Map<String, ?> map) throws Exception {
            JoinLiveResponseDataTokenData self = new JoinLiveResponseDataTokenData();
            return TeaModel.build(map, self);
        }

        public JoinLiveResponseDataTokenData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public JoinLiveResponseDataTokenData setLiveId(String liveId) {
            this.liveId = liveId;
            return this;
        }
        public String getLiveId() {
            return this.liveId;
        }

        public JoinLiveResponseDataTokenData setNonce(String nonce) {
            this.nonce = nonce;
            return this;
        }
        public String getNonce() {
            return this.nonce;
        }

        public JoinLiveResponseDataTokenData setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public JoinLiveResponseDataTokenData setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

        public JoinLiveResponseDataTokenData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public JoinLiveResponseDataTokenData setTurn(JoinLiveResponseDataTokenDataTurn turn) {
            this.turn = turn;
            return this;
        }
        public JoinLiveResponseDataTokenDataTurn getTurn() {
            return this.turn;
        }

        public JoinLiveResponseDataTokenData setGslb(java.util.List<String> gslb) {
            this.gslb = gslb;
            return this;
        }
        public java.util.List<String> getGslb() {
            return this.gslb;
        }

    }

    public static class JoinLiveResponseData extends TeaModel {
        @NameInMap("Code")
        @Validation(required = true)
        public Integer code;

        @NameInMap("TokenData")
        @Validation(required = true)
        public JoinLiveResponseDataTokenData tokenData;

        public static JoinLiveResponseData build(java.util.Map<String, ?> map) throws Exception {
            JoinLiveResponseData self = new JoinLiveResponseData();
            return TeaModel.build(map, self);
        }

        public JoinLiveResponseData setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public JoinLiveResponseData setTokenData(JoinLiveResponseDataTokenData tokenData) {
            this.tokenData = tokenData;
            return this;
        }
        public JoinLiveResponseDataTokenData getTokenData() {
            return this.tokenData;
        }

    }

}
