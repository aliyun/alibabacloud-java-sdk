// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class GetMemberRequest extends TeaModel {
    @NameInMap("MemberId")
    public String memberId;

    @NameInMap("UserId")
    public String userId;

    public static GetMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMemberRequest self = new GetMemberRequest();
        return TeaModel.build(map, self);
    }

    public GetMemberRequest setMemberId(String memberId) {
        this.memberId = memberId;
        return this;
    }
    public String getMemberId() {
        return this.memberId;
    }

    public GetMemberRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
