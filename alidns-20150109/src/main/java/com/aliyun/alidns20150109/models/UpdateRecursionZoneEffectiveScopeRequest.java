// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateRecursionZoneEffectiveScopeRequest extends TeaModel {
    /**
     * <p>A client-generated token to ensure request idempotence. The token must be unique for each request. It can contain a maximum of 64 ASCII characters.</p>
     * 
     * <strong>example:</strong>
     * <p>21079fa016944979537637959d09bc</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>A list of effective scopes.</p>
     */
    @NameInMap("EffectiveScopes")
    public java.util.List<UpdateRecursionZoneEffectiveScopeRequestEffectiveScopes> effectiveScopes;

    /**
     * <p>The unique ID of the zone.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>173671468000011</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static UpdateRecursionZoneEffectiveScopeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRecursionZoneEffectiveScopeRequest self = new UpdateRecursionZoneEffectiveScopeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRecursionZoneEffectiveScopeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateRecursionZoneEffectiveScopeRequest setEffectiveScopes(java.util.List<UpdateRecursionZoneEffectiveScopeRequestEffectiveScopes> effectiveScopes) {
        this.effectiveScopes = effectiveScopes;
        return this;
    }
    public java.util.List<UpdateRecursionZoneEffectiveScopeRequestEffectiveScopes> getEffectiveScopes() {
        return this.effectiveScopes;
    }

    public UpdateRecursionZoneEffectiveScopeRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class UpdateRecursionZoneEffectiveScopeRequestEffectiveScopes extends TeaModel {
        /**
         * <p>The type of the effective scope. Valid value: <em>account</em>.</p>
         * 
         * <strong>example:</strong>
         * <p>account</p>
         */
        @NameInMap("EffectiveType")
        public String effectiveType;

        /**
         * <p>The values for the scope, which depend on the value of <code>EffectiveType</code>. If <code>EffectiveType</code> is set to <code>account</code>, this parameter is a list of account IDs.</p>
         */
        @NameInMap("Scope")
        public java.util.List<String> scope;

        public static UpdateRecursionZoneEffectiveScopeRequestEffectiveScopes build(java.util.Map<String, ?> map) throws Exception {
            UpdateRecursionZoneEffectiveScopeRequestEffectiveScopes self = new UpdateRecursionZoneEffectiveScopeRequestEffectiveScopes();
            return TeaModel.build(map, self);
        }

        public UpdateRecursionZoneEffectiveScopeRequestEffectiveScopes setEffectiveType(String effectiveType) {
            this.effectiveType = effectiveType;
            return this;
        }
        public String getEffectiveType() {
            return this.effectiveType;
        }

        public UpdateRecursionZoneEffectiveScopeRequestEffectiveScopes setScope(java.util.List<String> scope) {
            this.scope = scope;
            return this;
        }
        public java.util.List<String> getScope() {
            return this.scope;
        }

    }

}
