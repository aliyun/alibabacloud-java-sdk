// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddospro20170725.models;

import com.aliyun.tea.*;

public class DeleteCcCustomedRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteCcCustomedRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCcCustomedRuleResponseBody self = new DeleteCcCustomedRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCcCustomedRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
