// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeRecoveryPlanExecutionRequest extends TeaModel {
    @NameInMap("ExecutionId")
    public String executionId;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("UserUid")
    public Long userUid;

    public static DescribeRecoveryPlanExecutionRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecoveryPlanExecutionRequest self = new DescribeRecoveryPlanExecutionRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRecoveryPlanExecutionRequest setExecutionId(String executionId) {
        this.executionId = executionId;
        return this;
    }
    public String getExecutionId() {
        return this.executionId;
    }

    public DescribeRecoveryPlanExecutionRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeRecoveryPlanExecutionRequest setUserUid(Long userUid) {
        this.userUid = userUid;
        return this;
    }
    public Long getUserUid() {
        return this.userUid;
    }

}
