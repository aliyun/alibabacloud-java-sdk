// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class CreateMemberResponseBody extends TeaModel {
    // 成员列表
    @NameInMap("Members")
    public java.util.List<CreateMemberResponseBodyMembers> members;

    // 请求 id
    @NameInMap("RequestId")
    public String requestId;

    public static CreateMemberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMemberResponseBody self = new CreateMemberResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMemberResponseBody setMembers(java.util.List<CreateMemberResponseBodyMembers> members) {
        this.members = members;
        return this;
    }
    public java.util.List<CreateMemberResponseBodyMembers> getMembers() {
        return this.members;
    }

    public CreateMemberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateMemberResponseBodyMembers extends TeaModel {
        // 成员显示名
        @NameInMap("DisplayName")
        public String displayName;

        // 成员 id
        @NameInMap("MemberId")
        public String memberId;

        // 角色列表
        @NameInMap("Roles")
        public java.util.List<String> roles;

        // 用户 id
        @NameInMap("UserId")
        public String userId;

        public static CreateMemberResponseBodyMembers build(java.util.Map<String, ?> map) throws Exception {
            CreateMemberResponseBodyMembers self = new CreateMemberResponseBodyMembers();
            return TeaModel.build(map, self);
        }

        public CreateMemberResponseBodyMembers setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public CreateMemberResponseBodyMembers setMemberId(String memberId) {
            this.memberId = memberId;
            return this;
        }
        public String getMemberId() {
            return this.memberId;
        }

        public CreateMemberResponseBodyMembers setRoles(java.util.List<String> roles) {
            this.roles = roles;
            return this;
        }
        public java.util.List<String> getRoles() {
            return this.roles;
        }

        public CreateMemberResponseBodyMembers setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
