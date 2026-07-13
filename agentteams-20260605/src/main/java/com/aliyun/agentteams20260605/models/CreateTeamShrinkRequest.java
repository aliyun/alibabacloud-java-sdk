// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class CreateTeamShrinkRequest extends TeaModel {
    @NameInMap("AdminName")
    public String adminName;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Description")
    public String description;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Name")
    public String name;

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
