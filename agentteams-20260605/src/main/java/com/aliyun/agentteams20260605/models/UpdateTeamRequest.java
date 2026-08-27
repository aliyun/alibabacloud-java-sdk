// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class UpdateTeamRequest extends TeaModel {
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
     * <p>Updated team description.</p>
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
     * <p>The name.</p>
     * 
     * <strong>example:</strong>
     * <p>worker-demo</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The team member list. If specified, this overwrites the existing members entirely.</p>
     * 
     * <strong>example:</strong>
     * <p>[...]</p>
     */
    @NameInMap("TeamMembers")
    public java.util.List<UpdateTeamRequestTeamMembers> teamMembers;

    public static UpdateTeamRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTeamRequest self = new UpdateTeamRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTeamRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateTeamRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateTeamRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateTeamRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateTeamRequest setTeamMembers(java.util.List<UpdateTeamRequestTeamMembers> teamMembers) {
        this.teamMembers = teamMembers;
        return this;
    }
    public java.util.List<UpdateTeamRequestTeamMembers> getTeamMembers() {
        return this.teamMembers;
    }

    public static class UpdateTeamRequestTeamMembers extends TeaModel {
        /**
         * <p>The member name. The name must be an existing user under the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>member-user</p>
         */
        @NameInMap("Name")
        public String name;

        public static UpdateTeamRequestTeamMembers build(java.util.Map<String, ?> map) throws Exception {
            UpdateTeamRequestTeamMembers self = new UpdateTeamRequestTeamMembers();
            return TeaModel.build(map, self);
        }

        public UpdateTeamRequestTeamMembers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
