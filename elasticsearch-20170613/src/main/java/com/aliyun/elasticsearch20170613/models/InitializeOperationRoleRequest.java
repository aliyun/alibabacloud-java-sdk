// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class InitializeOperationRoleRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    public static InitializeOperationRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        InitializeOperationRoleRequest self = new InitializeOperationRoleRequest();
        return TeaModel.build(map, self);
    }

    public InitializeOperationRoleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
