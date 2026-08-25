// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class CreateTeamResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public CreateTeamResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>request-123456</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    public static CreateTeamResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTeamResponseBody self = new CreateTeamResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTeamResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateTeamResponseBody setData(CreateTeamResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateTeamResponseBodyData getData() {
        return this.data;
    }

    public CreateTeamResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateTeamResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateTeamResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTeamResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateTeamResponseBodyDataAgents extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>agent-123456</p>
         */
        @NameInMap("agentId")
        public String agentId;

        /**
         * <strong>example:</strong>
         * <p>WORKER</p>
         */
        @NameInMap("teamRole")
        public String teamRole;

        public static CreateTeamResponseBodyDataAgents build(java.util.Map<String, ?> map) throws Exception {
            CreateTeamResponseBodyDataAgents self = new CreateTeamResponseBodyDataAgents();
            return TeaModel.build(map, self);
        }

        public CreateTeamResponseBodyDataAgents setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public CreateTeamResponseBodyDataAgents setTeamRole(String teamRole) {
            this.teamRole = teamRole;
            return this;
        }
        public String getTeamRole() {
            return this.teamRole;
        }

    }

    public static class CreateTeamResponseBodyDataUsers extends TeaModel {
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

        public static CreateTeamResponseBodyDataUsers build(java.util.Map<String, ?> map) throws Exception {
            CreateTeamResponseBodyDataUsers self = new CreateTeamResponseBodyDataUsers();
            return TeaModel.build(map, self);
        }

        public CreateTeamResponseBodyDataUsers setTeamRole(String teamRole) {
            this.teamRole = teamRole;
            return this;
        }
        public String getTeamRole() {
            return this.teamRole;
        }

        public CreateTeamResponseBodyDataUsers setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class CreateTeamResponseBodyData extends TeaModel {
        @NameInMap("agents")
        public java.util.List<CreateTeamResponseBodyDataAgents> agents;

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
        public java.util.List<CreateTeamResponseBodyDataUsers> users;

        /**
         * <strong>example:</strong>
         * <p>ws-123456</p>
         */
        @NameInMap("workspaceId")
        public String workspaceId;

        public static CreateTeamResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateTeamResponseBodyData self = new CreateTeamResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateTeamResponseBodyData setAgents(java.util.List<CreateTeamResponseBodyDataAgents> agents) {
            this.agents = agents;
            return this;
        }
        public java.util.List<CreateTeamResponseBodyDataAgents> getAgents() {
            return this.agents;
        }

        public CreateTeamResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public CreateTeamResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateTeamResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateTeamResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateTeamResponseBodyData setTeamId(String teamId) {
            this.teamId = teamId;
            return this;
        }
        public String getTeamId() {
            return this.teamId;
        }

        public CreateTeamResponseBodyData setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public CreateTeamResponseBodyData setUsers(java.util.List<CreateTeamResponseBodyDataUsers> users) {
            this.users = users;
            return this;
        }
        public java.util.List<CreateTeamResponseBodyDataUsers> getUsers() {
            return this.users;
        }

        public CreateTeamResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
