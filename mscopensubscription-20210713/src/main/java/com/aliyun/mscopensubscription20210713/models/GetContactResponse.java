// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mscopensubscription20210713.models;

import com.aliyun.tea.*;

public class GetContactResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetContactResponseBody body;

    public static GetContactResponse build(java.util.Map<String, ?> map) throws Exception {
        GetContactResponse self = new GetContactResponse();
        return TeaModel.build(map, self);
    }

    public GetContactResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetContactResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetContactResponse setBody(GetContactResponseBody body) {
        this.body = body;
        return this;
    }
    public GetContactResponseBody getBody() {
        return this.body;
    }

}
