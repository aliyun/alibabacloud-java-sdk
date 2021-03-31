// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CancelAutoSnapshotPolicyResponseBody extends TeaModel {
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
