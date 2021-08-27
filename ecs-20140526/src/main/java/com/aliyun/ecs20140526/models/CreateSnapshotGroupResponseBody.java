// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateSnapshotGroupResponseBody extends TeaModel {
    @NameInMap("SnapshotGroupId")
    public String snapshotGroupId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateSnapshotGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSnapshotGroupResponseBody self = new CreateSnapshotGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSnapshotGroupResponseBody setSnapshotGroupId(String snapshotGroupId) {
        this.snapshotGroupId = snapshotGroupId;
        return this;
    }
    public String getSnapshotGroupId() {
        return this.snapshotGroupId;
    }

    public CreateSnapshotGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
