// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DeleteRecoveryPlanRequest extends TeaModel {
    @NameInMap("RecoveryPlanId")
    public String recoveryPlanId;

    public static DeleteRecoveryPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRecoveryPlanRequest self = new DeleteRecoveryPlanRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRecoveryPlanRequest setRecoveryPlanId(String recoveryPlanId) {
        this.recoveryPlanId = recoveryPlanId;
        return this;
    }
    public String getRecoveryPlanId() {
        return this.recoveryPlanId;
    }

}
