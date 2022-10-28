// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListMembersResponseBody extends TeaModel {
    @NameInMap("Members")
    public java.util.List<ListMembersResponseBodyMembers> members;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListMembersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMembersResponseBody self = new ListMembersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMembersResponseBody setMembers(java.util.List<ListMembersResponseBodyMembers> members) {
        this.members = members;
        return this;
    }
    public java.util.List<ListMembersResponseBodyMembers> getMembers() {
        return this.members;
    }

    public ListMembersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMembersResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListMembersResponseBodyMembers extends TeaModel {
        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        @NameInMap("MemberId")
        public String memberId;

        @NameInMap("MemberName")
        public String memberName;

        @NameInMap("Roles")
        public java.util.List<String> roles;

        @NameInMap("UserId")
        public String userId;

        public static ListMembersResponseBodyMembers build(java.util.Map<String, ?> map) throws Exception {
            ListMembersResponseBodyMembers self = new ListMembersResponseBodyMembers();
            return TeaModel.build(map, self);
        }

        public ListMembersResponseBodyMembers setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListMembersResponseBodyMembers setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public ListMembersResponseBodyMembers setMemberId(String memberId) {
            this.memberId = memberId;
            return this;
        }
        public String getMemberId() {
            return this.memberId;
        }

        public ListMembersResponseBodyMembers setMemberName(String memberName) {
            this.memberName = memberName;
            return this;
        }
        public String getMemberName() {
            return this.memberName;
        }

        public ListMembersResponseBodyMembers setRoles(java.util.List<String> roles) {
            this.roles = roles;
            return this;
        }
        public java.util.List<String> getRoles() {
            return this.roles;
        }

        public ListMembersResponseBodyMembers setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
