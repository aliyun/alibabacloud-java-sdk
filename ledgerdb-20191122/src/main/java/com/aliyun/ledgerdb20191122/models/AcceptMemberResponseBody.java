// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ledgerdb20191122.models;

import com.aliyun.tea.*;

public class AcceptMemberResponseBody extends TeaModel {
    @NameInMap("MemberId")
    public String memberId;

    @NameInMap("RequestId")
    public String requestId;

    public static AcceptMemberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AcceptMemberResponseBody self = new AcceptMemberResponseBody();
        return TeaModel.build(map, self);
    }

    public AcceptMemberResponseBody setMemberId(String memberId) {
        this.memberId = memberId;
        return this;
    }
    public String getMemberId() {
        return this.memberId;
    }

    public AcceptMemberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
