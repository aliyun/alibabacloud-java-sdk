// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeRecoveryPointsForRPRequest extends TeaModel {
    @NameInMap("RecoveryPlanId")
    public String recoveryPlanId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeRecoveryPointsForRPRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecoveryPointsForRPRequest self = new DescribeRecoveryPointsForRPRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRecoveryPointsForRPRequest setRecoveryPlanId(String recoveryPlanId) {
        this.recoveryPlanId = recoveryPlanId;
        return this;
    }
    public String getRecoveryPlanId() {
        return this.recoveryPlanId;
    }

    public DescribeRecoveryPointsForRPRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
