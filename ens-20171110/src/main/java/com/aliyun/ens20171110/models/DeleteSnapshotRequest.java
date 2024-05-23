// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteSnapshotRequest extends TeaModel {
    /**
     * <p>The ID of the snapshot.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SnapshotId")
    public String snapshotId;

    public static DeleteSnapshotRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSnapshotRequest self = new DeleteSnapshotRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSnapshotRequest setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }
    public String getSnapshotId() {
        return this.snapshotId;
    }

}
