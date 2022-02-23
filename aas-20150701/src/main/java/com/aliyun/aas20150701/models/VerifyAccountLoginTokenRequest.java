// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aas20150701.models;

import com.aliyun.tea.*;

public class VerifyAccountLoginTokenRequest extends TeaModel {
    @NameInMap("LoginToken")
    public String loginToken;

    public static VerifyAccountLoginTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyAccountLoginTokenRequest self = new VerifyAccountLoginTokenRequest();
        return TeaModel.build(map, self);
    }

    public VerifyAccountLoginTokenRequest setLoginToken(String loginToken) {
        this.loginToken = loginToken;
        return this;
    }
    public String getLoginToken() {
        return this.loginToken;
    }

}
