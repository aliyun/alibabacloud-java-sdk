// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class RegistryAuthConfig extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>abc***</p>
     */
    @NameInMap("password")
    public String password;

    /**
     * <strong>example:</strong>
     * <p>admin</p>
     */
    @NameInMap("userName")
    public String userName;

    public static RegistryAuthConfig build(java.util.Map<String, ?> map) throws Exception {
        RegistryAuthConfig self = new RegistryAuthConfig();
        return TeaModel.build(map, self);
    }

    public RegistryAuthConfig setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public RegistryAuthConfig setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
