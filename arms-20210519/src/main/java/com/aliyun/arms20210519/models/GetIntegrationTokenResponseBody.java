// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210519.models;

import com.aliyun.tea.*;

public class GetIntegrationTokenResponseBody extends TeaModel {
    @NameInMap("Token")
    public String token;

    @NameInMap("RequestId")
    public String requestId;

    public static GetIntegrationTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetIntegrationTokenResponseBody self = new GetIntegrationTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public GetIntegrationTokenResponseBody setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public GetIntegrationTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
