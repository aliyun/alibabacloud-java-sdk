// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddospro20170725.models;

import com.aliyun.tea.*;

public class CreatePortRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreatePortRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePortRuleResponseBody self = new CreatePortRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePortRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
