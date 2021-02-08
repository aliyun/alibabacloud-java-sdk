// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CancelAutoSnapshotPolicyResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static CancelAutoSnapshotPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelAutoSnapshotPolicyResponse self = new CancelAutoSnapshotPolicyResponse();
        return TeaModel.build(map, self);
    }

    public CancelAutoSnapshotPolicyResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
