// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class DeleteStorageDomainRoutingRuleRequest extends TeaModel {
    /**
     * <p>The instance ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cri-4cdrlqmhn4gm****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The rule ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>crsdr-n6pbhgjxtla***</p>
     */
    @NameInMap("RuleId")
    public String ruleId;

    public static DeleteStorageDomainRoutingRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteStorageDomainRoutingRuleRequest self = new DeleteStorageDomainRoutingRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteStorageDomainRoutingRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteStorageDomainRoutingRuleRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

}
