// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DeleteSnapshotRequest extends TeaModel {
    /**
     * <p>The LSN of the snapshot to delete.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0/3522648</p>
     */
    @NameInMap("Lsn")
    public String lsn;

    /**
     * <p>The Supabase project ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>spb-xxxx</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>The region ID. Specifies the region in which to query or perform the operation.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DeleteSnapshotRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSnapshotRequest self = new DeleteSnapshotRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSnapshotRequest setLsn(String lsn) {
        this.lsn = lsn;
        return this;
    }
    public String getLsn() {
        return this.lsn;
    }

    public DeleteSnapshotRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public DeleteSnapshotRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
