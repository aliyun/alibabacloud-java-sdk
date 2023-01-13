// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyAutoSnapshotPolicyExResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyAutoSnapshotPolicyExResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyAutoSnapshotPolicyExResponseBody self = new ModifyAutoSnapshotPolicyExResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyAutoSnapshotPolicyExResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
