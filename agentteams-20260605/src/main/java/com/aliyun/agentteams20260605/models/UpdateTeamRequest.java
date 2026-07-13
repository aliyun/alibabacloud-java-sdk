// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class UpdateTeamRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Description")
    public String description;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Name")
    public String name;

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
