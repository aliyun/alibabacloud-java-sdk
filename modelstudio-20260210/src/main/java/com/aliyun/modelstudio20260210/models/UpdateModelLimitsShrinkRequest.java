// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelstudio20260210.models;

import com.aliyun.tea.*;

public class UpdateModelLimitsShrinkRequest extends TeaModel {
    /**
     * <p>The workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ws-ac3ef438bec22dc5</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    /**
     * <p>The throttling values for the workspace.</p>
     */
    @NameInMap("workspaceLimits")
    public String workspaceLimitsShrink;

    public static UpdateModelLimitsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateModelLimitsShrinkRequest self = new UpdateModelLimitsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateModelLimitsShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public UpdateModelLimitsShrinkRequest setWorkspaceLimitsShrink(String workspaceLimitsShrink) {
        this.workspaceLimitsShrink = workspaceLimitsShrink;
        return this;
    }
    public String getWorkspaceLimitsShrink() {
        return this.workspaceLimitsShrink;
    }

}
