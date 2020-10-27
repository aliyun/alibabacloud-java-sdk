// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ResetDiskRequest extends TeaModel {
    @NameInMap("DiskId")
    @Validation(required = true)
    public String diskId;

    @NameInMap("SnapshotId")
    @Validation(required = true)
    public String snapshotId;

    public static ResetDiskRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetDiskRequest self = new ResetDiskRequest();
        return TeaModel.build(map, self);
    }

    public ResetDiskRequest setDiskId(String diskId) {
        this.diskId = diskId;
        return this;
    }
    public String getDiskId() {
        return this.diskId;
    }

    public ResetDiskRequest setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }
    public String getSnapshotId() {
        return this.snapshotId;
    }

}
