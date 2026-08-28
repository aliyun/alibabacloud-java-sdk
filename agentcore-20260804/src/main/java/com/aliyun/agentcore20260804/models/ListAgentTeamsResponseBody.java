// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListAgentTeamsResponseBody extends TeaModel {
    /**
     * <p>The business status code.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The list of agent-team membership relationships.</p>
     */
    @NameInMap("items")
    public java.util.List<ListAgentTeamsResponseBodyItems> items;

    /**
     * <p>The number of records returned on the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The response message. An error description is returned if the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The cursor used to retrieve the next page. An empty value indicates that no more data is available.</p>
     * 
     * <strong>example:</strong>
     * <p>dXNlci1vZmZzZXQ6MTA</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>request-123456</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <p>The total number of records that match the conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("totalCount")
    public Long totalCount;

    public static ListAgentTeamsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAgentTeamsResponseBody self = new ListAgentTeamsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAgentTeamsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAgentTeamsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListAgentTeamsResponseBody setItems(java.util.List<ListAgentTeamsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListAgentTeamsResponseBodyItems> getItems() {
        return this.items;
    }

    public ListAgentTeamsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAgentTeamsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAgentTeamsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAgentTeamsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAgentTeamsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListAgentTeamsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListAgentTeamsResponseBodyItems extends TeaModel {
        /**
         * <p>The agent ID.</p>
         * 
         * <strong>example:</strong>
         * <p>agent-123456</p>
         */
        @NameInMap("agentId")
        public String agentId;

        /**
         * <p>The team ID.</p>
         * 
         * <strong>example:</strong>
         * <p>team-123456</p>
         */
        @NameInMap("teamId")
        public String teamId;

        /**
         * <p>The team name.</p>
         * 
         * <strong>example:</strong>
         * <p>Default Team</p>
         */
        @NameInMap("teamName")
        public String teamName;

        /**
         * <p>The role of the agent in the team.</p>
         * 
         * <strong>example:</strong>
         * <p>MEMBER</p>
         */
        @NameInMap("teamRole")
        public String teamRole;

        public static ListAgentTeamsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListAgentTeamsResponseBodyItems self = new ListAgentTeamsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListAgentTeamsResponseBodyItems setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public ListAgentTeamsResponseBodyItems setTeamId(String teamId) {
            this.teamId = teamId;
            return this;
        }
        public String getTeamId() {
            return this.teamId;
        }

        public ListAgentTeamsResponseBodyItems setTeamName(String teamName) {
            this.teamName = teamName;
            return this;
        }
        public String getTeamName() {
            return this.teamName;
        }

        public ListAgentTeamsResponseBodyItems setTeamRole(String teamRole) {
            this.teamRole = teamRole;
            return this;
        }
        public String getTeamRole() {
            return this.teamRole;
        }

    }

}
