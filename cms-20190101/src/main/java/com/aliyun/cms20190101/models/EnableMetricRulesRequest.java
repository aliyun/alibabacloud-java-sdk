// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class EnableMetricRulesRequest extends TeaModel {
    @NameInMap("RuleId")
    public java.util.List<String> ruleId;

    public static EnableMetricRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableMetricRulesRequest self = new EnableMetricRulesRequest();
        return TeaModel.build(map, self);
    }

    public EnableMetricRulesRequest setRuleId(java.util.List<String> ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public java.util.List<String> getRuleId() {
        return this.ruleId;
    }

}
