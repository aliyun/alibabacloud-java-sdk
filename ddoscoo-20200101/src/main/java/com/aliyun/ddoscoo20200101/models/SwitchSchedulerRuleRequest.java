// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class SwitchSchedulerRuleRequest extends TeaModel {
    @NameInMap("RuleName")
    public String ruleName;

    @NameInMap("RuleType")
    public Integer ruleType;

    @NameInMap("SwitchData")
    public String switchData;

    public static SwitchSchedulerRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        SwitchSchedulerRuleRequest self = new SwitchSchedulerRuleRequest();
        return TeaModel.build(map, self);
    }

    public SwitchSchedulerRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public SwitchSchedulerRuleRequest setRuleType(Integer ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public Integer getRuleType() {
        return this.ruleType;
    }

    public SwitchSchedulerRuleRequest setSwitchData(String switchData) {
        this.switchData = switchData;
        return this;
    }
    public String getSwitchData() {
        return this.switchData;
    }

}
