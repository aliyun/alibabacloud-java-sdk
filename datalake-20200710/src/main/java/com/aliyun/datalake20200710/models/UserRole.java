// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class UserRole extends TeaModel {
    @NameInMap("GrantTime")
    public Long grantTime;

    @NameInMap("Role")
    public Role role;

    @NameInMap("User")
    public Principal user;

    public static UserRole build(java.util.Map<String, ?> map) throws Exception {
        UserRole self = new UserRole();
        return TeaModel.build(map, self);
    }

    public UserRole setGrantTime(Long grantTime) {
        this.grantTime = grantTime;
        return this;
    }
    public Long getGrantTime() {
        return this.grantTime;
    }

    public UserRole setRole(Role role) {
        this.role = role;
        return this;
    }
    public Role getRole() {
        return this.role;
    }

    public UserRole setUser(Principal user) {
        this.user = user;
        return this;
    }
    public Principal getUser() {
        return this.user;
    }

}
