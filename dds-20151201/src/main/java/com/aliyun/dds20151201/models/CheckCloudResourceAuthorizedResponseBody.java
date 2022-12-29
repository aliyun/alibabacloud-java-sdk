// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class CheckCloudResourceAuthorizedResponseBody extends TeaModel {
    // Indicates whether KMS keys are authorized to ApsaraDB for MongoDB instances. Valid values:
    // 
    // *   **0**: KMS keys are not authorized.
    // *   **1**: KMS keys are authorized.
    // *   **2**: KMS is not enabled.
    @NameInMap("AuthorizationState")
    public Integer authorizationState;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The role information of the authorized Alibaba Resource Name (ARN).
    // 
    // >  This parameter is returned only when the value of the **AuthorizationState** parameter is **1**.
    @NameInMap("RoleArn")
    public String roleArn;

    public static CheckCloudResourceAuthorizedResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckCloudResourceAuthorizedResponseBody self = new CheckCloudResourceAuthorizedResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckCloudResourceAuthorizedResponseBody setAuthorizationState(Integer authorizationState) {
        this.authorizationState = authorizationState;
        return this;
    }
    public Integer getAuthorizationState() {
        return this.authorizationState;
    }

    public CheckCloudResourceAuthorizedResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckCloudResourceAuthorizedResponseBody setRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }
    public String getRoleArn() {
        return this.roleArn;
    }

}
