// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class UpdateStorageDomainRoutingRuleRequest extends TeaModel {
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
    public java.util.List<RouteItem> routes;

    /**
     * <p>The rule ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>crsdr-b6thg027zmk1****</p>
     */
    @NameInMap("RuleId")
    public String ruleId;

    public static UpdateStorageDomainRoutingRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateStorageDomainRoutingRuleRequest self = new UpdateStorageDomainRoutingRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateStorageDomainRoutingRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateStorageDomainRoutingRuleRequest setRoutes(java.util.List<RouteItem> routes) {
        this.routes = routes;
        return this;
    }
    public java.util.List<RouteItem> getRoutes() {
        return this.routes;
    }

    public UpdateStorageDomainRoutingRuleRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

}
