// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class AddInstanceMembersRequest extends TeaModel {
    // The members that you want to add to Cloud Firewall.
    @NameInMap("Members")
    public java.util.List<AddInstanceMembersRequestMembers> members;

    public static AddInstanceMembersRequest build(java.util.Map<String, ?> map) throws Exception {
        AddInstanceMembersRequest self = new AddInstanceMembersRequest();
        return TeaModel.build(map, self);
    }

    public AddInstanceMembersRequest setMembers(java.util.List<AddInstanceMembersRequestMembers> members) {
        this.members = members;
        return this;
    }
    public java.util.List<AddInstanceMembersRequestMembers> getMembers() {
        return this.members;
    }

    public static class AddInstanceMembersRequestMembers extends TeaModel {
        // The remarks of member that you want to add to Cloud Firewall. The remarks must be 1 to 256 characters in length.
        @NameInMap("MemberDesc")
        public String memberDesc;

        // The UID of member that you want to add to Cloud Firewall.
        @NameInMap("MemberUid")
        public Long memberUid;

        public static AddInstanceMembersRequestMembers build(java.util.Map<String, ?> map) throws Exception {
            AddInstanceMembersRequestMembers self = new AddInstanceMembersRequestMembers();
            return TeaModel.build(map, self);
        }

        public AddInstanceMembersRequestMembers setMemberDesc(String memberDesc) {
            this.memberDesc = memberDesc;
            return this;
        }
        public String getMemberDesc() {
            return this.memberDesc;
        }

        public AddInstanceMembersRequestMembers setMemberUid(Long memberUid) {
            this.memberUid = memberUid;
            return this;
        }
        public Long getMemberUid() {
            return this.memberUid;
        }

    }

}
