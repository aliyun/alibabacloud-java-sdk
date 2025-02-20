// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class SubscribeEventShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SPACE</p>
     */
    @NameInMap("Scope")
    public String scope;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>233456</p>
     */
    @NameInMap("ScopeId")
    public String scopeId;

    @NameInMap("TenantContext")
    public String tenantContextShrink;

    public static SubscribeEventShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SubscribeEventShrinkRequest self = new SubscribeEventShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SubscribeEventShrinkRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public SubscribeEventShrinkRequest setScopeId(String scopeId) {
        this.scopeId = scopeId;
        return this;
    }
    public String getScopeId() {
        return this.scopeId;
    }

    public SubscribeEventShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

}
