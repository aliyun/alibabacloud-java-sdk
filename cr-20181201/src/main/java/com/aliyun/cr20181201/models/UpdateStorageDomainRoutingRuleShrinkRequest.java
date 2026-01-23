// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class UpdateStorageDomainRoutingRuleShrinkRequest extends TeaModel {
    /**
     * <p>The instance ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cri-kmsiwlxxdcva****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The route list</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Routes")
    public String routesShrink;

    /**
     * <p>The rule ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>crsdr-b6thg027zmk1****</p>
     */
    @NameInMap("RuleId")
    public String ruleId;

    public static UpdateStorageDomainRoutingRuleShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateStorageDomainRoutingRuleShrinkRequest self = new UpdateStorageDomainRoutingRuleShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateStorageDomainRoutingRuleShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateStorageDomainRoutingRuleShrinkRequest setRoutesShrink(String routesShrink) {
        this.routesShrink = routesShrink;
        return this;
    }
    public String getRoutesShrink() {
        return this.routesShrink;
    }

    public UpdateStorageDomainRoutingRuleShrinkRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

}
