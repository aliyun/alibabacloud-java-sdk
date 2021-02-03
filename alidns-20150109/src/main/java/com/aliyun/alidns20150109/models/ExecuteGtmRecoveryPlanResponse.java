// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class ExecuteGtmRecoveryPlanResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ExecuteGtmRecoveryPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecuteGtmRecoveryPlanResponse self = new ExecuteGtmRecoveryPlanResponse();
        return TeaModel.build(map, self);
    }

    public ExecuteGtmRecoveryPlanResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
