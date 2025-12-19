// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class PKCE extends TeaModel {
    @NameInMap("Enabled")
    public Boolean enabled;

    public static PKCE build(java.util.Map<String, ?> map) throws Exception {
        PKCE self = new PKCE();
        return TeaModel.build(map, self);
    }

    public PKCE setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

}
