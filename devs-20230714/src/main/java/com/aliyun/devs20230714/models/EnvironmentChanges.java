// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class EnvironmentChanges extends TeaModel {
    @NameInMap("services")
    public java.util.Map<String, ?> services;

    public static EnvironmentChanges build(java.util.Map<String, ?> map) throws Exception {
        EnvironmentChanges self = new EnvironmentChanges();
        return TeaModel.build(map, self);
    }

    public EnvironmentChanges setServices(java.util.Map<String, ?> services) {
        this.services = services;
        return this;
    }
    public java.util.Map<String, ?> getServices() {
        return this.services;
    }

}
