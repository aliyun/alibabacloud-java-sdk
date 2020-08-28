// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMetricRuleTargetsRequest extends TeaModel {
    @NameInMap("RuleId")
    @Validation(required = true)
    public String ruleId;

    public static DescribeMetricRuleTargetsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetricRuleTargetsRequest self = new DescribeMetricRuleTargetsRequest();
        return TeaModel.build(map, self);
    }

}
