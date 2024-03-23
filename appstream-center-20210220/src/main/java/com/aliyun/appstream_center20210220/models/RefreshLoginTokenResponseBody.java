// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210220.models;

import com.aliyun.tea.*;

public class RefreshLoginTokenResponseBody extends TeaModel {
    @NameInMap("LoginToken")
    public String loginToken;

    @NameInMap("RequestId")
    public String requestId;

    public static RefreshLoginTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RefreshLoginTokenResponseBody self = new RefreshLoginTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public RefreshLoginTokenResponseBody setLoginToken(String loginToken) {
        this.loginToken = loginToken;
        return this;
    }
    public String getLoginToken() {
        return this.loginToken;
    }

    public RefreshLoginTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
