// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeEventRuleAttributeRequest extends TeaModel {
    @NameInMap("RuleName")
    @Validation(required = true)
    public String ruleName;

    public static DescribeEventRuleAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventRuleAttributeRequest self = new DescribeEventRuleAttributeRequest();
        return TeaModel.build(map, self);
    }

}
