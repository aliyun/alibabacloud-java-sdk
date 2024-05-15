// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class AddRdMemberListRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("MemberList")
    public java.util.List<AddRdMemberListRequestMemberList> memberList;

    public static AddRdMemberListRequest build(java.util.Map<String, ?> map) throws Exception {
        AddRdMemberListRequest self = new AddRdMemberListRequest();
        return TeaModel.build(map, self);
    }

    public AddRdMemberListRequest setMemberList(java.util.List<AddRdMemberListRequestMemberList> memberList) {
        this.memberList = memberList;
        return this;
    }
    public java.util.List<AddRdMemberListRequestMemberList> getMemberList() {
        return this.memberList;
    }

    public static class AddRdMemberListRequestMemberList extends TeaModel {
        @NameInMap("Uid")
        public String uid;

        public static AddRdMemberListRequestMemberList build(java.util.Map<String, ?> map) throws Exception {
            AddRdMemberListRequestMemberList self = new AddRdMemberListRequestMemberList();
            return TeaModel.build(map, self);
        }

        public AddRdMemberListRequestMemberList setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

}
