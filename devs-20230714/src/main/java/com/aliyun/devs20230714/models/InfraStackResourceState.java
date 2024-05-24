// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class InfraStackResourceState extends TeaModel {
    @NameInMap("resourceDrifts")
    public java.util.List<ResourceDrift> resourceDrifts;

    @NameInMap("resources")
    public java.util.List<ResourceDetail> resources;

    public static InfraStackResourceState build(java.util.Map<String, ?> map) throws Exception {
        InfraStackResourceState self = new InfraStackResourceState();
        return TeaModel.build(map, self);
    }

    public InfraStackResourceState setResourceDrifts(java.util.List<ResourceDrift> resourceDrifts) {
        this.resourceDrifts = resourceDrifts;
        return this;
    }
    public java.util.List<ResourceDrift> getResourceDrifts() {
        return this.resourceDrifts;
    }

    public InfraStackResourceState setResources(java.util.List<ResourceDetail> resources) {
        this.resources = resources;
        return this;
    }
    public java.util.List<ResourceDetail> getResources() {
        return this.resources;
    }

}
