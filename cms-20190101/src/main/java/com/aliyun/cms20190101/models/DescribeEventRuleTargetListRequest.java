// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeEventRuleTargetListRequest extends TeaModel {
    @NameInMap("RuleName")
    public String ruleName;

    public static DescribeEventRuleTargetListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventRuleTargetListRequest self = new DescribeEventRuleTargetListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEventRuleTargetListRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

}
