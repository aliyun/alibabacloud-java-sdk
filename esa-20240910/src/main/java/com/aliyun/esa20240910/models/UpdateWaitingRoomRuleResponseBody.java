// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateWaitingRoomRuleResponseBody extends TeaModel {
    /**
     * <p>Request ID, used for tracking the progress of request processing.</p>
     * 
     * <strong>example:</strong>
     * <p>9bfe9d95-7bf6-469d-a628-ed7bc9f25073</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateWaitingRoomRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateWaitingRoomRuleResponseBody self = new UpdateWaitingRoomRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateWaitingRoomRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
