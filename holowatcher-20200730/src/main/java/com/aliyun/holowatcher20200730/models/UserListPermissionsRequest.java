// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class UserListPermissionsRequest extends TeaModel {
    @NameInMap("AliyunJwt")
    public String aliyunJwt;

    public static UserListPermissionsRequest build(java.util.Map<String, ?> map) throws Exception {
        UserListPermissionsRequest self = new UserListPermissionsRequest();
        return TeaModel.build(map, self);
    }

    public UserListPermissionsRequest setAliyunJwt(String aliyunJwt) {
        this.aliyunJwt = aliyunJwt;
        return this;
    }
    public String getAliyunJwt() {
        return this.aliyunJwt;
    }

}
