// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteMetricRuleTargetsRequest extends TeaModel {
    @NameInMap("RuleId")
    @Validation(required = true)
    public String ruleId;

    @NameInMap("TargetIds")
    public java.util.List<String> targetIds;

    public static DeleteMetricRuleTargetsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMetricRuleTargetsRequest self = new DeleteMetricRuleTargetsRequest();
        return TeaModel.build(map, self);
    }

}
