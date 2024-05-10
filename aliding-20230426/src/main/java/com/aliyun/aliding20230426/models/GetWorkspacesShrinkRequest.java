// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetWorkspacesShrinkRequest extends TeaModel {
    @NameInMap("Option")
    public String optionShrink;

    @NameInMap("TenantContext")
    public String tenantContextShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("WorkspaceIds")
    public String workspaceIdsShrink;

    public static GetWorkspacesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWorkspacesShrinkRequest self = new GetWorkspacesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetWorkspacesShrinkRequest setOptionShrink(String optionShrink) {
        this.optionShrink = optionShrink;
        return this;
    }
    public String getOptionShrink() {
        return this.optionShrink;
    }

    public GetWorkspacesShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

    public GetWorkspacesShrinkRequest setWorkspaceIdsShrink(String workspaceIdsShrink) {
        this.workspaceIdsShrink = workspaceIdsShrink;
        return this;
    }
    public String getWorkspaceIdsShrink() {
        return this.workspaceIdsShrink;
    }

}
