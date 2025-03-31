// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class DeleteArtifactLifecycleRuleRequest extends TeaModel {
    /**
     * <p>The ID of the Container Registry instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cri-brlg4cbj2ylkrqqq</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The rule ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cralr-3v8pao9k7chb8q62</p>
     */
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
