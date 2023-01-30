// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class SuspendTriggerResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SuspendTriggerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SuspendTriggerResponseBody self = new SuspendTriggerResponseBody();
        return TeaModel.build(map, self);
    }

    public SuspendTriggerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
