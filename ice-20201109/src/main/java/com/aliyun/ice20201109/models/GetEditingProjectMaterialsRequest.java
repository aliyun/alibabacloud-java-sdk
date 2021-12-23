// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetEditingProjectMaterialsRequest extends TeaModel {
    // 云剪辑工程ID
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("RegionId")
    public String regionId;

    public static GetEditingProjectMaterialsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEditingProjectMaterialsRequest self = new GetEditingProjectMaterialsRequest();
        return TeaModel.build(map, self);
    }

    public GetEditingProjectMaterialsRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public GetEditingProjectMaterialsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
