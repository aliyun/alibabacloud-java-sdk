// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class ListTeamDetailsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Items")
    public java.util.List<ListTeamDetailsResponseBodyItems> items;

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

    public static ListTeamDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTeamDetailsResponseBody self = new ListTeamDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTeamDetailsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListTeamDetailsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListTeamDetailsResponseBody setItems(java.util.List<ListTeamDetailsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListTeamDetailsResponseBodyItems> getItems() {
        return this.items;
    }

    public ListTeamDetailsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListTeamDetailsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListTeamDetailsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTeamDetailsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTeamDetailsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListTeamDetailsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListTeamDetailsResponseBodyItems extends TeaModel {
        @NameInMap("AvatarUrl")
        public String avatarUrl;

        @NameInMap("Status")
        public String status;

        @NameInMap("SuccessRate")
        public Double successRate;

        @NameInMap("TaskCount")
        public Integer taskCount;

        @NameInMap("TeamName")
        public String teamName;

        @NameInMap("TokenUsage")
        public Long tokenUsage;

        @NameInMap("WorkerCount")
        public Integer workerCount;

        public static ListTeamDetailsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListTeamDetailsResponseBodyItems self = new ListTeamDetailsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListTeamDetailsResponseBodyItems setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public ListTeamDetailsResponseBodyItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListTeamDetailsResponseBodyItems setSuccessRate(Double successRate) {
            this.successRate = successRate;
            return this;
        }
        public Double getSuccessRate() {
            return this.successRate;
        }

        public ListTeamDetailsResponseBodyItems setTaskCount(Integer taskCount) {
            this.taskCount = taskCount;
            return this;
        }
        public Integer getTaskCount() {
            return this.taskCount;
        }

        public ListTeamDetailsResponseBodyItems setTeamName(String teamName) {
            this.teamName = teamName;
            return this;
        }
        public String getTeamName() {
            return this.teamName;
        }

        public ListTeamDetailsResponseBodyItems setTokenUsage(Long tokenUsage) {
            this.tokenUsage = tokenUsage;
            return this;
        }
        public Long getTokenUsage() {
            return this.tokenUsage;
        }

        public ListTeamDetailsResponseBodyItems setWorkerCount(Integer workerCount) {
            this.workerCount = workerCount;
            return this;
        }
        public Integer getWorkerCount() {
            return this.workerCount;
        }

    }

}
