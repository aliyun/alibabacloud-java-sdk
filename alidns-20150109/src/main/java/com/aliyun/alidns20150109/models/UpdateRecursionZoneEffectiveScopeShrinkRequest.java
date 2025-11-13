// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateRecursionZoneEffectiveScopeShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>21079fa016944979537637959d09bc</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("EffectiveScopes")
    public String effectiveScopesShrink;

    /**
     * <strong>example:</strong>
     * <p>173671468000011</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static UpdateRecursionZoneEffectiveScopeShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRecursionZoneEffectiveScopeShrinkRequest self = new UpdateRecursionZoneEffectiveScopeShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRecursionZoneEffectiveScopeShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateRecursionZoneEffectiveScopeShrinkRequest setEffectiveScopesShrink(String effectiveScopesShrink) {
        this.effectiveScopesShrink = effectiveScopesShrink;
        return this;
    }
    public String getEffectiveScopesShrink() {
        return this.effectiveScopesShrink;
    }

    public UpdateRecursionZoneEffectiveScopeShrinkRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
