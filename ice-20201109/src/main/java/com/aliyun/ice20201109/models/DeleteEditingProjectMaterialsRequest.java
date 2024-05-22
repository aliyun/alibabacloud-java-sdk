// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteEditingProjectMaterialsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("MaterialIds")
    public String materialIds;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("MaterialType")
    public String materialType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    public static DeleteEditingProjectMaterialsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteEditingProjectMaterialsRequest self = new DeleteEditingProjectMaterialsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteEditingProjectMaterialsRequest setMaterialIds(String materialIds) {
        this.materialIds = materialIds;
        return this;
    }
    public String getMaterialIds() {
        return this.materialIds;
    }

    public DeleteEditingProjectMaterialsRequest setMaterialType(String materialType) {
        this.materialType = materialType;
        return this;
    }
    public String getMaterialType() {
        return this.materialType;
    }

    public DeleteEditingProjectMaterialsRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
