// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class UpdateEnterpriseSnapshotPolicyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateEnterpriseSnapshotPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateEnterpriseSnapshotPolicyResponseBody self = new UpdateEnterpriseSnapshotPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateEnterpriseSnapshotPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
