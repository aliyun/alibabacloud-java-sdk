// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteSnapshotRequest extends TeaModel {
    @NameInMap("SnapshotId")
    @Validation(required = true)
    public String snapshotId;

    @NameInMap("Force")
    public Boolean force;

    public static DeleteSnapshotRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSnapshotRequest self = new DeleteSnapshotRequest();
        return TeaModel.build(map, self);
    }

}
