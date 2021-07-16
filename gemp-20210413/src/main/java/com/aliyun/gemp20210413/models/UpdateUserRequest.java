// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class UpdateUserRequest extends TeaModel {
    // 用户ramId
    @NameInMap("ramId")
    public Long ramId;

    // 手机号
    @NameInMap("phone")
    public String phone;

    // 用户名
    @NameInMap("username")
    public String username;

    // 邮件
    @NameInMap("email")
    public String email;

    // 用户ID
    @NameInMap("userId")
    public Long userId;

    // 幂等号
    @NameInMap("clientToken")
    public String clientToken;

    public static UpdateUserRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserRequest self = new UpdateUserRequest();
        return TeaModel.build(map, self);
    }

    public UpdateUserRequest setRamId(Long ramId) {
        this.ramId = ramId;
        return this;
    }
    public Long getRamId() {
        return this.ramId;
    }

    public UpdateUserRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public UpdateUserRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

    public UpdateUserRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public UpdateUserRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

    public UpdateUserRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
