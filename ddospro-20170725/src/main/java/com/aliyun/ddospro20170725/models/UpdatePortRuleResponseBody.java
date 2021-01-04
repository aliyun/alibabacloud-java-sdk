// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddospro20170725.models;

import com.aliyun.tea.*;

public class UpdatePortRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdatePortRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdatePortRuleResponseBody self = new UpdatePortRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdatePortRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
