// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelstudio20260210.models;

import com.aliyun.tea.*;

public class ListApiKeysResponseBody extends TeaModel {
    @NameInMap("apiKeys")
    public java.util.List<ListApiKeysResponseBodyApiKeys> apiKeys;

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
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>lwytFRtLdNk=</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>E4C14AE6-E987-5C2F-9230-9960AB48F4F2</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListApiKeysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListApiKeysResponseBody self = new ListApiKeysResponseBody();
        return TeaModel.build(map, self);
    }

    public ListApiKeysResponseBody setApiKeys(java.util.List<ListApiKeysResponseBodyApiKeys> apiKeys) {
        this.apiKeys = apiKeys;
        return this;
    }
    public java.util.List<ListApiKeysResponseBodyApiKeys> getApiKeys() {
        return this.apiKeys;
    }

    public ListApiKeysResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListApiKeysResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListApiKeysResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListApiKeysResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListApiKeysResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListApiKeysResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListApiKeysResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListApiKeysResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListApiKeysResponseBodyApiKeys extends TeaModel {
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
         * <p>sk-ws-djI.8O7d*****2aICctnid4u4</p>
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
         * <p>test</p>
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
         * <p>ws-950f9aca7e76c816</p>
         */
        @NameInMap("workspaceId")
        public String workspaceId;

        public static ListApiKeysResponseBodyApiKeys build(java.util.Map<String, ?> map) throws Exception {
            ListApiKeysResponseBodyApiKeys self = new ListApiKeysResponseBodyApiKeys();
            return TeaModel.build(map, self);
        }

        public ListApiKeysResponseBodyApiKeys setApiKeyId(Long apiKeyId) {
            this.apiKeyId = apiKeyId;
            return this;
        }
        public Long getApiKeyId() {
            return this.apiKeyId;
        }

        public ListApiKeysResponseBodyApiKeys setApiKeyValue(String apiKeyValue) {
            this.apiKeyValue = apiKeyValue;
            return this;
        }
        public String getApiKeyValue() {
            return this.apiKeyValue;
        }

        public ListApiKeysResponseBodyApiKeys setCreatedBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }
        public String getCreatedBy() {
            return this.createdBy;
        }

        public ListApiKeysResponseBodyApiKeys setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListApiKeysResponseBodyApiKeys setDisabled(Integer disabled) {
            this.disabled = disabled;
            return this;
        }
        public Integer getDisabled() {
            return this.disabled;
        }

        public ListApiKeysResponseBodyApiKeys setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListApiKeysResponseBodyApiKeys setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
