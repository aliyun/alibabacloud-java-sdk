// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelstudio20260210.models;

import com.aliyun.tea.*;

public class GetApiKeyResponseBody extends TeaModel {
    @NameInMap("apiKey")
    public GetApiKeyResponseBodyApiKey apiKey;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>DFD55E7B-0615-5343-BDA0-FBEE86F29935</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static GetApiKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetApiKeyResponseBody self = new GetApiKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetApiKeyResponseBody setApiKey(GetApiKeyResponseBodyApiKey apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    public GetApiKeyResponseBodyApiKey getApiKey() {
        return this.apiKey;
    }

    public GetApiKeyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetApiKeyResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetApiKeyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetApiKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetApiKeyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetApiKeyResponseBodyApiKey extends TeaModel {
        /**
         * <p>API Key ID。</p>
         * 
         * <strong>example:</strong>
         * <p>2965964</p>
         */
        @NameInMap("apiKeyId")
        public Long apiKeyId;

        /**
         * <strong>example:</strong>
         * <p>sk-ws-djI.mhU0D****testtestest</p>
         */
        @NameInMap("apiKeyValue")
        public String apiKeyValue;

        /**
         * <strong>example:</strong>
         * <p>1378030599924858</p>
         */
        @NameInMap("createdBy")
        public String createdBy;

        /**
         * <strong>example:</strong>
         * <p>v7</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("disabled")
        public Integer disabled;

        /**
         * <strong>example:</strong>
         * <p>1774338222000</p>
         */
        @NameInMap("gmtCreate")
        public Long gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>ws-b2d30f148c236908</p>
         */
        @NameInMap("workspaceId")
        public String workspaceId;

        public static GetApiKeyResponseBodyApiKey build(java.util.Map<String, ?> map) throws Exception {
            GetApiKeyResponseBodyApiKey self = new GetApiKeyResponseBodyApiKey();
            return TeaModel.build(map, self);
        }

        public GetApiKeyResponseBodyApiKey setApiKeyId(Long apiKeyId) {
            this.apiKeyId = apiKeyId;
            return this;
        }
        public Long getApiKeyId() {
            return this.apiKeyId;
        }

        public GetApiKeyResponseBodyApiKey setApiKeyValue(String apiKeyValue) {
            this.apiKeyValue = apiKeyValue;
            return this;
        }
        public String getApiKeyValue() {
            return this.apiKeyValue;
        }

        public GetApiKeyResponseBodyApiKey setCreatedBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }
        public String getCreatedBy() {
            return this.createdBy;
        }

        public GetApiKeyResponseBodyApiKey setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetApiKeyResponseBodyApiKey setDisabled(Integer disabled) {
            this.disabled = disabled;
            return this;
        }
        public Integer getDisabled() {
            return this.disabled;
        }

        public GetApiKeyResponseBodyApiKey setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public GetApiKeyResponseBodyApiKey setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
