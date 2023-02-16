// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class GetConnectionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetConnectionResponseBody body;

    public static GetConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetConnectionResponse self = new GetConnectionResponse();
        return TeaModel.build(map, self);
    }

    public GetConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetConnectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetConnectionResponse setBody(GetConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetConnectionResponseBody getBody() {
        return this.body;
    }

}
