// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class EnableActiveMetricRuleResponse extends TeaModel {
    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static EnableActiveMetricRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableActiveMetricRuleResponse self = new EnableActiveMetricRuleResponse();
        return TeaModel.build(map, self);
    }

}
