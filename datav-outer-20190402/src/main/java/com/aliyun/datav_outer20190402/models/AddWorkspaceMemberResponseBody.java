// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datav_outer20190402.models;

import com.aliyun.tea.*;

public class AddWorkspaceMemberResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Member")
    public AddWorkspaceMemberResponseBodyMember member;

    public static AddWorkspaceMemberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddWorkspaceMemberResponseBody self = new AddWorkspaceMemberResponseBody();
        return TeaModel.build(map, self);
    }

    public AddWorkspaceMemberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddWorkspaceMemberResponseBody setMember(AddWorkspaceMemberResponseBodyMember member) {
        this.member = member;
        return this;
    }
    public AddWorkspaceMemberResponseBodyMember getMember() {
        return this.member;
    }

    public static class AddWorkspaceMemberResponseBodyMember extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("WorkspaceId")
        public Long workspaceId;

        @NameInMap("MemberUid")
        public String memberUid;

        @NameInMap("ExpiredAt")
        public String expiredAt;

        public static AddWorkspaceMemberResponseBodyMember build(java.util.Map<String, ?> map) throws Exception {
            AddWorkspaceMemberResponseBodyMember self = new AddWorkspaceMemberResponseBodyMember();
            return TeaModel.build(map, self);
        }

        public AddWorkspaceMemberResponseBodyMember setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public AddWorkspaceMemberResponseBodyMember setWorkspaceId(Long workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public Long getWorkspaceId() {
            return this.workspaceId;
        }

        public AddWorkspaceMemberResponseBodyMember setMemberUid(String memberUid) {
            this.memberUid = memberUid;
            return this;
        }
        public String getMemberUid() {
            return this.memberUid;
        }

        public AddWorkspaceMemberResponseBodyMember setExpiredAt(String expiredAt) {
            this.expiredAt = expiredAt;
            return this;
        }
        public String getExpiredAt() {
            return this.expiredAt;
        }

    }

}
