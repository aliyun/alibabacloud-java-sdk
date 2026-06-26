// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class UpdateUserRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("DisplayName")
    public String displayName;

    @NameInMap("Email")
    public String email;

    @NameInMap("Status")
    public String status;

    @NameInMap("UserName")
    public String userName;

    @NameInMap("UserPoolName")
    public String userPoolName;

    public static UpdateUserRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserRequest self = new UpdateUserRequest();
        return TeaModel.build(map, self);
    }

    public UpdateUserRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateUserRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public UpdateUserRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public UpdateUserRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateUserRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public UpdateUserRequest setUserPoolName(String userPoolName) {
        this.userPoolName = userPoolName;
        return this;
    }
    public String getUserPoolName() {
        return this.userPoolName;
    }

}
