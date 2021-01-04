// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateSnapshotResponseBody extends TeaModel {
    @NameInMap("SnapshotId")
    public String snapshotId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateSnapshotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSnapshotResponseBody self = new CreateSnapshotResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSnapshotResponseBody setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }
    public String getSnapshotId() {
        return this.snapshotId;
    }

    public CreateSnapshotResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
