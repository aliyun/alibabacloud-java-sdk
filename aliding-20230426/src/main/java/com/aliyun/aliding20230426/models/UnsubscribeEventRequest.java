// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UnsubscribeEventRequest extends TeaModel {
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
     * <p>23456</p>
     */
    @NameInMap("ScopeId")
    public String scopeId;

    @NameInMap("TenantContext")
    public UnsubscribeEventRequestTenantContext tenantContext;

    public static UnsubscribeEventRequest build(java.util.Map<String, ?> map) throws Exception {
        UnsubscribeEventRequest self = new UnsubscribeEventRequest();
        return TeaModel.build(map, self);
    }

    public UnsubscribeEventRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public UnsubscribeEventRequest setScopeId(String scopeId) {
        this.scopeId = scopeId;
        return this;
    }
    public String getScopeId() {
        return this.scopeId;
    }

    public UnsubscribeEventRequest setTenantContext(UnsubscribeEventRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public UnsubscribeEventRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class UnsubscribeEventRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static UnsubscribeEventRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            UnsubscribeEventRequestTenantContext self = new UnsubscribeEventRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public UnsubscribeEventRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
