// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CreateBranchResponseBody extends TeaModel {
    /**
     * <p>The branch ID, which uniquely identifies a Supabase branch.</p>
     * 
     * <strong>example:</strong>
     * <p>br-xxxx</p>
     */
    @NameInMap("BranchId")
    public String branchId;

    /**
     * <p>The ID of the Supabase project that corresponds to the primary branch.</p>
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
     * <p>ABB39CC3-4488-4857-905D-2E4A051D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateBranchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateBranchResponseBody self = new CreateBranchResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateBranchResponseBody setBranchId(String branchId) {
        this.branchId = branchId;
        return this;
    }
    public String getBranchId() {
        return this.branchId;
    }

    public CreateBranchResponseBody setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public CreateBranchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
