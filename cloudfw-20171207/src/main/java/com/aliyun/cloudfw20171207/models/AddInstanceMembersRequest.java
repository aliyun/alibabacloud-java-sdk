// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class AddInstanceMembersRequest extends TeaModel {
    /**
     * <p>The list of Cloud Firewall member accounts to add. You can call the DescribeInstanceRdAccounts operation to obtain the MemberUid of the accounts that can be added. You can add up to 20 member accounts at a time, subject to the maximum number of members allowed for the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;MemberUid&quot;:&quot;258039427902****&quot;,&quot;MemberDesc&quot;:&quot;renewal&quot;}]</p>
     */
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
        /**
         * <p>The description of the Cloud Firewall member account. The description must be 1 to 256 characters in length. You can add up to 20 member accounts.</p>
         * 
         * <strong>example:</strong>
         * <p>renewal</p>
         */
        @NameInMap("MemberDesc")
        public String memberDesc;

        /**
         * <p>The UID of the Cloud Firewall member account. You can add up to 20 member accounts.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>258039427902****</p>
         */
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
