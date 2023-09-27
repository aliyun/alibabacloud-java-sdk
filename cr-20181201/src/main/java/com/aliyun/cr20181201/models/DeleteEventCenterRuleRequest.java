// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class DeleteEventCenterRuleRequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the event notification rule.</p>
     */
    @NameInMap("RuleId")
    public String ruleId;

    public static DeleteEventCenterRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteEventCenterRuleRequest self = new DeleteEventCenterRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteEventCenterRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteEventCenterRuleRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

}
