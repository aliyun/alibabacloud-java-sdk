// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class AgreeMemberAccessRequest extends TeaModel {
    @NameInMap("MemberAccountId")
    public String memberAccountId;

    public static AgreeMemberAccessRequest build(java.util.Map<String, ?> map) throws Exception {
        AgreeMemberAccessRequest self = new AgreeMemberAccessRequest();
        return TeaModel.build(map, self);
    }

    public AgreeMemberAccessRequest setMemberAccountId(String memberAccountId) {
        this.memberAccountId = memberAccountId;
        return this;
    }
    public String getMemberAccountId() {
        return this.memberAccountId;
    }

}
