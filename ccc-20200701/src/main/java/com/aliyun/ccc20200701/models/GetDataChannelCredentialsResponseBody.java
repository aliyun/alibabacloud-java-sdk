// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetDataChannelCredentialsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetDataChannelCredentialsResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("Params")
    public java.util.List<String> params;

    @NameInMap("RequestId")
    public String requestId;

    public static GetDataChannelCredentialsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDataChannelCredentialsResponseBody self = new GetDataChannelCredentialsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDataChannelCredentialsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDataChannelCredentialsResponseBody setData(GetDataChannelCredentialsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDataChannelCredentialsResponseBodyData getData() {
        return this.data;
    }

    public GetDataChannelCredentialsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetDataChannelCredentialsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDataChannelCredentialsResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public GetDataChannelCredentialsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDataChannelCredentialsResponseBodyData extends TeaModel {
        @NameInMap("ClientId")
        public String clientId;

        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("Endpoint")
        public String endpoint;

        @NameInMap("ExpiredTime")
        public Long expiredTime;

        @NameInMap("Password")
        public String password;

        @NameInMap("Topic")
        public String topic;

        @NameInMap("UserName")
        public String userName;

        public static GetDataChannelCredentialsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDataChannelCredentialsResponseBodyData self = new GetDataChannelCredentialsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDataChannelCredentialsResponseBodyData setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public GetDataChannelCredentialsResponseBodyData setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public GetDataChannelCredentialsResponseBodyData setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public GetDataChannelCredentialsResponseBodyData setExpiredTime(Long expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public Long getExpiredTime() {
            return this.expiredTime;
        }

        public GetDataChannelCredentialsResponseBodyData setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public GetDataChannelCredentialsResponseBodyData setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public GetDataChannelCredentialsResponseBodyData setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
