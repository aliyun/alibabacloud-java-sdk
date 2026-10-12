// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreateDeveloperRequest extends TeaModel {
    /**
     * <p>The password of the developer account. The length must be 6 to 32 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>abcd1234</p>
     */
    @NameInMap("password")
    public String password;

    /**
     * <p>The logon username of the developer. The length must not exceed 64 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>developer-demo</p>
     */
    @NameInMap("username")
    public String username;

    public static CreateDeveloperRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDeveloperRequest self = new CreateDeveloperRequest();
        return TeaModel.build(map, self);
    }

    public CreateDeveloperRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateDeveloperRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

}
