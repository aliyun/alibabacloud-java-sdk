// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class DeleteInterveneRuleRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("RuleId")
    public Long ruleId;

    public static DeleteInterveneRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteInterveneRuleRequest self = new DeleteInterveneRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteInterveneRuleRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public DeleteInterveneRuleRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

}
