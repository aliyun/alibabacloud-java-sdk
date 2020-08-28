// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

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

}
