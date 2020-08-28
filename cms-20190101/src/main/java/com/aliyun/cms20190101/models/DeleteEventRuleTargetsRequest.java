// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteEventRuleTargetsRequest extends TeaModel {
    @NameInMap("RuleName")
    @Validation(required = true)
    public String ruleName;

    @NameInMap("Ids")
    @Validation(required = true)
    public java.util.List<String> ids;

    public static DeleteEventRuleTargetsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteEventRuleTargetsRequest self = new DeleteEventRuleTargetsRequest();
        return TeaModel.build(map, self);
    }

}
