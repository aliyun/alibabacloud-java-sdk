// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class DeleteKgEntityRequest extends TeaModel {
    /**
     * <p>The entity record ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>abc-xxx</p>
     */
    @NameInMap("EntityId")
    public String entityId;

    /**
     * <p>The entity type code.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Company</p>
     */
    @NameInMap("EntityType")
    public String entityType;

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
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    /**
     * <p>The workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>f1d4559a4db044158305e2d89bccf81f</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static DeleteKgEntityRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteKgEntityRequest self = new DeleteKgEntityRequest();
        return TeaModel.build(map, self);
    }

    public DeleteKgEntityRequest setEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }
    public String getEntityId() {
        return this.entityId;
    }

    public DeleteKgEntityRequest setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

    public DeleteKgEntityRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public DeleteKgEntityRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public DeleteKgEntityRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
