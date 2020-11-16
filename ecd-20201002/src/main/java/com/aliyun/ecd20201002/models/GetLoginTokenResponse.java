// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class GetLoginTokenResponse extends TeaModel {
    @NameInMap("LoginToken")
    @Validation(required = true)
    public String loginToken;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static GetLoginTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLoginTokenResponse self = new GetLoginTokenResponse();
        return TeaModel.build(map, self);
    }

    public GetLoginTokenResponse setLoginToken(String loginToken) {
        this.loginToken = loginToken;
        return this;
    }
    public String getLoginToken() {
        return this.loginToken;
    }

    public GetLoginTokenResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
