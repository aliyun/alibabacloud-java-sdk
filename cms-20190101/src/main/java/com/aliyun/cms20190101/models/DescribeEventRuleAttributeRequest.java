// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeEventRuleAttributeRequest extends TeaModel {
    @NameInMap("RuleName")
    public String ruleName;

    public static DescribeEventRuleAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventRuleAttributeRequest self = new DescribeEventRuleAttributeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEventRuleAttributeRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

}
