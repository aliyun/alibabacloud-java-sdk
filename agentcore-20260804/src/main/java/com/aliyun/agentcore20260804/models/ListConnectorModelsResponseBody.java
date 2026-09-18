// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListConnectorModelsResponseBody extends TeaModel {
    /**
     * <p>The business status code.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The list of available models.</p>
     */
    @NameInMap("items")
    public java.util.List<ListConnectorModelsResponseBodyItems> items;

    /**
     * <p>The number of models returned in this request.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The next page token. This field is not returned in the current version.</p>
     * 
     * <strong>example:</strong>
     * <p>dGVzdA==</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>request-123456</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <p>The total number of models returned.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("totalCount")
    public Long totalCount;

    public static ListConnectorModelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListConnectorModelsResponseBody self = new ListConnectorModelsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListConnectorModelsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListConnectorModelsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListConnectorModelsResponseBody setItems(java.util.List<ListConnectorModelsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListConnectorModelsResponseBodyItems> getItems() {
        return this.items;
    }

    public ListConnectorModelsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListConnectorModelsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListConnectorModelsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListConnectorModelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListConnectorModelsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListConnectorModelsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListConnectorModelsResponseBodyItems extends TeaModel {
        /**
         * <p>The description of the model.</p>
         * 
         * <strong>example:</strong>
         * <p>Qwen flagship model</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The display name of the model.</p>
         * 
         * <strong>example:</strong>
         * <p>Qwen3 Max</p>
         */
        @NameInMap("displayName")
        public String displayName;

        /**
         * <p>The associated Connector Key ID. This field is not returned in the current version.</p>
         * 
         * <strong>example:</strong>
         * <p>ckey-xxxx</p>
         */
        @NameInMap("keyId")
        public String keyId;

        /**
         * <p>The associated Connector Key name. This field is not returned in the current version.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("keyName")
        public String keyName;

        /**
         * <p>The stable identifier of the model.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen3-max</p>
         */
        @NameInMap("modelId")
        public String modelId;

        /**
         * <p>The source of the model.</p>
         * 
         * <strong>example:</strong>
         * <p>official</p>
         */
        @NameInMap("source")
        public String source;

        public static ListConnectorModelsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListConnectorModelsResponseBodyItems self = new ListConnectorModelsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListConnectorModelsResponseBodyItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListConnectorModelsResponseBodyItems setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListConnectorModelsResponseBodyItems setKeyId(String keyId) {
            this.keyId = keyId;
            return this;
        }
        public String getKeyId() {
            return this.keyId;
        }

        public ListConnectorModelsResponseBodyItems setKeyName(String keyName) {
            this.keyName = keyName;
            return this;
        }
        public String getKeyName() {
            return this.keyName;
        }

        public ListConnectorModelsResponseBodyItems setModelId(String modelId) {
            this.modelId = modelId;
            return this;
        }
        public String getModelId() {
            return this.modelId;
        }

        public ListConnectorModelsResponseBodyItems setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

    }

}
