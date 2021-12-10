// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class GetStopGameTokenResponseBody extends TeaModel {
    @NameInMap("ExpireTime")
    public Long expireTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Token")
    public String token;

    public static GetStopGameTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetStopGameTokenResponseBody self = new GetStopGameTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public GetStopGameTokenResponseBody setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public Long getExpireTime() {
        return this.expireTime;
    }

    public GetStopGameTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetStopGameTokenResponseBody setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
