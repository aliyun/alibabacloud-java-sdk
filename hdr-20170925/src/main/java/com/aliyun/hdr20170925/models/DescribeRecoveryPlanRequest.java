// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeRecoveryPlanRequest extends TeaModel {
    @NameInMap("RecoveryPlanId")
    public String recoveryPlanId;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("UserUid")
    public Long userUid;

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

    public DescribeRecoveryPlanRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeRecoveryPlanRequest setUserUid(Long userUid) {
        this.userUid = userUid;
        return this;
    }
    public Long getUserUid() {
        return this.userUid;
    }

}
