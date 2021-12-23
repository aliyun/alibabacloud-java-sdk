// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class AddEditingProjectMaterialsRequest extends TeaModel {
    // 素材ID
    @NameInMap("MaterialMaps")
    public String materialMaps;

    // 云剪辑工程ID
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("RegionId")
    public String regionId;

    public static AddEditingProjectMaterialsRequest build(java.util.Map<String, ?> map) throws Exception {
        AddEditingProjectMaterialsRequest self = new AddEditingProjectMaterialsRequest();
        return TeaModel.build(map, self);
    }

    public AddEditingProjectMaterialsRequest setMaterialMaps(String materialMaps) {
        this.materialMaps = materialMaps;
        return this;
    }
    public String getMaterialMaps() {
        return this.materialMaps;
    }

    public AddEditingProjectMaterialsRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public AddEditingProjectMaterialsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
