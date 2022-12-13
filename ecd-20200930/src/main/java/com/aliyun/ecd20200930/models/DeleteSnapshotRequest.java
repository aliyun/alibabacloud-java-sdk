// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeleteSnapshotRequest extends TeaModel {
    // The ID of the region.
    @NameInMap("RegionId")
    public String regionId;

    // The list of snapshot IDs. You can specify up to 100 snapshot IDs.
    @NameInMap("SnapshotId")
    public java.util.List<String> snapshotId;

    public static DeleteSnapshotRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSnapshotRequest self = new DeleteSnapshotRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSnapshotRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteSnapshotRequest setSnapshotId(java.util.List<String> snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }
    public java.util.List<String> getSnapshotId() {
        return this.snapshotId;
    }

}
