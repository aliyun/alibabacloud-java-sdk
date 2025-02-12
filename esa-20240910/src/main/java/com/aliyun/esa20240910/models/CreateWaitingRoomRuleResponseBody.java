// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateWaitingRoomRuleResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EEEBE525-F576-1196-8DAF-2D70CA3F4D2F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("WaitingRoomRuleId")
    public Long waitingRoomRuleId;

    public static CreateWaitingRoomRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateWaitingRoomRuleResponseBody self = new CreateWaitingRoomRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateWaitingRoomRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateWaitingRoomRuleResponseBody setWaitingRoomRuleId(Long waitingRoomRuleId) {
        this.waitingRoomRuleId = waitingRoomRuleId;
        return this;
    }
    public Long getWaitingRoomRuleId() {
        return this.waitingRoomRuleId;
    }

}
