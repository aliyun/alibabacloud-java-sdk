// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class UpdateTeamResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public UpdateTeamResponseBodyData data;

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

    public static UpdateTeamResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateTeamResponseBody self = new UpdateTeamResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateTeamResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateTeamResponseBody setData(UpdateTeamResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateTeamResponseBodyData getData() {
        return this.data;
    }

    public UpdateTeamResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UpdateTeamResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateTeamResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateTeamResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateTeamResponseBodyDataAgents extends TeaModel {
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

        public static UpdateTeamResponseBodyDataAgents build(java.util.Map<String, ?> map) throws Exception {
            UpdateTeamResponseBodyDataAgents self = new UpdateTeamResponseBodyDataAgents();
            return TeaModel.build(map, self);
        }

        public UpdateTeamResponseBodyDataAgents setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public UpdateTeamResponseBodyDataAgents setTeamRole(String teamRole) {
            this.teamRole = teamRole;
            return this;
        }
        public String getTeamRole() {
            return this.teamRole;
        }

    }

    public static class UpdateTeamResponseBodyDataUsers extends TeaModel {
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

        public static UpdateTeamResponseBodyDataUsers build(java.util.Map<String, ?> map) throws Exception {
            UpdateTeamResponseBodyDataUsers self = new UpdateTeamResponseBodyDataUsers();
            return TeaModel.build(map, self);
        }

        public UpdateTeamResponseBodyDataUsers setTeamRole(String teamRole) {
            this.teamRole = teamRole;
            return this;
        }
        public String getTeamRole() {
            return this.teamRole;
        }

        public UpdateTeamResponseBodyDataUsers setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class UpdateTeamResponseBodyData extends TeaModel {
        @NameInMap("agents")
        public java.util.List<UpdateTeamResponseBodyDataAgents> agents;

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
        public java.util.List<UpdateTeamResponseBodyDataUsers> users;

        /**
         * <strong>example:</strong>
         * <p>ws-123456</p>
         */
        @NameInMap("workspaceId")
        public String workspaceId;

        public static UpdateTeamResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateTeamResponseBodyData self = new UpdateTeamResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateTeamResponseBodyData setAgents(java.util.List<UpdateTeamResponseBodyDataAgents> agents) {
            this.agents = agents;
            return this;
        }
        public java.util.List<UpdateTeamResponseBodyDataAgents> getAgents() {
            return this.agents;
        }

        public UpdateTeamResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public UpdateTeamResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateTeamResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateTeamResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public UpdateTeamResponseBodyData setTeamId(String teamId) {
            this.teamId = teamId;
            return this;
        }
        public String getTeamId() {
            return this.teamId;
        }

        public UpdateTeamResponseBodyData setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public UpdateTeamResponseBodyData setUsers(java.util.List<UpdateTeamResponseBodyDataUsers> users) {
            this.users = users;
            return this;
        }
        public java.util.List<UpdateTeamResponseBodyDataUsers> getUsers() {
            return this.users;
        }

        public UpdateTeamResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
