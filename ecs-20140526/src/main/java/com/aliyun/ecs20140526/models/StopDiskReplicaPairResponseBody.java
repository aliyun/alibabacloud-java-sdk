// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class StopDiskReplicaPairResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static StopDiskReplicaPairResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopDiskReplicaPairResponseBody self = new StopDiskReplicaPairResponseBody();
        return TeaModel.build(map, self);
    }

    public StopDiskReplicaPairResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
