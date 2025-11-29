// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class GetSupabaseProjectDashboardAccountRequest extends TeaModel {
    /**
     * <p>The Supabase project ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sbp-4ptxp5mp****</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>The region ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GetSupabaseProjectDashboardAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSupabaseProjectDashboardAccountRequest self = new GetSupabaseProjectDashboardAccountRequest();
        return TeaModel.build(map, self);
    }

    public GetSupabaseProjectDashboardAccountRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public GetSupabaseProjectDashboardAccountRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
