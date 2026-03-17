// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ResumeSupabaseProjectRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sbp-1****</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>Region ID</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ResumeSupabaseProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        ResumeSupabaseProjectRequest self = new ResumeSupabaseProjectRequest();
        return TeaModel.build(map, self);
    }

    public ResumeSupabaseProjectRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ResumeSupabaseProjectRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
