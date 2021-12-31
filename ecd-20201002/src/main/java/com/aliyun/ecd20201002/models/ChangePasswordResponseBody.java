// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class ChangePasswordResponseBody extends TeaModel {
    @NameInMap("LoginToken")
    public String loginToken;

    @NameInMap("RequestId")
    public String requestId;

    public static ChangePasswordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ChangePasswordResponseBody self = new ChangePasswordResponseBody();
        return TeaModel.build(map, self);
    }

    public ChangePasswordResponseBody setLoginToken(String loginToken) {
        this.loginToken = loginToken;
        return this;
    }
    public String getLoginToken() {
        return this.loginToken;
    }

    public ChangePasswordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
