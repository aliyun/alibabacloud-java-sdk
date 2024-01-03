// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class StartDiskReplicaPairResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static StartDiskReplicaPairResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartDiskReplicaPairResponseBody self = new StartDiskReplicaPairResponseBody();
        return TeaModel.build(map, self);
    }

    public StartDiskReplicaPairResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
