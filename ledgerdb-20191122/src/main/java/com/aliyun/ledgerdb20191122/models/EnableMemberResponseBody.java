// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ledgerdb20191122.models;

import com.aliyun.tea.*;

public class EnableMemberResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static EnableMemberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableMemberResponseBody self = new EnableMemberResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableMemberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
