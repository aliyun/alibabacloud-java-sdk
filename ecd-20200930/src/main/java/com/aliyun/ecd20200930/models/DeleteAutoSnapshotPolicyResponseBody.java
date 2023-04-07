// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeleteAutoSnapshotPolicyResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAutoSnapshotPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAutoSnapshotPolicyResponseBody self = new DeleteAutoSnapshotPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAutoSnapshotPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
