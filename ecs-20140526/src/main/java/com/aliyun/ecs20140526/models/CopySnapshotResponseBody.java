// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CopySnapshotResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the new snapshot.</p>
     */
    @NameInMap("SnapshotId")
    public String snapshotId;

    public static CopySnapshotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CopySnapshotResponseBody self = new CopySnapshotResponseBody();
        return TeaModel.build(map, self);
    }

    public CopySnapshotResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CopySnapshotResponseBody setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }
    public String getSnapshotId() {
        return this.snapshotId;
    }

}
