// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class AddRdMemberListShrinkRequest extends TeaModel {
    @NameInMap("MemberList")
    public String memberListShrink;

    public static AddRdMemberListShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddRdMemberListShrinkRequest self = new AddRdMemberListShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddRdMemberListShrinkRequest setMemberListShrink(String memberListShrink) {
        this.memberListShrink = memberListShrink;
        return this;
    }
    public String getMemberListShrink() {
        return this.memberListShrink;
    }

}
