// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ApplyBoardTokenResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Token")
    public String token;

    @NameInMap("Expired")
    public String expired;

    public static ApplyBoardTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ApplyBoardTokenResponseBody self = new ApplyBoardTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public ApplyBoardTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ApplyBoardTokenResponseBody setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public ApplyBoardTokenResponseBody setExpired(String expired) {
        this.expired = expired;
        return this;
    }
    public String getExpired() {
        return this.expired;
    }

}
