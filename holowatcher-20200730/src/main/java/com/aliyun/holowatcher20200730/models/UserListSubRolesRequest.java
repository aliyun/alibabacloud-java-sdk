// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class UserListSubRolesRequest extends TeaModel {
    @NameInMap("AliyunJwt")
    public String aliyunJwt;

    public static UserListSubRolesRequest build(java.util.Map<String, ?> map) throws Exception {
        UserListSubRolesRequest self = new UserListSubRolesRequest();
        return TeaModel.build(map, self);
    }

    public UserListSubRolesRequest setAliyunJwt(String aliyunJwt) {
        this.aliyunJwt = aliyunJwt;
        return this;
    }
    public String getAliyunJwt() {
        return this.aliyunJwt;
    }

}
