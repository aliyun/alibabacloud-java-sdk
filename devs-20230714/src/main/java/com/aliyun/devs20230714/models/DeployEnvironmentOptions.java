// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class DeployEnvironmentOptions extends TeaModel {
    @NameInMap("services")
    public java.util.List<String> services;

    public static DeployEnvironmentOptions build(java.util.Map<String, ?> map) throws Exception {
        DeployEnvironmentOptions self = new DeployEnvironmentOptions();
        return TeaModel.build(map, self);
    }

    public DeployEnvironmentOptions setServices(java.util.List<String> services) {
        this.services = services;
        return this;
    }
    public java.util.List<String> getServices() {
        return this.services;
    }

}
