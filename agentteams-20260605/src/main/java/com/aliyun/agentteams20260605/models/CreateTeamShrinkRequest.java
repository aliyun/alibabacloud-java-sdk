// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class CreateTeamShrinkRequest extends TeaModel {
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
    public String teamMembersShrink;

    public static CreateTeamShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTeamShrinkRequest self = new CreateTeamShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateTeamShrinkRequest setAdminName(String adminName) {
        this.adminName = adminName;
        return this;
    }
    public String getAdminName() {
        return this.adminName;
    }

    public CreateTeamShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateTeamShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateTeamShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateTeamShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateTeamShrinkRequest setTeamMembersShrink(String teamMembersShrink) {
        this.teamMembersShrink = teamMembersShrink;
        return this;
    }
    public String getTeamMembersShrink() {
        return this.teamMembersShrink;
    }

}
