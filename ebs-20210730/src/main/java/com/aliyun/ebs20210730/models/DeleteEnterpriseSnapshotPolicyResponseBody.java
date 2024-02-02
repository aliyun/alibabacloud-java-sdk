// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DeleteEnterpriseSnapshotPolicyResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteEnterpriseSnapshotPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteEnterpriseSnapshotPolicyResponseBody self = new DeleteEnterpriseSnapshotPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteEnterpriseSnapshotPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
