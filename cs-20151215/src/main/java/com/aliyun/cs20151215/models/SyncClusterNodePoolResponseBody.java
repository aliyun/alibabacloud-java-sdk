// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class SyncClusterNodePoolResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SyncClusterNodePoolResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SyncClusterNodePoolResponseBody self = new SyncClusterNodePoolResponseBody();
        return TeaModel.build(map, self);
    }

    public SyncClusterNodePoolResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
