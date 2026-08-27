// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class ListWorkerStatsDetailsResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The list of Worker statistics details.</p>
     * 
     * <strong>example:</strong>
     * <p>[...]</p>
     */
    @NameInMap("Items")
    public java.util.List<ListWorkerStatsDetailsResponseBodyItems> items;

    /**
     * <p>The maximum number of entries to return per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The pagination token for the next page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-XX-XX-XX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>25</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListWorkerStatsDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWorkerStatsDetailsResponseBody self = new ListWorkerStatsDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWorkerStatsDetailsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListWorkerStatsDetailsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListWorkerStatsDetailsResponseBody setItems(java.util.List<ListWorkerStatsDetailsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListWorkerStatsDetailsResponseBodyItems> getItems() {
        return this.items;
    }

    public ListWorkerStatsDetailsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListWorkerStatsDetailsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListWorkerStatsDetailsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListWorkerStatsDetailsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListWorkerStatsDetailsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListWorkerStatsDetailsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListWorkerStatsDetailsResponseBodyItems extends TeaModel {
        /**
         * <p>The LLM call count.</p>
         * 
         * <strong>example:</strong>
         * <p>350</p>
         */
        @NameInMap("LlmCallCount")
        public Long llmCallCount;

        /**
         * <p>The model name.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-max</p>
         */
        @NameInMap("Model")
        public String model;

        /**
         * <p>The Worker name.</p>
         * 
         * <strong>example:</strong>
         * <p>worker-demo</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The Worker status.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The task count.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("TaskCount")
        public Long taskCount;

        /**
         * <p>The token usage.</p>
         * 
         * <strong>example:</strong>
         * <p>500000</p>
         */
        @NameInMap("TokenUsage")
        public Long tokenUsage;

        public static ListWorkerStatsDetailsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListWorkerStatsDetailsResponseBodyItems self = new ListWorkerStatsDetailsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListWorkerStatsDetailsResponseBodyItems setLlmCallCount(Long llmCallCount) {
            this.llmCallCount = llmCallCount;
            return this;
        }
        public Long getLlmCallCount() {
            return this.llmCallCount;
        }

        public ListWorkerStatsDetailsResponseBodyItems setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public ListWorkerStatsDetailsResponseBodyItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListWorkerStatsDetailsResponseBodyItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListWorkerStatsDetailsResponseBodyItems setTaskCount(Long taskCount) {
            this.taskCount = taskCount;
            return this;
        }
        public Long getTaskCount() {
            return this.taskCount;
        }

        public ListWorkerStatsDetailsResponseBodyItems setTokenUsage(Long tokenUsage) {
            this.tokenUsage = tokenUsage;
            return this;
        }
        public Long getTokenUsage() {
            return this.tokenUsage;
        }

    }

}
