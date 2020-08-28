// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ApplyAutoSnapshotPolicyResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ApplyAutoSnapshotPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyAutoSnapshotPolicyResponse self = new ApplyAutoSnapshotPolicyResponse();
        return TeaModel.build(map, self);
    }

    public ApplyAutoSnapshotPolicyResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
