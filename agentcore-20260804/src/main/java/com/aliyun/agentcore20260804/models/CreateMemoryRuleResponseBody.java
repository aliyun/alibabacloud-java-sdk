// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class CreateMemoryRuleResponseBody extends TeaModel {
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
    public CreateMemoryRuleResponseBodyData data;

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

    public static CreateMemoryRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMemoryRuleResponseBody self = new CreateMemoryRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMemoryRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateMemoryRuleResponseBody setData(CreateMemoryRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateMemoryRuleResponseBodyData getData() {
        return this.data;
    }

    public CreateMemoryRuleResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateMemoryRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateMemoryRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateMemoryRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateMemoryRuleResponseBodyDataStrategy extends TeaModel {
        /**
         * <p>The strategy-level instruction. It takes effect together with the store-level instruction. If a conflict occurs, this field takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>Retain only long-term preferences explicitly expressed by users</p>
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

        public static CreateMemoryRuleResponseBodyDataStrategy build(java.util.Map<String, ?> map) throws Exception {
            CreateMemoryRuleResponseBodyDataStrategy self = new CreateMemoryRuleResponseBodyDataStrategy();
            return TeaModel.build(map, self);
        }

        public CreateMemoryRuleResponseBodyDataStrategy setInstruction(String instruction) {
            this.instruction = instruction;
            return this;
        }
        public String getInstruction() {
            return this.instruction;
        }

        public CreateMemoryRuleResponseBodyDataStrategy setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateMemoryRuleResponseBodyData extends TeaModel {
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
         * <p>Extract long-term preferences explicitly expressed by users</p>
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
        public CreateMemoryRuleResponseBodyDataStrategy strategy;

        /**
         * <p>updatedAt</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-23T10:00:00Z</p>
         */
        @NameInMap("updatedAt")
        public String updatedAt;

        public static CreateMemoryRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateMemoryRuleResponseBodyData self = new CreateMemoryRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateMemoryRuleResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public CreateMemoryRuleResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateMemoryRuleResponseBodyData setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public CreateMemoryRuleResponseBodyData setMemoryStoreId(String memoryStoreId) {
            this.memoryStoreId = memoryStoreId;
            return this;
        }
        public String getMemoryStoreId() {
            return this.memoryStoreId;
        }

        public CreateMemoryRuleResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateMemoryRuleResponseBodyData setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public CreateMemoryRuleResponseBodyData setStrategy(CreateMemoryRuleResponseBodyDataStrategy strategy) {
            this.strategy = strategy;
            return this;
        }
        public CreateMemoryRuleResponseBodyDataStrategy getStrategy() {
            return this.strategy;
        }

        public CreateMemoryRuleResponseBodyData setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

    }

}
