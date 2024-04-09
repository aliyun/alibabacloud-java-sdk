// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DeleteRdMemberListShrinkRequest extends TeaModel {
    @NameInMap("MemberList")
    public String memberListShrink;

    public static DeleteRdMemberListShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRdMemberListShrinkRequest self = new DeleteRdMemberListShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRdMemberListShrinkRequest setMemberListShrink(String memberListShrink) {
        this.memberListShrink = memberListShrink;
        return this;
    }
    public String getMemberListShrink() {
        return this.memberListShrink;
    }

}
