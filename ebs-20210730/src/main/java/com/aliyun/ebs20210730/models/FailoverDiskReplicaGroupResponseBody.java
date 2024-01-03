// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class FailoverDiskReplicaGroupResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static FailoverDiskReplicaGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FailoverDiskReplicaGroupResponseBody self = new FailoverDiskReplicaGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public FailoverDiskReplicaGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
