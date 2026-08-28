// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class GetServiceEndpointApiKeyResponseBody extends TeaModel {
    /**
     * <p>The response code. The value is SUCCESS when the request succeeds.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The currently active API Key information for the service endpoint.</p>
     */
    @NameInMap("data")
    public GetServiceEndpointApiKeyResponseBodyData data;

    /**
     * <p>The HTTP status code. The value is 200 when the request succeeds.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The response message. The value is success when the request succeeds.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID, used for troubleshooting and tracing.</p>
     * 
     * <strong>example:</strong>
     * <p>req-1</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. The value is true when the request succeeds.</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static GetServiceEndpointApiKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetServiceEndpointApiKeyResponseBody self = new GetServiceEndpointApiKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetServiceEndpointApiKeyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetServiceEndpointApiKeyResponseBody setData(GetServiceEndpointApiKeyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetServiceEndpointApiKeyResponseBodyData getData() {
        return this.data;
    }

    public GetServiceEndpointApiKeyResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetServiceEndpointApiKeyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetServiceEndpointApiKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetServiceEndpointApiKeyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetServiceEndpointApiKeyResponseBodyData extends TeaModel {
        /**
         * <p>The currently active API Key for the service endpoint. The service reads this value from the gateway consumer in real time. AgentCore does not persist the plaintext. When calling the service endpoint, include this value in the request header specified by apiKeyName. Do not log this value or expose it in public configurations.</p>
         * 
         * <strong>example:</strong>
         * <p>example-api-key-value</p>
         */
        @NameInMap("apiKey")
        public String apiKey;

        /**
         * <p>The API Key fingerprint, which consists of the first 12 lowercase hexadecimal characters of the SHA-256 digest of the API Key. It can be used to identify the key version but cannot replace the API Key for authentication.</p>
         * 
         * <strong>example:</strong>
         * <p>b2520bf19231</p>
         */
        @NameInMap("apiKeyFingerprint")
        public String apiKeyFingerprint;

        /**
         * <p>The name of the HTTP request header used to pass the API Key. The value is currently fixed to x-api-key.</p>
         * 
         * <strong>example:</strong>
         * <p>x-api-key</p>
         */
        @NameInMap("apiKeyName")
        public String apiKeyName;

        /**
         * <p>The location where the API Key is passed. The value is currently fixed to Header, indicating that the API Key is passed through an HTTP request header.</p>
         * 
         * <strong>example:</strong>
         * <p>Header</p>
         */
        @NameInMap("apiKeySource")
        public String apiKeySource;

        /**
         * <p>The authentication type of the service endpoint. Valid values:</p>
         * <ul>
         * <li>NONE: Authentication is not enabled.</li>
         * <li>API_KEY: API Key authentication is used.</li>
         * </ul>
         * <p>This operation succeeds only when the authentication type is API_KEY. Therefore, the value API_KEY is always returned in a successful response.</p>
         * 
         * <strong>example:</strong>
         * <p>API_KEY</p>
         */
        @NameInMap("authenticationType")
        public String authenticationType;

        /**
         * <p>The service endpoint ID.</p>
         * 
         * <strong>example:</strong>
         * <p>se-1</p>
         */
        @NameInMap("serviceEndpointId")
        public String serviceEndpointId;

        /**
         * <p>The ID of the workspace to which the service endpoint belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-1</p>
         */
        @NameInMap("workspaceId")
        public String workspaceId;

        public static GetServiceEndpointApiKeyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetServiceEndpointApiKeyResponseBodyData self = new GetServiceEndpointApiKeyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetServiceEndpointApiKeyResponseBodyData setApiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }
        public String getApiKey() {
            return this.apiKey;
        }

        public GetServiceEndpointApiKeyResponseBodyData setApiKeyFingerprint(String apiKeyFingerprint) {
            this.apiKeyFingerprint = apiKeyFingerprint;
            return this;
        }
        public String getApiKeyFingerprint() {
            return this.apiKeyFingerprint;
        }

        public GetServiceEndpointApiKeyResponseBodyData setApiKeyName(String apiKeyName) {
            this.apiKeyName = apiKeyName;
            return this;
        }
        public String getApiKeyName() {
            return this.apiKeyName;
        }

        public GetServiceEndpointApiKeyResponseBodyData setApiKeySource(String apiKeySource) {
            this.apiKeySource = apiKeySource;
            return this;
        }
        public String getApiKeySource() {
            return this.apiKeySource;
        }

        public GetServiceEndpointApiKeyResponseBodyData setAuthenticationType(String authenticationType) {
            this.authenticationType = authenticationType;
            return this;
        }
        public String getAuthenticationType() {
            return this.authenticationType;
        }

        public GetServiceEndpointApiKeyResponseBodyData setServiceEndpointId(String serviceEndpointId) {
            this.serviceEndpointId = serviceEndpointId;
            return this;
        }
        public String getServiceEndpointId() {
            return this.serviceEndpointId;
        }

        public GetServiceEndpointApiKeyResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
