// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DisableEventRulesRequest extends TeaModel {
    @NameInMap("RuleNames")
    @Validation(required = true)
    public java.util.List<String> ruleNames;

    public static DisableEventRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableEventRulesRequest self = new DisableEventRulesRequest();
        return TeaModel.build(map, self);
    }

}
