// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentitydata20251127.models;

import com.aliyun.tea.*;

public class CompleteResourceTokenAuthResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CompleteResourceTokenAuthResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CompleteResourceTokenAuthResponseBody self = new CompleteResourceTokenAuthResponseBody();
        return TeaModel.build(map, self);
    }

    public CompleteResourceTokenAuthResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
