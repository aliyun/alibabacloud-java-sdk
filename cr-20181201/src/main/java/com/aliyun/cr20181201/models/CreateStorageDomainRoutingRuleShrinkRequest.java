// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateStorageDomainRoutingRuleShrinkRequest extends TeaModel {
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
    public String routesShrink;

    public static CreateStorageDomainRoutingRuleShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateStorageDomainRoutingRuleShrinkRequest self = new CreateStorageDomainRoutingRuleShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateStorageDomainRoutingRuleShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateStorageDomainRoutingRuleShrinkRequest setRoutesShrink(String routesShrink) {
        this.routesShrink = routesShrink;
        return this;
    }
    public String getRoutesShrink() {
        return this.routesShrink;
    }

}
