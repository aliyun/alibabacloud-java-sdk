// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class CheckRecoveryPlanRequest extends TeaModel {
    @NameInMap("Operation")
    public String operation;

    @NameInMap("RecoveryPlanId")
    public String recoveryPlanId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static CheckRecoveryPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckRecoveryPlanRequest self = new CheckRecoveryPlanRequest();
        return TeaModel.build(map, self);
    }

    public CheckRecoveryPlanRequest setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

    public CheckRecoveryPlanRequest setRecoveryPlanId(String recoveryPlanId) {
        this.recoveryPlanId = recoveryPlanId;
        return this;
    }
    public String getRecoveryPlanId() {
        return this.recoveryPlanId;
    }

    public CheckRecoveryPlanRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
