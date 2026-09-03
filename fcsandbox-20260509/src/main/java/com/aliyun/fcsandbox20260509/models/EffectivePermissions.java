// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class EffectivePermissions extends TeaModel {
    /**
     * <p>The actions.</p>
     */
    @NameInMap("actions")
    public java.util.List<String> actions;

    /**
     * <p>The capabilities.</p>
     */
    @NameInMap("capabilities")
    public java.util.List<String> capabilities;

    public static EffectivePermissions build(java.util.Map<String, ?> map) throws Exception {
        EffectivePermissions self = new EffectivePermissions();
        return TeaModel.build(map, self);
    }

    public EffectivePermissions setActions(java.util.List<String> actions) {
        this.actions = actions;
        return this;
    }
    public java.util.List<String> getActions() {
        return this.actions;
    }

    public EffectivePermissions setCapabilities(java.util.List<String> capabilities) {
        this.capabilities = capabilities;
        return this;
    }
    public java.util.List<String> getCapabilities() {
        return this.capabilities;
    }

}
