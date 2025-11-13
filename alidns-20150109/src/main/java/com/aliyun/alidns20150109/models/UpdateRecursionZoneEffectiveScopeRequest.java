// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateRecursionZoneEffectiveScopeRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>21079fa016944979537637959d09bc</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("EffectiveScopes")
    public java.util.List<UpdateRecursionZoneEffectiveScopeRequestEffectiveScopes> effectiveScopes;

    /**
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
         * <strong>example:</strong>
         * <p>account</p>
         */
        @NameInMap("EffectiveType")
        public String effectiveType;

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
