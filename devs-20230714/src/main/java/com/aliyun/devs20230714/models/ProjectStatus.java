// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class ProjectStatus extends TeaModel {
    @NameInMap("services")
    public java.util.List<ServiceMeta> services;

    public static ProjectStatus build(java.util.Map<String, ?> map) throws Exception {
        ProjectStatus self = new ProjectStatus();
        return TeaModel.build(map, self);
    }

    public ProjectStatus setServices(java.util.List<ServiceMeta> services) {
        this.services = services;
        return this;
    }
    public java.util.List<ServiceMeta> getServices() {
        return this.services;
    }

}
