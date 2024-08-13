// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class RefreshLoginTokenResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>v1c27bab6c205b2fdfac916434306375722776d6aa89e30b7836d18c95ade9137f0f5ac4325260782184e96ee2b3f0****</p>
     */
    @NameInMap("LoginToken")
    public String loginToken;

    /**
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
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
