// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ModifySupabaseAutoScalePolicyRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable auto-scaling. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: Enables auto-scaling. The Supabase instance automatically pauses and resumes based on traffic.</p>
     * </li>
     * <li><p><code>false</code>: Disables auto-scaling.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoScale")
    public Boolean autoScale;

    /**
     * <p>The ID of the Supabase project. To obtain the workspace ID, log in to the console and go to the Supabase page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sbp-tyarplz****</p>
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

    public static ModifySupabaseAutoScalePolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySupabaseAutoScalePolicyRequest self = new ModifySupabaseAutoScalePolicyRequest();
        return TeaModel.build(map, self);
    }

    public ModifySupabaseAutoScalePolicyRequest setAutoScale(Boolean autoScale) {
        this.autoScale = autoScale;
        return this;
    }
    public Boolean getAutoScale() {
        return this.autoScale;
    }

    public ModifySupabaseAutoScalePolicyRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ModifySupabaseAutoScalePolicyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
