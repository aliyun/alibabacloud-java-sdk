// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class UnbindEnterpriseSnapshotPolicyResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UnbindEnterpriseSnapshotPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnbindEnterpriseSnapshotPolicyResponseBody self = new UnbindEnterpriseSnapshotPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public UnbindEnterpriseSnapshotPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
