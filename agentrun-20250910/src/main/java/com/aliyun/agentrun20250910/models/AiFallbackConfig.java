// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class AiFallbackConfig extends TeaModel {
    @NameInMap("serviceConfigs")
    public java.util.List<AiFallbackServiceConfig> serviceConfigs;

    public static AiFallbackConfig build(java.util.Map<String, ?> map) throws Exception {
        AiFallbackConfig self = new AiFallbackConfig();
        return TeaModel.build(map, self);
    }

    public AiFallbackConfig setServiceConfigs(java.util.List<AiFallbackServiceConfig> serviceConfigs) {
        this.serviceConfigs = serviceConfigs;
        return this;
    }
    public java.util.List<AiFallbackServiceConfig> getServiceConfigs() {
        return this.serviceConfigs;
    }

}
