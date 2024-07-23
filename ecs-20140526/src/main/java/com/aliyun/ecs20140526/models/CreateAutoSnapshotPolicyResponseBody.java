// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateAutoSnapshotPolicyResponseBody extends TeaModel {
    /**
     * <p>The automatic snapshot policy ID.</p>
     * 
     * <strong>example:</strong>
     * <p>sp-bp12m37ccmxvbmi5****</p>
     */
    @NameInMap("AutoSnapshotPolicyId")
    public String autoSnapshotPolicyId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
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
