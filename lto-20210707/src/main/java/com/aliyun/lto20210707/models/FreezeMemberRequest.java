// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class FreezeMemberRequest extends TeaModel {
    @NameInMap("MemberId")
    public String memberId;

    public static FreezeMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        FreezeMemberRequest self = new FreezeMemberRequest();
        return TeaModel.build(map, self);
    }

    public FreezeMemberRequest setMemberId(String memberId) {
        this.memberId = memberId;
        return this;
    }
    public String getMemberId() {
        return this.memberId;
    }

}
