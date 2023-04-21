// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateSnapshotResponseBody extends TeaModel {
    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the snapshot.</p>
     */
    @NameInMap("SnapshotId")
    public String snapshotId;

    public static CreateSnapshotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSnapshotResponseBody self = new CreateSnapshotResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSnapshotResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSnapshotResponseBody setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }
    public String getSnapshotId() {
        return this.snapshotId;
    }

}
