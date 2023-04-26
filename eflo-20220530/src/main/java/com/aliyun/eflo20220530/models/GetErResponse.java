// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class GetErResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetErResponseBody body;

    public static GetErResponse build(java.util.Map<String, ?> map) throws Exception {
        GetErResponse self = new GetErResponse();
        return TeaModel.build(map, self);
    }

    public GetErResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetErResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetErResponse setBody(GetErResponseBody body) {
        this.body = body;
        return this;
    }
    public GetErResponseBody getBody() {
        return this.body;
    }

}
