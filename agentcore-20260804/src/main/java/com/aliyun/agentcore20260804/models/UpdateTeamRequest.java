// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class UpdateTeamRequest extends TeaModel {
    @NameInMap("body")
    public UpdateTeamRequestBody body;

    /**
     * <strong>example:</strong>
     * <p>暂不支持</p>
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
        @NameInMap("agents")
        public java.util.List<UpdateTeamRequestBodyAgents> agents;

        /**
         * <strong>example:</strong>
         * <p>负责智能客服业务的团队</p>
         */
        @NameInMap("description")
        public String description;

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
