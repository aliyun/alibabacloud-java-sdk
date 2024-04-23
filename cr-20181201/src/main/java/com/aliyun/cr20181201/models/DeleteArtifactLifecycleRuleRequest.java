// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class DeleteArtifactLifecycleRuleRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RuleId")
    public String ruleId;

    public static DeleteArtifactLifecycleRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteArtifactLifecycleRuleRequest self = new DeleteArtifactLifecycleRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteArtifactLifecycleRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteArtifactLifecycleRuleRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

}
