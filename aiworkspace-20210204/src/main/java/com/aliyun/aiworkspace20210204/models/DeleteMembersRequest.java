// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class DeleteMembersRequest extends TeaModel {
    // 需要删除的成员 Id 列表，以逗号分隔
    @NameInMap("MemberIds")
    public String memberIds;

    public static DeleteMembersRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMembersRequest self = new DeleteMembersRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMembersRequest setMemberIds(String memberIds) {
        this.memberIds = memberIds;
        return this;
    }
    public String getMemberIds() {
        return this.memberIds;
    }

}
