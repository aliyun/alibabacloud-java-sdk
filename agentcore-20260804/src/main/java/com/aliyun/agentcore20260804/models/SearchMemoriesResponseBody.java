// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class SearchMemoriesResponseBody extends TeaModel {
    /**
     * <p>The business status code.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The retrieval results.</p>
     */
    @NameInMap("data")
    public SearchMemoriesResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The response message.</p>
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
     * <p>01A00000-0000-0000-0000-000000000001</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static SearchMemoriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchMemoriesResponseBody self = new SearchMemoriesResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchMemoriesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SearchMemoriesResponseBody setData(SearchMemoriesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SearchMemoriesResponseBodyData getData() {
        return this.data;
    }

    public SearchMemoriesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public SearchMemoriesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SearchMemoriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchMemoriesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SearchMemoriesResponseBodyDataMemoriesMemoryContent extends TeaModel {
        /**
         * <p>The memory text.</p>
         * 
         * <strong>example:</strong>
         * <p>The user likes hiking</p>
         */
        @NameInMap("text")
        public String text;

        public static SearchMemoriesResponseBodyDataMemoriesMemoryContent build(java.util.Map<String, ?> map) throws Exception {
            SearchMemoriesResponseBodyDataMemoriesMemoryContent self = new SearchMemoriesResponseBodyDataMemoriesMemoryContent();
            return TeaModel.build(map, self);
        }

        public SearchMemoriesResponseBodyDataMemoriesMemoryContent setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class SearchMemoriesResponseBodyDataMemoriesMemoryScope extends TeaModel {
        /**
         * <p>The agent ID. The ID must be 1 to 128 bytes in length and encoded in UTF-8. The ID cannot contain a forward slash (/) or an asterisk (*). If the memory is not associated with an agent ID, this field is not returned.</p>
         * 
         * <strong>example:</strong>
         * <p>agent-001</p>
         */
        @NameInMap("agentId")
        public String agentId;

        /**
         * <p>The session ID. The ID must be 1 to 128 bytes in length and encoded in UTF-8. The ID cannot contain a forward slash (/) or an asterisk (*). If the memory is not associated with a session ID, this field is not returned.</p>
         * 
         * <strong>example:</strong>
         * <p>session-001</p>
         */
        @NameInMap("sessionId")
        public String sessionId;

        /**
         * <p>The user ID. The ID must be 1 to 128 bytes in length and encoded in UTF-8. The ID cannot contain a forward slash (/) or an asterisk (*). If the memory is not associated with a user ID, this field is not returned.</p>
         * 
         * <strong>example:</strong>
         * <p>user-001</p>
         */
        @NameInMap("userId")
        public String userId;

        public static SearchMemoriesResponseBodyDataMemoriesMemoryScope build(java.util.Map<String, ?> map) throws Exception {
            SearchMemoriesResponseBodyDataMemoriesMemoryScope self = new SearchMemoriesResponseBodyDataMemoriesMemoryScope();
            return TeaModel.build(map, self);
        }

        public SearchMemoriesResponseBodyDataMemoriesMemoryScope setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public SearchMemoriesResponseBodyDataMemoriesMemoryScope setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public SearchMemoriesResponseBodyDataMemoriesMemoryScope setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class SearchMemoriesResponseBodyDataMemoriesMemory extends TeaModel {
        /**
         * <p>The memory content.</p>
         */
        @NameInMap("content")
        public SearchMemoriesResponseBodyDataMemoriesMemoryContent content;

        /**
         * <p>The time when the memory was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-23T10:00:00Z</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <p>The long-term memory ID.</p>
         * 
         * <strong>example:</strong>
         * <p>mem-2f5f9c5a8d0e4c3b</p>
         */
        @NameInMap("memoryId")
        public String memoryId;

        /**
         * <p>The memory metadata.</p>
         */
        @NameInMap("metadata")
        public java.util.Map<String, String> metadata;

        /**
         * <p>The memory scope.</p>
         */
        @NameInMap("scope")
        public SearchMemoriesResponseBodyDataMemoriesMemoryScope scope;

        /**
         * <p>The time when the memory was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-23T10:05:00Z</p>
         */
        @NameInMap("updatedAt")
        public String updatedAt;

        public static SearchMemoriesResponseBodyDataMemoriesMemory build(java.util.Map<String, ?> map) throws Exception {
            SearchMemoriesResponseBodyDataMemoriesMemory self = new SearchMemoriesResponseBodyDataMemoriesMemory();
            return TeaModel.build(map, self);
        }

        public SearchMemoriesResponseBodyDataMemoriesMemory setContent(SearchMemoriesResponseBodyDataMemoriesMemoryContent content) {
            this.content = content;
            return this;
        }
        public SearchMemoriesResponseBodyDataMemoriesMemoryContent getContent() {
            return this.content;
        }

        public SearchMemoriesResponseBodyDataMemoriesMemory setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public SearchMemoriesResponseBodyDataMemoriesMemory setMemoryId(String memoryId) {
            this.memoryId = memoryId;
            return this;
        }
        public String getMemoryId() {
            return this.memoryId;
        }

        public SearchMemoriesResponseBodyDataMemoriesMemory setMetadata(java.util.Map<String, String> metadata) {
            this.metadata = metadata;
            return this;
        }
        public java.util.Map<String, String> getMetadata() {
            return this.metadata;
        }

        public SearchMemoriesResponseBodyDataMemoriesMemory setScope(SearchMemoriesResponseBodyDataMemoriesMemoryScope scope) {
            this.scope = scope;
            return this;
        }
        public SearchMemoriesResponseBodyDataMemoriesMemoryScope getScope() {
            return this.scope;
        }

        public SearchMemoriesResponseBodyDataMemoriesMemory setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

    }

    public static class SearchMemoriesResponseBodyDataMemories extends TeaModel {
        /**
         * <p>The matched memory.</p>
         */
        @NameInMap("memory")
        public SearchMemoriesResponseBodyDataMemoriesMemory memory;

        /**
         * <p>The relevance score.</p>
         * 
         * <strong>example:</strong>
         * <p>0.86</p>
         */
        @NameInMap("score")
        public Float score;

        /**
         * <p>The vector similarity.</p>
         * 
         * <strong>example:</strong>
         * <p>0.91</p>
         */
        @NameInMap("similarity")
        public Float similarity;

        public static SearchMemoriesResponseBodyDataMemories build(java.util.Map<String, ?> map) throws Exception {
            SearchMemoriesResponseBodyDataMemories self = new SearchMemoriesResponseBodyDataMemories();
            return TeaModel.build(map, self);
        }

        public SearchMemoriesResponseBodyDataMemories setMemory(SearchMemoriesResponseBodyDataMemoriesMemory memory) {
            this.memory = memory;
            return this;
        }
        public SearchMemoriesResponseBodyDataMemoriesMemory getMemory() {
            return this.memory;
        }

        public SearchMemoriesResponseBodyDataMemories setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public SearchMemoriesResponseBodyDataMemories setSimilarity(Float similarity) {
            this.similarity = similarity;
            return this;
        }
        public Float getSimilarity() {
            return this.similarity;
        }

    }

    public static class SearchMemoriesResponseBodyData extends TeaModel {
        /**
         * <p>The list of retrieval results.</p>
         */
        @NameInMap("memories")
        public java.util.List<SearchMemoriesResponseBodyDataMemories> memories;

        public static SearchMemoriesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SearchMemoriesResponseBodyData self = new SearchMemoriesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SearchMemoriesResponseBodyData setMemories(java.util.List<SearchMemoriesResponseBodyDataMemories> memories) {
            this.memories = memories;
            return this;
        }
        public java.util.List<SearchMemoriesResponseBodyDataMemories> getMemories() {
            return this.memories;
        }

    }

}
