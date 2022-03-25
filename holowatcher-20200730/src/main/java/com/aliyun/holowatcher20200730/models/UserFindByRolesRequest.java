// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class UserFindByRolesRequest extends TeaModel {
    @NameInMap("AliyunJwt")
    public String aliyunJwt;

    @NameInMap("RoleNames")
    public String roleNames;

    public static UserFindByRolesRequest build(java.util.Map<String, ?> map) throws Exception {
        UserFindByRolesRequest self = new UserFindByRolesRequest();
        return TeaModel.build(map, self);
    }

    public UserFindByRolesRequest setAliyunJwt(String aliyunJwt) {
        this.aliyunJwt = aliyunJwt;
        return this;
    }
    public String getAliyunJwt() {
        return this.aliyunJwt;
    }

    public UserFindByRolesRequest setRoleNames(String roleNames) {
        this.roleNames = roleNames;
        return this;
    }
    public String getRoleNames() {
        return this.roleNames;
    }

}
