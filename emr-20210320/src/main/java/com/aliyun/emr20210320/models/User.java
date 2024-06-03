// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class User extends TeaModel {
    /**
     * <p>用户组。</p>
     */
    @NameInMap("Group")
    public String group;

    /**
     * <p>用户密码。</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>用户ID。</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <p>用户名称。</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserName")
    public String userName;

    /**
     * <p>用户类型。</p>
     */
    @NameInMap("UserType")
    public String userType;

    public static User build(java.util.Map<String, ?> map) throws Exception {
        User self = new User();
        return TeaModel.build(map, self);
    }

    public User setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public User setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public User setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public User setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

}
