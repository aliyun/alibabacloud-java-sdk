// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetArtifactSubscriptionRuleRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cri-c0o11woew0k****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The rule ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>crasr-mdbpung4i1rm****</p>
     */
    @NameInMap("RuleId")
    public String ruleId;

    public static GetArtifactSubscriptionRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        GetArtifactSubscriptionRuleRequest self = new GetArtifactSubscriptionRuleRequest();
        return TeaModel.build(map, self);
    }

    public GetArtifactSubscriptionRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetArtifactSubscriptionRuleRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

}
