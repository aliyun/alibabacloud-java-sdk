// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateSnapshotGroupResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>01ABBD93-1ABB-4D92-B496-1A3D20EC0697</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the snapshot-consistent group.</p>
     * 
     * <strong>example:</strong>
     * <p>ssg-j6ciyh3k52qp7ovm****</p>
     */
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
