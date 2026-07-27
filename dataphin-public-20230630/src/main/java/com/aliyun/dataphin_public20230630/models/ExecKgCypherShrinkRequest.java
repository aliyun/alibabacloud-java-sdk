// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ExecKgCypherShrinkRequest extends TeaModel {
    /**
     * <p>The custom Cypher query instruction.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ExecCommand")
    public String execCommandShrink;

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

    public static ExecKgCypherShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecKgCypherShrinkRequest self = new ExecKgCypherShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ExecKgCypherShrinkRequest setExecCommandShrink(String execCommandShrink) {
        this.execCommandShrink = execCommandShrink;
        return this;
    }
    public String getExecCommandShrink() {
        return this.execCommandShrink;
    }

    public ExecKgCypherShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public ExecKgCypherShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
