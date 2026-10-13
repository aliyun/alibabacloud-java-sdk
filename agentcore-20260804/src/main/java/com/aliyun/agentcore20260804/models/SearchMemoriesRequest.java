// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class SearchMemoriesRequest extends TeaModel {
    /**
     * <p>The semantic retrieval request.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public SearchMemoriesRequestBody body;

    public static SearchMemoriesRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchMemoriesRequest self = new SearchMemoriesRequest();
        return TeaModel.build(map, self);
    }

    public SearchMemoriesRequest setBody(SearchMemoriesRequestBody body) {
        this.body = body;
        return this;
    }
    public SearchMemoriesRequestBody getBody() {
        return this.body;
    }

    public static class SearchMemoriesRequestBodyScope extends TeaModel {
        /**
         * <p>The agent ID. The ID must be 1 to 128 bytes in length and encoded in UTF-8. The ID cannot contain forward slashes (/) or asterisks (*). If the memory is not associated with an agent ID, this field is not returned.</p>
         * 
         * <strong>example:</strong>
         * <p>agent-001</p>
         */
        @NameInMap("agentId")
        public String agentId;

        /**
         * <p>The session ID. The ID must be 1 to 128 bytes in length and encoded in UTF-8. The ID cannot contain forward slashes (/) or asterisks (*). If the memory is not associated with a session ID, this field is not returned.</p>
         * 
         * <strong>example:</strong>
         * <p>session-001</p>
         */
        @NameInMap("sessionId")
        public String sessionId;

        /**
         * <p>The user ID. The ID must be 1 to 128 bytes in length and encoded in UTF-8. The ID cannot contain forward slashes (/) or asterisks (*). If the memory is not associated with a user ID, this field is not returned.</p>
         * 
         * <strong>example:</strong>
         * <p>user-001</p>
         */
        @NameInMap("userId")
        public String userId;

        public static SearchMemoriesRequestBodyScope build(java.util.Map<String, ?> map) throws Exception {
            SearchMemoriesRequestBodyScope self = new SearchMemoriesRequestBodyScope();
            return TeaModel.build(map, self);
        }

        public SearchMemoriesRequestBodyScope setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public SearchMemoriesRequestBodyScope setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public SearchMemoriesRequestBodyScope setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class SearchMemoriesRequestBody extends TeaModel {
        /**
         * <p>Specifies whether to enable reranking. Default value: true.</p>
         */
        @NameInMap("enableRerank")
        public Boolean enableRerank;

        /**
         * <p>The string key-value metadata for exact match. You can specify up to 16 keys. Each key can be up to 64 characters in length, and each value can be up to 1,024 characters in length.</p>
         */
        @NameInMap("metadata")
        public java.util.Map<String, String> metadata;

        /**
         * <p>The minimum relevance score. Valid values: 0 to 1. Default value: 0.2. If both minScore and minSimilarity are specified, the AND logic is applied for filtering.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("minScore")
        public Float minScore;

        /**
         * <p>The minimum similarity. Valid values: 0 to 1. Default value: 0.3. If both minScore and minSimilarity are specified, the AND logic is applied for filtering.</p>
         * 
         * <strong>example:</strong>
         * <p>0.3</p>
         */
        @NameInMap("minSimilarity")
        public Float minSimilarity;

        /**
         * <p>The query text. The text can be up to 8,192 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>What sports does the user like?</p>
         */
        @NameInMap("query")
        public String query;

        /**
         * <p>The retrieval scope. UserId, AgentId, and SessionId are all optional.</p>
         */
        @NameInMap("scope")
        public SearchMemoriesRequestBodyScope scope;

        /**
         * <p>The number of results to return.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("topK")
        public Integer topK;

        public static SearchMemoriesRequestBody build(java.util.Map<String, ?> map) throws Exception {
            SearchMemoriesRequestBody self = new SearchMemoriesRequestBody();
            return TeaModel.build(map, self);
        }

        public SearchMemoriesRequestBody setEnableRerank(Boolean enableRerank) {
            this.enableRerank = enableRerank;
            return this;
        }
        public Boolean getEnableRerank() {
            return this.enableRerank;
        }

        public SearchMemoriesRequestBody setMetadata(java.util.Map<String, String> metadata) {
            this.metadata = metadata;
            return this;
        }
        public java.util.Map<String, String> getMetadata() {
            return this.metadata;
        }

        public SearchMemoriesRequestBody setMinScore(Float minScore) {
            this.minScore = minScore;
            return this;
        }
        public Float getMinScore() {
            return this.minScore;
        }

        public SearchMemoriesRequestBody setMinSimilarity(Float minSimilarity) {
            this.minSimilarity = minSimilarity;
            return this;
        }
        public Float getMinSimilarity() {
            return this.minSimilarity;
        }

        public SearchMemoriesRequestBody setQuery(String query) {
            this.query = query;
            return this;
        }
        public String getQuery() {
            return this.query;
        }

        public SearchMemoriesRequestBody setScope(SearchMemoriesRequestBodyScope scope) {
            this.scope = scope;
            return this;
        }
        public SearchMemoriesRequestBodyScope getScope() {
            return this.scope;
        }

        public SearchMemoriesRequestBody setTopK(Integer topK) {
            this.topK = topK;
            return this;
        }
        public Integer getTopK() {
            return this.topK;
        }

    }

}
