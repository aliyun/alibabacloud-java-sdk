// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class DeleteUserRequest extends TeaModel {
    @NameInMap("UserName")
    public String userName;

    @NameInMap("UserPoolName")
    public String userPoolName;

    public static DeleteUserRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserRequest self = new DeleteUserRequest();
        return TeaModel.build(map, self);
    }

    public DeleteUserRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public DeleteUserRequest setUserPoolName(String userPoolName) {
        this.userPoolName = userPoolName;
        return this;
    }
    public String getUserPoolName() {
        return this.userPoolName;
    }

}
