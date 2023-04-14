// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi20170525.models;

import com.aliyun.tea.*;

public class GetFusionAuthTokenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetFusionAuthTokenResponseBody body;

    public static GetFusionAuthTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFusionAuthTokenResponse self = new GetFusionAuthTokenResponse();
        return TeaModel.build(map, self);
    }

    public GetFusionAuthTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFusionAuthTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetFusionAuthTokenResponse setBody(GetFusionAuthTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFusionAuthTokenResponseBody getBody() {
        return this.body;
    }

}
