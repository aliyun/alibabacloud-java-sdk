// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class InsertInterveneRuleShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("InterveneRuleConfig")
    public String interveneRuleConfigShrink;

    public static InsertInterveneRuleShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        InsertInterveneRuleShrinkRequest self = new InsertInterveneRuleShrinkRequest();
        return TeaModel.build(map, self);
    }

    public InsertInterveneRuleShrinkRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public InsertInterveneRuleShrinkRequest setInterveneRuleConfigShrink(String interveneRuleConfigShrink) {
        this.interveneRuleConfigShrink = interveneRuleConfigShrink;
        return this;
    }
    public String getInterveneRuleConfigShrink() {
        return this.interveneRuleConfigShrink;
    }

}
