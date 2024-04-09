// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DeleteRdMemberListRequest extends TeaModel {
    @NameInMap("MemberList")
    public java.util.List<DeleteRdMemberListRequestMemberList> memberList;

    public static DeleteRdMemberListRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRdMemberListRequest self = new DeleteRdMemberListRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRdMemberListRequest setMemberList(java.util.List<DeleteRdMemberListRequestMemberList> memberList) {
        this.memberList = memberList;
        return this;
    }
    public java.util.List<DeleteRdMemberListRequestMemberList> getMemberList() {
        return this.memberList;
    }

    public static class DeleteRdMemberListRequestMemberList extends TeaModel {
        @NameInMap("Uid")
        public String uid;

        public static DeleteRdMemberListRequestMemberList build(java.util.Map<String, ?> map) throws Exception {
            DeleteRdMemberListRequestMemberList self = new DeleteRdMemberListRequestMemberList();
            return TeaModel.build(map, self);
        }

        public DeleteRdMemberListRequestMemberList setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

}
