// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeUpdateVpcInfoTaskRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("OperationUid")
    public String operationUid;

    public static DescribeUpdateVpcInfoTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUpdateVpcInfoTaskRequest self = new DescribeUpdateVpcInfoTaskRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUpdateVpcInfoTaskRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeUpdateVpcInfoTaskRequest setOperationUid(String operationUid) {
        this.operationUid = operationUid;
        return this;
    }
    public String getOperationUid() {
        return this.operationUid;
    }

}
