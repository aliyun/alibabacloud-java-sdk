// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ExecKgGremlinShrinkRequest extends TeaModel {
    /**
     * <p>The custom Cypher query command.</p>
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
     * <p>The ID of the operator user.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    /**
     * <p>The model ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>f1d4559a4db044158305e2d89bccf81f</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ExecKgGremlinShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecKgGremlinShrinkRequest self = new ExecKgGremlinShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ExecKgGremlinShrinkRequest setExecCommandShrink(String execCommandShrink) {
        this.execCommandShrink = execCommandShrink;
        return this;
    }
    public String getExecCommandShrink() {
        return this.execCommandShrink;
    }

    public ExecKgGremlinShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public ExecKgGremlinShrinkRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public ExecKgGremlinShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
