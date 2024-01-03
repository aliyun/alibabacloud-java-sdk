// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class StartDiskReplicaGroupResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static StartDiskReplicaGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartDiskReplicaGroupResponseBody self = new StartDiskReplicaGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public StartDiskReplicaGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
