// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteEventRulesRequest extends TeaModel {
    @NameInMap("RuleNames")
    @Validation(required = true)
    public java.util.List<String> ruleNames;

    public static DeleteEventRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteEventRulesRequest self = new DeleteEventRulesRequest();
        return TeaModel.build(map, self);
    }

}
