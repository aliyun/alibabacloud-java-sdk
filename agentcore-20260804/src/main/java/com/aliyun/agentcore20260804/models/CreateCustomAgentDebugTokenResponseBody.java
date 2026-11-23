// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class CreateCustomAgentDebugTokenResponseBody extends TeaModel {
    /**
     * <p>The business status code. SUCCESS is returned if the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The debug token issued in this request, the token fingerprint, and the corresponding resource and network information.</p>
     */
    @NameInMap("data")
    public CreateCustomAgentDebugTokenResponseBodyData data;

    /**
     * <p>The HTTP status code of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The description of the request processing result.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The unique identifier of the request, which can be used for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>F2B17684-703A-4F29-9D14-30C334A85162</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. A value of true indicates success. A value of false indicates failure.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static CreateCustomAgentDebugTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomAgentDebugTokenResponseBody self = new CreateCustomAgentDebugTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCustomAgentDebugTokenResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateCustomAgentDebugTokenResponseBody setData(CreateCustomAgentDebugTokenResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateCustomAgentDebugTokenResponseBodyData getData() {
        return this.data;
    }

    public CreateCustomAgentDebugTokenResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateCustomAgentDebugTokenResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateCustomAgentDebugTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateCustomAgentDebugTokenResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateCustomAgentDebugTokenResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the high-code agent corresponding to the token.</p>
         * 
         * <strong>example:</strong>
         * <p>agent-0123456789abcdef0123456789abcdef</p>
         */
        @NameInMap("agentId")
        public String agentId;

        /**
         * <p>The token used by the AgentCore SDK for local debugging. Keep the token secure. Do not write it to logs or commit it to code repositories.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJwcm9kdWN0****</p>
         */
        @NameInMap("bootstrapToken")
        public String bootstrapToken;

        /**
         * <p>The network type used for the token, which is the same as the networkType parameter in the request.</p>
         * 
         * <strong>example:</strong>
         * <p>INTERNET</p>
         */
        @NameInMap("networkType")
        public String networkType;

        /**
         * <p>The fingerprint used to identify the issued token, which can be used to troubleshoot issuance records.</p>
         * 
         * <strong>example:</strong>
         * <p>c4f5b8813a0d</p>
         */
        @NameInMap("tokenFingerprint")
        public String tokenFingerprint;

        /**
         * <p>The ID of the workspace corresponding to the token.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-0123456789abcdef01234</p>
         */
        @NameInMap("workspaceId")
        public String workspaceId;

        public static CreateCustomAgentDebugTokenResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateCustomAgentDebugTokenResponseBodyData self = new CreateCustomAgentDebugTokenResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateCustomAgentDebugTokenResponseBodyData setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public CreateCustomAgentDebugTokenResponseBodyData setBootstrapToken(String bootstrapToken) {
            this.bootstrapToken = bootstrapToken;
            return this;
        }
        public String getBootstrapToken() {
            return this.bootstrapToken;
        }

        public CreateCustomAgentDebugTokenResponseBodyData setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public CreateCustomAgentDebugTokenResponseBodyData setTokenFingerprint(String tokenFingerprint) {
            this.tokenFingerprint = tokenFingerprint;
            return this;
        }
        public String getTokenFingerprint() {
            return this.tokenFingerprint;
        }

        public CreateCustomAgentDebugTokenResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
