// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class UserQueryCreatePermissionRequest extends TeaModel {
    @NameInMap("Jwt")
    public String jwt;

    public static UserQueryCreatePermissionRequest build(java.util.Map<String, ?> map) throws Exception {
        UserQueryCreatePermissionRequest self = new UserQueryCreatePermissionRequest();
        return TeaModel.build(map, self);
    }

    public UserQueryCreatePermissionRequest setJwt(String jwt) {
        this.jwt = jwt;
        return this;
    }
    public String getJwt() {
        return this.jwt;
    }

}
