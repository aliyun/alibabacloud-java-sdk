// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class ForcedFailoverForRPRequest extends TeaModel {
    @NameInMap("RecoveryPlanId")
    public String recoveryPlanId;

    @NameInMap("RecoveryPointTime")
    public Long recoveryPointTime;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("UserUid")
    public Long userUid;

    public static ForcedFailoverForRPRequest build(java.util.Map<String, ?> map) throws Exception {
        ForcedFailoverForRPRequest self = new ForcedFailoverForRPRequest();
        return TeaModel.build(map, self);
    }

    public ForcedFailoverForRPRequest setRecoveryPlanId(String recoveryPlanId) {
        this.recoveryPlanId = recoveryPlanId;
        return this;
    }
    public String getRecoveryPlanId() {
        return this.recoveryPlanId;
    }

    public ForcedFailoverForRPRequest setRecoveryPointTime(Long recoveryPointTime) {
        this.recoveryPointTime = recoveryPointTime;
        return this;
    }
    public Long getRecoveryPointTime() {
        return this.recoveryPointTime;
    }

    public ForcedFailoverForRPRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public ForcedFailoverForRPRequest setUserUid(Long userUid) {
        this.userUid = userUid;
        return this;
    }
    public Long getUserUid() {
        return this.userUid;
    }

}
