// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DeleteAutoSnapshotPolicyResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * <br>
     * <p>Every response returns a unique request ID regardless of whether the request is successful.</p>
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
