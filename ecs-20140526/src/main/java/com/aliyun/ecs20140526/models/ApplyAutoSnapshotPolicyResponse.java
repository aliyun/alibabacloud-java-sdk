// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ApplyAutoSnapshotPolicyResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ApplyAutoSnapshotPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyAutoSnapshotPolicyResponse self = new ApplyAutoSnapshotPolicyResponse();
        return TeaModel.build(map, self);
    }

}
