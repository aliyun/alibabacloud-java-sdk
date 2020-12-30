// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ledgerdb20191122.models;

import com.aliyun.tea.*;

public class DisableMemberResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DisableMemberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableMemberResponseBody self = new DisableMemberResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableMemberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
