// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class SubscribeEventRequest extends TeaModel {
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
    public SubscribeEventRequestTenantContext tenantContext;

    public static SubscribeEventRequest build(java.util.Map<String, ?> map) throws Exception {
        SubscribeEventRequest self = new SubscribeEventRequest();
        return TeaModel.build(map, self);
    }

    public SubscribeEventRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public SubscribeEventRequest setScopeId(String scopeId) {
        this.scopeId = scopeId;
        return this;
    }
    public String getScopeId() {
        return this.scopeId;
    }

    public SubscribeEventRequest setTenantContext(SubscribeEventRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public SubscribeEventRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class SubscribeEventRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static SubscribeEventRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            SubscribeEventRequestTenantContext self = new SubscribeEventRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public SubscribeEventRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
