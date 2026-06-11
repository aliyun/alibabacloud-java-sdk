// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetMemoryHistoryResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3B311FD9-A60B-55E0-A896-A0C73*********</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Return value.</p>
     */
    @NameInMap("results")
    public java.util.List<GetMemoryHistoryResponseBodyResults> results;

    public static GetMemoryHistoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMemoryHistoryResponseBody self = new GetMemoryHistoryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMemoryHistoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMemoryHistoryResponseBody setResults(java.util.List<GetMemoryHistoryResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<GetMemoryHistoryResponseBodyResults> getResults() {
        return this.results;
    }

    public static class GetMemoryHistoryResponseBodyResultsInput extends TeaModel {
        /**
         * <p>Message content.</p>
         * 
         * <strong>example:</strong>
         * <p>My name is Zhang San and I live in Hangzhou.</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <p>Message sender role.</p>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("role")
        public String role;

        public static GetMemoryHistoryResponseBodyResultsInput build(java.util.Map<String, ?> map) throws Exception {
            GetMemoryHistoryResponseBodyResultsInput self = new GetMemoryHistoryResponseBodyResultsInput();
            return TeaModel.build(map, self);
        }

        public GetMemoryHistoryResponseBodyResultsInput setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetMemoryHistoryResponseBodyResultsInput setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

    public static class GetMemoryHistoryResponseBodyResults extends TeaModel {
        /**
         * <p>Creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1764556182850</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <p>Event type.</p>
         * 
         * <strong>example:</strong>
         * <p>ADD</p>
         */
        @NameInMap("event")
        public String event;

        /**
         * <p>Memory ID.</p>
         * 
         * <strong>example:</strong>
         * <p>b25d6ad7-306f-4040-9890-4dddd2505a2e</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>Original message.</p>
         */
        @NameInMap("input")
        public java.util.List<GetMemoryHistoryResponseBodyResultsInput> input;

        /**
         * <p>Memory ID.</p>
         * 
         * <strong>example:</strong>
         * <p>019cacf6-7b39-7f61-8314-548f07ca449a</p>
         */
        @NameInMap("memoryId")
        public String memoryId;

        /**
         * <p>Metadata.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;sessionId&quot;:&quot;test_session_001&quot;}</p>
         */
        @NameInMap("metadata")
        public java.util.Map<String, ?> metadata;

        /**
         * <p>New memory.</p>
         * 
         * <strong>example:</strong>
         * <p>I really like Python.</p>
         */
        @NameInMap("newMemory")
        public String newMemory;

        /**
         * <p>Old memory.</p>
         * 
         * <strong>example:</strong>
         * <p>I really don\&quot;t like Python at all.</p>
         */
        @NameInMap("oldMemory")
        public String oldMemory;

        /**
         * <p>Update time.</p>
         * 
         * <strong>example:</strong>
         * <p>1771036123785</p>
         */
        @NameInMap("updatedAt")
        public String updatedAt;

        /**
         * <p>User ID.</p>
         * 
         * <strong>example:</strong>
         * <p>test_session_001</p>
         */
        @NameInMap("userId")
        public String userId;

        public static GetMemoryHistoryResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            GetMemoryHistoryResponseBodyResults self = new GetMemoryHistoryResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public GetMemoryHistoryResponseBodyResults setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetMemoryHistoryResponseBodyResults setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public GetMemoryHistoryResponseBodyResults setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetMemoryHistoryResponseBodyResults setInput(java.util.List<GetMemoryHistoryResponseBodyResultsInput> input) {
            this.input = input;
            return this;
        }
        public java.util.List<GetMemoryHistoryResponseBodyResultsInput> getInput() {
            return this.input;
        }

        public GetMemoryHistoryResponseBodyResults setMemoryId(String memoryId) {
            this.memoryId = memoryId;
            return this;
        }
        public String getMemoryId() {
            return this.memoryId;
        }

        public GetMemoryHistoryResponseBodyResults setMetadata(java.util.Map<String, ?> metadata) {
            this.metadata = metadata;
            return this;
        }
        public java.util.Map<String, ?> getMetadata() {
            return this.metadata;
        }

        public GetMemoryHistoryResponseBodyResults setNewMemory(String newMemory) {
            this.newMemory = newMemory;
            return this;
        }
        public String getNewMemory() {
            return this.newMemory;
        }

        public GetMemoryHistoryResponseBodyResults setOldMemory(String oldMemory) {
            this.oldMemory = oldMemory;
            return this;
        }
        public String getOldMemory() {
            return this.oldMemory;
        }

        public GetMemoryHistoryResponseBodyResults setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public GetMemoryHistoryResponseBodyResults setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
