// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddGtmRecoveryPlanResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("RecoveryPlanId")
    @Validation(required = true)
    public String recoveryPlanId;

    public static AddGtmRecoveryPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        AddGtmRecoveryPlanResponse self = new AddGtmRecoveryPlanResponse();
        return TeaModel.build(map, self);
    }

}
