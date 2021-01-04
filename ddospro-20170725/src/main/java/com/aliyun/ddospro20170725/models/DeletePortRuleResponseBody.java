// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddospro20170725.models;

import com.aliyun.tea.*;

public class DeletePortRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeletePortRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeletePortRuleResponseBody self = new DeletePortRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeletePortRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
