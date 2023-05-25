// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiearth_engine20220609.models;

import com.aliyun.tea.*;

public class GetUserTokenResponseBody extends TeaModel {
    @NameInMap("ExpiredAt")
    public Long expiredAt;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Token")
    public String token;

    public static GetUserTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserTokenResponseBody self = new GetUserTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserTokenResponseBody setExpiredAt(Long expiredAt) {
        this.expiredAt = expiredAt;
        return this;
    }
    public Long getExpiredAt() {
        return this.expiredAt;
    }

    public GetUserTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserTokenResponseBody setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
