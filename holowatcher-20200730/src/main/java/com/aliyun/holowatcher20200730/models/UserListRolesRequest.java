// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class UserListRolesRequest extends TeaModel {
    @NameInMap("AliyunJwt")
    public String aliyunJwt;

    public static UserListRolesRequest build(java.util.Map<String, ?> map) throws Exception {
        UserListRolesRequest self = new UserListRolesRequest();
        return TeaModel.build(map, self);
    }

    public UserListRolesRequest setAliyunJwt(String aliyunJwt) {
        this.aliyunJwt = aliyunJwt;
        return this;
    }
    public String getAliyunJwt() {
        return this.aliyunJwt;
    }

}
