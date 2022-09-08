// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class GetAligenieUserInfoRequest extends TeaModel {
    @NameInMap("LoginStateAccessToken")
    public String loginStateAccessToken;

    public static GetAligenieUserInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAligenieUserInfoRequest self = new GetAligenieUserInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetAligenieUserInfoRequest setLoginStateAccessToken(String loginStateAccessToken) {
        this.loginStateAccessToken = loginStateAccessToken;
        return this;
    }
    public String getLoginStateAccessToken() {
        return this.loginStateAccessToken;
    }

}
