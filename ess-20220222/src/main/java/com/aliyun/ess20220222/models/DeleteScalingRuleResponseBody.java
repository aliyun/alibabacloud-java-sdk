// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DeleteScalingRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteScalingRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteScalingRuleResponseBody self = new DeleteScalingRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteScalingRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
