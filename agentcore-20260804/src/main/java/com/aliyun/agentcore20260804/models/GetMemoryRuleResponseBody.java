// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class GetMemoryRuleResponseBody extends TeaModel {
    /**
     * <p>code</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>data</p>
     */
    @NameInMap("data")
    public GetMemoryRuleResponseBodyData data;

    /**
     * <p>httpStatusCode</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>message</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

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

    public static GetMemoryRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMemoryRuleResponseBody self = new GetMemoryRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMemoryRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetMemoryRuleResponseBody setData(GetMemoryRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetMemoryRuleResponseBodyData getData() {
        return this.data;
    }

    public GetMemoryRuleResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetMemoryRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetMemoryRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMemoryRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetMemoryRuleResponseBodyDataStrategy extends TeaModel {
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

        public static GetMemoryRuleResponseBodyDataStrategy build(java.util.Map<String, ?> map) throws Exception {
            GetMemoryRuleResponseBodyDataStrategy self = new GetMemoryRuleResponseBodyDataStrategy();
            return TeaModel.build(map, self);
        }

        public GetMemoryRuleResponseBodyDataStrategy setInstruction(String instruction) {
            this.instruction = instruction;
            return this;
        }
        public String getInstruction() {
            return this.instruction;
        }

        public GetMemoryRuleResponseBodyDataStrategy setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetMemoryRuleResponseBodyData extends TeaModel {
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
         * <p>description</p>
         * 
         * <strong>example:</strong>
         * <p>Extract long-term preferences explicitly expressed by the user</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>enabled</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>failedTaskCount</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("failedTaskCount")
        public Long failedTaskCount;

        /**
         * <p>The time when the last execution started, in RFC 3339 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-23T10:00:00Z</p>
         */
        @NameInMap("lastExecutedAt")
        public String lastExecutedAt;

        /**
         * <p>lastTaskId</p>
         * 
         * <strong>example:</strong>
         * <p>task-2f5f9c5a8d0e4c3b</p>
         */
        @NameInMap("lastTaskId")
        public String lastTaskId;

        /**
         * <p>lastTaskStatus</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCEEDED</p>
         */
        @NameInMap("lastTaskStatus")
        public String lastTaskStatus;

        /**
         * <p>memoryStoreId</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ms-2f5f9c5a8d0e4c3b</p>
         */
        @NameInMap("memoryStoreId")
        public String memoryStoreId;

        /**
         * <p>name</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Long-term preferences</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>ruleId</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rule-2f5f9c5a8d0e4c3b</p>
         */
        @NameInMap("ruleId")
        public String ruleId;

        /**
         * <p>strategy</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("strategy")
        public GetMemoryRuleResponseBodyDataStrategy strategy;

        /**
         * <p>succeededTaskCount</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("succeededTaskCount")
        public Long succeededTaskCount;

        /**
         * <p>The total number of distinct task IDs that have started execution. Retries are not counted separately.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("taskCount")
        public Long taskCount;

        /**
         * <p>updatedAt</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-23T10:00:00Z</p>
         */
        @NameInMap("updatedAt")
        public String updatedAt;

        public static GetMemoryRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMemoryRuleResponseBodyData self = new GetMemoryRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMemoryRuleResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetMemoryRuleResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetMemoryRuleResponseBodyData setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public GetMemoryRuleResponseBodyData setFailedTaskCount(Long failedTaskCount) {
            this.failedTaskCount = failedTaskCount;
            return this;
        }
        public Long getFailedTaskCount() {
            return this.failedTaskCount;
        }

        public GetMemoryRuleResponseBodyData setLastExecutedAt(String lastExecutedAt) {
            this.lastExecutedAt = lastExecutedAt;
            return this;
        }
        public String getLastExecutedAt() {
            return this.lastExecutedAt;
        }

        public GetMemoryRuleResponseBodyData setLastTaskId(String lastTaskId) {
            this.lastTaskId = lastTaskId;
            return this;
        }
        public String getLastTaskId() {
            return this.lastTaskId;
        }

        public GetMemoryRuleResponseBodyData setLastTaskStatus(String lastTaskStatus) {
            this.lastTaskStatus = lastTaskStatus;
            return this;
        }
        public String getLastTaskStatus() {
            return this.lastTaskStatus;
        }

        public GetMemoryRuleResponseBodyData setMemoryStoreId(String memoryStoreId) {
            this.memoryStoreId = memoryStoreId;
            return this;
        }
        public String getMemoryStoreId() {
            return this.memoryStoreId;
        }

        public GetMemoryRuleResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetMemoryRuleResponseBodyData setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public GetMemoryRuleResponseBodyData setStrategy(GetMemoryRuleResponseBodyDataStrategy strategy) {
            this.strategy = strategy;
            return this;
        }
        public GetMemoryRuleResponseBodyDataStrategy getStrategy() {
            return this.strategy;
        }

        public GetMemoryRuleResponseBodyData setSucceededTaskCount(Long succeededTaskCount) {
            this.succeededTaskCount = succeededTaskCount;
            return this;
        }
        public Long getSucceededTaskCount() {
            return this.succeededTaskCount;
        }

        public GetMemoryRuleResponseBodyData setTaskCount(Long taskCount) {
            this.taskCount = taskCount;
            return this;
        }
        public Long getTaskCount() {
            return this.taskCount;
        }

        public GetMemoryRuleResponseBodyData setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

    }

}
