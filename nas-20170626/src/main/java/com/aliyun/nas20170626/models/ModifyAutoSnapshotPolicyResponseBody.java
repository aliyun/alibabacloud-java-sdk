// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ModifyAutoSnapshotPolicyResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * <br>
     * <p>Every response returns a unique request ID regardless of whether the request is successful.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyAutoSnapshotPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyAutoSnapshotPolicyResponseBody self = new ModifyAutoSnapshotPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyAutoSnapshotPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
