// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateAppMembersRequest extends TeaModel {
    @NameInMap("playerList")
    public java.util.List<CreateAppMembersRequestPlayerList> playerList;

    @NameInMap("roleNames")
    public java.util.List<String> roleNames;

    @NameInMap("organizationId")
    public String organizationId;

    public static CreateAppMembersRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppMembersRequest self = new CreateAppMembersRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppMembersRequest setPlayerList(java.util.List<CreateAppMembersRequestPlayerList> playerList) {
        this.playerList = playerList;
        return this;
    }
    public java.util.List<CreateAppMembersRequestPlayerList> getPlayerList() {
        return this.playerList;
    }

    public CreateAppMembersRequest setRoleNames(java.util.List<String> roleNames) {
        this.roleNames = roleNames;
        return this;
    }
    public java.util.List<String> getRoleNames() {
        return this.roleNames;
    }

    public CreateAppMembersRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public static class CreateAppMembersRequestPlayerList extends TeaModel {
        @NameInMap("id")
        public String id;

        @NameInMap("type")
        public String type;

        public static CreateAppMembersRequestPlayerList build(java.util.Map<String, ?> map) throws Exception {
            CreateAppMembersRequestPlayerList self = new CreateAppMembersRequestPlayerList();
            return TeaModel.build(map, self);
        }

        public CreateAppMembersRequestPlayerList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateAppMembersRequestPlayerList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
