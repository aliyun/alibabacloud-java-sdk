// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class ListWorkerStatsDetailsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Items")
    public java.util.List<ListWorkerStatsDetailsResponseBodyItems> items;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("Message")
    public String message;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

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
        @NameInMap("LlmCallCount")
        public Long llmCallCount;

        @NameInMap("Model")
        public String model;

        @NameInMap("Name")
        public String name;

        @NameInMap("Status")
        public String status;

        @NameInMap("TaskCount")
        public Long taskCount;

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
