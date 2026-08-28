// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class CreateExternalAgentBootstrapTokenResponseBody extends TeaModel {
    /**
     * <p>The business status code. The value SUCCESS indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The Bootstrap Token and CMS configuration required for connecting the external agent.</p>
     */
    @NameInMap("data")
    public CreateExternalAgentBootstrapTokenResponseBodyData data;

    /**
     * <p>The HTTP status code. The value 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The message indicating the request processing result.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1a2b3c4d-xxxx-xxxx-xxxx-xxxxxxxxxxxx</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static CreateExternalAgentBootstrapTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateExternalAgentBootstrapTokenResponseBody self = new CreateExternalAgentBootstrapTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateExternalAgentBootstrapTokenResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateExternalAgentBootstrapTokenResponseBody setData(CreateExternalAgentBootstrapTokenResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateExternalAgentBootstrapTokenResponseBodyData getData() {
        return this.data;
    }

    public CreateExternalAgentBootstrapTokenResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateExternalAgentBootstrapTokenResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateExternalAgentBootstrapTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateExternalAgentBootstrapTokenResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateExternalAgentBootstrapTokenResponseBodyDataCms extends TeaModel {
        /**
         * <p>The CMS reporting endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://public.example.com/apm/trace/opentelemetry">https://public.example.com/apm/trace/opentelemetry</a></p>
         */
        @NameInMap("endpoint")
        public String endpoint;

        /**
         * <p>The license key used for CMS connection.</p>
         * 
         * <strong>example:</strong>
         * <p>license-key</p>
         */
        @NameInMap("licenseKey")
        public String licenseKey;

        /**
         * <p>The CMS workspace name.</p>
         * 
         * <strong>example:</strong>
         * <p>cms-workspace</p>
         */
        @NameInMap("workspace")
        public String workspace;

        public static CreateExternalAgentBootstrapTokenResponseBodyDataCms build(java.util.Map<String, ?> map) throws Exception {
            CreateExternalAgentBootstrapTokenResponseBodyDataCms self = new CreateExternalAgentBootstrapTokenResponseBodyDataCms();
            return TeaModel.build(map, self);
        }

        public CreateExternalAgentBootstrapTokenResponseBodyDataCms setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public CreateExternalAgentBootstrapTokenResponseBodyDataCms setLicenseKey(String licenseKey) {
            this.licenseKey = licenseKey;
            return this;
        }
        public String getLicenseKey() {
            return this.licenseKey;
        }

        public CreateExternalAgentBootstrapTokenResponseBodyDataCms setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

    }

    public static class CreateExternalAgentBootstrapTokenResponseBodyData extends TeaModel {
        /**
         * <p>The external agent ID.</p>
         * 
         * <strong>example:</strong>
         * <p>agent-1</p>
         */
        @NameInMap("agentId")
        public String agentId;

        /**
         * <p>The Bootstrap Token used for connecting the external agent.</p>
         * 
         * <strong>example:</strong>
         * <p>bootstrap-token</p>
         */
        @NameInMap("bootstrapToken")
        public String bootstrapToken;

        /**
         * <p>The CMS configuration used for connecting the external agent.</p>
         */
        @NameInMap("cms")
        public CreateExternalAgentBootstrapTokenResponseBodyDataCms cms;

        /**
         * <p>The network type for connection. Valid values:</p>
         * <ul>
         * <li>INTERNET: public network</li>
         * <li>INTRANET: internal network</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>INTERNET</p>
         */
        @NameInMap("networkType")
        public String networkType;

        /**
         * <p>The fingerprint of the Bootstrap Token.</p>
         * 
         * <strong>example:</strong>
         * <p>fingerprint</p>
         */
        @NameInMap("tokenFingerprint")
        public String tokenFingerprint;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-1</p>
         */
        @NameInMap("workspaceId")
        public String workspaceId;

        public static CreateExternalAgentBootstrapTokenResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateExternalAgentBootstrapTokenResponseBodyData self = new CreateExternalAgentBootstrapTokenResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateExternalAgentBootstrapTokenResponseBodyData setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public CreateExternalAgentBootstrapTokenResponseBodyData setBootstrapToken(String bootstrapToken) {
            this.bootstrapToken = bootstrapToken;
            return this;
        }
        public String getBootstrapToken() {
            return this.bootstrapToken;
        }

        public CreateExternalAgentBootstrapTokenResponseBodyData setCms(CreateExternalAgentBootstrapTokenResponseBodyDataCms cms) {
            this.cms = cms;
            return this;
        }
        public CreateExternalAgentBootstrapTokenResponseBodyDataCms getCms() {
            return this.cms;
        }

        public CreateExternalAgentBootstrapTokenResponseBodyData setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public CreateExternalAgentBootstrapTokenResponseBodyData setTokenFingerprint(String tokenFingerprint) {
            this.tokenFingerprint = tokenFingerprint;
            return this;
        }
        public String getTokenFingerprint() {
            return this.tokenFingerprint;
        }

        public CreateExternalAgentBootstrapTokenResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
