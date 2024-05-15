// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyInstanceMemberAttributesRequest extends TeaModel {
    /**
     * <p>The members that to be modified.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Members")
    public java.util.List<ModifyInstanceMemberAttributesRequestMembers> members;

    public static ModifyInstanceMemberAttributesRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceMemberAttributesRequest self = new ModifyInstanceMemberAttributesRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceMemberAttributesRequest setMembers(java.util.List<ModifyInstanceMemberAttributesRequestMembers> members) {
        this.members = members;
        return this;
    }
    public java.util.List<ModifyInstanceMemberAttributesRequestMembers> getMembers() {
        return this.members;
    }

    public static class ModifyInstanceMemberAttributesRequestMembers extends TeaModel {
        /**
         * <p>The remarks of the member in Cloud Firewall.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("MemberDesc")
        public String memberDesc;

        /**
         * <p>The UID of the member in Cloud Firewall.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("MemberUid")
        public Long memberUid;

        public static ModifyInstanceMemberAttributesRequestMembers build(java.util.Map<String, ?> map) throws Exception {
            ModifyInstanceMemberAttributesRequestMembers self = new ModifyInstanceMemberAttributesRequestMembers();
            return TeaModel.build(map, self);
        }

        public ModifyInstanceMemberAttributesRequestMembers setMemberDesc(String memberDesc) {
            this.memberDesc = memberDesc;
            return this;
        }
        public String getMemberDesc() {
            return this.memberDesc;
        }

        public ModifyInstanceMemberAttributesRequestMembers setMemberUid(Long memberUid) {
            this.memberUid = memberUid;
            return this;
        }
        public Long getMemberUid() {
            return this.memberUid;
        }

    }

}
