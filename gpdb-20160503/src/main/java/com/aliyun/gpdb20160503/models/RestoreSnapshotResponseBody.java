// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class RestoreSnapshotResponseBody extends TeaModel {
    /**
     * <p>The ID of the restored branch.</p>
     * 
     * <strong>example:</strong>
     * <p>br-restore</p>
     */
    @NameInMap("BranchId")
    public String branchId;

    /**
     * <p>The Supabase project ID.</p>
     * 
     * <strong>example:</strong>
     * <p>spb-xxxx</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B4CAF581-2AC7-41AD-8940-D56DF7AADF5B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RestoreSnapshotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RestoreSnapshotResponseBody self = new RestoreSnapshotResponseBody();
        return TeaModel.build(map, self);
    }

    public RestoreSnapshotResponseBody setBranchId(String branchId) {
        this.branchId = branchId;
        return this;
    }
    public String getBranchId() {
        return this.branchId;
    }

    public RestoreSnapshotResponseBody setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public RestoreSnapshotResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
