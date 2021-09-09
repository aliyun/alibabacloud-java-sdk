// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class GetStopGameTokenResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Token")
    @Validation(required = true)
    public String token;

    @NameInMap("ExpireTime")
    @Validation(required = true)
    public Long expireTime;

    public static GetStopGameTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        GetStopGameTokenResponse self = new GetStopGameTokenResponse();
        return TeaModel.build(map, self);
    }

    public GetStopGameTokenResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetStopGameTokenResponse setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public GetStopGameTokenResponse setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public Long getExpireTime() {
        return this.expireTime;
    }

}
