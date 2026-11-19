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
         * <p>The agent ID. The length is limited to 1 to 128 UTF-8 bytes. The value cannot contain a forward slash (/) or an asterisk (*). This field is not returned if the memory is not associated with an agent ID.</p>
         * 
         * <strong>example:</strong>
         * <p>agent-001</p>
         */
        @NameInMap("agentId")
        public String agentId;

        /**
         * <p>The session ID. The length is limited to 1 to 128 UTF-8 bytes. The value cannot contain a forward slash (/) or an asterisk (*). This field is not returned if the memory is not associated with a session ID.</p>
         * 
         * <strong>example:</strong>
         * <p>session-001</p>
         */
        @NameInMap("sessionId")
        public String sessionId;

        /**
         * <p>The business team ID defined by the caller. If provided, it cannot be empty and can be up to 128 UTF-8 bytes in length.</p>
         * 
         * <strong>example:</strong>
         * <p>team-001</p>
         */
        @NameInMap("teamId")
        public String teamId;

        /**
         * <p>The user ID. The length is limited to 1 to 128 UTF-8 bytes. The value cannot contain a forward slash (/) or an asterisk (*). This field is not returned if the memory is not associated with a user ID.</p>
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

        public SearchMemoriesRequestBodyScope setTeamId(String teamId) {
            this.teamId = teamId;
            return this;
        }
        public String getTeamId() {
            return this.teamId;
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
         * <p>The string key-value metadata for exact matching. A maximum of 16 keys are supported. Each key can be up to 64 characters in length, and each value can be up to 1,024 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;topic&quot;:&quot;hiking&quot;}</p>
         */
        @NameInMap("metadata")
        public java.util.Map<String, String> metadata;

        /**
         * <p>The minimum relevance score. Default value: 0.2. Valid values: 0 to 1. If both minScore and minSimilarity are specified, the results are filtered based on the AND logic.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("minScore")
        public Float minScore;

        /**
         * <p>The minimum similarity score. Default value: 0.3. Valid values: 0 to 1. If both minSimilarity and minScore are specified, the results are filtered based on the AND logic.</p>
         * 
         * <strong>example:</strong>
         * <p>0.3</p>
         */
        @NameInMap("minSimilarity")
        public Float minSimilarity;

        /**
         * <p>The query text for retrieval, up to 8,192 characters.</p>
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

        /**
         * <p>The list of memory content types. Supported types include semantic, skill, user_profile, and session_summary. If omitted or left as an empty array, no type restriction is applied.</p>
         */
        @NameInMap("types")
        public java.util.List<String> types;

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

        public SearchMemoriesRequestBody setTypes(java.util.List<String> types) {
            this.types = types;
            return this;
        }
        public java.util.List<String> getTypes() {
            return this.types;
        }

    }

}
