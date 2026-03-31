// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelstudio20260210.models;

import com.aliyun.tea.*;

public class CreateApiKeyResponseBody extends TeaModel {
    @NameInMap("apiKey")
    public CreateApiKeyResponseBodyApiKey apiKey;

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
     * <p>C0CDC72E-52D7-5BC8-9396-9276B4FDF6B3</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static CreateApiKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateApiKeyResponseBody self = new CreateApiKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateApiKeyResponseBody setApiKey(CreateApiKeyResponseBodyApiKey apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    public CreateApiKeyResponseBodyApiKey getApiKey() {
        return this.apiKey;
    }

    public CreateApiKeyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateApiKeyResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateApiKeyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateApiKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateApiKeyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateApiKeyResponseBodyApiKey extends TeaModel {
        /**
         * <p>API Key ID。</p>
         * 
         * <strong>example:</strong>
         * <p>1858636</p>
         */
        @NameInMap("apiKeyId")
        public Long apiKeyId;

        /**
         * <strong>example:</strong>
         * <p>sk-ws-djI.8O7dkfkW2aICctnid4u4</p>
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
         * <p>desc</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>1774338222000</p>
         */
        @NameInMap("gmtCreate")
        public Long gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>ws-3fa048e86117d91f</p>
         */
        @NameInMap("workspaceId")
        public String workspaceId;

        public static CreateApiKeyResponseBodyApiKey build(java.util.Map<String, ?> map) throws Exception {
            CreateApiKeyResponseBodyApiKey self = new CreateApiKeyResponseBodyApiKey();
            return TeaModel.build(map, self);
        }

        public CreateApiKeyResponseBodyApiKey setApiKeyId(Long apiKeyId) {
            this.apiKeyId = apiKeyId;
            return this;
        }
        public Long getApiKeyId() {
            return this.apiKeyId;
        }

        public CreateApiKeyResponseBodyApiKey setApiKeyValue(String apiKeyValue) {
            this.apiKeyValue = apiKeyValue;
            return this;
        }
        public String getApiKeyValue() {
            return this.apiKeyValue;
        }

        public CreateApiKeyResponseBodyApiKey setCreatedBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }
        public String getCreatedBy() {
            return this.createdBy;
        }

        public CreateApiKeyResponseBodyApiKey setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateApiKeyResponseBodyApiKey setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public CreateApiKeyResponseBodyApiKey setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
