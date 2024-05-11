// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeDeployApiTaskRequest extends TeaModel {
    /**
     * <p>The task ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("OperationUid")
    public String operationUid;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeDeployApiTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeployApiTaskRequest self = new DescribeDeployApiTaskRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDeployApiTaskRequest setOperationUid(String operationUid) {
        this.operationUid = operationUid;
        return this;
    }
    public String getOperationUid() {
        return this.operationUid;
    }

    public DescribeDeployApiTaskRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
