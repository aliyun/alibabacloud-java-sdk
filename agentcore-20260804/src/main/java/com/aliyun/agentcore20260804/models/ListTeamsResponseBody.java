// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListTeamsResponseBody extends TeaModel {
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
     * <p>The list of teams.</p>
     */
    @NameInMap("items")
    public java.util.List<ListTeamsResponseBodyItems> items;

    /**
     * <p>The maximum number of records per page that took effect for this query.</p>
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
     * <p>The pagination token for the next page. This parameter is empty if no more pages are available.</p>
     * 
     * <strong>example:</strong>
     * <p>dGVhbS1vZmZzZXQ6MTA</p>
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
     * <p>The total number of teams that match the query conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>42</p>
     */
    @NameInMap("totalCount")
    public Long totalCount;

    public static ListTeamsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTeamsResponseBody self = new ListTeamsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTeamsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListTeamsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListTeamsResponseBody setItems(java.util.List<ListTeamsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListTeamsResponseBodyItems> getItems() {
        return this.items;
    }

    public ListTeamsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListTeamsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListTeamsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTeamsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTeamsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListTeamsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListTeamsResponseBodyItemsAgents extends TeaModel {
        /**
         * <p>The agent ID.</p>
         * 
         * <strong>example:</strong>
         * <p>agent-123456</p>
         */
        @NameInMap("agentId")
        public String agentId;

        /**
         * <p>The agent name.</p>
         * 
         * <strong>example:</strong>
         * <p>agent-01</p>
         */
        @NameInMap("agentName")
        public String agentName;

        /**
         * <p>The role of the agent in the team. Valid values:</p>
         * <ul>
         * <li>LEADER</li>
         * <li>WORKER</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>WORKER</p>
         */
        @NameInMap("teamRole")
        public String teamRole;

        public static ListTeamsResponseBodyItemsAgents build(java.util.Map<String, ?> map) throws Exception {
            ListTeamsResponseBodyItemsAgents self = new ListTeamsResponseBodyItemsAgents();
            return TeaModel.build(map, self);
        }

        public ListTeamsResponseBodyItemsAgents setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public ListTeamsResponseBodyItemsAgents setAgentName(String agentName) {
            this.agentName = agentName;
            return this;
        }
        public String getAgentName() {
            return this.agentName;
        }

        public ListTeamsResponseBodyItemsAgents setTeamRole(String teamRole) {
            this.teamRole = teamRole;
            return this;
        }
        public String getTeamRole() {
            return this.teamRole;
        }

    }

    public static class ListTeamsResponseBodyItemsUsers extends TeaModel {
        /**
         * <p>The role of the user in the team. Valid values:</p>
         * <ul>
         * <li>ADMIN</li>
         * <li>MEMBER</li>
         * </ul>
         * <p>Each team must have exactly one ADMIN.</p>
         * 
         * <strong>example:</strong>
         * <p>ADMIN</p>
         */
        @NameInMap("teamRole")
        public String teamRole;

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>usr-123456</p>
         */
        @NameInMap("userId")
        public String userId;

        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>user-01</p>
         */
        @NameInMap("userName")
        public String userName;

        public static ListTeamsResponseBodyItemsUsers build(java.util.Map<String, ?> map) throws Exception {
            ListTeamsResponseBodyItemsUsers self = new ListTeamsResponseBodyItemsUsers();
            return TeaModel.build(map, self);
        }

        public ListTeamsResponseBodyItemsUsers setTeamRole(String teamRole) {
            this.teamRole = teamRole;
            return this;
        }
        public String getTeamRole() {
            return this.teamRole;
        }

        public ListTeamsResponseBodyItemsUsers setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListTeamsResponseBodyItemsUsers setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class ListTeamsResponseBodyItems extends TeaModel {
        /**
         * <p>The list of agent members in the team.</p>
         */
        @NameInMap("agents")
        public java.util.List<ListTeamsResponseBodyItemsAgents> agents;

        /**
         * <p>The time when the team was created, in UTC and RFC 3339 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-12T03:04:05Z</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <p>The team description.</p>
         * 
         * <strong>example:</strong>
         * <p>Team responsible for the intelligent customer service business</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The team name. The name can contain only lowercase letters, digits, and hyphens (-). It must start and end with a lowercase letter or digit. The name must be 1 to 128 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>team-01</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The team status. Valid values:</p>
         * <ul>
         * <li>Creating</li>
         * <li>Active</li>
         * <li>Updating</li>
         * <li>Deleting</li>
         * <li>Failed</li>
         * <li>Deleted</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The team ID.</p>
         * 
         * <strong>example:</strong>
         * <p>tm-123456</p>
         */
        @NameInMap("teamId")
        public String teamId;

        /**
         * <p>The time when the team was last modified, in UTC and RFC 3339 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-12T03:04:05Z</p>
         */
        @NameInMap("updatedAt")
        public String updatedAt;

        /**
         * <p>The list of user members in the team.</p>
         */
        @NameInMap("users")
        public java.util.List<ListTeamsResponseBodyItemsUsers> users;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-123456</p>
         */
        @NameInMap("workspaceId")
        public String workspaceId;

        public static ListTeamsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListTeamsResponseBodyItems self = new ListTeamsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListTeamsResponseBodyItems setAgents(java.util.List<ListTeamsResponseBodyItemsAgents> agents) {
            this.agents = agents;
            return this;
        }
        public java.util.List<ListTeamsResponseBodyItemsAgents> getAgents() {
            return this.agents;
        }

        public ListTeamsResponseBodyItems setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListTeamsResponseBodyItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListTeamsResponseBodyItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListTeamsResponseBodyItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListTeamsResponseBodyItems setTeamId(String teamId) {
            this.teamId = teamId;
            return this;
        }
        public String getTeamId() {
            return this.teamId;
        }

        public ListTeamsResponseBodyItems setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public ListTeamsResponseBodyItems setUsers(java.util.List<ListTeamsResponseBodyItemsUsers> users) {
            this.users = users;
            return this;
        }
        public java.util.List<ListTeamsResponseBodyItemsUsers> getUsers() {
            return this.users;
        }

        public ListTeamsResponseBodyItems setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
