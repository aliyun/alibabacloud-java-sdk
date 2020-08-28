// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteMetricRuleResourcesRequest extends TeaModel {
    @NameInMap("RuleId")
    public String ruleId;

    @NameInMap("Resources")
    @Validation(required = true)
    public String resources;

    public static DeleteMetricRuleResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMetricRuleResourcesRequest self = new DeleteMetricRuleResourcesRequest();
        return TeaModel.build(map, self);
    }

}
