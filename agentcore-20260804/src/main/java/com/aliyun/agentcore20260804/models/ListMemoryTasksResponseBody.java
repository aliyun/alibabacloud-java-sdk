// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListMemoryTasksResponseBody extends TeaModel {
    /**
     * <p>code</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>httpStatusCode</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>items</p>
     */
    @NameInMap("items")
    public java.util.List<ListMemoryTasksResponseBodyItems> items;

    /**
     * <p>maxResults</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>message</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>nextToken</p>
     * 
     * <strong>example:</strong>
     * <p>eyJvZmZzZXQiOjIwMH0=</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>requestId</p>
     * 
     * <strong>example:</strong>
     * <p>01A00000-0000-0000-0000-000000000001</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>success</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <p>totalCount</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("totalCount")
    public Long totalCount;

    public static ListMemoryTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMemoryTasksResponseBody self = new ListMemoryTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMemoryTasksResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListMemoryTasksResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListMemoryTasksResponseBody setItems(java.util.List<ListMemoryTasksResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListMemoryTasksResponseBodyItems> getItems() {
        return this.items;
    }

    public ListMemoryTasksResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListMemoryTasksResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListMemoryTasksResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListMemoryTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMemoryTasksResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListMemoryTasksResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListMemoryTasksResponseBodyItemsChanges extends TeaModel {
        /**
         * <p>memoryId</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mem-2f5f9c5a8d0e4c3b</p>
         */
        @NameInMap("memoryId")
        public String memoryId;

        /**
         * <p>operation</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ADD</p>
         */
        @NameInMap("operation")
        public String operation;

        public static ListMemoryTasksResponseBodyItemsChanges build(java.util.Map<String, ?> map) throws Exception {
            ListMemoryTasksResponseBodyItemsChanges self = new ListMemoryTasksResponseBodyItemsChanges();
            return TeaModel.build(map, self);
        }

        public ListMemoryTasksResponseBodyItemsChanges setMemoryId(String memoryId) {
            this.memoryId = memoryId;
            return this;
        }
        public String getMemoryId() {
            return this.memoryId;
        }

        public ListMemoryTasksResponseBodyItemsChanges setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

    }

    public static class ListMemoryTasksResponseBodyItemsError extends TeaModel {
        /**
         * <p>code</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>InvalidParameter</p>
         */
        @NameInMap("code")
        public String code;

        /**
         * <p>message</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>The event content format is incorrect</p>
         */
        @NameInMap("message")
        public String message;

        public static ListMemoryTasksResponseBodyItemsError build(java.util.Map<String, ?> map) throws Exception {
            ListMemoryTasksResponseBodyItemsError self = new ListMemoryTasksResponseBodyItemsError();
            return TeaModel.build(map, self);
        }

        public ListMemoryTasksResponseBodyItemsError setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListMemoryTasksResponseBodyItemsError setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class ListMemoryTasksResponseBodyItemsMemories extends TeaModel {
        /**
         * <p>memoryId</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mem-2f5f9c5a8d0e4c3b</p>
         */
        @NameInMap("memoryId")
        public String memoryId;

        public static ListMemoryTasksResponseBodyItemsMemories build(java.util.Map<String, ?> map) throws Exception {
            ListMemoryTasksResponseBodyItemsMemories self = new ListMemoryTasksResponseBodyItemsMemories();
            return TeaModel.build(map, self);
        }

        public ListMemoryTasksResponseBodyItemsMemories setMemoryId(String memoryId) {
            this.memoryId = memoryId;
            return this;
        }
        public String getMemoryId() {
            return this.memoryId;
        }

    }

    public static class ListMemoryTasksResponseBodyItemsStrategyConfig extends TeaModel {
        /**
         * <p>The strategy-level instruction. It takes effect together with the store-level instruction. If a conflict occurs, this field takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>Retain only long-term preferences explicitly expressed by the user</p>
         */
        @NameInMap("instruction")
        public String instruction;

        /**
         * <p>type</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>auto</p>
         */
        @NameInMap("type")
        public String type;

        public static ListMemoryTasksResponseBodyItemsStrategyConfig build(java.util.Map<String, ?> map) throws Exception {
            ListMemoryTasksResponseBodyItemsStrategyConfig self = new ListMemoryTasksResponseBodyItemsStrategyConfig();
            return TeaModel.build(map, self);
        }

        public ListMemoryTasksResponseBodyItemsStrategyConfig setInstruction(String instruction) {
            this.instruction = instruction;
            return this;
        }
        public String getInstruction() {
            return this.instruction;
        }

        public ListMemoryTasksResponseBodyItemsStrategyConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListMemoryTasksResponseBodyItems extends TeaModel {
        /**
         * <p>changes</p>
         */
        @NameInMap("changes")
        public java.util.List<ListMemoryTasksResponseBodyItemsChanges> changes;

        /**
         * <p>createdAt</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-23T10:00:00Z</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <p>error</p>
         */
        @NameInMap("error")
        public ListMemoryTasksResponseBodyItemsError error;

        /**
         * <p>finishedAt</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-23T10:00:01Z</p>
         */
        @NameInMap("finishedAt")
        public String finishedAt;

        /**
         * <p>inputMessageCount</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("inputMessageCount")
        public Long inputMessageCount;

        /**
         * <p>inputTokenCount</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("inputTokenCount")
        public Long inputTokenCount;

        /**
         * <p>memories</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("memories")
        public java.util.List<ListMemoryTasksResponseBodyItemsMemories> memories;

        /**
         * <p>startedAt</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-23T10:00:00Z</p>
         */
        @NameInMap("startedAt")
        public String startedAt;

        /**
         * <p>status</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCEEDED</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>strategyConfig</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("strategyConfig")
        public ListMemoryTasksResponseBodyItemsStrategyConfig strategyConfig;

        /**
         * <p>taskId</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>task-2f5f9c5a8d0e4c3b</p>
         */
        @NameInMap("taskId")
        public String taskId;

        /**
         * <p>triggerType</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>AUTO</p>
         */
        @NameInMap("triggerType")
        public String triggerType;

        public static ListMemoryTasksResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListMemoryTasksResponseBodyItems self = new ListMemoryTasksResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListMemoryTasksResponseBodyItems setChanges(java.util.List<ListMemoryTasksResponseBodyItemsChanges> changes) {
            this.changes = changes;
            return this;
        }
        public java.util.List<ListMemoryTasksResponseBodyItemsChanges> getChanges() {
            return this.changes;
        }

        public ListMemoryTasksResponseBodyItems setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListMemoryTasksResponseBodyItems setError(ListMemoryTasksResponseBodyItemsError error) {
            this.error = error;
            return this;
        }
        public ListMemoryTasksResponseBodyItemsError getError() {
            return this.error;
        }

        public ListMemoryTasksResponseBodyItems setFinishedAt(String finishedAt) {
            this.finishedAt = finishedAt;
            return this;
        }
        public String getFinishedAt() {
            return this.finishedAt;
        }

        public ListMemoryTasksResponseBodyItems setInputMessageCount(Long inputMessageCount) {
            this.inputMessageCount = inputMessageCount;
            return this;
        }
        public Long getInputMessageCount() {
            return this.inputMessageCount;
        }

        public ListMemoryTasksResponseBodyItems setInputTokenCount(Long inputTokenCount) {
            this.inputTokenCount = inputTokenCount;
            return this;
        }
        public Long getInputTokenCount() {
            return this.inputTokenCount;
        }

        public ListMemoryTasksResponseBodyItems setMemories(java.util.List<ListMemoryTasksResponseBodyItemsMemories> memories) {
            this.memories = memories;
            return this;
        }
        public java.util.List<ListMemoryTasksResponseBodyItemsMemories> getMemories() {
            return this.memories;
        }

        public ListMemoryTasksResponseBodyItems setStartedAt(String startedAt) {
            this.startedAt = startedAt;
            return this;
        }
        public String getStartedAt() {
            return this.startedAt;
        }

        public ListMemoryTasksResponseBodyItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListMemoryTasksResponseBodyItems setStrategyConfig(ListMemoryTasksResponseBodyItemsStrategyConfig strategyConfig) {
            this.strategyConfig = strategyConfig;
            return this;
        }
        public ListMemoryTasksResponseBodyItemsStrategyConfig getStrategyConfig() {
            return this.strategyConfig;
        }

        public ListMemoryTasksResponseBodyItems setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListMemoryTasksResponseBodyItems setTriggerType(String triggerType) {
            this.triggerType = triggerType;
            return this;
        }
        public String getTriggerType() {
            return this.triggerType;
        }

    }

}
