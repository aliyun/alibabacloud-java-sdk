// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianvoicebot20250101.models;

import com.aliyun.tea.*;

public class GetDataChannelCredentialResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetDataChannelCredentialResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Params")
    public java.util.List<String> params;

    /**
     * <strong>example:</strong>
     * <p>D771A1B6-3D5F-174A-BEE1-98CE1000D337</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetDataChannelCredentialResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDataChannelCredentialResponseBody self = new GetDataChannelCredentialResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDataChannelCredentialResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDataChannelCredentialResponseBody setData(GetDataChannelCredentialResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDataChannelCredentialResponseBodyData getData() {
        return this.data;
    }

    public GetDataChannelCredentialResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetDataChannelCredentialResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDataChannelCredentialResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public GetDataChannelCredentialResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDataChannelCredentialResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>26c2f022-b6c0-4ab0-9019-6e1a42dc5582</p>
         */
        @NameInMap("ClientId")
        public String clientId;

        /**
         * <strong>example:</strong>
         * <p>device-3i5x4234f2j4w55e</p>
         */
        @NameInMap("DeviceId")
        public String deviceId;

        /**
         * <strong>example:</strong>
         * <p>mqtt-cn-ux146hgtt04.mqtt.aliyuncs.com</p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        /**
         * <strong>example:</strong>
         * <p>1745004535507</p>
         */
        @NameInMap("ExpirationTime")
        public Long expirationTime;

        /**
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <p>Topic</p>
         * 
         * <strong>example:</strong>
         * <p>datachannel-prepub-a/dc52807f0eff4b9b8224d06c7f240c07</p>
         */
        @NameInMap("Topic")
        public String topic;

        /**
         * <strong>example:</strong>
         * <p>Token|LTAI5tRYzHUYYi4XstgMCsL4|mqtt-cn-ux146hgtt04</p>
         */
        @NameInMap("UserName")
        public String userName;

        public static GetDataChannelCredentialResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDataChannelCredentialResponseBodyData self = new GetDataChannelCredentialResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDataChannelCredentialResponseBodyData setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public GetDataChannelCredentialResponseBodyData setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public GetDataChannelCredentialResponseBodyData setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public GetDataChannelCredentialResponseBodyData setExpirationTime(Long expirationTime) {
            this.expirationTime = expirationTime;
            return this;
        }
        public Long getExpirationTime() {
            return this.expirationTime;
        }

        public GetDataChannelCredentialResponseBodyData setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public GetDataChannelCredentialResponseBodyData setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public GetDataChannelCredentialResponseBodyData setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
