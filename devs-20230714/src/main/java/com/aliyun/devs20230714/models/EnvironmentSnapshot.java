// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class EnvironmentSnapshot extends TeaModel {
    @NameInMap("services")
    public java.util.Map<String, ServiceInstance> services;

    public static EnvironmentSnapshot build(java.util.Map<String, ?> map) throws Exception {
        EnvironmentSnapshot self = new EnvironmentSnapshot();
        return TeaModel.build(map, self);
    }

    public EnvironmentSnapshot setServices(java.util.Map<String, ServiceInstance> services) {
        this.services = services;
        return this;
    }
    public java.util.Map<String, ServiceInstance> getServices() {
        return this.services;
    }

}
