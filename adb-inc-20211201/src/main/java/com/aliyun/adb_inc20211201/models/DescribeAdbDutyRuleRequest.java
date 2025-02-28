// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class DescribeAdbDutyRuleRequest extends TeaModel {
    @NameInMap("RuleIds")
    public String ruleIds;

    public static DescribeAdbDutyRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAdbDutyRuleRequest self = new DescribeAdbDutyRuleRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAdbDutyRuleRequest setRuleIds(String ruleIds) {
        this.ruleIds = ruleIds;
        return this;
    }
    public String getRuleIds() {
        return this.ruleIds;
    }

}
