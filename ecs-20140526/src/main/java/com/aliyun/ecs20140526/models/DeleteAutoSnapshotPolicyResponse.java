// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteAutoSnapshotPolicyResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteAutoSnapshotPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAutoSnapshotPolicyResponse self = new DeleteAutoSnapshotPolicyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAutoSnapshotPolicyResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
