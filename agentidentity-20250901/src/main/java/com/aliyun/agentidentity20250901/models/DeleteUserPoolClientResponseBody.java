// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class DeleteUserPoolClientResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteUserPoolClientResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserPoolClientResponseBody self = new DeleteUserPoolClientResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteUserPoolClientResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
