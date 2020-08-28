// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteExporterRuleRequest extends TeaModel {
    @NameInMap("RuleName")
    @Validation(required = true)
    public String ruleName;

    public static DeleteExporterRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteExporterRuleRequest self = new DeleteExporterRuleRequest();
        return TeaModel.build(map, self);
    }

}
