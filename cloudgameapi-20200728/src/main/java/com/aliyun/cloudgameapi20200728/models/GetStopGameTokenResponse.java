// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class GetStopGameTokenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetStopGameTokenResponseBody body;

    public static GetStopGameTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        GetStopGameTokenResponse self = new GetStopGameTokenResponse();
        return TeaModel.build(map, self);
    }

    public GetStopGameTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetStopGameTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetStopGameTokenResponse setBody(GetStopGameTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public GetStopGameTokenResponseBody getBody() {
        return this.body;
    }

}
