// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class ListTeamDetailsResponseBody extends TeaModel {
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
     * <p>The list of team statistical details.</p>
     * 
     * <strong>example:</strong>
     * <p>[...]</p>
     */
    @NameInMap("Items")
    public java.util.List<ListTeamDetailsResponseBodyItems> items;

    /**
     * <p>The maximum number of records to return in this request.</p>
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
     * <p>The pagination token for the next page. This parameter is empty if no more data is available.</p>
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
     * <p>req-list-team-details-001</p>
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
     * <p>The total number of records that meet the conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
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
        /**
         * <p>The URL of the team avatar.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/avatar.png">https://example.com/avatar.png</a></p>
         */
        @NameInMap("AvatarUrl")
        public String avatarUrl;

        /**
         * <p>The running status of the team.</p>
         * 
         * <strong>example:</strong>
         * <p>Deleting</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The task success rate. Valid values: 0 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>95.5</p>
         */
        @NameInMap("SuccessRate")
        public Double successRate;

        /**
         * <p>The number of tasks for the team.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("TaskCount")
        public Integer taskCount;

        /**
         * <p>The team name.</p>
         * 
         * <strong>example:</strong>
         * <p>my-team</p>
         */
        @NameInMap("TeamName")
        public String teamName;

        /**
         * <p>The token usage within the time interval.</p>
         * 
         * <strong>example:</strong>
         * <p>1024000</p>
         */
        @NameInMap("TokenUsage")
        public Long tokenUsage;

        /**
         * <p>The number of workers associated with the team.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
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
