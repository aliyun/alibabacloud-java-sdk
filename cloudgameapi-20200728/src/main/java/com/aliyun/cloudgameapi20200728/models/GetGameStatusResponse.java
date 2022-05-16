// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class GetGameStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetGameStatusResponseBody body;

    public static GetGameStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGameStatusResponse self = new GetGameStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetGameStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetGameStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetGameStatusResponse setBody(GetGameStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetGameStatusResponseBody getBody() {
        return this.body;
    }

}
