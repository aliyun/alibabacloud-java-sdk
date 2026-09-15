// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class CreateTeamRequest extends TeaModel {
    /**
     * <p>The request body for creating a team.</p>
     */
    @NameInMap("body")
    public CreateTeamRequestBody body;

    /**
     * <p>Not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>Not supported</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static CreateTeamRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTeamRequest self = new CreateTeamRequest();
        return TeaModel.build(map, self);
    }

    public CreateTeamRequest setBody(CreateTeamRequestBody body) {
        this.body = body;
        return this;
    }
    public CreateTeamRequestBody getBody() {
        return this.body;
    }

    public CreateTeamRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public static class CreateTeamRequestBodyAgents extends TeaModel {
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

        public static CreateTeamRequestBodyAgents build(java.util.Map<String, ?> map) throws Exception {
            CreateTeamRequestBodyAgents self = new CreateTeamRequestBodyAgents();
            return TeaModel.build(map, self);
        }

        public CreateTeamRequestBodyAgents setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public CreateTeamRequestBodyAgents setTeamRole(String teamRole) {
            this.teamRole = teamRole;
            return this;
        }
        public String getTeamRole() {
            return this.teamRole;
        }

    }

    public static class CreateTeamRequestBodyUsers extends TeaModel {
        /**
         * <p>The role of the user in the team. Valid values: ADMIN, MEMBER. Each team must include exactly one ADMIN.</p>
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

        public static CreateTeamRequestBodyUsers build(java.util.Map<String, ?> map) throws Exception {
            CreateTeamRequestBodyUsers self = new CreateTeamRequestBodyUsers();
            return TeaModel.build(map, self);
        }

        public CreateTeamRequestBodyUsers setTeamRole(String teamRole) {
            this.teamRole = teamRole;
            return this;
        }
        public String getTeamRole() {
            return this.teamRole;
        }

        public CreateTeamRequestBodyUsers setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class CreateTeamRequestBody extends TeaModel {
        /**
         * <p>The list of agent members in the team.</p>
         */
        @NameInMap("agents")
        public java.util.List<CreateTeamRequestBodyAgents> agents;

        /**
         * <p>The team description.</p>
         * 
         * <strong>example:</strong>
         * <p>A team responsible for intelligent customer service</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The team name. The name can contain only lowercase letters, digits, and hyphens (-). It must start and end with a lowercase letter or digit. The name must be 1 to 128 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>team-01</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The list of user members in the team. The list must include exactly one member with the ADMIN role.</p>
         */
        @NameInMap("users")
        public java.util.List<CreateTeamRequestBodyUsers> users;

        public static CreateTeamRequestBody build(java.util.Map<String, ?> map) throws Exception {
            CreateTeamRequestBody self = new CreateTeamRequestBody();
            return TeaModel.build(map, self);
        }

        public CreateTeamRequestBody setAgents(java.util.List<CreateTeamRequestBodyAgents> agents) {
            this.agents = agents;
            return this;
        }
        public java.util.List<CreateTeamRequestBodyAgents> getAgents() {
            return this.agents;
        }

        public CreateTeamRequestBody setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateTeamRequestBody setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateTeamRequestBody setUsers(java.util.List<CreateTeamRequestBodyUsers> users) {
            this.users = users;
            return this;
        }
        public java.util.List<CreateTeamRequestBodyUsers> getUsers() {
            return this.users;
        }

    }

}
