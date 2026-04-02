// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ArmsIntegrationConfig extends TeaModel {
    /**
     * <p>是否启用 ARMS 集成</p>
     */
    @NameInMap("enabled")
    public Boolean enabled;

    public static ArmsIntegrationConfig build(java.util.Map<String, ?> map) throws Exception {
        ArmsIntegrationConfig self = new ArmsIntegrationConfig();
        return TeaModel.build(map, self);
    }

    public ArmsIntegrationConfig setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

}
