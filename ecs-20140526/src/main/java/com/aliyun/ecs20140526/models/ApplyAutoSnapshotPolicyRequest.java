// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ApplyAutoSnapshotPolicyRequest extends TeaModel {
    @NameInMap("regionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("autoSnapshotPolicyId")
    @Validation(required = true)
    public String autoSnapshotPolicyId;

    @NameInMap("diskIds")
    @Validation(required = true)
    public String diskIds;

    public static ApplyAutoSnapshotPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyAutoSnapshotPolicyRequest self = new ApplyAutoSnapshotPolicyRequest();
        return TeaModel.build(map, self);
    }

}
