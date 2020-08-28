// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DisableMetricRulesRequest extends TeaModel {
    @NameInMap("RuleId")
    @Validation(required = true)
    public java.util.List<String> ruleId;

    public static DisableMetricRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableMetricRulesRequest self = new DisableMetricRulesRequest();
        return TeaModel.build(map, self);
    }

}
