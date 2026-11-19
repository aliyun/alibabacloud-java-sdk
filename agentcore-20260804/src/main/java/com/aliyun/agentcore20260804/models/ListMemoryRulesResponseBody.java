// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListMemoryRulesResponseBody extends TeaModel {
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
    public java.util.List<ListMemoryRulesResponseBodyItems> items;

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

    public static ListMemoryRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMemoryRulesResponseBody self = new ListMemoryRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMemoryRulesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListMemoryRulesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListMemoryRulesResponseBody setItems(java.util.List<ListMemoryRulesResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListMemoryRulesResponseBodyItems> getItems() {
        return this.items;
    }

    public ListMemoryRulesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListMemoryRulesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListMemoryRulesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListMemoryRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMemoryRulesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListMemoryRulesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListMemoryRulesResponseBodyItemsStrategy extends TeaModel {
        /**
         * <p>The strategy-level instruction. It takes effect together with the store-level instruction. This field takes precedence in case of conflicts.</p>
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

        public static ListMemoryRulesResponseBodyItemsStrategy build(java.util.Map<String, ?> map) throws Exception {
            ListMemoryRulesResponseBodyItemsStrategy self = new ListMemoryRulesResponseBodyItemsStrategy();
            return TeaModel.build(map, self);
        }

        public ListMemoryRulesResponseBodyItemsStrategy setInstruction(String instruction) {
            this.instruction = instruction;
            return this;
        }
        public String getInstruction() {
            return this.instruction;
        }

        public ListMemoryRulesResponseBodyItemsStrategy setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListMemoryRulesResponseBodyItems extends TeaModel {
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
         * <p>Long-term preference</p>
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
        public ListMemoryRulesResponseBodyItemsStrategy strategy;

        /**
         * <p>updatedAt</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-23T10:00:00Z</p>
         */
        @NameInMap("updatedAt")
        public String updatedAt;

        public static ListMemoryRulesResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListMemoryRulesResponseBodyItems self = new ListMemoryRulesResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListMemoryRulesResponseBodyItems setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListMemoryRulesResponseBodyItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListMemoryRulesResponseBodyItems setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public ListMemoryRulesResponseBodyItems setMemoryStoreId(String memoryStoreId) {
            this.memoryStoreId = memoryStoreId;
            return this;
        }
        public String getMemoryStoreId() {
            return this.memoryStoreId;
        }

        public ListMemoryRulesResponseBodyItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListMemoryRulesResponseBodyItems setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public ListMemoryRulesResponseBodyItems setStrategy(ListMemoryRulesResponseBodyItemsStrategy strategy) {
            this.strategy = strategy;
            return this;
        }
        public ListMemoryRulesResponseBodyItemsStrategy getStrategy() {
            return this.strategy;
        }

        public ListMemoryRulesResponseBodyItems setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

    }

}
