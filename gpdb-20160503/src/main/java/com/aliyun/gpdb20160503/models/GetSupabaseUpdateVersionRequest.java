// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class GetSupabaseUpdateVersionRequest extends TeaModel {
    /**
     * <p>The ID of the Supabase project.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>spb-xxxx</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GetSupabaseUpdateVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSupabaseUpdateVersionRequest self = new GetSupabaseUpdateVersionRequest();
        return TeaModel.build(map, self);
    }

    public GetSupabaseUpdateVersionRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public GetSupabaseUpdateVersionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
