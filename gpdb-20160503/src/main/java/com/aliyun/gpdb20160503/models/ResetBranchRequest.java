// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ResetBranchRequest extends TeaModel {
    /**
     * <p>The branch ID that uniquely identifies a Supabase branch.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>br-xxxx</p>
     */
    @NameInMap("BranchId")
    public String branchId;

    /**
     * <p>The Supabase project ID that corresponds to the main branch.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>spb-xxxx</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>The region ID. This parameter is required when you create a main branch. When you create a child branch, the region is inherited from the main branch by default.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ResetBranchRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetBranchRequest self = new ResetBranchRequest();
        return TeaModel.build(map, self);
    }

    public ResetBranchRequest setBranchId(String branchId) {
        this.branchId = branchId;
        return this;
    }
    public String getBranchId() {
        return this.branchId;
    }

    public ResetBranchRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ResetBranchRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
