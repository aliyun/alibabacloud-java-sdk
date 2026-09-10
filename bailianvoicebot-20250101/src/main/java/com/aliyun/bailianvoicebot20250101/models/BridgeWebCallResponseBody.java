// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianvoicebot20250101.models;

import com.aliyun.tea.*;

public class BridgeWebCallResponseBody extends TeaModel {
    /**
     * <p>The status code. A value of 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public BridgeWebCallResponseBodyData data;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>connect timed out</p>
     */
    @NameInMap("ErrorMsg")
    public String errorMsg;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CF6D3484-19A1-5C77-863B-AC8B5754D37C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static BridgeWebCallResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BridgeWebCallResponseBody self = new BridgeWebCallResponseBody();
        return TeaModel.build(map, self);
    }

    public BridgeWebCallResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BridgeWebCallResponseBody setData(BridgeWebCallResponseBodyData data) {
        this.data = data;
        return this;
    }
    public BridgeWebCallResponseBodyData getData() {
        return this.data;
    }

    public BridgeWebCallResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public BridgeWebCallResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public BridgeWebCallResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BridgeWebCallResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class BridgeWebCallResponseBodyData extends TeaModel {
        /**
         * <p>The channel ID.</p>
         * 
         * <strong>example:</strong>
         * <p>894526715106764802</p>
         */
        @NameInMap("ChannelId")
        public String channelId;

        /**
         * <p>The token expiration time.</p>
         * <blockquote>
         * <p>The value is in timestamp format.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1744964682422</p>
         */
        @NameInMap("ExpirationTime")
        public String expirationTime;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i-uf6abxo1tuuwarrtffpp</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The server URL.</p>
         * 
         * <strong>example:</strong>
         * <p>wss://sh-voicebot.aliyuncs.com:443/audio</p>
         */
        @NameInMap("ServerUrl")
        public String serverUrl;

        /**
         * <p>The session ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-4b7c263f-9b4c-4b28-baae-a65e9155e380</p>
         */
        @NameInMap("SessionId")
        public String sessionId;

        /**
         * <p>The authentication signature.</p>
         * 
         * <strong>example:</strong>
         * <p>83480f806b48f022313de37b691e167e</p>
         */
        @NameInMap("Token")
        public String token;

        public static BridgeWebCallResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BridgeWebCallResponseBodyData self = new BridgeWebCallResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BridgeWebCallResponseBodyData setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public BridgeWebCallResponseBodyData setExpirationTime(String expirationTime) {
            this.expirationTime = expirationTime;
            return this;
        }
        public String getExpirationTime() {
            return this.expirationTime;
        }

        public BridgeWebCallResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public BridgeWebCallResponseBodyData setServerUrl(String serverUrl) {
            this.serverUrl = serverUrl;
            return this;
        }
        public String getServerUrl() {
            return this.serverUrl;
        }

        public BridgeWebCallResponseBodyData setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public BridgeWebCallResponseBodyData setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

    }

}
