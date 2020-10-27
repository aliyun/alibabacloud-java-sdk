// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CopySnapshotResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("SnapshotId")
    @Validation(required = true)
    public String snapshotId;

    public static CopySnapshotResponse build(java.util.Map<String, ?> map) throws Exception {
        CopySnapshotResponse self = new CopySnapshotResponse();
        return TeaModel.build(map, self);
    }

    public CopySnapshotResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CopySnapshotResponse setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }
    public String getSnapshotId() {
        return this.snapshotId;
    }

}
