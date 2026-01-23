// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateStorageDomainRoutingRuleRequest extends TeaModel {
    /**
     * <p>The instance ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cri-xkx6vujuhay0****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The route list</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Routes")
    public java.util.List<RouteItem> routes;

    public static CreateStorageDomainRoutingRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateStorageDomainRoutingRuleRequest self = new CreateStorageDomainRoutingRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateStorageDomainRoutingRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateStorageDomainRoutingRuleRequest setRoutes(java.util.List<RouteItem> routes) {
        this.routes = routes;
        return this;
    }
    public java.util.List<RouteItem> getRoutes() {
        return this.routes;
    }

}
