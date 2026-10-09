// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class UpdateSupabaseVersionRequest extends TeaModel {
    /**
     * <p>The target minor version. You can query the supported upgrade versions for the current project by calling GetSupabaseUpdateVersion.</p>
     * 
     * <strong>example:</strong>
     * <p>20240731</p>
     */
    @NameInMap("MinorVersion")
    public String minorVersion;

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

    public static UpdateSupabaseVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSupabaseVersionRequest self = new UpdateSupabaseVersionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSupabaseVersionRequest setMinorVersion(String minorVersion) {
        this.minorVersion = minorVersion;
        return this;
    }
    public String getMinorVersion() {
        return this.minorVersion;
    }

    public UpdateSupabaseVersionRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public UpdateSupabaseVersionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
