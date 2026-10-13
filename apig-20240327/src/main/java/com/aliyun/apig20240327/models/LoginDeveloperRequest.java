// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class LoginDeveloperRequest extends TeaModel {
    /**
     * <p>The password of the developer account. This field is marked as sensitive in the API definition.</p>
     * 
     * <strong>example:</strong>
     * <p>abcd1234</p>
     */
    @NameInMap("password")
    public String password;

    /**
     * <p>The developer logon username.</p>
     * 
     * <strong>example:</strong>
     * <p>developer-demo</p>
     */
    @NameInMap("username")
    public String username;

    public static LoginDeveloperRequest build(java.util.Map<String, ?> map) throws Exception {
        LoginDeveloperRequest self = new LoginDeveloperRequest();
        return TeaModel.build(map, self);
    }

    public LoginDeveloperRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public LoginDeveloperRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

}
