// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class RecordLifecycleActionHeartbeatResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
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
