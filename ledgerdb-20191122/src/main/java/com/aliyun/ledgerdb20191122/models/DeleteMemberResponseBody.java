// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ledgerdb20191122.models;

import com.aliyun.tea.*;

public class DeleteMemberResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteMemberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMemberResponseBody self = new DeleteMemberResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMemberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
