// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class CreateTeamRequest extends TeaModel {
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
