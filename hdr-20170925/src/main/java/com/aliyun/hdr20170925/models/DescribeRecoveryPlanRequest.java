// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeRecoveryPlanRequest extends TeaModel {
    @NameInMap("RecoveryPlanId")
    public String recoveryPlanId;

    public static DescribeRecoveryPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecoveryPlanRequest self = new DescribeRecoveryPlanRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRecoveryPlanRequest setRecoveryPlanId(String recoveryPlanId) {
        this.recoveryPlanId = recoveryPlanId;
        return this;
    }
    public String getRecoveryPlanId() {
        return this.recoveryPlanId;
    }

}
