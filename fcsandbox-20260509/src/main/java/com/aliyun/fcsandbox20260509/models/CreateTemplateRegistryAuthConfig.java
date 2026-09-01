// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class CreateTemplateRegistryAuthConfig extends TeaModel {
    /**
     * <p>The password of the image repository.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("password")
    public String password;

    /**
     * <p>The username of the image repository.</p>
     * 
     * <strong>example:</strong>
     * <p>my-user</p>
     */
    @NameInMap("userName")
    public String userName;

    public static CreateTemplateRegistryAuthConfig build(java.util.Map<String, ?> map) throws Exception {
        CreateTemplateRegistryAuthConfig self = new CreateTemplateRegistryAuthConfig();
        return TeaModel.build(map, self);
    }

    public CreateTemplateRegistryAuthConfig setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateTemplateRegistryAuthConfig setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
