// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class ExecuteGtmRecoveryPlanRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("RecoveryPlanId")
    @Validation(required = true)
    public Long recoveryPlanId;

    public static ExecuteGtmRecoveryPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteGtmRecoveryPlanRequest self = new ExecuteGtmRecoveryPlanRequest();
        return TeaModel.build(map, self);
    }

}
