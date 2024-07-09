// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeleteAutoSnapshotPolicyResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>51592A88-0F2C-55E6-AD2C-2AD9C10D****</p>
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
