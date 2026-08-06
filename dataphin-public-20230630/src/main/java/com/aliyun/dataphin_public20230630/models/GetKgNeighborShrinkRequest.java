// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetKgNeighborShrinkRequest extends TeaModel {
    /**
     * <p>The entity record data ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("EntityDataId")
    public String entityDataId;

    /**
     * <p>The entity type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Student</p>
     */
    @NameInMap("EntityType")
    public String entityType;

    /**
     * <p>The entity record neighbor node query instruction.</p>
     */
    @NameInMap("NeighborsQuery")
    public String neighborsQueryShrink;

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
     * <p>The model ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>f1d4559a4db044158305e2d89bccf81f</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetKgNeighborShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetKgNeighborShrinkRequest self = new GetKgNeighborShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetKgNeighborShrinkRequest setEntityDataId(String entityDataId) {
        this.entityDataId = entityDataId;
        return this;
    }
    public String getEntityDataId() {
        return this.entityDataId;
    }

    public GetKgNeighborShrinkRequest setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

    public GetKgNeighborShrinkRequest setNeighborsQueryShrink(String neighborsQueryShrink) {
        this.neighborsQueryShrink = neighborsQueryShrink;
        return this;
    }
    public String getNeighborsQueryShrink() {
        return this.neighborsQueryShrink;
    }

    public GetKgNeighborShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public GetKgNeighborShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
