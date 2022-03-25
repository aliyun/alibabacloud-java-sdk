// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class UserListMenusRequest extends TeaModel {
    @NameInMap("AliyunJwt")
    public String aliyunJwt;

    public static UserListMenusRequest build(java.util.Map<String, ?> map) throws Exception {
        UserListMenusRequest self = new UserListMenusRequest();
        return TeaModel.build(map, self);
    }

    public UserListMenusRequest setAliyunJwt(String aliyunJwt) {
        this.aliyunJwt = aliyunJwt;
        return this;
    }
    public String getAliyunJwt() {
        return this.aliyunJwt;
    }

}
