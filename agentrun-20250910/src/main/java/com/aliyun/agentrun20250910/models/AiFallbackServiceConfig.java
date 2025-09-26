// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class AiFallbackServiceConfig extends TeaModel {
    @NameInMap("passThroughModelName")
    public Boolean passThroughModelName;

    @NameInMap("serviceId")
    public String serviceId;

    @NameInMap("targetModelName")
    public String targetModelName;

    public static AiFallbackServiceConfig build(java.util.Map<String, ?> map) throws Exception {
        AiFallbackServiceConfig self = new AiFallbackServiceConfig();
        return TeaModel.build(map, self);
    }

    public AiFallbackServiceConfig setPassThroughModelName(Boolean passThroughModelName) {
        this.passThroughModelName = passThroughModelName;
        return this;
    }
    public Boolean getPassThroughModelName() {
        return this.passThroughModelName;
    }

    public AiFallbackServiceConfig setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public AiFallbackServiceConfig setTargetModelName(String targetModelName) {
        this.targetModelName = targetModelName;
        return this;
    }
    public String getTargetModelName() {
        return this.targetModelName;
    }

}
