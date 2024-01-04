// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class UpdateAppMemberRequest extends TeaModel {
    @NameInMap("player")
    public UpdateAppMemberRequestPlayer player;

    @NameInMap("roleNames")
    public java.util.List<String> roleNames;

    @NameInMap("organizationId")
    public String organizationId;

    public static UpdateAppMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppMemberRequest self = new UpdateAppMemberRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAppMemberRequest setPlayer(UpdateAppMemberRequestPlayer player) {
        this.player = player;
        return this;
    }
    public UpdateAppMemberRequestPlayer getPlayer() {
        return this.player;
    }

    public UpdateAppMemberRequest setRoleNames(java.util.List<String> roleNames) {
        this.roleNames = roleNames;
        return this;
    }
    public java.util.List<String> getRoleNames() {
        return this.roleNames;
    }

    public UpdateAppMemberRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public static class UpdateAppMemberRequestPlayer extends TeaModel {
        @NameInMap("id")
        public String id;

        @NameInMap("type")
        public String type;

        public static UpdateAppMemberRequestPlayer build(java.util.Map<String, ?> map) throws Exception {
            UpdateAppMemberRequestPlayer self = new UpdateAppMemberRequestPlayer();
            return TeaModel.build(map, self);
        }

        public UpdateAppMemberRequestPlayer setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpdateAppMemberRequestPlayer setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
