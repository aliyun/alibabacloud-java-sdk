// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ResetDiskRequest extends TeaModel {
    /**
     * <p>The ID of the disk that you want to roll back.</p>
     */
    @NameInMap("DiskId")
    public String diskId;

    /**
     * <p>The ID of the snapshot that you want to use to roll back the disk.</p>
     */
    @NameInMap("SnapshotId")
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
