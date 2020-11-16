// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ApplyBoardTokenResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Token")
    @Validation(required = true)
    public String token;

    @NameInMap("Expired")
    @Validation(required = true)
    public String expired;

    public static ApplyBoardTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyBoardTokenResponse self = new ApplyBoardTokenResponse();
        return TeaModel.build(map, self);
    }

    public ApplyBoardTokenResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ApplyBoardTokenResponse setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public ApplyBoardTokenResponse setExpired(String expired) {
        this.expired = expired;
        return this;
    }
    public String getExpired() {
        return this.expired;
    }

}
