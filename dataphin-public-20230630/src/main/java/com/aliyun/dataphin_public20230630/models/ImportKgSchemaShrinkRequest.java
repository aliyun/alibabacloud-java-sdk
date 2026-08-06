// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ImportKgSchemaShrinkRequest extends TeaModel {
    /**
     * <p>The instruction for importing the knowledge graph definition.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>f1d4559a4db044158305e2d89bccf81f</p>
     */
    @NameInMap("ImportCommand")
    public String importCommandShrink;

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
     * <p>The workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>f1d4559a4db044158305e2d89bccf81f</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ImportKgSchemaShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportKgSchemaShrinkRequest self = new ImportKgSchemaShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ImportKgSchemaShrinkRequest setImportCommandShrink(String importCommandShrink) {
        this.importCommandShrink = importCommandShrink;
        return this;
    }
    public String getImportCommandShrink() {
        return this.importCommandShrink;
    }

    public ImportKgSchemaShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public ImportKgSchemaShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
