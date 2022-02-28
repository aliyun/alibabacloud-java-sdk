// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class TestFailoverForRPRequest extends TeaModel {
    @NameInMap("RecoveryPlanId")
    public String recoveryPlanId;

    @NameInMap("RecoveryPointTime")
    public Long recoveryPointTime;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("UserUid")
    public Long userUid;

    public static TestFailoverForRPRequest build(java.util.Map<String, ?> map) throws Exception {
        TestFailoverForRPRequest self = new TestFailoverForRPRequest();
        return TeaModel.build(map, self);
    }

    public TestFailoverForRPRequest setRecoveryPlanId(String recoveryPlanId) {
        this.recoveryPlanId = recoveryPlanId;
        return this;
    }
    public String getRecoveryPlanId() {
        return this.recoveryPlanId;
    }

    public TestFailoverForRPRequest setRecoveryPointTime(Long recoveryPointTime) {
        this.recoveryPointTime = recoveryPointTime;
        return this;
    }
    public Long getRecoveryPointTime() {
        return this.recoveryPointTime;
    }

    public TestFailoverForRPRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public TestFailoverForRPRequest setUserUid(Long userUid) {
        this.userUid = userUid;
        return this;
    }
    public Long getUserUid() {
        return this.userUid;
    }

}
