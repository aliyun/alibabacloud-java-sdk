// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateAutoSnapshotPolicyResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("AutoSnapshotPolicyId")
    @Validation(required = true)
    public String autoSnapshotPolicyId;

    public static CreateAutoSnapshotPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAutoSnapshotPolicyResponse self = new CreateAutoSnapshotPolicyResponse();
        return TeaModel.build(map, self);
    }

    public CreateAutoSnapshotPolicyResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAutoSnapshotPolicyResponse setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
        this.autoSnapshotPolicyId = autoSnapshotPolicyId;
        return this;
    }
    public String getAutoSnapshotPolicyId() {
        return this.autoSnapshotPolicyId;
    }

}
