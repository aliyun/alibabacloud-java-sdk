// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class GetInstanceExceptionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetInstanceExceptionsResponseBody body;

    public static GetInstanceExceptionsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceExceptionsResponse self = new GetInstanceExceptionsResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceExceptionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstanceExceptionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInstanceExceptionsResponse setBody(GetInstanceExceptionsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstanceExceptionsResponseBody getBody() {
        return this.body;
    }

}
