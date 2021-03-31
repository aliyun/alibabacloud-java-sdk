// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateSnapshotGroupResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("SnapshotGroupId")
    @Validation(required = true)
    public String snapshotGroupId;

    public static CreateSnapshotGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSnapshotGroupResponse self = new CreateSnapshotGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateSnapshotGroupResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSnapshotGroupResponse setSnapshotGroupId(String snapshotGroupId) {
        this.snapshotGroupId = snapshotGroupId;
        return this;
    }
    public String getSnapshotGroupId() {
        return this.snapshotGroupId;
    }

}
