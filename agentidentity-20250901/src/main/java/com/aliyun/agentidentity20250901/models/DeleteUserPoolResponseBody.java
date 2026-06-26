// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class DeleteUserPoolResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteUserPoolResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserPoolResponseBody self = new DeleteUserPoolResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteUserPoolResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
