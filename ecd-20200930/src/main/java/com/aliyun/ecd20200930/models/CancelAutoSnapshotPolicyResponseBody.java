// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CancelAutoSnapshotPolicyResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CancelAutoSnapshotPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelAutoSnapshotPolicyResponseBody self = new CancelAutoSnapshotPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelAutoSnapshotPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
