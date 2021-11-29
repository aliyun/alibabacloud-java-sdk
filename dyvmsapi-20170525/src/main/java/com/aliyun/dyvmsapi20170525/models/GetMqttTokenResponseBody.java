// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class GetMqttTokenResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetMqttTokenResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetMqttTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMqttTokenResponseBody self = new GetMqttTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMqttTokenResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetMqttTokenResponseBody setData(GetMqttTokenResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetMqttTokenResponseBodyData getData() {
        return this.data;
    }

    public GetMqttTokenResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetMqttTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetMqttTokenResponseBodyData extends TeaModel {
        @NameInMap("ClientId")
        public String clientId;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("Host")
        public String host;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("P2pTopic")
        public String p2pTopic;

        @NameInMap("ServerId")
        public String serverId;

        @NameInMap("Token")
        public String token;

        @NameInMap("Username")
        public String username;

        public static GetMqttTokenResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMqttTokenResponseBodyData self = new GetMqttTokenResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMqttTokenResponseBodyData setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public GetMqttTokenResponseBodyData setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public GetMqttTokenResponseBodyData setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public GetMqttTokenResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetMqttTokenResponseBodyData setP2pTopic(String p2pTopic) {
            this.p2pTopic = p2pTopic;
            return this;
        }
        public String getP2pTopic() {
            return this.p2pTopic;
        }

        public GetMqttTokenResponseBodyData setServerId(String serverId) {
            this.serverId = serverId;
            return this;
        }
        public String getServerId() {
            return this.serverId;
        }

        public GetMqttTokenResponseBodyData setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

        public GetMqttTokenResponseBodyData setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

}
