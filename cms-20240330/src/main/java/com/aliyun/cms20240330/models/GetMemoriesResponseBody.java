// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetMemoriesResponseBody extends TeaModel {
    /**
     * <p>Relations</p>
     */
    @NameInMap("relations")
    public java.util.List<GetMemoriesResponseBodyRelations> relations;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8FDE2569-626B-5176-9844-28877A*****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Return value</p>
     */
    @NameInMap("results")
    public java.util.List<GetMemoriesResponseBodyResults> results;

    public static GetMemoriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMemoriesResponseBody self = new GetMemoriesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMemoriesResponseBody setRelations(java.util.List<GetMemoriesResponseBodyRelations> relations) {
        this.relations = relations;
        return this;
    }
    public java.util.List<GetMemoriesResponseBodyRelations> getRelations() {
        return this.relations;
    }

    public GetMemoriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMemoriesResponseBody setResults(java.util.List<GetMemoriesResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<GetMemoriesResponseBodyResults> getResults() {
        return this.results;
    }

    public static class GetMemoriesResponseBodyRelations extends TeaModel {
        /**
         * <p>Destination</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("destination")
        public String destination;

        /**
         * <p>Relation</p>
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
         * <p>test_namespace/RegistryModule-test2153b9f3-0be6-455e-9efd-05fd31f62885/alicloud</p>
         */
        @NameInMap("source")
        public String source;

        public static GetMemoriesResponseBodyRelations build(java.util.Map<String, ?> map) throws Exception {
            GetMemoriesResponseBodyRelations self = new GetMemoriesResponseBodyRelations();
            return TeaModel.build(map, self);
        }

        public GetMemoriesResponseBodyRelations setDestination(String destination) {
            this.destination = destination;
            return this;
        }
        public String getDestination() {
            return this.destination;
        }

        public GetMemoriesResponseBodyRelations setRelationship(String relationship) {
            this.relationship = relationship;
            return this;
        }
        public String getRelationship() {
            return this.relationship;
        }

        public GetMemoriesResponseBodyRelations setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

    }

    public static class GetMemoriesResponseBodyResults extends TeaModel {
        /**
         * <p>Actor ID</p>
         * 
         * <strong>example:</strong>
         * <p>test_session_001</p>
         */
        @NameInMap("actorId")
        public String actorId;

        /**
         * <p>Agent ID of the application</p>
         * 
         * <strong>example:</strong>
         * <p>980565235819266048</p>
         */
        @NameInMap("agentId")
        public String agentId;

        /**
         * <strong>example:</strong>
         * <p>test_user_001</p>
         */
        @NameInMap("appId")
        public String appId;

        /**
         * <p>Creation time</p>
         * 
         * <strong>example:</strong>
         * <p>1747623093939</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <p>Memory hash value</p>
         * 
         * <strong>example:</strong>
         * <p>73ad89f2d56c2f8615e5dd0cef7b4c41c074277c91fa0e31fc5b41802c0481f2</p>
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
         * <p>Memory</p>
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
        public java.util.Map<String, ?> metadata;

        /**
         * <p>Message initiator role</p>
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
         * <p>jr-965a0b00cb42a43b</p>
         */
        @NameInMap("runId")
        public String runId;

        /**
         * <p>Similarity score</p>
         * 
         * <strong>example:</strong>
         * <p>30.12</p>
         */
        @NameInMap("score")
        public Double score;

        /**
         * <p>Update time</p>
         * 
         * <strong>example:</strong>
         * <p>1752825865045</p>
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

        public static GetMemoriesResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            GetMemoriesResponseBodyResults self = new GetMemoriesResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public GetMemoriesResponseBodyResults setActorId(String actorId) {
            this.actorId = actorId;
            return this;
        }
        public String getActorId() {
            return this.actorId;
        }

        public GetMemoriesResponseBodyResults setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public GetMemoriesResponseBodyResults setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetMemoriesResponseBodyResults setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetMemoriesResponseBodyResults setHash(String hash) {
            this.hash = hash;
            return this;
        }
        public String getHash() {
            return this.hash;
        }

        public GetMemoriesResponseBodyResults setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetMemoriesResponseBodyResults setMemory(String memory) {
            this.memory = memory;
            return this;
        }
        public String getMemory() {
            return this.memory;
        }

        public GetMemoriesResponseBodyResults setMetadata(java.util.Map<String, ?> metadata) {
            this.metadata = metadata;
            return this;
        }
        public java.util.Map<String, ?> getMetadata() {
            return this.metadata;
        }

        public GetMemoriesResponseBodyResults setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public GetMemoriesResponseBodyResults setRunId(String runId) {
            this.runId = runId;
            return this;
        }
        public String getRunId() {
            return this.runId;
        }

        public GetMemoriesResponseBodyResults setScore(Double score) {
            this.score = score;
            return this;
        }
        public Double getScore() {
            return this.score;
        }

        public GetMemoriesResponseBodyResults setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public GetMemoriesResponseBodyResults setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
