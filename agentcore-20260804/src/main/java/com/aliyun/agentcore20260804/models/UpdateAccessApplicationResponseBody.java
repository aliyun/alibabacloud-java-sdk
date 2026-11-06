// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class UpdateAccessApplicationResponseBody extends TeaModel {
    /**
     * <p>The business status code.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The details of the access application.</p>
     */
    @NameInMap("data")
    public UpdateAccessApplicationResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The request processing result message.</p>
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
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static UpdateAccessApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAccessApplicationResponseBody self = new UpdateAccessApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAccessApplicationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateAccessApplicationResponseBody setData(UpdateAccessApplicationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateAccessApplicationResponseBodyData getData() {
        return this.data;
    }

    public UpdateAccessApplicationResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UpdateAccessApplicationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateAccessApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateAccessApplicationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateAccessApplicationResponseBodyData extends TeaModel {
        /**
         * <p>The access application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>app-1234567890</p>
         */
        @NameInMap("applicationId")
        public String applicationId;

        /**
         * <p>The name of the access application.</p>
         * 
         * <strong>example:</strong>
         * <p>my-access-application</p>
         */
        @NameInMap("applicationName")
        public String applicationName;

        /**
         * <p>The OAuth client ID.</p>
         * 
         * <strong>example:</strong>
         * <p>client-1234567890</p>
         */
        @NameInMap("clientId")
        public String clientId;

        /**
         * <p>The creation time in RFC 3339 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-01T00:00:00Z</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <p>The metadata URL of the identity provider.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/.well-known/openid-configuration">https://example.com/.well-known/openid-configuration</a></p>
         */
        @NameInMap("metadataUrl")
        public String metadataUrl;

        /**
         * <p>The list of redirect URIs.</p>
         */
        @NameInMap("redirectUris")
        public java.util.List<String> redirectUris;

        /**
         * <p>The update time in RFC 3339 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-01T00:00:00Z</p>
         */
        @NameInMap("updatedAt")
        public String updatedAt;

        /**
         * <p>The user source.</p>
         * 
         * <strong>example:</strong>
         * <p>LOCAL</p>
         */
        @NameInMap("userSource")
        public String userSource;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-1234567890</p>
         */
        @NameInMap("workspaceId")
        public String workspaceId;

        public static UpdateAccessApplicationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateAccessApplicationResponseBodyData self = new UpdateAccessApplicationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateAccessApplicationResponseBodyData setApplicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public String getApplicationId() {
            return this.applicationId;
        }

        public UpdateAccessApplicationResponseBodyData setApplicationName(String applicationName) {
            this.applicationName = applicationName;
            return this;
        }
        public String getApplicationName() {
            return this.applicationName;
        }

        public UpdateAccessApplicationResponseBodyData setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public UpdateAccessApplicationResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public UpdateAccessApplicationResponseBodyData setMetadataUrl(String metadataUrl) {
            this.metadataUrl = metadataUrl;
            return this;
        }
        public String getMetadataUrl() {
            return this.metadataUrl;
        }

        public UpdateAccessApplicationResponseBodyData setRedirectUris(java.util.List<String> redirectUris) {
            this.redirectUris = redirectUris;
            return this;
        }
        public java.util.List<String> getRedirectUris() {
            return this.redirectUris;
        }

        public UpdateAccessApplicationResponseBodyData setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public UpdateAccessApplicationResponseBodyData setUserSource(String userSource) {
            this.userSource = userSource;
            return this;
        }
        public String getUserSource() {
            return this.userSource;
        }

        public UpdateAccessApplicationResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
