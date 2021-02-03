// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddGtmRecoveryPlanResponseBody extends TeaModel {
    @NameInMap("RecoveryPlanId")
    public String recoveryPlanId;

    @NameInMap("RequestId")
    public String requestId;

    public static AddGtmRecoveryPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddGtmRecoveryPlanResponseBody self = new AddGtmRecoveryPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public AddGtmRecoveryPlanResponseBody setRecoveryPlanId(String recoveryPlanId) {
        this.recoveryPlanId = recoveryPlanId;
        return this;
    }
    public String getRecoveryPlanId() {
        return this.recoveryPlanId;
    }

    public AddGtmRecoveryPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
