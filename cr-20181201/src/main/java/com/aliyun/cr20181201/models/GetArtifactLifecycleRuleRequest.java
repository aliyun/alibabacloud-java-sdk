// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetArtifactLifecycleRuleRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RuleId")
    public String ruleId;

    public static GetArtifactLifecycleRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        GetArtifactLifecycleRuleRequest self = new GetArtifactLifecycleRuleRequest();
        return TeaModel.build(map, self);
    }

    public GetArtifactLifecycleRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetArtifactLifecycleRuleRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

}
