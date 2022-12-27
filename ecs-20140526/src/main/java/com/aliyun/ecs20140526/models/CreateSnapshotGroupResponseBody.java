// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateSnapshotGroupResponseBody extends TeaModel {
    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The ID of the snapshot-consistent group.
    @NameInMap("SnapshotGroupId")
    public String snapshotGroupId;

    public static CreateSnapshotGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSnapshotGroupResponseBody self = new CreateSnapshotGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSnapshotGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSnapshotGroupResponseBody setSnapshotGroupId(String snapshotGroupId) {
        this.snapshotGroupId = snapshotGroupId;
        return this;
    }
    public String getSnapshotGroupId() {
        return this.snapshotGroupId;
    }

}
