// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class CreateTeamRequest extends TeaModel {
    /**
     * <p>The team administrator name. The administrator must be an existing user under the instance with sufficient permissions.</p>
     * 
     * <strong>example:</strong>
     * <p>admin-user</p>
     */
    @NameInMap("AdminName")
    public String adminName;

    /**
     * <p>The idempotency token that is used to ensure the idempotence of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>client-token-xxx</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The team description.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a team.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>agentteams-test-001</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The team name.</p>
     * 
     * <strong>example:</strong>
     * <p>worker-demo</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The initial member list of the team.</p>
     * 
     * <strong>example:</strong>
     * <p>[...]</p>
     */
    @NameInMap("TeamMembers")
    public java.util.List<CreateTeamRequestTeamMembers> teamMembers;

    public static CreateTeamRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTeamRequest self = new CreateTeamRequest();
        return TeaModel.build(map, self);
    }

    public CreateTeamRequest setAdminName(String adminName) {
        this.adminName = adminName;
        return this;
    }
    public String getAdminName() {
        return this.adminName;
    }

    public CreateTeamRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateTeamRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateTeamRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateTeamRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateTeamRequest setTeamMembers(java.util.List<CreateTeamRequestTeamMembers> teamMembers) {
        this.teamMembers = teamMembers;
        return this;
    }
    public java.util.List<CreateTeamRequestTeamMembers> getTeamMembers() {
        return this.teamMembers;
    }

    public static class CreateTeamRequestTeamMembers extends TeaModel {
        /**
         * <p>The member name. The member must be an existing user under the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>member-user</p>
         */
        @NameInMap("Name")
        public String name;

        public static CreateTeamRequestTeamMembers build(java.util.Map<String, ?> map) throws Exception {
            CreateTeamRequestTeamMembers self = new CreateTeamRequestTeamMembers();
            return TeaModel.build(map, self);
        }

        public CreateTeamRequestTeamMembers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
