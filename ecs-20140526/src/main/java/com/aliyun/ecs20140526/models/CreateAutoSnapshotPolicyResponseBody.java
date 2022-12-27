// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateAutoSnapshotPolicyResponseBody extends TeaModel {
    // The ID of the automatic snapshot policy.
    @NameInMap("AutoSnapshotPolicyId")
    public String autoSnapshotPolicyId;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static CreateAutoSnapshotPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAutoSnapshotPolicyResponseBody self = new CreateAutoSnapshotPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAutoSnapshotPolicyResponseBody setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
        this.autoSnapshotPolicyId = autoSnapshotPolicyId;
        return this;
    }
    public String getAutoSnapshotPolicyId() {
        return this.autoSnapshotPolicyId;
    }

    public CreateAutoSnapshotPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
