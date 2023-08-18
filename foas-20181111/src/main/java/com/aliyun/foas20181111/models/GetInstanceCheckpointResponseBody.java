// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class GetInstanceCheckpointResponseBody extends TeaModel {
    @NameInMap("Checkpoints")
    public String checkpoints;

    @NameInMap("RequestId")
    public String requestId;

    public static GetInstanceCheckpointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceCheckpointResponseBody self = new GetInstanceCheckpointResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceCheckpointResponseBody setCheckpoints(String checkpoints) {
        this.checkpoints = checkpoints;
        return this;
    }
    public String getCheckpoints() {
        return this.checkpoints;
    }

    public GetInstanceCheckpointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
