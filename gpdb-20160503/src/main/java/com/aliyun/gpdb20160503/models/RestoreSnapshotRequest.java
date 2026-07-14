// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class RestoreSnapshotRequest extends TeaModel {
    /**
     * <p>The idempotency token. Ensures that repeated requests do not execute the same operation more than once.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to complete the restoration immediately. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("FinalizeRestore")
    public Boolean finalizeRestore;

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

    /**
     * <p>The name of the restored branch. If not specified, the backend generates a name automatically.</p>
     * 
     * <strong>example:</strong>
     * <p>restore_preview</p>
     */
    @NameInMap("RestoredBranchName")
    public String restoredBranchName;

    /**
     * <p>The snapshot LSN used for restoration.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0/3522648</p>
     */
    @NameInMap("RestoredLsn")
    public String restoredLsn;

    /**
     * <p>The target branch ID. If not specified, the backend selects the target branch based on the restoration process.</p>
     * 
     * <strong>example:</strong>
     * <p>br-main</p>
     */
    @NameInMap("TargetBranchId")
    public String targetBranchId;

    public static RestoreSnapshotRequest build(java.util.Map<String, ?> map) throws Exception {
        RestoreSnapshotRequest self = new RestoreSnapshotRequest();
        return TeaModel.build(map, self);
    }

    public RestoreSnapshotRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RestoreSnapshotRequest setFinalizeRestore(Boolean finalizeRestore) {
        this.finalizeRestore = finalizeRestore;
        return this;
    }
    public Boolean getFinalizeRestore() {
        return this.finalizeRestore;
    }

    public RestoreSnapshotRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public RestoreSnapshotRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RestoreSnapshotRequest setRestoredBranchName(String restoredBranchName) {
        this.restoredBranchName = restoredBranchName;
        return this;
    }
    public String getRestoredBranchName() {
        return this.restoredBranchName;
    }

    public RestoreSnapshotRequest setRestoredLsn(String restoredLsn) {
        this.restoredLsn = restoredLsn;
        return this;
    }
    public String getRestoredLsn() {
        return this.restoredLsn;
    }

    public RestoreSnapshotRequest setTargetBranchId(String targetBranchId) {
        this.targetBranchId = targetBranchId;
        return this;
    }
    public String getTargetBranchId() {
        return this.targetBranchId;
    }

}
