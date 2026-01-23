// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetStorageDomainRoutingRuleRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cri-kmsiwlxxdcva****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The rule ID.</p>
     * 
     * <strong>example:</strong>
     * <p>crasr-mdbpung4i1rm****</p>
     */
    @NameInMap("RuleId")
    public String ruleId;

    public static GetStorageDomainRoutingRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        GetStorageDomainRoutingRuleRequest self = new GetStorageDomainRoutingRuleRequest();
        return TeaModel.build(map, self);
    }

    public GetStorageDomainRoutingRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetStorageDomainRoutingRuleRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

}
