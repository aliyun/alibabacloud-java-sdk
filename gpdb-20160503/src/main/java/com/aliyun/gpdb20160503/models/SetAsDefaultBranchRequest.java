// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class SetAsDefaultBranchRequest extends TeaModel {
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
     * <p>The ID of the Supabase project that corresponds to the primary branch.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>spb-xxxx</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>The region ID. This parameter is required when you create a primary branch. When you create a sub-branch, this parameter inherits the region of the primary branch by default.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static SetAsDefaultBranchRequest build(java.util.Map<String, ?> map) throws Exception {
        SetAsDefaultBranchRequest self = new SetAsDefaultBranchRequest();
        return TeaModel.build(map, self);
    }

    public SetAsDefaultBranchRequest setBranchId(String branchId) {
        this.branchId = branchId;
        return this;
    }
    public String getBranchId() {
        return this.branchId;
    }

    public SetAsDefaultBranchRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public SetAsDefaultBranchRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
