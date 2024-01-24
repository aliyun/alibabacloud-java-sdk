// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateAutoSnapshotPolicyResponseBody extends TeaModel {
    /**
     * <p>The ID of the automatic snapshot policy.</p>
     */
    @NameInMap("AutoSnapshotPolicyId")
    public String autoSnapshotPolicyId;

    /**
     * <p>The request ID.</p>
     */
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
