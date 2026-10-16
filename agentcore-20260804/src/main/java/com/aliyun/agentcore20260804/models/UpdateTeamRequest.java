// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class UpdateTeamRequest extends TeaModel {
    /**
     * <p>The request body for updating a team.</p>
     */
    @NameInMap("body")
    public UpdateTeamRequestBody body;

    /**
     * <p>Not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>Not supported</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static UpdateTeamRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTeamRequest self = new UpdateTeamRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTeamRequest setBody(UpdateTeamRequestBody body) {
        this.body = body;
        return this;
    }
    public UpdateTeamRequestBody getBody() {
        return this.body;
    }

    public UpdateTeamRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public static class UpdateTeamRequestBodyAgents extends TeaModel {
        /**
         * <p>The agent ID.</p>
         * 
         * <strong>example:</strong>
         * <p>agent-123456</p>
         */
        @NameInMap("agentId")
        public String agentId;

        /**
         * <p>The role of the agent in the team. Valid values: LEADER, WORKER.</p>
         * 
         * <strong>example:</strong>
         * <p>WORKER</p>
         */
        @NameInMap("teamRole")
        public String teamRole;

        public static UpdateTeamRequestBodyAgents build(java.util.Map<String, ?> map) throws Exception {
            UpdateTeamRequestBodyAgents self = new UpdateTeamRequestBodyAgents();
            return TeaModel.build(map, self);
        }

        public UpdateTeamRequestBodyAgents setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public UpdateTeamRequestBodyAgents setTeamRole(String teamRole) {
            this.teamRole = teamRole;
            return this;
        }
        public String getTeamRole() {
            return this.teamRole;
        }

    }

    public static class UpdateTeamRequestBodyUsers extends TeaModel {
        /**
         * <p>The role of the user in the team. Valid values: ADMIN, MEMBER. Each team must have exactly one ADMIN.</p>
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

        public static UpdateTeamRequestBodyUsers build(java.util.Map<String, ?> map) throws Exception {
            UpdateTeamRequestBodyUsers self = new UpdateTeamRequestBodyUsers();
            return TeaModel.build(map, self);
        }

        public UpdateTeamRequestBodyUsers setTeamRole(String teamRole) {
            this.teamRole = teamRole;
            return this;
        }
        public String getTeamRole() {
            return this.teamRole;
        }

        public UpdateTeamRequestBodyUsers setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class UpdateTeamRequestBody extends TeaModel {
        /**
         * <p>The new list of agent members. The existing agent members are replaced based on full overwrite semantics. If this parameter is not specified, the existing agent members remain unchanged.</p>
         */
        @NameInMap("agents")
        public java.util.List<UpdateTeamRequestBodyAgents> agents;

        /**
         * <p>The new team description. If this parameter is not specified, the existing description remains unchanged.</p>
         * 
         * <strong>example:</strong>
         * <p>Team responsible for intelligent customer service</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The new list of user members. The existing user members are replaced based on full overwrite semantics. If this parameter is specified, it must contain exactly one member with the ADMIN role. If this parameter is not specified, the existing user members remain unchanged.</p>
         */
        @NameInMap("users")
        public java.util.List<UpdateTeamRequestBodyUsers> users;

        public static UpdateTeamRequestBody build(java.util.Map<String, ?> map) throws Exception {
            UpdateTeamRequestBody self = new UpdateTeamRequestBody();
            return TeaModel.build(map, self);
        }

        public UpdateTeamRequestBody setAgents(java.util.List<UpdateTeamRequestBodyAgents> agents) {
            this.agents = agents;
            return this;
        }
        public java.util.List<UpdateTeamRequestBodyAgents> getAgents() {
            return this.agents;
        }

        public UpdateTeamRequestBody setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateTeamRequestBody setUsers(java.util.List<UpdateTeamRequestBodyUsers> users) {
            this.users = users;
            return this;
        }
        public java.util.List<UpdateTeamRequestBodyUsers> getUsers() {
            return this.users;
        }

    }

}
