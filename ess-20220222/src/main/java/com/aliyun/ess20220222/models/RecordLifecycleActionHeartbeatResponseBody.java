// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class RecordLifecycleActionHeartbeatResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static RecordLifecycleActionHeartbeatResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecordLifecycleActionHeartbeatResponseBody self = new RecordLifecycleActionHeartbeatResponseBody();
        return TeaModel.build(map, self);
    }

    public RecordLifecycleActionHeartbeatResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
