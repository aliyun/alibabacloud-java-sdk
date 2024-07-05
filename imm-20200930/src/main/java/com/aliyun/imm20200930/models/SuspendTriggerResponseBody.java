// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class SuspendTriggerResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0BC1F0C9-8E99-46C6-B502-10DED******</p>
     */
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
