// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210622.models;

import com.aliyun.tea.*;

public class GetUserByTokenRequest extends TeaModel {
    @NameInMap("Token")
    public String token;

    public static GetUserByTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserByTokenRequest self = new GetUserByTokenRequest();
        return TeaModel.build(map, self);
    }

    public GetUserByTokenRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
