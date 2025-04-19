// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class ChangePasswordResponseBody extends TeaModel {
    /**
     * <p>The logon token.</p>
     * 
     * <strong>example:</strong>
     * <p>v18101ac6a9e69c66b04a163031680463660b4b216cd758f34b60b9ad6a7c7f7334b83dd8f75eef4209c68f9f1080b****</p>
     */
    @NameInMap("LoginToken")
    public String loginToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>484256DA-D816-44D2-9D86-B6EE4D5B****</p>
     */
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
