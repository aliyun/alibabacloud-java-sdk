// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeAbolishApiTaskRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("OperationUid")
    public String operationUid;

    public static DescribeAbolishApiTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAbolishApiTaskRequest self = new DescribeAbolishApiTaskRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAbolishApiTaskRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeAbolishApiTaskRequest setOperationUid(String operationUid) {
        this.operationUid = operationUid;
        return this;
    }
    public String getOperationUid() {
        return this.operationUid;
    }

}
