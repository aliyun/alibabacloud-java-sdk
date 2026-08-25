// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListTeamsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("items")
    public java.util.List<ListTeamsResponseBodyItems> items;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>dGVhbS1vZmZzZXQ6MTA</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>request-123456</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    /**
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
         * <strong>example:</strong>
         * <p>agent-123456</p>
         */
        @NameInMap("agentId")
        public String agentId;

        /**
         * <strong>example:</strong>
         * <p>agent-01</p>
         */
        @NameInMap("agentName")
        public String agentName;

        /**
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
         * <strong>example:</strong>
         * <p>ADMIN</p>
         */
        @NameInMap("teamRole")
        public String teamRole;

        /**
         * <strong>example:</strong>
         * <p>usr-123456</p>
         */
        @NameInMap("userId")
        public String userId;

        /**
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
        @NameInMap("agents")
        public java.util.List<ListTeamsResponseBodyItemsAgents> agents;

        /**
         * <strong>example:</strong>
         * <p>2026-08-12T03:04:05Z</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <strong>example:</strong>
         * <p>负责智能客服业务的团队</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>team-01</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>tm-123456</p>
         */
        @NameInMap("teamId")
        public String teamId;

        /**
         * <strong>example:</strong>
         * <p>2026-08-12T03:04:05Z</p>
         */
        @NameInMap("updatedAt")
        public String updatedAt;

        @NameInMap("users")
        public java.util.List<ListTeamsResponseBodyItemsUsers> users;

        /**
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
