// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateClientUserPasswordRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("Password")
    public String password;

    @NameInMap("Username")
    public String username;

    public static UpdateClientUserPasswordRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateClientUserPasswordRequest self = new UpdateClientUserPasswordRequest();
        return TeaModel.build(map, self);
    }

    public UpdateClientUserPasswordRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateClientUserPasswordRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public UpdateClientUserPasswordRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

}
