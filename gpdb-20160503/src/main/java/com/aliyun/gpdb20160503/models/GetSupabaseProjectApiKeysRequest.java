// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class GetSupabaseProjectApiKeysRequest extends TeaModel {
    /**
     * <p>The Supabase project ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sbp-481****</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>The region ID.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/86912.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GetSupabaseProjectApiKeysRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSupabaseProjectApiKeysRequest self = new GetSupabaseProjectApiKeysRequest();
        return TeaModel.build(map, self);
    }

    public GetSupabaseProjectApiKeysRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public GetSupabaseProjectApiKeysRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
