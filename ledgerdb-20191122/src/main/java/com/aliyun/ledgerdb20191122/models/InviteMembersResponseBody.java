// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ledgerdb20191122.models;

import com.aliyun.tea.*;

public class InviteMembersResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static InviteMembersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InviteMembersResponseBody self = new InviteMembersResponseBody();
        return TeaModel.build(map, self);
    }

    public InviteMembersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
