// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class GetTriggerResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Trigger")
    public DataIngestion trigger;

    public static GetTriggerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTriggerResponseBody self = new GetTriggerResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTriggerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTriggerResponseBody setTrigger(DataIngestion trigger) {
        this.trigger = trigger;
        return this;
    }
    public DataIngestion getTrigger() {
        return this.trigger;
    }

}
