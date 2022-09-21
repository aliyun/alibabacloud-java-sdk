// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class UserParam extends TeaModel {
    @NameInMap("Password")
    public String password;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("UserName")
    public String userName;

    public static UserParam build(java.util.Map<String, ?> map) throws Exception {
        UserParam self = new UserParam();
        return TeaModel.build(map, self);
    }

    public UserParam setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public UserParam setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public UserParam setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
