// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ModifySupabaseProjectDescriptionRequest extends TeaModel {
    /**
     * <p>The detailed description of the Supabase project.</p>
     * 
     * <strong>example:</strong>
     * <p>for-test-project</p>
     */
    @NameInMap("ProjectDescription")
    public String projectDescription;

    /**
     * <p>The Supabase instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>sbp-twmoe9bakow</p>
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

    public static ModifySupabaseProjectDescriptionRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySupabaseProjectDescriptionRequest self = new ModifySupabaseProjectDescriptionRequest();
        return TeaModel.build(map, self);
    }

    public ModifySupabaseProjectDescriptionRequest setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
        return this;
    }
    public String getProjectDescription() {
        return this.projectDescription;
    }

    public ModifySupabaseProjectDescriptionRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ModifySupabaseProjectDescriptionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
