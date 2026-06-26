// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class UpdateUserPoolClientResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateUserPoolClientResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserPoolClientResponseBody self = new UpdateUserPoolClientResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateUserPoolClientResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
