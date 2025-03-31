// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateArtifactSubscriptionTaskRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cri-4ec5xvj4j0l****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The rule ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>crasr-88s7vmelc3m****</p>
     */
    @NameInMap("RuleId")
    public String ruleId;

    public static CreateArtifactSubscriptionTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateArtifactSubscriptionTaskRequest self = new CreateArtifactSubscriptionTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateArtifactSubscriptionTaskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateArtifactSubscriptionTaskRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

}
