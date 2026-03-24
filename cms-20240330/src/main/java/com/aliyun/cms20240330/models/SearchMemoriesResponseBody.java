// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class SearchMemoriesResponseBody extends TeaModel {
    /**
     * <p>Relations</p>
     */
    @NameInMap("relations")
    public java.util.List<SearchMemoriesResponseBodyRelations> relations;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>0CEC5375-C554-562B-A65F-9A629907C1F0</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Return values</p>
     */
    @NameInMap("results")
    public java.util.List<SearchMemoriesResponseBodyResults> results;

    public static SearchMemoriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchMemoriesResponseBody self = new SearchMemoriesResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchMemoriesResponseBody setRelations(java.util.List<SearchMemoriesResponseBodyRelations> relations) {
        this.relations = relations;
        return this;
    }
    public java.util.List<SearchMemoriesResponseBodyRelations> getRelations() {
        return this.relations;
    }

    public SearchMemoriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchMemoriesResponseBody setResults(java.util.List<SearchMemoriesResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<SearchMemoriesResponseBodyResults> getResults() {
        return this.results;
    }

    public static class SearchMemoriesResponseBodyRelations extends TeaModel {
        /**
         * <p>Destination</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("destination")
        public String destination;

        /**
         * <p>Relationship</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("relationship")
        public String relationship;

        /**
         * <p>Source</p>
         * 
         * <strong>example:</strong>
         * <p>todo_open_dingoj06pvqfeayy3lkr</p>
         */
        @NameInMap("source")
        public String source;

        public static SearchMemoriesResponseBodyRelations build(java.util.Map<String, ?> map) throws Exception {
            SearchMemoriesResponseBodyRelations self = new SearchMemoriesResponseBodyRelations();
            return TeaModel.build(map, self);
        }

        public SearchMemoriesResponseBodyRelations setDestination(String destination) {
            this.destination = destination;
            return this;
        }
        public String getDestination() {
            return this.destination;
        }

        public SearchMemoriesResponseBodyRelations setRelationship(String relationship) {
            this.relationship = relationship;
            return this;
        }
        public String getRelationship() {
            return this.relationship;
        }

        public SearchMemoriesResponseBodyRelations setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

    }

    public static class SearchMemoriesResponseBodyResults extends TeaModel {
        /**
         * <p>Actor ID</p>
         * 
         * <strong>example:</strong>
         * <p>test_session_001</p>
         */
        @NameInMap("actorId")
        public String actorId;

        /**
         * <p>Application agent ID</p>
         * 
         * <strong>example:</strong>
         * <p>972772996913709056</p>
         */
        @NameInMap("agentId")
        public String agentId;

        /**
         * <p>Creation time</p>
         * 
         * <strong>example:</strong>
         * <p>1762773128968</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <p>Memory hash value</p>
         * 
         * <strong>example:</strong>
         * <p>d791bf27236c5532056a13279baad3517042bb8d5b1bdb02e7871fa632debffe</p>
         */
        @NameInMap("hash")
        public String hash;

        /**
         * <p>Memory ID</p>
         * 
         * <strong>example:</strong>
         * <p>019ca1e5-7307-7d50-b943-5e628326a8ed</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>Memory content</p>
         * 
         * <strong>example:</strong>
         * <p>My name is Zhang San and I live in Hangzhou.</p>
         */
        @NameInMap("memory")
        public String memory;

        /**
         * <p>Metadata</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;sessionId&quot;:&quot;test_session_001&quot;}</p>
         */
        @NameInMap("metadata")
        public String metadata;

        /**
         * <p>Message sender role</p>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("role")
        public String role;

        /**
         * <p>Run ID</p>
         * 
         * <strong>example:</strong>
         * <p>test_session_001</p>
         */
        @NameInMap("runId")
        public String runId;

        /**
         * <p>Similarity score</p>
         * 
         * <strong>example:</strong>
         * <p>13.21</p>
         */
        @NameInMap("score")
        public Double score;

        /**
         * <p>Last update time</p>
         * 
         * <strong>example:</strong>
         * <p>1764902557784</p>
         */
        @NameInMap("updatedAt")
        public String updatedAt;

        /**
         * <p>User ID</p>
         * 
         * <strong>example:</strong>
         * <p>test_session_001</p>
         */
        @NameInMap("userId")
        public String userId;

        public static SearchMemoriesResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            SearchMemoriesResponseBodyResults self = new SearchMemoriesResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public SearchMemoriesResponseBodyResults setActorId(String actorId) {
            this.actorId = actorId;
            return this;
        }
        public String getActorId() {
            return this.actorId;
        }

        public SearchMemoriesResponseBodyResults setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public SearchMemoriesResponseBodyResults setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public SearchMemoriesResponseBodyResults setHash(String hash) {
            this.hash = hash;
            return this;
        }
        public String getHash() {
            return this.hash;
        }

        public SearchMemoriesResponseBodyResults setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public SearchMemoriesResponseBodyResults setMemory(String memory) {
            this.memory = memory;
            return this;
        }
        public String getMemory() {
            return this.memory;
        }

        public SearchMemoriesResponseBodyResults setMetadata(String metadata) {
            this.metadata = metadata;
            return this;
        }
        public String getMetadata() {
            return this.metadata;
        }

        public SearchMemoriesResponseBodyResults setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public SearchMemoriesResponseBodyResults setRunId(String runId) {
            this.runId = runId;
            return this;
        }
        public String getRunId() {
            return this.runId;
        }

        public SearchMemoriesResponseBodyResults setScore(Double score) {
            this.score = score;
            return this;
        }
        public Double getScore() {
            return this.score;
        }

        public SearchMemoriesResponseBodyResults setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public SearchMemoriesResponseBodyResults setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
