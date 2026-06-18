// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeBranchRequest extends TeaModel {
    /**
     * <p>The branch ID, which uniquely identifies a Supabase branch.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>br-xxxx</p>
     */
    @NameInMap("BranchId")
    public String branchId;

    /**
     * <p>The region ID. This parameter is required when you create a primary branch. When you create a child branch, the region of the primary branch is inherited by default.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeBranchRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBranchRequest self = new DescribeBranchRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBranchRequest setBranchId(String branchId) {
        this.branchId = branchId;
        return this;
    }
    public String getBranchId() {
        return this.branchId;
    }

    public DescribeBranchRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
