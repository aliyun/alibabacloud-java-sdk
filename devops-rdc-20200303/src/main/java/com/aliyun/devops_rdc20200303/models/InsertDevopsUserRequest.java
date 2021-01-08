// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class InsertDevopsUserRequest extends TeaModel {
    @NameInMap("UserPk")
    public String userPk;

    @NameInMap("UserName")
    public String userName;

    @NameInMap("Phone")
    public String phone;

    @NameInMap("Email")
    public String email;

    public static InsertDevopsUserRequest build(java.util.Map<String, ?> map) throws Exception {
        InsertDevopsUserRequest self = new InsertDevopsUserRequest();
        return TeaModel.build(map, self);
    }

    public InsertDevopsUserRequest setUserPk(String userPk) {
        this.userPk = userPk;
        return this;
    }
    public String getUserPk() {
        return this.userPk;
    }

    public InsertDevopsUserRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public InsertDevopsUserRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public InsertDevopsUserRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

}
