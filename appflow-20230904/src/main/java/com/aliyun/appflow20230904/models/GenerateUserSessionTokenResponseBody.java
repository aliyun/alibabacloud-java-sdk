// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appflow20230904.models;

import com.aliyun.tea.*;

public class GenerateUserSessionTokenResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>34C2713A-2270-5EEC-825E-115F9AD3BAC9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Token.</p>
     * 
     * <strong>example:</strong>
     * <p>960f499au184m7****</p>
     */
    @NameInMap("UserSessionToken")
    public String userSessionToken;

    public static GenerateUserSessionTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateUserSessionTokenResponseBody self = new GenerateUserSessionTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateUserSessionTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GenerateUserSessionTokenResponseBody setUserSessionToken(String userSessionToken) {
        this.userSessionToken = userSessionToken;
        return this;
    }
    public String getUserSessionToken() {
        return this.userSessionToken;
    }

}
