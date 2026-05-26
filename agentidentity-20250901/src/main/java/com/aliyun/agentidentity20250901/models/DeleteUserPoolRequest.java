// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class DeleteUserPoolRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>my-agent-userpool</p>
     */
    @NameInMap("UserPoolName")
    public String userPoolName;

    public static DeleteUserPoolRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserPoolRequest self = new DeleteUserPoolRequest();
        return TeaModel.build(map, self);
    }

    public DeleteUserPoolRequest setUserPoolName(String userPoolName) {
        this.userPoolName = userPoolName;
        return this;
    }
    public String getUserPoolName() {
        return this.userPoolName;
    }

}
