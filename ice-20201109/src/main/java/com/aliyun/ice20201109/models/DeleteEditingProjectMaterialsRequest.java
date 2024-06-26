// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteEditingProjectMaterialsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><em><strong><strong>cbd721b418a89a7dafb1dc</strong></strong></em>,<em><strong><strong>86f5d534c95997c55c96f</strong></strong></em></p>
     */
    @NameInMap("MaterialIds")
    public String materialIds;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>video</p>
     */
    @NameInMap("MaterialType")
    public String materialType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><em><strong><strong>fb2101cb318</strong></strong></em></p>
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
