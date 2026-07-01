// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateDatasetShrinkRequest extends TeaModel {
    /**
     * <p>The creation request.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CreateCommand")
    public String createCommandShrink;

    /**
     * <p>The tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>The project ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7255013756724992</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    public static CreateDatasetShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDatasetShrinkRequest self = new CreateDatasetShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateDatasetShrinkRequest setCreateCommandShrink(String createCommandShrink) {
        this.createCommandShrink = createCommandShrink;
        return this;
    }
    public String getCreateCommandShrink() {
        return this.createCommandShrink;
    }

    public CreateDatasetShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public CreateDatasetShrinkRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
