// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class EnableEventRulesRequest extends TeaModel {
    @NameInMap("RuleNames")
    public java.util.List<String> ruleNames;

    public static EnableEventRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableEventRulesRequest self = new EnableEventRulesRequest();
        return TeaModel.build(map, self);
    }

    public EnableEventRulesRequest setRuleNames(java.util.List<String> ruleNames) {
        this.ruleNames = ruleNames;
        return this;
    }
    public java.util.List<String> getRuleNames() {
        return this.ruleNames;
    }

}
