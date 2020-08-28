// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class EnableEventRulesRequest extends TeaModel {
    @NameInMap("RuleNames")
    @Validation(required = true)
    public java.util.List<String> ruleNames;

    public static EnableEventRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableEventRulesRequest self = new EnableEventRulesRequest();
        return TeaModel.build(map, self);
    }

}
