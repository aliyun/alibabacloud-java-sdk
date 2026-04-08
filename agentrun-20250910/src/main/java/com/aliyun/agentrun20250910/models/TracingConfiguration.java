// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class TracingConfiguration extends TeaModel {
    /**
     * <p>是否启用链路追踪功能</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enabled")
    public Boolean enabled;

    public static TracingConfiguration build(java.util.Map<String, ?> map) throws Exception {
        TracingConfiguration self = new TracingConfiguration();
        return TeaModel.build(map, self);
    }

    public TracingConfiguration setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

}
