// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class UpdateTeamShrinkRequest extends TeaModel {
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

    public static UpdateTeamShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTeamShrinkRequest self = new UpdateTeamShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTeamShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateTeamShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateTeamShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateTeamShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateTeamShrinkRequest setTeamMembersShrink(String teamMembersShrink) {
        this.teamMembersShrink = teamMembersShrink;
        return this;
    }
    public String getTeamMembersShrink() {
        return this.teamMembersShrink;
    }

}
