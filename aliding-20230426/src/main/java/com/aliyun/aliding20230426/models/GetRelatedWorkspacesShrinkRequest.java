// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetRelatedWorkspacesShrinkRequest extends TeaModel {
    @NameInMap("IncludeRecent")
    public Boolean includeRecent;

    @NameInMap("TenantContext")
    public String tenantContextShrink;

    public static GetRelatedWorkspacesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRelatedWorkspacesShrinkRequest self = new GetRelatedWorkspacesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetRelatedWorkspacesShrinkRequest setIncludeRecent(Boolean includeRecent) {
        this.includeRecent = includeRecent;
        return this;
    }
    public Boolean getIncludeRecent() {
        return this.includeRecent;
    }

    public GetRelatedWorkspacesShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

}
