// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

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

    public CreateSnapshotResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSnapshotResponse setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }
    public String getSnapshotId() {
        return this.snapshotId;
    }

}
