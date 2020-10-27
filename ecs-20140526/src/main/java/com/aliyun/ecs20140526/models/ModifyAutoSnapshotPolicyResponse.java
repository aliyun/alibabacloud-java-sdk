// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyAutoSnapshotPolicyResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyAutoSnapshotPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAutoSnapshotPolicyResponse self = new ModifyAutoSnapshotPolicyResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAutoSnapshotPolicyResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
