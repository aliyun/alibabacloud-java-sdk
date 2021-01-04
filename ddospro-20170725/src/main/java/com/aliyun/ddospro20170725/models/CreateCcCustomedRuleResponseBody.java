// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddospro20170725.models;

import com.aliyun.tea.*;

public class CreateCcCustomedRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateCcCustomedRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCcCustomedRuleResponseBody self = new CreateCcCustomedRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCcCustomedRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
