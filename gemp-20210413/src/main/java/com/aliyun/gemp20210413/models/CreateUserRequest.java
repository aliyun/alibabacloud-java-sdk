// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class CreateUserRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>c26f36de-1ec8-496a-a828-880676c5ef81</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p><a href="mailto:5678@qq.com">5678@qq.com</a></p>
     */
    @NameInMap("email")
    public String email;

    /**
     * <strong>example:</strong>
     * <p>188898989892</p>
     */
    @NameInMap("phone")
    public String phone;

    /**
     * <strong>example:</strong>
     * <p>4787654378343</p>
     */
    @NameInMap("ramId")
    public Long ramId;

    @NameInMap("roleIdList")
    public java.util.List<Long> roleIdList;

    @NameInMap("username")
    public String username;

    public static CreateUserRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUserRequest self = new CreateUserRequest();
        return TeaModel.build(map, self);
    }

    public CreateUserRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateUserRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public CreateUserRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public CreateUserRequest setRamId(Long ramId) {
        this.ramId = ramId;
        return this;
    }
    public Long getRamId() {
        return this.ramId;
    }

    public CreateUserRequest setRoleIdList(java.util.List<Long> roleIdList) {
        this.roleIdList = roleIdList;
        return this;
    }
    public java.util.List<Long> getRoleIdList() {
        return this.roleIdList;
    }

    public CreateUserRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

}
