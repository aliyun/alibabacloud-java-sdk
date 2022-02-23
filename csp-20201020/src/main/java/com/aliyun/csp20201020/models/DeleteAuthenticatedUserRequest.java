// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csp20201020.models;

import com.aliyun.tea.*;

public class DeleteAuthenticatedUserRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Password")
    public String password;

    @NameInMap("UserName")
    public String userName;

    public static DeleteAuthenticatedUserRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAuthenticatedUserRequest self = new DeleteAuthenticatedUserRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAuthenticatedUserRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteAuthenticatedUserRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public DeleteAuthenticatedUserRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
