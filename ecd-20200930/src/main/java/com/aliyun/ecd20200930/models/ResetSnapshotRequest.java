// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ResetSnapshotRequest extends TeaModel {
    /**
     * <p>The ID of the region.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hzngahou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the snapshot.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>s-2zeipxmnhej803x7****</p>
     */
    @NameInMap("SnapshotId")
    public String snapshotId;

    public static ResetSnapshotRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetSnapshotRequest self = new ResetSnapshotRequest();
        return TeaModel.build(map, self);
    }

    public ResetSnapshotRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ResetSnapshotRequest setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }
    public String getSnapshotId() {
        return this.snapshotId;
    }

}
