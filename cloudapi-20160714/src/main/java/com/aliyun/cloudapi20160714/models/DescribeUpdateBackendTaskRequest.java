// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeUpdateBackendTaskRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OperationUid")
    public String operationUid;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeUpdateBackendTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUpdateBackendTaskRequest self = new DescribeUpdateBackendTaskRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUpdateBackendTaskRequest setOperationUid(String operationUid) {
        this.operationUid = operationUid;
        return this;
    }
    public String getOperationUid() {
        return this.operationUid;
    }

    public DescribeUpdateBackendTaskRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
