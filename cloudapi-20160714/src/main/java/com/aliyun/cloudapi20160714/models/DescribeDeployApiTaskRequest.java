// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeDeployApiTaskRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("OperationUid")
    public String operationUid;

    public static DescribeDeployApiTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeployApiTaskRequest self = new DescribeDeployApiTaskRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDeployApiTaskRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeDeployApiTaskRequest setOperationUid(String operationUid) {
        this.operationUid = operationUid;
        return this;
    }
    public String getOperationUid() {
        return this.operationUid;
    }

}
