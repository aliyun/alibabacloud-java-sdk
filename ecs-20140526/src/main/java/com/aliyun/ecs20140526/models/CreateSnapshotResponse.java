// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateSnapshotResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("SnapshotId")
    @Validation(required = true)
    public String snapshotId;

    public static CreateSnapshotResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSnapshotResponse self = new CreateSnapshotResponse();
        return TeaModel.build(map, self);
    }

}
