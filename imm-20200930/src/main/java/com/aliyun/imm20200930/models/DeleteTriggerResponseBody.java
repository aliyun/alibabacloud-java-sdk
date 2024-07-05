// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class DeleteTriggerResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>FEDC9B1F-30F2-4C1F-8ED2-B7860187****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteTriggerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteTriggerResponseBody self = new DeleteTriggerResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteTriggerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
