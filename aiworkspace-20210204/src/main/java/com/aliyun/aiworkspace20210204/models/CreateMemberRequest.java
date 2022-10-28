// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class CreateMemberRequest extends TeaModel {
    @NameInMap("Members")
    public java.util.List<CreateMemberRequestMembers> members;

    public static CreateMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMemberRequest self = new CreateMemberRequest();
        return TeaModel.build(map, self);
    }

    public CreateMemberRequest setMembers(java.util.List<CreateMemberRequestMembers> members) {
        this.members = members;
        return this;
    }
    public java.util.List<CreateMemberRequestMembers> getMembers() {
        return this.members;
    }

    public static class CreateMemberRequestMembers extends TeaModel {
        @NameInMap("Roles")
        public java.util.List<String> roles;

        @NameInMap("UserId")
        public String userId;

        public static CreateMemberRequestMembers build(java.util.Map<String, ?> map) throws Exception {
            CreateMemberRequestMembers self = new CreateMemberRequestMembers();
            return TeaModel.build(map, self);
        }

        public CreateMemberRequestMembers setRoles(java.util.List<String> roles) {
            this.roles = roles;
            return this;
        }
        public java.util.List<String> getRoles() {
            return this.roles;
        }

        public CreateMemberRequestMembers setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
