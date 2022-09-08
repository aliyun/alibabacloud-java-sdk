// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class UnbindAligenieUserRequest extends TeaModel {
    @NameInMap("LoginStateAccessToken")
    public String loginStateAccessToken;

    public static UnbindAligenieUserRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindAligenieUserRequest self = new UnbindAligenieUserRequest();
        return TeaModel.build(map, self);
    }

    public UnbindAligenieUserRequest setLoginStateAccessToken(String loginStateAccessToken) {
        this.loginStateAccessToken = loginStateAccessToken;
        return this;
    }
    public String getLoginStateAccessToken() {
        return this.loginStateAccessToken;
    }

}
