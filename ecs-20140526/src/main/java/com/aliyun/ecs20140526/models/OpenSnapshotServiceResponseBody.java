// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class OpenSnapshotServiceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C36234E8-4C67-5F6C-8C07-F51B2EE2C560</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static OpenSnapshotServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OpenSnapshotServiceResponseBody self = new OpenSnapshotServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public OpenSnapshotServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
