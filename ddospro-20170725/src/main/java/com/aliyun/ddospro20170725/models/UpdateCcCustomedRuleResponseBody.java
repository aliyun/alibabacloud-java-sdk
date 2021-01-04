// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddospro20170725.models;

import com.aliyun.tea.*;

public class UpdateCcCustomedRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateCcCustomedRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateCcCustomedRuleResponseBody self = new UpdateCcCustomedRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateCcCustomedRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
